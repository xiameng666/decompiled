public final class fwzg implements Runnable {
    public final fwzh a;
    public final fvtd b;
    public final int c;

    public fwzg(fwzh fwzh0, fvtd fvtd0, int v) {
        this.a = fwzh0;
        this.b = fvtd0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.b.a(this.b, this.c);
    }
}

