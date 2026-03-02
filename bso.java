public final class bso implements Runnable {
    public final bsr a;

    public bso(bsr bsr0) {
        this.a = bsr0;
    }

    @Override
    public final void run() {
        bsr bsr0 = this.a;
        bsv bsv0 = bsr0.q;
        if(bsv0 != null) {
            bsv0.b();
        }
        if(bsr0.p == null) {
            bsr0.o.d();
        }
        bsr0.p = null;
    }
}

