import j..util.Objects;

final class gyei extends gxum {
    final gyel a;

    public gyei(gyel gyel0) {
        Objects.requireNonNull(gyel0);
        this.a = gyel0;
        super("ScreenOffFromDisplayObserver");
    }

    @Override
    public final void run() {
        this.a.h = false;
        this.a.d();
    }
}

