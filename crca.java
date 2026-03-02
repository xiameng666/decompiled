import android.text.TextUtils;
import j..util.Objects;
import java.util.List;

final class crca {
    private long A;
    private boolean B;
    private boolean C;
    private Boolean D;
    private long E;
    private String F;
    private boolean G;
    private long H;
    private long I;
    private int J;
    private boolean K;
    private Long L;
    private Long M;
    private String N;
    private String O;
    private byte[] P;
    private int Q;
    private long R;
    private long S;
    public final crkt a;
    public final String b;
    public long c;
    public List d;
    public long e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public String o;
    public boolean p;
    private String q;
    private String r;
    private String s;
    private String t;
    private long u;
    private long v;
    private String w;
    private long x;
    private String y;
    private long z;

    public crca(crkt crkt0, String s) {
        batl.s(crkt0);
        batl.q(s);
        this.a = crkt0;
        this.b = s;
        crkt0.s();
    }

    public final String A() {
        this.a.s();
        return this.O;
    }

    public final String B() {
        this.a.s();
        return this.F;
    }

    public final String C() {
        this.a.s();
        return this.N;
    }

    public final List D() {
        this.a.s();
        return this.d;
    }

    public final void E(long v) {
        crkt crkt0 = this.a;
        crkt0.s();
        long v1 = this.c + v;
        if(v1 > 0x7FFFFFFFL) {
            crkt0.aJ().f.b("Bundle index overflow. appId", crji.a(this.b));
            v1 = -1L + v;
        }
        long v2 = this.h + 1L;
        if(v2 > 0x7FFFFFFFL) {
            crkt0.aJ().f.b("Delivery index overflow. appId", crji.a(this.b));
            v2 = 0L;
        }
        this.p = true;
        this.c = v1;
        this.h = v2;
    }

    public final void F(byte[] arr_b) {
        this.a.s();
        this.p |= (this.P == arr_b ? 0 : 1);
        this.P = arr_b;
    }

    public final void G(int v) {
        this.a.s();
        this.p |= (this.J == v ? 0 : 1);
        this.J = v;
    }

    public final void H(boolean z) {
        this.a.s();
        this.p |= (this.C == z ? 0 : 1);
        this.C = z;
    }

    public final void I(String s) {
        this.a.s();
        this.p |= Objects.equals(this.q, s) ^ 1;
        this.q = s;
    }

    public final void J(String s) {
        this.a.s();
        this.p |= Objects.equals(this.y, s) ^ 1;
        this.y = s;
    }

    public final void K(String s) {
        this.a.s();
        this.p |= Objects.equals(this.w, s) ^ 1;
        this.w = s;
    }

    public final void L(long v) {
        this.a.s();
        this.p |= (this.x == v ? 0 : 1);
        this.x = v;
    }

    public final void M(int v) {
        this.a.s();
        this.p |= (this.Q == v ? 0 : 1);
        this.Q = v;
    }

    public final void N(long v) {
        this.a.s();
        this.p |= (this.R == v ? 0 : 1);
        this.R = v;
    }

    public final void O(long v) {
        this.a.s();
        this.p |= (this.A == v ? 0 : 1);
        this.A = v;
    }

    public final void P(long v) {
        this.a.s();
        this.p |= (this.E == v ? 0 : 1);
        this.E = v;
    }

    public final void Q(long v) {
        this.a.s();
        this.p |= (this.S == v ? 0 : 1);
        this.S = v;
    }

    public final void R(String s) {
        this.a.s();
        this.p |= Objects.equals(this.t, s) ^ 1;
        this.t = s;
    }

    public final void S(String s) {
        this.a.s();
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.p |= 1 ^ Objects.equals(this.r, s);
        this.r = s;
    }

    public final void T(long v) {
        this.a.s();
        this.p |= (this.z == v ? 0 : 1);
        this.z = v;
    }

    public final void U(String s) {
        this.a.s();
        this.p |= Objects.equals(this.o, s) ^ 1;
        this.o = s;
    }

    public final void V(long v) {
        this.a.s();
        this.p |= (this.v == v ? 0 : 1);
        this.v = v;
    }

    public final void W(long v) {
        int v1 = 1;
        batl.b(Long.compare(v, 0L) >= 0);
        this.a.s();
        int v2 = this.p;
        if(this.c == v) {
            v1 = 0;
        }
        this.p = v2 | v1;
        this.c = v;
    }

    public final void X(long v) {
        this.a.s();
        this.p |= (this.u == v ? 0 : 1);
        this.u = v;
    }

    public final void Y(boolean z) {
        this.a.s();
        this.p |= (this.B == z ? 0 : 1);
        this.B = z;
    }

    public final void Z(Boolean boolean0) {
        this.a.s();
        this.p |= Objects.equals(this.D, boolean0) ^ 1;
        this.D = boolean0;
    }

    public final int a() {
        this.a.s();
        return this.J;
    }

    public final void aa(String s) {
        this.a.s();
        this.p |= Objects.equals(this.s, s) ^ 1;
        this.s = s;
    }

    public final void ab(String s) {
        this.a.s();
        this.p |= (this.O == s ? 0 : 1);
        this.O = s;
    }

    public final void ac(String s) {
        this.a.s();
        this.p |= Objects.equals(this.F, s) ^ 1;
        this.F = s;
    }

    public final void ad(long v) {
        this.a.s();
        this.p |= (this.I == v ? 0 : 1);
        this.I = v;
    }

    public final void ae(String s) {
        this.a.s();
        this.p |= (this.N == s ? 0 : 1);
        this.N = s;
    }

    public final void af(boolean z) {
        this.a.s();
        this.p |= (this.G == z ? 0 : 1);
        this.G = z;
    }

    public final void ag(long v) {
        this.a.s();
        this.p |= (this.H == v ? 0 : 1);
        this.H = v;
    }

    public final void ah(boolean z) {
        this.a.s();
        this.p |= (this.K == z ? 0 : 1);
        this.K = z;
    }

    public final void ai(Long long0) {
        this.a.s();
        this.p |= Objects.equals(this.L, long0) ^ 1;
        this.L = long0;
    }

    public final void aj(Long long0) {
        this.a.s();
        this.p |= Objects.equals(this.M, long0) ^ 1;
        this.M = long0;
    }

    public final boolean ak() {
        this.a.s();
        return this.C;
    }

    public final boolean al() {
        this.a.s();
        return this.B;
    }

    public final boolean am() {
        this.a.s();
        return this.p;
    }

    public final boolean an() {
        this.a.s();
        return this.G;
    }

    public final boolean ao() {
        this.a.s();
        return this.K;
    }

    public final byte[] ap() {
        this.a.s();
        return this.P;
    }

    public final int b() {
        this.a.s();
        return this.Q;
    }

    public final long c() {
        this.a.s();
        return this.x;
    }

    public final long d() {
        this.a.s();
        return this.e;
    }

    public final long e() {
        this.a.s();
        return this.R;
    }

    public final long f() {
        this.a.s();
        return this.A;
    }

    public final long g() {
        this.a.s();
        return this.E;
    }

    public final long h() {
        this.a.s();
        return this.S;
    }

    public final long i() {
        this.a.s();
        return this.z;
    }

    public final long j() {
        this.a.s();
        return this.h;
    }

    public final long k() {
        this.a.s();
        return this.v;
    }

    public final long l() {
        this.a.s();
        return this.c;
    }

    public final long m() {
        this.a.s();
        return this.u;
    }

    public final long n() {
        this.a.s();
        return this.I;
    }

    public final long o() {
        this.a.s();
        return this.H;
    }

    public final Boolean p() {
        this.a.s();
        return this.D;
    }

    public final Long q() {
        this.a.s();
        return this.L;
    }

    public final Long r() {
        this.a.s();
        return this.M;
    }

    public final String s() {
        this.a.s();
        String s = this.o;
        this.U(null);
        return s;
    }

    public final String t() {
        this.a.s();
        return this.b;
    }

    public final String u() {
        this.a.s();
        return this.q;
    }

    public final String v() {
        this.a.s();
        return this.y;
    }

    public final String w() {
        this.a.s();
        return this.w;
    }

    public final String x() {
        this.a.s();
        return this.t;
    }

    public final String y() {
        this.a.s();
        return this.r;
    }

    public final String z() {
        this.a.s();
        return this.s;
    }
}

