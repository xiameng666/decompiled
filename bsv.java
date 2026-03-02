import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public final class bsv implements Closeable {
    public final int a;
    public final Size b;
    public final gmcd c;
    public jqt d;
    private final Object e;
    private final Surface f;
    private final bdq g;
    private final bdq h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private final float[] l;
    private kar m;
    private Executor n;
    private boolean o;
    private boolean p;

    public bsv(Surface surface0, int v, Size size0, bdq bdq0, bdq bdq1) {
        this.e = new Object();
        float[] arr_f = new float[16];
        this.i = arr_f;
        float[] arr_f1 = new float[16];
        this.j = arr_f1;
        float[] arr_f2 = new float[16];
        this.k = arr_f2;
        float[] arr_f3 = new float[16];
        this.l = arr_f3;
        this.o = false;
        this.p = false;
        this.f = surface0;
        this.a = v;
        this.b = size0;
        this.g = bdq0;
        this.h = bdq1;
        bsv.d(arr_f, arr_f2, bdq0);
        bsv.d(arr_f1, arr_f3, bdq1);
        this.c = jqy.a(new bst(this));
    }

    public final Surface a(Executor executor0, kar kar0) {
        synchronized(this.e) {
            this.n = executor0;
            this.m = kar0;
        }
        if(this.o) {
            this.b();
        }
        return this.f;
    }

    public final void b() {
        Executor executor0 = null;
        AtomicReference atomicReference0 = new AtomicReference();
        synchronized(this.e) {
            if(this.n == null) {
                this.o = true;
            }
            else {
                kar kar0 = this.m;
                if(kar0 == null) {
                    this.o = true;
                }
                else if(!this.p) {
                    atomicReference0.set(kar0);
                    executor0 = this.n;
                    this.o = false;
                }
            }
        }
        if(executor0 != null) {
            try {
                executor0.execute(new bsu(this, atomicReference0));
            }
            catch(RejectedExecutionException unused_ex) {
                bcs.i("SurfaceOutputImpl");
            }
        }
    }

    public final void c(float[] arr_f, float[] arr_f1) {
        Matrix.multiplyMM(arr_f, 0, arr_f1, 0, this.i, 0);
    }

    @Override
    public final void close() {
        synchronized(this.e) {
            if(!this.p) {
                this.p = true;
            }
        }
        this.d.b(null);
    }

    private static void d(float[] arr_f, float[] arr_f1, bdq bdq0) {
        Matrix.setIdentityM(arr_f, 0);
        if(bdq0 == null) {
            return;
        }
        boh.b(arr_f);
        int v = bdq0.d;
        boh.a(arr_f, ((float)v));
        boolean z = bdq0.e;
        if(z) {
            Matrix.translateM(arr_f, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(arr_f, 0, -1.0f, 1.0f, 1.0f);
        }
        Size size0 = bok.l(bdq0.a, v);
        android.graphics.Matrix matrix0 = bok.e(bok.h(bdq0.a), bok.h(size0), v, z);
        RectF rectF0 = new RectF(bdq0.b);
        matrix0.mapRect(rectF0);
        float f = rectF0.left / ((float)size0.getWidth());
        float f1 = ((float)size0.getHeight()) - rectF0.height() - rectF0.top;
        float f2 = (float)size0.getHeight();
        float f3 = rectF0.width() / ((float)size0.getWidth());
        float f4 = rectF0.height() / ((float)size0.getHeight());
        Matrix.translateM(arr_f, 0, f, f1 / f2, 0.0f);
        Matrix.scaleM(arr_f, 0, f3, f4, 1.0f);
        bin bin0 = bdq0.c;
        Matrix.setIdentityM(arr_f1, 0);
        boh.b(arr_f1);
        if(bin0 != null) {
            kay.d(bin0.F(), "Camera has no transform.");
            boh.a(arr_f1, ((float)bin0.b().b()));
            if(bin0.G()) {
                Matrix.translateM(arr_f1, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(arr_f1, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(arr_f1, 0, arr_f1, 0);
        Matrix.multiplyMM(arr_f, 0, arr_f1, 0, arr_f, 0);
    }
}

