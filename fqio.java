public final class fqio implements glzn {
    @Override  // glzn
    public final gmcd a(Object object0) {
        ByteString hfsf0 = ((fqjp)object0).a;
        if(hfsf0.size() <= 0) {
            return fqiw.i(hfsf0);
        }
        int v = hfsf0.a(0);
        boolean z = (v & 2) == 2;
        if((v & 1) != 0) {
            ByteString hfsf1 = hfsf0.D(1);
            if(hfsf1.size() < 20) {
                return fqiw.i(hfsf0);
            }
            ByteString hfsf2 = hfsf1.size() >= 0x20 ? hfsf1.j(0, 0x20) : hfsf1.j(0, 20);
            return hfsf1.size() <= hfsf2.size() ? gmbu.i(fqii.a(z, hfsf2, gfqx.a)) : gmbu.i(fqii.a(z, hfsf2, fquo.b(hfsf1.a(hfsf2.size()))));
        }
        return gmbu.i(new fqii(false, z, gfqx.a, gfqx.a));
    }
}

