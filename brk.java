import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class brk implements Runnable {
    public final bsb a;
    public final bel b;

    public brk(bsb bsb0, bel bel0) {
        this.a = bsb0;
        this.b = bel0;
    }

    @Override
    public final void run() {
        ++this.a.g;
        bto.h(this.a.a.a, true);
        bto.g(this.a.a.c);
        SurfaceTexture surfaceTexture0 = new SurfaceTexture(this.a.a.m);
        surfaceTexture0.setDefaultBufferSize(this.b.b.getWidth(), this.b.b.getHeight());
        Surface surface0 = new Surface(surfaceTexture0);
        brr brr0 = new brr(this.a, this.b);
        this.b.d(this.a.c, brr0);
        brs brs0 = new brs(this.a, this.b, surfaceTexture0, surface0);
        this.b.c(surface0, this.a.c, brs0);
        surfaceTexture0.setOnFrameAvailableListener(this.a, this.a.d);
    }
}

