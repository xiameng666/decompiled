abstract class igec extends igdz {
    private static final int[] I = null;
    private static final int[] J = null;
    private static final long[] K = null;
    private static final long[] L = null;
    private static final long serialVersionUID = 0x7D53CD7ECCL;

    static {
        igec.I = new int[]{0x1F, 28, 0x1F, 30, 0x1F, 30, 0x1F, 0x1F, 30, 0x1F, 30, 0x1F};
        igec.J = new int[]{0x1F, 29, 0x1F, 30, 0x1F, 30, 0x1F, 0x1F, 30, 0x1F, 30, 0x1F};
        igec.K = new long[12];
        igec.L = new long[12];
        long v = 0L;
        long v1 = 0L;
        for(int v2 = 0; v2 < 11; ++v2) {
            v += ((long)new int[]{0x1F, 28, 0x1F, 30, 0x1F, 30, 0x1F, 0x1F, 30, 0x1F, 30, 0x1F}[v2]) * 86400000L;
            igec.K[v2 + 1] = v;
            v1 += ((long)new int[]{0x1F, 29, 0x1F, 30, 0x1F, 30, 0x1F, 0x1F, 30, 0x1F, 30, 0x1F}[v2]) * 86400000L;
            igec.L[v2 + 1] = v1;
        }
    }

    public igec(igcm igcm0, int v) {
        super(igcm0, v);
    }

    @Override  // igdz
    public final int U(long v, int v1) {
        return v1 > 28 || v1 <= 0 ? this.T(v) : 28;
    }

    @Override  // igdz
    public final int V(int v, int v1) {
        return this.ar(v) ? igec.J[v1 - 1] : igec.I[v1 - 1];
    }

    @Override  // igdz
    public final int Z(long v, int v1) {
        long v2 = v - this.an(v1);
        boolean z = this.ar(v1);
        if(((int)(v2 >> 10)) < (z ? 15356250 : 0xE907C3)) {
            if(((int)(v2 >> 10)) < (z ? 0x7528AD : 0x73DF16)) {
                if(((int)(v2 >> 10)) < 0x27E949) {
                    return 1;
                }
                return ((int)(v2 >> 10)) < (z ? 5062500 : 0x4BF5CD) ? 2 : 3;
            }
            if(((int)(v2 >> 10)) < (z ? 10209375 : 10125000)) {
                return 4;
            }
            return ((int)(v2 >> 10)) < (z ? 12825000 : 12740625) ? 5 : 6;
        }
        if(((int)(v2 >> 10)) < (z ? 0x160C39E : 0x15F7A07)) {
            if(((int)(v2 >> 10)) < (z ? 0x1123AA3 : 0x110F10C)) {
                return 7;
            }
            return ((int)(v2 >> 10)) < (z ? 20587500 : 20503125) ? 8 : 9;
        }
        if(((int)(v2 >> 10)) < (z ? 0x188ACE7 : 25650000)) {
            return 10;
        }
        return ((int)(v2 >> 10)) < (z ? 0x1AF4C99 : 0x1AE0302) ? 11 : 12;
    }

    @Override  // igdz
    public final long am(int v, int v1) {
        return this.ar(v) ? igec.L[v1 - 1] : igec.K[v1 - 1];
    }

    @Override  // igdz
    public final long ap(long v, int v1) {
        int v2 = this.ae(v);
        int v3 = this.S(v, v2);
        if(v3 > 59) {
            if(this.ar(v2)) {
                return this.ar(v1) ? this.ao(v1, 1, v3) + ((long)this.X(v)) : this.ao(v1, 1, v3 - 1) + ((long)this.X(v));
            }
            if(this.ar(v1)) {
                ++v3;
            }
        }
        return this.ao(v1, 1, v3) + ((long)this.X(v));
    }

    @Override  // igdz
    public final boolean aq(long v) {
        return this.u.a(v) == 29 && this.z.z(v);
    }
}

