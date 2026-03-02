import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.chimera.android.Activity;

public abstract class gats implements View.OnClickListener, gauf, gcjx, gcjy {
    public final Activity a;
    public gatq b;
    public final byi c;
    public SurfaceView d;
    protected final Handler e;
    public HandlerThread f;
    public Handler g;
    public final gaug h;
    protected final ibnf i;
    public boolean j;

    public gats(Activity activity0, gaug gaug0, ibnf ibnf0) {
        this.c = new byi(2);
        this.e = new clht(Looper.getMainLooper());
        this.a = activity0;
        this.h = gaug0;
        this.i = ibnf0;
    }

    @Override  // gcjx
    public final void b() {
        if(!this.c()) {
            this.ne();
        }
    }

    public abstract int d();

    protected static Rect e(int v, int v1, float f, float[] arr_f) {
        int v3;
        int v2;
        float f1 = gbmn.a(f, arr_f);
        float f2 = f1 * ((float)v1);
        if(Float.compare(v, f2) > 0) {
            v2 = (int)((((float)v) - f2) / 2.0f);
            v -= v2;
            v3 = 0;
        }
        else {
            int v4 = (int)((((float)v1) - ((float)v) / f1) / 2.0f);
            v1 -= v4;
            v3 = v4;
            v2 = 0;
        }
        float f3 = arr_f[0];
        float f4 = arr_f[2];
        float f5 = ((float)(v - v2)) / (1.0f + f3 + f4);
        return new Rect(v2 + ((int)(f3 * f5)), v3 + ((int)(arr_f[1] * f5)), v - ((int)(f4 * f5)), v1 - ((int)(arr_f[3] * f5)));
    }

    public final gbml f() {
        gatq gatq0 = this.b;
        if(gatq0 != null) {
            long v = gatq0.nz();
            return (gbml)this.c.d(v);
        }
        return null;
    }

    public abstract ibnf g(float arg1, float[] arg2);

    public final void h(Bitmap bitmap0, Uri uri0, boolean z) {
        gbml gbml0 = this.f();
        if(gbml0 != null) {
            gato gato0 = new gato(gbml0, bitmap0, uri0, z);
            this.e.post(gato0);
        }
    }

    public final void i(gatq gatq0, boolean z) {
        gatp gatp0 = new gatp(gatq0, z);
        this.e.post(gatp0);
    }

    @Override  // gauf
    public final void j(hcur hcur0) {
        this.o(hcur0);
    }

    public final void k(long v) {
        synchronized(this) {
            this.l(v, true);
        }
    }

    public final void l(long v, boolean z) {
        synchronized(this) {
            if(this.t(v)) {
                this.m();
                this.a.getWindow().clearFlags(0x80);
                gbml gbml0 = this.f();
                if(gbml0 != null) {
                    View view0 = gbml0.i;
                    if(view0 != null) {
                        gbml0.removeView(view0);
                        gbml0.i = null;
                        gbml0.m();
                    }
                    this.d = null;
                    if(z) {
                        gbml0.i();
                    }
                }
                HandlerThread handlerThread0 = this.f;
                if(handlerThread0 != null) {
                    handlerThread0.quit();
                    this.f = null;
                    this.g = null;
                }
                boolean z1 = true;
                this.b = null;
                gaug gaug0 = this.h;
                if(gaug0 != null) {
                    if(!gaug0.a.remove(this) && !gaug0.b) {
                        z1 = false;
                    }
                    gaug0.b = z1;
                }
            }
        }
    }

    protected abstract void m();

    public final void n(boolean z, boolean z1, boolean z2, boolean z3) {
        gbml gbml0 = this.f();
        if(gbml0 != null) {
            gbmk gbmk0 = gbml0.l;
            gbmk0.k[0] = z;
            gbmk0.k[1] = z1;
            gbmk0.k[2] = z2;
            gbmk0.k[3] = z3;
            gbmk0.invalidate();
        }
    }

    public abstract void o(hcur arg1);

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.ne();
    }

    public abstract void p(gbml arg1, gatr arg2);

    protected abstract void q();

    public final void r() {
        this.q();
        this.a.getWindow().clearFlags(0x80);
        gbml gbml0 = this.f();
        if(gbml0 != null) {
            gbml0.setClickable(false);
        }
        this.j = false;
    }

    public abstract boolean s();

    public final boolean t(long v) {
        return this.b != null && this.b.nz() == v;
    }

    public abstract void u(gbsf arg1, boolean arg2);

    protected abstract void v(int arg1);
}

