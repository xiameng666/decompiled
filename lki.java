import android.animation.ValueAnimator;
import android.os.Build.VERSION;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

public final class lki {
    public static final lkh a;
    public static final lkh b;
    public static final lkh c;
    public static final lkh d;
    public static final lkh e;
    public static final lkh f;
    public static final lkh g;
    public float h;
    float i;
    boolean j;
    final Object k;
    final lkj l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public final ArrayList q;
    public final ArrayList r;
    public lkl s;
    private long t;
    private float u;
    private boolean v;

    static {
        lki.a = new lka();
        lki.b = new lkb();
        lki.c = new lkc();
        lki.d = new lkd();
        lki.e = new lke();
        lki.f = new lkf();
        lki.g = new ljy();
    }

    public lki(Object object0, lkj lkj0) {
        this.h = 0.0f;
        this.i = 3.402823E+38f;
        this.j = false;
        this.m = false;
        this.n = 3.402823E+38f;
        this.o = -3.402823E+38f;
        this.t = 0L;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.k = object0;
        this.l = lkj0;
        float f = 0.1f;
        if(lkj0 != lki.d && lkj0 != lki.e && lkj0 != lki.f) {
            if(lkj0 == lki.g) {
                f = 0.003906f;
            }
            else if(lkj0 != lki.b && lkj0 != lki.c) {
                f = 1.0f;
            }
        }
        this.p = f;
        this.s = null;
        this.u = 3.402823E+38f;
        this.v = false;
    }

    public lki(lkk lkk0) {
        this.h = 0.0f;
        this.i = 3.402823E+38f;
        this.j = false;
        this.m = false;
        this.n = 3.402823E+38f;
        this.o = -3.402823E+38f;
        this.t = 0L;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.k = null;
        this.l = new ljz(lkk0);
        this.p = 1.0f;
        this.s = null;
        this.u = 3.402823E+38f;
        this.v = false;
    }

    final void a(float f) {
        ArrayList arrayList0;
        this.l.b(this.k, f);
        for(int v = 0; true; ++v) {
            arrayList0 = this.r;
            if(v >= arrayList0.size()) {
                break;
            }
            if(arrayList0.get(v) != null) {
                pab pab0 = (pab)arrayList0.get(v);
                long v1 = Math.max(-1L, Math.min(pab0.h() + 1L, Math.round(this.i)));
                pab0.g.A(v1, pab0.a);
                pab0.a = v1;
            }
        }
        lki.g(arrayList0);
    }

    public final void b(long v) {
        ArrayList arrayList1;
        float f2;
        boolean z;
        long v1 = this.t;
        if(v1 == 0L) {
            this.t = v;
            this.a(this.i);
            return;
        }
        this.t = v;
        float f = ljx.a().f;
        long v2 = f == 0.0f ? 0x7FFFFFFFL : ((long)(((float)(v - v1)) / f));
        if(this.v) {
            float f1 = this.u;
            if(f1 != 3.402823E+38f) {
                this.s.d(f1);
                this.u = 3.402823E+38f;
            }
            this.i = this.s.a();
            this.h = 0.0f;
            this.v = false;
            z = true;
        }
        else {
            if(this.u == 3.402823E+38f) {
                lkg lkg2 = this.s.b(((double)this.i), ((double)this.h), v2);
                f2 = lkg2.a;
                this.i = f2;
                this.h = lkg2.b;
            }
            else {
                lkg lkg0 = this.s.b(((double)this.i), ((double)this.h), v2 / 2L);
                this.s.d(this.u);
                this.u = 3.402823E+38f;
                lkg lkg1 = this.s.b(((double)lkg0.a), ((double)lkg0.b), v2 / 2L);
                f2 = lkg1.a;
                this.i = f2;
                this.h = lkg1.b;
            }
            float f3 = Math.max(f2, this.o);
            this.i = f3;
            float f4 = Math.min(f3, this.n);
            this.i = f4;
            if((((double)Math.abs(this.h)) < this.s.d) && (((double)Math.abs(f4 - this.s.a())) < this.s.c)) {
                this.i = this.s.a();
                this.h = 0.0f;
                z = true;
            }
            else {
                z = false;
            }
        }
        float f5 = Math.min(this.i, this.n);
        this.i = f5;
        float f6 = Math.max(f5, this.o);
        this.i = f6;
        this.a(f6);
        if(z) {
            this.m = false;
            ljx ljx0 = ljx.a();
            ljx0.a.remove(this);
            ArrayList arrayList0 = ljx0.b;
            int v3 = arrayList0.indexOf(this);
            if(v3 >= 0) {
                arrayList0.set(v3, null);
                ljx0.e = true;
            }
            this.t = 0L;
            this.j = false;
            for(int v4 = 0; true; ++v4) {
                arrayList1 = this.q;
                if(v4 >= arrayList1.size()) {
                    break;
                }
                if(arrayList1.get(v4) != null) {
                    pab pab0 = ((paa)arrayList1.get(v4)).a;
                    if((this.i < 1.0f)) {
                        long v5 = pab0.h();
                        pak pak0 = pab0.g;
                        pak pak1 = ((pat)pak0).g(0);
                        pak pak2 = pak1.q;
                        pak1.q = null;
                        pak0.A(-1L, pab0.a);
                        pak0.A(v5, -1L);
                        pab0.a = v5;
                        Runnable runnable0 = pab0.f;
                        if(runnable0 != null) {
                            runnable0.run();
                        }
                        pak0.r.clear();
                        if(pak2 != null) {
                            pak2.v(pak2, paj.b, true);
                        }
                    }
                    else {
                        pab0.g.v(pab0.g, paj.b, false);
                    }
                }
            }
            lki.g(arrayList1);
        }
    }

    public final void c(float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.p = f;
    }

    public final void d(float f) {
        this.i = f;
        this.j = true;
    }

    public final void e(float f) {
        if(this.m) {
            this.u = f;
            return;
        }
        if(this.s == null) {
            this.s = new lkl(f);
        }
        this.s.d(f);
        lkl lkl0 = this.s;
        if(lkl0 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double f1 = (double)lkl0.a();
        if(f1 > ((double)this.n)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if(f1 < ((double)this.o)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double f2 = Math.abs(this.p * 0.75f);
        lkl0.c = f2;
        lkl0.d = f2 * 62.5;
        if(!ljx.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if(!this.m) {
            this.m = true;
            if(!this.j) {
                this.i = this.l.a(this.k);
            }
            if(this.i > this.n || this.i < this.o) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            ljx ljx0 = ljx.a();
            ArrayList arrayList0 = ljx0.b;
            if(arrayList0.size() == 0) {
                ljx0.g.a(ljx0.d);
                if(Build.VERSION.SDK_INT >= 33) {
                    ljx0.f = ValueAnimator.getDurationScale();
                    if(ljx0.h == null) {
                        ljx0.h = new lju(ljx0);
                    }
                    lju lju0 = ljx0.h;
                    if(lju0.a == null) {
                        lju0.a = new ljt(lju0);
                        ValueAnimator.registerDurationScaleChangeListener(lju0.a);
                    }
                }
            }
            if(!arrayList0.contains(this)) {
                arrayList0.add(this);
            }
        }
    }

    public final void f() {
        if(!(this.s.b > 0.0)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if(!ljx.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if(this.m) {
            this.v = true;
        }
    }

    private static void g(ArrayList arrayList0) {
        int v = arrayList0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(arrayList0.get(v) == null) {
                arrayList0.remove(v);
            }
        }
    }
}

