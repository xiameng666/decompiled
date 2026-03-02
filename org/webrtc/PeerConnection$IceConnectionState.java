package org.webrtc;

public enum PeerConnection.IceConnectionState {
    NEW,
    CHECKING,
    CONNECTED,
    COMPLETED,
    FAILED,
    DISCONNECTED,
    CLOSED;

    static PeerConnection.IceConnectionState fromNativeIndex(int v) {
        return PeerConnection.IceConnectionState.values()[v];
    }
}

