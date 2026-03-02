public final class zio implements azuk {
    public final zip a;
    public final aatb b;
    public final grwa c;
    public final zlv d;

    public zio(zip zip0, aatb aatb0, zlv zlv0, grwa grwa0) {
        this.a = zip0;
        this.b = aatb0;
        this.d = zlv0;
        this.c = grwa0;
    }

    @Override  // azuk
    public final void a(azuj azuj0) {
        if(((efnw)azuj0).b() == null) {
            return;
        }
        String s = null;
        bako bako0 = new bako(((efnw)azuj0).b());
        while(bako0.hasNext()) {
            Object object0 = bako0.next();
            egha egha0 = (egha)object0;
            if(egha0.j() && this.b.b.equals(egha0.c())) {
                s = egha0.e();
            }
        }
        this.a.b(this.d, this.c, s);
    }
}

