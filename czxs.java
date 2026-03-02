import org.webrtc.SessionDescription;

public final class czxs implements Runnable {
    public final czyb a;
    public final gmcu b;
    public final SessionDescription c;

    public czxs(czyb czyb0, gmcu gmcu0, SessionDescription sessionDescription0) {
        this.a = czyb0;
        this.b = gmcu0;
        this.c = sessionDescription0;
    }

    @Override
    public final void run() {
        czxv czxv0 = new czxv(this.a, this.b, this.c);
        this.a.d.nativeSetLocalDescription(czxv0, this.c);
    }
}

