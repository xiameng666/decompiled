import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection.AdapterType;
import org.webrtc.PeerConnection.PeerConnectionState;

final class czxy extends czyq {
    final czyb a;

    public czxy(czyb czyb0) {
        Objects.requireNonNull(czyb0);
        this.a = czyb0;
        super();
    }

    @Override  // czyq
    public final void onConnectionChange(PeerConnection.PeerConnectionState peerConnection$PeerConnectionState0) {
        super.onConnectionChange(peerConnection$PeerConnectionState0);
        czxx czxx0 = new czxx(this, peerConnection$PeerConnectionState0);
        this.a.h.execute(czxx0);
    }

    @Override  // czyq
    public final void onDataChannel(DataChannel dataChannel0) {
        super.onDataChannel(dataChannel0);
        this.a.i(dataChannel0);
    }

    @Override  // czyq
    public final void onIceCandidate(IceCandidate iceCandidate0) {
        super.onIceCandidate(iceCandidate0);
        this.a.f.a(iceCandidate0);
    }

    @Override  // czyq
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent0) {
        czkq.a.b().h("PeerConnection.Observer.onSelectedCandidatePairChanged reason: %s", candidatePairChangeEvent0.c);
        czkq.a.b().h("PeerConnection.Observer.onSelectedCandidatePairChanged local: %s", candidatePairChangeEvent0.a);
        czkq.a.b().h("PeerConnection.Observer.onSelectedCandidatePairChanged remote: %s", candidatePairChangeEvent0.b);
        AtomicReference atomicReference0 = this.a.e;
        atomicReference0.set(candidatePairChangeEvent0.a.e);
        czno czno0 = this.a.i;
        if(czno0 != null) {
            PeerConnection.AdapterType peerConnection$AdapterType0 = (PeerConnection.AdapterType)atomicReference0.get();
            czno0.e = peerConnection$AdapterType0 == PeerConnection.AdapterType.d || peerConnection$AdapterType0 == PeerConnection.AdapterType.h || peerConnection$AdapterType0 == PeerConnection.AdapterType.i || peerConnection$AdapterType0 == PeerConnection.AdapterType.j || peerConnection$AdapterType0 == PeerConnection.AdapterType.k;
        }
    }
}

