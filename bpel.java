public final class bpel implements glzn {
    public final bpik a;
    public final fqxm b;

    public bpel(bpik bpik0, fqxm fqxm0) {
        this.a = bpik0;
        this.b = fqxm0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!hsww.p()) {
            return gmbu.i(((Boolean)object0));
        }
        if(((Boolean)object0).booleanValue()) {
            boug boug0 = new boug(((boul)this.a.e), (this.b.d == null ? gsyz.a : this.b.d));
            return gdta.g(((boul)this.a.e).j.b(boug0, gmap.a)).h(new bpgj(), gmap.a);
        }
        return gmbu.i(Boolean.valueOf(false));
    }
}

