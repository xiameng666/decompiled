import java.util.Arrays;

public final class quj {
    public final byte a;
    public final byte b;
    public final byte c;
    public final byte d;
    public final byte[] e;
    public final ibob f;
    private final ibob g;

    public quj(byte b, byte b1, byte b2, byte b3, ibob ibob0, byte[] arr_b, ibob ibob1) {
        this.a = b;
        this.b = b1;
        this.c = b2;
        this.d = b3;
        this.g = ibob0;
        this.e = arr_b;
        this.f = ibob1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof quj)) {
            return false;
        }
        if(this.a != ((quj)object0).a) {
            return false;
        }
        if(this.b != ((quj)object0).b) {
            return false;
        }
        if(this.c != ((quj)object0).c) {
            return false;
        }
        if(this.d != ((quj)object0).d) {
            return false;
        }
        if(!ibuq.m(this.g, ((quj)object0).g)) {
            return false;
        }
        return ibuq.m(this.e, ((quj)object0).e) ? ibuq.m(this.f, ((quj)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        ibob ibob0 = this.g;
        int v = 0;
        int v1 = ibob0 == null ? 0 : ibob0.a;
        int v2 = this.a;
        int v3 = this.b;
        int v4 = this.c;
        int v5 = this.d;
        int v6 = this.e == null ? 0 : Arrays.hashCode(this.e);
        ibob ibob1 = this.f;
        if(ibob1 != null) {
            v = ibob1.a;
        }
        return (((((v2 * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1) * 0x1F + v6) * 0x1F + v;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.e);
        return "APDUCommand(commandClass=" + ibob.a(this.a) + ", instruction=" + ibob.a(this.b) + ", p1=" + ibob.a(this.c) + ", p2=" + ibob.a(this.d) + ", _lc=" + this.g + ", commandPayload=" + s + ", le=" + this.f + ")";
    }
}

