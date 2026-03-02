import java.util.Arrays;

public final class hnmx {
    public hnmw a;
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
        if(!(object0 instanceof hnmx)) {
            return false;
        }
        if(this.a.equals(((hnmx)object0).a) && Arrays.equals(this.b, ((hnmx)object0).b) && Arrays.equals(this.c, ((hnmx)object0).c) && Arrays.equals(this.d, ((hnmx)object0).d) && Arrays.equals(this.e, ((hnmx)object0).e)) {
            return Arrays.equals(this.f, ((hnmx)object0).f) ? Arrays.equals(this.g, ((hnmx)object0).g) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((((this.a.hashCode() * 0x1F + Arrays.hashCode(this.b)) * 0x1F + Arrays.hashCode(this.c)) * 0x1F + Arrays.hashCode(this.d)) * 0x1F + Arrays.hashCode(this.e)) * 0x1F + Arrays.hashCode(this.f)) * 0x1F + Arrays.hashCode(this.g);
    }
}

