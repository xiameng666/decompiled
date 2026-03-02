import java.io.Serializable;

public class tto implements Serializable {
    public ttm b;
    public twj c;
    public ttx d;
    public byte[] e;
    public byte[] f;

    public tto() {
        this.b = null;
    }

    public final ttm b() {
        ttm ttm0 = this.b;
        if(ttm0 != null) {
            return ttm0;
        }
        throw new IllegalStateException("Application data is not loaded");
    }

    public final tur c() {
        return this.b.b();
    }

    public final tur d() {
        return this.b.b();
    }

    @Override
    public final String toString() {
        return "dcid=null";
    }
}

