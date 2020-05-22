package pn.bc;

public class DataRequest {
    private int id;
    private String sourceDataUrl;
    private String tokenDataUrl;

    public String getSourceDataUrl() {
        return sourceDataUrl;
    }

    public void setSourceDataUrl(String sourceDataUrl) {
        this.sourceDataUrl = sourceDataUrl;
    }

    public String getTokenDataUrl() {
        return tokenDataUrl;
    }

    public void setTokenDataUrl(String tokenDataUrl) {
        this.tokenDataUrl = tokenDataUrl;
    }

    @Override
    public String toString() {
        return "DataRequest{" + System.lineSeparator() +
                "id=" + id + System.lineSeparator() +
                ", sourceDataUrl=" + sourceDataUrl + System.lineSeparator() +
                ", tokenDataUrl=" + tokenDataUrl + System.lineSeparator() +
                '}';
    }
}
