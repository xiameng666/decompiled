import android.view.Surface;
import j..util.Objects;
import java.util.concurrent.Executor;

public final class bwk implements jqv {
    public final bwo a;
    public final Surface b;

    public bwk(bwo bwo0, Surface surface0) {
        this.a = bwo0;
        this.b = surface0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        bcs.h("TextureViewImpl");
        bel bel0 = this.a.f;
        Executor executor0 = bol.a();
        Objects.requireNonNull(jqt0);
        bwj bwj0 = new bwj(jqt0);
        bel0.c(this.b, executor0, bwj0);
        return "provideSurface[request=" + this.a.f + " surface=" + this.b + "]";
    }
}

