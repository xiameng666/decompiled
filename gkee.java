import java.io.Serializable;

public final class gkee implements gked, hfub, Serializable {
    public static final gkee R;
    private final int S;

    static {
        gkee.R = new gkee(-1);
    }

    public gkee(int v) {
        this.S = v;
    }

    @Override  // hfub
    public final int a() {
        if(this != gkee.R) {
            return this.S;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.S);
    }
}

