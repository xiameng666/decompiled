public final class bpjw implements gfsi {
    public final bpkl a;
    public final bpjo b;

    public bpjw(bpkl bpkl0, bpjo bpjo0) {
        this.a = bpkl0;
        this.b = bpjo0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        bpkl bpkl0 = this.a;
        synchronized(bpkl0.k) {
            boolean z = hsxl.i();
            bpjo bpjo0 = this.b;
            if(!z) {
                fqxm fqxm0 = ((fqzl)object0).j;
                if(fqxm0 == null) {
                    fqxm0 = fqxm.a;
                }
                boolean z1 = bouv.e(((fqzl)object0));
                bpkl0.i(fqxm0, bpjo0.a, bpjo0.b, bpjo0.c, z1);
                return null;
            }
            long v1 = bpkl0.h.a();
            if(bpkl0.d.i()) {
                if(((long)(((Long)bpkl0.d.d()))) + hsxv.a.y().ab() > v1) {
                    bpkl0.e.add(bpjo0);
                    return null;
                }
                bpkl0.g(v1);
                bpkl0.d = gfqx.a;
                bpkl0.e(((fqzl)object0));
            }
            fqxm fqxm1 = ((fqzl)object0).j;
            if(fqxm1 == null) {
                fqxm1 = fqxm.a;
            }
            boolean z2 = bouv.e(((fqzl)object0));
            bpkl0.i(fqxm1, bpjo0.a, bpjo0.b, bpjo0.c, z2);
            bpkl0.j(bpjo0.c.i() || gggq.v(bpjo0.a, new bpjz()), v1);
        }
        return null;
    }
}

