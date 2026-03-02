import j..util.Objects;

public final class avi implements Runnable {
    public final avp a;
    public final avp b;

    public avi(avp avp0, avp avp1) {
        this.a = avp0;
        this.b = avp1;
    }

    @Override
    public final void run() {
        Objects.requireNonNull(this.a.e);
        this.a.e.d(this.b);
    }
}

