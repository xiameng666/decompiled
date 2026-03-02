import android.location.LocationRequest.Builder;
import android.location.LocationRequest;
import com.google.android.gms.libs.identity.ImmutableWorkSource;

public final class cjgv {
    public static final cjgu a;
    public static final long b;
    public static final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ImmutableWorkSource g;
    private final jyp h;

    static {
        cjgv.a = new cjgu();
        cjgv.b = ibzy.i(-1L, ibzz.c);
        cjgv.c = ibzy.i(0x7FFFFFFFFFFFFFFFL, ibzz.c);
    }

    public cjgv(jyp jyp0, boolean z, boolean z1, ImmutableWorkSource immutableWorkSource0) {
        ibuq.f(immutableWorkSource0, "workSource");
        super();
        this.h = jyp0;
        if(jyp0.g < jyp0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d = z;
        this.e = z1;
        this.f = false;
        this.g = immutableWorkSource0;
    }

    public final long a() {
        return ibzy.i(this.h.b, ibzz.c);
    }

    public final long b() {
        return this.h.b;
    }

    public final long c() {
        return ibzy.i(this.h.g, ibzz.c);
    }

    public final long d() {
        return this.h.g;
    }

    public final long e() {
        return ibzy.i(this.h.a(), ibzz.c);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof cjgv) && this.d == ((cjgv)object0).d && this.e == ((cjgv)object0).e && ibuq.m(this.h, ((cjgv)object0).h) && ibuq.m(this.g, ((cjgv)object0).g);
    }

    public final LocationRequest f() {
        return new LocationRequest.Builder(jyn.a(this.h)).setHiddenFromAppOps(this.d).setLocationSettingsIgnored(this.e).setLowPower(false).setWorkSource(this.g.b()).build();
    }

    public final cjhs g() {
        switch(this.h.a) {
            case 100: {
                return cjhs.a;
            }
            case 102: {
                return cjhs.b;
            }
            case 104: {
                return cjhs.c;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public final boolean h() {
        long v = this.h.g;
        return v > 0L && v >> 1 >= this.h.b;
    }

    @Override
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final boolean i() {
        return this.h.b == 0x7FFFFFFFFFFFFFFFL;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Request[");
        if(this.i()) {
            stringBuilder0.append("PASSIVE");
        }
        else {
            stringBuilder0.append("@");
            cjgg.a(stringBuilder0, this.a());
            if(!ibzw.r(this.c(), this.a())) {
                stringBuilder0.append("/");
                cjgg.a(stringBuilder0, this.c());
            }
            stringBuilder0.append(" ");
            stringBuilder0.append(this.g());
        }
        if(!ibzw.r(this.e(), this.a())) {
            stringBuilder0.append(", minUpdateInterval=");
            cjgg.a(stringBuilder0, this.e());
        }
        if(this.d) {
            stringBuilder0.append(", hiddenFromAppOps");
        }
        if(this.e) {
            stringBuilder0.append(", locationSettingsIgnored");
        }
        ImmutableWorkSource immutableWorkSource0 = this.g;
        if(!immutableWorkSource0.isEmpty()) {
            stringBuilder0.append(", ");
            stringBuilder0.append(immutableWorkSource0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

