abstract class crlv extends crlu {
    private boolean a;

    public crlv(crkt crkt0) {
        super(crkt0);
        this.y.u();
    }

    protected void aL() {
    }

    protected abstract boolean e();

    protected final void l() {
        if(this.q()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void o() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        if(!this.e()) {
            this.y.t();
            this.a = true;
        }
    }

    public final void p() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.aL();
        this.y.t();
        this.a = true;
    }

    final boolean q() {
        return this.a;
    }
}

