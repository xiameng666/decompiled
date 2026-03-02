import java.util.ArrayList;
import java.util.List;

public final class srg {
    private final byte A;
    public static final srg a;
    public static final srg b;
    public static final srg c;
    public static final srg d;
    public static final srg e;
    public static final srg f;
    public static final srg g;
    public static final srg h;
    public static final srg i;
    public static final srg j;
    public static final srg k;
    public static final srg l;
    public static final srg m;
    public static final srg n;
    public static final srg o;
    public static final srg p;
    public static final srg q;
    public static final srg r;
    public static final srg s;
    public static final srg t;
    public static final srg u;
    public static final srg v;
    public static final srg w;
    public final String x;
    public final byte y;
    private static final List z;

    static {
        srg srg0 = new srg("No Error", (byte)0x90, 0);
        srg.a = srg0;
        srg srg1 = new srg("Applet selection failed", 105, -103);
        srg.b = srg1;
        srg srg2 = new srg("Response bytes remaining", 97, 0);
        srg.c = srg2;
        srg srg3 = new srg("CLA value not supported", 110, 0);
        srg.d = srg3;
        srg srg4 = new srg("Command not allowed (no current EF)", 105, (byte)0x86);
        srg.e = srg4;
        srg srg5 = new srg("Conditions of use not satisfied", 105, (byte)0x85);
        srg.f = srg5;
        srg srg6 = new srg("Correct Expected Length (Le)", 108, 0);
        srg.g = srg6;
        srg srg7 = new srg("Data invalid", 105, (byte)0x84);
        srg.h = srg7;
        srg.i = new srg("Secure messaging data objects missing", 105, (byte)0x87);
        srg srg8 = new srg("Secure messaging data objects incorrect", 105, -120);
        srg.j = srg8;
        srg srg9 = new srg("Not enough memory space in the file", 106, (byte)0x84);
        srg.k = srg9;
        srg srg10 = new srg("File invalid", 105, (byte)0x83);
        srg.l = srg10;
        srg srg11 = new srg("File not found", 106, (byte)0x82);
        srg.m = srg11;
        srg srg12 = new srg("Function not supported", 106, (byte)0x81);
        srg.n = srg12;
        srg srg13 = new srg("Incorrect parameters (P1,P2)", 106, (byte)0x86);
        srg.o = srg13;
        srg srg14 = new srg("INS value not supported", 109, 0);
        srg.p = srg14;
        srg srg15 = new srg("Record not found", 106, (byte)0x83);
        srg.q = srg15;
        srg srg16 = new srg("Security condition not satisfied", 105, (byte)0x82);
        srg.r = srg16;
        srg srg17 = new srg("No precise diagnosis", 0x6F, 0);
        srg.s = srg17;
        srg srg18 = new srg("Wrong data", 106, (byte)0x80);
        srg.t = srg18;
        srg srg19 = new srg("Wrong length", 103, 0);
        srg.u = srg19;
        srg srg20 = new srg("Wrong parameters (P1,P2)", 107, 0);
        srg.v = srg20;
        srg srg21 = new srg("More data available", 99, 16);
        srg.w = srg21;
        ArrayList arrayList0 = new ArrayList();
        srg.z = arrayList0;
        arrayList0.add(srg0);
        arrayList0.add(srg1);
        arrayList0.add(srg2);
        arrayList0.add(srg3);
        arrayList0.add(srg4);
        arrayList0.add(srg5);
        arrayList0.add(srg6);
        arrayList0.add(srg7);
        arrayList0.add(srg9);
        arrayList0.add(srg10);
        arrayList0.add(srg11);
        arrayList0.add(srg12);
        arrayList0.add(srg13);
        arrayList0.add(srg14);
        arrayList0.add(srg15);
        arrayList0.add(srg16);
        arrayList0.add(srg17);
        arrayList0.add(srg18);
        arrayList0.add(srg19);
        arrayList0.add(srg20);
        arrayList0.add(srg8);
        arrayList0.add(srg21);
    }

    public srg(String s, byte b, byte b1) {
        this.x = s;
        this.y = b;
        this.A = b1;
    }

    public static srg a(byte[] arr_b) {
        int v = arr_b[0];
        srg srg0 = srg.c;
        if(v == srg0.y) {
            return new srg(srg0.x, ((byte)v), arr_b[1]);
        }
        for(Object object0: srg.z) {
            srg srg1 = (srg)object0;
            if(srg1.y == arr_b[0] && srg1.A == arr_b[1]) {
                return srg1;
            }
        }
        return new srg("Undefined", arr_b[0], arr_b[1]);
    }

    public final byte[] b() {
        return new byte[]{this.y, this.A};
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof srg)) {
            return false;
        }
        return this.y == srg.c.y || this.y == srg.g.y ? this.y == ((srg)object0).y && this.x.equals(((srg)object0).x) : this.y == ((srg)object0).y && this.A == ((srg)object0).A && this.x.equals(((srg)object0).x);
    }

    @Override
    public final int hashCode() {
        return this.y * 0x1F + this.A + this.x.hashCode();
    }
}

