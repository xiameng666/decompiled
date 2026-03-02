package org.webrtc;

public interface PeerConnection.Observer {
    void onAddStream(MediaStream arg1);

    void onAddTrack(RtpReceiver arg1, MediaStream[] arg2);

    void onConnectionChange(PeerConnection.PeerConnectionState arg1);

    void onDataChannel(DataChannel arg1);

    void onIceCandidate(IceCandidate arg1);

    void onIceCandidateError(IceCandidateErrorEvent arg1);

    void onIceCandidatesRemoved(IceCandidate[] arg1);

    void onIceConnectionChange(PeerConnection.IceConnectionState arg1);

    void onIceConnectionReceivingChange(boolean arg1);

    void onIceGatheringChange(PeerConnection.IceGatheringState arg1);

    void onRemoveStream(MediaStream arg1);

    void onRemoveTrack(RtpReceiver arg1);

    void onRenegotiationNeeded();

    void onSelectedCandidatePairChanged(CandidatePairChangeEvent arg1);

    void onSignalingChange(PeerConnection.SignalingState arg1);

    void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState arg1);

    void onTrack(RtpTransceiver arg1);
}

