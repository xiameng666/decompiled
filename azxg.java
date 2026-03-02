import j..util.Objects;

final class azxg implements Runnable {
    final azxh a;

    public azxg(azxh azxh0) {
        Objects.requireNonNull(azxh0);
        this.a = azxh0;
        super();
    }

    @Override
    public final void run() {
        String s = this.a.a.b.getClass().getName() + " disconnecting because it was signed out.";
        this.a.a.b.y(s);
    }
}

