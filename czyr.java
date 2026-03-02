import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

public class czyr implements SdpObserver {
    @Override  // org.webrtc.SdpObserver
    public void onCreateFailure(String s) {
        czkq.a.e().h("SdpObserver.onCreateFailure %s.", s);
    }

    @Override  // org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sessionDescription0) {
        czkq.a.b().h("SdpObserver.onCreateSuccess %s.", sessionDescription0.a);
    }

    @Override  // org.webrtc.SdpObserver
    public void onSetFailure(String s) {
        czkq.a.e().h("SdpObserver.onSetFailure %s.", s);
    }

    @Override  // org.webrtc.SdpObserver
    public void onSetSuccess() {
        czkq.a.b().p("SdpObserver.onSetSuccess.", new Object[0]);
    }
}

