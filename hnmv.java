import java.util.Arrays;

public final class hnmv {
    public hnmu a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof hnmv)) {
            return false;
        }
        if(this.a.equals(((hnmv)object0).a) && Arrays.equals(this.b, ((hnmv)object0).b) && Arrays.equals(this.c, ((hnmv)object0).c) && Arrays.equals(this.d, ((hnmv)object0).d) && Arrays.equals(this.e, ((hnmv)object0).e)) {
            return Arrays.equals(this.f, ((hnmv)object0).f) ? Arrays.equals(this.g, ((hnmv)object0).g) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((((this.a.hashCode() * 0x1F + Arrays.hashCode(this.b)) * 0x1F + Arrays.hashCode(this.c)) * 0x1F + Arrays.hashCode(this.d)) * 0x1F + Arrays.hashCode(this.e)) * 0x1F + Arrays.hashCode(this.f)) * 0x1F + Arrays.hashCode(this.g);
    }
}

