import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection.AdapterType;
import org.webrtc.PeerConnection.PeerConnectionState;

final class czym extends czyq {
    final czyo a;

    public czym(czyo czyo0) {
        Objects.requireNonNull(czyo0);
        this.a = czyo0;
        super();
    }

    @Override  // czyq
    public final void onConnectionChange(PeerConnection.PeerConnectionState peerConnection$PeerConnectionState0) {
        super.onConnectionChange(peerConnection$PeerConnectionState0);
        czyk czyk0 = new czyk(this, peerConnection$PeerConnectionState0);
        this.a.i.execute(czyk0);
    }

    @Override  // czyq
    public final void onDataChannel(DataChannel dataChannel0) {
        super.onDataChannel(dataChannel0);
        this.a.h(dataChannel0);
    }

    @Override  // czyq
    public final void onIceCandidate(IceCandidate iceCandidate0) {
        super.onIceCandidate(iceCandidate0);
        this.a.f.a(iceCandidate0);
    }

    @Override  // czyq
    public final void onRenegotiationNeeded() {
        czkq.a.b().p("PeerConnection.Observer.onRenegotiationNeeded.", new Object[0]);
        this.a.d = true;
        czkq.a.b().p("Processing WebRTC onRenegotiationNeeded, setting local description", new Object[0]);
        czyl czyl0 = new czyl(this);
        this.a.c.nativeSetLocalDescriptionAutomatically(czyl0);
    }

    @Override  // czyq
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent0) {
        czkq.a.b().h("PeerConnection.Observer.onSelectedCandidatePairChanged reason: %s", candidatePairChangeEvent0.c);
        czkq.a.b().h("PeerConnection.Observer.onSelectedCandidatePairChanged local: %s", candidatePairChangeEvent0.a);
        czkq.a.b().h("PeerConnection.Observer.onSelectedCandidatePairChanged remote: %s", candidatePairChangeEvent0.b);
        AtomicReference atomicReference0 = this.a.e;
        atomicReference0.set(candidatePairChangeEvent0.a.e);
        czos czos0 = this.a.j;
        if(czos0 != null) {
            PeerConnection.AdapterType peerConnection$AdapterType0 = (PeerConnection.AdapterType)atomicReference0.get();
            czos0.e = peerConnection$AdapterType0 == PeerConnection.AdapterType.d || peerConnection$AdapterType0 == PeerConnection.AdapterType.h || peerConnection$AdapterType0 == PeerConnection.AdapterType.i || peerConnection$AdapterType0 == PeerConnection.AdapterType.j || peerConnection$AdapterType0 == PeerConnection.AdapterType.k;
        }
    }
}

