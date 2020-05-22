package pn.bc.details;

public class SourceDataUrl {
    private String urlType;
    private String videoUrl;

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

    @Override
    public String toString() {
        return "SourceDataUrl{" +
                "urlType=" + urlType +
                ", videoUrl=" + videoUrl +
                '}';
    }
}
