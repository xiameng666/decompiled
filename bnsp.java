public final class bnsp implements gmac {
    public final bnsw a;
    public final ByteString b;

    public bnsp(bnsw bnsw0, ByteString hfsf0) {
        this.a = bnsw0;
        this.b = hfsf0;
    }

    @Override  // gmac
    public final gmai a(gmag gmag0, Object object0) {
        bnsw bnsw0 = this.a;
        if(bnsw0.f == gszr.d) {
            if(!((gfsx)object0).i()) {
                return new gmai(gmbu.h(new fqmp("Scan timeout for three-component device")));
            }
            long v = bnsw0.a.d().toEpochMilli();
            return new gmai(bnsw0.b.p(bnsw0.e, v)).d(new bnsi(bnsw0, ((gfsx)object0)), bnsw0.d);
        }
        bnsj bnsj0 = new bnsj();
        bnsk bnsk0 = new bnsk(bnsw0);
        return bnsw0.l.b(this.b, ((gfsx)object0), ((gful_cronetEngineProvider)bnsj0), ((gful_cronetEngineProvider)bnsk0)).a;
    }
}

