import android.util.Range;
import android.util.Size;

public final class bmh {
    public bat a;
    public bjt b;
    private Size c;
    private Size d;
    private Integer e;
    private Range f;
    private Boolean g;

    public bmh() {
    }

    public bmh(bmi bmi0) {
        this.c = bmi0.b;
        this.d = bmi0.c;
        this.a = bmi0.d;
        this.e = (int)bmi0.e;
        this.f = bmi0.f;
        this.b = bmi0.g;
        this.g = Boolean.valueOf(bmi0.h);
    }

    public final bmi a() {
        String s = this.c == null ? " resolution" : "";
        if(this.d == null) {
            s = s + " originalConfiguredResolution";
        }
        if(this.a == null) {
            s = s + " dynamicRange";
        }
        if(this.e == null) {
            s = s + " sessionType";
        }
        if(this.f == null) {
            s = s + " expectedFrameRateRange";
        }
        if(this.g == null) {
            s = s + " zslDisabled";
        }
        if(s.isEmpty()) {
            return new bmi(this.c, this.d, this.a, ((int)this.e), this.f, this.b, this.g.booleanValue());
        }
        throw new IllegalStateException("Missing required properties:" + s);
    }

    public final void b(Range range0) {
        if(range0 == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        this.f = range0;
    }

    public final void c(Size size0) {
        if(size0 == null) {
            throw new NullPointerException("Null originalConfiguredResolution");
        }
        this.d = size0;
    }

    public final void d(Size size0) {
        if(size0 == null) {
            throw new NullPointerException("Null resolution");
        }
        this.c = size0;
    }

    public final void e(int v) {
        this.e = v;
    }

    public final void f(boolean z) {
        this.g = Boolean.valueOf(z);
    }
}

