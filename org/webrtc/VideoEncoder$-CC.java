package org.webrtc;

public final class VideoEncoder.-CC {
    public static long $default$createNative(VideoEncoder videoEncoder0, long v) {
        return 0L;
    }

    public static VideoEncoder.EncoderInfo $default$getEncoderInfo(VideoEncoder videoEncoder0) {
        return new VideoEncoder.EncoderInfo();
    }

    public static VideoEncoder.ResolutionBitrateLimits[] $default$getResolutionBitrateLimits(VideoEncoder videoEncoder0) {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    public static boolean $default$isHardwareEncoder(VideoEncoder videoEncoder0) {
        return true;
    }

    public static VideoCodecStatus $default$setRates(VideoEncoder videoEncoder0, VideoEncoder.RateControlParameters videoEncoder$RateControlParameters0) {
        return videoEncoder0.a();
    }
}

