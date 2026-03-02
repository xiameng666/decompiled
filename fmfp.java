import java.util.Arrays;

public final class fmfp {
    public final String a;
    public final byte[] b;

    public fmfp() {
        throw null;
    }

    public fmfp(String s, byte[] arr_b) {
        this.a = s;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmfp) && this.a.equals(((fmfp)object0).a) && Arrays.equals(this.b, ((fmfp)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.b);
        return "CustomMessage{type=" + this.a + ", content=" + s + "}";
    }
}

