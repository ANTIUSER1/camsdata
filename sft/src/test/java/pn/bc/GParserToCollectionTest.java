package pn.bc;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

class GParserToCollectionTest {

    @Test
    void toList() throws MalformedURLException {
        ReaderData rd = new ReaderData();
        rd.readData();
        StringBuffer dataBuffer = rd.getSbf();
        GParserToCollection parser = new GParserToCollection();
        parser.toList(dataBuffer.toString());
        System.out.println("---");
        System.out.println(parser.getDataList());
        System.out.println("---");
    }
}