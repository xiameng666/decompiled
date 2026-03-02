import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class esun {
    private static final Logger a;
    private static final String b;
    private final esup c;
    private final estr d;
    private int e;
    private essp f;

    static {
        esun.a = Logger.getLogger(esun.class.getName());
        esun.b = "GPAY: esun ";
    }

    public esun() {
        this.e = 0x9000;
        this.c = new esup();
        this.d = new estr();
    }

    public final esta a(byte[] arr_b, essp essp0, boolean z) {
        this.f = essp0;
        if(z) {
            if(this.d.J(5) != esta.i && this.d.J(6) != esta.i) {
                return esta.h;
            }
            estr.g = 6;
        }
        esta esta0 = esta.c(this.e);
        estr estr0 = this.d;
        estr0.h = essp0;
        esup esup0 = this.c;
        esup0.b(arr_b);
        String s = essz.a(new byte[]{esup0.c, esup0.d});
        if(z) {
            this.e = 0x9000;
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.f.G());
            byte[] arr_b1 = esup0.a();
            switch(s) {
                case "DF04": {
                    byteBuffer0.position(estd.b.l);
                    essp essp1 = this.f;
                    essp1.p = Short.parseShort(essz.a(arr_b1));
                    byteBuffer0.put(((byte)this.f.p));
                    break;
                }
                case "DF06": {
                    esun.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SpecialCommandImpl", "processPut", esun.b + "Put for SPENDING limit received");
                    byteBuffer0.position(estd.c.l);
                    this.f.x(arr_b1);
                    byteBuffer0.put(this.f.V(), 0, estd.c.m);
                    break;
                }
                case "DF13": {
                    byteBuffer0.position(estd.e.l);
                    this.f.q(arr_b1);
                    byteBuffer0.put(this.f.K(), 0, estd.e.m);
                    break;
                }
                case "DF1A": {
                    byteBuffer0.position(estd.i.l);
                    this.f.r(arr_b1);
                    byteBuffer0.put(this.f.L(), 0, estd.i.m);
                    break;
                }
                case "DF1C": {
                    byteBuffer0.position(estd.h.l);
                    this.f.s(arr_b1);
                    byteBuffer0.put(this.f.M(), 0, estd.h.m);
                    break;
                }
                case "DF1E": {
                    byteBuffer0.position(estd.g.l);
                    this.f.u(arr_b1);
                    byteBuffer0.put(this.f.O(), 0, estd.g.m);
                    break;
                }
                case "DF2B": {
                    byteBuffer0.position(estd.j.l);
                    this.f.t(arr_b1);
                    byteBuffer0.put(this.f.N(), 0, estd.j.m);
                    break;
                }
                case "DF2D": {
                    byteBuffer0.position(estd.f.l);
                    this.f.v(arr_b1);
                    byteBuffer0.put(this.f.Q(), 0, estd.f.m);
                    break;
                }
                case "DF56": {
                    byteBuffer0.position(estd.d.l);
                    this.f.p(arr_b1);
                    byteBuffer0.put(arr_b1, 0, arr_b1.length);
                    break;
                }
                default: {
                    this.e = 0x6A88;
                }
            }
            this.f.o(byteBuffer0.array());
            return z ? esta0 : esta.a(new byte[0], this.e);
        }
        this.e = 0x9000;
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(this.f.G());
        switch(s) {
            case "0082": {
                return z ? esta0 : esta.a(essy.d(essy.c(130, this.f.J())), this.e);
            }
            case "9F36": {
                ByteBuffer byteBuffer2 = ByteBuffer.wrap(this.f.s);
                byte[] arr_b2 = new byte[2];
                byteBuffer2.position(estb.b.X);
                byteBuffer2.get(arr_b2, 0, 2);
                return z ? esta0 : esta.a(essy.d(essy.c(0x9F36, arr_b2)), this.e);
            }
            case "DF04": {
                byteBuffer1.position(estd.b.l);
                byte[] arr_b3 = new byte[2];
                byte[] arr_b4 = Arrays.copyOfRange(ests.a, 0, 2);
                byteBuffer1.get(arr_b3, 0, estd.b.m);
                if(Arrays.equals(arr_b3, arr_b4)) {
                    arr_b3 = esuq.o(this.f.p);
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF04, arr_b3)), this.e);
            }
            case "DF06": {
                byteBuffer1.position(estd.c.l);
                byte[] arr_b5 = new byte[6];
                byte[] arr_b6 = Arrays.copyOfRange(ests.a, 0, 6);
                byteBuffer1.get(arr_b5, 0, estd.c.m);
                if(Arrays.equals(arr_b5, arr_b6)) {
                    esun.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SpecialCommandImpl", "getSpendingLimit", esun.b + "Get data for SPENDING limit is Zero hence copying from profile");
                    arr_b5 = this.f.V();
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF06, arr_b5)), this.e);
            }
            case "DF13": {
                if(estr0.J(2) != esta.i && estr0.J(1) != esta.i) {
                    byteBuffer1.position(estd.e.l);
                    byte[] arr_b7 = new byte[8];
                    byte[] arr_b8 = Arrays.copyOfRange(ests.a, 0, 8);
                    byteBuffer1.get(arr_b7, 0, estd.e.m);
                    if(Arrays.equals(arr_b7, arr_b8)) {
                        arr_b7 = this.f.K();
                    }
                    return z ? esta0 : esta.a(essy.d(essy.c(0xDF13, arr_b7)), this.e);
                }
                this.e = 27013;
                return z ? esta0 : esta.a(new byte[0], this.e);
            }
            case "DF1A": {
                byteBuffer1.position(estd.i.l);
                byte[] arr_b9 = new byte[10];
                byte[] arr_b10 = Arrays.copyOfRange(ests.a, 0, 10);
                byteBuffer1.get(arr_b9, 0, estd.i.m);
                if(Arrays.equals(arr_b9, arr_b10)) {
                    arr_b9 = this.f.L();
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF1A, arr_b9)), this.e);
            }
            case "DF1C": {
                byteBuffer1.position(estd.h.l);
                byte[] arr_b11 = new byte[10];
                byte[] arr_b12 = Arrays.copyOfRange(ests.a, 0, 10);
                byteBuffer1.get(arr_b11, 0, estd.h.m);
                if(Arrays.equals(arr_b11, arr_b12)) {
                    arr_b11 = this.f.M();
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF1C, arr_b11)), this.e);
            }
            case "DF1E": {
                byteBuffer1.position(estd.g.l);
                byte[] arr_b13 = new byte[10];
                byte[] arr_b14 = Arrays.copyOfRange(ests.a, 0, 10);
                byteBuffer1.get(arr_b13, 0, estd.g.m);
                if(Arrays.equals(arr_b13, arr_b14)) {
                    arr_b13 = this.f.O();
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF1E, arr_b13)), this.e);
            }
            case "DF2B": {
                byteBuffer1.position(estd.j.l);
                byte[] arr_b15 = new byte[10];
                byte[] arr_b16 = Arrays.copyOfRange(ests.a, 0, 10);
                byteBuffer1.get(arr_b15, 0, estd.j.m);
                if(Arrays.equals(arr_b15, arr_b16)) {
                    arr_b15 = this.f.N();
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF2B, arr_b15)), this.e);
            }
            case "DF2C": {
                byte[] arr_b17 = new byte[1];
                ByteBuffer byteBuffer3 = ByteBuffer.wrap(this.f.s);
                byteBuffer3.position(estb.F.X);
                byteBuffer3.get(arr_b17, 0, estb.F.Y);
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF2C, arr_b17)), this.e);
            }
            case "DF2D": {
                byteBuffer1.position(estd.f.l);
                byte[] arr_b18 = new byte[6];
                byte[] arr_b19 = Arrays.copyOfRange(ests.a, 0, 6);
                byteBuffer1.get(arr_b18, 0, estd.f.m);
                if(Arrays.equals(arr_b18, arr_b19)) {
                    arr_b18 = this.f.Q();
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF2D, arr_b18)), this.e);
            }
            case "DF2E": {
                byte[] arr_b20 = estr0.G(este.b);
                byte[] arr_b21 = new byte[6];
                if(Arrays.equals(arr_b20, Arrays.copyOfRange(ests.a, 0, 2))) {
                    return z ? esta0 : esta.a(essy.d(essy.c(0xDF2E, this.f.R())), this.e);
                }
                byte[] arr_b22 = (byte[])this.f.d().get(essz.a(arr_b20));
                if(arr_b22 != null) {
                    this.f.A(Arrays.copyOfRange(arr_b22, 0, arr_b22.length));
                    arr_b21 = estr0.G(este.u);
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF2E, arr_b21)), this.e);
            }
            case "DF56": {
                byteBuffer1.position(estd.d.l);
                byte[] arr_b23 = new byte[15];
                byte[] arr_b24 = Arrays.copyOfRange(ests.a, 0, 15);
                byteBuffer1.get(arr_b23, 0, estd.d.m);
                if(Arrays.equals(arr_b23, arr_b24)) {
                    arr_b23 = this.f.H();
                }
                return z ? esta0 : esta.a(essy.d(essy.c(0xDF56, arr_b23)), this.e);
            }
            default: {
                this.e = 0x6A88;
                return z ? esta0 : esta.a(new byte[0], this.e);
            }
        }
    }
}

