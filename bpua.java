public final class bpua implements glzn {
    public final bpub a;
    public final String b;
    public final fqyc c;

    public bpua(bpub bpub0, String s, fqyc fqyc0) {
        this.a = bpub0;
        this.b = s;
        this.c = fqyc0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(hsxd.e() && ((gfsx)object0).i()) {
            gsyz gsyz0 = (gsyz)((gfsx)object0).d();
            long v = ((bpxd)this.a.a).f.d().minusSeconds(hsxv.l()).toEpochMilli();
            return gdta.g(((bpxd)this.a.a).d.e(gsyz0, v)).i(new bpwb(((bpxd)this.a.a), gsyz0, this.b, this.c), ((bpxd)this.a.a).h);
        }
        return gmbx.a;
    }
}

