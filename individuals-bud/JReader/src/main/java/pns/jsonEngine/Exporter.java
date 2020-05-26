package pns.jsonEngine;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Exporter {
    public void  exportToFile(Gson gson,Object o,  String path) throws IOException {
       String json=gson.toJson(o);
        FileWriter writer = new FileWriter(  path);
        writer.write(json);
        writer.close();}
}
