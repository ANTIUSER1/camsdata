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


    public synchronized StringBuffer readData() {
        StringBuffer res = new StringBuffer();
        try {
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                res.append(line + System.lineSeparator());
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sbf = res;
        return res;
    }

}
