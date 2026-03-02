import android.location.Location;
import java.util.Locale;

final class fxhv {
    public final Location a;
    public final long b;
    public final fxht c;
    public final boolean d;
    public final boolean e;
    private final hfwn f;

    public fxhv() {
        throw null;
    }

    public fxhv(Location location0, hfwn hfwn0, long v, fxht fxht0, boolean z, boolean z1) {
        this.a = location0;
        this.f = hfwn0;
        this.b = v;
        this.c = fxht0;
        this.d = z;
        this.e = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxhv) && this.a.equals(((fxhv)object0).a) && ((ProtoLiteMessage)this.f).equals(((fxhv)object0).f) && this.b == ((fxhv)object0).b && this.c.equals(((fxhv)object0).c) && this.d == ((fxhv)object0).d && this.e == ((fxhv)object0).e;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = this.a.hashCode() ^ 1000003;
        hfwn hfwn0 = this.f;
        if(((ProtoLiteMessage)hfwn0).isImmutable()) {
            v1 = ((ProtoLiteMessage)hfwn0).s();
        }
        else {
            int v2 = hfwn0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)hfwn0).s();
                hfwn0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = (((v * 1000003 ^ v1) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ this.c.hashCode()) * 1000003;
        int v4 = 0x4D5;
        int v5 = this.d ? 0x4CF : 0x4D5;
        if(this.e) {
            v4 = 0x4CF;
        }
        return (v3 ^ v5) * 1000003 ^ v4;
    }

    @Override
    public final String toString() {
        return String.format(Locale.getDefault(), "Loc: [Loc](%s) now=%s nowElapsedMs=%d DHPos=%s m=%b r=%b", this.a.getProvider(), fxmv.b(this.f), ((long)this.b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }
}

