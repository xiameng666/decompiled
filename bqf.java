import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class bqf implements bde {
    @Override  // bde
    public final void a(bel bel0) {
        SurfaceTexture surfaceTexture0 = new SurfaceTexture(0);
        surfaceTexture0.setDefaultBufferSize(bel0.b.getWidth(), bel0.b.getHeight());
        surfaceTexture0.detachFromGLContext();
        Surface surface0 = new Surface(surfaceTexture0);
        bel0.c(surface0, bol.a(), new bqe(surface0, surfaceTexture0));
    }
}

