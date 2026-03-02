import android.graphics.SurfaceTexture;

final class bwm implements bpd {
    final SurfaceTexture a;
    final bwn b;

    public bwm(bwn bwn0, SurfaceTexture surfaceTexture0) {
        this.b = bwn0;
        this.a = surfaceTexture0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", throwable0);
    }

    @Override  // bpd
    public final void b(Object object0) {
        kay.d(((bei)object0).a != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
        bcs.h("TextureViewImpl");
        this.a.release();
        bwo bwo0 = this.b.a;
        if(bwo0.h != null) {
            bwo0.h = null;
        }
    }
}

