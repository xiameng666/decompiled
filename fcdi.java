import j..util.Objects;

final class fcdi implements Runnable {
    final fcdl a;
    final ProtoLiteBuilder b;

    public fcdi(fcdl fcdl0, ProtoLiteBuilder hftp0) {
        this.b = hftp0;
        Objects.requireNonNull(fcdl0);
        this.a = fcdl0;
        super();
    }

    @Override
    public final void run() {
        this.a.cC(2);
        this.a.bx().b.D(((hcib)this.b.N_build()));
    }
}

