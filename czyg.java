import org.webrtc.DataChannel.Init;
import org.webrtc.DataChannel;

public final class czyg implements Runnable {
    public final czyo a;
    public final jqt b;

    public czyg(czyo czyo0, jqt jqt0) {
        this.a = czyo0;
        this.b = jqt0;
    }

    @Override
    public final void run() {
        DataChannel.Init dataChannel$Init0 = new DataChannel.Init();
        DataChannel dataChannel0 = this.a.c.nativeCreateDataChannel("dataChannel", dataChannel$Init0);
        this.b.b(dataChannel0);
    }
}

