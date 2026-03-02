import j..util.Objects;

final class gyef extends gxum {
    final gyfy a;
    final int b;

    public gyef(gyfy gyfy0, int v) {
        this.b = v;
        Objects.requireNonNull(gyfy0);
        this.a = gyfy0;
        super("BackgroundBleScanner_onScanModeUpdate");
    }

    @Override
    public final void run() {
        this.a.a.k(this.a.a.p, this.b);
    }
}

