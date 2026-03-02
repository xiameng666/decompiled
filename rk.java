final class rk implements Runnable {
    final rl a;

    public rk(rl rl0) {
        this.a = rl0;
        super();
    }

    @Override
    public final void run() {
        this.a.b = null;
        this.a.drawableStateChanged();
    }
}

