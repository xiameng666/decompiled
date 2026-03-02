public final class cqoo implements evqc {
    public final cqpi a;

    public cqoo(cqpi cqpi0) {
        this.a = cqpi0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(cqpi.d.j(), "Unexpected error while refreshing phone number verification state", exception0);
        cqpi cqpi0 = this.a;
        if((exception0 instanceof aztb)) {
            cqpi0.U(cqpb.b(((aztb)exception0)), false);
            return;
        }
        cqpi0.U(cqpb.a(), false);
    }
}

