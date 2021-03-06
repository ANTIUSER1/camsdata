package pn.bc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReaderData {
    private URL url;
    private StringBuffer sbf = new StringBuffer();

    public ReaderData() throws MalformedURLException {
        url = new URL("http://www.mocky.io/v2/5c51b9dd3400003252129fb5");
    }

    public StringBuffer getSbf() {
        return sbf;
    }

    public synchronized void readData() throws Exception {
        sbf = readData(url.toString());
    }

    public synchronized StringBuffer readData(String addr) throws IOException {
        URL u = new URL(addr);
        StringBuffer res = new StringBuffer();
        try {
            URLConnection urlConnection = u.openConnection();
            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    res.append(line + System.lineSeparator());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
