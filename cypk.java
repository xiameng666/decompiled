public final class cypk implements Runnable {
    public final cypu a;
    public final Runnable b;

    public cypk(cypu cypu0, Runnable runnable0) {
        this.a = cypu0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        ggtj ggtj0 = (ggtj)this.a.u.d().ar(8004);
        String s = this.a.c.b();
        ggtj0.B("SwitchUiHandler: The user tapped revert on the other seeker for %s", gxyf.b(gxye.a, s));
        cxyx cxyx0 = new cxyx();
        this.a.g.j("logSwitchBackByOtherDevice", cxyx0);
        this.b.run();
        this.a.k();
    }
}

