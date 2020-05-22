package pn.bc;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

class ReaderDataTest {

    @Test
    void readData() throws MalformedURLException {
        ReaderData rd = new ReaderData();
        rd.readData();
        System.out.println(rd.getSbf());
    }
}