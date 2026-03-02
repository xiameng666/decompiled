import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class mi {
    public final ArrayList a;
    kft b;
    public boolean c;
    private long d;
    private Interpolator e;
    private final kfu f;

    public mi() {
        this.d = -1L;
        this.f = new mh(this);
        this.a = new ArrayList();
    }

    public final void a() {
        if(!this.c) {
            return;
        }
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((kfs)arrayList0.get(v1)).a();
        }
        this.c = false;
    }

    public final void b() {
        if(this.c) {
            return;
        }
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            kfs kfs0 = (kfs)arrayList0.get(v1);
            long v2 = this.d;
            if(v2 >= 0L) {
                kfs0.f(v2);
            }
            Interpolator interpolator0 = this.e;
            if(interpolator0 != null) {
                kfs0.g(interpolator0);
            }
            if(this.b != null) {
                kfs0.h(this.f);
            }
            kfs0.b();
        }
        this.c = true;
    }

    public final void c(kfs kfs0) {
        if(!this.c) {
            this.a.add(kfs0);
        }
    }

    public final void d() {
        if(!this.c) {
            this.d = 0xFAL;
        }
    }

    public final void e(Interpolator interpolator0) {
        if(!this.c) {
            this.e = interpolator0;
        }
    }

    public final void f(kft kft0) {
        if(!this.c) {
            this.b = kft0;
        }
    }
}

