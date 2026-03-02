public final class kym implements Runnable {
    public final kys a;
    public final bycz b;
    public final bycm c;

    public kym(bycm bycm0, kys kys0, bycz bycz0) {
        this.c = bycm0;
        this.a = kys0;
        this.b = bycz0;
    }

    @Override
    public final void run() {
        kyq kyq0 = (kyq)this.c.b.get();
        if(kyq0 == null) {
            return;
        }
        kyo kyo0 = new kyo(this.b);
        kyq0.a(this.a, kyo0);
    }
}

