import android.view.Surface;

public final class bwl implements Runnable {
    public final bwo a;
    public final Surface b;
    public final gmcd c;
    public final bel d;

    public bwl(bwo bwo0, Surface surface0, gmcd gmcd0, bel bel0) {
        this.a = bwo0;
        this.b = surface0;
        this.c = gmcd0;
        this.d = bel0;
    }

    @Override
    public final void run() {
        bcs.h("TextureViewImpl");
        bwo bwo0 = this.a;
        bwo0.h();
        this.b.release();
        if(bwo0.e == this.c) {
            bwo0.e = null;
        }
        if(bwo0.f == this.d) {
            bwo0.f = null;
        }
    }
}

