import org.webrtc.MediaConstraints;

public final class czxo implements Runnable {
    public final czyb a;
    public final gmcu b;

    public czxo(czyb czyb0, gmcu gmcu0) {
        this.a = czyb0;
        this.b = gmcu0;
    }

    @Override
    public final void run() {
        czxt czxt0 = new czxt(this.a, this.b);
        MediaConstraints mediaConstraints0 = new MediaConstraints();
        this.a.d.nativeCreateOffer(czxt0, mediaConstraints0);
    }
}

