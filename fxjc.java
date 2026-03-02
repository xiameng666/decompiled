import android.location.Location;
import java.util.Locale;

final class fxjc {
    public final Location a;
    public final long b;
    public final hfst c;
    public final boolean d;
    private final hfwn e;

    public fxjc() {
        throw null;
    }

    public fxjc(Location location0, hfwn hfwn0, long v, hfst hfst0, boolean z) {
        this.a = location0;
        this.e = hfwn0;
        this.b = v;
        this.c = hfst0;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxjc) && this.a.equals(((fxjc)object0).a) && ((ProtoLiteMessage)this.e).equals(((fxjc)object0).e) && this.b == ((fxjc)object0).b && ((ProtoLiteMessage)this.c).equals(((fxjc)object0).c) && this.d == ((fxjc)object0).d;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = this.a.hashCode() ^ 1000003;
        hfwn hfwn0 = this.e;
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
        int v3 = ((v * 1000003 ^ v1) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003;
        hfst hfst0 = this.c;
        if(((ProtoLiteMessage)hfst0).isImmutable()) {
            int v4 = ((ProtoLiteMessage)hfst0).s();
            return this.d ? 0x4CF ^ (v3 ^ v4) * 1000003 : 0x4D5 ^ (v3 ^ v4) * 1000003;
        }
        int v5 = hfst0.memoizedHashCode;
        if(v5 == 0) {
            v5 = ((ProtoLiteMessage)hfst0).s();
            hfst0.memoizedHashCode = v5;
        }
        return this.d ? 0x4CF ^ (v3 ^ v5) * 1000003 : 0x4D5 ^ (v3 ^ v5) * 1000003;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.getDefault();
        String s = this.a.getProvider();
        String s1 = fxmv.b(this.e);
        Long long0 = hfyf.e(this.c);
        return String.format(locale0, "Loc: [Loc](%s) now=%s nowElapsedMs=%d ltMs=%d", s, s1, ((long)this.b), long0);
    }
}

