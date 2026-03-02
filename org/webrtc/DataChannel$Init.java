package org.webrtc;

public class DataChannel.Init {
    public final String a;

    public DataChannel.Init() {
        this.a = "";
    }

    int getId() {
        return -1;
    }

    int getMaxRetransmitTimeMs() {
        return -1;
    }

    int getMaxRetransmits() {
        return -1;
    }

    boolean getNegotiated() {
        return false;
    }

    boolean getOrdered() {
        return true;
    }

    String getProtocol() {
        return this.a;
    }
}

