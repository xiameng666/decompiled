import j..util.Objects;

final class erkr implements Runnable {
    final erky a;

    public erkr(erky erky0) {
        Objects.requireNonNull(erky0);
        this.a = erky0;
        super();
    }

    @Override
    public final void run() {
        erky erky0 = this.a;
        if(erky0.al) {
            erky0.y(false);
            erky0.C();
        }
        else {
            erky0.y(true);
            erky0.A();
        }
        erky0.c.postDelayed(erky0.am, 5000L);
    }
}

