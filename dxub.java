import j..util.Objects;

final class dxub implements dpue {
    final dxuc a;

    public dxub(dxuc dxuc0) {
        Objects.requireNonNull(dxuc0);
        this.a = dxuc0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        dxuc dxuc0 = this.a;
        if(dxuc0.aw()) {
            return;
        }
        dxuc0.al.J(dpui0);
    }

    @Override  // dpug
    public final void b(Object object0) {
        gtuq gtuq0 = (gtuq)object0;
        dxuc dxuc0 = this.a;
        if(dxuc0.aw()) {
            return;
        }
        xob xob0 = dxuc0.an();
        gftb.check(xob0);
        Objects.requireNonNull(dxuc0);
        dxtg.i(xob0, new dxua(dxuc0));
        dxuc0.al.L(dxuc0.am);
    }
}

