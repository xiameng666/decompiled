import j..util.Objects;

public final class crcd implements Runnable {
    public final crkt a;

    public crcd(crkt crkt0) {
        this.a = crkt0;
    }

    @Override
    public final void run() {
        crkt crkt0 = this.a;
        if(!crkt0.p().ab()) {
            crkt0.aJ().f.a("registerTrigger called but app not eligible");
            return;
        }
        crni crni0 = crkt0.j();
        crni0.n();
        crdj crdj0 = crni0.e;
        if(crdj0 != null) {
            crdj0.a();
        }
        crni crni1 = crkt0.j();
        Objects.requireNonNull(crni1);
        new Thread(new crcc(crni1)).start();
    }
}

