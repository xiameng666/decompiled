import org.webrtc.PeerConnection.PeerConnectionState;

public final class czxx implements Runnable {
    public final czxy a;
    public final PeerConnection.PeerConnectionState b;

    public czxx(czxy czxy0, PeerConnection.PeerConnectionState peerConnection$PeerConnectionState0) {
        this.a = czxy0;
        this.b = peerConnection$PeerConnectionState0;
    }

    @Override
    public final void run() {
        this.a.a.h(this.b);
    }
}

