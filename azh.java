import android.hardware.camera2.CaptureRequest.Key;

public final class azh implements bau {
    public final blb a;

    public azh() {
        this.a = blb.a();
    }

    public static azh a(bjt bjt0) {
        azh azh0 = new azh();
        bjt0.v(new azg(azh0, bjt0));
        return azh0;
    }

    public final azi b() {
        return new azi(blf.f(this.a));
    }

    public final void c(CaptureRequest.Key captureRequest$Key0, Object object0) {
        bjr bjr0 = ant.d(captureRequest$Key0);
        this.a.c(bjr0, object0);
    }

    @Override  // bau
    public final blb f() {
        throw null;
    }
}

