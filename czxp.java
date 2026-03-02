import org.webrtc.DataChannel.Init;
import org.webrtc.DataChannel;

public final class czxp implements Runnable {
    public final czyb a;
    public final jqt b;

    public czxp(czyb czyb0, jqt jqt0) {
        this.a = czyb0;
        this.b = jqt0;
    }

    @Override
    public final void run() {
        DataChannel.Init dataChannel$Init0 = new DataChannel.Init();
        DataChannel dataChannel0 = this.a.d.nativeCreateDataChannel("dataChannel", dataChannel$Init0);
        this.b.b(dataChannel0);
    }
}

