package org.webrtc;

public enum PeerConnection.PeerConnectionState {
    NEW,
    CONNECTING,
    CONNECTED,
    DISCONNECTED,
    FAILED,
    CLOSED;

    static PeerConnection.PeerConnectionState fromNativeIndex(int v) {
        return PeerConnection.PeerConnectionState.values()[v];
    }
}

