import java.util.Arrays;

public final class hnmu {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof hnmu)) {
            return false;
        }
        if(Arrays.equals(this.a, ((hnmu)object0).a) && Arrays.equals(this.b, ((hnmu)object0).b) && Arrays.equals(this.c, ((hnmu)object0).c) && Arrays.equals(this.d, ((hnmu)object0).d) && Arrays.equals(this.e, ((hnmu)object0).e) && Arrays.equals(this.f, ((hnmu)object0).f) && Arrays.equals(this.g, ((hnmu)object0).g)) {
            return Arrays.equals(this.h, ((hnmu)object0).h) ? Arrays.equals(this.i, ((hnmu)object0).i) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((((((Arrays.hashCode(this.a) * 0x1F + Arrays.hashCode(this.b)) * 0x1F + Arrays.hashCode(this.c)) * 0x1F + Arrays.hashCode(this.d)) * 0x1F + Arrays.hashCode(this.e)) * 0x1F + Arrays.hashCode(this.f)) * 0x1F + Arrays.hashCode(this.g)) * 0x1F + Arrays.hashCode(this.h)) * 0x1F + Arrays.hashCode(this.i);
    }
}

