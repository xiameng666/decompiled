import j..util.Objects;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class estt {
    private static final Logger a;
    private esup b;
    private esur c;
    private esur d;
    private esur e;
    private esur f;
    private byte g;
    private estr h;
    private byte i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private final esuo q;
    private byte[] r;
    private byte[] s;
    private ByteBuffer t;
    private essp u;

    static {
        estt.a = Logger.getLogger(estt.class.getName());
    }

    public estt() {
        this.l = new byte[6];
        this.m = new byte[6];
        this.n = new byte[6];
        this.o = new byte[6];
        this.r = new byte[8];
        this.p = new byte[0x20];
        this.s = new byte[2];
        this.q = new esuo();
        this.i = 29;
        this.g = 0;
    }

    private final void A() {
        if(this.h.K() != 3) {
            if(this.h.C(estq.i) && !this.h.s(esth.b)) {
                this.h.M(3);
                return;
            }
            if(!this.h.C(estq.e)) {
                this.B();
                return;
            }
            if(!this.h.s(esth.c)) {
                this.h.M(3);
                return;
            }
            if(!this.h.s(esth.i)) {
                this.B();
                return;
            }
            if(this.n(4) == 2) {
                switch(this.h.K()) {
                    case 1: 
                    case 3: {
                        break;
                    }
                    default: {
                        this.B();
                    }
                }
            }
        }
    }

    private final void B() {
        if(this.n(1) != 2) {
            this.h.M(3);
            return;
        }
        if(this.h.K() != 3) {
            if(this.i != 0xFFFFFFD1) {
                if(!this.h.C(estq.k)) {
                    goto label_17;
                }
                if(this.n(2) != 2) {
                    this.h.M(3);
                    return;
                }
                switch(this.h.K()) {
                    case 1: {
                        this.h.M(1);
                        return;
                    label_17:
                        if(this.h.C(estq.j)) {
                            this.h.M(2);
                            return;
                        }
                        if(this.h.K() == 2) {
                            this.h.M(3);
                            return;
                        }
                        this.h.M(1);
                        return;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        this.h.M(2);
                    }
                }
            }
            else if(Arrays.equals(this.e.c("8A"), essz.b("5933")) && this.n(3) != 2) {
                this.h.M(3);
            }
        }
    }

    private final void C() {
        este este0 = este.c;
        byte[] arr_b = this.h.G(este0);
        if(this.h.z(estm.c, arr_b)) {
            byte[] arr_b16 = {((byte)(this.h.H(estf.e)[0] - 1))};
            this.h.q(estf.e, arr_b16);
            byte[] arr_b17 = this.h.G(este0);
            if(this.h.z(estm.a, arr_b17)) {
                byte[] arr_b18 = {((byte)(this.h.H(estf.g)[0] - 1))};
                this.h.q(estf.g, arr_b18);
            }
            byte[] arr_b19 = this.u.L.c("DF16");
            this.h.i(arr_b19);
            this.h.j(arr_b19);
        }
        else {
            estr estr0 = this.h;
            byte[] arr_b1 = this.u.L.c("DF16");
            estr0.p(este.b, arr_b1);
            byte[] arr_b2 = this.k();
            byte[] arr_b3 = new byte[2];
            this.t.position(estb.b.X);
            this.t.get(arr_b3, 0, 2);
            this.h.p(este.g, arr_b3);
            estp estp0 = estp.k;
            if(this.h.v(estp0)) {
                estf estf0 = estf.e;
                int v = this.h.H(estf0)[0];
                int v1 = this.t.get(estb.t.X);
                int v2 = this.t.get(estb.S.X);
                if(v1 != -91 && !this.g() && v2 == 90) {
                    v = (byte)(v + 1);
                }
                byte[] arr_b4 = essz.b(esuq.d(((byte)v)));
                this.h.q(estf0, arr_b4);
            }
            byte[] arr_b5 = this.k();
            if(this.h.v(estp0)) {
                int v3 = this.t.get(estb.t.X);
                int v4 = this.t.get(estb.S.X);
                if(v3 != -91) {
                    estf estf1 = estf.g;
                    int v5 = this.h.H(estf1)[0];
                    if(v4 == -91) {
                        this.t.position(estb.T.X);
                        byte[] arr_b8 = new byte[2];
                        this.t.get(arr_b8, 0, 2);
                        estm estm0 = estm.a;
                        if(this.h.z(estm0, arr_b8) && !this.h.z(estm0, arr_b5)) {
                            v5 = (byte)(v5 - 1);
                        }
                        else if(!this.h.z(estm0, arr_b8) && this.h.z(estm0, arr_b5)) {
                            v5 = (byte)(v5 + 1);
                        }
                        byte[] arr_b9 = essz.b(esuq.d(((byte)v5)));
                        this.h.q(estf1, arr_b9);
                    }
                    else {
                        if(this.h.z(estm.a, arr_b5)) {
                            v5 = (byte)(v5 + 1);
                        }
                        byte[] arr_b7 = essz.b(esuq.d(((byte)v5)));
                        this.h.q(estf1, arr_b7);
                    }
                }
                else if(this.h.z(estm.a, arr_b5) && v4 != -91) {
                    byte[] arr_b6 = essz.b(esuq.d(((byte)(this.h.H(estf.g)[0] + 1))));
                    this.h.q(estf.g, arr_b6);
                }
            }
            byte[] arr_b10 = this.d.c("9A");
            byte[] arr_b11 = this.d.c("9F21");
            String s = essz.a(arr_b10) + essz.a(arr_b11);
            este este1 = este.h;
            this.h.p(este1, essz.b(s));
            if(this.g() && !this.h.A(estn.c)) {
                this.h.p(este1, essz.b(s));
                this.h.p(este.l, new byte[]{0x60});
                estr estr1 = this.h;
                byte[] arr_b12 = this.d.c("DF45");
                estr1.p(este.m, arr_b12);
            }
            else {
                this.h.p(este1, essz.b(s));
                estr estr2 = this.h;
                byte[] arr_b13 = essz.b(s);
                estr2.p(este.n, arr_b13);
                this.h.p(este.l, new byte[]{0x60});
            }
            estr estr3 = this.h;
            byte[] arr_b14 = this.d.c("5F2A");
            estr3.p(este.k, arr_b14);
            this.h.c(arr_b2);
            this.h.b();
            if(this.t.get(estb.t.X) == -91) {
                byte[] arr_b15 = new byte[2];
                this.t.position(estb.u.X);
                this.t.get(arr_b15, 0, 2);
                this.h.i(arr_b15);
                this.h.j(arr_b15);
            }
        }
        this.t.put(estb.G.X, -91);
    }

    private final void D() {
        byte[] arr_b = this.d.c("9F02");
        byte[] arr_b1 = this.d.c("9F03");
        if(esuq.e(arr_b).compareToIgnoreCase(esuq.e(ests.a).substring(0, 12)) == 0 && esuq.e(arr_b1).compareToIgnoreCase(esuq.e(ests.a).substring(0, 12)) == 0) {
            int v = this.d.c("95")[0];
            if(!estr.t(((byte)v), ((byte)7)) && !estr.t(((byte)v), ((byte)2))) {
                this.h.M(1);
                return;
            }
            this.h.M(2);
            return;
        }
        this.h.M(2);
    }

    private final void E() {
        if(estr.t(this.u.K()[3], ((byte)2))) {
            ArrayList arrayList0 = new ArrayList();
            byte[] arr_b = new byte[15];
            byte[] arr_b1 = Arrays.copyOfRange(ests.a, 0, 15);
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.u.G());
            byteBuffer0.position(estd.d.l);
            byteBuffer0.get(arr_b, 0, estd.d.m);
            if(Arrays.equals(arr_b, arr_b1)) {
                arr_b = this.u.H();
            }
            int v1 = arr_b[0];
            int v2 = arr_b[1];
            int v3 = arr_b[2];
            int v4 = 0;
            while(v4 < v3 - 1) {
                ++v4;
                int v5 = v4 * v2 + 3;
                arrayList0.add(Arrays.copyOfRange(arr_b, v5, v5 + v2));
            }
            byte[] arr_b2 = Arrays.copyOfRange(this.b.a(), v1 - 1, v1 + v2 - 1);
            byte[] arr_b3 = Arrays.copyOfRange(arr_b, 3, v2 + 3);
            for(int v6 = 0; v6 < v2; ++v6) {
                arr_b3[v6] = (byte)(arr_b2[v6] & arr_b3[v6]);
            }
            for(int v = 0; v < v3 - 1; ++v) {
                if(Arrays.equals(((byte[])arrayList0.get(v)), arr_b3)) {
                    this.h.l(estk.u);
                    this.h.k(esti.f);
                }
            }
        }
    }

    private final void F() {
        this.h.l(estk.J);
        this.h.k(esti.p);
        this.h.M(3);
    }

    private final void G() {
        this.h.l(estk.M);
        this.h.k(esti.r);
        this.F();
    }

    private final void H() {
        int v;
        if(this.h.B(esto.b) && this.g()) {
            estr estr0 = this.h;
            if(estr0.G(este.o)[0] < estr0.h.v) {
                v = 0;
            }
            else {
                v = 16;
                this.t.put(estb.F.X, 16);
            }
            estr estr1 = this.h;
            if(estr1.G(este.p)[0] >= estr1.h.u) {
                this.t.put(estb.F.X, ((byte)(v | 8)));
            }
        }
    }

    // This method was un-flattened
    private final void I() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.u.j + 1);
        esuo esuo0 = this.q;
        esuo0.a = this.u.j;
        this.t.position(((int)(((byte)estb.V.X))));
        int v = this.t.get(estb.V.X);
        if(this.i != 29) {
            if(v == -91) {
                byteBuffer0.put(essz.b(esuq.c("00")));
            }
            else {
                byteBuffer0.put(essz.b(esuq.c("01")));
            }
        }
        else if(v != -91) {
            byteBuffer0.put(essz.b(esuq.c("11")));
        }
        else {
            byteBuffer0.put(essz.b(esuq.c("10")));
        }
        int v1 = 1;
        for(Object object0: this.u.i.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = ((String)map$Entry0.getKey()).toUpperCase(Locale.getDefault());
            byte[] arr_b = new byte[((esus)map$Entry0.getValue()).b];
            switch(s) {
                case "9A": 
                case "9C": 
                case "9F1C": {
                    arr_b = this.d.c(s.toUpperCase(Locale.getDefault()));
                    break;
                }
                case "9F02": {
                    arr_b = this.d.c(s.toUpperCase(Locale.getDefault()));
                    break;
                }
                case "9F03": {
                    arr_b = this.d.c(s.toUpperCase(Locale.getDefault()));
                    break;
                }
                case "9F27": {
                    this.t.position(estb.d.X);
                    arr_b = essz.b(esuq.c(String.valueOf(this.t.get())));
                    break;
                }
                case "9F36": {
                    this.t.position(estb.b.X);
                    this.t.get(arr_b);
                    break;
                }
                case "9F37": {
                    arr_b = this.d.c(s.toUpperCase(Locale.getDefault()));
                    break;
                }
                case "DF16": {
                    if(this.h.B(esto.b)) {
                        arr_b = this.u.L.c(s.toUpperCase(Locale.getDefault()));
                    }
                    break;
                }
                case "E2": {
                    byte[] arr_b1 = this.d.c("DF45");
                    arr_b = Array.getLength(arr_b1) == 0 ? Arrays.copyOfRange(ests.a, 0, 0x60) : arr_b1;
                    break;
                }
                default: {
                    continue;
                }
            }
            byteBuffer0.position(v1);
            if(arr_b != null) {
                byteBuffer0.put(arr_b, 0, arr_b.length);
            }
            v1 += ((esus)map$Entry0.getValue()).b;
        }
        byte[] arr_b2 = byteBuffer0.array();
        if(arr_b2.length == 0 || !esuo0.b.isEmpty() && arr_b2.length != esuo0.a + 1) {
            return;
        }
        esuo0.a = arr_b2.length - 1;
        esuo0.b.addFirst(arr_b2);
        if(esuo0.b.size() > 10) {
            esuo0.b.removeLast();
        }
        esuo0.c.F(esuo0.b);
    }

    public final esta a(byte[] arr_b, essp essp0) {
        esta esta3;
        esta esta1;
        int v;
        this.u = essp0;
        this.j = essp0.s;
        this.k = essp0.t;
        this.b = new esup();
        estr estr0 = new estr(this.u);
        this.h = estr0;
        estr0.Q();
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.j);
        this.t = byteBuffer0;
        byteBuffer0.position(estb.i.X);
        this.t.get(this.m, 0, estb.i.Y);
        this.b.b(arr_b);
        this.h.c = this.b.c;
        this.u = essp0;
        esta esta0 = esta.i;
        if(this.h.J(4) == esta0) {
            this.h.M(5);
            this.i = 29;
            v = 2;
        }
        else {
            this.h.f = esta.a;
            v = 6;
        }
        if(v == 2) {
            essp essp1 = this.u;
            esun esun0 = new esun();
            String s = (String)esuu.a(essz.a(esun0.a(essz.b("80CADF1300"), essp1, false).d())).get("DF13");
            if(s != null) {
                essp1.q(essz.b(s));
            }
            String s1 = (String)esuu.a(essz.a(esun0.a(essz.b("80CADF1A00"), essp1, false).d())).get("DF1A");
            if(s1 != null) {
                essp1.r(essz.b(s1));
            }
            String s2 = (String)esuu.a(essz.a(esun0.a(essz.b("80CADF2B00"), essp1, false).d())).get("DF2B");
            if(s2 != null) {
                essp1.t(essz.b(s2));
            }
            String s3 = (String)esuu.a(essz.a(esun0.a(essz.b("80CADF1C00"), essp1, false).d())).get("DF1C");
            if(s3 != null) {
                essp1.s(essz.b(s3));
            }
            String s4 = (String)esuu.a(essz.a(esun0.a(essz.b("80CADF1E00"), essp1, false).d())).get("DF1E");
            if(s4 != null) {
                essp1.u(essz.b(s4));
            }
            essp1.v(essz.b(((String)Objects.requireNonNull(((String)esuu.a(essz.a(esun0.a(essz.b("80CADF2D00"), essp1, false).d())).get("DF2D"))))));
            estr.g = 4;
            this.h.h = this.u;
            this.q.b(this.u);
        }
        if(v == 2) {
            int v1 = this.i;
            if(v1 == 29) {
                v = this.p();
                esta1 = esta0;
            }
            else if(v1 == 0xFFFFFFD1) {
                if(this.h.J(4) == esta0) {
                    estr.N(3);
                    esup esup0 = this.b;
                    if(esup0.a != 0xFFFFFF80) {
                        estr.g = 3;
                        this.h.f = esta.g;
                        v = 6;
                    }
                    else if((this.h.c & 0x2F) != 0 || esup0.d != 0 || this.h.O(2)) {
                        this.h.f = esta.c;
                        v = 6;
                    }
                    else if(this.h.O(4)) {
                        this.h.f = esta.l;
                        v = 6;
                    }
                    else {
                        esur esur0 = this.e;
                        if(esur0.a) {
                            int v2 = this.b.e;
                            if(this.u.f.i == v2 && v2 != 0) {
                                byte[] arr_b1 = esur0.b("9F37");
                                if(esuq.e(arr_b1).compareToIgnoreCase(esuq.e(ests.a).substring(0, 4)) == 0) {
                                    v = 6;
                                }
                                else if(Arrays.equals(arr_b1, this.h.I("9F37"))) {
                                    int v3 = this.e.c("95")[0];
                                    if(estr.t(((byte)v3), ((byte)2)) || estr.t(((byte)v3), ((byte)7))) {
                                        this.h.l(estk.x);
                                        this.h.k(esti.g);
                                    }
                                    v = 2;
                                }
                                else {
                                    v = 6;
                                }
                                if(v == 2) {
                                    byte[] arr_b2 = this.h.I("DF91");
                                    this.t.position(estb.S.X);
                                    this.t.put(estb.S.X, arr_b2[0]);
                                    byte[] arr_b3 = this.h.I("DF92");
                                    this.t.position(estb.T.X);
                                    this.t.put(arr_b3, 0, 2);
                                    this.h.r("DF92", arr_b3);
                                    this.h.M(5);
                                    this.t.position(((int)(((byte)estb.V.X))));
                                    this.t.put(((int)(((byte)estb.V.X))), 90);
                                    byte[] arr_b4 = new byte[1];
                                    this.t.position(estb.H.X);
                                    this.t.get(arr_b4);
                                    if(arr_b4[0] == 0) {
                                        this.h.m(arr_b4, this.k, estc.g.i);
                                    }
                                    v = 2;
                                }
                            }
                            else {
                                this.h.f = esta.f;
                                v = 6;
                            }
                        }
                        else {
                            this.h.f = esta.f;
                            v = 6;
                        }
                    }
                }
                else {
                    estr.N(3);
                    this.h.f = esta.a;
                    v = 3;
                }
                if(v == 2) {
                    this.h.e(estk.p);
                    this.h.d(esti.d);
                    this.h.f();
                    byte[] arr_b5 = this.e.c("8A");
                    if(arr_b5.length != 2) {
                        this.h.f = esta.e;
                        esta1 = esta0;
                        v = 6;
                    }
                    else if(!Arrays.equals(arr_b5, essz.b("5933")) && !Arrays.equals(arr_b5, essz.b("5A33")) && !Arrays.equals(arr_b5, essz.b("5a33"))) {
                        this.t.position(estb.c.X);
                        byte[] arr_b6 = new byte[2];
                        this.t.get(arr_b6);
                        this.h.m(arr_b6, this.k, estc.c.i);
                        this.t.putShort(estb.c.X, 0);
                        this.h.e(estk.y);
                        if(essz.a(Arrays.copyOfRange(this.e.c("91"), 0, 4)).compareToIgnoreCase(essz.a(ests.a).substring(0, 8)) == 0) {
                            this.h.l(estk.m);
                            if(this.h.s(esth.a)) {
                                this.h.n(estl.b);
                                this.h.M(3);
                            }
                            else {
                                this.t.put(estb.H.X, -91);
                                this.t.position(estb.H.X);
                                byte[] arr_b7 = new byte[1];
                                this.t.get(arr_b7);
                                this.h.m(arr_b7, this.k, estc.g.i);
                            }
                            esta1 = esta0;
                            v = 2;
                        }
                        else {
                            this.h.e(estk.m);
                            this.t.put(estb.H.X, 90);
                            this.t.position(estb.H.X);
                            byte[] arr_b8 = new byte[1];
                            this.t.get(arr_b8);
                            this.h.m(arr_b8, this.k, estc.g.i);
                            byte[] arr_b9 = this.e.c("91");
                            if(arr_b9.length == 16) {
                                byte[] arr_b10 = Arrays.copyOfRange(arr_b9, 4, 8);
                                byte[] arr_b11 = Arrays.copyOfRange(arr_b9, 8, 16);
                                byte[] arr_b12 = this.h.I("9F26");
                                esta1 = esta0;
                                byte[] arr_b13 = (arr_b10[0] & 0x80) == 0x80 ? glwl.d(new byte[][]{arr_b12, Arrays.copyOfRange(arr_b9, 4, 16)}) : glwl.d(new byte[][]{arr_b12, arr_b10});
                                int v4 = this.t.getShort(estb.b.X) - 1;
                                ByteBuffer byteBuffer1 = ByteBuffer.allocate(2);
                                byteBuffer1.putShort(((short)v4));
                                try {
                                    byte[] arr_b14 = esul.d(arr_b13, esul.e(essz.a(byteBuffer1.array()), this.u));
                                }
                                catch(Exception exception0) {
                                    estt.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GenAcImpl", "processIssuerAuthData", exception0.getMessage(), exception0);
                                    this.h.f = esta.n;
                                    v = 6;
                                    goto label_184;
                                }
                                if(essz.a(arr_b14).compareToIgnoreCase(essz.a(ests.a).substring(0, 8)) == 0) {
                                    this.h.f = esta.n;
                                    v = 6;
                                }
                                else {
                                    if(Arrays.equals(arr_b9, glwl.d(new byte[][]{Arrays.copyOfRange(arr_b14, 0, 4), arr_b10, arr_b11}))) {
                                        this.t.put(estb.H.X, -91);
                                        this.t.position(estb.H.X);
                                        byte[] arr_b15 = new byte[1];
                                        this.t.get(arr_b15);
                                        this.h.m(arr_b15, this.k, estc.g.i);
                                        this.t.position(estb.I.X);
                                        this.t.put(arr_b10, 0, estb.I.Y);
                                    }
                                    else {
                                        this.h.l(estk.n);
                                        this.h.n(estl.a);
                                        this.h.M(3);
                                    }
                                    v = 2;
                                }
                            }
                            else {
                                this.h.f = esta.e;
                                esta1 = esta0;
                                v = 6;
                            }
                        label_184:
                            estb estb0 = estb.H;
                            int v5 = estb0.X;
                            if(this.t.get(v5) == -91) {
                                int v6 = this.h.L(this.j, v5, this.k, estc.g.i, estb0.Y);
                                if(v6 != 2) {
                                    v = v6;
                                }
                                else if(this.h.K() == 3 || this.h.w(estk.n) || this.h.w(estk.m)) {
                                    this.h.f = esta.n;
                                    v = 6;
                                }
                                else {
                                    goto label_205;
                                }
                            }
                            else if(this.h.s(esth.a)) {
                                this.h.n(estl.a);
                                if(this.h.K() != 3) {
                                    this.h.l(estk.n);
                                }
                            label_205:
                                if(v == 2) {
                                    byte[] arr_b16 = new byte[4];
                                    this.t.position(estb.I.X);
                                    this.t.get(arr_b16, 0, estb.I.Y);
                                    if(this.h.u(estj.f, arr_b16) || this.h.u(estj.g, arr_b16)) {
                                        this.t.position(estb.j.X);
                                        this.t.put(new byte[2], 0, 2);
                                        byte[] arr_b17 = new byte[2];
                                        this.t.get(arr_b17);
                                        this.h.m(arr_b17, this.k, estc.f.i);
                                        this.t.position(estb.k.X);
                                        this.t.put(new byte[6], 0, 6);
                                        byte[] arr_b18 = new byte[6];
                                        this.t.get(arr_b18);
                                        this.h.m(arr_b18, this.k, estc.e.i);
                                        this.h.e(estk.V);
                                        this.h.d(esti.z);
                                        this.h.e(estk.W);
                                        this.h.d(esti.A);
                                    }
                                    if(this.h.u(estj.d, arr_b16)) {
                                        this.h.n(estl.c);
                                    }
                                    v = 2;
                                }
                                else {
                                    this.h.l(estk.n);
                                    this.h.n(estl.a);
                                }
                            }
                            else {
                                this.t.put(v5, -91);
                                this.t.position(v5);
                                this.t.get(arr_b8);
                                this.h.m(arr_b8, this.k, estc.g.i);
                                v = 2;
                            }
                        }
                    }
                    else {
                        esta1 = esta0;
                        this.h.l(estk.y);
                        this.h.n(estl.e);
                        if(Arrays.equals(arr_b5, essz.b("5933")) && this.h.O(1)) {
                            this.h.l(estk.m);
                            if(this.h.s(esth.a)) {
                                this.h.n(estl.b);
                                this.h.M(3);
                            }
                        }
                        else {
                            this.h.M(3);
                        }
                        v = 2;
                    }
                    if(v == 2) {
                        if(!this.h.w(estk.L)) {
                        label_282:
                            v = 2;
                        }
                        else if(this.h.v(estp.f)) {
                            this.h.l(estk.M);
                            this.h.k(esti.r);
                            this.h.l(estk.J);
                            this.h.k(esti.p);
                            this.h.M(3);
                            v = 2;
                        }
                        else {
                            estb estb1 = estb.H;
                            int v7 = estb1.X;
                            if(this.t.get(v7) == -91) {
                                v = this.h.L(this.j, v7, this.k, estc.g.i, estb1.Y);
                                if(v == 2) {
                                    if(this.h.v(estp.k)) {
                                        byte[] arr_b19 = Arrays.copyOfRange(this.e.c("91"), 10, 12);
                                        byte[] arr_b20 = Arrays.copyOfRange(this.e.c("91"), 8, 10);
                                        byte[] arr_b21 = this.h.I("DF15");
                                        byte[] arr_b22 = this.h.I("DF16");
                                        if(!Arrays.equals(arr_b19, arr_b21) && Arrays.equals(arr_b22, arr_b20)) {
                                            this.h.l(estk.J);
                                            this.h.k(esti.p);
                                            this.h.M(3);
                                            goto label_282;
                                        }
                                        goto label_267;
                                    }
                                    else {
                                    label_267:
                                        if(this.t.get(estb.t.X) == -91) {
                                            this.h.l(estk.H);
                                            this.h.k(esti.n);
                                        }
                                        else {
                                            this.h.l(estk.G);
                                            this.h.k(esti.m);
                                        }
                                        this.h.l(estk.K);
                                        this.h.k(esti.q);
                                        this.t.put(estb.J.X, -91);
                                    }
                                    goto label_282;
                                }
                            }
                            else {
                                this.h.l(estk.J);
                                this.h.k(esti.p);
                                this.h.M(3);
                                v = 2;
                            }
                        }
                        if(v == 2) {
                            if(this.h.K() != 3) {
                                if(this.h.O(3)) {
                                    byte[] arr_b23 = new byte[8];
                                    this.t.position(estb.n.X);
                                    this.t.get(arr_b23, 0, 8);
                                    arr_b23[0] = (byte)(arr_b23[0] & 15);
                                    this.t.position(estb.n.X);
                                    this.t.put(arr_b23, 0, 8);
                                    essp essp2 = this.u;
                                    essp2.s = this.t.array();
                                    this.h.M(3);
                                }
                                else if(!this.h.O(2)) {
                                    if(this.h.O(1)) {
                                        int v8 = this.i;
                                        if(v8 == 29) {
                                            this.h.M(1);
                                        }
                                        else if(v8 == 0xFFFFFFD1) {
                                            byte[] arr_b24 = this.e.c("8A");
                                            if(Arrays.equals(arr_b24, essz.b("5933")) || Arrays.equals(arr_b24, essz.b("3030"))) {
                                                this.h.M(1);
                                            }
                                        }
                                    }
                                }
                                else if(!this.h.C(estq.i)) {
                                    this.h.M(2);
                                }
                                else {
                                    this.h.M(3);
                                }
                            }
                            this.A();
                            v = this.m();
                            if(v == 2) {
                                v = 2;
                            }
                        }
                    }
                }
                else {
                    esta1 = esta0;
                }
            }
            else {
                esta1 = esta0;
            }
        }
        else {
            esta1 = esta0;
        }
        if(v == 2) {
            if(this.q() != 2) {
                estr.g = 3;
            }
            if(this.h.s(esth.f)) {
                byte[] arr_b25 = new byte[estb.b.Y];
                this.t.position(estb.b.X);
                this.t.get(arr_b25, 0, estb.b.Y);
                byte[] arr_b26 = new byte[estb.d.Y];
                this.t.position(estb.d.X);
                this.t.get(arr_b26, 0, estb.d.Y);
                byte[] arr_b27 = ByteBuffer.allocate(56).put(arr_b25).put(this.d.c("9F37")).put(this.d.c("9F1C")).put(this.p).put(this.r).put(arr_b26).put(-91).array();
                this.u.z(arr_b27);
            }
            this.t.position(estb.d.X);
            int v9 = this.t.get();
            byte[] arr_b28 = new byte[estb.b.Y];
            this.t.position(estb.b.X);
            this.t.get(arr_b28, 0, estb.b.Y);
            esta esta2 = esta.a(essy.d(essy.a(0x77, new esss[]{essy.c(0x9F27, essz.b(esuq.c(String.valueOf(v9)))), essy.c(0x9F36, arr_b28), essy.c(0x9F26, this.r), essy.c(0x9F10, this.p)})), 0x9000);
            if(this.h.K() == 2) {
                estr.g = 2;
                byte[] arr_b29 = new byte[8];
                this.t.position(estb.A.X);
                this.t.get(arr_b29, 0, 8);
                this.h.r("DF4B", arr_b29);
                this.h.r("9F26", this.r);
                this.h.r("9F02", this.d.c("9F02"));
                this.h.r("9F03", this.d.c("9F03"));
                this.h.r("DF15", this.d.c("DF15"));
                this.h.r("DF16", this.c.c("DF16"));
                this.h.r("DF45", this.d.c("DF45"));
                this.h.r("9F4C", this.d.c("9F4C"));
                this.h.r("9A", this.d.c("9A"));
                this.h.r("9F37", this.d.c("9F37"));
                this.h.r("9F1C", this.d.c("9F1C"));
                this.h.r("9F35", this.d.c("9F35"));
                this.h.r("9F1A", this.d.c("9F1A"));
                this.h.r("5F2A", this.d.c("5F2A"));
                this.h.r("9C", this.d.c("9C"));
                this.h.r("9F21", this.d.c("9F21"));
                byte[] arr_b30 = new byte[8];
                this.t.position(estb.n.X);
                this.t.get(arr_b30, 0, 8);
                this.h.r("DF21", arr_b30);
                this.t.position(estb.S.X);
                byte[] arr_b31 = new byte[1];
                this.t.get(arr_b31, 0, 1);
                this.h.r("DF91", arr_b31);
                this.t.position(estb.T.X);
                byte[] arr_b32 = new byte[2];
                this.t.get(arr_b32, 0, 2);
                this.h.r("DF92", arr_b32);
                this.t.position(estb.s.X);
                byte[] arr_b33 = new byte[1];
                this.t.get(arr_b33, 0, 1);
                this.h.r("DF93", arr_b33);
            }
            else {
                estr.g = 6;
            }
            esta3 = esta2;
        }
        else {
            esta3 = v == 3 || v == 6 ? this.h.f : esta1;
        }
        this.u.s = this.j;
        return esta3;
    }

    private final void b() {
        if(!this.g()) {
            byte[] arr_b = this.k();
            this.h.p(este.c, arr_b);
            byte[] arr_b1 = this.d.c("DF45");
            estr estr0 = this.h;
            byte[] arr_b2 = Arrays.copyOfRange(arr_b1, 20, 26);
            estr0.p(este.u, arr_b2);
        }
        this.h.p(este.l, new byte[]{0x60});
    }

    private final void c() {
        this.t.put(estb.s.X, 90);
        this.t.put(estb.S.X, -91);
        byte[] arr_b = this.h.G(este.c);
        this.t.position(estb.T.X);
        this.t.put(arr_b, 0, 2);
        byte[] arr_b1 = this.u.Y();
        Arrays.fill(arr_b1, 5, arr_b1.length, 0);
        this.u.A(arr_b1);
    }

    private final void d() {
        this.h.l(estk.z);
        if(this.h.B(esto.b) && !this.h.w(estk.M)) {
            this.h.l(estk.K);
        }
        if(!this.h.O(1) && !this.h.O(2)) {
            return;
        }
        if(!this.h.C(estq.k) && !this.h.C(estq.j)) {
            this.h.M(3);
            return;
        }
        this.h.M(2);
    }

    private final boolean e(byte[] arr_b) {
        byte[] arr_b1 = this.h.I("DF16");
        if(Arrays.equals(essz.b("FFFE"), arr_b)) {
            return true;
        }
        return this.h.A(estn.j) ? Arrays.equals(arr_b1, arr_b) : false;
    }

    private final boolean f() {
        byte[] arr_b = this.h.G(este.c);
        estn estn0 = estn.a;
        if((this.h.A(estn0) ^ 1) == this.h.z(estm.a, arr_b)) {
            return false;
        }
        if((this.h.A(estn.j) ^ 1) == this.h.z(estm.e, arr_b)) {
            return false;
        }
        if(this.h.A(estn0)) {
            return this.h.z(estm.d, arr_b) ? !this.h.A(estn.h) : this.h.A(estn.h);
        }
        return this.h.z(estm.d, arr_b) ? true : this.h.A(estn.h);
    }

    private final boolean g() {
        return this.t.get(estb.s.X) == -91;
    }

    private final boolean h() {
        if(this.h.A(estn.d) && !this.h.A(estn.c) && !this.h.A(estn.f)) {
            return this.h.A(estn.a) || this.h.A(estn.h) ? esuq.e(this.d.c("DF45")).substring(0, 0x20).compareToIgnoreCase(esuq.e(ests.a).substring(0, 0x20)) != 0 : false;
        }
        return false;
    }

    private final boolean i() {
        if(this.h.A(estn.d)) {
            return false;
        }
        if(this.h.A(estn.g)) {
            return false;
        }
        return this.h.A(estn.b) ? !this.h.A(estn.i) : true;
    }

    private final boolean j() {
        byte[] arr_b = this.h.G(este.o);
        byte[] arr_b1 = this.h.G(este.p);
        return arr_b[0] >= this.u.v || arr_b1[0] >= this.u.u;
    }

    private final byte[] k() {
        byte[] arr_b = this.h.A(estn.a) ? this.h.S(estm.a, new byte[2]) : new byte[2];
        if(this.h.A(estn.e)) {
            arr_b = this.h.S(estm.b, arr_b);
        }
        if(this.h.A(estn.f)) {
            arr_b = this.h.S(estm.c, arr_b);
        }
        if(!this.h.A(estn.h)) {
            arr_b = this.h.S(estm.d, arr_b);
        }
        if(this.h.A(estn.j)) {
            arr_b = this.h.S(estm.e, arr_b);
        }
        return this.h.A(estn.k) ? this.h.S(estm.f, arr_b) : arr_b;
    }

    private final int l() {
        if(this.h.O(3)) {
            this.h.M(3);
        }
        switch(this.h.K()) {
            case 1: {
                esth esth0 = esth.e;
                if(this.h.s(esth0)) {
                    byte[] arr_b = this.d.c("9F02");
                    byte[] arr_b1 = this.d.c("9F03");
                    this.t.position(estb.i.X);
                    this.t.get(this.m, 0, this.m.length);
                    this.l = Arrays.copyOfRange(this.m, 0, this.m.length);
                    this.o = this.d.c("9F02");
                    int v = estb.K.X;
                    this.t.position(v);
                    this.t.put(-91);
                    int v1 = estb.L.X;
                    this.t.position(v1);
                    this.t.put(90);
                    int v2 = this.t.get(estb.r.X);
                    int v3 = this.t.get(estb.w.X);
                    esuq.e(this.d.c("DF45"));
                    byte[] arr_b2 = ests.a;
                    esuq.e(arr_b2);
                    if(v2 != -91 || v3 != -91) {
                    label_43:
                        if(this.h.v(estp.g) || this.h.v(estp.c) || this.h.v(estp.k) || this.h.v(estp.e) || this.h.v(estp.f)) {
                            BigInteger bigInteger7 = new BigInteger(essz.a(this.l), 10);
                            BigInteger bigInteger8 = new BigInteger(essz.a(this.o), 10);
                            int v8 = this.t.get(v1);
                            int v9 = this.t.get(v);
                            if(bigInteger7.compareTo(bigInteger8) < 0) {
                                this.h.l(estk.N);
                                this.h.M(2);
                            }
                            else {
                                BigInteger bigInteger9 = new BigInteger(bigInteger7.subtract(bigInteger8).toString(10));
                                if(v9 == -91) {
                                    this.m = this.h.a(bigInteger9).array();
                                }
                                else if(v8 == -91) {
                                    this.n = this.h.a(bigInteger9).array();
                                }
                                this.h.M(1);
                            }
                        }
                        else if(!this.h.v(estp.h)) {
                            if(this.h.v(estp.i)) {
                                byte[] arr_b5 = this.q.a(1);
                                if(arr_b5 != null && this.u.S() != null) {
                                    byte[] arr_b6 = Arrays.copyOfRange(arr_b5, 1, arr_b5.length);
                                    esur esur0 = new esur(this.u.i, arr_b6, 6);
                                    this.f = esur0;
                                    this.u.y = esur0;
                                    this.g = arr_b5[0];
                                    if(this.v(1, esur0)) {
                                        this.t.position(((int)(((byte)estb.V.X))));
                                        this.t.put(((int)(((byte)estb.V.X))), -91);
                                        if(this.v(2, this.f)) {
                                            this.h.l(estk.E);
                                            goto label_151;
                                        }
                                        else if(!this.v(3, this.f)) {
                                            goto label_151;
                                        }
                                        else if(!this.h.s(esth.o)) {
                                            this.h.l(estk.P);
                                            this.h.M(3);
                                        }
                                        else if(this.v(4, this.f)) {
                                            int v6 = this.t.get(v1);
                                            int v7 = this.t.get(v);
                                            if(!this.v(5, this.f)) {
                                                this.h.l(estk.v);
                                                this.h.M(3);
                                            }
                                            else if(v7 == -91 && this.v(6, this.f)) {
                                                byte[] arr_b7 = this.f.b("9F02");
                                                BigInteger bigInteger0 = new BigInteger(essz.a(this.m), 10);
                                                BigInteger bigInteger1 = new BigInteger(essz.a(arr_b7), 10);
                                                if(bigInteger0.compareTo(bigInteger1) >= 0) {
                                                    BigInteger bigInteger2 = new BigInteger(bigInteger0.subtract(bigInteger1).toString(10));
                                                    this.m = this.h.a(bigInteger2).array();
                                                    this.h.M(1);
                                                }
                                                else {
                                                    this.h.l(estk.N);
                                                    this.h.M(3);
                                                }
                                            }
                                            else if(v6 == -91 && this.v(7, this.f)) {
                                                byte[] arr_b8 = this.f.b("9F03");
                                                BigInteger bigInteger3 = new BigInteger(essz.a(this.n), 10);
                                                BigInteger bigInteger4 = new BigInteger(essz.a(arr_b8), 10);
                                                if(bigInteger3.compareTo(bigInteger4) >= 0) {
                                                    BigInteger bigInteger5 = new BigInteger(bigInteger3.subtract(bigInteger4).toString(10));
                                                    this.n = this.h.a(bigInteger5).array();
                                                    this.h.M(1);
                                                }
                                                else {
                                                    this.h.l(estk.N);
                                                    this.h.M(3);
                                                }
                                            }
                                            else {
                                                this.h.l(estk.v);
                                                this.h.M(3);
                                            }
                                        }
                                        else if(this.h.B(esto.b) && (this.t.get(((int)(((byte)estb.C.X)))) != -91 || this.t.get(((int)(((byte)estb.D.X)))) != -91)) {
                                            this.h.M(2);
                                        }
                                        else if(this.v(5, this.f)) {
                                            BigInteger bigInteger6 = new BigInteger(new BigInteger(essz.a(this.l), 10).add(new BigInteger(essz.a(this.o), 10)).toString(10));
                                            byte[] arr_b9 = this.f.b("9F02");
                                            if(this.t.get(v) != -91 || !this.v(6, this.f) || Arrays.equals(arr_b9, Arrays.copyOfRange(arr_b2, 0, 6)) || esuq.e(arr_b9).compareToIgnoreCase(esuq.e(arr_b2).substring(0, 12)) == 0) {
                                                byte[] arr_b10 = this.f.b("9F03");
                                                if(this.t.get(v1) != -91 || !this.v(7, this.f) || Arrays.equals(arr_b10, Arrays.copyOfRange(arr_b2, 0, 6))) {
                                                    this.h.l(estk.v);
                                                    this.h.M(3);
                                                }
                                                else if(esuq.e(arr_b10).compareToIgnoreCase(esuq.e(arr_b2).substring(0, 12)) == 0) {
                                                    this.h.M(3);
                                                    this.h.l(estk.v);
                                                }
                                                else if(this.w(2, bigInteger6)) {
                                                    this.h.l(estk.t);
                                                    this.h.M(3);
                                                    this.h.M(3);
                                                }
                                                else {
                                                    this.n = this.h.a(bigInteger6).array();
                                                    this.h.M(1);
                                                }
                                            }
                                            else if(this.w(1, bigInteger6)) {
                                                this.h.l(estk.t);
                                                this.h.M(3);
                                            }
                                            else {
                                                this.m = this.h.a(bigInteger6).array();
                                                this.h.M(1);
                                            }
                                        }
                                        else {
                                            this.h.l(estk.v);
                                            this.h.M(3);
                                        }
                                    }
                                    else {
                                        if(!this.v(5, this.f) || !this.v(9, this.f)) {
                                            this.h.l(estk.v);
                                        }
                                        if(this.h.B(esto.b) && !this.v(8, this.f)) {
                                            this.h.l(estk.v);
                                        }
                                        this.h.l(estk.D);
                                        goto label_151;
                                    }
                                }
                                else {
                                    this.h.l(estk.D);
                                label_151:
                                    if(this.h.C(estq.i)) {
                                        this.h.l(estk.P);
                                        this.h.M(3);
                                    }
                                    else {
                                        this.h.M(2);
                                    }
                                }
                            }
                            else if(!this.h.v(estp.j)) {
                                this.d();
                            }
                            else if(this.h.C(estq.i)) {
                                this.h.M(3);
                            }
                            else {
                                this.h.M(2);
                            }
                        }
                        else if(this.h.s(esth.n)) {
                            int v4 = this.t.get(((int)(((byte)estb.C.X))));
                            int v5 = this.t.get(((int)(((byte)estb.D.X))));
                            if(this.t.get(v) != -91 && v4 == -91 && v5 == -91) {
                                this.z();
                            }
                            else {
                                this.h.M(2);
                            }
                        }
                        else {
                            this.h.M(2);
                        }
                    }
                    else if(esuq.e(arr_b).compareToIgnoreCase(esuq.e(arr_b2).substring(0, 12)) != 0 && esuq.e(arr_b1).compareToIgnoreCase(esuq.e(arr_b2).substring(0, 12)) != 0) {
                        this.h.M(3);
                        this.h.l(estk.z);
                    }
                    else {
                        byte[] arr_b3 = this.h.G(este.c);
                        if(!this.h.z(estm.e, arr_b3)) {
                            byte[] arr_b4 = this.h.G(este.j);
                            this.l = Arrays.copyOfRange(arr_b4, 0, arr_b4.length);
                            this.n = Arrays.copyOfRange(arr_b4, 0, arr_b4.length);
                            this.o = Arrays.copyOfRange(arr_b1, 0, arr_b4.length);
                            this.t.position(v1);
                            this.t.put(-91);
                            this.t.position(v);
                            this.t.put(90);
                            goto label_43;
                        }
                        else if(!this.h.s(esth0)) {
                            this.D();
                        }
                        else {
                            goto label_43;
                        }
                    }
                }
                else {
                    this.D();
                }
            label_180:
                switch(this.h.K()) {
                    case 1: {
                        int v10 = this.t.get(estb.L.X);
                        int v11 = this.t.get(estb.K.X);
                        if(this.h.C(estq.j)) {
                            this.h.M(3);
                            return this.h.K() == 3 ? this.o() : 2;
                        }
                        this.h.M(1);
                        this.h.l(estk.i);
                        this.h.l(estk.g);
                        if(this.h.B(esto.b) && !this.h.w(estk.M)) {
                            estk estk0 = estk.K;
                            if(this.h.w(estk0)) {
                                this.t.put(estb.G.X, -91);
                            }
                            if(!this.h.A(estn.j)) {
                                if(v10 == -91) {
                                    this.h.l(estk0);
                                    this.h.p(este.j, this.n);
                                }
                            }
                            else if(v11 == -91) {
                                this.h.p(este.j, this.m);
                            }
                            this.h.l(estk0);
                            this.h.k(esti.q);
                            if(!this.g()) {
                                if(this.t.get(estb.t.X) == -91) {
                                    this.h.l(estk.H);
                                    this.h.k(esti.n);
                                }
                                else {
                                    this.h.l(estk.G);
                                    this.h.k(esti.m);
                                }
                            }
                            this.C();
                        }
                        else {
                            this.h.p(este.j, this.m);
                        }
                        this.h.l(estk.A);
                        if((!this.h.s(esth.d) || !this.h.C(estq.h)) && this.h.v(estp.a)) {
                            int v12 = estb.j.X;
                            int v13 = estc.f.i;
                            int v14 = this.h.L(this.j, v12, this.k, v13, estb.j.Y);
                            if(v14 == 2) {
                                byte[] arr_b11 = new byte[2];
                                this.t.position(v12);
                                this.t.get(arr_b11);
                                String s = esuq.c(new BigInteger(essz.a(arr_b11), 16).add(new BigInteger("1", 16)).toString(16));
                                ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
                                byte[] arr_b12 = essz.b(s);
                                this.t.position(v12);
                                this.t.put(byteBuffer0.put(ests.a, 0, 2 - s.length() / 2).put(arr_b12).array());
                                byte[] arr_b13 = new byte[2];
                                this.t.position(v12);
                                this.t.get(arr_b13);
                                this.h.m(arr_b13, this.k, v13);
                                v14 = this.h.L(this.j, estb.k.X, this.k, estc.e.i, estc.e.j);
                                int v15 = estb.k.X;
                                int v16 = estc.e.i;
                                if(v14 == 2) {
                                    byte[] arr_b14 = new byte[6];
                                    this.t.position(v15);
                                    this.t.get(arr_b14, 0, 6);
                                    BigInteger bigInteger10 = new BigInteger(essz.a(this.d.c("9F02")), 10);
                                    BigInteger bigInteger11 = new BigInteger(new BigInteger(essz.a(arr_b14), 10).add(bigInteger10).toString(10));
                                    ByteBuffer byteBuffer1 = this.h.a(bigInteger11);
                                    this.t.position(v15);
                                    this.t.put(byteBuffer1.array(), 0, byteBuffer1.array().length);
                                    byte[] arr_b15 = new byte[6];
                                    this.t.position(v15);
                                    this.t.get(arr_b15);
                                    this.h.m(arr_b15, this.k, v16);
                                    goto label_249;
                                }
                            }
                            return this.h.K() == 3 ? this.o() : v14;
                        }
                    label_249:
                        if(this.h.s(esth.k)) {
                            if(this.h.v(estp.i)) {
                                this.q.c();
                            }
                            else {
                                this.I();
                            }
                        }
                        this.H();
                        return this.h.K() == 3 ? this.o() : 2;
                    }
                    case 2: {
                        if(!this.h.w(estk.z) && !this.h.E()) {
                            this.d();
                        }
                        if(!this.h.C(estq.i) && this.h.K() != 3) {
                            this.h.M(2);
                            this.h.l(estk.g);
                            this.h.l(estk.k);
                            this.h.n(estl.d);
                            this.H();
                            byte[] arr_b16 = new byte[6];
                            int v17 = estb.g.X;
                            this.t.position(v17);
                            this.t.get(arr_b16, 0, 6);
                            BigInteger bigInteger12 = new BigInteger(essz.a(arr_b16), 10);
                            BigInteger bigInteger13 = new BigInteger(essz.a(this.d.c("9F02")), 10);
                            if(bigInteger13.intValue() != 0) {
                                bigInteger12 = bigInteger12.add(bigInteger13);
                            }
                            ByteBuffer byteBuffer2 = this.h.a(bigInteger12);
                            this.t.position(v17);
                            this.t.put(byteBuffer2.array(), 0, byteBuffer2.array().length);
                            return 2;
                        }
                        return this.o();
                    }
                    case 3: {
                        return this.o();
                    }
                    default: {
                        return this.o();
                    }
                }
            }
            case 3: {
                if(!this.h.E()) {
                    this.h.l(estk.z);
                }
                return this.o();
            }
            default: {
                goto label_180;
            }
        }
    }

    private final int m() {
        int v8;
        boolean z;
        if(this.h.O(3)) {
            this.h.M(3);
        }
        byte[] arr_b = new byte[4];
        int v = estb.I.X;
        this.t.position(v);
        int v1 = estb.I.Y;
        this.t.get(arr_b, 0, v1);
        int v2 = estb.H.X;
        int v3 = estc.g.i;
        int v4 = estb.H.Y;
        int v5 = this.h.L(this.j, v2, this.k, v3, v4);
        if(v5 != 2) {
            return v5;
        }
        int v6 = this.t.get(v2);
        byte[] arr_b1 = this.e.c("8A");
        if(arr_b1.length != 2) {
            this.h.f = esta.e;
            return 6;
        }
        if(Arrays.equals(arr_b1, essz.b("5933")) || Arrays.equals(arr_b1, essz.b("5A33")) || Arrays.equals(arr_b1, essz.b("5a33"))) {
            this.h.M(3);
        }
        else if(Arrays.equals(arr_b1, essz.b("3030"))) {
            if(this.h.u(estj.c, arr_b)) {
                if(v6 != -91 && this.h.s(esth.a)) {
                    this.h.M(3);
                }
            }
            else if(this.h.s(esth.a)) {
                this.h.M(3);
            }
        }
        if(this.h.K() != 3 && v6 == -91) {
            this.h.M(1);
            byte[] arr_b2 = new byte[8];
            this.t.position(estb.n.X);
            this.t.get(arr_b2, 0, 8);
            arr_b2[0] = (byte)(arr_b2[0] & 15);
            this.t.position(estb.n.X);
            this.t.put(arr_b2, 0, 8);
            essp essp0 = this.u;
            essp0.s = this.t.array();
            this.h.e(estk.e);
            this.h.l(estk.j);
            estk estk0 = estk.d;
            this.h.l(estk0);
            esto esto0 = esto.b;
            if(this.h.B(esto0)) {
                byte[] arr_b3 = this.h.G(este.c);
                String s = essz.a(this.h.I("9F03"));
                byte[] arr_b4 = ests.a;
                if(s.compareToIgnoreCase(essz.a(arr_b4).substring(0, 12)) == 0) {
                    estm estm0 = estm.e;
                    if(!this.h.z(estm0, arr_b3)) {
                        this.t.put(estb.L.X, -91);
                        this.t.put(estb.K.X, 90);
                        this.t.put(estb.O.X, 90);
                    }
                    else if(essz.a(this.h.I("9F02")).compareToIgnoreCase(essz.a(arr_b4).substring(0, 12)) != 0 || this.h.z(estm0, arr_b3)) {
                        this.t.put(estb.L.X, 90);
                        this.t.put(estb.K.X, -91);
                        this.t.put(estb.O.X, -91);
                    }
                }
                else {
                    this.t.put(estb.L.X, -91);
                    this.t.put(estb.K.X, 90);
                    this.t.put(estb.O.X, 90);
                }
            }
            esth esth0 = esth.e;
            if(this.h.s(esth0)) {
                int v7 = estb.K.X;
                this.t.put(v7, -91);
                byte[] arr_b5 = this.e.c("8A");
                if(arr_b5.length == 2) {
                    byte[] arr_b6 = new byte[4];
                    this.t.position(v);
                    this.t.get(arr_b6, 0, v1);
                    v8 = this.h.L(this.j, v2, this.k, v3, v4);
                    if(v8 == 2) {
                        int v9 = this.t.get(v2);
                        if(!Arrays.equals(arr_b5, essz.b("3030")) || v9 != -91) {
                            if(!Arrays.equals(arr_b5, essz.b("3031")) && !Arrays.equals(arr_b5, essz.b("5933")) && !this.h.s(esth.a)) {
                                v8 = this.t();
                                if(v8 == 2 && this.h.K() != 3) {
                                label_153:
                                    this.h.e(estk.p);
                                    this.h.d(esti.d);
                                    this.h.f();
                                    estp estp0 = estp.i;
                                    if(this.h.v(estp0)) {
                                        this.q.c();
                                    }
                                    this.h.l(estk0);
                                    int v11 = this.t.get(v7);
                                    int v12 = this.t.get(estb.L.X);
                                    if(v11 == -91) {
                                        byte[] arr_b14 = this.h.G(este.c);
                                        if(this.h.z(estm.e, arr_b14)) {
                                            this.h.p(este.j, this.m);
                                        }
                                    }
                                    else if(v12 == -91) {
                                        this.h.l(estk.K);
                                        this.h.p(este.j, this.n);
                                    }
                                    if(this.h.w(estk.K)) {
                                        byte[] arr_b15 = new byte[2];
                                        this.t.position(estb.b.X);
                                        this.t.get(arr_b15, 0, estb.b.Y);
                                        this.h.p(este.g, arr_b15);
                                        this.t.put(estb.N.X, -91);
                                        this.C();
                                    }
                                    if(this.h.s(esth.k)) {
                                        if(this.h.v(estp0)) {
                                            this.q.c();
                                        }
                                        else {
                                            this.I();
                                        }
                                    }
                                    this.H();
                                    v8 = 2;
                                }
                            }
                            else {
                                if(Arrays.equals(arr_b5, essz.b("5933"))) {
                                    this.h.n(estl.e);
                                }
                                v8 = 2;
                            }
                        }
                        else if(this.h.u(estj.a, arr_b6) && (arr_b6[2] & 0xC0) != 0xC0) {
                            int v10 = arr_b6[1];
                            if((v10 & 0x40) == 0 && (v10 & 0x80) == 0) {
                                v8 = 1;
                            }
                            else {
                                if(this.h.s(esth0)) {
                                    byte[] arr_b7 = this.e.c("91");
                                    byte[] arr_b8 = Arrays.copyOfRange(arr_b7, 8, 10);
                                    byte[] arr_b9 = new byte[4];
                                    this.t.position(v);
                                    this.t.get(arr_b9, 0, 4);
                                    if(this.h.B(esto0)) {
                                        if(this.h.v(estp.k)) {
                                            byte[] arr_b10 = Arrays.copyOfRange(this.e.c("91"), 10, 12);
                                            byte[] arr_b11 = Arrays.copyOfRange(this.e.c("91"), 8, 10);
                                            byte[] arr_b12 = this.h.I("DF15");
                                            byte[] arr_b13 = this.h.I("DF16");
                                            z = !this.h.A(estn.j) || this.h.A(estn.h) || Arrays.equals(arr_b10, arr_b12) && Arrays.equals(arr_b13, arr_b11);
                                        }
                                        else {
                                            z = !this.h.u(estj.i, arr_b9) && !this.h.u(estj.j, arr_b9) ? true : this.e(arr_b8);
                                        }
                                    }
                                    else if(!Arrays.equals(arr_b8, essz.b("FFFE")) && !Arrays.equals(arr_b8, new byte[2])) {
                                        z = false;
                                    }
                                    else {
                                        z = true;
                                    }
                                    if(z) {
                                        BigInteger bigInteger0 = new BigInteger(essz.a(this.m), 10);
                                        if(this.h.u(estj.i, arr_b9)) {
                                            estk estk1 = estk.C;
                                            this.h.l(estk1);
                                            if(this.e(arr_b8)) {
                                                BigInteger bigInteger1 = new BigInteger(bigInteger0.add(new BigInteger(essz.a(Arrays.copyOfRange(arr_b7, 10, 16)), 10)).toString(10));
                                                ByteBuffer byteBuffer0 = this.h.a(bigInteger1);
                                                if(this.w(1, bigInteger1)) {
                                                    this.h.l(estk.t);
                                                    this.h.M(3);
                                                }
                                                else {
                                                    this.m = byteBuffer0.array();
                                                }
                                            }
                                            else if(this.h.A(estn.j)) {
                                                this.h.e(estk1);
                                                this.h.M(3);
                                            }
                                            else {
                                                this.h.e(estk1);
                                            }
                                        }
                                        else if(this.h.u(estj.j, arr_b9)) {
                                            estk estk2 = estk.C;
                                            this.h.l(estk2);
                                            if(this.e(arr_b8)) {
                                                BigInteger bigInteger2 = new BigInteger(essz.a(Arrays.copyOfRange(arr_b7, 10, 16)), 10);
                                                if(bigInteger0.compareTo(bigInteger2) < 0) {
                                                    this.h.l(estk.N);
                                                    this.h.M(3);
                                                }
                                                else {
                                                    BigInteger bigInteger3 = new BigInteger(bigInteger0.subtract(bigInteger2).toString(10));
                                                    this.m = this.h.a(bigInteger3).array();
                                                    this.h.l(estk2);
                                                }
                                            }
                                            else if(this.h.A(estn.j)) {
                                                this.h.e(estk2);
                                                this.h.M(3);
                                            }
                                            else {
                                                this.h.e(estk2);
                                            }
                                        }
                                    }
                                    else {
                                        this.h.M(3);
                                    }
                                }
                                else {
                                    this.h.M(3);
                                }
                                v8 = 2;
                            }
                            if(v8 == 2 && this.h.K() != 3) {
                                goto label_146;
                            }
                        }
                        else {
                        label_146:
                            if(this.h.u(estj.b, arr_b6)) {
                                v8 = this.t();
                                if(v8 == 2 && this.h.K() != 3) {
                                    goto label_153;
                                }
                            }
                            else {
                                goto label_153;
                            }
                        }
                    }
                }
                else {
                    this.h.f = esta.e;
                    v8 = 6;
                }
            }
            else {
                v8 = 2;
            }
            if(v8 != 2) {
                return v8;
            }
        }
        return this.h.K() == 3 ? this.o() : 2;
    }

    private final int n(int v) {
        int v4;
        byte[] arr_b;
        estr estr0 = this.h;
        switch(v - 1) {
            case 0: {
                arr_b = estr0.h.M();
                break;
            }
            case 1: {
                arr_b = estr0.h.O();
                break;
            }
            case 2: {
                arr_b = estr0.h.L();
                break;
            }
            default: {
                arr_b = estr0.h.N();
            }
        }
        byte[] arr_b1 = new byte[10];
        this.t.position(estb.E.X);
        this.t.get(arr_b1, 0, estb.E.Y);
        int v2 = 6;
        if(arr_b.length != 1) {
            int v3 = 0;
            while(true) {
                v4 = 5;
                if(v3 >= 5) {
                    break;
                }
                if((arr_b[v3] & arr_b1[v3]) != 0) {
                    goto label_30;
                }
                ++v3;
            }
            this.t.position(estb.r.X);
            int v5 = this.t.get();
            for(int v1 = 0; v1 < 3; ++v1) {
                if(v1 == 2) {
                    v2 = 9;
                }
                if(v1 == 2) {
                    v4 = 7;
                }
                int v6 = arr_b[v4];
                if(((v6 & 0x40) == 0x40 && this.i == 29 || (v6 & 0x80) == 0x80 && this.i == 0xFFFFFFD1 || (v6 & 0xC0) == 0xC0 && (this.i == 0xFFFFFFD1 || this.i == 29)) && ((v6 & 0x30) == 0x30 || (v6 & 0x20) == 0x20 && (this.h.B(esto.b) || v5 == -91) || (arr_b[v4] & 16) == 16) && (arr_b[v2] & arr_b1[v2]) != 0) {
                label_30:
                    if(v != 1 && v != 3 && v != 4) {
                        this.h.M(2);
                        return 2;
                    }
                    this.h.M(3);
                    return 2;
                }
                v4 += 2;
                v2 += 2;
            }
            if(v == 2 && this.h.K() != 1) {
                this.h.M(2);
            }
            return 2;
        }
        return 6;
    }

    private final int o() {
        this.h.M(3);
        int v = this.i;
        if(v == 29) {
            this.h.l(estk.g);
            this.t.put(estb.G.X, 90);
            goto label_12;
        }
        if(v == 0xFFFFFFD1) {
            this.h.e(estk.g);
            this.h.e(estk.f);
            this.h.l(estk.k);
            this.h.e(estk.p);
            this.h.f();
        label_12:
            if(this.h.s(esth.l)) {
                this.I();
            }
            this.H();
            return 2;
        }
        return 6;
    }

    private final int p() {
        int v28;
        byte[] arr_b42;
        ByteBuffer byteBuffer11;
        int v20;
        int v9;
        int v;
        this.h.M(5);
        this.t.position(estb.S.X);
        this.t.put(estb.S.X, 90);
        esup esup0 = this.b;
        if(esup0.a != 0xFFFFFF80) {
            estr.g = 3;
            this.h.f = esta.g;
            v = 6;
        }
        else if(esup0.b == -82) {
            int v1 = esup0.c;
            if(v1 == 0xFFFFFF90 || (v1 == 16 || v1 == 80)) {
                estr.g = 3;
                this.h.f = esta.l;
                v = 6;
            }
            else if(v1 != 0 && (v1 != 0xFFFFFF80 && v1 != 0x40)) {
                estr.g = 3;
                this.h.f = esta.c;
                v = 6;
            }
            else {
                v = 2;
            }
            if(v == 2) {
                if((this.b.c >> 4 & 1) == 1) {
                    estr.g = 3;
                    this.h.f = esta.c;
                    v = 6;
                }
                else if(this.b.d == 0) {
                    v = 2;
                }
                else {
                    estr.g = 3;
                    this.h.f = esta.c;
                    v = 6;
                }
            }
        }
        else {
            this.h.f = esta.h;
            v = 6;
        }
        if(v == 2) {
            if(this.t.get(estb.r.X) == -91) {
                int v2 = estb.s.X;
                if(this.t.get(v2) == -91 || this.t.get(v2) != -91) {
                    this.t.put(estb.P.X, -91);
                }
                else {
                    this.t.put(estb.P.X, 90);
                }
            }
            else {
                this.t.put(estb.P.X, 90);
            }
            esur esur0 = new esur(this.u.e, this.b.a(), 2);
            this.d = esur0;
            this.u.M = esur0;
            this.h.d = esur0;
            if(this.h.A(estn.d)) {
                this.t.put(estb.Q.X, -91);
                this.t.put(estb.R.X, 90);
            }
            else {
                this.t.put(estb.Q.X, 90);
                this.t.put(estb.R.X, -91);
                int v3 = estb.U.X;
                this.t.put(v3, 90);
                if(this.h.A(estn.c)) {
                    this.t.put(v3, -91);
                }
            }
            esup esup1 = this.b;
            if(this.u.e.h != esup1.e) {
                this.h.f = esta.f;
                v = 6;
            }
            else if(esup1.f == 0) {
                v = 2;
            }
            else {
                this.h.f = esta.f;
                v = 6;
            }
            if(v == 2) {
                byte[] arr_b = this.d.c("9A");
                this.c = this.u.L;
                if(!esuq.k(arr_b) || !esuq.l(arr_b)) {
                    this.h.l(estk.X);
                    this.h.k(esti.B);
                }
                byte[] arr_b1 = this.d.c("9F21");
                if(!esuq.k(arr_b1) || !esuq.m(arr_b1)) {
                    this.h.l(estk.Y);
                    this.h.k(esti.C);
                }
                if(esuq.a(this.d.c("9F37")) == 0) {
                    estr.g = 3;
                    this.h.f = esta.e;
                    v = 6;
                }
                else {
                    byte[] arr_b2 = this.d.c("9F02");
                    byte[] arr_b3 = this.d.c("9F03");
                    if(esuq.k(arr_b2) && esuq.k(arr_b3)) {
                        int v4 = esuq.a(arr_b2);
                        int v5 = esuq.a(arr_b3);
                        if(this.t.get(estb.Q.X) == -91 && (v4 != 0 || v5 != 0)) {
                            estr.g = 3;
                            this.h.f = esta.e;
                            v = 6;
                        }
                        else {
                            v = 2;
                        }
                    }
                    else {
                        estr.g = 3;
                        this.h.f = esta.e;
                        v = 6;
                    }
                }
                if(v == 2) {
                    if(this.h.B(esto.b)) {
                        byte[] arr_b4 = this.d.c("9C");
                        byte[] arr_b5 = Arrays.copyOf(ests.a, 6);
                        byte[] arr_b6 = this.d.c("9F02");
                        byte[] arr_b7 = this.d.c("9F03");
                        estr estr0 = this.h;
                        int v6 = (int)Integer.valueOf(essz.a(arr_b4));
                        if(estr0.D(estp.k, v6) && (!Arrays.equals(arr_b6, arr_b5) || !Arrays.equals(arr_b7, arr_b5))) {
                            this.h.f = esta.e;
                            v = 6;
                        }
                        else {
                            BigInteger bigInteger0 = new BigInteger(essz.a(this.d.c("9F02")), 10);
                            BigInteger bigInteger1 = new BigInteger(essz.a(this.d.c("9F03")), 10);
                            BigInteger bigInteger2 = new BigInteger("000000000000", 10);
                            if(bigInteger0.compareTo(bigInteger2) != 0 && bigInteger1.compareTo(bigInteger2) == 0) {
                                this.t.put(estb.O.X, -91);
                            }
                            if(bigInteger0.compareTo(bigInteger2) == 0 && bigInteger1.compareTo(bigInteger2) != 0) {
                                this.t.put(estb.O.X, 90);
                            }
                            v = 2;
                        }
                        if(v == 2) {
                            goto label_121;
                        }
                    }
                    else {
                    label_121:
                        this.t.position(estb.V.X);
                        this.t.put(90);
                        int v7 = estb.j.X;
                        if(this.t.getShort(v7) == 0) {
                            byte[] arr_b8 = new byte[2];
                            this.t.position(v7);
                            this.t.get(arr_b8);
                            this.h.m(arr_b8, this.k, estc.f.i);
                        }
                        byte[] arr_b9 = new byte[6];
                        this.t.position(estb.k.X);
                        this.t.get(arr_b9, 0, 6);
                        if(Arrays.equals(arr_b9, Arrays.copyOfRange(ests.a, 0, 6))) {
                            this.h.m(arr_b9, this.k, estc.e.i);
                        }
                        v = 2;
                    }
                }
            }
        }
        if(v == 2) {
            if(estr.t(this.d.c("95")[0], ((byte)2))) {
                this.h.l(estk.x);
                this.h.k(esti.g);
            }
            if(estr.t(this.d.c("95")[1], ((byte)4))) {
                this.h.l(estk.F);
                this.h.k(esti.l);
            }
            v = this.s(this.b.a());
            if(v == 2) {
                if(this.h.O(1) && this.h.s(esth.h) && (!this.h.C(estq.h) || !this.h.s(esth.d)) && !this.h.R() && this.h.v(estp.a)) {
                    byte[] arr_b10 = new byte[2];
                    this.t.position(estb.j.X);
                    this.t.get(arr_b10, 0, estb.j.Y);
                    BigInteger bigInteger3 = new BigInteger(essz.a(arr_b10), 16);
                    BigInteger bigInteger4 = new BigInteger(essz.a(esuq.o(this.u.p)), 16);
                    BigInteger bigInteger5 = bigInteger3.add(new BigInteger("1", 16));
                    if(this.h.L(this.j, estb.j.X, this.k, estc.f.i, estc.f.j) != 2) {
                        this.h.f = esta.n;
                        return 6;
                    }
                    if(bigInteger5.compareTo(bigInteger4) > 0) {
                        this.h.l(estk.W);
                        this.h.k(esti.A);
                    }
                    byte[] arr_b11 = new byte[6];
                    this.t.position(estb.k.X);
                    this.t.get(arr_b11, 0, 6);
                    if(this.h.L(this.j, estb.k.X, this.k, estc.e.i, estb.k.Y) != 2) {
                        this.h.f = esta.n;
                        return 6;
                    }
                    byte[] arr_b12 = this.d.c("9F02");
                    this.t.position(estb.x.X);
                    this.t.put(arr_b12, 0, estb.x.Y);
                    if(new BigInteger(new BigInteger(essz.a(arr_b12), 10).add(new BigInteger(essz.a(arr_b11), 10)).toString(10)).compareTo(new BigInteger(essz.a(this.u.V()), 10)) > 0) {
                        this.h.l(estk.V);
                        this.h.k(esti.z);
                    }
                }
                estb estb0 = estb.c;
                int v8 = estb0.X;
                if(this.t.getShort(v8) == 0) {
                    byte[] arr_b13 = new byte[2];
                    this.t.position(v8);
                    this.t.get(arr_b13);
                    this.h.m(arr_b13, this.k, 2);
                }
                if(this.h.L(this.j, v8, this.k, estc.c.i, estb0.Y) != 2) {
                    this.h.f = esta.n;
                    return 6;
                }
                if(this.h.x(estl.e)) {
                    this.h.l(estk.w);
                    this.h.k(esti.e);
                }
                if(this.h.x(estl.c)) {
                    this.h.l(estk.s);
                    this.h.k(esti.c);
                }
                if(this.h.x(estl.b)) {
                    this.h.l(estk.r);
                    this.h.k(esti.b);
                }
                if(this.h.x(estl.a)) {
                    this.h.l(estk.q);
                    this.h.k(esti.a);
                }
                if(this.h.x(estl.d)) {
                    this.h.l(estk.p);
                    this.h.k(esti.d);
                }
                if(this.h.B(esto.a)) {
                    this.h.l(estk.M);
                    this.h.k(esti.r);
                    v9 = 2;
                }
                else {
                    byte[] arr_b14 = this.d.c("DF45");
                    byte[] arr_b15 = this.d.c("DF22");
                    byte[] arr_b16 = this.d.c("DF23");
                    String s = esuq.e(arr_b15);
                    byte[] arr_b17 = ests.a;
                    int v10 = s.compareToIgnoreCase(esuq.e(arr_b17).substring(0, 16));
                    int v11 = esuq.e(arr_b16).compareToIgnoreCase(esuq.e(arr_b17).substring(0, 16));
                    int v12 = esuq.e(arr_b14).compareToIgnoreCase(esuq.e(arr_b17));
                    if(v10 == 0 && v11 == 0) {
                        this.h.l(estk.M);
                        this.h.k(esti.r);
                        this.t.position(estb.w.X);
                        this.t.put(90);
                        v9 = 2;
                    }
                    else if(this.t.get(estb.Q.X) != -91) {
                        v9 = 5;
                    }
                    else if(v12 == 0) {
                        this.F();
                        v9 = 2;
                    }
                    else if(!Arrays.equals(Arrays.copyOfRange(arr_b14, 26, 0x60), Arrays.copyOf(arr_b17, 70))) {
                        this.F();
                        v9 = 2;
                    }
                    else if(Arrays.equals(Arrays.copyOfRange(arr_b14, 0, 16), Arrays.copyOf(arr_b17, 16))) {
                        this.F();
                        v9 = 2;
                    }
                    else {
                        v9 = 5;
                    }
                    if(v9 != 2) {
                        this.t.position(estb.r.X);
                        int v13 = this.t.get(estb.r.X);
                        this.t.position(estb.s.X);
                        int v14 = this.t.get(estb.s.X);
                        int v15 = estb.v.X;
                        int v16 = this.t.get(v15);
                        estk estk0 = estk.M;
                        if(!this.h.w(estk0) && this.h.B(esto.b) && v13 == -91 && (v14 == -91 || v16 != 0)) {
                            byte[] arr_b18 = this.d.c("9C");
                            estr estr1 = this.h;
                            int v17 = (int)Integer.valueOf(essz.a(arr_b18));
                            if(estr1.D(estp.f, v17)) {
                                this.G();
                                v9 = 2;
                            }
                            else {
                                int v18 = this.d.c("95")[0];
                                if(estr.t(((byte)v18), ((byte)7)) || estr.t(((byte)v18), ((byte)2))) {
                                    this.h.l(estk.x);
                                    this.h.k(esti.g);
                                    this.G();
                                    v9 = 2;
                                }
                                else if(!this.h.w(estk0) && !this.h.w(estk.J) && !this.h.w(estk.x)) {
                                    v9 = 5;
                                }
                                else {
                                    v9 = 2;
                                }
                            }
                        }
                        else {
                            this.h.l(estk0);
                            this.h.k(esti.r);
                            v9 = 2;
                        }
                        if(v9 != 2) {
                            this.b();
                            estp estp0 = estp.k;
                            if(!this.h.v(estp0)) {
                                if(!this.h.B(esto.b)) {
                                    v9 = 5;
                                }
                                else if(!this.g()) {
                                    if(this.t.get(v15) == 0) {
                                        v9 = 5;
                                    }
                                    else {
                                        this.G();
                                        v9 = 2;
                                    }
                                }
                                else if(!this.f()) {
                                    this.G();
                                    v9 = 2;
                                }
                                else if(!this.i()) {
                                    this.G();
                                    v9 = 2;
                                }
                                else if((this.h.A(estn.j) || !this.h.A(estn.e)) && this.t.get(estb.U.X) == -91) {
                                    this.F();
                                    v9 = 2;
                                }
                                else {
                                    v9 = 5;
                                }
                            }
                            else if(this.g()) {
                                byte[] arr_b19 = this.h.G(este.c);
                                if(this.h.z(estm.b, arr_b19)) {
                                    this.G();
                                    v9 = 2;
                                }
                                else {
                                    this.c();
                                    byte[] arr_b20 = essz.b((essz.a(this.d.c("9A")) + essz.a(this.d.c("9F21"))));
                                    this.h.p(este.n, arr_b20);
                                    estr estr2 = this.h;
                                    byte[] arr_b21 = this.d.c("5F2A");
                                    estr2.p(este.k, arr_b21);
                                    this.b();
                                    goto label_278;
                                }
                            }
                            else {
                            label_278:
                                if(this.h()) {
                                    v9 = 5;
                                }
                                else {
                                    this.G();
                                    v9 = 2;
                                }
                            }
                            if(v9 != 2) {
                                if(this.h.G(este.a)[0] > 0 && !this.j()) {
                                    if(this.i == 29) {
                                        byte[] arr_b22 = this.d.c("9F4C");
                                        byte[] arr_b23 = new byte[estb.A.Y];
                                        int v19 = estb.A.X;
                                        this.t.position(v19);
                                        this.t.get(arr_b23, 0, estb.A.Y);
                                        if(!essz.a(arr_b23).equalsIgnoreCase(essz.a(arr_b22))) {
                                            this.F();
                                            v20 = 2;
                                        }
                                        else if(this.u() == 2) {
                                            byte[] arr_b24 = new byte[estb.B.Y];
                                            this.t.position(estb.B.X);
                                            this.t.get(arr_b24, 0, estb.B.Y);
                                            this.t.rewind();
                                            byte[] arr_b25 = Arrays.copyOfRange(arr_b24, 0, 8);
                                            byte[] arr_b26 = Arrays.copyOfRange(arr_b24, 8, estb.B.Y);
                                            byte[] arr_b27 = new byte[8];
                                            this.t.position(v19);
                                            this.t.get(arr_b27, 0, 8);
                                            this.t.rewind();
                                            byte[] arr_b28 = this.h.v(estp0) ? new byte[2] : this.h.G(este.i);
                                            ByteBuffer byteBuffer0 = ByteBuffer.allocate(8).put(Arrays.copyOfRange(arr_b25, 0, 6)).put(arr_b28);
                                            ByteBuffer byteBuffer1 = ByteBuffer.allocate(8).put(Arrays.copyOfRange(arr_b26, 4, 8)).put(Arrays.copyOfRange(arr_b27, 0, 4));
                                            ByteBuffer byteBuffer2 = ByteBuffer.allocate(16).put(byteBuffer0.array()).put(byteBuffer1.array());
                                            byte[] arr_b29 = this.d.c("DF15");
                                            ByteBuffer byteBuffer3 = ByteBuffer.allocate(8).put(arr_b29).put(Arrays.copyOfRange(arr_b27, 0, 4)).put(new byte[]{0, 0});
                                            int v21 = this.h.c;
                                            byte[] arr_b30 = this.u.L.c("DF16");
                                            ByteBuffer byteBuffer4 = ByteBuffer.allocate(8).put(Arrays.copyOfRange(arr_b27, 4, 8)).put(arr_b30).put(((byte)v21)).put(new byte[]{0});
                                            byte[] arr_b31 = new byte[8];
                                            for(int v22 = 0; v22 < 8; v22 = (byte)(v22 + 1)) {
                                                arr_b31[v22] = (byte)(byteBuffer3.get(v22) ^ byteBuffer4.get(v22));
                                            }
                                            byte[] arr_b32 = new byte[8];
                                            for(int v23 = 0; v23 < 8; v23 = (byte)(v23 + 1)) {
                                                arr_b32[v23] = (byte)(byteBuffer3.get(v23) ^ arr_b31[v23]);
                                            }
                                            ByteBuffer byteBuffer5 = ByteBuffer.allocate(16).put(arr_b31).put(arr_b32);
                                            ByteBuffer byteBuffer6 = ByteBuffer.allocate(16);
                                            this.h.o(byteBuffer6.array());
                                            try {
                                                ByteBuffer byteBuffer7 = esul.a(byteBuffer2, byteBuffer5);
                                            }
                                            catch(Exception exception0) {
                                                estt.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GenAcImpl", "verifyServiceSignature", exception0.getMessage(), exception0);
                                                this.F();
                                                v20 = 2;
                                                goto label_382;
                                            }
                                            if(esuq.j(byteBuffer7)) {
                                                this.F();
                                                v20 = 2;
                                            }
                                            else if(!Arrays.equals(Arrays.copyOfRange(byteBuffer7.array(), 0, 8), this.d.c("DF23"))) {
                                                this.h.l(estk.S);
                                                this.h.k(esti.w);
                                                byte[] arr_b33 = {((byte)(this.h.G(este.o)[0] + 1))};
                                                this.h.p(este.o, arr_b33);
                                                this.h.b();
                                                this.F();
                                                v20 = 2;
                                            }
                                            else {
                                                this.t.position(estb.D.X);
                                                this.t.put(-91);
                                                v20 = 5;
                                            }
                                        }
                                        else {
                                            this.F();
                                            v20 = 2;
                                        }
                                    }
                                    else {
                                        v20 = 2;
                                    }
                                label_382:
                                    if(v20 == 2) {
                                        v9 = 2;
                                    }
                                    else {
                                        this.y();
                                        if(this.h.v(estp.k)) {
                                            byte[] arr_b34 = this.h.H(estf.e);
                                            byte[] arr_b35 = this.h.H(estf.d);
                                            byte[] arr_b36 = this.h.H(estf.g);
                                            byte[] arr_b37 = this.h.H(estf.h);
                                            int v24 = arr_b34[0];
                                            int v25 = arr_b35[0];
                                            int v26 = arr_b36[0];
                                            int v27 = arr_b37[0];
                                            if(!this.h.A(estn.a)) {
                                                if(v25 - v27 - (v24 - v26) != 0 || this.t.get(estb.t.X) == -91) {
                                                label_397:
                                                    byte[] arr_b38 = this.d.c("DF45");
                                                    byte[] arr_b39 = Arrays.copyOfRange(arr_b38, 0, 16);
                                                    byte[] arr_b40 = Arrays.copyOfRange(arr_b38, 16, 19);
                                                    ByteBuffer byteBuffer8 = ByteBuffer.allocate(16).put(arr_b39);
                                                    byte[] arr_b41 = new byte[16];
                                                    this.t.position(estb.B.X);
                                                    this.t.get(arr_b41, 0, 16);
                                                    ByteBuffer byteBuffer9 = ByteBuffer.allocate(16).put(arr_b41);
                                                    ByteBuffer byteBuffer10 = ByteBuffer.allocate(16);
                                                    this.h.o(byteBuffer10.array());
                                                    try {
                                                        SecretKeySpec secretKeySpec0 = new SecretKeySpec(byteBuffer9.array(), "AES");
                                                        Cipher cipher0 = Cipher.getInstance("AES/CBC/NoPadding");
                                                        cipher0.init(2, secretKeySpec0, new IvParameterSpec(esul.a));
                                                        byteBuffer11 = ByteBuffer.wrap(cipher0.doFinal(byteBuffer8.array()));
                                                        ByteBuffer byteBuffer12 = ByteBuffer.allocate(16).put(Arrays.copyOfRange(ests.a, 0, 16));
                                                        SecretKeySpec secretKeySpec1 = new SecretKeySpec(byteBuffer11.array(), "AES");
                                                        Cipher cipher1 = Cipher.getInstance("AES/CBC/NoPadding");
                                                        cipher1.init(1, secretKeySpec1, new IvParameterSpec(esul.a));
                                                        arr_b42 = Arrays.copyOfRange(ByteBuffer.wrap(cipher1.doFinal(byteBuffer12.array())).array(), 0, 3);
                                                    }
                                                    catch(Exception exception1) {
                                                        estt.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GenAcImpl", "performServiceKeyPlant", exception1.getMessage(), exception1);
                                                        v28 = 6;
                                                        goto label_447;
                                                    }
                                                    if(Arrays.equals(arr_b40, arr_b42) && this.h()) {
                                                        ByteBuffer byteBuffer13 = ByteBuffer.allocate(3).put(arr_b42);
                                                        if(!this.h.A(estn.h) && this.h.A(estn.j)) {
                                                            this.h.M(2);
                                                            this.h.l(estk.L);
                                                        }
                                                        estr estr3 = this.h;
                                                        byte[] arr_b43 = byteBuffer11.array();
                                                        estr3.p(este.t, arr_b43);
                                                        estr estr4 = this.h;
                                                        byte[] arr_b44 = byteBuffer13.array();
                                                        estr4.p(este.d, arr_b44);
                                                        byte[] arr_b45 = Arrays.copyOfRange(this.d.c("DF45"), 19, 20);
                                                        this.h.p(este.e, arr_b45);
                                                        this.h.l(estk.B);
                                                        if(this.h.K() != 2) {
                                                            if(this.t.get(estb.t.X) == -91) {
                                                                this.h.l(estk.H);
                                                                this.h.k(esti.n);
                                                            }
                                                            else {
                                                                this.h.l(estk.G);
                                                                this.h.k(esti.m);
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        goto label_443;
                                                    }
                                                }
                                                else {
                                                label_443:
                                                    this.h.l(estk.J);
                                                    this.h.k(esti.p);
                                                    this.h.M(3);
                                                }
                                            }
                                            else if(v26 + 1 > v27 || v24 + 1 > v25) {
                                                goto label_443;
                                            }
                                            else {
                                                goto label_397;
                                            }
                                            v28 = 2;
                                        label_447:
                                            if(v28 == 2) {
                                                switch(this.h.K()) {
                                                    case 2: 
                                                    case 3: {
                                                        goto label_505;
                                                    }
                                                    default: {
                                                        if(this.t.get(estb.t.X) == -91) {
                                                            this.h.l(estk.H);
                                                            this.h.l(estk.K);
                                                            this.h.k(esti.n);
                                                        }
                                                        else {
                                                            this.h.l(estk.G);
                                                            this.h.l(estk.K);
                                                            this.h.k(esti.m);
                                                        }
                                                        this.h.k(esti.q);
                                                        goto label_505;
                                                    }
                                                }
                                            }
                                            else {
                                                v9 = v28;
                                            }
                                        }
                                        else {
                                            estp estp1 = estp.d;
                                            if(this.h.v(estp1) || (this.h.v(estp.i) || this.h.v(estp.e) || this.h.v(estp.j) || this.h.v(estp.h)) && this.h.w(estk.I)) {
                                                if(this.g()) {
                                                    este este0 = este.c;
                                                    byte[] arr_b46 = this.h.G(este0);
                                                    if(!this.h.z(estm.b, arr_b46) && !this.h.A(estn.e)) {
                                                        this.h.l(estk.J);
                                                        this.h.k(esti.p);
                                                        this.h.M(3);
                                                    }
                                                    else {
                                                        byte[] arr_b47 = this.k();
                                                        this.h.p(este0, arr_b47);
                                                        byte[] arr_b48 = this.d.c("DF45");
                                                        byte[] arr_b49 = this.d.c("DF15");
                                                        if(!this.h.A(estn.c) && (arr_b49[0] & 16) != 10) {
                                                            this.h.p(este.m, arr_b48);
                                                            this.h.l(estk.K);
                                                            this.h.k(esti.q);
                                                        }
                                                        else if(!this.h.A(estn.e)) {
                                                            this.h.l(estk.J);
                                                            this.h.k(esti.p);
                                                            byte[] arr_b50 = this.d.c("9C");
                                                            if(this.h.D(estp1, Integer.valueOf(essz.a(arr_b50)).intValue())) {
                                                                this.h.M(3);
                                                            }
                                                        }
                                                        else if(this.h.A(estn.j)) {
                                                            this.h.l(estk.J);
                                                            this.h.k(esti.p);
                                                            this.h.M(3);
                                                        }
                                                        else {
                                                            estr estr5 = this.h;
                                                            byte[] arr_b51 = Arrays.copyOfRange(arr_b48, 0, 6);
                                                            estr5.p(este.u, arr_b51);
                                                            this.h.l(estk.K);
                                                            this.h.k(esti.q);
                                                        }
                                                    }
                                                    this.h.K();
                                                }
                                                else {
                                                    this.G();
                                                }
                                            }
                                            goto label_505;
                                        }
                                    }
                                }
                                else {
                                    this.F();
                                label_505:
                                    v9 = 2;
                                }
                            }
                        }
                    }
                }
                if(v9 != 2) {
                    return v9;
                }
                this.E();
                int v29 = this.r();
                if(v29 != 2) {
                    return v29;
                }
                this.A();
                int v30 = this.l();
                return v30 == 2 ? 2 : v30;
            }
        }
        return v;
    }

    private final int q() {
        byte[] arr_b14;
        byte[] arr_b13;
        int v7;
        byte[] arr_b1;
        int v = estb.b.X;
        int v1 = estb.b.Y;
        int v2 = this.h.L(this.j, v, this.k, estc.b.i, v1);
        if(v2 != 2) {
            return v2;
        }
        byte[] arr_b = new byte[v1];
        this.t.position(v);
        this.t.get(arr_b, 0, v1);
        int v3 = esuq.h(arr_b);
        if(this.i == 29) {
            arr_b1 = ByteBuffer.allocate(33).put(this.d.c("9F02")).put(this.d.c("9F03")).put(this.d.c("9F1A")).put(this.d.c("95")).put(this.d.c("5F2A")).put(this.d.c("9A")).put(this.d.c("9C")).put(this.d.c("9F37")).put(this.u.J()).put(arr_b).array();
            essp.ac(this.d.c("9A"));
            essp.ad(this.d.c("9F37"));
        }
        else {
            arr_b1 = ByteBuffer.allocate(33).put(this.h.I("9F02")).put(this.h.I("9F03")).put(this.h.I("9F1A")).put(this.e.c("95")).put(this.h.I("5F2A")).put(this.h.I("9A")).put(this.h.I("9C")).put(this.e.c("9F37")).put(this.u.J()).put(arr_b).array();
            essp.ac(this.h.I("9A"));
            essp.ad(this.e.c("9F37"));
        }
        byte[] arr_b2 = (byte[])this.u.R.clone();
        if(arr_b2 != null && arr_b2.length == 0x20) {
            byte[] arr_b3 = Arrays.copyOfRange(arr_b2, 0, 3);
            byte[] arr_b4 = new byte[estb.n.Y];
            this.t.position(estb.n.X);
            this.t.get(arr_b4, 0, estb.n.Y);
            byte[] arr_b5 = new byte[6];
            estb estb0 = estb.i;
            this.t.position(estb0.X);
            if(this.h.K() == 3) {
                this.t.get(arr_b5, 0, estb0.Y);
            }
            else {
                this.t.put(this.m, 0, estb0.Y);
                arr_b5 = Arrays.copyOfRange(this.m, 0, 6);
            }
            byte[] arr_b6 = new byte[2];
            int v4 = this.u.K()[4] >> 4;
            int v5 = this.u.K()[2];
            byte[] arr_b7 = new byte[6];
            byte[] arr_b8 = new byte[2];
            if(this.h.B(esto.b)) {
                byte[] arr_b9 = this.h.G(este.c);
                if(!this.h.z(estm.e, arr_b9)) {
                    arr_b7 = this.h.G(este.j);
                }
                arr_b8 = new byte[2];
                this.s = new byte[2];
                int v6 = this.t.get(estb.U.X);
                if(this.h.v(estp.k)) {
                    switch(this.h.K()) {
                        case 1: {
                            arr_b8 = this.d.c("DF15");
                            this.s = this.h.G(este.b);
                            break;
                        }
                        case 2: {
                            if(this.t.get(estb.S.X) == -91) {
                                arr_b8 = this.d.c("DF15");
                                this.s = this.h.G(este.b);
                            }
                        }
                    }
                }
                else if(v6 == -91) {
                    arr_b8 = this.d.c("DF15");
                    this.s = this.h.G(este.b);
                }
                else if(this.h.K() == 3) {
                    if(this.g() && !this.h.w(estk.M)) {
                        arr_b8 = this.d.c("DF15");
                        this.s = this.h.G(este.b);
                    }
                }
                else if(!this.h.A(estn.f)) {
                    arr_b8 = this.d.c("DF15");
                    this.s = this.h.G(este.b);
                }
                else if(this.t.get(estb.s.X) == -91) {
                    arr_b8 = this.d.c("DF15");
                    this.s = this.h.G(este.b);
                }
            }
            byte[] arr_b10 = ByteBuffer.allocate(0x20).put(arr_b3).put(arr_b4).put(arr_b5).put(arr_b7).put(arr_b6).put(this.s).put(arr_b8).put(((byte)(v4 & 15))).put(((byte)v5)).put(arr_b6[0]).array();
            if(arr_b10.length == 0x20) {
                this.p = arr_b10;
                this.u.w(arr_b10);
                v7 = 2;
            }
            else {
                this.h.f = esta.a;
                v7 = 6;
            }
        }
        else {
            this.h.f = esta.a;
            v7 = 6;
        }
        if(v7 == 2) {
            byte[] arr_b11 = this.p;
            if(arr_b11 != null) {
                byte[] arr_b12 = ByteBuffer.allocate(arr_b1.length + arr_b11.length).put(arr_b1).put(this.p).array();
                this.h.o(new byte[8]);
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
                byteBuffer0.putShort(((short)v3));
                essp.ab(byteBuffer0.array());
                try {
                    arr_b13 = esul.e(essz.a(byteBuffer0.array()), this.u);
                    arr_b14 = new byte[8];
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    estt.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GenAcImpl", "generateTcAacArqc", generalSecurityException0.getMessage(), generalSecurityException0);
                    return 2;
                }
                try {
                    arr_b14 = esul.d(arr_b12, arr_b13);
                }
                catch(GeneralSecurityException generalSecurityException1) {
                    estt.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GenAcImpl", "generateTcAacArqc", generalSecurityException1.getMessage(), generalSecurityException1);
                }
                this.r = arr_b14;
                int v8 = this.t.getShort(estb.e.X);
                this.t.putShort(estb.e.X, ((short)(v8 + 1)));
                return 2;
            }
        }
        return v7;
    }

    private final int r() {
        if(this.h.K() != 3) {
            if(this.h.O(3)) {
                this.h.M(3);
                return 2;
            }
            if(this.i == 29) {
                if(this.h.O(1) && !this.h.x(estl.c)) {
                    switch(this.h.K()) {
                        case 2: {
                            break;
                        }
                        case 3: {
                            this.h.M(3);
                            break;
                        }
                        default: {
                            this.h.M(1);
                            return 2;
                        }
                    }
                    return 2;
                }
                if(!this.h.C(estq.i)) {
                    this.h.M(2);
                    return 2;
                }
                this.h.M(3);
            }
            else {
                if(this.h.O(1)) {
                    byte[] arr_b = this.e.c("8A");
                    if(arr_b.length != 2) {
                        return 6;
                    }
                    if(!Arrays.equals(arr_b, essz.b("5933")) && !Arrays.equals(arr_b, essz.b("0000"))) {
                        this.h.M(3);
                        return 2;
                    }
                    this.h.M(1);
                    return 2;
                }
                if(this.h.O(2)) {
                    this.h.M(3);
                    return 2;
                }
            }
        }
        return 2;
    }

    private final int s(byte[] arr_b) {
        if(this.h.J(4) == esta.i) {
            if(this.h.y()) {
                this.i = (byte)0xD1;
                esur esur0 = new esur(this.u.f, arr_b, 3);
                this.e = esur0;
                this.h.e = esur0;
                return 2;
            }
            this.i = 29;
            esur esur1 = new esur(this.u.e, arr_b, 2);
            this.d = esur1;
            this.u.M = esur1;
            this.h.d = esur1;
            return 2;
        }
        this.h.f = esta.a;
        return 6;
    }

    private final int t() {
        int v = estb.K.X;
        int v1 = this.t.get(v);
        int v2 = estb.L.X;
        int v3 = this.t.get(v2);
        if(this.x(1) && this.h.B(esto.b) || !this.h.B(esto.b)) {
            int v4 = estb.H.X;
            int v5 = this.h.L(this.j, v4, this.k, estc.g.i, estb.H.Y);
            if(v5 != 2) {
                return v5;
            }
            if(v1 == -91 && this.t.get(v4) == -91) {
                this.l = this.m;
                this.o = this.h.I("9F02");
                this.t.put(v, -91);
                this.t.put(v2, 90);
                goto label_25;
            }
            this.h.M(3);
            return 2;
        }
        if(!this.x(2)) {
            if(v3 == -91) {
                byte[] arr_b = this.h.G(este.j);
                this.n = arr_b;
                this.l = arr_b;
                this.o = this.h.I("9F03");
                this.t.put(v, 90);
                this.t.put(v2, -91);
            label_25:
                BigInteger bigInteger0 = new BigInteger(essz.a(this.o), 10);
                BigInteger bigInteger1 = new BigInteger(essz.a(this.l), 10);
                if(!this.h.v(estp.a) && !this.h.v(estp.e) && !this.h.v(estp.f)) {
                    estp estp0 = estp.h;
                    if(this.h.v(estp0) && this.h.A(estn.j)) {
                        goto label_33;
                    }
                    else if(this.h.v(estp0) && !this.h.A(estn.j)) {
                        this.z();
                        return 2;
                    }
                }
                else {
                label_33:
                    if(bigInteger1.compareTo(bigInteger0) < 0) {
                        this.h.l(estk.N);
                        this.h.M(3);
                        return 2;
                    }
                    BigInteger bigInteger2 = new BigInteger(bigInteger1.subtract(bigInteger0).toString(10));
                    ByteBuffer byteBuffer0 = this.h.a(bigInteger2);
                    if(this.t.get(v) == -91) {
                        this.m = byteBuffer0.array();
                    }
                    else {
                        this.n = byteBuffer0.array();
                    }
                    this.h.M(1);
                }
            }
            return 2;
        }
        this.h.l(estk.z);
        this.h.M(3);
        return 2;
    }

    private final int u() {
        ByteBuffer byteBuffer5;
        byte[] arr_b8;
        byte[] arr_b = this.d.c("9F02");
        byte[] arr_b1 = this.d.c("9F03");
        BigInteger bigInteger0 = new BigInteger(new BigInteger(essz.a(arr_b), 10).add(new BigInteger(essz.a(arr_b1), 10)).toString(10));
        ByteBuffer byteBuffer0 = this.h.a(bigInteger0);
        byte[] arr_b2 = this.h.v(estp.k) ? new byte[2] : this.h.G(este.i);
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(8).put(byteBuffer0.array()).put(arr_b2);
        byte[] arr_b3 = this.d.c("5F2A");
        byte[] arr_b4 = this.d.c("9F37");
        byte[] arr_b5 = new byte[2];
        this.t.position(estb.A.X + 2);
        this.t.get(arr_b5, 0, 2);
        this.t.rewind();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(8).put(arr_b3).put(arr_b4).put(arr_b5);
        byte[] arr_b6 = this.d.c("DF45");
        byte[] arr_b7 = new byte[16];
        int v = 16;
        int v1 = 0;
        while(v1 < 0x60) {
            try {
                arr_b8 = Arrays.copyOfRange(arr_b6, v1, v);
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                estt.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GenAcImpl", "verifyServiceSummary", arrayIndexOutOfBoundsException0.getMessage(), arrayIndexOutOfBoundsException0);
                arr_b8 = new byte[16];
            }
            v1 += 16;
            v += 16;
            for(int v2 = 0; v2 < 16; ++v2) {
                arr_b7[v2] = (byte)(arr_b7[v2] ^ arr_b8[v2]);
            }
        }
        byte[] arr_b9 = Arrays.copyOfRange(ByteBuffer.allocate(16).put(byteBuffer1.array()).put(byteBuffer2.array()).array(), 0, 16);
        for(int v3 = 0; v3 < 16; ++v3) {
            arr_b7[v3] = (byte)(arr_b7[v3] ^ arr_b9[v3]);
        }
        ByteBuffer byteBuffer3 = ByteBuffer.wrap(arr_b7);
        byte[] arr_b10 = new byte[estb.B.Y];
        this.t.position(estb.B.X);
        this.t.get(arr_b10, 0, estb.B.Y);
        int v4 = this.h.c;
        byte[] arr_b11 = Arrays.copyOfRange(arr_b10, 0, 5);
        byte[] arr_b12 = Arrays.copyOfRange(arr_b10, 8, 14);
        ByteBuffer byteBuffer4 = ByteBuffer.allocate(16).put(arr_b11).put(arr_b2).put(((byte)v4)).put(arr_b12).put(arr_b5);
        try {
            byteBuffer5 = esul.a(byteBuffer4, byteBuffer3);
        }
        catch(Exception exception0) {
            estt.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GenAcImpl", "verifyServiceSummary", exception0.getMessage(), exception0);
            return 6;
        }
        if(esuq.j(byteBuffer5)) {
            return 6;
        }
        byte[] arr_b13 = new byte[16];
        this.h.o(arr_b13);
        byte[] arr_b14 = byteBuffer5.array();
        byte[] arr_b15 = byteBuffer3.array();
        for(int v5 = 0; v5 < 16; ++v5) {
            arr_b13[v5] = (byte)(arr_b15[v5] ^ arr_b14[v5]);
        }
        if(!Arrays.equals(Arrays.copyOfRange(ByteBuffer.wrap(arr_b13).array(), 0, 8), this.d.c("DF22"))) {
            this.h.l(estk.T);
            this.h.k(esti.x);
            byte[] arr_b16 = {((byte)(this.h.G(este.p)[0] + 1))};
            this.h.p(este.p, arr_b16);
            this.h.b();
            return 6;
        }
        this.t.position(estb.C.X);
        this.t.put(-91);
        return 2;
    }

    private final boolean v(int v, esur esur0) {
        byte[] arr_b1;
        byte[] arr_b;
        switch(v - 1) {
            case 0: {
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(22);
                ByteBuffer byteBuffer1 = ByteBuffer.allocate(22);
                byteBuffer1.put(this.u.M.c("9F1C")).put(this.u.M.c("9F02")).put(this.u.M.c("9F03"));
                byteBuffer0.put(this.f.b("9F1C")).put(this.f.b("9F02")).put(this.f.b("9F03"));
                if(this.h.B(esto.b)) {
                    byteBuffer1.put(this.u.L.b("DF16"));
                    byteBuffer0.put(this.f.b("DF16"));
                }
                arr_b = byteBuffer1.array();
                arr_b1 = byteBuffer0.array();
                return arr_b != null && arr_b1 != null && Arrays.equals(arr_b, arr_b1);
            }
            case 1: {
                arr_b = this.u.M.c("9A");
                arr_b1 = esur0.b("9A");
                return arr_b == null || arr_b1 == null || !Arrays.equals(arr_b, arr_b1);
            }
            case 2: {
                byte[] arr_b2 = ByteBuffer.allocate(2).put(0x40).put(17).array();
                arr_b1 = ByteBuffer.allocate(2).put(esur0.b("9F27")).put(this.g).array();
                return arr_b2 != null && arr_b1 != null && Arrays.equals(arr_b2, arr_b1);
            }
            case 4: {
                arr_b = this.u.M.c("9F02");
                arr_b1 = esur0.b("9F02");
                return arr_b != null && arr_b1 != null && Arrays.equals(arr_b, arr_b1);
            }
            case 7: {
                if(this.h.B(esto.b)) {
                    arr_b = this.u.L.c("DF16");
                    arr_b1 = esur0.b("DF16");
                    return arr_b != null && arr_b1 != null && Arrays.equals(arr_b, arr_b1);
                }
                return false;
            }
            case 5: 
            case 6: 
            case 8: {
                arr_b = this.u.M.c("9F03");
                arr_b1 = esur0.b("9F03");
                return arr_b != null && arr_b1 != null && Arrays.equals(arr_b, arr_b1);
            }
            default: {
                estr estr0 = this.h;
                int v1 = Integer.parseInt(esuq.e(estr0.h.y.b("9C")));
                return estr0.D(estp.h, v1);
            }
        }
    }

    private final boolean w(int v, BigInteger bigInteger0) {
        BigInteger bigInteger1 = new BigInteger(essz.a(this.h.G(este.u)), 10);
        if(v == 1) {
            bigInteger1 = new BigInteger(essz.a(this.u.Q()), 10);
        }
        return bigInteger1.compareTo(bigInteger0) < 0;
    }

    private final boolean x(int v) {
        return v == 1 && this.t.get(estb.O.X) == -91;
    }

    private final void y() {
        String s = esuq.c(new BigInteger(this.h.G(este.i)).add(new BigInteger(essz.b("0001"))).toString(16)).toUpperCase(Locale.getDefault());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
        byte[] arr_b = essz.b(s);
        this.h.p(este.i, byteBuffer0.put(ests.a, 0, 2 - s.length() / 2).put(arr_b).array());
    }

    private final void z() {
        BigInteger bigInteger0 = new BigInteger(new BigInteger(essz.a(this.n), 10).add(new BigInteger(essz.a(this.o), 10)).toString(10));
        byte[] arr_b = this.h.a(bigInteger0).array();
        byte[] arr_b1 = this.h.G(este.u);
        if(new BigInteger(essz.a(arr_b), 10).compareTo(new BigInteger(essz.a(arr_b1), 10)) > 0) {
            this.h.l(estk.t);
            this.h.M(3);
            return;
        }
        this.n = Arrays.copyOfRange(arr_b, 0, arr_b.length);
        this.t.position(estb.L.X);
        this.t.put(-91);
        this.h.M(1);
    }
}

