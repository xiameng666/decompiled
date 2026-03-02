import j..util.Objects;
import org.webrtc.SessionDescription;

final class czyl extends czyr {
    final czym a;

    public czyl(czym czym0) {
        Objects.requireNonNull(czym0);
        this.a = czym0;
        super();
    }

    @Override  // czyr
    public final void onSetFailure(String s) {
        super.onSetFailure(s);
        this.a.a.d = false;
        this.a.a.h.a();
    }

    @Override  // czyr
    public final void onSetSuccess() {
        super.onSetSuccess();
        czyo czyo0 = this.a.a;
        SessionDescription sessionDescription0 = czyo0.c.nativeGetLocalDescription();
        cunf cunf0 = czkq.a;
        cunf0.b().p("Processing WebRTC onRenegotiationNeeded, sending offer", new Object[0]);
        if(!czyo0.h.c(sessionDescription0)) {
            cunf0.b().p("Unable to send offer. Failed to write the offer to the remote peer.", new Object[0]);
            czyo0.h.a();
        }
        czyo0.d = false;
    }
}

