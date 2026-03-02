package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaStream {
    public final List a;
    public final List b;
    public final List c;
    public long d;

    public MediaStream(long v) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = v;
    }

    public final void a() {
        if(this.d != 0L) {
            return;
        }
        throw new IllegalStateException("MediaStream has been disposed.");
    }

    void addNativeAudioTrack(long v) {
        AudioTrack audioTrack0 = new AudioTrack(v);
        this.a.add(audioTrack0);
    }

    void addNativeVideoTrack(long v) {
        VideoTrack videoTrack0 = new VideoTrack(v);
        this.b.add(videoTrack0);
    }

    public final void b(VideoTrack videoTrack0) {
        this.a();
        this.b.remove(videoTrack0);
        this.c.remove(videoTrack0);
        MediaStream.nativeRemoveVideoTrack(this.d, videoTrack0.a());
    }

    private static void c(List list0, long v) {
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            MediaStreamTrack mediaStreamTrack0 = (MediaStreamTrack)object0;
            if(mediaStreamTrack0.a() == v) {
                mediaStreamTrack0.c();
                iterator0.remove();
                return;
            }
        }
        Logging.b("MediaStream", "Couldn\'t not find track");
    }

    public void dispose() {
        this.a();
        while(true) {
            List list0 = this.a;
            if(list0.isEmpty()) {
                break;
            }
            AudioTrack audioTrack0 = (AudioTrack)list0.get(0);
            this.a();
            list0.remove(audioTrack0);
            MediaStream.nativeRemoveAudioTrack(this.d, audioTrack0.a());
            audioTrack0.c();
        }
        while(true) {
            List list1 = this.b;
            if(list1.isEmpty()) {
                break;
            }
            VideoTrack videoTrack0 = (VideoTrack)list1.get(0);
            this.b(videoTrack0);
            videoTrack0.c();
        }
        while(true) {
            List list2 = this.c;
            if(list2.isEmpty()) {
                break;
            }
            this.b(((VideoTrack)list2.get(0)));
        }
        JniCommon.nativeReleaseRef(this.d);
        this.d = 0L;
    }

    private static native String nativeGetId(long arg0) {
    }

    private static native boolean nativeRemoveAudioTrack(long arg0, long arg1) {
    }

    private static native boolean nativeRemoveVideoTrack(long arg0, long arg1) {
    }

    void removeAudioTrack(long v) {
        MediaStream.c(this.a, v);
    }

    void removeVideoTrack(long v) {
        MediaStream.c(this.b, v);
    }

    @Override
    public final String toString() {
        this.a();
        return "[" + MediaStream.nativeGetId(this.d) + ":A=" + this.a.size() + ":V=" + this.b.size() + "]";
    }
}

