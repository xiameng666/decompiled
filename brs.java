import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class brs implements kar {
    public final bsb a;
    public final bel b;
    public final SurfaceTexture c;
    public final Surface d;

    public brs(bsb bsb0, bel bel0, SurfaceTexture surfaceTexture0, Surface surface0) {
        this.a = bsb0;
        this.b = bel0;
        this.c = surfaceTexture0;
        this.d = surface0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        bei bei0 = (bei)object0;
        this.b.b();
        this.c.setOnFrameAvailableListener(null);
        this.c.release();
        this.d.release();
        --this.a.g;
        this.a.a();
    }
}

