public final class erlu implements azuk {
    public final erly a;
    public final azts b;

    public erlu(erly erly0, azts azts0) {
        this.a = erly0;
        this.b = azts0;
    }

    @Override  // azuk
    public final void a(azuj azuj0) {
        egim egim0 = ((efnw)azuj0).b();
        if(egim0 == null) {
            return;
        }
        bako bako0 = new bako(egim0);
        while(bako0.hasNext()) {
            erly erly0 = this.a;
            Object object0 = bako0.next();
            String s = ((egha)object0).c();
            String s1 = ((egha)object0).e();
            erly0.a.put(s, s1);
            for(Object object1: erly0.c) {
                ((erlx)object1).a();
            }
            this.b.bH(s, 1, 0).e(new erlw(erly0, s));
        }
        egim0.iz();
    }
}

