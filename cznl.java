public final class cznl implements Runnable {
    public final cznm a;
    public final czze b;

    public cznl(cznm cznm0, czze czze0) {
        this.a = cznm0;
        this.b = czze0;
    }

    @Override
    public final void run() {
        this.a.a.c(this.b);
    }
}

