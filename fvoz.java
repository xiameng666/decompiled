public final class fvoz implements Runnable {
    public final fvpk a;

    public fvoz(fvpk fvpk0) {
        this.a = fvpk0;
    }

    @Override
    public final void run() {
        ++this.a.k.g;
        this.a.k.c();
    }
}

