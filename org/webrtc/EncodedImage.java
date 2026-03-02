package org.webrtc;

import igsq;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class EncodedImage implements RefCounted {
    public final ByteBuffer a;
    public final int b;
    public final int c;
    public final long d;
    public final EncodedImage.FrameType e;
    public final int f;
    public final Integer g;
    private final igsq h;

    private EncodedImage(ByteBuffer byteBuffer0, Runnable runnable0, int v, int v1, long v2, EncodedImage.FrameType encodedImage$FrameType0, int v3, Integer integer0) {
        this.a = byteBuffer0;
        this.b = v;
        this.c = v1;
        TimeUnit.NANOSECONDS.toMillis(v2);
        this.d = v2;
        this.e = encodedImage$FrameType0;
        this.f = v3;
        this.g = integer0;
        this.h = new igsq(runnable0);
    }

    private ByteBuffer getBuffer() {
        return this.a;
    }

    private long getCaptureTimeNs() {
        return this.d;
    }

    private int getEncodedHeight() {
        return this.c;
    }

    private int getEncodedWidth() {
        return this.b;
    }

    private int getFrameType() {
        return this.e.d;
    }

    private Integer getQp() {
        return this.g;
    }

    private int getRotation() {
        return this.f;
    }

    @Override  // org.webrtc.RefCounted
    public final void release() {
        this.h.release();
    }

    @Override  // org.webrtc.RefCounted
    public final void retain() {
        this.h.retain();
    }
}

