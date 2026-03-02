package org.webrtc;

import java.util.IdentityHashMap;

public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap a;

    public VideoTrack(long v) {
        super(v);
        this.a = new IdentityHashMap();
    }

    @Override  // org.webrtc.MediaStreamTrack
    public final void c() {
        IdentityHashMap identityHashMap0 = this.a;
        for(Object object0: identityHashMap0.values()) {
            long v = (long)(((Long)object0));
            VideoTrack.nativeRemoveSink(this.a(), v);
            VideoTrack.nativeFreeSink(v);
        }
        identityHashMap0.clear();
        super.c();
    }

    private static native void nativeFreeSink(long arg0) {
    }

    private static native void nativeRemoveSink(long arg0, long arg1) {
    }
}

