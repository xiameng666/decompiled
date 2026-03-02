import j..util.Objects;

final class erkt implements Runnable {
    final erky a;

    public erkt(erky erky0) {
        Objects.requireNonNull(erky0);
        this.a = erky0;
        super();
    }

    @Override
    public final void run() {
        this.a.C();
        this.a.b.l();
        this.a.d.b(this.a.getString(0x7F1508A1));  // string:common_no_devices_found "No devices found"
        this.a.y(false);
        this.a.ag.f(0);
    }
}

