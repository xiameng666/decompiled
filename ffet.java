public final class ffet implements Runnable {
    public final ffew a;
    public final String b;

    public ffet(ffew ffew0, String s) {
        this.a = ffew0;
        this.b = s;
    }

    @Override
    public final void run() {
        ffmn.d("TrustedPeersService", "Trusted peers processed for node %s, maybe delivering app archives", new Object[]{this.b});
        this.a.l.add(this.b);
        ((fdvl)this.a.g.get()).L(this.b, "trusted peers processed");
    }
}

