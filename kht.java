import android.view.animation.PathInterpolator;

public class kht {
    public final khs a;
    public jxn b;
    public jxn c;
    public Object d;
    public Throwable e;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public kht() {
        this.a = new khs();
        this.b = jxn.a;
        this.c = jxn.a;
        this.d = null;
        this.e = null;
    }

    public int a(int v) {
        throw null;
    }

    public void b() {
        throw null;
    }

    public final void c(Object object0) {
        this.d = object0;
        this.e = object0 == null ? null : new Throwable("tid=" + Thread.currentThread().getId());
    }

    final void d(float f) {
        khs khs0 = this.a;
        if(khs0.f != f) {
            khs0.f = f;
            khv khv0 = khs0.g;
            if(khv0 != null) {
                khv0.b.setAlpha(f);
            }
        }
    }

    final void e(float f) {
        khs khs0 = this.a;
        float f1 = -(1.0f - f) * ((float)khs0.a);
        if(khs0.e != f1) {
            khs0.e = f1;
            khv khv0 = khs0.g;
            if(khv0 != null) {
                khv0.b.setTranslationY(f1);
            }
        }
    }

    final void f(boolean z) {
        khs khs0 = this.a;
        if(khs0.c != z) {
            khs0.c = z;
            khv khv0 = khs0.g;
            if(khv0 != null) {
                khv0.b.setVisibility((z ? 0 : 8));
            }
        }
    }
}

