import java.math.BigInteger;
import java.util.Set;

public final class rfr {
    private final BigInteger A;
    private final Boolean B;
    private final BigInteger C;
    private final rfz D;
    private final rfp E;
    private final rfz F;
    private final rfz G;
    private final ByteString H;
    public final rfw a;
    public final rgb b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    private final Set l;
    private final BigInteger m;
    private final BigInteger n;
    private final Set o;
    private final Set p;
    private final BigInteger q;
    private final BigInteger r;
    private final BigInteger s;
    private final BigInteger t;
    private final BigInteger u;
    private final Boolean v;
    private final BigInteger w;
    private final BigInteger x;
    private final Boolean y;
    private final Boolean z;

    public rfr() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public rfr(Set set0, BigInteger bigInteger0, BigInteger bigInteger1, Set set1, Set set2, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, Boolean boolean0, BigInteger bigInteger7, BigInteger bigInteger8, Boolean boolean1, Boolean boolean2, BigInteger bigInteger9, rfw rfw0, Boolean boolean3, rgb rgb0, BigInteger bigInteger10, rfz rfz0, rfp rfp0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, rfz rfz1, rfz rfz2, String s8, ByteString hfsf0) {
        this.l = set0;
        this.m = bigInteger0;
        this.n = bigInteger1;
        this.o = set1;
        this.p = set2;
        this.q = bigInteger2;
        this.r = bigInteger3;
        this.s = bigInteger4;
        this.t = bigInteger5;
        this.u = bigInteger6;
        this.v = boolean0;
        this.w = bigInteger7;
        this.x = bigInteger8;
        this.y = boolean1;
        this.z = boolean2;
        this.A = bigInteger9;
        this.a = rfw0;
        this.B = boolean3;
        this.b = rgb0;
        this.C = bigInteger10;
        this.D = rfz0;
        this.E = rfp0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = s6;
        this.j = s7;
        this.F = rfz1;
        this.G = rfz2;
        this.k = s8;
        this.H = hfsf0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rfr)) {
            return false;
        }
        if(!ibuq.m(this.l, ((rfr)object0).l)) {
            return false;
        }
        if(!ibuq.m(this.m, ((rfr)object0).m)) {
            return false;
        }
        if(!ibuq.m(this.n, ((rfr)object0).n)) {
            return false;
        }
        if(!ibuq.m(this.o, ((rfr)object0).o)) {
            return false;
        }
        if(!ibuq.m(this.p, ((rfr)object0).p)) {
            return false;
        }
        if(!ibuq.m(this.q, ((rfr)object0).q)) {
            return false;
        }
        if(!ibuq.m(this.r, ((rfr)object0).r)) {
            return false;
        }
        if(!ibuq.m(this.s, ((rfr)object0).s)) {
            return false;
        }
        if(!ibuq.m(this.t, ((rfr)object0).t)) {
            return false;
        }
        if(!ibuq.m(this.u, ((rfr)object0).u)) {
            return false;
        }
        if(!ibuq.m(this.v, ((rfr)object0).v)) {
            return false;
        }
        if(!ibuq.m(this.w, ((rfr)object0).w)) {
            return false;
        }
        if(!ibuq.m(this.x, ((rfr)object0).x)) {
            return false;
        }
        if(!ibuq.m(this.y, ((rfr)object0).y)) {
            return false;
        }
        if(!ibuq.m(this.z, ((rfr)object0).z)) {
            return false;
        }
        if(!ibuq.m(this.A, ((rfr)object0).A)) {
            return false;
        }
        if(this.a != ((rfr)object0).a) {
            return false;
        }
        if(!ibuq.m(this.B, ((rfr)object0).B)) {
            return false;
        }
        if(!ibuq.m(this.b, ((rfr)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.C, ((rfr)object0).C)) {
            return false;
        }
        if(!ibuq.m(this.D, ((rfr)object0).D)) {
            return false;
        }
        if(!ibuq.m(this.E, ((rfr)object0).E)) {
            return false;
        }
        if(!ibuq.m(this.c, ((rfr)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((rfr)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((rfr)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((rfr)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((rfr)object0).g)) {
            return false;
        }
        if(!ibuq.m(this.h, ((rfr)object0).h)) {
            return false;
        }
        if(!ibuq.m(this.i, ((rfr)object0).i)) {
            return false;
        }
        if(!ibuq.m(this.j, ((rfr)object0).j)) {
            return false;
        }
        if(!ibuq.m(this.F, ((rfr)object0).F)) {
            return false;
        }
        if(!ibuq.m(this.G, ((rfr)object0).G)) {
            return false;
        }
        return ibuq.m(this.k, ((rfr)object0).k) ? ibuq.m(this.H, ((rfr)object0).H) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.l == null ? 0 : this.l.hashCode();
        int v2 = this.m == null ? 0 : this.m.hashCode();
        int v3 = this.n == null ? 0 : this.n.hashCode();
        int v4 = this.o == null ? 0 : this.o.hashCode();
        int v5 = this.p == null ? 0 : this.p.hashCode();
        int v6 = this.q == null ? 0 : this.q.hashCode();
        int v7 = this.r == null ? 0 : this.r.hashCode();
        int v8 = this.s == null ? 0 : this.s.hashCode();
        int v9 = this.t == null ? 0 : this.t.hashCode();
        int v10 = this.u == null ? 0 : this.u.hashCode();
        int v11 = this.v == null ? 0 : this.v.hashCode();
        int v12 = this.w == null ? 0 : this.w.hashCode();
        int v13 = this.x == null ? 0 : this.x.hashCode();
        int v14 = this.y == null ? 0 : this.y.hashCode();
        int v15 = this.z == null ? 0 : this.z.hashCode();
        int v16 = this.A == null ? 0 : this.A.hashCode();
        int v17 = this.a == null ? 0 : this.a.hashCode();
        int v18 = this.B == null ? 0 : this.B.hashCode();
        int v19 = this.b == null ? 0 : this.b.hashCode();
        int v20 = this.C == null ? 0 : this.C.hashCode();
        int v21 = this.D == null ? 0 : this.D.hashCode();
        int v22 = this.E == null ? 0 : this.E.hashCode();
        int v23 = this.c == null ? 0 : this.c.hashCode();
        int v24 = this.d == null ? 0 : this.d.hashCode();
        int v25 = this.e == null ? 0 : this.e.hashCode();
        int v26 = this.f == null ? 0 : this.f.hashCode();
        int v27 = this.g == null ? 0 : this.g.hashCode();
        int v28 = this.h == null ? 0 : this.h.hashCode();
        int v29 = this.i == null ? 0 : this.i.hashCode();
        int v30 = this.j == null ? 0 : this.j.hashCode();
        int v31 = this.F == null ? 0 : this.F.hashCode();
        int v32 = this.G == null ? 0 : this.G.hashCode();
        int v33 = this.k == null ? 0 : this.k.hashCode();
        ByteString hfsf0 = this.H;
        if(hfsf0 != null) {
            v = hfsf0.hashCode();
        }
        return ((((((((((((((((((((((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v19) * 0x1F + v20) * 0x1F + v21) * 0x1F + v22) * 0x1F + v23) * 0x1F + v24) * 0x1F + v25) * 0x1F + v26) * 0x1F + v27) * 0x1F + v28) * 0x1F + v29) * 0x1F + v30) * 0x1F + v31) * 0x1F + v32) * 0x1F + v33) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "AuthorizationList(purposes=" + this.l + ", keySize=" + this.m + ", algorithms=" + this.n + ", digests=" + this.o + ", paddings=" + this.p + ", ecCurve=" + this.q + ", rsaPublicExponent=" + this.r + ", activeDateTime=" + this.s + ", originationExpireDateTime=" + this.t + ", usageExpireDateTime=" + this.u + ", noAuthRequired=" + this.v + ", userAuthType=" + this.w + ", authTimeout=" + this.x + ", trustedUserPresenceRequired=" + this.y + ", unlockedDeviceRequired=" + this.z + ", creationDateTime=" + this.A + ", origin=" + this.a + ", rollbackResistant=" + this.B + ", rootOfTrust=" + this.b + ", osVersion=" + this.C + ", osPatchLevel=" + this.D + ", attestationApplicationId=" + this.E + ", attestationIdBrand=" + this.c + ", attestationIdDevice=" + this.d + ", attestationIdProduct=" + this.e + ", attestationIdSerial=" + this.f + ", attestationIdImei=" + this.g + ", attestationIdMeid=" + this.h + ", attestationIdManufacturer=" + this.i + ", attestationIdModel=" + this.j + ", vendorPatchLevel=" + this.F + ", bootPatchLevel=" + this.G + ", attestationIdSecondImei=" + this.k + ", moduleHash=" + this.H + ")";
    }
}

