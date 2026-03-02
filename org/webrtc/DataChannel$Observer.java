package org.webrtc;

public interface DataChannel.Observer {
    void onBufferedAmountChange(long arg1);

    void onMessage(DataChannel.Buffer arg1);

    void onStateChange();
}

