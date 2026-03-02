import j..util.Objects;
import org.webrtc.SessionDescription;

final class czxt extends czyr {
    final gmcu a;
    final czyb b;

    public czxt(czyb czyb0, gmcu gmcu0) {
        this.a = gmcu0;
        Objects.requireNonNull(czyb0);
        this.b = czyb0;
        super();
    }

    @Override  // czyr
    public final void onCreateFailure(String s) {
        super.onCreateFailure(s);
        czke.t(this.b.c, 4, gymt.f, gymd.bQ, s);
        czyu czyu0 = new czyu(s);
        this.a.r(czyu0);
    }

    @Override  // czyr
    public final void onCreateSuccess(SessionDescription sessionDescription0) {
        super.onCreateSuccess(sessionDescription0);
        czyb czyb0 = this.b;
        if(czyb0.j(czya.b, czya.c)) {
            this.a.q(sessionDescription0);
            return;
        }
        czke.s(czyb0.c, 4, gymt.f, gymd.bO);
        czyu czyu0 = new czyu("Invalid state transition to WAITING_FOR_ANSWER.");
        this.a.r(czyu0);
    }
}

