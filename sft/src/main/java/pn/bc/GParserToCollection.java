package pn.bc;

import com.google.gson.Gson;
import pn.bc.details.SourceDataUrl;
import pn.bc.details.TokenDataUrl;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GParserToCollection {
    private List<DataRequest> dataList = new ArrayList<>();
    private Gson gson = new Gson();

    public void toDataRequestList(String strData) {
        DataRequest[] requestArray = gson.fromJson(strData, DataRequest[].class);
        dataList = Arrays.asList(requestArray);
    }

    public SourceDataUrl toSourceDataUrlList(String strData) throws MalformedURLException {
        ReaderData rd = new ReaderData();
        return gson.fromJson(rd.readData(strData).toString(), SourceDataUrl.class);
    }

    public TokenDataUrl toTokenDataUrlList(String strData) throws MalformedURLException {
        ReaderData rd = new ReaderData();
        return gson.fromJson(rd.readData(strData).toString(), TokenDataUrl.class);
    }

    public List<DataRequest> getDataList() {
        return dataList;
    }

    public String respDataListToJSon(List<DataResponse> responses) {
        return gson.toJson(responses);
    }
}
