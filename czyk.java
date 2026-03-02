import org.webrtc.PeerConnection.PeerConnectionState;

public final class czyk implements Runnable {
    public final czym a;
    public final PeerConnection.PeerConnectionState b;

    public czyk(czym czym0, PeerConnection.PeerConnectionState peerConnection$PeerConnectionState0) {
        this.a = czym0;
        this.b = peerConnection$PeerConnectionState0;
    }

    @Override
    public final void run() {
        this.a.a.d(this.b);
    }
}

