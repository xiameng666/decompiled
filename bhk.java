import android.util.Range;
import android.util.Size;
import java.util.List;

public final class bhk {
    public final bmp a;
    public final int b;
    public final Size c;
    public final bat d;
    public final List e;
    public final bjt f;
    public final int g;
    public final Range h;
    public final boolean i;

    public bhk() {
        throw null;
    }

    public bhk(bmp bmp0, int v, Size size0, bat bat0, List list0, bjt bjt0, int v1, Range range0, boolean z) {
        this.a = bmp0;
        this.b = v;
        if(size0 == null) {
            throw new NullPointerException("Null size");
        }
        this.c = size0;
        if(bat0 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.d = bat0;
        this.e = list0;
        this.f = bjt0;
        this.g = v1;
        if(range0 == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.h = range0;
        this.i = z;
    }

    public final bmi a(bjt bjt0) {
        bmh bmh0 = bmi.a(this.c);
        bmh0.e(this.g);
        bmh0.b(this.h);
        bmh0.a = this.d;
        bmh0.b = bjt0;
        return bmh0.a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bhk) && this.a.equals(((bhk)object0).a) && this.b == ((bhk)object0).b && this.c.equals(((bhk)object0).c) && this.d.equals(((bhk)object0).d) && this.e.equals(((bhk)object0).e)) {
            bjt bjt0 = this.f;
            if(bjt0 == null) {
                return ((bhk)object0).f == null ? this.g == ((bhk)object0).g && this.h.equals(((bhk)object0).h) && this.i == ((bhk)object0).i : false;
            }
            return bjt0.equals(((bhk)object0).f) ? this.g == ((bhk)object0).g && this.h.equals(((bhk)object0).h) && this.i == ((bhk)object0).i : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ (this.f == null ? 0 : this.f.hashCode())) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003;
        return this.i ? 0x4CF ^ v : 0x4D5 ^ v;
    }

    @Override
    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", sessionType=" + this.g + ", targetFrameRate=" + this.h + ", strictFrameRateRequired=" + this.i + "}";
    }
}

