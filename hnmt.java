import java.util.Arrays;

public final class hnmt {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof hnmt)) {
            return false;
        }
        if(Arrays.equals(this.a, ((hnmt)object0).a) && Arrays.equals(this.b, ((hnmt)object0).b) && Arrays.equals(this.c, ((hnmt)object0).c)) {
            return Arrays.equals(this.d, ((hnmt)object0).d) ? Arrays.equals(this.e, ((hnmt)object0).e) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((Arrays.hashCode(this.a) * 0x1F + Arrays.hashCode(this.b)) * 0x1F + Arrays.hashCode(this.c)) * 0x1F + Arrays.hashCode(this.d)) * 0x1F + Arrays.hashCode(this.e);
    }
}

