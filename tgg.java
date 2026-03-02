import java.io.Serializable;

public class tgg implements Serializable {
    public tge a;
    public tjb b;
    public tgp c;
    public byte[] d;
    public byte[] e;

    public tgg() {
        this.a = null;
    }

    public final tge a() {
        tge tge0 = this.a;
        if(tge0 != null) {
            return tge0;
        }
        throw new IllegalStateException("Application data is not loaded");
    }

    public final thj b() {
        return this.a.c();
    }

    public final thj c() {
        return this.a.c();
    }

    @Override
    public final String toString() {
        return "dcid=null";
    }
}

