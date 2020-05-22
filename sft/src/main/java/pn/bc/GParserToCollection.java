package pn.bc;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GParserToCollection {
    private List<DataRequest> dataList = new ArrayList<>();
    private Gson gson = new Gson();

    public void toList(String strData) {
        DataRequest[] requestArray = gson.fromJson(strData, DataRequest[].class);
        dataList = Arrays.asList(requestArray);

    }

    public List<DataRequest> getDataList() {
        return dataList;
    }

    @Override
    public String toString() {
        return "GParserToCollection{" +
                "gson=" + gson +
                '}';
    }
}
