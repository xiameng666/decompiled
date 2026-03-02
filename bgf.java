import android.util.Size;

public final class bgf {
    public final Size a;
    public final int b;

    public bgf() {
        throw null;
    }

    public bgf(Size size0, int v) {
        if(size0 == null) {
            throw new NullPointerException("Null resolution");
        }
        this.a = size0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bgf) && this.a.equals(((bgf)object0).a) && this.b == ((bgf)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "PostviewSettings{resolution=" + this.a + ", inputFormat=" + this.b + "}";
    }
}

