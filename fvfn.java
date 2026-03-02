import com.google.android.gms.libs.identity.ImmutableWorkSource;
import j..time.Duration;

public final class fvfn {
    public final boolean a;
    public final Duration b;
    public final Duration c;
    public final boolean d;
    public final ImmutableWorkSource e;
    public final gged_interceptors f;

    public fvfn() {
        throw null;
    }

    public fvfn(boolean z, Duration duration0, Duration duration1, boolean z1, ImmutableWorkSource immutableWorkSource0, gged_interceptors gged0) {
        this.a = z;
        if(duration0 == null) {
            throw new NullPointerException("Null refreshInterval");
        }
        this.b = duration0;
        if(duration1 == null) {
            throw new NullPointerException("Null minUpdateInterval");
        }
        this.c = duration1;
        this.d = z1;
        this.e = immutableWorkSource0;
        if(gged0 == null) {
            throw new NullPointerException("Null clientNames");
        }
        this.f = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fvfn) && this.a == ((fvfn)object0).a && this.b.equals(((fvfn)object0).b) && this.c.equals(((fvfn)object0).c) && this.d == ((fvfn)object0).d) {
            ImmutableWorkSource immutableWorkSource0 = this.e;
            if(immutableWorkSource0 == null) {
                return ((fvfn)object0).e == null ? ggia.i(this.f, ((fvfn)object0).f) : false;
            }
            return immutableWorkSource0.equals(((fvfn)object0).e) ? ggia.i(this.f, ((fvfn)object0).f) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (((this.a ? 0x4CF : 0x4D5) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
        int v2 = this.e == null ? 0 : this.e.hashCode();
        if(this.d) {
            v = 0x4CF;
        }
        return this.f.hashCode() ^ ((v1 * 1000003 ^ v) * 1000003 ^ v2) * 1000003;
    }

    @Override
    public final String toString() {
        return "AssistanceRequest{enableCorrections=" + this.a + ", refreshInterval=" + this.b.toString() + ", minUpdateInterval=" + this.c.toString() + ", oneShot=" + this.d + ", workSource=" + this.e + ", clientNames=" + this.f.toString() + "}";
    }
}

