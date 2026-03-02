import android.content.Context;
import android.telephony.SubscriptionManager;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import com.google.android.gms.common.Feature;
import com.google.android.gms.serviceentitlement.GmsTs43CarrierConfig;
import com.google.android.gms.serviceentitlement.GmsTs43Operator;
import com.google.android.gms.serviceentitlement.GmsTs43ServiceEntitlementRequest;
import com.google.android.gms.serviceentitlement.TempTokenBundle;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bcrn implements bcsg {
    rha a;
    azts b;
    private static final baun c;
    private final hofs d;
    private final bbxx e;
    private final bcrd f;
    private final Context g;
    private final bcrm h;
    private final bcqx i;
    private final ArrayList j;

    static {
        bcrn.c = bcrh.a("carrierIdTs43_verifier");
    }

    public bcrn(hofs hofs0, bbxx bbxx0, bcrd bcrd0, Context context0) {
        bcrm bcrm0 = bcrm.t(bcrd0);
        bcqx bcqx0 = bcqx.a(AppContextProvider.a());
        super();
        this.d = hofs0;
        this.e = bbxx0;
        this.f = bcrd0;
        this.g = context0;
        this.h = bcrm0;
        this.i = bcqx0;
        this.j = new ArrayList();
    }

    @Override  // bcsg
    public final hofs a() {
        String s4;
        rgz rgz1;
        rhd rhd2;
        hocq hocq1;
        String s3;
        rgz rgz0;
        rhd rhd1;
        String s2;
        bcrd bcrd1;
        baun baun0;
        String s1;
        hofs hofs1;
        rhd rhd0;
        int v1;
        String s;
        rhc rhc0;
        bcrd bcrd0;
        bbxx bbxx0;
        hock hock0;
        int v;
        if(this.h.u()) {
            hofs hofs0 = this.d;
            if((hofs0.e == null ? hoft.a : hofs0.e).b == 1) {
                try {
                    hoft hoft0 = hofs0.e == null ? hoft.a : hofs0.e;
                    if(hoft0.b == 1) {
                        try {
                            hofa hofa0 = (hofa)hoft0.c;
                            goto label_11;
                        label_10:
                            hofa0 = hofa.a;
                        label_11:
                            v = (hofa0.d == null ? hofd.a : hofa0.d).c;
                            hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
                            hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
                            hock0 = hobj0.c == 12 ? ((hock)hobj0.d) : hock.a;
                            if(hoch.a(hock0.c) == 1) {
                                hobo hobo0 = this.i(4);
                                return this.e.j(this.f, hofs0, hobo0);
                            }
                            bbxx0 = this.e;
                            bcrd0 = this.f;
                            hocg hocg0 = hock0.i == null ? hocg.a : hock0.i;
                            rhc0 = rhd.a();
                            rhc0.g(hocg0.b);
                            rhc0.h(hocg0.c);
                            rhc0.e(hocg0.d);
                            rhc0.l(hocg0.e);
                            rhc0.m(hocg0.f);
                            rhc0.p(hocg0.g);
                            rhc0.n(hocg0.h);
                            rhc0.o(hocg0.i);
                            rhc0.c(hocg0.j);
                            rhc0.d(hocg0.k);
                            rhc0.k(hocg0.l);
                            rhc0.j(hocg0.m);
                            rhc0.b(hocg0.n);
                            rhc0.f(hocg0.o);
                            rhc0.i(hocg0.p);
                            if((hock0.i == null ? hocg.a : hock0.i).f.equals("<imei>")) {
                                s = bcrm.s(bcrd0, SubscriptionManager.from(this.g).getActiveSubscriptionInfo(v)).j();
                                goto label_44;
                            }
                            goto label_61;
                        }
                        catch(bcrc bcrc0) {
                            goto label_261;
                        }
                    }
                    else {
                        goto label_10;
                    }
                    goto label_11;
                }
                catch(bcqm bcqm0) {
                    goto label_271;
                }
                catch(NullPointerException nullPointerException0) {
                    goto label_330;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_334;
                }
                try {
                    s = bcrm.s(bcrd0, SubscriptionManager.from(this.g).getActiveSubscriptionInfo(v)).j();
                    goto label_44;
                }
                catch(RuntimeException runtimeException1) {
                    try {
                        bcrn.c.g("Failed to fetch IMEI for TS.43", runtimeException1, new Object[0]);
                        this.g(gmfz.bs, gmfx.cd);
                        throw new bcrc(runtimeException1.getCause(), gmfx.cd);
                    label_44:
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hock0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)hock0));
                        hocg hocg1 = hock0.i == null ? hocg.a : hock0.i;
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hocg1).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)hocg1));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((hocg)hftp1.b_message).f = s;
                        hocg hocg2 = (hocg)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hock hock1 = (hock)hftp0.b_message;
                        hocg2.getClass();
                        hock1.i = hocg2;
                        hock1.b |= 2;
                        hock0 = (hock)hftp0.N_build();
                        rhc0.m(s);
                    label_61:
                        if(hrfm.a.c().j()) {
                            v1 = hock0.c;
                            if(hoch.a(v1) == 6) {
                                goto label_193;
                            }
                            else {
                                goto label_64;
                            }
                        }
                        else {
                        label_64:
                            rhd0 = rhc0.a();
                            if(this.a == null) {
                                hofs1 = hofs0;
                                this.a = new rha(AppContextProvider.a(), bcrn.h(hock0), v, true);
                            }
                            else {
                                hofs1 = hofs0;
                            }
                            s1 = this.a.d(hock0.h, rhd0);
                            goto label_82;
                        }
                        goto label_236;
                    }
                    catch(bcrc bcrc0) {
                        goto label_261;
                    }
                    catch(bcqm bcqm0) {
                        goto label_271;
                    }
                    catch(NullPointerException nullPointerException0) {
                        goto label_330;
                    }
                    catch(RuntimeException runtimeException0) {
                        goto label_334;
                    }
                    try {
                        try {
                            s1 = this.a.d(hock0.h, rhd0);
                            goto label_82;
                        }
                        catch(rhb rhb0) {
                            bcrn.c.g("ServiceEntitlement Auth API request failed", rhb0, new Object[0]);
                            gmfx gmfx0 = bcrn.f(rhb0);
                            this.i.l(this.f, this.d, gmfz.bm, gmfx0, String.format(Locale.US, "HTTP Status: %d", ((int)rhb0.b)));
                            throw new bcqm(rhb0.a, rhb0.b, rhb0.c, rhb0.getMessage(), rhb0.getCause(), 3);
                        }
                    }
                    catch(Throwable throwable0) {
                        try {
                            try {
                                bcrn.c.d("HTTP History: %s", new Object[]{this.a.e()});
                                this.j.addAll(this.a.e());
                                this.a.f();
                                throw throwable0;
                            label_82:
                                baun0 = bcrn.c;
                                baun0.d("HTTP History: %s", new Object[]{this.a.e()});
                                this.j.addAll(this.a.e());
                                this.a.f();
                                bcrd1 = bcrd0;
                                this.i.n(this.f.a, gmfz.bl, gmgd.p);
                                baun0.d("TS43 API returns successful response", new Object[0]);
                                baun0.j("TS43 Auth response: ", new Object[]{s1});
                            }
                            catch(bcrc bcrc0) {
                                goto label_261;
                            }
                            try {
                                JSONObject jSONObject0 = new JSONObject(s1);
                                if(!jSONObject0.has("Token")) {
                                    baun0.m("token parameter missing from ts43response object", new Object[0]);
                                    throw new bcrc(gmfx.aI, false);
                                }
                                if(!jSONObject0.has("Vers")) {
                                    baun0.m("version parameter missing from ts43response object", new Object[0]);
                                    throw new bcrc(gmfx.aI, false);
                                }
                                if(!jSONObject0.getJSONObject("Token").has("token")) {
                                    baun0.m("token parameter missing from jsonToken object", new Object[0]);
                                    throw new bcrc(gmfx.aI, false);
                                }
                                JSONObject jSONObject1 = jSONObject0.getJSONObject("Vers");
                                if(!jSONObject1.has("version")) {
                                    baun0.m("version parameter missing from jsonVersion object", new Object[0]);
                                    throw new bcrc(gmfx.aI, false);
                                }
                                if(!jSONObject1.has("validity")) {
                                    baun0.m("validity parameter missing from jsonVersion object", new Object[0]);
                                    throw new bcrc(gmfx.aI, false);
                                }
                                s2 = new JSONObject(s1).getJSONObject("Token").getString("token");
                                goto label_113;
                            }
                            catch(JSONException | bcrc exception0) {
                                try {
                                    bcrn.c.f("Invalid TS43 response received: ", new Object[]{s1, exception0});
                                    this.i.l(this.f, this.d, gmfz.bm, gmfx.bS, s1);
                                    throw new bcrc(exception0.getCause(), gmfx.aI);
                                label_113:
                                    rhc0.e(s2);
                                    baun0.d("TS43 Auth token: ", new Object[]{s2});
                                    switch(hoch.a(hock0.c)) {
                                        case 5: {
                                            goto label_117;
                                        }
                                        case 6: {
                                            goto label_155;
                                        }
                                    }
                                    throw new bcrc(gmfx.bR, false);
                                label_117:
                                    rhd1 = rhc0.a();
                                    hoci hoci0 = hock0.c == 4 ? ((hoci)hock0.d) : hoci.a;
                                    rgz0 = bcrn.e((hoci0.b == null ? hocb.a : hoci0.b));
                                    if(this.a == null) {
                                        this.a = new rha(AppContextProvider.a(), bcrn.h(hock0), v, true);
                                    }
                                }
                                catch(bcrc bcrc0) {
                                    goto label_261;
                                }
                            }
                        }
                        catch(bcqm bcqm0) {
                            goto label_271;
                        }
                        catch(NullPointerException nullPointerException0) {
                            goto label_330;
                        }
                        catch(RuntimeException runtimeException0) {
                            goto label_334;
                        }
                    }
                    try {
                        try {
                            s3 = this.a.b(hock0.h, rhd1, rgz0);
                            goto label_134;
                        }
                        catch(rhb rhb1) {
                            bcrn.c.g("ServiceEntitlement GetPhoneNumber API request failed: %s", rhb1, new Object[0]);
                            gmfx gmfx1 = bcrn.f(rhb1);
                            this.i.l(this.f, this.d, gmfz.bo, gmfx1, String.format(Locale.US, "HTTP Status: %d", ((int)rhb1.b)));
                            throw new bcqm(rhb1.a, rhb1.b, rhb1.c, rhb1.getMessage(), rhb1.getCause(), 4);
                        }
                    }
                    catch(Throwable throwable1) {
                        try {
                            bcrn.c.d("HTTP History: %s", new Object[]{this.a.e()});
                            this.j.addAll(this.a.e());
                            this.a.f();
                            throw throwable1;
                        label_134:
                            baun0.d("HTTP History: %s", new Object[]{this.a.e()});
                            this.j.addAll(this.a.e());
                            this.a.f();
                            baun0.d("TS43 GetPhoneNumber response received: %s", new Object[]{s3});
                            this.i.n(this.f.a, gmfz.bp, gmgd.q);
                            hocl hocl0 = (hocl)((ProtoLiteMessage)hocq.a).v_newBuilder();
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hocm.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            hocm hocm0 = (hocm)hftp2.b_message;
                            s3.getClass();
                            hocm0.b = s3;
                            hocm hocm1 = (hocm)hftp2.N_build();
                            if(!hocl0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hocl0).ensureMutable();
                            }
                            hocq hocq0 = (hocq)hocl0.b_message;
                            hocm1.getClass();
                            hocq0.d = hocm1;
                            hocq0.c = 2;
                            hocq1 = (hocq)((ProtoLiteBuilder)hocl0).N_build();
                            goto label_236;
                        label_155:
                            rhd2 = rhc0.a();
                            hocj hocj0 = hock0.c == 5 ? ((hocj)hock0.d) : hocj.a;
                            rgz1 = bcrn.e((hocj0.b == null ? hocb.a : hocj0.b));
                            if(this.a == null) {
                                this.a = new rha(AppContextProvider.a(), bcrn.h(hock0), v, true);
                            }
                        }
                        catch(bcrc bcrc0) {
                            goto label_261;
                        }
                        catch(bcqm bcqm0) {
                            goto label_271;
                        }
                        catch(NullPointerException nullPointerException0) {
                            goto label_330;
                        }
                        catch(RuntimeException runtimeException0) {
                            goto label_334;
                        }
                    }
                    try {
                        try {
                            s4 = this.a.b(hock0.h, rhd2, rgz1);
                            goto label_172;
                        }
                        catch(rhb rhb2) {
                            bcrn.c.g("ServiceEntitlement AcquireTemporary API request failed: %s", rhb2, new Object[0]);
                            gmfx gmfx2 = bcrn.f(rhb2);
                            this.i.l(this.f, this.d, gmfz.bq, gmfx2, String.format(Locale.US, "HTTP Status: %d", ((int)rhb2.b)));
                            throw new bcqm(rhb2.a, rhb2.b, rhb2.c, rhb2.getMessage(), rhb2.getCause(), 5);
                        }
                    }
                    catch(Throwable throwable2) {
                        try {
                            bcrn.c.d("HTTP History: %s", new Object[]{this.a.e()});
                            this.j.addAll(this.a.e());
                            this.a.f();
                            throw throwable2;
                        label_172:
                            baun0.d("HTTP History: %s", new Object[]{this.a.e()});
                            this.j.addAll(this.a.e());
                            this.a.f();
                            baun0.d("TS43 AcquireTemporaryToken response: %s", new Object[]{s4});
                            this.i.n(this.f.a, gmfz.br, gmgd.r);
                            hocl hocl1 = (hocl)((ProtoLiteMessage)hocq.a).v_newBuilder();
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hocp.a).v_newBuilder();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            hocp hocp0 = (hocp)hftp3.b_message;
                            s4.getClass();
                            hocp0.b = s4;
                            hocp hocp1 = (hocp)hftp3.N_build();
                            if(!hocl1.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hocl1).ensureMutable();
                            }
                            hocq hocq2 = (hocq)hocl1.b_message;
                            hocp1.getClass();
                            hocq2.d = hocp1;
                            hocq2.c = 3;
                            hocq1 = (hocq)((ProtoLiteBuilder)hocl1).N_build();
                            goto label_236;
                            try {
                            label_193:
                                hocg hocg3 = hock0.i == null ? hocg.a : hock0.i;
                                GmsTs43ServiceEntitlementRequest gmsTs43ServiceEntitlementRequest0 = new GmsTs43ServiceEntitlementRequest(hocg3.b, gfta.b(hocg3.c), gfta.b(hocg3.d), gfta.b(hocg3.e), gfta.b(hocg3.f), gfta.b(hocg3.g), gfta.b(hocg3.h), gfta.b(hocg3.i), gfta.b(hocg3.j), "ap2014", gfta.b(hocg3.k), gfta.b(hocg3.n), gfta.b(hocg3.o), gfta.b(hocg3.p));
                                hocj hocj1 = v1 == 5 ? ((hocj)hock0.d) : hocj.a;
                                hocb hocb0 = hocj1.b == null ? hocb.a : hocj1.b;
                                GmsTs43Operator gmsTs43Operator0 = new GmsTs43Operator(hocb0.b, hocb0.c, gged_interceptors.i(hocb0.d), hocb0.e, hocb0.f, hocb0.g, hocb0.h, hocb0.i, hocb0.j, hocb0.k, hocb0.l, hocb0.m, hocb0.n, hocb0.o, gged_interceptors.i(hocb0.p), hocb0.q, hocb0.r, hocb0.s, hocb0.t, hocb0.u, hocb0.v, "", "");
                                GmsTs43CarrierConfig gmsTs43CarrierConfig0 = new GmsTs43CarrierConfig(bbqr.c(hock0.f), "", false, ((int)hrfm.b()), bbqr.c((!hrfm.h() || hock0.g.isEmpty() ? null : hock0.g)), null);
                                if(this.b == null) {
                                    this.b = new azts(AppContextProvider.a(), null);
                                }
                                azts azts0 = this.b;
                                azzc azzc0 = new azzc();
                                azzc0.c = new Feature[]{eomo.a};
                                azzc0.a = new eone(azts0, v, gmsTs43ServiceEntitlementRequest0, gmsTs43Operator0, gmsTs43CarrierConfig0);
                                azzc0.b = false;
                                azzc0.d = 33106;
                                TempTokenBundle tempTokenBundle0 = (TempTokenBundle)evrg.n(azts0.iG(azzc0.a()));
                                hocl hocl2 = (hocl)((ProtoLiteMessage)hocq.a).v_newBuilder();
                                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hocp.a).v_newBuilder();
                                String s5 = tempTokenBundle0.a;
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                hocp hocp2 = (hocp)hftp4.b_message;
                                s5.getClass();
                                hocp2.b = s5;
                                hocp hocp3 = (hocp)hftp4.N_build();
                                if(!hocl2.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hocl2).ensureMutable();
                                }
                                hocq hocq3 = (hocq)hocl2.b_message;
                                hocp3.getClass();
                                hocq3.d = hocp3;
                                hocq3.c = 3;
                                hocq1 = (hocq)((ProtoLiteBuilder)hocl2).N_build();
                                hofs1 = hofs0;
                                bcrd1 = bcrd0;
                            }
                            catch(ExecutionException executionException0) {
                                bcrn.c.g("Failed to get temp token with ExecutionException", executionException0, new Object[0]);
                                rie rie0 = (rie)executionException0.getCause();
                                if(rie0 == null) {
                                    throw new bcrc(executionException0.getCause(), gmfx.bQ);
                                }
                                throw new bcqm(rie0.a, rie0.b, rie0.c, rie0.getMessage(), executionException0, 6);
                            }
                            catch(InterruptedException interruptedException0) {
                                bcrn.c.g("Failed to get temp token with InterruptedException", interruptedException0, new Object[0]);
                                throw new bcrc(interruptedException0.getCause(), gmfx.bQ);
                            }
                        label_236:
                            if(!hrfm.d()) {
                                this.j.clear();
                            }
                            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
                            ProtoLiteBuilder hftp6 = (ProtoLiteBuilder)((ProtoLiteMessage)hocq1).jf(5, null);
                            hftp6.X(((ProtoLiteMessage)hocq1));
                            hoer hoer1 = this.d.c == 4 ? ((hoer)this.d.d) : hoer.a;
                            hobj hobj1 = hoer1.c == null ? hobj.a : hoer1.c;
                            hock hock2 = hobj1.c == 12 ? ((hock)hobj1.d) : hock.a;
                            gmea gmea0 = hock2.e == null ? gmea.a : hock2.e;
                            if(!((hocl)hftp6).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((hocl)hftp6))).ensureMutable();
                            }
                            hocq hocq4 = (hocq)((hocl)hftp6).b_message;
                            gmea0.getClass();
                            hocq4.e = gmea0;
                            hocq4.b |= 1;
                            ((hocl)hftp6).a(this.j);
                            hocq hocq5 = (hocq)((ProtoLiteBuilder)(((hocl)hftp6))).N_build();
                            if(!hftp5.b_message.isImmutable()) {
                                hftp5.ensureMutable();
                            }
                            hobo hobo1 = (hobo)hftp5.b_message;
                            hocq5.getClass();
                            hobo1.c = hocq5;
                            hobo1.b = 9;
                            return bbxx0.j(bcrd1, hofs1, ((hobo)hftp5.N_build()));
                        }
                        catch(bcrc bcrc0) {
                            goto label_261;
                        }
                        catch(bcqm bcqm0) {
                            goto label_271;
                        }
                        catch(NullPointerException nullPointerException0) {
                        }
                        catch(RuntimeException runtimeException0) {
                            goto label_334;
                        }
                    }
                }
                catch(bcrc bcrc0) {
                label_261:
                    bcrn.c.g("Failed to get temp token with VerificationException", bcrc0, new Object[0]);
                    bbxx bbxx1 = this.e;
                    bcrd bcrd2 = this.f;
                    hofs hofs2 = this.d;
                    switch(bcrc0.a.ordinal()) {
                        case 86: {
                            return bbxx1.j(bcrd2, hofs2, this.i(7));
                        }
                        case 0x93: {
                            return bbxx1.j(bcrd2, hofs2, this.i(3));
                        }
                        case 0x9F: {
                            return bbxx1.j(bcrd2, hofs2, this.i(5));
                        }
                        default: {
                            return bbxx1.j(bcrd2, hofs2, this.i(2));
                        }
                    }
                }
                catch(bcqm bcqm0) {
                label_271:
                    bbxx bbxx2 = this.e;
                    bcrd bcrd3 = this.f;
                    hofs hofs3 = this.d;
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hocn.a).v_newBuilder();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    int v2 = bcqm0.d;
                    ProtoLiteMessage hftv0 = hftp7.b_message;
                    if(v2 == 1) {
                        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                    }
                    ((hocn)hftv0).d = v2 - 2;
                    int v3 = bcqm0.a;
                    if(!hftv0.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp7.b_message;
                    ((hocn)hftv1).b = v3;
                    int v4 = bcqm0.b;
                    if(!hftv1.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ((hocn)hftp7.b_message).c = v4;
                    hocn hocn0 = (hocn)hftp7.N_build();
                    if(!hrfm.d()) {
                        this.j.clear();
                    }
                    ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
                    hocl hocl3 = (hocl)((ProtoLiteMessage)hocq.a).v_newBuilder();
                    hoer hoer2 = hofs3.c == 4 ? ((hoer)hofs3.d) : hoer.a;
                    hobj hobj2 = hoer2.c == null ? hobj.a : hoer2.c;
                    hock hock3 = hobj2.c == 12 ? ((hock)hobj2.d) : hock.a;
                    gmea gmea1 = hock3.e == null ? gmea.a : hock3.e;
                    if(!hocl3.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hocl3).ensureMutable();
                    }
                    hocq hocq6 = (hocq)hocl3.b_message;
                    gmea1.getClass();
                    hocq6.e = gmea1;
                    hocq6.b |= 1;
                    ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hoco.a).v_newBuilder();
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    hoco hoco0 = (hoco)hftp9.b_message;
                    hocn0.getClass();
                    hoco0.c = hocn0;
                    hoco0.b = 2;
                    hoco hoco1 = (hoco)hftp9.N_build();
                    if(!hocl3.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hocl3).ensureMutable();
                    }
                    hocq hocq7 = (hocq)hocl3.b_message;
                    hoco1.getClass();
                    hocq7.f = hoco1;
                    hocq7.b |= 2;
                    hocl3.a(this.j);
                    hocq hocq8 = (hocq)((ProtoLiteBuilder)hocl3).N_build();
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    hobo hobo2 = (hobo)hftp8.b_message;
                    hocq8.getClass();
                    hobo2.c = hocq8;
                    hobo2.b = 9;
                    return bbxx2.j(bcrd3, hofs3, ((hobo)hftp8.N_build()));
                }
            label_330:
                bcrn.c.g("Failed to get temp token with NullPointerException", nullPointerException0, new Object[0]);
                hobo hobo3 = this.i(5);
                return this.e.j(this.f, this.d, hobo3);
            label_334:
                bcrn.c.g("Failed to get temp token with RuntimeException", runtimeException0, new Object[0]);
                hobo hobo4 = this.i(6);
                return this.e.j(this.f, this.d, hobo4);
            }
            this.g(gmfz.bs, gmfx.ce);
            bcrn.c.d("Pending Verification doesn\'t have SIM", new Object[0]);
        }
        else {
            this.g(gmfz.bs, gmfx.bR);
            bcrn.c.d("CarrierId is not supported", new Object[0]);
        }
        hobo hobo5 = this.i(3);
        return this.e.j(this.f, this.d, hobo5);
    }

    @Override  // bcsg
    public final hofs b() {
        return this.d;
    }

    @Override  // bcsg
    public final String c() {
        hoer hoer0 = this.d.c == 4 ? ((hoer)this.d.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        return (hobj0.e == null ? hobk.a : hobj0.e).b;
    }

    @Override  // bcsg
    public final void d() {
    }

    private static rgz e(hocb hocb0) {
        rgy rgy0 = rgz.a();
        rgy0.n(hocb0.b);
        rgy0.p(hocb0.c);
        rgy0.o(gged_interceptors.i(hocb0.d));
        rgy0.e(hocb0.e);
        rgy0.i(hocb0.f);
        rgy0.f(hocb0.g);
        rgy0.h(hocb0.h);
        rgy0.c(hocb0.i);
        rgy0.g(hocb0.j);
        rgy0.d(hocb0.k);
        rgy0.b(hocb0.l);
        rgy0.x(hocb0.m);
        rgy0.w(hocb0.n);
        rgy0.s(hocb0.o);
        rgy0.t(gged_interceptors.i(hocb0.p));
        rgy0.r(hocb0.q);
        rgy0.q(hocb0.r);
        rgy0.v(hocb0.s);
        rgy0.u(hocb0.t);
        rgy0.m(hocb0.u);
        rgy0.l(hocb0.v);
        return rgy0.a();
    }

    private static gmfx f(rhb rhb0) {
        switch(rhb0.a) {
            case 10: {
                return gmfx.bZ;
            }
            case 20: {
                return gmfx.bH;
            }
            case 21: {
                return gmfx.bI;
            }
            case 30: {
                return gmfx.ca;
            }
            case 0x1F: {
                return gmfx.cb;
            }
            case 0x20: {
                return gmfx.cc;
            }
            default: {
                return gmfx.bQ;
            }
        }
    }

    private final void g(gmfz gmfz0, gmfx gmfx0) {
        this.i.l(this.f, this.d, gmfz0, gmfx0, null);
    }

    private static final rgw h(hock hock0) {
        rgv rgv0 = rgw.a();
        rgv0.d(hock0.f);
        rgv0.e(((int)hrfm.b()));
        if(hrfm.h() && !hock0.g.isEmpty()) {
            rgv0.c(hock0.g);
        }
        return rgv0.a();
    }

    private final hobo i(int v) {
        if(!hrfm.d()) {
            this.j.clear();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
        hocl hocl0 = (hocl)((ProtoLiteMessage)hocq.a).v_newBuilder();
        hoer hoer0 = this.d.c == 4 ? ((hoer)this.d.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        hock hock0 = hobj0.c == 12 ? ((hock)hobj0.d) : hock.a;
        gmea gmea0 = hock0.e == null ? gmea.a : hock0.e;
        if(!hocl0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hocl0).ensureMutable();
        }
        hocq hocq0 = (hocq)hocl0.b_message;
        gmea0.getClass();
        hocq0.e = gmea0;
        hocq0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hoco.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hoco)hftp1.b_message).c = (int)(v - 2);
        ((hoco)hftp1.b_message).b = 1;
        hoco hoco0 = (hoco)hftp1.N_build();
        if(!hocl0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hocl0).ensureMutable();
        }
        hocq hocq1 = (hocq)hocl0.b_message;
        hoco0.getClass();
        hocq1.f = hoco0;
        hocq1.b |= 2;
        hocl0.a(this.j);
        hocq hocq2 = (hocq)((ProtoLiteBuilder)hocl0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hobo hobo0 = (hobo)hftp0.b_message;
        hocq2.getClass();
        hobo0.c = hocq2;
        hobo0.b = 9;
        return (hobo)hftp0.N_build();
    }
}

