public final class fwul implements Runnable {
    public final boolean a;
    public final fwxu b;
    public final int c;

    public fwul(boolean z, fwxu fwxu0, int v) {
        this.a = z;
        this.b = fwxu0;
        this.c = v;
    }

    @Override
    public final void run() {
        if(this.a) {
            this.b.a(((long)this.c));
        }
    }
}

