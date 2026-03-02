import java.util.Arrays;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.IceCandidateErrorEvent;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection.IceConnectionState;
import org.webrtc.PeerConnection.IceGatheringState;
import org.webrtc.PeerConnection.Observer;
import org.webrtc.PeerConnection.PeerConnectionState;
import org.webrtc.PeerConnection.SignalingState;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;

public class czyq implements PeerConnection.Observer {
    @Override  // org.webrtc.PeerConnection$Observer
    public final void onAddStream(MediaStream mediaStream0) {
        czkq.a.c().p("PeerConnection.Observer.onAddStream should not be called.", new Object[0]);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onAddTrack(RtpReceiver rtpReceiver0, MediaStream[] arr_mediaStream) {
        czkq.a.c().p("PeerConnection.Observer.onAddTrack should not be called.", new Object[0]);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState peerConnection$PeerConnectionState0) {
        czkq.a.b().h("PeerConnection.Observer.onConnectionChange %s.", peerConnection$PeerConnectionState0);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public void onDataChannel(DataChannel dataChannel0) {
        czkq.a.b().h("PeerConnection.Observer.onDataChannel %s.", dataChannel0.b());
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public void onIceCandidate(IceCandidate iceCandidate0) {
        czkq.a.b().h("PeerConnection.Observer.onIceCandidate %s.", iceCandidate0);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent0) {
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onIceCandidatesRemoved(IceCandidate[] arr_iceCandidate) {
        czkq.a.b().h("PeerConnection.Observer.onIceCandidatesRemoved %s.", Arrays.toString(arr_iceCandidate));
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onIceConnectionChange(PeerConnection.IceConnectionState peerConnection$IceConnectionState0) {
        czkq.a.b().h("PeerConnection.Observer.onIceConnectionChange %s.", peerConnection$IceConnectionState0);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onIceConnectionReceivingChange(boolean z) {
        czkq.a.b().h("PeerConnection.Observer.onIceConnectionReceiveChange %s.", Boolean.valueOf(z));
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onIceGatheringChange(PeerConnection.IceGatheringState peerConnection$IceGatheringState0) {
        czkq.a.b().h("PeerConnection.Observer.onIceGatheringChange %s.", peerConnection$IceGatheringState0);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onRemoveStream(MediaStream mediaStream0) {
        czkq.a.c().p("PeerConnection.Observer.onRemoveStream should not be called.", new Object[0]);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onRemoveTrack(RtpReceiver rtpReceiver0) {
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public void onRenegotiationNeeded() {
        czkq.a.b().p("PeerConnection.Observer.onRenegotiationNeeded.", new Object[0]);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent0) {
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onSignalingChange(PeerConnection.SignalingState peerConnection$SignalingState0) {
        czkq.a.b().h("PeerConnection.Observer.onSignalingChange %s.", peerConnection$SignalingState0);
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState peerConnection$IceConnectionState0) {
    }

    @Override  // org.webrtc.PeerConnection$Observer
    public final void onTrack(RtpTransceiver rtpTransceiver0) {
        czkq.a.c().p("PeerConnection.Observer.onTrack should not be called.", new Object[0]);
        rtpTransceiver0.a();
        RtpTransceiver.nativeStopInternal(rtpTransceiver0.a);
    }
}

