public final class dfvy implements Runnable {
    public final dfzz a;

    public dfvy(dfzz dfzz0) {
        this.a = dfzz0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        if(!dfzz0.bA()) {
            dcvz.a.b().p("Not discovering. Skipped executing certificates syncing tasks.", new Object[0]);
            return;
        }
        if(!dfzz0.a.isEmpty()) {
            dcvz.a.b().p("Unparsable endpoint ids found. Request to sync certificates.", new Object[0]);
            dcpu dcpu0 = new dcpu();
            dcpu0.b = 2;
            dcpu0.a = 9;
            dcpv dcpv0 = new dcpv(dcpu0);
            dfzz0.t.j(dcpv0);
        }
        dfzz0.aV();
    }
}

