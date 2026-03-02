import android.hardware.camera2.CaptureRequest.Key;

public final class ans implements bau {
    public final blb a;

    public ans() {
        this.a = blb.a();
    }

    public final ant a() {
        return new ant(blf.f(this.a));
    }

    public final void b(bjt bjt0) {
        this.c(bjt0, bjs.d);
    }

    public final void c(bjt bjt0, bjs bjs0) {
        for(Object object0: bjt0.r()) {
            Object object1 = bjt0.l(((bjr)object0));
            this.a.d(((bjr)object0), bjs0, object1);
        }
    }

    public final void d(CaptureRequest.Key captureRequest$Key0, Object object0) {
        bjr bjr0 = ant.d(captureRequest$Key0);
        this.a.c(bjr0, object0);
    }

    public final void e(CaptureRequest.Key captureRequest$Key0, Object object0, bjs bjs0) {
        bjr bjr0 = ant.d(captureRequest$Key0);
        this.a.d(bjr0, bjs0, object0);
    }

    @Override  // bau
    public final blb f() {
        throw null;
    }
}

