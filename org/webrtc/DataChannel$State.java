package org.webrtc;

public enum DataChannel.State {
    CONNECTING,
    OPEN,
    CLOSING,
    CLOSED;

    static DataChannel.State fromNativeIndex(int v) {
        return DataChannel.State.values()[v];
    }
}

