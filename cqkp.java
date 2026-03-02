public final class cqkp implements Runnable {
    public final cqlu a;
    public final Exception b;

    public cqkp(cqlu cqlu0, Exception exception0) {
        this.a = cqlu0;
        this.b = exception0;
    }

    @Override
    public final void run() {
        cqqt.b(this.b, "Error querying KeychainLockScreenKnowledgeFactorSupport", new Object[0]);
        cqkf cqkf0 = this.a.d;
        if(cqkf0 != null) {
            cqkf0.d();
        }
    }
}

