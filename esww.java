import java.util.Arrays;
import java.util.HexFormat;
import java.util.List;

public final class esww {
    public final int a;
    public final byte[] b;
    public final int c;
    public final long d;
    public final boolean e;

    public esww(int v, byte[] arr_b, int v1, long v2, boolean z) {
        ibuq.f(arr_b, "data");
        super();
        this.a = v;
        this.b = arr_b;
        this.c = v1;
        this.d = v2;
        this.e = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof esww)) {
            return false;
        }
        if(this.a != ((esww)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((esww)object0).b)) {
            return false;
        }
        if(this.c != ((esww)object0).c) {
            return false;
        }
        return this.d == ((esww)object0).d ? this.e == ((esww)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        int v1 = this.a * 0x1F + v;
        return this.e ? ((v1 * 0x1F + this.c) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + 0x4CF : ((v1 * 0x1F + this.c) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        String s = ibog.b(this.d);
        List list0 = ibpo.b(HexFormat.ofDelimiter(" ").formatHex(this.b));
        return "PollingFrame { Type: " + ((char)this.a) + ", gain: " + this.c + ", timestamp: " + s + ", data: " + list0 + ", triggeredAutoTransact: " + this.e + "}";
    }
}

