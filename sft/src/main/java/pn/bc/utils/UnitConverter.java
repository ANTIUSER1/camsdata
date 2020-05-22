package pn.bc.utils;

import pn.bc.DataRequest;
import pn.bc.DataResponse;
import pn.bc.GParserToCollection;
import pn.bc.ReaderData;
import pn.bc.details.SourceDataUrl;
import pn.bc.details.TokenDataUrl;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {
    private String resultStr;
    private List<DataRequest> requestList;
    private List<DataResponse> responseList = new ArrayList<>();


    public String getResultStr() {
        return resultStr;
    }

    public void transferToResponse() throws MalformedURLException {
        ReaderData rd = new ReaderData();
        rd.readData();
        StringBuffer dataBuffer = rd.getSbf();
        GParserToCollection parser = new GParserToCollection();
        parser.toDataRequestList(rd.getSbf().toString());
        requestList = parser.getDataList();
        for (DataRequest drq : requestList) {
            SourceDataUrl src = makeSrc(drq);
            TokenDataUrl tok = makeTok(drq);
            DataResponse responseUnit = new DataResponse();

            responseUnit.setId(drq.getId());

            responseUnit.setTtl(tok.getTtl());
            responseUnit.setValue(tok.getValue());

            responseUnit.setVideoUrl(src.getVideoUrl());
            responseUnit.setUrlType(src.getUrlType());

            if (responseUnit != null) responseList.add(responseUnit);
        }
        resultStr = parser.respDataListToJSon(responseList);
    }

    private TokenDataUrl makeTok(DataRequest drq) throws MalformedURLException {
        GParserToCollection parser = new GParserToCollection();
        return parser.toTokenDataUrlList(drq.getTokenDataUrl());
    }

    private SourceDataUrl makeSrc(DataRequest drq) throws MalformedURLException {
        GParserToCollection parser = new GParserToCollection();
        return parser.toSourceDataUrlList(drq.getSourceDataUrl());
    }
}
