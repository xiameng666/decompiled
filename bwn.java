import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import java.util.Objects;

final class bwn implements TextureView.SurfaceTextureListener {
    final bwo a;

    public bwn(bwo bwo0) {
        this.a = bwo0;
        super();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        bcs.h("TextureViewImpl");
        bwo bwo0 = this.a;
        bwo0.d = surfaceTexture0;
        if(bwo0.e != null) {
            kay.i(bwo0.f);
            Objects.toString(bwo0.f);
            bcs.h("TextureViewImpl");
            bwo0.f.g.d();
            return;
        }
        bwo0.i();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        bwo bwo0 = this.a;
        bwo0.d = null;
        gmcd gmcd0 = bwo0.e;
        if(gmcd0 != null) {
            bpt.j(gmcd0, new bwm(this, surfaceTexture0), bwo0.c.getContext().getMainExecutor());
            bwo0.h = surfaceTexture0;
            return false;
        }
        bcs.h("TextureViewImpl");
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        bcs.h("TextureViewImpl");
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        jqt jqt0 = (jqt)this.a.i.getAndSet(null);
        if(jqt0 != null) {
            jqt0.b(null);
        }
    }
}

