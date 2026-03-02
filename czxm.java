import org.webrtc.MediaConstraints;

public final class czxm implements Runnable {
    public final czyb a;
    public final gmcu b;

    public czxm(czyb czyb0, gmcu gmcu0) {
        this.a = czyb0;
        this.b = gmcu0;
    }

    @Override
    public final void run() {
        czxu czxu0 = new czxu(this.a, this.b);
        MediaConstraints mediaConstraints0 = new MediaConstraints();
        this.a.d.nativeCreateAnswer(czxu0, mediaConstraints0);
    }
}

