import j..util.Objects;

final class iawk implements Runnable {
    final ibbr a;

    public iawk(iawo iawo0, ibbr ibbr0) {
        this.a = ibbr0;
        Objects.requireNonNull(iawo0);
        super();
    }

    @Override
    public final void run() {
        gftb.r(((ibai)this.a).a.C.get(), "Channel must have been shut down");
        ((ibai)this.a).a.E = true;
        ((ibai)this.a).a.s(false);
        ((ibai)this.a).a.p();
        ((ibai)this.a).a.q();
    }
}

