import j..util.Objects;

final class gyeh extends gxum {
    final gyel a;

    public gyeh(gyel gyel0) {
        Objects.requireNonNull(gyel0);
        this.a = gyel0;
        super("ScreenOnFromDisplayObserver");
    }

    @Override
    public final void run() {
        this.a.h = true;
        this.a.d();
    }
}

