import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class essp implements esrz {
    public byte[] A;
    public byte[] B;
    public byte[] C;
    public byte[] D;
    public byte[] E;
    public byte[] F;
    public byte[] G;
    public byte[] H;
    public byte[] I;
    public byte[] J;
    public byte[] K;
    public esur L;
    public esur M;
    public JSONObject N;
    public byte[] O;
    public ArrayList P;
    public JSONArray Q;
    public byte[] R;
    public int S;
    byte[] T;
    public String U;
    private byte[] V;
    private byte[] W;
    private byte[] X;
    private byte[] Y;
    private LinkedHashMap Z;
    public byte[] a;
    private HashMap aa;
    private byte[] ab;
    private byte[] ac;
    private byte[] ad;
    private byte[] ae;
    private byte[] af;
    private LinkedList ag;
    private byte[] ah;
    private byte[] ai;
    private byte[] aj;
    private byte[] ak;
    private byte[] al;
    public byte[] b;
    public byte[] c;
    public esut d;
    public esut e;
    public esut f;
    public esut g;
    public esut h;
    public esut i;
    public int j;
    public String k;
    public String l;
    public String m;
    public byte[] n;
    public byte[] o;
    public short p;
    public boolean q;
    public byte r;
    public byte[] s;
    public byte[] t;
    public short u;
    public short v;
    public Map w;
    public byte[] x;
    public esur y;
    public byte[] z;

    public final void A(byte[] arr_b) {
        this.ac = (byte[])arr_b.clone();
    }

    public final void B(byte[] arr_b) {
        this.ad = (byte[])arr_b.clone();
    }

    public final void C(Map map0) {
        this.Z = new LinkedHashMap(map0);
    }

    public final void D(LinkedHashMap linkedHashMap0) {
        if(linkedHashMap0 != null) {
            this.aa = (LinkedHashMap)linkedHashMap0.clone();
        }
    }

    public final void E(byte[] arr_b) {
        this.ae = (byte[])arr_b.clone();
    }

    public final void F(List list0) {
        this.ag = new LinkedList(list0);
    }

    public final byte[] G() {
        return (byte[])this.ab.clone();
    }

    public final byte[] H() {
        return (byte[])this.Y.clone();
    }

    public final byte[] I() {
        return (byte[])this.J.clone();
    }

    public final byte[] J() {
        return (byte[])this.I.clone();
    }

    public final byte[] K() {
        return (byte[])this.V.clone();
    }

    public final byte[] L() {
        return (byte[])this.aj.clone();
    }

    public final byte[] M() {
        return (byte[])this.ai.clone();
    }

    public final byte[] N() {
        return (byte[])this.ak.clone();
    }

    public final byte[] O() {
        return (byte[])this.ah.clone();
    }

    public final byte[] P() {
        return this.n == null ? new byte[6] : ((byte[])this.n.clone());
    }

    public final byte[] Q() {
        return (byte[])this.W.clone();
    }

    public final byte[] R() {
        return (byte[])this.o.clone();
    }

    public final byte[] S() {
        return (byte[])this.x.clone();
    }

    public final byte[] T() {
        return this.O == null ? new byte[0] : ((byte[])this.O.clone());
    }

    public final byte[] U() {
        return (byte[])this.H.clone();
    }

    public final byte[] V() {
        return (byte[])this.X.clone();
    }

    public final byte[] W() {
        return (byte[])this.af.clone();
    }

    public final byte[] X() {
        return (byte[])this.al.clone();
    }

    public final byte[] Y() {
        return (byte[])this.ac.clone();
    }

    public final byte[] Z() {
        return this.ad == null ? new byte[0] : ((byte[])this.ad.clone());
    }

    @Override  // esrz
    public final byte[] a() {
        estr.g();
        return (byte[])this.z.clone();
    }

    public final byte[] aa() {
        return (byte[])this.ae.clone();
    }

    public static final void ab(byte[] arr_b) {
        byte[] arr_b1 = (byte[])arr_b.clone();
    }

    public static final void ac(byte[] arr_b) {
        byte[] arr_b1 = (byte[])arr_b.clone();
    }

    public static final void ad(byte[] arr_b) {
        byte[] arr_b1 = (byte[])arr_b.clone();
    }

    @Override  // esrz
    public final byte[] b(int v) {
        return this.T;
    }

    public final ArrayList c() {
        return (ArrayList)this.P.clone();
    }

    public final LinkedHashMap d() {
        return this.aa == null ? null : ((LinkedHashMap)this.aa.clone());
    }

    public final List e() {
        LinkedList linkedList0 = this.ag;
        return linkedList0 != null ? ((LinkedList)linkedList0.clone()) : Collections.EMPTY_LIST;
    }

    public final Map f() {
        LinkedHashMap linkedHashMap0 = this.Z;
        return linkedHashMap0 != null ? ((LinkedHashMap)linkedHashMap0.clone()) : null;
    }

    public final void g() {
        Arrays.fill(this.ab, 0, this.ab.length, 0);
    }

    public final void h() {
        Arrays.fill(this.s, 0, this.s.length, 0);
    }

    public final void i() {
        Arrays.fill(this.t, 0, this.t.length, 0);
    }

    public final void j() {
        Arrays.fill(this.ac, 0, this.ac.length, 0);
    }

    public final void k() {
        this.Z.clear();
    }

    public final void l() {
        this.aa.clear();
    }

    public final void m() {
        Arrays.fill(this.ae, 0, this.ae.length, 0);
    }

    public final void n() {
        this.ag.clear();
    }

    public final void o(byte[] arr_b) {
        this.ab = (byte[])arr_b.clone();
    }

    public final void p(byte[] arr_b) {
        this.Y = (byte[])arr_b.clone();
    }

    public final void q(byte[] arr_b) {
        this.V = (byte[])arr_b.clone();
    }

    public final void r(byte[] arr_b) {
        this.aj = (byte[])arr_b.clone();
    }

    public final void s(byte[] arr_b) {
        this.ai = (byte[])arr_b.clone();
    }

    public final void t(byte[] arr_b) {
        this.ak = (byte[])arr_b.clone();
    }

    public final void u(byte[] arr_b) {
        this.ah = (byte[])arr_b.clone();
    }

    public final void v(byte[] arr_b) {
        this.W = (byte[])arr_b.clone();
    }

    public final void w(byte[] arr_b) {
        this.R = (byte[])arr_b.clone();
    }

    public final void x(byte[] arr_b) {
        this.X = (byte[])arr_b.clone();
    }

    public final void y(byte[] arr_b) {
        this.af = (byte[])arr_b.clone();
    }

    public final void z(byte[] arr_b) {
        this.al = (byte[])arr_b.clone();
    }
}

