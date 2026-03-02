import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class esso implements essa {
    public static final Logger a;
    public static final String b;
    public int c;
    final essp d;
    private final esum e;
    private final estu f;
    private final esui g;
    private final esuk h;
    private final estt i;
    private final esuj j;
    private final esun k;

    static {
        esso.a = Logger.getLogger("esso");
        esso.b = "GPAY: esso";
    }

    public esso(essp essp0) {
        this.c = 3;
        esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "<init>", esso.b + "rupaycontactlesssession constructor");
        this.d = essp0;
        this.e = new esum();
        this.f = new estu();
        this.g = new esui();
        this.h = new esuk();
        this.i = new estt();
        this.j = new esuj();
        this.k = new esun();
    }

    @Override  // essa
    public final essh a() {
        esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "close", esso.b + "SessionResult in close Called");
        return new essn(this);
    }

    public final esta b(byte[] arr_b) {
        esta esta9;
        esta esta6;
        esta esta5;
        esta esta2;
        byte[] arr_b3;
        esta esta0;
        Logger logger0 = esso.a;
        String s = esso.b;
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "processCommand", s + "processCommand in RupayContactlessSession");
        try {
            try {
                int v = arr_b[1];
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "processCommand", esso.b + " Wrong request structure: in RupayContactlessSession " + arrayIndexOutOfBoundsException0.toString());
                esso.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "processCommand", arrayIndexOutOfBoundsException0.getLocalizedMessage(), arrayIndexOutOfBoundsException0);
                this.c = 7;
                return null;
            }
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "processCommand", s + "processCommand before switch.");
            switch(v) {
                case -92: {
                    esum esum0 = this.e;
                    essp essp0 = this.d;
                    Logger logger1 = esum.a;
                    logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SelectImpl", "processSelect", "GPAY: SELECT Implementation Begin SELECT Processing");
                    estr estr0 = esum0.e;
                    estr0.h = essp0;
                    esum0.f = essp0;
                    essp essp1 = esum0.f;
                    estr.g = 3;
                    essp1.q(essz.b(((String)esuu.a(essz.a(new esun().a(essz.b("80CADF1300"), essp1, false).d())).get("DF13"))));
                    estr.g = 2;
                    logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SelectImpl", "checkCommandParameterValidation", "GPAY: SELECT Implementation  checkCommandParameterValidation");
                    esup esup0 = esum0.c;
                    esup0.b(arr_b);
                    if(esup0.a != 0) {
                        esta0 = esta.g;
                    }
                    else if(esup0.b == -92) {
                        estr.g = 3;
                        if(esup0.c != 4 || esup0.d != 0) {
                            esta0 = esta.c;
                        }
                        else if(esup0.e >= 5 && esup0.e <= 16 && esup0.f == 0) {
                            esta0 = esta.i;
                        }
                        else {
                            esta0 = esta.f;
                        }
                    }
                    else {
                        esta0 = esta.h;
                    }
                    if(esta0 == esta.i) {
                        for(int v1 = 0; v1 < esum0.f.c().size(); ++v1) {
                            byte[] arr_b1 = essz.b(((Map)esum0.f.c().get(v1)).get("aid").toString());
                            if(Arrays.equals(arr_b1, esum.b)) {
                                esum0.d = arr_b1;
                            }
                        }
                        if(esum0.d == null) {
                            esta0 = esta.d;
                        }
                        else {
                            boolean z = estr0.s(esth.g);
                            logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SelectImpl", "prepareSelectAIDResponse", "GPAY: SELECT Implementation prepareSelectAIDResponse");
                            Map map0 = esuu.a(((String)esuu.a(esum0.f.m.substring(esum0.f.m.indexOf("A5"))).get("A5")));
                            byte[] arr_b2 = essz.b(((String)esuu.a(((String)map0.get("BF0C"))).get("9F4D")));
                            if(z && esum0.f.Z().length != 0) {
                                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SelectImpl", "prepareSelectAIDResponse", "GPAY: SELECT Implementation  service is supported ");
                                String s1 = essz.a(esum0.f.Z());
                                if(esum0.f.f() != null) {
                                    StringBuilder stringBuilder0 = new StringBuilder();
                                    for(Object object0: esum0.f.f().entrySet()) {
                                        stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
                                        stringBuilder0.append(((String)((Map.Entry)object0).getValue()));
                                    }
                                    logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SelectImpl", "prepareSelectAIDResponse", "GPAY: SELECT Implementation  profile has service id control list ");
                                    s1 = essz.a(esum0.f.Z()) + stringBuilder0.toString();
                                }
                                arr_b3 = essy.d(essy.a(0x6F, new esss[]{essy.c(0x84, esum.b), essy.a(0xA5, new esss[]{essy.c(80, essz.b(((String)map0.get("50")))), essy.c(0x9F12, essz.b(((String)map0.get("9F12")))), essy.c(0x87, essz.b(((String)map0.get("87")))), essy.c(0x5F2D, essz.b(((String)map0.get("5F2D")))), essy.c(40760, essz.b(((String)map0.get("9F38")))), essy.a(0xBF0C, new esss[]{essy.c(0x9F4D, arr_b2), essy.c(0xDF07, essz.b(s1))})})}));
                            }
                            else {
                                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SelectImpl", "prepareSelectAIDResponse", "GPAY: SELECT Implementation  service is not supported ");
                                arr_b3 = essy.d(essy.a(0x6F, new esss[]{essy.c(0x84, esum.b), essy.a(0xA5, new esss[]{essy.c(80, essz.b(((String)map0.get("50")))), essy.c(0x9F12, essz.b(((String)map0.get("9F12")))), essy.c(0x87, essz.b(((String)map0.get("87")))), essy.c(0x5F2D, essz.b(((String)map0.get("5F2D")))), essy.c(40760, essz.b(((String)map0.get("9F38")))), essy.a(0xBF0C, new esss[]{essy.c(0x9F4D, arr_b2)})})}));
                            }
                            estr.g = 3;
                            ByteBuffer byteBuffer0 = ByteBuffer.wrap(essp0.s);
                            byteBuffer0.position(estb.m.X);
                            if(byteBuffer0.get(estb.m.X) == -91) {
                                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SelectImpl", "processSelect", "GPAY: SELECT Implementation  application is blocked");
                                esta0 = esta.a(arr_b3, 0x6283);
                            }
                            else {
                                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.SelectImpl", "processSelect", "GPAY: SELECT Implementation  application is not blocked");
                                esta0 = esta.a(arr_b3, 0x9000);
                            }
                        }
                    }
                    this.f(esta0.p);
                    return esta0;
                }
                case -88: {
                    estu estu0 = this.f;
                    Logger logger2 = estu.a;
                    String s2 = estu.b;
                    logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "processGpo", s2 + "Rupay Apdu Engine: GPO processing Begins");
                    estu0.e = this.d.s;
                    estu0.f = this.d.t;
                    estu0.i = this.d;
                    estr estr1 = estu0.c;
                    estr1.h = this.d;
                    estu0.h = ByteBuffer.wrap(estu0.e);
                    esta esta1 = esta.i;
                    if(estr1.J(3) != esta1) {
                        logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "processGpo", s2 + "Rupay Apdu Engine: GPO invalid state");
                        esta2 = estr1.J(4);
                        if(esta2 == esta1) {
                            esta2 = esta.a;
                        }
                        else {
                            estr.g = 3;
                        }
                    }
                    else if(arr_b[0] == 0xFFFFFF80) {
                        logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "processGpo", s2 + "processGpo method has Selected state");
                        esta2 = estu0.c(arr_b);
                        if(esta2 == esta1) {
                            logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "processGetProcessingOptions", s2 + "processGetProcessingOptions checking handle ATC");
                            logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "handleAtc", s2 + "handleAtc begin");
                            byte[] arr_b4 = new byte[2];
                            estb estb0 = estb.b;
                            int v2 = estb0.X;
                            estu0.h.position(v2);
                            estu0.h.get(arr_b4);
                            BigInteger bigInteger0 = new BigInteger(essz.a(arr_b4), 16);
                            if(new BigInteger(essz.a(new byte[]{-1, -1}), 16).compareTo(bigInteger0) > 0) {
                                String s3 = esuq.c(bigInteger0.add(new BigInteger("1", 16)).toString(16));
                                ByteBuffer byteBuffer1 = ByteBuffer.allocate(2);
                                byte[] arr_b5 = essz.b(s3);
                                estu0.h.position(v2);
                                estu0.h.put(byteBuffer1.put(ests.a, 0, 2 - s3.length() / 2).put(arr_b5).array());
                                estr1.Q();
                                estu0.h.position(v2);
                                byte[] arr_b6 = new byte[2];
                                estu0.h.get(arr_b6);
                                estr1.m(arr_b6, estu0.f, estc.b.i);
                                if(estr1.L(estu0.e, v2, estu0.f, estc.b.i, estb0.Y) == 2) {
                                    if(esuq.a(estu0.d.c("9F09")) > 1) {
                                        switch(estu0.h.get(estb.d.X)) {
                                            case 0: {
                                                if(estu0.h.get(estb.m.X) == -91) {
                                                    goto label_136;
                                                }
                                                break;
                                            }
                                            case 80: {
                                            label_136:
                                                byte[] arr_b7 = estu0.d.c("9F37");
                                                byte[] arr_b8 = estu0.d.c("9F1C");
                                                byte[] arr_b9 = estr1.I("9F37");
                                                byte[] arr_b10 = estr1.I("9F1C");
                                                if(Arrays.equals(arr_b7, arr_b9) && Arrays.equals(arr_b8, arr_b10)) {
                                                    estr.a = -91;
                                                }
                                                else {
                                                    estu0.g = true;
                                                    estr.g();
                                                    estr1.l(estk.p);
                                                }
                                            }
                                        }
                                    }
                                    estu0.h.position(estb.r.X);
                                    estu0.h.put(90);
                                    estu0.h.put(estb.v.X, 0);
                                    Arrays.fill(estu0.h.array(), estb.n.X, estb.n.Y + estb.n.X, 0);
                                    if(estu0.g) {
                                        estr1.l(estk.p);
                                    }
                                    estu0.i.j();
                                    if(estr1.s(esth.g)) {
                                        logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "processGetProcessingOptions", s2 + "Service Processing");
                                        if(estu0.f()) {
                                            estr1.l(estk.I);
                                            estr1.k(esti.o);
                                            estu0.h.put(estb.p.X, 0);
                                            estu0.h.put(estb.s.X, 90);
                                            byte[] arr_b11 = estu0.d.c("DF16");
                                            if(estu0.i.f() == null) {
                                                estu0.e();
                                            }
                                            else {
                                                boolean z1 = estu0.i.f().containsKey(essz.a(arr_b11));
                                                byte[] arr_b12 = new byte[0];
                                                if(z1) {
                                                    String s4 = (String)estu0.i.f().get(essz.a(arr_b11));
                                                    if(s4 != null) {
                                                        arr_b12 = essz.b(s4);
                                                    }
                                                    byte[] arr_b13 = (byte[])estu0.i.d().get(essz.a(arr_b11));
                                                    if(arr_b13 == null) {
                                                        estu0.e();
                                                    }
                                                    else {
                                                        estu0.i.A(Arrays.copyOfRange(arr_b13, 0, arr_b13.length));
                                                        if(arr_b12.length == 0 || estu0.a(arr_b12, arr_b13) == -1) {
                                                            estu0.e();
                                                        }
                                                    }
                                                }
                                                else {
                                                    estu0.e();
                                                }
                                            }
                                        }
                                        else {
                                            estu0.d();
                                        }
                                    }
                                    else {
                                        estr1.l(estk.M);
                                    }
                                    byte[] arr_b14 = estu0.i.J();
                                    byte[] arr_b15 = estu0.d.c("9F09");
                                    byte[] arr_b16 = estu0.i.I();
                                    if(esuq.a(arr_b15) > 1 && estr.t(arr_b14[0], ((byte)0))) {
                                        logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "processGpoResponse", s2 + "processGpoResponse: TERMINAL_AVN check  ");
                                        estu0.i.y(estu0.g());
                                        estr1.l(estk.l);
                                        arr_b16 = (byte[])estu0.i.K.clone();
                                    }
                                    esta2 = estu0.b(arr_b16);
                                }
                                else {
                                    esta2 = estr1.f;
                                    this.f(esta2.p);
                                    return esta2;
                                }
                            }
                            else {
                                estu0.h.put(estb.m.X, -91);
                                logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "handleAtc", s2 + "handleAtc ends ATC limit exceeded");
                                estr.g = 3;
                                estr1.f = esta.a;
                                esta2 = estr1.f;
                            }
                        }
                        else {
                            logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.GpoImpl", "processGpo", s2 + "processGpo method has parameter validation fail");
                        }
                    }
                    else {
                        esta2 = esta.g;
                    }
                    this.f(esta2.p);
                    return esta2;
                }
                case -82: {
                    esta esta3 = this.i.a(arr_b, this.d);
                    this.f(esta3.p);
                    return esta3;
                }
                case -78: {
                    esui esui0 = this.g;
                    essp essp2 = this.d;
                    Logger logger3 = esui.a;
                    String s5 = esui.b;
                    logger3.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.ReadRecordImpl", "processReadRecord", s5 + "Rupay Apdu Engine: Read Record Begins");
                    esup esup1 = esui0.d;
                    esup1.b(arr_b);
                    esui0.g = essp2;
                    esui0.c.h = essp2;
                    esta esta4 = esta.i;
                    if(esui0.c.J(4) != esta4) {
                        esta5 = esta.a;
                    }
                    else if(esup1.c != 0) {
                        int v3 = esup1.d;
                        if((v3 & 0xF8) == 0 || (v3 & 7) != 4) {
                            esta5 = esta.c;
                        }
                        else if(((byte)(v3 >> 3 & 0xFF)) == 15) {
                            logger3.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.ReadRecordImpl", "validateCommand", s5 + "SFI is invalid");
                            esta5 = esta.j;
                        }
                        else {
                            esta5 = esta4;
                        }
                    }
                    else {
                        esta5 = esta.c;
                    }
                    if(esta5 != esta4) {
                        this.f(esta5.p);
                        return esta5;
                    }
                    int v4 = esup1.d;
                    byte b = esup1.c;
                    byte b1 = (byte)(v4 >> 3 & 0xFF);
                    if(b1 == 3) {
                        if(b == 3) {
                            Logger logger4 = esui.a;
                            String s6 = esui.b;
                            logger4.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.ReadRecordImpl", "processReadRecord", s6 + "processReadRecord: qDDA signature reading");
                            esui0.f = essz.a(esui0.g.W());
                            if(esui0.f.isEmpty()) {
                                logger4.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.ReadRecordImpl", "processReadRecord", s6 + "processReadRecord: qDDA signature is Not Available");
                                esta5 = esta.k;
                                this.f(esta5.p);
                                return esta5;
                            }
                            esta5 = esta.a(essy.d(essy.a(0x70, new esss[]{essy.c(0x9F4B, essz.b(esui0.f))})), 0x9000);
                            this.f(esta5.p);
                            return esta5;
                        }
                        b1 = 3;
                    }
                    if(v4 == 0xFFFFFF84) {
                        esui0.e.b(essp2);
                        esta5 = esta.a(esui0.e.a(((int)b)), 0x9000);
                        this.f(esta5.p);
                        return esta5;
                    }
                    esui0.g = essp2;
                    if(!esui0.b(b1, b)) {
                        esui.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.ReadRecordImpl", "processReadRecord", esui.b + "processReadRecord: Record is not part of AFL");
                        esta5 = esta.a;
                        this.f(esta5.p);
                        return esta5;
                    }
                    JSONArray jSONArray0 = esui0.g.Q;
                    if(esui0.g.T() != null && esui0.g.T().length != 0) {
                        goto label_271;
                    }
                    int v5 = 0;
                    byte b2 = 0;
                    byte b3 = 0;
                    while(true) {
                        if(v5 >= jSONArray0.length()) {
                            goto label_271;
                        }
                        try {
                            JSONObject jSONObject0 = (JSONObject)jSONArray0.get(v5);
                            b2 = (byte)Integer.parseInt(jSONObject0.get("SFI").toString());
                            b3 = (byte)Integer.parseInt(jSONObject0.get("recordNumber").toString());
                        }
                        catch(JSONException jSONException0) {
                            esui.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.ReadRecordImpl", "getLucId", jSONException0.getLocalizedMessage(), jSONException0);
                        }
                        if(esui0.b(b2, b3)) {
                            Map map1 = esuu.a(esui0.a(b2, b3));
                            if(map1.containsKey("70") && esuu.a(((String)map1.get("70"))).containsKey("DF7C")) {
                                essp essp3 = esui0.g;
                                essp3.O = (byte[])new byte[]{b2, b3}.clone();
                            label_271:
                                byte[] arr_b17 = esui0.g.T();
                                String s7 = esui0.a(b1, b);
                                if(s7 != null && Arrays.equals(arr_b17, new byte[]{b1, b})) {
                                    int v6 = s7.indexOf("DF7C");
                                    StringBuilder stringBuilder1 = new StringBuilder(s7);
                                    String s8 = (String)esui0.g.w.get("lucid");
                                    if(s8 != null) {
                                        stringBuilder1.replace(v6 + 6, v6 + 14, s8);
                                    }
                                    s7 = stringBuilder1.toString();
                                }
                                if(s7 == null) {
                                    esui.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.ReadRecordImpl", "recordApplicationData", esui.b + "recordApplicationData: Record not found");
                                    esta5 = esta.k;
                                }
                                else {
                                    esta5 = esta.a(essz.b(s7), 0x9000);
                                }
                                this.f(esta5.p);
                                return esta5;
                            }
                        }
                        ++v5;
                    }
                }
                case -77: {
                    essp essp4 = this.d;
                    esup esup2 = this.j.a;
                    esup2.b(arr_b);
                    estr estr2 = this.j.b;
                    estr2.h = essp4;
                    if(estr2.J(4) != esta.i && estr2.J(5) != esta.i) {
                        esta6 = esta.a;
                    }
                    else if(esup2.c == 0) {
                        esta6 = esta.c;
                    }
                    else {
                        int v7 = esup2.d;
                        if((v7 & 0xF8) == 0 || (v7 & 7) != 4) {
                            esta6 = esta.c;
                        }
                        else if(v7 != 0x7C) {
                            esta6 = esta.a;
                        }
                        else {
                            if(essp4.d() != null) {
                                for(Object object1: essp4.d().entrySet()) {
                                    byte[] arr_b18 = (byte[])((Map.Entry)object1).getValue();
                                    if(arr_b18[0] != esup2.c) {
                                        continue;
                                    }
                                    esta6 = esta.a(essy.d(essy.a(0x70, new esss[]{essy.c(0xDF33, Arrays.copyOfRange(arr_b18, 0, 0x80))})), 0x9000);
                                    this.f(esta6.p);
                                    return esta6;
                                }
                            }
                            esta6 = esta.k;
                        }
                    }
                    this.f(esta6.p);
                    return esta6;
                }
                case -54: {
                    esta esta7 = this.k.a(arr_b, this.d, false);
                    this.f(esta7.p);
                    return esta7;
                }
                case 0xFFFFFFD0: {
                    esuk esuk0 = this.h;
                    essp essp5 = this.d;
                    esup esup3 = esuk0.a;
                    esup3.b(arr_b);
                    estr estr3 = esuk0.d;
                    estr3.h = essp5;
                    esta esta8 = esta.i;
                    if(estr3.J(4) != esta8) {
                        esta9 = esta.a;
                    }
                    else if(esup3.a != 0xFFFFFF80) {
                        esta9 = esta.g;
                    }
                    else if(esup3.c != 0 || esup3.d != 0) {
                        esta9 = esta.c;
                    }
                    else if(esup3.e != 12 || esup3.f != 0) {
                        esta9 = esta.f;
                    }
                    else if(estr3.s(esth.f)) {
                        esta9 = esta8;
                    }
                    else {
                        esta9 = esta.l;
                    }
                    if(esta9 == esta8) {
                        byte[] arr_b19 = essp5.X();
                        if(arr_b19 != null && !Arrays.equals(arr_b19, Arrays.copyOfRange(ests.a, 0, arr_b19.length))) {
                            esuk0.b = new esur(essp5.g, arr_b19, 7);
                            byte[] arr_b20 = esuk0.b.b("9F37");
                            byte[] arr_b21 = esuk0.b.b("9F1C");
                            if(esuk0.b.b("DF22")[0] == -91) {
                                esuk0.c = new esur(essp5.h, esup3.a(), 7);
                                byte[] arr_b22 = esuk0.c.b("9F1C");
                                if(Arrays.equals(arr_b20, esuk0.c.b("9F37")) && Arrays.equals(arr_b21, arr_b22)) {
                                    int v8 = esuk0.b.b("9F27")[0];
                                    byte[] arr_b23 = esss.j(0x9F10, new byte[][]{esuk0.b.b("9F10")});
                                    byte[] arr_b24 = esss.j(0x9F26, new byte[][]{esuk0.b.b("9F26")});
                                    byte[] arr_b25 = esss.j(0x9F36, new byte[][]{esuk0.b.b("9F36")});
                                    esta esta10 = esta.a(esss.j(0x77, new byte[][]{arr_b23, arr_b24, esss.j(0x9F27, new byte[][]{essz.b(esuq.c(String.valueOf(v8)))}), arr_b25}), 0x9000);
                                    int v9 = esuk0.b.b("9F27")[0];
                                    Arrays.fill(essp5.X(), 0, essp5.X().length, 0);
                                    if(v9 != 0) {
                                        switch(v9) {
                                            case 0xFFFFFF80: {
                                                estr.g = 5;
                                                break;
                                            }
                                            case 0x40: {
                                                estr.g = 3;
                                            }
                                        }
                                    }
                                    else if(ByteBuffer.wrap(essp5.s).get(estb.m.X) == -91) {
                                        estr.g = 5;
                                    }
                                    else {
                                        estr.g = 3;
                                    }
                                    ByteBuffer byteBuffer2 = ByteBuffer.wrap(arr_b19);
                                    byteBuffer2.position(55);
                                    byteBuffer2.put(90);
                                    essp5.z(arr_b19);
                                    esta9 = esta10;
                                }
                                else {
                                    estr.g = 3;
                                    esta9 = esta.m;
                                }
                            }
                            else {
                                esta9 = esta.a;
                            }
                        }
                        else {
                            estr.g = 3;
                            esta9 = esta.m;
                        }
                    }
                    else {
                        estr.g = 3;
                    }
                    this.f(esta9.p);
                    return esta9;
                }
                case -38: {
                    esta esta11 = this.k.a(arr_b, this.d, true);
                    this.f(esta11.p);
                    return esta11;
                }
                case -17: {
                    esso.e(this.d);
                    this.f(esta.i.p);
                    return esta.i;
                }
                default: {
                    this.c = 0;
                    return esta.h;
                }
            }
        }
        catch(Exception exception0) {
            esso.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "processCommand", exception0.getLocalizedMessage(), exception0);
            esso.a.logp(Level.WARNING, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "processCommand", esso.b + "Error processing request: " + exception0.toString());
            this.c = 7;
            return esta.n;
        }
    }

    public static byte[] c(Object object0) {
        esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "serialize", "serialize");
        gpzl gpzl0 = new gpzl();
        try {
            return gpzl0.i(object0).getBytes();
        }
        catch(RuntimeException runtimeException0) {
            esso.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "serialize", "Error during JSON serialization", runtimeException0);
            esso.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "serialize", runtimeException0.getLocalizedMessage(), runtimeException0);
            return null;
        }
    }

    @Override  // essa
    public final byte[] d(byte[] arr_b) {
        esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "processApdu", esso.b + "processApdu in RupayContactlessSession");
        esta esta0 = this.b(arr_b);
        return glwl.d(new byte[][]{esta0.o, glxf.d(((short)esta0.p))});
    }

    public static final void e(essp essp0) {
        esso.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayContactlessSession", "clearProfileData", esso.b + "Clear Accumulators in RupayContactlessSession");
        if(essp0.f() != null) {
            essp0.k();
        }
        if(essp0.d() != null) {
            essp0.l();
        }
        if(essp0.e() != null) {
            essp0.n();
        }
        if(essp0.aa() != null) {
            essp0.m();
        }
        if(essp0.Y() != null) {
            essp0.j();
        }
        if(essp0.s != null) {
            essp0.h();
        }
        if(essp0.G() != null) {
            essp0.g();
        }
        if(essp0.t != null) {
            essp0.i();
        }
        essp0.r = -91;
    }

    private final void f(int v) {
        this.c = v == esta.i.p ? 1 : 7;
    }
}

