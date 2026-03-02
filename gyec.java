import j..util.Objects;

final class gyec extends gxum {
    final gyel a;

    public gyec(gyel gyel0) {
        Objects.requireNonNull(gyel0);
        this.a = gyel0;
        super("BackgroundBleScanner_stopScanBurst");
    }

    @Override
    public final void run() {
        this.a.h = false;
        this.a.d();
    }
}

