import j..util.Objects;
import java.util.concurrent.Executor;

final class hbtj implements gmbg {
    final hbtk a;

    public hbtj(hbtk hbtk0) {
        Objects.requireNonNull(hbtk0);
        this.a = hbtk0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        hbtk.a.b("CameraXSource", throwable0.getLocalizedMessage());
        this.a.h.g(lpf.c);
        this.a.c(hbkn.I);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        hbti hbti0 = new hbti(this, ((bvh)object0));
        Executor executor0 = this.a.f.a.getMainExecutor();
        this.a.g.hB(hbti0, executor0);
    }
}

