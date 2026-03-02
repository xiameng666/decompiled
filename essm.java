import com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet.1;
import com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet.2;
import com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet.3;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class essm implements essj {
    private static final Logger a;
    private static final String b;

    static {
        essm.a = Logger.getLogger("essm");
        essm.b = "GPAY: essm";
    }

    public final void a(essp essp0, byte[] arr_b) {
        essm essm0;
        byte[] arr_b9;
        byte[] arr_b1 = arr_b;
        Logger logger0 = essm.a;
        String s = essm.b;
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "constructAccFromCache", s + " constructAccFromCache in RupayApplet");
        if(arr_b1 == null || arr_b1.length == 0) {
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initializeAccumulator", s + " initializeAccumulator in RupayApplet");
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "clearProfileData", s + "clearProfileData in RupayApplet starts");
            if(!essp0.q) {
                if(essp0.f() != null) {
                    essp0.k();
                }
                if(essp0.d() != null) {
                    essp0.l();
                }
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
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "clearProfileData", s + "clearProfileData in RupayApplet ends");
            byte[] arr_b2 = esuq.n(essp0.f());
            byte[] arr_b3 = esuq.n(essp0.d());
            byte[] arr_b4 = esuq.n(essp0.e());
            byte[] arr_b5 = essp0.aa();
            byte[] arr_b6 = essp0.Y();
            byte[] arr_b7 = essp0.Z();
            byte[] arr_b8 = essp0.X();
            essp0.r = 90;
            if(arr_b7 == null) {
                arr_b9 = essy.d(essy.a(0x77, new esss[]{essy.c(0xDF10, essp0.s), essy.c(0xDF27, essp0.t), essy.c(0xDF11, arr_b2), essy.c(0xDF12, arr_b3), essy.c(0xDF14, arr_b4), essy.c(0xDF13, arr_b5), essy.c(0xDF17, arr_b6), essy.c(0xDF23, arr_b8), essy.c(0xDF25, essp0.G()), essy.b(0xDF26, essp0.r)}));
                logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initializeAccumulator", s + "clearProfileData in RupayApplet serviceDirectory Null ends");
            }
            else {
                arr_b9 = essy.d(essy.a(0x77, new esss[]{essy.c(0xDF10, essp0.s), essy.c(0xDF27, essp0.t), essy.c(0xDF11, arr_b2), essy.c(0xDF12, arr_b3), essy.c(0xDF14, arr_b4), essy.c(0xDF13, arr_b5), essy.c(0xDF17, arr_b6), essy.c(0xDF19, arr_b7), essy.c(0xDF23, arr_b8), essy.c(0xDF25, essp0.G()), essy.b(0xDF26, essp0.r)}));
            }
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initializeAccumulator", a.r(essz.a(arr_b9), s, " tobeCached: "));
            arr_b1 = ByteBuffer.allocate(arr_b9.length).put(arr_b9).array();
        }
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "constructAccFromCache", s + " constructAccFromCache in RupayApplet Step-1");
        Map map0 = esuu.a(essz.a(arr_b1));
        if(map0.containsKey("77")) {
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "constructAccFromCache", s + "constructAccFromCache accumulator containsKey 77 in RupayApplet");
            Map map1 = esuu.a(((String)map0.get("77")));
            if(map1.containsKey("DF10")) {
                String s1 = (String)map1.get("DF10");
                if(s1 != null) {
                    essp0.s = essz.b(s1);
                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(essp0.s);
                    estb estb0 = estb.i;
                    int v = estb0.X;
                    byteBuffer0.position(v);
                    byte[] arr_b10 = new byte[6];
                    byteBuffer0.get(arr_b10, 0, 6);
                    byte[] arr_b11 = Arrays.copyOfRange(ests.a, 0, 6);
                    int v1 = estb.l.X;
                    byteBuffer0.position(v1);
                    int v2 = byteBuffer0.get();
                    if(Arrays.equals(arr_b10, arr_b11) && essp0.P() != null && !Arrays.equals(essp0.P(), arr_b11) && v2 != -91) {
                        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "updateAccAndCounterFromCache", s + "Global balance copied from Profile");
                        byteBuffer0.position(v);
                        byteBuffer0.put(essp0.P(), 0, 6);
                        byteBuffer0.position(v1);
                        byteBuffer0.put(-91);
                        byteBuffer0.position(v);
                        byteBuffer0.get(arr_b10, 0, estb0.Y);
                        essp0.s = byteBuffer0.array();
                    }
                }
            }
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "constructAccFromCache", s + " constructAccFromCache in RupayApplet Step-2");
            try {
                logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setSrvIdFromCache", s + " setSrvIdFromCache in RupayApplet starts");
                if(map1.containsKey("DF11")) {
                    String s2 = (String)map1.get("DF11");
                    if(s2 == null) {
                        essm0 = this;
                    }
                    else {
                        try {
                            essm0 = this;
                            LinkedHashMap linkedHashMap0 = (LinkedHashMap)esuq.b(essz.b(s2), new RupayApplet.1(essm0));
                            if(linkedHashMap0 != null) {
                                essp0.C(linkedHashMap0);
                            }
                        }
                        catch(Exception exception1) {
                            essm.a.logp(Level.WARNING, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setSrvIdFromCache", essm.b + "setSrvIdFromCache exception" + exception1.getMessage());
                            essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setSrvIdFromCache", exception1.getLocalizedMessage(), exception1);
                        }
                    }
                }
                else {
                    essm0 = this;
                }
                Logger logger1 = essm.a;
                String s3 = essm.b;
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setSrvIdFromCache", s3 + " setSrvIdFromCache in RupayApplet ends");
                if(map1.containsKey("DF12")) {
                    logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setAccDataSerIdAndServData", s3 + " constructAccFromCache - serviceIdAndServiceData list in RupayApplet");
                    String s4 = (String)map1.get("DF12");
                    if(s4 != null) {
                        try {
                            essp0.D(((LinkedHashMap)esuq.b(essz.b(s4), new RupayApplet.2(essm0))));
                        }
                        catch(IOException | ClassNotFoundException exception2) {
                            essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setAccDataSerIdAndServData", exception2.getLocalizedMessage(), exception2);
                        }
                    }
                }
                if(map1.containsKey("DF14")) {
                    essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setAccDataForTransactionLog", essm.b + " constructAccFromCache -transactionLogs: ");
                    essp0.F(new LinkedList());
                    String s5 = (String)map1.get("DF14");
                    if(s5 != null) {
                        try {
                            essp0.F(((List)esuq.b(essz.b(s5), new RupayApplet.3(essm0))));
                        }
                        catch(IOException | ClassNotFoundException exception3) {
                            essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setAccDataForTransactionLog", exception3.getLocalizedMessage(), exception3);
                        }
                    }
                }
                if(map1.containsKey("DF13")) {
                    String s6 = (String)map1.get("DF13");
                    if(s6 != null) {
                        essp0.E(essz.b(s6));
                    }
                }
                if(map1.containsKey("DF17")) {
                    String s7 = (String)map1.get("DF17");
                    if(s7 != null) {
                        essp0.A(essz.b(s7));
                    }
                }
                if(map1.containsKey("DF19") && map1.containsKey("DF26")) {
                    String s8 = (String)map1.get("DF26");
                    if(s8 != null) {
                        if(essz.b(s8)[0] == -91) {
                            essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setAccDataForSerDir", essm.b + " constructAccFromCache - TAG_SERVICE_DIRECTORY Cleared in Cache: ");
                            map1.put("DF26", "90");
                        }
                        else {
                            essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setAccDataForSerDir", essm.b + " constructAccFromCache - TAG_SERVICE_DIRECTORY Taken from Cache: ");
                            essp0.B(essz.b(((String)map1.get("DF19"))));
                        }
                    }
                }
                if(map1.containsKey("DF23")) {
                    String s9 = (String)map1.get("DF23");
                    if(s9 != null) {
                        essp0.z(essz.b(s9));
                        Level level0 = Level.INFO;
                        String s10 = essz.a(essp0.X());
                        essm.a.logp(level0, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setAccDataForRecoverAcCmd", essm.b + " constructAccFromCache - TAG_RECOVER_AC_LOG: " + s10);
                    }
                }
                if(map1.containsKey("DF25")) {
                    String s11 = (String)map1.get("DF25");
                    if(s11 != null) {
                        essp0.o(essz.b(s11));
                        Level level1 = Level.INFO;
                        String s12 = essz.a(essp0.G());
                        essm.a.logp(level1, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "setAccDataForPutDataCmd", essm.b + " constructAccFromCache - TAG_PUT: " + s12);
                    }
                }
                if(map1.containsKey("DF27")) {
                    String s13 = (String)map1.get("DF27");
                    if(s13 != null) {
                        essp0.t = essz.b(s13);
                    }
                }
                essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "constructAccFromCache", essm.b + " constructAccFromCache in RupayApplet Success Completed");
            }
            catch(Exception exception0) {
                essm.a.logp(Level.WARNING, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "constructAccFromCache", essm.b + "constructAccFromCache exception in RupayApplet" + exception0.getMessage());
                essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "constructAccFromCache", exception0.getLocalizedMessage(), exception0);
            }
        }
    }

    @Override  // essj
    public final esrz b(JSONObject jSONObject0, JSONObject jSONObject1) {
        int v3;
        String s3;
        int v1;
        byte[] arr_b;
        Logger logger0 = essm.a;
        String s = essm.b;
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "createCardProfile", s + " createCardProfile");
        essp essp0 = new essp();
        try {
            essp0.k = jSONObject0.getString("pan");
            essp0.l = jSONObject0.getString("psn");
            essp0.U = jSONObject0.getString("expiry");
            essp0.z = (byte[])essz.b(jSONObject0.get("ppseResponse").toString()).clone();
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s + " initPersoData- Step-1 Completed");
            JSONArray jSONArray0 = (JSONArray)jSONObject0.get("aids");
            JSONArray jSONArray1 = jSONArray0;
            JSONObject jSONObject2 = (JSONObject)jSONArray0.get(0);
            essp0.q = false;
            essp0.A(new byte[0x9E]);
            essp0.E(new byte[0xA9]);
            essp0.y(new byte[0x60]);
            essp0.F(new LinkedList());
            essp0.z(new byte[56]);
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s + " initPersoData- Step-2 Completed");
            essp0.Q = (JSONArray)jSONObject2.get("records");
            JSONArray jSONArray2 = (JSONArray)jSONObject2.get("records");
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "readIccFromAfl", s + " readIccFromAfl Begins ");
            int v = 0;
            while(true) {
                if(v >= jSONArray2.length()) {
                    arr_b = new byte[2];
                }
                else {
                    try {
                        v1 = v;
                        String s1 = ((JSONObject)jSONArray2.get(v)).get("recordData").toString();
                        v1 = v;
                        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "readIccFromAfl", s + "PARSETLVreadIccFromAfl");
                        Map map0 = esuu.a(s1);
                        if(map0.containsKey("70")) {
                            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "readIccFromAfl", s + "read record containsKey 70");
                            String s2 = (String)map0.get("70");
                            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "readIccFromAfl", s + "PARSETLV2readIccFromAfl");
                            Map map1 = esuu.a(s2);
                            if(map1.containsKey("5F28")) {
                                arr_b = essz.b(((String)map1.get("5F28")));
                                goto label_44;
                            }
                        }
                        goto label_176;
                    }
                    catch(JSONException jSONException0) {
                        s3 = s;
                        essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "readIccFromAfl", essm.b + " readIccFromAfl Exception ");
                        essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "readIccFromAfl", jSONException0.getLocalizedMessage(), jSONException0);
                        goto label_177;
                    }
                }
            label_44:
                essp0.T = arr_b;
                Map map2 = esuq.g(jSONObject2);
                Logger logger1 = essm.a;
                String s4 = essm.b;
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData pdol, cdol1, cdol2");
                essp0.a = (byte[])esuq.p(map2.get("pdol").toString()).clone();
                essp0.b = (byte[])esuq.p(map2.get("cdol1").toString()).clone();
                essp0.c = (byte[])esuq.p(map2.get("cdol2").toString()).clone();
                byte[] arr_b1 = (byte[])new byte[]{-97, 55, 4, -97, 28, 8}.clone();
                essp0.v = esuq.i(((String)map2.get("signatureFailLimit")));
                essp0.u = esuq.i(((String)map2.get("summaryFailLimit")));
                essp0.p = esuq.h(esuq.p(map2.get("offlineCounterLimit").toString()));
                essp0.x(esuq.p(map2.get("offlineSpendingLimit").toString()));
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData- Step-3 Completed");
                if(map2.containsKey("globalBalance")) {
                    essp0.n = (byte[])esuq.p(map2.get("globalBalance").toString()).clone();
                }
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData- Step-4 Completed");
                essp0.v(esuq.p(map2.get("globalBalanceLimit").toString()));
                essp0.o = (byte[])esuq.p(map2.get("localBalanceLimit").toString()).clone();
                essp0.x = (byte[])esuq.p(map2.get("logFormat").toString()).clone();
                String s5 = map2.get("gpoResponse").toString();
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", a.r(essz.a(s5.getBytes()), s4, "GPO_Response"));
                Map map3 = esuu.a(s5.substring(s5.indexOf("82")));
                essp0.I = (byte[])essz.b(((String)map3.get("82"))).clone();
                essp0.J = (byte[])essz.b(((String)map3.get("94"))).clone();
                essp0.K = (byte[])essz.b((essz.a(essp0.I()) + "18030300")).clone();
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData- Step-5 Completed");
                if(map2.containsKey("serviceDirectory")) {
                    essp0.B(esuq.p(map2.get("serviceDirectory").toString()));
                }
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData- Step-6 Completed");
                essp0.d = essm.f(((byte[])essp0.a.clone()), 1);
                essp0.e = essm.f(((byte[])essp0.b.clone()), 2);
                essp0.f = essm.f(((byte[])essp0.c.clone()), 3);
                essp0.g = essm.f(essz.b("9F36029F37049F1C089F10209F26089F2701DF2201"), 4);
                essp0.h = essm.f(essz.b("9F37049F1C08"), 5);
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData- Step-7 Completed");
                essp0.i = essm.f(essp0.S(), 6);
                essp0.j = essp0.i.j;
                essp0.u(esuq.p(map2.get("ciacOnline").toString()));
                essp0.s(esuq.p(map2.get("ciacDenial").toString()));
                essp0.r(esuq.p(map2.get("ciacDefault").toString()));
                essp0.t(esuq.p(map2.get("ciacDenialTransit").toString()));
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData- Step-8 Completed");
                essp0.s = new byte[estb.W.Y];
                essp0.t = new byte[estc.h.j];
                essp0.o(new byte[estd.k.m]);
                byte[] arr_b2 = (byte[])essz.b(map2.get("aid").toString()).clone();
                essp0.q(essz.b(map2.get("applicationControl").toString()));
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData- Step-9 Completed");
                if(map2.containsKey("serviceDirectory")) {
                    essp0.B(essz.b(map2.get("serviceDirectory").toString()));
                }
                essp0.m = map2.get("paymentResponse").toString();
                map2.get("gpoResponse");
                Locale.getDefault();
                essp0.w(essz.b(map2.get("iad").toString().toUpperCase(Locale.getDefault())));
                if(map2.containsKey("nic")) {
                    essp0.S = Integer.parseInt(map2.get("nic").toString());
                }
                essp0.p(essz.b(map2.get("additionalChecktable").toString()));
                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s4 + " initPersoData- Step-10 Completed");
                if(jSONObject2.has("services")) {
                    logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "checkAndUpdateServiceInfo", s4 + " checkAndUpdateServiceInfo Starts");
                    try {
                        JSONArray jSONArray3 = (JSONArray)jSONObject2.get("services");
                        essp0.C(new LinkedHashMap(jSONArray3.length()));
                        estr estr0 = new estr();
                        estr0.h = essp0;
                        for(int v2 = 0; v2 < jSONArray3.length(); v2 = v3 + 1) {
                            Map map4 = esuq.g(((JSONObject)jSONArray3.get(v2)));
                            String s6 = map4.get("serviceData").toString().substring(2, 6).toUpperCase(Locale.getDefault());
                            if(essp0.f().containsKey(s6)) {
                                v3 = v2;
                            }
                            else {
                                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "fillExistingServiceData", s4 + " fillExistingServiceData Starts");
                                String s7 = map4.get("serviceData").toString();
                                String s8 = map4.get("servPRMacq").toString().toUpperCase(Locale.getDefault());
                                String s9 = s7.substring(6, 10).toUpperCase(Locale.getDefault());
                                v3 = v2;
                                String s10 = s7.substring(2, 6).toUpperCase(Locale.getDefault());
                                byte[] arr_b3 = essz.b(s7);
                                byte[] arr_b4 = essz.b(s9);
                                if(estr0.z(estm.e, arr_b4)) {
                                    if(essp0.P() != null) {
                                        byte[] arr_b5 = essp0.P();
                                        estr0.p(este.j, arr_b5);
                                    }
                                    if(essp0.Q() != null) {
                                        byte[] arr_b6 = essp0.Q();
                                        estr0.p(este.u, arr_b6);
                                    }
                                }
                                else if(essp0.R() != null) {
                                    byte[] arr_b7 = essp0.R();
                                    estr0.p(este.u, arr_b7);
                                }
                                estr0.p(este.v, arr_b3);
                                byte[] arr_b8 = essz.b(s8);
                                estr0.p(este.t, arr_b8);
                                estr0.b();
                                estr0.c(essz.b(s9));
                                Map map5 = essp0.f();
                                ((LinkedHashMap)map5).put(s10, s9);
                                essp0.C(map5);
                                logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "fillExistingServiceData", s4 + " fillExistingServiceData ends");
                            }
                            essp0.q = true;
                        }
                        logger1.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "checkAndUpdateServiceInfo", s4 + " checkAndUpdateServiceInfo Success ends");
                    }
                    catch(JSONException jSONException1) {
                        essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "checkAndUpdateServiceInfo", essm.b + " checkAndUpdateServiceInfo exception");
                        essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "checkAndUpdateServiceInfo", jSONException1.getLocalizedMessage(), jSONException1);
                    }
                }
                Logger logger2 = essm.a;
                String s11 = essm.b;
                logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s11 + " initPersoData set aid");
                ArrayList arrayList0 = new ArrayList();
                int v4 = 0;
                while(v4 < jSONArray1.length()) {
                    arrayList0.add(esuq.g(((JSONObject)jSONArray1.get(0))));
                    ++v4;
                    jSONArray1 = jSONArray1;
                }
                essp0.P = (ArrayList)arrayList0.clone();
                logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s11 + " initPersoData- Step-11 Completed");
                JSONObject jSONObject3 = (JSONObject)jSONObject1.get("iccPrivateKey");
                logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s11 + " initPersoData- Step-12 Completed");
                essp0.H = (byte[])essz.b(((String)jSONObject3.get("modulus"))).clone();
                essp0.C = (byte[])essz.b(((String)jSONObject3.get("publicExponent"))).clone();
                essp0.D = (byte[])essz.b(((String)jSONObject3.get("exponent"))).clone();
                essp0.A = (byte[])essz.b(((String)jSONObject3.get("p"))).clone();
                essp0.B = (byte[])essz.b(((String)jSONObject3.get("q"))).clone();
                essp0.E = (byte[])essz.b(((String)jSONObject3.get("dP"))).clone();
                essp0.F = (byte[])essz.b(((String)jSONObject3.get("dQ"))).clone();
                essp0.G = (byte[])essz.b(((String)jSONObject3.get("qInv"))).clone();
                logger2.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", s11 + " initPersoData- Step-13 Completed all Success");
                break;
            label_176:
                s3 = s;
            label_177:
                v = v1 + 1;
                s = s3;
            }
        }
        catch(Exception exception0) {
            essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", "Json parse error in creating card profile", exception0);
            essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", essm.b + " PersoData initialized exception");
            essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", exception0.getLocalizedMessage(), exception0);
        }
        essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initPersoData", essm.b + " PersoData initialized");
        return essp0;
    }

    @Override  // essj
    public final essa c(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essb essb0, Set set0) {
        Logger logger0 = essm.a;
        String s = essm.b;
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initializeForPayment", s + " initializeForPayment in RupayApplet");
        this.a(((essp)esrz0), arr_b);
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initializeForPayment", s + " constructAccFromCache in initializeForPayment Success ");
        essm.h(((essp)esrz0), jSONObject0);
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initializeForPayment", s + " constructAccFromCache in saveKeyJsonInCardProfile Success ");
        essm.i(((essp)esrz0).s, jSONObject0);
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initializeForPayment", s + " constructAccFromCache in velocityCheck Success ");
        if(ByteBuffer.wrap(((essp)esrz0).s).get(estb.h.X) == -91) {
            essm.g(((essp)esrz0));
        }
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "initializeForPayment", s + " initializeForPayment Success ");
        return new esso(((essp)esrz0));
    }

    @Override  // essj
    public final esse d(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essg essg0, essb essb0) {
        essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "generateInAppTransaction", essm.b + " generateInAppTransaction");
        this.a(((essp)esrz0), arr_b);
        essm.h(((essp)esrz0), jSONObject0);
        if(ByteBuffer.wrap(((essp)esrz0).s).get(estb.h.X) == -91) {
            essm.g(((essp)esrz0));
        }
        if(essg0.b == 0) {
            throw new essd(1, "Currency Code is invalid");
        }
        if(essg0.e == 0) {
            throw new essd(1, "Terminal Country Code is invalid");
        }
        if(essg0.c > 999999999999000000L) {
            throw new essd(1, "Transaction Amount limit execeeded");
        }
        if(!esuq.k(essz.b(essg0.d))) {
            throw new essd(1, "Transaction Date format is invalid");
        }
        byte[] arr_b1 = new byte[2];
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(((essp)esrz0).s);
        byteBuffer0.position(estb.b.X);
        byteBuffer0.get(arr_b1);
        if(new BigInteger(essz.a(arr_b1), 16).compareTo(new BigInteger(essz.a(new byte[]{-1, -1}), 16)) <= 0) {
            return new estv(((essp)esrz0), essg0);
        }
        throw new essd(3, "ATC limit exceeded");
    }

    @Override  // essj
    public final String e() {
        return "unknown";
    }

    private static final esut f(byte[] arr_b, int v) {
        esut esut0 = new esut();
        byte[] arr_b1 = (byte[])arr_b.clone();
        if(v == 6) {
            arr_b1 = Arrays.copyOfRange(arr_b, 1, arr_b.length);
        }
        byte[] arr_b2 = (byte[])arr_b1.clone();
        Logger logger0 = essm.a;
        String s = essm.b;
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "generateDolTags", s + " generateDolTags while loop ");
        int v1 = 0;
        while(arr_b2.length - v1 > 0) {
            int v2 = v1 + 1;
            int v3 = glxg.a(arr_b2[v1]);
            if((v3 & 0x1F) == 0x1F) {
                v3 = v3 << 8 | glxg.a(arr_b2[v2]);
                v2 = v1 + 2;
            }
            v1 = v2 + 1;
            String s1 = Integer.toHexString(v3);
            int v4 = glxg.a(arr_b2[v2]);
            if((v4 & 0x80) != 0) {
                switch(v4 & 0xFFFFFF7F) {
                    case 1: {
                        v4 = glxg.a(arr_b2[v1]);
                        v1 = v2 + 2;
                        break;
                    }
                    case 2: {
                        v4 = glxg.a(arr_b2[v2 + 2]) | glxg.a(arr_b2[v1]) << 8;
                        v1 = v2 + 3;
                        break;
                    }
                    case 3: {
                        v4 = glxg.a(arr_b2[v1]) << 16 | glxg.a(arr_b2[v2 + 2]) << 8 | glxg.a(arr_b2[v2 + 3]);
                        v1 = v2 + 4;
                    }
                }
            }
            String s2 = s1.toLowerCase(Locale.ENGLISH);
            if(!esut0.a.containsKey(s2)) {
                int v5 = esut0.f;
                esus esus0 = new esus(s2, v4, v5);
                if(v == 1) {
                    esut0.a = esut0.b;
                    esut0.g += v4;
                }
                else if(v == 2) {
                    esut0.a = esut0.c;
                    esut0.h += v4;
                }
                else if(v == 3) {
                    esut0.a = esut0.d;
                    esut0.i += v4;
                }
                else if(v == 6) {
                    esut0.a = esut0.e;
                    esut0.j += v4;
                }
                esut0.f = v5 + esus0.b;
                esut0.a.put(esus0.a, esus0);
            }
        }
        logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "generateDolTags", s + " generateDolTags method end");
        return esut0;
    }

    private static final void g(essp essp0) {
        essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "replenish", essm.b + " replenish in RupayApplet starts");
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(essp0.s);
        byteBuffer0.position(estb.e.X);
        byteBuffer0.put(new byte[2]);
        byteBuffer0.position(estb.g.X);
        byteBuffer0.put(new byte[6]);
        byteBuffer0.put(estb.h.X, 90);
        essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "replenish", essm.b + " replenish in RupayApplet ends");
    }

    private static final void h(essp essp0, JSONObject jSONObject0) {
        essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "saveKeyJsonInCardProfile", essm.b + " saveKeyJsonInCardProfile in RupayApplet");
        try {
            essp0.N = jSONObject0.getJSONObject("luc");
            Map map0 = esuq.g(essp0.N);
            essp0.w = map0;
            byte[] arr_b = (byte[])essz.b(map0.get("lucKey").toString()).clone();
            essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "saveKeyJsonInCardProfile", essm.b + " in RupayApplet saveKeyJsonInCardProfile keyJsonObjectMap ");
        }
        catch(JSONException jSONException0) {
            essm.a.logp(Level.WARNING, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "saveKeyJsonInCardProfile", essm.b + "saveKeyJsonInCardProfile exception in RupayApplet" + jSONException0.getMessage());
            essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "saveKeyJsonInCardProfile", jSONException0.getLocalizedMessage(), jSONException0);
        }
    }

    private static final void i(byte[] arr_b, JSONObject jSONObject0) {
        essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", essm.b + " velocityCheck in RupayApplet starts");
        try {
            JSONObject jSONObject1 = jSONObject0.getJSONObject("luc");
            int v = Integer.parseInt(jSONObject1.getString("lucid"));
            int v1 = Integer.parseInt(jSONObject1.getString("usesUpper"));
            String s = jSONObject1.getString("expiryUpper");
            long v2 = jSONObject1.getLong("totalUpper");
            Date date0 = new Date();
            Date date1 = new Date();
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyMMdd", Locale.getDefault());
            essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", essm.b + " velocityCheck in RupayApplet Parsing  Dynamic data object complete ");
            try {
                date0 = simpleDateFormat0.parse(s);
                date1 = simpleDateFormat0.parse(simpleDateFormat0.format(date1));
            }
            catch(ParseException unused_ex) {
                essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", essm.b + " velocityCheck in RupayApplet in DynamicData Date Not proper ");
                essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", "Invalid DynamicData Date Format");
            }
            Logger logger0 = essm.a;
            String s1 = essm.b;
            logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", s1 + " velocityCheck in RupayApplet LuC Copy section");
            ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b);
            int v3 = estb.f.X;
            int v4 = byteBuffer1.getInt(v3);
            if(v4 == 0) {
                byteBuffer0.putInt(v3, v);
            }
            else if(v != v4) {
                byteBuffer0.put(estb.h.X, -91);
                byteBuffer0.putInt(v3, v);
            }
            if(date1.compareTo(date0) > 0) {
                logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", s1 + " velocityCheck in RupayApplet Current date exceeds upper date boundry ");
            }
            if(byteBuffer0.getShort(estb.e.X) >= v1) {
                logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", s1 + " velocityCheck in RupayApplet LUC limit exceeds ");
            }
            byte[] arr_b1 = new byte[6];
            byteBuffer0.position(estb.g.X);
            byteBuffer0.get(arr_b1, 0, 6);
            if(Long.parseLong(essz.a(arr_b1)) >= v2) {
                logger0.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", s1 + " velocityCheck in RupayApplet Txn amount limit exceeds ");
            }
        }
        catch(JSONException jSONException0) {
            essm.a.logp(Level.INFO, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", essm.b + " velocityCheck in RupayApplet throws exception");
            essm.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.RupayApplet", "velocityCheck", jSONException0.getLocalizedMessage(), jSONException0);
        }
    }
}

