public final class cqls implements Runnable {
    public final cqlt a;
    public final cqlu b;

    public cqls(cqlt cqlt0, cqlu cqlu0) {
        this.a = cqlt0;
        this.b = cqlu0;
    }

    @Override
    public final void run() {
        cqpp.a(this.b);
        this.a.e.N();
    }
}

