public final class cykv implements kar {
    public final cylw a;

    public cykv(cylw cylw0) {
        this.a = cylw0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        cyna cyna0 = (cyna)object0;
        Object object1 = this.a.f.a();
        ggtj ggtj0 = (ggtj)cwfa.a.d().ar(7491);
        String s = cyna0.k();
        ggtj0.B("FastPair: ConnectionSwitchManager onMultipointSwitchActiveForCall, %s", gxyf.b(gxye.a, s));
        ((cwqd)object1).o = true;
        synchronized(object1) {
            ((cwqd)object1).g = cyna0;
        }
        cwqx cwqx0 = ((cwqd)object1).j;
        gged_interceptors gged0 = cwqx0.d();
        if(gged0 != null && !gged0.isEmpty()) {
            int v1 = gged0.size();
            for(int v = 0; v < v1; ++v) {
                String s1 = (String)gged0.get(v);
                cyxs cyxs0 = cwqx0.c(s1);
                if(cyvx.l(cyxs0) && (cyxs0.c & 0x100) != 0) {
                    String s2 = (cyxs0.n == null ? cyxd.a : cyxs0.n).c;
                    if(s2.equals(cyna0.k())) {
                        ((ggtj)cwfa.a.d().ar(7493)).B("ConnectionSwitchManager : onMultipointSwitchActiveForCall find sass device is same as triangle candidate, %s", gxyf.b(gxye.a, s2));
                        ((cwqd)object1).z = true;
                        ((cwqd)object1).x = cwqx0.g(s1);
                        return;
                    }
                }
            }
            return;
        }
        ((ggtj)cwfa.a.d().ar(7492)).x("ConnectionSwitchManager : onMultipointSwitchActiveForCall with no nearby nodes");
        ((cwqd)object1).z = false;
    }
}

