import j..util.Objects;
import org.webrtc.SessionDescription;

final class czoq implements czyt {
    final czor a;

    public czoq(czor czor0) {
        Objects.requireNonNull(czor0);
        this.a = czor0;
        super();
    }

    @Override  // czyt
    public final void a() {
        czkq.a.b().p("WebRTC connection operation failed.", new Object[0]);
        this.a.d.countDown();
    }

    @Override  // czyt
    public final boolean b(SessionDescription sessionDescription0) {
        czzk czzk0 = this.a.m;
        byte[] arr_b = czos.o(this.a.c, sessionDescription0);
        return czos.s(czzk0, this.a.a, 3, this.a.b, arr_b);
    }

    @Override  // czyt
    public final boolean c(SessionDescription sessionDescription0) {
        czzk czzk0 = this.a.m;
        byte[] arr_b = czos.r(this.a.c, sessionDescription0);
        return czos.s(czzk0, this.a.a, 3, this.a.b, arr_b);
    }
}

