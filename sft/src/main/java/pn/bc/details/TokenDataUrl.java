package pn.bc.details;

public class TokenDataUrl {
    private String value;
    private int ttl;

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
        return "TokenDataUrl{" +
                "value= " + value +
                ", ttl=" + ttl +
                '}';
    }
}
