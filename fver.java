public final class fver implements Runnable {
    public final fvev a;
    public final cmpj b;

    public fver(fvev fvev0, cmpj cmpj0) {
        this.a = fvev0;
        this.b = cmpj0;
    }

    @Override
    public final void run() {
        this.a.d.add(this.b);
    }
}

