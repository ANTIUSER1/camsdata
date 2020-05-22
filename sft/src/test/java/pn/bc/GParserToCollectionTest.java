package pn.bc;

import org.junit.jupiter.api.Test;

class GParserToCollectionTest {

    @Test
    void toDataRequestList() throws Exception {
        ReaderData rd = new ReaderData();
        rd.readData();
        StringBuffer dataBuffer = rd.getSbf();
        GParserToCollection parser = new GParserToCollection();
        parser.toDataRequestList(dataBuffer.toString());
//        System.out.println("---");
//        System.out.println(parser.getDataList());
//        System.out.println("---");
    }
}