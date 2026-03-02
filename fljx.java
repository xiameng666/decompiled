public final class fljx implements Runnable {
    public final fljy a;

    public fljx(fljy fljy0) {
        this.a = fljy0;
    }

    @Override
    public final void run() {
        fljy fljy0 = this.a;
        int v = fljy0.d == 3 ? 3 : fljy0.c;
        for(Object object0: fljy0.a) {
            ((flcd)object0).a(v);
        }
        fljy0.b.set(false);
    }
}

