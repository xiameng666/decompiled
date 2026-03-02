import java.io.Serializable;

public final class gzzt implements gzzr, gzzs, hfub, Serializable {
    public static final gzzt u;
    private final int v;

    static {
        gzzt.u = new gzzt(-1);
    }

    public gzzt(int v) {
        this.v = v;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzzt.u) {
            return this.v;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.v);
    }
}

