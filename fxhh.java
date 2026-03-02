public final class fxhh implements Runnable {
    public final fxhj a;

    public fxhh(fxhj fxhj0) {
        this.a = fxhj0;
    }

    @Override
    public final void run() {
        fxhj fxhj0 = this.a;
        long v = huwd.m() * 1000L - (System.currentTimeMillis() - ((long)fxhj0.a()));
        if(v <= 0L) {
            fxhj0.b = false;
            fxhj0.i.a();
            return;
        }
        fxhj0.c(Math.abs(v));
    }
}

