import android.util.Size;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import j..util.Objects;
import java.util.concurrent.Executor;

final class bwg extends bvy {
    SurfaceView c;
    final bwf d;

    public bwg(FrameLayout frameLayout0, bvo bvo0) {
        super(frameLayout0, bvo0);
        this.d = new bwf(this);
    }

    @Override  // bvy
    public final View a() {
        return this.c;
    }

    @Override  // bvy
    public final gmcd b() {
        return bpt.b(null);
    }

    @Override  // bvy
    public final void c() {
    }

    @Override  // bvy
    public final void d() {
    }

    @Override  // bvy
    public final void g(bel bel0, bvs bvs0) {
        Size size0 = bel0.b;
        if(this.c == null || !Objects.equals(this.a, size0)) {
            this.a = size0;
            kay.i(this.a);
            FrameLayout frameLayout0 = this.b;
            SurfaceView surfaceView0 = new SurfaceView(frameLayout0.getContext());
            this.c = surfaceView0;
            surfaceView0.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
            frameLayout0.removeAllViews();
            frameLayout0.addView(this.c);
            this.c.getHolder().addCallback(this.d);
        }
        Executor executor0 = this.c.getContext().getMainExecutor();
        Objects.requireNonNull(bvs0);
        bel0.a(executor0, new bwc(bvs0));
        this.c.post(new bwd(this, bel0, bvs0));
    }
}

