public final class eidv implements Runnable {
    public final eiea a;

    public eidv(eiea eiea0) {
        this.a = eiea0;
    }

    @Override
    public final void run() {
        this.a.b.addOnSubscriptionsChangedListener(this.a.c, this.a.d);
    }
}

