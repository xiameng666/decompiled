import j..util.Objects;
import org.webrtc.SessionDescription;

final class czoh implements czyt {
    final czyv a;
    final czoi b;

    public czoh(czoi czoi0, czyv czyv0) {
        this.a = czyv0;
        Objects.requireNonNull(czoi0);
        this.b = czoi0;
        super();
    }

    @Override  // czyt
    public final void a() {
        czkq.a.b().p("WebRTC accepting connection operation failed.", new Object[0]);
        this.b.h(this.a);
    }

    @Override  // czyt
    public final boolean b(SessionDescription sessionDescription0) {
        czzk czzk0 = this.b.i;
        byte[] arr_b = czos.o(this.b.b, sessionDescription0);
        return czos.s(czzk0, this.b.a, 2, this.a, arr_b);
    }

    @Override  // czyt
    public final boolean c(SessionDescription sessionDescription0) {
        czzk czzk0 = this.b.i;
        byte[] arr_b = czos.r(this.b.b, sessionDescription0);
        return czos.s(czzk0, this.b.a, 2, this.a, arr_b);
    }
}

