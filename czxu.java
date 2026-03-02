import j..util.Objects;
import org.webrtc.SessionDescription;

final class czxu extends czyr {
    final gmcu a;
    final czyb b;

    public czxu(czyb czyb0, gmcu gmcu0) {
        this.a = gmcu0;
        Objects.requireNonNull(czyb0);
        this.b = czyb0;
        super();
    }

    @Override  // czyr
    public final void onCreateFailure(String s) {
        super.onCreateFailure(s);
        czyu czyu0 = new czyu(s);
        this.a.r(czyu0);
    }

    @Override  // czyr
    public final void onCreateSuccess(SessionDescription sessionDescription0) {
        super.onCreateSuccess(sessionDescription0);
        if(this.b.j(czya.e, czya.f)) {
            this.a.q(sessionDescription0);
            return;
        }
        czyu czyu0 = new czyu("Invalid state transition to WAITING_TO_CONNECT.");
        this.a.r(czyu0);
    }
}

