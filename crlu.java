import android.content.Context;

class crlu implements crlw {
    public final crkt y;

    public crlu(crkt crkt0) {
        batl.s(crkt0);
        this.y = crkt0;
    }

    @Override  // crlw
    public final crji aJ() {
        return this.y.aJ();
    }

    @Override  // crlw
    public final crkq aK() {
        return this.y.aK();
    }

    public final Context aj() {
        return this.y.a;
    }

    public final bbng ak() {
        return this.y.j;
    }

    public final crcn al() {
        return this.y.c;
    }

    public final crcu am() {
        return this.y.d;
    }

    public final crdl an() {
        return this.y.c();
    }

    public final crir ao() {
        return this.y.i;
    }

    public final crjx ap() {
        return this.y.g();
    }

    public final crqx aq() {
        return this.y.p();
    }

    public final void ar() {
        if(Thread.currentThread() == this.y.aK().c) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    public final void as() {
        this.y.r();
    }

    public void m() {
        this.y.q();
    }

    public void n() {
        this.y.aK().n();
    }
}

