import java.util.concurrent.Executor;

public final class azc {
    public boolean a;
    public boolean b;
    public final Executor c;
    public final Object d;
    public ans e;
    jqt f;
    private final aow g;

    public azc(aow aow0, Executor executor0) {
        this.a = false;
        this.b = false;
        this.d = new Object();
        this.e = new ans();
        this.g = aow0;
        this.c = executor0;
    }

    public final void a(Exception exception0) {
        jqt jqt0 = this.f;
        if(jqt0 != null) {
            jqt0.c(exception0);
            this.f = null;
        }
    }

    public final void b(jqt jqt0) {
        this.b = true;
        this.a(new azq("Camera2CameraControl was updated with new options."));
        this.f = jqt0;
        if(this.a) {
            this.c();
        }
    }

    public final void c() {
        this.g.g().hB(new ayy(this), this.c);
        this.b = false;
    }
}

