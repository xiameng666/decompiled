import j..util.Objects;

public final class eioq extends eioh implements eiop {
    public boolean d;
    final eior e;

    public eioq(eior eior0, boolean z, boolean z1) {
        Objects.requireNonNull(eior0);
        this.e = eior0;
        super(eior0, z, z1);
        this.d = false;
    }

    @Override  // eioo
    public final eiol c(String s) {
        return new eiol(this.e, s, null, eior.b);
    }

    @Override  // eioh, eiop
    public final void e() {
        this.e.c.setTransactionSuccessful();
        gftb.q(((boolean)(this.d ^ 1)));
        this.d = true;
    }
}

