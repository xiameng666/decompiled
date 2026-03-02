public final class armc implements Runnable {
    public final armd a;

    public armc(armd armd0) {
        this.a = armd0;
    }

    @Override
    public final void run() {
        batl.l(((boolean)(this.a.e ^ 1)));
        this.a.e = true;
        armf.a.m("Something bad happened. Sending error over the wire.", new Object[0]);
        this.a.c.a(2);
    }
}

