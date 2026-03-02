final class ifqe {
    public final int a;
    public final int b;
    public final idqg c;
    private final ifqr d;
    private final int e;

    protected ifqe(idqg idqg0) {
        int v;
        if(idqg0 == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.c = idqg0;
        iecl iecl0 = ifpu.b(idqg0);
        String s = iecl0.getAlgorithmName();
        if(s.equals("SHAKE128")) {
            v = 0x20;
        }
        else {
            v = s.equals("SHAKE256") ? 0x40 : iecl0.getDigestSize();
        }
        this.a = v;
        int v1 = (int)Math.ceil(((double)(v * 8)) / 4.0);
        this.e = v1;
        int v2 = v1 + (((int)Math.floor(ifqy.b(v1 * 15) / 4)) + 1);
        this.b = v2;
        String s1 = iecl0.getAlgorithmName();
        if(s1 == null) {
            throw new NullPointerException("algorithmName == null");
        }
        ifqd ifqd0 = (ifqd)ifqd.a.get(ifqd.a(s1, v, v2));
        this.d = ifqd0;
        if(ifqd0 != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + iecl0.getAlgorithmName());
    }
}

