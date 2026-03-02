import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import java.util.Objects;

final class bwf implements SurfaceHolder.Callback {
    public Size a;
    public bel b;
    public boolean c;
    public boolean d;
    final bwg e;
    public bvs f;
    private bel g;
    private Size h;

    public bwf(bwg bwg0) {
        this.e = bwg0;
        super();
        this.c = false;
        this.d = false;
    }

    public final void a() {
        if(this.b != null) {
            Objects.toString(this.b);
            bcs.h("SurfaceViewImpl");
            this.b.f();
        }
    }

    public final boolean b() {
        bwg bwg0 = this.e;
        Surface surface0 = bwg0.c.getHolder().getSurface();
        if(!this.c && this.b != null && j..util.Objects.equals(this.a, this.h)) {
            bcs.h("SurfaceViewImpl");
            bvs bvs0 = this.f;
            ((bel)j..util.Objects.requireNonNull(this.b)).c(surface0, bwg0.c.getContext().getMainExecutor(), new bwe(bvs0));
            this.c = true;
            bwg0.e();
            return true;
        }
        return false;
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        bcs.h("SurfaceViewImpl");
        this.h = new Size(v1, v2);
        this.b();
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
        bcs.h("SurfaceViewImpl");
        if(this.d) {
            bel bel0 = this.g;
            if(bel0 != null) {
                bel0.e();
                this.g = null;
                this.d = false;
            }
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        bcs.h("SurfaceViewImpl");
        if(!this.c) {
            this.a();
        }
        else if(this.b != null) {
            Objects.toString(this.b);
            bcs.h("SurfaceViewImpl");
            this.b.g.d();
        }
        this.d = true;
        bel bel0 = this.b;
        if(bel0 != null) {
            this.g = bel0;
        }
        this.c = false;
        this.b = null;
        this.f = null;
        this.h = null;
        this.a = null;
    }
}

