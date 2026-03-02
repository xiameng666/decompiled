package org.webrtc;

public class VideoEncoder.RateControlParameters {
    public final VideoEncoder.BitrateAllocation a;
    public final double b;

    public VideoEncoder.RateControlParameters(VideoEncoder.BitrateAllocation videoEncoder$BitrateAllocation0, double f) {
        this.a = videoEncoder$BitrateAllocation0;
        this.b = f;
    }
}

