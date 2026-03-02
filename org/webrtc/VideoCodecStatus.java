package org.webrtc;

public enum VideoCodecStatus {
    TARGET_BITRATE_OVERSHOOT(5),
    REQUEST_SLI(2),
    NO_OUTPUT(1),
    OK(0),
    ERROR(-1),
    LEVEL_EXCEEDED(-2),
    MEMORY(-3),
    ERR_PARAMETER(-4),
    ERR_SIZE(-5),
    TIMEOUT(-6),
    UNINITIALIZED(-7),
    ERR_REQUEST_SLI(-12),
    FALLBACK_SOFTWARE(-13);

    private final int o;

    private VideoCodecStatus(int v1) {
        this.o = v1;
    }

    public int getNumber() {
        return this.o;
    }
}

