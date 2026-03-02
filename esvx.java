import j..util.DesugarCollections;
import j..util.Objects;
import java.util.LinkedHashMap;
import java.util.Set;

public final class esvx {
    public static final Set A;
    private final String B;
    private final int C;
    public static final esvx a;
    public static final esvx b;
    public static final esvx c;
    public static final esvx d;
    public static final esvx e;
    public static final esvx f;
    public static final esvx g;
    public static final esvx h;
    public static final esvx i;
    public static final esvx j;
    public static final esvx k;
    public static final esvx l;
    public static final esvx m;
    public static final esvx n;
    public static final esvx o;
    public static final esvx p;
    public static final esvx q;
    public static final esvx r;
    public static final esvx s;
    public static final esvx t;
    public static final esvx u;
    public static final esvx v;
    public static final esvx w;
    public static final esvx x;
    public static final esvx y;
    public static final esvx z;

    static {
        esvx esvx0 = new esvx(0x9000, "no error");
        esvx.a = esvx0;
        esvx esvx1 = new esvx(0x6200, "Warning: State unchanged");
        esvx.b = esvx1;
        esvx esvx2 = new esvx(0x6283, "Warning: Card Manager is locked");
        esvx.c = esvx2;
        esvx esvx3 = new esvx(0x6300, "Warning: State changed (no information given)");
        esvx.d = esvx3;
        esvx esvx4 = new esvx(0x6310, "more data");
        esvx.e = esvx4;
        esvx esvx5 = new esvx(0x63C0, "PIN authentication failed.");
        esvx.f = esvx5;
        esvx esvx6 = new esvx(0x6700, "Wrong length");
        esvx.g = esvx6;
        esvx esvx7 = new esvx(0x6701, "Wrong length - 1");
        esvx.h = esvx7;
        esvx esvx8 = new esvx(0x6702, "Wrong length - 2");
        esvx.i = esvx8;
        esvx esvx9 = new esvx(27010, "Security status not satisfied");
        esvx.j = esvx9;
        esvx esvx10 = new esvx(27011, "File invalid");
        esvx.k = esvx10;
        esvx esvx11 = new esvx(27012, "Reference data not usable");
        esvx.l = esvx11;
        esvx esvx12 = new esvx(27013, "Conditions of use not satisfied");
        esvx.m = esvx12;
        esvx esvx13 = new esvx(27014, "Command not allowed");
        esvx.n = esvx13;
        esvx esvx14 = new esvx(27033, "Applet selection failed");
        esvx.o = esvx14;
        esvx esvx15 = new esvx(0x6A80, "Wrong data");
        esvx.p = esvx15;
        esvx esvx16 = new esvx(0x6A81, "Function not supported");
        esvx.q = esvx16;
        esvx esvx17 = new esvx(0x6A82, "File not found");
        esvx.r = esvx17;
        esvx esvx18 = new esvx(0x6A83, "Record not found");
        esvx.s = esvx18;
        esvx esvx19 = new esvx(27270, "Incorrect P1 or P2");
        esvx.t = esvx19;
        esvx esvx20 = new esvx(0x6A88, "Referenced data not found");
        esvx.u = esvx20;
        esvx esvx21 = new esvx(0x6A89, "File already exists");
        esvx.v = esvx21;
        esvx esvx22 = new esvx(0x6B00, "Wrong P1 or P2");
        esvx.w = esvx22;
        esvx esvx23 = new esvx(0x6D00, "Instruction not supported or invalid");
        esvx.x = esvx23;
        esvx esvx24 = new esvx(0x6E00, "Class not supported");
        esvx.y = esvx24;
        esvx esvx25 = new esvx(0x6F00, "Unknown error (no precise diagnosis)");
        esvx.z = esvx25;
        ggfp ggfp0 = ggfp.O(esvx0, esvx1, esvx2, esvx3, esvx4, esvx5, new esvx[]{esvx6, esvx7, esvx8, esvx9, esvx10, esvx11, esvx12, esvx13, esvx14, esvx15, esvx16, esvx17, esvx18, esvx19, esvx20, esvx21, esvx22, esvx23, esvx24, esvx25});
        esvx.A = ggfp0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ggfp0.size());
        for(Object object0: ggfp0) {
            linkedHashMap0.put(Integer.valueOf(((esvx)object0).C), ((esvx)object0));
        }
        DesugarCollections.unmodifiableMap(linkedHashMap0);
    }

    private esvx(int v, String s) {
        this.C = v;
        this.B = s;
    }

    public final byte[] a() {
        return glxf.d(((short)this.C));
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 != null) {
            Class class0 = this.getClass();
            return object0.getClass() == class0 && ((esvx)object0).C == this.C && ((esvx)object0).B.equals(this.B);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.C), this.B});
    }

    @Override
    public final String toString() {
        return String.format("\'%04X\': %s", ((int)this.C), this.B);
    }
}

