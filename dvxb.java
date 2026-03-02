public final class dvxb implements evpz {
    public final dvxj a;

    public dvxb(dvxj dvxj0) {
        this.a = dvxj0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        dvxj dvxj0 = this.a;
        xob xob0 = dvxj0.an();
        if(xob0 != null && !xob0.isFinishing()) {
            if(dvxj0.aO) {
                return;
            }
            evql evql1 = dvxj0.aY.aS(dvxj0.aE);
            evql1.x(xob0, new dvwe(dvxj0));
            evql1.u(xob0, new dvwp(dvxj0));
            return;
        }
        ((ggtj)dvxj.a.i()).x("Could not find activity.");
    }
}

