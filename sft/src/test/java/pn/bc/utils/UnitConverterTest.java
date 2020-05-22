package pn.bc.utils;

import org.junit.jupiter.api.Test;

class UnitConverterTest {

    @Test
    void transferToResponse() throws Exception {
        UnitConverter uc = new UnitConverter();
        uc.transferToResponse();
        System.out.println(uc.getResultStr());
    }

}