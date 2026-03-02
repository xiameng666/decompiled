import java.util.Arrays;

public final class fmlm {
    public final byte[] a;
    public final fmfh b;
    public final String c;
    public final fmbi d;

    public fmlm() {
        throw null;
    }

    public fmlm(byte[] arr_b, fmfh fmfh0, String s, fmbi fmbi0) {
        this.a = arr_b;
        this.b = fmfh0;
        this.c = s;
        this.d = fmbi0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fmlm) ? Arrays.equals(this.a, ((((fmlm)object0) instanceof fmlm) ? ((fmlm)object0).a : ((fmlm)object0).a)) && this.b.equals(((fmlm)object0).b) && this.c.equals(((fmlm)object0).c) && this.d.equals(((fmlm)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.a) ^ 1000003;
        return this.d.hashCode() ^ ((v * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "VerticalLayoutButton{icon=" + Arrays.toString(this.a) + ", lighterIcon=" + this.b + ", displayText=" + this.c + ", action=" + this.d + "}";
    }
}

