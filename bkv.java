public final class bkv implements Runnable {
    public final bkz a;
    public final bkx b;
    public final bkx c;

    public bkv(bkz bkz0, bkx bkx0, bkx bkx1) {
        this.a = bkz0;
        this.b = bkx0;
        this.c = bkx1;
    }

    @Override
    public final void run() {
        bkz bkz0 = this.a;
        bkx bkx0 = this.b;
        if(bkx0 != null) {
            bkz0.a.j(bkx0);
        }
        bkz0.a.ih(this.c);
    }
}

