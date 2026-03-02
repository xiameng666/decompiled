import j..util.Objects;

final class gyee extends gxum {
    final String a;
    final gyfy b;

    public gyee(gyfy gyfy0, String s) {
        this.a = s;
        Objects.requireNonNull(gyfy0);
        this.b = gyfy0;
        super("BackgroundBleScanner_onDeviceLost");
    }

    @Override
    public final void run() {
        gyel gyel0 = this.b.a;
        if(gyel0.h()) {
            for(Object object0: gyel0.e.keySet()) {
                ((gyej)object0).c(this.a);
            }
        }
    }
}

