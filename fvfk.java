public final class fvfk implements Runnable {
    public final fvfm a;
    public final fvfn b;
    public final fvew c;

    public fvfk(fvfm fvfm0, fvfn fvfn0, fvew fvew0) {
        this.a = fvfm0;
        this.b = fvfn0;
        this.c = fvew0;
    }

    @Override
    public final void run() {
        this.a.h = this.b;
        this.a.g = this.c;
        this.a.e(this.b);
        this.a.h();
    }
}

