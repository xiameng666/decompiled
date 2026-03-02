public final class apy implements Runnable {
    public final aqa a;

    public apy(aqa aqa0) {
        this.a = aqa0;
    }

    @Override
    public final void run() {
        aqa aqa0 = this.a;
        if(aqa0.b.getAndSet(true)) {
            return;
        }
        apz apz0 = new apz(aqa0);
        aqa0.c.b.c.execute(apz0);
    }
}

