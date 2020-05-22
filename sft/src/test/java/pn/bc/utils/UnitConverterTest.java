package pn.bc.utils;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

class UnitConverterTest {

    @Test
    void transferToResponse() throws MalformedURLException {
        UnitConverter uc = new UnitConverter();
        uc.transferToResponse();
        System.out.println(uc.getResultStr());
    }
}