import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicReference;

final class bwo extends bvy {
    TextureView c;
    SurfaceTexture d;
    gmcd e;
    bel f;
    boolean g;
    SurfaceTexture h;
    final AtomicReference i;
    bvs j;

    public bwo(FrameLayout frameLayout0, bvo bvo0) {
        super(frameLayout0, bvo0);
        this.g = false;
        this.i = new AtomicReference();
    }

    @Override  // bvy
    public final View a() {
        return this.c;
    }

    @Override  // bvy
    public final gmcd b() {
        return jqy.a(new bwh(this));
    }

    @Override  // bvy
    public final void c() {
        if(this.g && this.h != null) {
            SurfaceTexture surfaceTexture0 = this.c.getSurfaceTexture();
            SurfaceTexture surfaceTexture1 = this.h;
            if(surfaceTexture0 != surfaceTexture1) {
                this.c.setSurfaceTexture(surfaceTexture1);
                this.h = null;
                this.g = false;
            }
        }
    }

    @Override  // bvy
    public final void d() {
        this.g = true;
    }

    @Override  // bvy
    public final void g(bel bel0, bvs bvs0) {
        this.a = bel0.b;
        this.j = bvs0;
        kay.i(this.a);
        FrameLayout frameLayout0 = this.b;
        TextureView textureView0 = new TextureView(frameLayout0.getContext());
        this.c = textureView0;
        textureView0.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.c.setSurfaceTextureListener(new bwn(this));
        frameLayout0.removeAllViews();
        frameLayout0.addView(this.c);
        bel bel1 = this.f;
        if(bel1 != null) {
            bel1.f();
        }
        this.f = bel0;
        bel0.a(this.c.getContext().getMainExecutor(), new bwi(this, bel0));
        this.i();
    }

    public final void h() {
        bvs bvs0 = this.j;
        if(bvs0 != null) {
            bvs0.a();
            this.j = null;
        }
    }

    final void i() {
        Size size0 = this.a;
        if(size0 != null) {
            SurfaceTexture surfaceTexture0 = this.d;
            if(surfaceTexture0 != null && this.f != null) {
                surfaceTexture0.setDefaultBufferSize(size0.getWidth(), this.a.getHeight());
                Surface surface0 = new Surface(this.d);
                bel bel0 = this.f;
                gmcd gmcd0 = jqy.a(new bwk(this, surface0));
                this.e = gmcd0;
                gmcd0.hB(new bwl(this, surface0, gmcd0, bel0), this.c.getContext().getMainExecutor());
                this.e();
            }
        }
    }
}

