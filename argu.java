public final class argu {
    public static final aqql a;
    public final esaa b;

    static {
        argu.a = new aqql(new String[]{"SourceWakeLockManager"});
    }

    public argu(esaa esaa0) {
        batl.h("Wake lock must be created on the main thread.");
        this.b = esaa0;
    }

    public final boolean a() {
        batl.h("Wake lock must be released from the main thread.");
        esaa esaa0 = this.b;
        if(!esaa0.l()) {
            argu.a.j("releaseWakeLockIfHeld(): wake lock not held so not releasing", new Object[0]);
            return false;
        }
        argu.a.j("releaseWakeLockIfHeld(): wake lock held so releasing", new Object[0]);
        esaa0.n("migrate_transfer");
        return true;
    }
}

