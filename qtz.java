import android.graphics.PointF;
import android.view.animation.Interpolator;

public class qtz {
    private final qkb a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public PointF l;
    public PointF m;
    private int n;
    private float o;
    private float p;

    public qtz(Object object0) {
        this.i = -3987645.75f;
        this.j = -3987645.75f;
        this.n = 0x2EC8FB09;
        this.k = 0x2EC8FB09;
        this.o = 1.401298E-45f;
        this.p = 1.401298E-45f;
        this.l = null;
        this.m = null;
        this.a = null;
        this.b = object0;
        this.c = object0;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 1.401298E-45f;
        this.h = (float)3.402823E+38f;
    }

    public qtz(Object object0, Object object1) {
        this.i = -3987645.75f;
        this.j = -3987645.75f;
        this.n = 0x2EC8FB09;
        this.k = 0x2EC8FB09;
        this.o = 1.401298E-45f;
        this.p = 1.401298E-45f;
        this.l = null;
        this.m = null;
        this.a = null;
        this.b = object0;
        this.c = object1;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 1.401298E-45f;
        this.h = (float)3.402823E+38f;
    }

    public qtz(qkb qkb0, Object object0, Object object1, Interpolator interpolator0, float f, Float float0) {
        this.i = -3987645.75f;
        this.j = -3987645.75f;
        this.n = 0x2EC8FB09;
        this.k = 0x2EC8FB09;
        this.o = 1.401298E-45f;
        this.p = 1.401298E-45f;
        this.l = null;
        this.m = null;
        this.a = qkb0;
        this.b = object0;
        this.c = object1;
        this.d = interpolator0;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = float0;
    }

    public qtz(qkb qkb0, Object object0, Object object1, Interpolator interpolator0, Interpolator interpolator1, float f) {
        this.i = -3987645.75f;
        this.j = -3987645.75f;
        this.n = 0x2EC8FB09;
        this.k = 0x2EC8FB09;
        this.o = 1.401298E-45f;
        this.p = 1.401298E-45f;
        this.l = null;
        this.m = null;
        this.a = qkb0;
        this.b = object0;
        this.c = object1;
        this.d = null;
        this.e = interpolator0;
        this.f = interpolator1;
        this.g = f;
        this.h = null;
    }

    protected qtz(qkb qkb0, Object object0, Object object1, Interpolator interpolator0, Interpolator interpolator1, Interpolator interpolator2, float f, Float float0) {
        this.i = -3987645.75f;
        this.j = -3987645.75f;
        this.n = 0x2EC8FB09;
        this.k = 0x2EC8FB09;
        this.o = 1.401298E-45f;
        this.p = 1.401298E-45f;
        this.l = null;
        this.m = null;
        this.a = qkb0;
        this.b = object0;
        this.c = object1;
        this.d = interpolator0;
        this.e = interpolator1;
        this.f = interpolator2;
        this.g = f;
        this.h = float0;
    }

    public final float b() {
        qkb qkb0 = this.a;
        if(qkb0 == null) {
            return 1.0f;
        }
        float f = this.p;
        if(f == 1.401298E-45f) {
            if(this.h == null) {
                this.p = 1.0f;
                return 1.0f;
            }
            float f1 = this.c() + (((float)this.h) - this.g) / qkb0.b();
            this.p = f1;
            return f1;
        }
        return f;
    }

    public final float c() {
        qkb qkb0 = this.a;
        if(qkb0 == null) {
            return 0.0f;
        }
        float f = this.o;
        if(f == 1.401298E-45f) {
            f = (this.g - qkb0.k) / qkb0.b();
            this.o = f;
        }
        return f;
    }

    public final int d() {
        int v = this.n;
        if(v == 0x2EC8FB09) {
            v = (int)(((Integer)this.b));
            this.n = v;
        }
        return v;
    }

    public final boolean e(float f) {
        return f >= this.c() && f < this.b();
    }

    public final boolean f() {
        return this.d == null && this.e == null && this.f == null;
    }

    @Override
    public final String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + "}";
    }
}

