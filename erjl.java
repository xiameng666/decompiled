public final class erjl implements evqc {
    public final erkf a;

    public erjl(erkf erkf0) {
        this.a = erkf0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        if((exception0 instanceof aztb)) {
            erkf.a.g("Error while trying to connect: ", exception0, new Object[0]);
            this.a.b.m();
        }
    }
}

