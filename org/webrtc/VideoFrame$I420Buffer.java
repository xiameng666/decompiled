package org.webrtc;

import java.nio.ByteBuffer;

public interface VideoFrame.I420Buffer extends VideoFrame.Buffer {
    ByteBuffer getDataU();

    ByteBuffer getDataV();

    ByteBuffer getDataY();

    int getStrideU();

    int getStrideV();

    int getStrideY();
}

