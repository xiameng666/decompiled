import j..util.Map.-EL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.webrtc.PeerConnection.PeerConnectionState;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;

final class czyz implements Runnable, RTCStatsCollectorCallback {
    public final Set a;
    private final PeerConnection b;
    private final Boolean c;
    private final String[] d;
    private boolean e;

    public czyz(PeerConnection peerConnection0, Boolean boolean0) {
        String[] arr_s = {"candidate-pair"};
        this.d = arr_s;
        this.a = new HashSet(Arrays.asList(arr_s));
        this.b = peerConnection0;
        this.c = boolean0;
    }

    public final void a() {
        this.e = true;
    }

    @Override  // org.webrtc.RTCStatsCollectorCallback
    public final void onStatsDelivered(RTCStatsReport rTCStatsReport0) {
        czyy czyy0 = new czyy(this);
        Map.-EL.forEach(rTCStatsReport0.a, czyy0);
    }

    @Override
    public final void run() {
        if(this.e) {
            return;
        }
        PeerConnection peerConnection0 = this.b;
        if(peerConnection0.nativeConnectionState() != PeerConnection.PeerConnectionState.c && peerConnection0.nativeConnectionState() != PeerConnection.PeerConnectionState.b) {
            czkq.a.e().h("%s PeerConnectionState is not CONNECTED or CONNECTING, can not get stats.", "[RTCStatsReport]");
            return;
        }
        peerConnection0.nativeNewGetStats(this);
    }
}

