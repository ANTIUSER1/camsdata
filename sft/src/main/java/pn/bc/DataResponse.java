package pn.bc;

public class DataResponse {
    private int id;
    private String urlType;
    private String videoUrl;
    private String value;
    private int ttl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    @Override
    public String toString() {
        return "DataResponse{" +
                "id=" + id +
                ", urlType='" + urlType + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", value='" + value + System.lineSeparator() +
                ", ttl='" + ttl + '\'' +
                '}';
    }
}
