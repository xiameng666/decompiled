public final class hmdu extends hmeb {
    public hmdu() {
        try {
            this.b(new hmgz(6));
        }
        catch(hmdl unused_ex) {
        }
    }

    public hmdu(Long long0) {
        this.a = long0;
        hmgz hmgz0 = hmgz.e(hmgv.b(long0.longValue()));
        hmgz0.t(6);
        super.b(hmgz0);
    }

    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9F02");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        this.a = hmgv.a(hmgz0.a);
    }
}

