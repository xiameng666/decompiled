import org.webrtc.SessionDescription;

public final class czxr implements Runnable {
    public final czyb a;
    public final gmcu b;
    public final SessionDescription c;

    public czxr(czyb czyb0, gmcu gmcu0, SessionDescription sessionDescription0) {
        this.a = czyb0;
        this.b = gmcu0;
        this.c = sessionDescription0;
    }

    @Override
    public final void run() {
        czxw czxw0 = new czxw(this.a, this.b, this.c);
        this.a.d.nativeSetRemoteDescription(czxw0, this.c);
    }
}

