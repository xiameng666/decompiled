import android.os.WorkSource;

public final class czqr {
    public final String a;
    public final int b;
    public final WorkSource c;

    public czqr() {
        throw null;
    }

    public czqr(String s, int v, WorkSource workSource0) {
        this.a = s;
        this.b = v;
        this.c = workSource0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czqr) && this.a.equals(((czqr)object0).a) && this.b == ((czqr)object0).b) {
            return this.c == null ? ((czqr)object0).c == null : this.c.equals(((czqr)object0).c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.c == null ? (this.b ^ v * 1000003) * 1000003 : (this.b ^ v * 1000003) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "DctScannerInfo{serviceId=" + this.a + ", powerLevel=" + this.b + ", workSource=" + this.c + "}";
    }
}

