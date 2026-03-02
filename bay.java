public final class bay implements Runnable {
    public final bdm a;
    public final bdm b;

    public bay(bdm bdm0, bdm bdm1) {
        this.a = bdm0;
        this.b = bdm1;
    }

    @Override
    public final void run() {
        this.a.k();
        bdm bdm0 = this.b;
        if(bdm0 != null) {
            bdm0.k();
        }
    }
}

