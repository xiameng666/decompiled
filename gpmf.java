public final class gpmf implements Runnable {
    public final gpmh a;
    public final iapk b;
    public final iaof_metadata c;

    public gpmf(gpmh gpmh0, iapk iapk0, iaof_metadata iaof0) {
        this.a = gpmh0;
        this.b = iapk0;
        this.c = iaof0;
    }

    @Override
    public final void run() {
        this.a.a.a(this.b, this.c);
    }
}

