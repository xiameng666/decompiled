import j..util.Objects;
import org.webrtc.SessionDescription;

final class czyi extends czyr {
    final czyj a;

    public czyi(czyj czyj0) {
        Objects.requireNonNull(czyj0);
        this.a = czyj0;
        super();
    }

    @Override  // czyr
    public final void onSetFailure(String s) {
        super.onSetFailure(s);
        this.a.b.h.a();
    }

    @Override  // czyr
    public final void onSetSuccess() {
        super.onSetSuccess();
        czyo czyo0 = this.a.b;
        SessionDescription sessionDescription0 = czyo0.c.nativeGetLocalDescription();
        czkq.a.b().p("Sending WebRTC answer", new Object[0]);
        if(!czyo0.h.b(sessionDescription0)) {
            czyo0.h.a();
        }
    }
}

