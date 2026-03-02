public final class duqb implements lqj {
    public final duqg a;

    public duqb(duqg duqg0) {
        this.a = duqg0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        duqg duqg0 = this.a;
        dvfd dvfd0 = (dvfd)duqg0.b.C.ij();
        if(((dvfe)object0) != null && dvfd0 != null && dvfd0.equals(dvfd.a)) {
            if(hwev.c()) {
                duqg0.L(duqg0.ax);
            }
            else {
                duqg0.L(duqg0.au);
                duqg0.aw.setVisibility(0);
            }
            dvfh dvfh0 = duqg0.b;
            ByteString hfsf0 = ((dvfe)object0).c.b;
            dvfh0.C.l(dvfd.b);
            dvdr dvdr0 = new dvdr(dvfh0, ((dvfe)object0).a, hfsf0);
            dvfh0.G.execute(dvdr0);
        }
    }
}

