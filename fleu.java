public final class fleu implements Runnable {
    public final flfv a;
    public final fltw b;

    public fleu(flfv flfv0, fltw fltw0) {
        this.a = flfv0;
        this.b = fltw0;
    }

    @Override
    public final void run() {
        flit flit0 = (flit)this.a.f;
        flim flim0 = new flim(flit0, this.b.e);
        flit0.m.post(flim0);
    }
}

