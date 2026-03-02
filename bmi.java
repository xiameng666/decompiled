import android.util.Range;
import android.util.Size;

public final class bmi {
    public static final Range a;
    public final Size b;
    public final Size c;
    public final bat d;
    public final int e;
    public final Range f;
    public final bjt g;
    public final boolean h;

    static {
        Integer integer0 = (int)0;
        bmi.a = new Range(integer0, integer0);
    }

    public bmi() {
        throw null;
    }

    public bmi(Size size0, Size size1, bat bat0, int v, Range range0, bjt bjt0, boolean z) {
        this.b = size0;
        this.c = size1;
        this.d = bat0;
        this.e = v;
        this.f = range0;
        this.g = bjt0;
        this.h = z;
    }

    public static bmh a(Size size0) {
        bmh bmh0 = new bmh();
        bmh0.d(size0);
        bmh0.c(size0);
        bmh0.e(0);
        bmh0.b(bmi.a);
        bmh0.a = bat.b;
        bmh0.f(false);
        return bmh0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bmi) && this.b.equals(((bmi)object0).b) && this.c.equals(((bmi)object0).c) && this.d.equals(((bmi)object0).d) && this.e == ((bmi)object0).e && this.f.equals(((bmi)object0).f)) {
            bjt bjt0 = this.g;
            if(bjt0 == null) {
                return ((bmi)object0).g == null ? this.h == ((bmi)object0).h : false;
            }
            return bjt0.equals(((bmi)object0).g) ? this.h == ((bmi)object0).h : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
        int v1 = this.g == null ? 0 : this.g.hashCode();
        return this.h ? 0x4CF ^ (v * 1000003 ^ v1) * 1000003 : 0x4D5 ^ (v * 1000003 ^ v1) * 1000003;
    }

    @Override
    public final String toString() {
        return "StreamSpec{resolution=" + this.b + ", originalConfiguredResolution=" + this.c + ", dynamicRange=" + this.d + ", sessionType=" + this.e + ", expectedFrameRateRange=" + this.f + ", implementationOptions=" + this.g + ", zslDisabled=" + this.h + "}";
    }
}

