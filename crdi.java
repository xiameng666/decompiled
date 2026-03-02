import j..util.Objects;

final class crdi implements Runnable {
    final crlw a;
    final crdj b;

    public crdi(crdj crdj0, crlw crlw0) {
        this.a = crlw0;
        Objects.requireNonNull(crdj0);
        this.b = crdj0;
        super();
    }

    @Override
    public final void run() {
        crlw crlw0 = this.a;
        crkt crkt0 = (crkt)crlw0;
        if(crcn.b()) {
            crlw0.aK().f(this);
            return;
        }
        crdj crdj0 = this.b;
        crdj0.a = 0L;
        if(crdj0.d()) {
            crdj0.b();
        }
    }
}

