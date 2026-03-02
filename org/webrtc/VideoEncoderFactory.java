package org.webrtc;

public interface VideoEncoderFactory {
    VideoEncoder createEncoder(VideoCodecInfo arg1);

    VideoEncoderFactory.VideoEncoderSelector getEncoderSelector();

    VideoCodecInfo[] getImplementations();

    VideoCodecInfo[] getSupportedCodecs();
}

