import j..util.Objects;

final class erqo implements Runnable {
    final erqq a;

    public erqo(erqq erqq0) {
        Objects.requireNonNull(erqq0);
        this.a = erqq0;
        super();
    }

    @Override
    public final void run() {
        erqq erqq0 = this.a;
        synchronized(erqq0) {
            if(!erqq0.d()) {
                return;
            }
            erqq0.c.startScan();
            erqq0.a.postDelayed(erqq0.b, 5000L);
        }
    }
}

