import java.io.Serializable;

public final class ghgz extends ghff implements Serializable {
    public static final ghfz a;
    private final int b;
    private static final long serialVersionUID;

    static {
        ghgz.a = new ghgz(0);
    }

    public ghgz(int v) {
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghgz) && this.b == ((ghgz)object0).b;
    }

    @Override  // ghfz
    public final ghga h() {
        return new ghgy(this.b);
    }

    @Override
    public final int hashCode() {
        int v = this.getClass().hashCode();
        return this.b ^ v;
    }

    @Override
    public final String toString() {
        return "Hashing.murmur3_128(" + this.b + ")";
    }
}

