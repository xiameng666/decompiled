import org.webrtc.SessionDescription;

public final class czyc implements Runnable {
    public final czyo a;
    public final SessionDescription b;

    public czyc(czyo czyo0, SessionDescription sessionDescription0) {
        this.a = czyo0;
        this.b = sessionDescription0;
    }

    @Override
    public final void run() {
        czyj czyj0 = new czyj(this.a, this.b);
        this.a.c.nativeSetRemoteDescription(czyj0, this.b);
    }
}

