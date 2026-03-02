public final class aubp implements Runnable {
    public final aucd a;
    public final boolean b;

    public aubp(aucd aucd0, boolean z) {
        this.a = aucd0;
        this.b = z;
    }

    @Override
    public final void run() {
        aucd aucd0 = this.a;
        if(!aucd0.Q.c() && !this.b) {
            return;
        }
        aucd0.k.m("in reconnect Runnable");
        aucd0.C();
    }
}

