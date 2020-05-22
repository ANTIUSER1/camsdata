package pn.bc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReaderData {
    private URL url;
    private StringBuffer sbf = new StringBuffer();

    public ReaderData() throws MalformedURLException {
        url = new URL("http://www.mocky.io/v2/5c51b9dd3400003252129fb5");
        System.out.println("Create Reader");
    }

    public StringBuffer getSbf() {
        return sbf;
    }

    public synchronized void readData() {
        try {
            URLConnection urlConnection = url.openConnection();

            // wrap the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));

            String line;

            // read from the urlconnection via the bufferedreader
            while ((line = bufferedReader.readLine()) != null) {
                sbf.append(line + System.lineSeparator());
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
