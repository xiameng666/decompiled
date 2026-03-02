import j..util.Objects;
import org.webrtc.SessionDescription.Type;
import org.webrtc.SessionDescription;

final class czyj extends czyr {
    final SessionDescription a;
    final czyo b;

    public czyj(czyo czyo0, SessionDescription sessionDescription0) {
        this.a = sessionDescription0;
        Objects.requireNonNull(czyo0);
        this.b = czyo0;
        super();
    }

    @Override  // czyr
    public final void onSetFailure(String s) {
        super.onSetFailure(s);
        czyo.e(this.b);
        this.b.h.a();
    }

    @Override  // czyr
    public final void onSetSuccess() {
        super.onSetSuccess();
        czkq.a.b().p("Successfully set WebRTC remote description", new Object[0]);
        czyo czyo0 = this.b;
        czyo.e(czyo0);
        if(this.a.a == SessionDescription.Type.a) {
            czyi czyi0 = new czyi(this);
            czyo0.c.nativeSetLocalDescriptionAutomatically(czyi0);
        }
    }
}

