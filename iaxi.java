public final class iaxi implements Runnable {
    public final iaxm a;
    public final iaxh b;

    public iaxi(iaxm iaxm0, iaxh iaxh0) {
        this.a = iaxm0;
        this.b = iaxh0;
    }

    @Override
    public final void run() {
        iaor iaor0 = new iaor();
        iaor0.a = iapm.b(this.b.a);
        iaos iaos0 = iaor0.a();
        this.a.a.a(iaos0);
    }
}

