import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpMoney;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import jeb.synthetic.TWR;

public final class cryd {
    public final String a;
    public final String b;
    public final int c;
    public final Context d;
    private static final bboh e;
    private static final ggfp f;
    private final ccmg g;
    private final baqr h;

    static {
        cryd.e = bboh.b("MobileDataPlan", bbcu.ck);
        cryd.f = ggog.c(gsoj.b, new gsoj[]{gsoj.c, gsoj.d});
    }

    public cryd(Context context0, String s, String s1, int v) {
        this.d = context0;
        this.a = s;
        this.b = s1;
        this.c = v;
        context0.getApplicationInfo();
        baqr baqr0 = new baqr();
        baqr0.a = context0.getApplicationInfo().uid;
        baqr0.e = "com.google.android.gms";
        baqr0.d = "com.google.android.gms";
        this.h = baqr0;
        this.g = new ccmp();
    }

    public final MdpDataPlanStatusResponse a(String s, MdpDataPlanStatusRequest mdpDataPlanStatusRequest0) {
        return this.b(s, mdpDataPlanStatusRequest0, null);
    }

    public final MdpDataPlanStatusResponse b(String s, MdpDataPlanStatusRequest mdpDataPlanStatusRequest0, ckcq ckcq0) {
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse0;
        gsou gsou0;
        boolean z1;
        cslv cslv0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsot.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsot gsot0 = (gsot)hftp0.b_message;
        s.getClass();
        gsot0.b = s;
        Context context0 = this.d;
        String s1 = cslm.e(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsot gsot1 = (gsot)hftp0.b_message;
        s1.getClass();
        gsot1.j = s1;
        if(hvko.b() > 0L) {
            long v = hvko.b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsot)hftp0.b_message).i = v;
        }
        boolean z = csli.z(mdpDataPlanStatusRequest0.e);
        String s2 = z ? mdpDataPlanStatusRequest0.e : csli.k(context0);
        if((csli.y() || z) && s2 != null) {
            String s3 = s2.substring(0, 3);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsot gsot2 = (gsot)hftp0.b_message;
            s3.getClass();
            gsot2.c = s3;
            String s4 = s2.substring(3);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsot gsot3 = (gsot)hftp0.b_message;
            s4.getClass();
            gsot3.d = s4;
        }
        Bundle bundle0 = null;
        if(hvko.N()) {
            List list0 = csli.A(context0, 1);
            String s5 = mdpDataPlanStatusRequest0.f;
            for(Object object0: list0) {
                cslv0 = (cslv)object0;
                if((!TextUtils.isEmpty(s5) || !s.equals(crvw.c().s(cslv0.a))) && (TextUtils.isEmpty(s5) || !s5.equals(cslv0.a))) {
                    continue;
                }
                goto label_44;
            }
            cslv0 = null;
        label_44:
            if(cslv0 != null) {
                if(csli.y()) {
                    String s6 = cslv0.b;
                    String s7 = s6.substring(0, 3);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gsot gsot4 = (gsot)hftp0.b_message;
                    s7.getClass();
                    gsot4.c = s7;
                    String s8 = s6.substring(3);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gsot gsot5 = (gsot)hftp0.b_message;
                    s8.getClass();
                    gsot5.d = s8;
                }
                int v1 = cslv0.h;
                if(v1 != -1) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gsot)hftp0.b_message).g = v1;
                }
                String s9 = cslv0.i;
                if(s9 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gsot)hftp0.b_message).e = s9;
                }
                String s10 = cslv0.j;
                if(s10 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gsot)hftp0.b_message).f = s10;
                }
            }
        }
        Bundle bundle1 = mdpDataPlanStatusRequest0.b;
        if(hvko.F() && bundle1 != null && bundle1.size() > 0) {
            if(bundle1.getBoolean("return-stats")) {
                bundle1.remove("return-stats");
                z1 = true;
            }
            else {
                z1 = false;
            }
            gsog gsog0 = (gsog)((ProtoLiteMessage)gsoi.a).v_newBuilder();
            for(Object object1: bundle1.keySet()) {
                String s11 = (String)object1;
                Object object2 = bundle1.get(s11);
                if((object2 instanceof String)) {
                    gsog0.a(s11, ((String)object2));
                }
                else {
                    if(object2 != null) {
                        object2.getClass();
                    }
                    gsog0.a(s11, "INVALID_NON_STRING");
                }
            }
            Map map0 = DesugarCollections.unmodifiableMap(((gsoi)gsog0.b_message).b);
            if(gfqz.e((map0.containsKey("bypass_gtaf_cache") ? ((String)map0.get("bypass_gtaf_cache")) : "false"), "true")) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gsot)hftp0.b_message).h = true;
            }
            String s12 = Base64.encodeToString(((gsoi)((ProtoLiteBuilder)gsog0).N_build()).toBytesArray(), 10);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsot gsot6 = (gsot)hftp0.b_message;
            s12.getClass();
            gsot6.k = s12;
        }
        else {
            z1 = false;
        }
        Integer integer0 = mdpDataPlanStatusRequest0.c;
        if(integer0 != null) {
            int v2 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsot)hftp0.b_message).m = v2;
        }
        Long long0 = mdpDataPlanStatusRequest0.d;
        if(long0 != null) {
            long v3 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsot)hftp0.b_message).l = v3;
        }
        bboh bboh0 = cryd.e;
        bboh0.g(cslm.h()).B("GetPlan req:{%s}\n", hftp0.N_build());
        cryc cryc0 = new cryc(this);
        try {
            if(ckcq0 == null) {
                crwn crwn1 = cryc0.a();
                gsot gsot8 = (gsot)hftp0.N_build();
                gsou0 = crwn1.d(this.h, gsot8);
            }
            else {
                crwn crwn0 = new crwn(cryc0.a(), cmlp.a, ckcq0);
                gsot gsot7 = (gsot)hftp0.N_build();
                gsou0 = crwn0.d(this.h, gsot7);
            }
            bboh0.g(cslm.h()).B("GetPlan rsp:{%s}\n", gsou0);
            if(hvko.F() && (gsou0.f == null ? gsoi.a : gsou0.f).b.size() > 0) {
                Bundle bundle2 = new Bundle();
                for(Object object3: DesugarCollections.unmodifiableMap((gsou0.f == null ? gsoi.a : gsou0.f).b).entrySet()) {
                    bundle2.putString(((String)((Map.Entry)object3).getKey()), ((String)((Map.Entry)object3).getValue()));
                }
                if(z1) {
                    try {
                        Iterator iterator3 = new bakc(AppContextProvider.a(), "mdp-stats-data", false, null).getAll().entrySet().iterator();
                        while(true) {
                            if(!iterator3.hasNext()) {
                                goto label_148;
                            }
                            Object object4 = iterator3.next();
                            Map.Entry map$Entry0 = (Map.Entry)object4;
                            if(map$Entry0.getValue().getClass() == Long.class) {
                                bundle2.putLong(((String)map$Entry0.getKey()), ((Long)map$Entry0.getValue()).longValue());
                            }
                        }
                    }
                    catch(bakb unused_ex) {
                        ((ggtj)ChimeraPeriodicUpdaterService.a.j()).x("SharedPreferences failed to populate stats.");
                        goto label_148;
                    }
                }
                else {
                label_148:
                    bundle0 = bundle2;
                }
            }
            mdpDataPlanStatusResponse0 = cryi.c(gsou0, mdpDataPlanStatusRequest0.a, bundle0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cryc0, throwable0);
            throw throwable0;
        }
        cryc0.close();
        return mdpDataPlanStatusResponse0;
    }

    public final MdpPurchaseOfferResponse c(MdpPurchaseOfferRequest mdpPurchaseOfferRequest0, ckcq ckcq0) {
        MdpPurchaseOfferResponse mdpPurchaseOfferResponse0;
        String s13;
        Integer integer1;
        Bundle bundle2;
        gsqh gsqh0;
        gsqa gsqa0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gspz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gspz gspz0 = (gspz)hftp0.b_message;
        mdpPurchaseOfferRequest0.a.getClass();
        gspz0.c = mdpPurchaseOfferRequest0.a;
        if(hvko.b() > 0L) {
            long v = hvko.b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gspz)hftp0.b_message).g = v;
        }
        String s = csli.k(this.d);
        if(csli.y() && s != null) {
            String s1 = s.substring(0, 3);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gspz gspz1 = (gspz)hftp0.b_message;
            s1.getClass();
            gspz1.d = s1;
            String s2 = s.substring(3);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gspz gspz2 = (gspz)hftp0.b_message;
            s2.getClass();
            gspz2.e = s2;
        }
        Integer integer0 = mdpPurchaseOfferRequest0.f;
        if(integer0 != null) {
            int v1 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gspz)hftp0.b_message).j = v1;
        }
        Long long0 = mdpPurchaseOfferRequest0.g;
        if(long0 != null) {
            long v2 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gspz)hftp0.b_message).i = v2;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gspq.a).v_newBuilder();
        String s3 = mdpPurchaseOfferRequest0.b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s3.getClass();
        ((gspq)hftv0).b = s3;
        String s4 = mdpPurchaseOfferRequest0.d;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        s4.getClass();
        ((gspq)hftv1).c = s4;
        String s5 = mdpPurchaseOfferRequest0.c;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gspq)hftp1.b_message).d = bbqr.c(s5);
        gspq gspq0 = (gspq)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gspz gspz3 = (gspz)hftp0.b_message;
        gspq0.getClass();
        gspz3.f = gspq0;
        gspz3.b |= 1;
        Bundle bundle0 = mdpPurchaseOfferRequest0.e;
        if(bundle0 != null && bundle0.size() > 0) {
            gsog gsog0 = (gsog)((ProtoLiteMessage)gsoi.a).v_newBuilder();
            for(Object object0: bundle0.keySet()) {
                String s6 = (String)object0;
                Object object1 = bundle0.get(s6);
                if((object1 instanceof String)) {
                    gsog0.a(s6, ((String)object1));
                }
                else {
                    object1.getClass();
                    gsog0.a(s6, "INVALID_NON_STRING");
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gspz gspz4 = (gspz)hftp0.b_message;
            gsoi gsoi0 = (gsoi)((ProtoLiteBuilder)gsog0).N_build();
            gsoi0.getClass();
            gspz4.h = gsoi0;
            gspz4.b |= 2;
        }
        bboh bboh0 = cryd.e;
        bboh0.g(cslm.h()).B("UpdatePlan req:{%s}\n", hftp0.N_build());
        cryc cryc0 = new cryc(this);
        try {
            if(ckcq0 == null) {
                crwn crwn0 = cryc0.a();
                gspz gspz5 = (gspz)hftp0.N_build();
                gsqa0 = crwn0.f(this.h, gspz5);
            }
            else {
                crwn crwn1 = new crwn(cryc0.a(), cmlp.a, ckcq0);
                gspz gspz6 = (gspz)hftp0.N_build();
                gsqa0 = crwn1.f(this.h, gspz6);
            }
            bboh0.g(cslm.h()).B("UpdatePlan rsp:{%s}\n", gsqa0);
            if(gsqa0 != null) {
                int v3 = gsqa0.b;
                if((v3 & 1) != 0) {
                    if((v3 & 2) == 0) {
                        gsqh0 = gsqh.a;
                    }
                    else {
                        gsqh0 = gsqa0.d;
                        if(gsqh0 == null) {
                            gsqh0 = gsqh.a;
                        }
                    }
                    if((gsqa0.e == null ? gsoi.a : gsqa0.e).b.size() > 0) {
                        Bundle bundle1 = new Bundle();
                        for(Object object2: DesugarCollections.unmodifiableMap((gsqa0.e == null ? gsoi.a : gsqa0.e).b).entrySet()) {
                            bundle1.putString(((String)((Map.Entry)object2).getKey()), ((String)((Map.Entry)object2).getValue()));
                        }
                        bundle2 = bundle1;
                    }
                    else {
                        bundle2 = null;
                    }
                    String s7 = (gsqa0.c == null ? gspr.a : gsqa0.c).b;
                    gspr gspr0 = gsqa0.c;
                    String s8 = (gspr0 == null ? gspr.a : gspr0).c;
                    String s9 = (gspr0 == null ? gspr.a : gspr0).e;
                    String s10 = (gspr0 == null ? gspr.a : gspr0).d;
                    long v4 = gsqh0.c >= 0L ? gsqh0.c : -1L;
                    String s11 = gsqh0.d;
                    if(gspr0 == null) {
                        gspr0 = gspr.a;
                    }
                    String s12 = gspr0.f;
                    int v5 = gsqa0.g;
                    integer1 = v5 == 0 ? null : v5;
                    s13 = s11;
                    mdpPurchaseOfferResponse0 = new MdpPurchaseOfferResponse(s7, s8, s9, s10, v4, s13, s12, bundle2, integer1, (gsqa0.f == 0L ? null : ((long)gsqa0.f)));
                    goto label_135;
                }
            }
            goto label_137;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cryc0, throwable0);
            throw throwable0;
        }
    label_135:
        cryc0.close();
        return mdpPurchaseOfferResponse0;
    label_137:
        cryc0.close();
        return null;
    }

    public final MdpUpsellOfferResponse d(String s, MdpUpsellOfferRequest mdpUpsellOfferRequest0, ckcq ckcq0) {
        MdpUpsellOfferResponse mdpUpsellOfferResponse0;
        gsqd gsqd0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsoz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsoz gsoz0 = (gsoz)hftp0.b_message;
        s.getClass();
        gsoz0.c = s;
        Context context0 = this.d;
        String s1 = cslm.e(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsoz gsoz1 = (gsoz)hftp0.b_message;
        s1.getClass();
        gsoz1.g = s1;
        if(mdpUpsellOfferRequest0 == null) {
            mdpUpsellOfferRequest0 = new crvl().a();
        }
        if(hvlq.t()) {
            MdpMoney mdpMoney0 = mdpUpsellOfferRequest0.h;
            if(mdpMoney0 != null) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjin.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                mdpMoney0.a.getClass();
                ((hjin)hftv0).b = mdpMoney0.a;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((hjin)hftv1).c = mdpMoney0.b;
                int v = mdpMoney0.c;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hjin)hftp1.b_message).d = v;
                hjin hjin0 = (hjin)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gsoz gsoz2 = (gsoz)hftp0.b_message;
                hjin0.getClass();
                gsoz2.l = hjin0;
                gsoz2.b |= 2;
            }
        }
        if(hvlq.r()) {
            String s2 = mdpUpsellOfferRequest0.i;
            if(s2 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gsoz)hftp0.b_message).m = s2;
            }
        }
        if(hvlq.r()) {
            String s3 = mdpUpsellOfferRequest0.j;
            if(s3 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gsoz)hftp0.b_message).n = s3;
            }
        }
        if(Objects.equals(mdpUpsellOfferRequest0.f, "esim_context")) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsoz)hftp0.b_message).h = "esim_context";
            long v1 = (long)mdpUpsellOfferRequest0.g;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsoz)hftp0.b_message).f = v1;
        }
        else {
            if(hvko.b() > 0L) {
                long v2 = hvko.b();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gsoz)hftp0.b_message).f = v2;
            }
            String s4 = csli.k(context0);
            if(csli.y() && s4 != null) {
                String s5 = s4.substring(0, 3);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gsoz gsoz3 = (gsoz)hftp0.b_message;
                s5.getClass();
                gsoz3.d = s5;
                String s6 = s4.substring(3);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gsoz gsoz4 = (gsoz)hftp0.b_message;
                s6.getClass();
                gsoz4.e = s6;
            }
        }
        Bundle bundle0 = mdpUpsellOfferRequest0.b;
        if(bundle0 != null && bundle0.size() > 0) {
            gsog gsog0 = (gsog)((ProtoLiteMessage)gsoi.a).v_newBuilder();
            for(Object object0: bundle0.keySet()) {
                String s7 = (String)object0;
                Object object1 = bundle0.get(s7);
                if((object1 instanceof String)) {
                    gsog0.a(s7, ((String)object1));
                }
                else {
                    object1.getClass();
                    gsog0.a(s7, "INVALID_NON_STRING");
                }
            }
            String s8 = Base64.encodeToString(((gsoi)((ProtoLiteBuilder)gsog0).N_build()).toBytesArray(), 10);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsoz gsoz5 = (gsoz)hftp0.b_message;
            s8.getClass();
            gsoz5.i = s8;
        }
        Integer integer0 = mdpUpsellOfferRequest0.c;
        if(integer0 != null) {
            int v3 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsoz)hftp0.b_message).k = v3;
        }
        Long long0 = mdpUpsellOfferRequest0.d;
        if(long0 != null) {
            long v4 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsoz)hftp0.b_message).j = v4;
        }
        bboh bboh0 = cryd.e;
        bboh0.g(cslm.h()).B("GetOffer req:{%s}\n", hftp0.N_build());
        cryc cryc0 = new cryc(this);
        try {
            if(ckcq0 == null) {
                crwn crwn0 = cryc0.a();
                gsoz gsoz6 = (gsoz)hftp0.N_build();
                gsqd0 = crwn0.g(this.h, gsoz6);
            }
            else {
                crwn crwn1 = new crwn(cryc0.a(), cmlp.a, ckcq0);
                gsoz gsoz7 = (gsoz)hftp0.N_build();
                gsqd0 = crwn1.g(this.h, gsoz7);
            }
            bboh0.g(cslm.h()).B("GetOffer rsp:{%s}\n", gsqd0);
            mdpUpsellOfferResponse0 = cryi.d(gsqd0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cryc0, throwable0);
            throw throwable0;
        }
        cryc0.close();
        return mdpUpsellOfferResponse0;
    }

    public final gsof e(String s, long v, String s1, ckcq ckcq0) {
        gsof gsof0;
        if(!hvlq.m()) {
            throw new IllegalStateException("eSIM feature is not available.");
        }
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Invalid parameters; empty GCM token.");
        }
        if(TextUtils.isEmpty(s1)) {
            throw new IllegalArgumentException("Invalid parameters; empty ecpid.");
        }
        if(v <= 0L) {
            throw new IllegalArgumentException("Invalid parameters; empty carrierId.");
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsoe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gsoe)hftv0).b = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s.getClass();
        ((gsoe)hftv1).c = s;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsoe)hftp0.b_message).d = s1;
        String s2 = cslm.e(this.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsoe gsoe0 = (gsoe)hftp0.b_message;
        s2.getClass();
        gsoe0.e = s2;
        gsoe gsoe1 = (gsoe)hftp0.N_build();
        cryc cryc0 = new cryc(this);
        try {
            gsof0 = ckcq0 == null ? cryc0.a().a(this.h, gsoe1) : new crwn(cryc0.a(), cmlp.a, ckcq0).a(this.h, gsoe1);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cryc0, throwable0);
            throw throwable0;
        }
        cryc0.close();
        return gsof0;
    }

    public final gspd f(Integer integer0, Long long0, String s) {
        return this.g(integer0, long0, s, null);
    }

    public final gspd g(Integer integer0, Long long0, String s, ckcq ckcq0) {
        gspd gspd0;
        int v3;
        this.g.a(bbdg.pO);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gspc.a).v_newBuilder();
        if(hvlb.d()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gspc)hftp0.b_message).k = true;
        }
        if(integer0 == null) {
            integer0 = (int)0;
        }
        if(long0 == null) {
            long0 = (long)0L;
        }
        int v = (int)integer0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gspc)hftp0.b_message).j = v;
        long v1 = (long)long0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gspc)hftp0.b_message).i = v1;
        if(hvko.b() > 0L) {
            long v2 = hvko.b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gspc)hftp0.b_message).g = v2;
        }
        Context context0 = this.d;
        String s1 = csli.k(context0);
        if(csli.y() && s1 != null) {
            String s2 = s1.substring(0, 3);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gspc gspc0 = (gspc)hftp0.b_message;
            s2.getClass();
            gspc0.b = s2;
            String s3 = s1.substring(3);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gspc gspc1 = (gspc)hftp0.b_message;
            s3.getClass();
            gspc1.c = s3;
            String s4 = csli.e(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gspc)hftp0.b_message).d = s4;
            String s5 = csli.m(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gspc)hftp0.b_message).e = s5;
            String s6 = cslm.e(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gspc gspc2 = (gspc)hftp0.b_message;
            s6.getClass();
            gspc2.h = s6;
            if(hvko.N()) {
                if(context0 == null) {
                    Level level0 = cslm.h();
                    csli.a.g(level0).x("ConnectivityHelper.getSimCarrierId was passed a null context");
                    v3 = -1;
                }
                else {
                    TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService(TelephonyManager.class);
                    if(telephonyManager0 == null) {
                        Level level1 = cslm.h();
                        csli.a.g(level1).x("Failed to get Telephony Manager system service");
                        v3 = -1;
                    }
                    else {
                        v3 = telephonyManager0.getSimCarrierId();
                    }
                }
                if(v3 != -1) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gspc)hftp0.b_message).f = v3;
                }
            }
        }
        bboh bboh0 = cryd.e;
        bboh0.g(cslm.h()).Y("%s: listEndpoints: mcc: %s, mnc: %s, carrier_id %d", "Rpc", ((gspc)hftp0.N_build()).b, ((gspc)hftp0.N_build()).c, Long.valueOf(((gspc)hftp0.N_build()).g));
        bboh0.g(cslm.h()).R("%s: listCpidEndpoints: req:{%s}", "Rpc", hftp0.N_build());
        if(hvkk.j()) {
            crxn crxn0 = crxn.c();
            gspc gspc3 = (gspc)hftp0.N_build();
            gizg gizg0 = crxn0.D(26, "GTAF_Server", s);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gizg0));
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gizw.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gizt.a).v_newBuilder();
            String s7 = gspc3.b;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp3.b_message;
            s7.getClass();
            ((gizt)hftv0).b = s7;
            String s8 = gspc3.c;
            if(!hftv0.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp3.b_message;
            s8.getClass();
            ((gizt)hftv1).c = s8;
            String s9 = gspc3.d;
            if(!hftv1.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp3.b_message;
            s9.getClass();
            ((gizt)hftv2).d = s9;
            String s10 = gspc3.e;
            if(!hftv2.isImmutable()) {
                hftp3.ensureMutable();
            }
            gizt gizt0 = (gizt)hftp3.b_message;
            s10.getClass();
            gizt0.e = s10;
            gizt gizt1 = (gizt)hftp3.N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gizw gizw0 = (gizw)hftp2.b_message;
            gizt1.getClass();
            gizw0.c = gizt1;
            gizw0.b |= 1;
            gizw gizw1 = (gizw)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp1.b_message;
            gizw1.getClass();
            gizg1.A = gizw1;
            gizg1.b |= 0x10000;
            long v4 = gspc3.i;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gizg)hftp1.b_message).t = v4;
            crxn0.e(((gizg)hftp1.N_build()), hhct.cQ, Integer.valueOf(gspc3.j));
            if(hvlb.d()) {
                crxn0.e(((gizg)hftp1.N_build()), hhct.cU, Integer.valueOf(gspc3.j));
            }
        }
        cryc cryc0 = new cryc(this);
        try {
            if(ckcq0 == null) {
                crwn crwn0 = cryc0.a();
                gspc gspc4 = (gspc)hftp0.N_build();
                gspd0 = crwn0.e(this.h, gspc4);
            }
            else {
                crwn crwn1 = new crwn(cryc0.a(), cmlp.a, ckcq0);
                gspc gspc5 = (gspc)hftp0.N_build();
                gspd0 = crwn1.e(this.h, gspc5);
            }
            bboh0.g(cslm.h()).R("%s: listCpidEndpoints: rsp:{%s}\n", "Rpc", gspd0);
            bboh0.g(cslm.h()).X("%s: listCpidEndpoints: carrier_name: %s, carrier_id: %d", "Rpc", gspd0.d, Long.valueOf(gspd0.c));
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cryc0, throwable0);
            throw throwable0;
        }
        cryc0.close();
        return gspd0;
    }

    public final GetConsentInformationResponse h(Long long0, int v, Integer integer0, Long long1) {
        return this.i(long0, v, integer0, long1, null);
    }

    public final GetConsentInformationResponse i(Long long0, int v, Integer integer0, Long long1, ckcq ckcq0) {
        GetConsentInformationResponse getConsentInformationResponse0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsor.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhcs.a).v_newBuilder();
        long v1 = (long)long0;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hhcs)hftp1.b_message).b = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsor gsor0 = (gsor)hftp0.b_message;
        hhcs hhcs0 = (hhcs)hftp1.N_build();
        hhcs0.getClass();
        gsor0.c = hhcs0;
        gsor0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsor)hftp0.b_message).d = v - 2;
        Context context0 = this.d;
        String s = cslm.e(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsor gsor1 = (gsor)hftp0.b_message;
        s.getClass();
        gsor1.e = s;
        int v2 = integer0 == null ? 0 : ((int)integer0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsor)hftp0.b_message).g = v2;
        long v3 = long1 == null ? 0L : ((long)long1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsor)hftp0.b_message).f = v3;
        String s1 = crxd.a().c(context0);
        if(!TextUtils.isEmpty(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsor gsor2 = (gsor)hftp0.b_message;
            s1.getClass();
            gsor2.h = s1;
        }
        gsor gsor3 = (gsor)hftp0.N_build();
        cryc cryc0 = new cryc(this);
        try {
            gsos gsos0 = ckcq0 == null ? cryc0.a().c(this.h, gsor3) : new crwn(cryc0.a(), cmlp.a, ckcq0).c(this.h, gsor3);
            ConsentAgreementText consentAgreementText0 = new ConsentAgreementText();
            consentAgreementText0.d = (gsos0.b == null ? hhcp.a : gsos0.b).e;
            hhcp hhcp0 = gsos0.b;
            consentAgreementText0.e = (hhcp0 == null ? hhcp.a : hhcp0).f;
            consentAgreementText0.f = (hhcp0 == null ? hhcp.a : hhcp0).g;
            if(hhcp0 == null) {
                hhcp0 = hhcp.a;
            }
            consentAgreementText0.a = cryd.o((hhcp0.b == null ? ghim.a : hhcp0.b));
            consentAgreementText0.b = cryd.t((gsos0.b == null ? hhcp.a : gsos0.b).c);
            consentAgreementText0.c = cryd.t((gsos0.b == null ? hhcp.a : gsos0.b).d);
            consentAgreementText0.g = (gsos0.b == null ? hhcp.a : gsos0.b).h;
            if(hvjq.f() || hvje.i()) {
                consentAgreementText0.h = (gsos0.b == null ? hhcp.a : gsos0.b).i;
            }
            getConsentInformationResponse0 = new GetConsentInformationResponse();
            ConsentStatus consentStatus0 = new ConsentStatus();
            crwp.a((gsos0.c ? 4 : 3), consentStatus0);
            getConsentInformationResponse0.a = consentStatus0;
            getConsentInformationResponse0.b = consentAgreementText0;
            getConsentInformationResponse0.d = (int)gsos0.e;
            getConsentInformationResponse0.e = (long)gsos0.d;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cryc0, throwable0);
            throw throwable0;
        }
        cryc0.close();
        return getConsentInformationResponse0;
    }

    public final GetConsentInformationResponse j(Long long0, int v, Integer integer0, Long long1, long v1) {
        cryb cryb0 = new cryb(this, long0, v, integer0, long1);
        return (GetConsentInformationResponse)evrg.o(evrg.a(evqs.a, cryb0), v1, TimeUnit.MILLISECONDS);
    }

    public final gsoo k(String s, Long long0, String s1, String s2, Integer integer0, Long long1, int v) {
        return this.l(s, long0, s1, s2, integer0, long1, v, null);
    }

    public final gsoo l(String s, Long long0, String s1, String s2, Integer integer0, Long long1, int v, ckcq ckcq0) {
        gsoo gsoo0;
        String s30;
        Long long4;
        bboh bboh1;
        ggnj ggnj0;
        String s15;
        bboh bboh0 = cryd.e;
        bboh0.g(cslm.h()).ab("%s: gcoreRegister: <%s, %s, %s> ignoreDefault:%s allSims:%s useSupportedMccMnc:%s", "Rpc", long0, s1, s2, Boolean.valueOf(true), Boolean.valueOf(hvka.e()), Boolean.valueOf(hvka.h()));
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Invalid parameters; empty GCM token.");
        }
        if(!hvka.e() && TextUtils.isEmpty(s1)) {
            throw new IllegalArgumentException("Invalid parameters; empty CPID.");
        }
        gsom gsom0 = (gsom)((ProtoLiteMessage)gson.a).v_newBuilder();
        if(!gsom0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsom0).ensureMutable();
        }
        gson gson0 = (gson)gsom0.b_message;
        s.getClass();
        gson0.c = s;
        if(long0 != null && ((long)long0) > 0L) {
            long v1 = (long)long0;
            if(!gsom0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gsom0).ensureMutable();
            }
            ((gson)gsom0.b_message).h = v1;
        }
        else {
            if(!hvka.h()) {
                throw new IllegalArgumentException("Invalid parameters; empty carrier_id.");
            }
            String s3 = csli.c(this.d);
            bboh0.g(cslm.h()).R("%s: gcoreRegister: supportedMccMnc: %s", "Rpc", s3);
            if(!TextUtils.isEmpty(s3)) {
                String s4 = s3.substring(0, 3);
                if(!gsom0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gsom0).ensureMutable();
                }
                gson gson1 = (gson)gsom0.b_message;
                s4.getClass();
                gson1.f = s4;
                String s5 = s3.substring(3);
                if(!gsom0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gsom0).ensureMutable();
                }
                gson gson2 = (gson)gsom0.b_message;
                s5.getClass();
                gson2.g = s5;
                goto label_35;
            }
            if(!hvka.a.b().b()) {
                throw new IllegalArgumentException("Invalid parameters; empty carrier_id/mcc/mnc.");
            }
        }
    label_35:
        int v2 = (int)integer0;
        if(!gsom0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsom0).ensureMutable();
        }
        ((gson)gsom0.b_message).l = v2;
        long v3 = (long)long1;
        if(!gsom0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsom0).ensureMutable();
        }
        ((gson)gsom0.b_message).k = v3;
        hvka hvka0 = hvka.a;
        if(hvka0.b().k()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsnv.a).v_newBuilder();
            int v4 = Build.VERSION.SDK_INT;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnv)hftp0.b_message).b = v4;
            String s6 = Build.VERSION.RELEASE;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsnv gsnv0 = (gsnv)hftp0.b_message;
            s6.getClass();
            gsnv0.c = s6;
            String s7 = Build.VERSION.SECURITY_PATCH;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsnv gsnv1 = (gsnv)hftp0.b_message;
            s7.getClass();
            gsnv1.d = s7;
            String s8 = cslm.f();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsnv gsnv2 = (gsnv)hftp0.b_message;
            s8.getClass();
            gsnv2.e = s8;
            Context context0 = this.d;
            String s9 = cslm.e(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsnv gsnv3 = (gsnv)hftp0.b_message;
            s9.getClass();
            gsnv3.f = s9;
            String s10 = TimeZone.getDefault().getID();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsnv gsnv4 = (gsnv)hftp0.b_message;
            s10.getClass();
            gsnv4.g = s10;
            boolean z = Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic") || "google_sdk".equals(Build.PRODUCT);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnv)hftp0.b_message).h = z;
            if(hvka0.b().j()) {
                for(Iterator iterator0 = csli.o(context0).iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                    Object object0 = iterator0.next();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gspx.a).v_newBuilder();
                    String s11 = ((String)object0).substring(0, 3);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gspx gspx0 = (gspx)hftp1.b_message;
                    s11.getClass();
                    gspx0.b = s11;
                    String s12 = ((String)object0).substring(3);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gspx gspx1 = (gspx)hftp1.b_message;
                    s12.getClass();
                    gspx1.c = s12;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gsnv gsnv5 = (gsnv)hftp0.b_message;
                    gspx gspx2 = (gspx)hftp1.N_build();
                    gspx2.getClass();
                    hfuo hfuo0 = gsnv5.i;
                    if(!hfuo0.c()) {
                        gsnv5.i = ProtoLiteMessage.E(hfuo0);
                    }
                    gsnv5.i.add(gspx2);
                }
            }
            if(!gsom0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gsom0).ensureMutable();
            }
            gson gson3 = (gson)gsom0.b_message;
            gsnv gsnv6 = (gsnv)hftp0.N_build();
            gsnv6.getClass();
            gson3.m = gsnv6;
            gson3.b |= 8;
        }
        if(hvka.g() || hvjk.i()) {
            this.s(gsom0, hvka.g(), hvjk.i());
        }
        if(hvka.e()) {
            Context context1 = this.d;
            for(Iterator iterator1 = csli.A(context1, 2).iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                Object object1 = iterator1.next();
                cslv cslv0 = (cslv)object1;
                bboh0.g(cslm.h()).R("%s: gcoreRegister: Supported SIM: %s", "Rpc", cslv0);
                String s13 = cslv0.a;
                boolean z1 = cslv0.d;
                crvw crvw0 = crvw.c();
                Long long2 = crvw0.p(s13);
                String s14 = crvw0.s(s13);
                if(long2 == null || ((long)long2) <= 0L) {
                    long2 = crzj.b;
                }
                if(TextUtils.isEmpty(s14)) {
                    s15 = "dummy_cpid_before_retrieval";
                }
                else {
                    s15 = crvw0.F(s13) ? s14 : "dummy_cpid_before_consent";
                }
                gspt gspt0 = (gspt)((ProtoLiteMessage)gspu.a).v_newBuilder();
                long v5 = (long)long2;
                if(!gspt0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gspt0).ensureMutable();
                }
                ((gspu)gspt0.b_message).c = v5;
                if(!gspt0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gspt0).ensureMutable();
                }
                gspu gspu0 = (gspu)gspt0.b_message;
                s15.getClass();
                gspu0.f = s15;
                if(!gspt0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gspt0).ensureMutable();
                }
                ((gspu)gspt0.b_message).k = z1;
                if(hvka.d()) {
                    String s16 = cslv0.b;
                    String s17 = s16.substring(0, 3);
                    if(!gspt0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gspt0).ensureMutable();
                    }
                    gspu gspu1 = (gspu)gspt0.b_message;
                    s17.getClass();
                    gspu1.d = s17;
                    String s18 = s16.substring(3);
                    if(!gspt0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gspt0).ensureMutable();
                    }
                    gspu gspu2 = (gspu)gspt0.b_message;
                    s18.getClass();
                    gspu2.e = s18;
                }
                else if(hvjq.a.c().p()) {
                    Pair pair0 = crvw0.a(s13);
                    if(pair0 != null) {
                        String s19 = (String)pair0.first;
                        if(!gspt0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gspt0).ensureMutable();
                        }
                        gspu gspu3 = (gspu)gspt0.b_message;
                        s19.getClass();
                        gspu3.d = s19;
                        String s20 = (String)pair0.second;
                        if(!gspt0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gspt0).ensureMutable();
                        }
                        gspu gspu4 = (gspu)gspt0.b_message;
                        s20.getClass();
                        gspu4.e = s20;
                    }
                }
                if(hvka0.b().f()) {
                    long v6 = cslv0.c;
                    if(!gspt0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gspt0).ensureMutable();
                    }
                    ((gspu)gspt0.b_message).j = v6;
                }
                gspg gspg0 = crvw0.h(s13);
                if(gspg0 != null) {
                    if(!gspt0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gspt0).ensureMutable();
                    }
                    ((gspu)gspt0.b_message).h = gspg0;
                    ((gspu)gspt0.b_message).b |= 1;
                }
                hfuo hfuo1 = hvli.b().b;
                if(hfuo1.isEmpty()) {
                    ggnj0 = ggnj.a;
                }
                else {
                    PackageManager packageManager0 = context1.getPackageManager();
                    HashSet hashSet0 = new HashSet();
                    for(Object object2: packageManager0.getInstalledApplications(0x80)) {
                        hashSet0.add(((ApplicationInfo)object2).packageName);
                    }
                    hashSet0.retainAll(hfuo1);
                    ggnj0 = hashSet0;
                }
                if(!gspt0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gspt0).ensureMutable();
                }
                gspu gspu5 = (gspu)gspt0.b_message;
                hfuo hfuo2 = gspu5.m;
                if(!hfuo2.c()) {
                    gspu5.m = ProtoLiteMessage.E(hfuo2);
                }
                hfrj.E(ggnj0, gspu5.m);
                if(hvka.c()) {
                    hfys hfys0 = crvw0.j(s13);
                    if(hfys0 != null) {
                        hhcr hhcr0 = hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g);
                        if(!gspt0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gspt0).ensureMutable();
                        }
                        gspu gspu6 = (gspu)gspt0.b_message;
                        gspu6.i = hhcr0.a();
                    }
                }
                Long long3 = crvw0.q(s13);
                if(hvka.f() && !s15.equals("dummy_cpid_before_consent") && !s15.equals("dummy_cpid_before_retrieval") && long3 != null) {
                    hfwn hfwn0 = hfyn.j(long3.longValue());
                    if(!gspt0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gspt0).ensureMutable();
                    }
                    gspu gspu7 = (gspu)gspt0.b_message;
                    hfwn0.getClass();
                    gspu7.l = hfwn0;
                    gspu7.b |= 4;
                }
                gsom0.a(gspt0);
                context1 = context1;
                hvka0 = hvka0;
                bboh0 = bboh0;
            }
            bboh1 = bboh0;
        }
        else {
            bboh1 = bboh0;
            gspt gspt1 = (gspt)((ProtoLiteMessage)gspu.a).v_newBuilder();
            if(!gspt1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gspt1).ensureMutable();
            }
            gspu gspu8 = (gspu)gspt1.b_message;
            s1.getClass();
            gspu8.f = s1;
            gspt1.a(gsoj.b);
            gspt1.a(gsoj.c);
            if(long0 != null && ((long)long0) > 0L) {
                long v7 = (long)long0;
                if(!gspt1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gspt1).ensureMutable();
                }
                ((gspu)gspt1.b_message).c = v7;
            }
            else if(hvka.h()) {
                String s21 = csli.c(this.d);
                if(!TextUtils.isEmpty(s21)) {
                    String s22 = s21.substring(0, 3);
                    if(!gspt1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gspt1).ensureMutable();
                    }
                    gspu gspu9 = (gspu)gspt1.b_message;
                    s22.getClass();
                    gspu9.d = s22;
                    String s23 = s21.substring(3);
                    if(!gspt1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gspt1).ensureMutable();
                    }
                    gspu gspu10 = (gspu)gspt1.b_message;
                    s23.getClass();
                    gspu10.e = s23;
                }
            }
            String s24 = csli.g(this.d);
            gspg gspg1 = crvw.c().h(s24);
            if(gspg1 != null) {
                gspt1.a(gsoj.d);
                if(!gspt1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gspt1).ensureMutable();
                }
                ((gspu)gspt1.b_message).h = gspg1;
                ((gspu)gspt1.b_message).b |= 1;
            }
            if(hvka.c()) {
                hfys hfys1 = crvw.c().k(long0, s2);
                if(hfys1 != null) {
                    hhcr hhcr1 = hhcr.b(hfys1.g) == null ? hhcr.k : hhcr.b(hfys1.g);
                    if(!gspt1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gspt1).ensureMutable();
                    }
                    gspu gspu11 = (gspu)gspt1.b_message;
                    gspu11.i = hhcr1.a();
                }
            }
            gsom0.a(gspt1);
        }
        if(((gson)gsom0.b_message).d.size() <= 0) {
            throw new IllegalArgumentException("Invalid parameters; no SIMs are supported.");
        }
        this.r(gsom0);
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gsol.a).v_newBuilder();
        if(!gsom0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsom0).ensureMutable();
        }
        gson gson4 = (gson)gsom0.b_message;
        gsol gsol0 = (gsol)hftp2.N_build();
        gsol0.getClass();
        gson4.i = gsol0;
        gson4.b |= 2;
        crvw crvw1 = crvw.c();
        String s25 = hvko.u();
        int v8 = (int)hvko.f();
        giyt giyt0 = (giyt)((ProtoLiteMessage)giyv.a).v_newBuilder();
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv0 = (giyv)giyt0.b_message;
        s.getClass();
        giyv0.b = s;
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).c = s25;
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).d = v8;
        String s26 = TimeZone.getDefault().getDisplayName();
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv1 = (giyv)giyt0.b_message;
        s26.getClass();
        giyv1.h = s26;
        hhcr hhcr2 = cryd.q(long0, s1);
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv2 = (giyv)giyt0.b_message;
        giyv2.i = hhcr2.a();
        if(long0 == null) {
            long4 = null;
        }
        else {
            long v9 = (long)long0;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).e = v9;
            long4 = long0;
        }
        if(s1 != null) {
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).f = s1;
        }
        if(v != 0) {
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            giyv giyv3 = (giyv)giyt0.b_message;
            giyv3.g = giyu.a(v);
        }
        if(crvw.u()) {
            hhcr hhcr3 = hhcr.b(crvw1.l().g);
            if(hhcr3 == null) {
                hhcr3 = hhcr.k;
            }
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            giyv giyv4 = (giyv)giyt0.b_message;
            giyv4.i = hhcr3.a();
        }
        Context context2 = this.d;
        for(Object object3: csli.A(context2, 2)) {
            String s27 = ((cslv)object3).a;
            String s28 = ((cslv)object3).b;
            boolean z2 = ((cslv)object3).d;
            crvw crvw2 = crvw.c();
            Long long5 = crvw2.p(s27);
            String s29 = crvw2.s(s27);
            if(long5 == null || ((long)long5) <= 0L) {
                long5 = !z2 || long4 == null ? crzj.b : long4;
            }
            if(TextUtils.isEmpty(s29)) {
                s30 = "dummy_cpid_before_retrieval";
            }
            else {
                s30 = crvw2.F(s27) ? s29 : "dummy_cpid_before_consent";
            }
            gizr gizr0 = (gizr)((ProtoLiteMessage)gizs.a).v_newBuilder();
            long v10 = (long)long5;
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            ((gizs)gizr0.b_message).c = v10;
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            gizs gizs0 = (gizs)gizr0.b_message;
            s30.getClass();
            gizs0.d = s30;
            String s31 = s28.substring(0, 3);
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            gizs gizs1 = (gizs)gizr0.b_message;
            s31.getClass();
            gizs1.e = s31;
            String s32 = s28.substring(3);
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            gizs gizs2 = (gizs)gizr0.b_message;
            s32.getClass();
            gizs2.f = s32;
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            ((gizs)gizr0.b_message).g = z2;
            hhcr hhcr4 = cryd.q(long4, s2);
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            gizs gizs3 = (gizs)gizr0.b_message;
            gizs3.h = hhcr4.a();
            gspg gspg2 = crvw2.h(s27);
            if(gspg2 != null) {
                long v11 = gspg2.c;
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                ((gizs)gizr0.b_message).i = v11;
                for(Object object4: gspg2.b) {
                    gizr0.a(cryd.p(((gspe)object4)));
                }
            }
            Long long6 = crvw2.q(s27);
            if(hvka.f() && long6 != null) {
                hfwn hfwn1 = hfyn.j(long6.longValue());
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                gizs gizs4 = (gizs)gizr0.b_message;
                hfwn1.getClass();
                gizs4.k = hfwn1;
                gizs4.b |= 1;
            }
            giyt0.l(gizr0);
            context2 = context2;
        }
        gspg gspg3 = crvw1.h(csli.g(context2));
        if(gspg3 != null) {
            long v12 = gspg3.c;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).j = v12;
            for(Object object5: gspg3.b) {
                giyt0.k(cryd.p(((gspe)object5)));
            }
        }
        crxu crxu0 = new crxu();
        boolean z3 = crxu0.q();
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).l = z3;
        boolean z4 = crxu0.r("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT");
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).o = z4;
        boolean z5 = crxu0.r("com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE");
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).m = z5;
        boolean z6 = crxu0.r("com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER");
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).n = z6;
        crxn.c().t(((giyv)((ProtoLiteBuilder)giyt0).N_build()), integer0, long1);
        bboh1.g(cslm.h()).R("%s: gcoreRegister: rpcReq:{%s}\n", "Rpc", ((ProtoLiteBuilder)gsom0).N_build());
        cryc cryc0 = new cryc(this);
        try {
            if(ckcq0 == null) {
                crwn crwn0 = cryc0.a();
                gson gson5 = (gson)((ProtoLiteBuilder)gsom0).N_build();
                gsoo0 = crwn0.b(this.h, gson5);
            }
            else {
                crwn crwn1 = new crwn(cryc0.a(), cmlp.a, ckcq0);
                gson gson6 = (gson)((ProtoLiteBuilder)gsom0).N_build();
                gsoo0 = crwn1.b(this.h, gson6);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cryc0, throwable0);
            throw throwable0;
        }
        cryc0.close();
        bboh bboh2 = cryd.e;
        bboh2.g(cslm.h()).R("%s: gcoreRegister: rpcRsp:{%s}\n", "Rpc", gsoo0);
        int v13 = ((gson)gsom0.b_message).c.length();
        ggtj ggtj0 = bboh2.g(cslm.h());
        Integer integer1 = csln.b(this.d);
        gpnd gpnd0 = new gpnd(gpnc.a, integer1);
        gpnd gpnd1 = new gpnd(gpnc.a, ((long)((gson)gsom0.b_message).h));
        gpnc gpnc0 = gpnc.b;
        ggtj0.aa("%s: gcoreRegister: Sync v:%s q:<%s, %s> <%s>, # of RegistrationRecords: %s", "Rpc", gpnd0, gpnd1, new gpnd(gpnc0, s1), new gpnd(gpnc0, ((gson)gsom0.b_message).c.substring(Math.max(v13 - 16, 0))), new gpnd(gpnc.a, ((gson)gsom0.b_message).d.size()));
        for(Object object6: DesugarCollections.unmodifiableList(((gson)gsom0.b_message).d)) {
            bboh2.g(cslm.h()).Z("%s: gcoreRegister: RegistrationRecord: %s %s CPID: %s data: %s", "Rpc", new gpnd(gpnc0, ((gspu)object6).d), new gpnd(gpnc0, ((gspu)object6).e), new gpnd(gpnc0, ((gspu)object6).f), new gpnd(gpnc0, Boolean.valueOf(((gspu)object6).k)));
        }
        return gsoo0;
    }

    public final void m(String s, Long long0, int v, hhcr hhcr0, hhcu hhcu0, Integer integer0, hfwn hfwn0, Integer integer1, Long long1) {
        this.n(s, long0, v, hhcr0, hhcu0, integer0, hfwn0, integer1, long1, null);
    }

    public final void n(String s, Long long0, int v, hhcr hhcr0, hhcu hhcu0, Integer integer0, hfwn hfwn0, Integer integer1, Long long1, ckcq ckcq0) {
        Integer integer2;
        crwg crwg0 = crvw.c().d.d(long0, s);
        String s1 = crwg0 == null ? null : crwg0.h();
        if(hvjq.d()) {
            Pair pair0 = crvw.c().a(s1);
            String s2 = pair0 == null ? null : ((String)pair0.first) + ((String)pair0.second);
            crxn crxn0 = crxn.c();
            long v1 = (long)long1;
            gizg gizg0 = crxn0.D(20, "GTAF_Server", "MDP_BgTask");
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gizg0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).t = v1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizz.a).v_newBuilder();
            if(!TextUtils.isEmpty(s2)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizz gizz0 = (gizz)hftp1.b_message;
                s2.getClass();
                gizz0.c = s2;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizz gizz1 = (gizz)hftp1.b_message;
            gizz1.f = hhcr0.a();
            gizz gizz2 = (gizz)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            gizz2.getClass();
            gizg1.x = gizz2;
            gizg1.b |= 0x2000;
            integer2 = integer1;
            crxn0.e(((gizg)hftp0.N_build()), hhct.cT, integer2);
        }
        else {
            integer2 = integer1;
        }
        String s3 = hvjq.d() ? csli.j(s1, this.d) : csli.i(this.d);
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gspv.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hhcs.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hhcs hhcs0 = (hhcs)hftp3.b_message;
        s.getClass();
        hhcs0.c = s;
        long v2 = (long)long0;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((hhcs)hftv0).b = v2;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        hhcs hhcs1 = (hhcs)hftp3.b_message;
        s3.getClass();
        hhcs1.d = s3;
        Context context0 = this.d;
        String s4 = Long.toString(bapf.h(context0));
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hhcs hhcs2 = (hhcs)hftp3.b_message;
        s4.getClass();
        hhcs2.e = s4;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gspv gspv0 = (gspv)hftp2.b_message;
        hhcs hhcs3 = (hhcs)hftp3.N_build();
        hhcs3.getClass();
        gspv0.c = hhcs3;
        gspv0.b |= 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        hhcu0.getClass();
        ((gspv)hftv1).f = hhcu0;
        ((gspv)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gspv)hftp2.b_message).d = v - 2;
        int v3 = hhcr0.a();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gspv)hftp2.b_message).e = v3;
        String s5 = cslm.e(context0);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gspv gspv1 = (gspv)hftp2.b_message;
        s5.getClass();
        gspv1.g = s5;
        int v4 = (int)integer0;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gspv)hftv2).h = v4;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        gspv gspv2 = (gspv)hftp2.b_message;
        hfwn0.getClass();
        gspv2.i = hfwn0;
        gspv2.b |= 4;
        int v5 = (int)integer2;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gspv)hftp2.b_message).k = v5;
        long v6 = (long)long1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gspv)hftp2.b_message).j = v6;
        gspv gspv3 = (gspv)hftp2.N_build();
        cryc cryc0 = new cryc(this);
        try {
            if(ckcq0 == null) {
                cryc0.a().h(this.h, gspv3);
            }
            else {
                new crwn(cryc0.a(), cmlp.a, ckcq0).h(this.h, gspv3);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cryc0, throwable0);
            throw throwable0;
        }
        cryc0.close();
    }

    private static SafeHtml o(ghim ghim0) {
        SafeHtml safeHtml0 = new SafeHtml();
        safeHtml0.a = ghin.b(ghim0).b;
        return safeHtml0;
    }

    private static gizl p(gspe gspe0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizl.a).v_newBuilder();
        int v = hava.b(gspe0.c) == 0 ? 1 : hava.b(gspe0.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizl gizl0 = (gizl)hftp0.b_message;
        gizl0.c = hava.a(v);
        long v1 = gspe0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizl)hftp0.b_message).d = v1;
        hfwn hfwn0 = gspe0.f == null ? hfwn.a : gspe0.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn0.getClass();
        ((gizl)hftv0).e = hfwn0;
        ((gizl)hftv0).b |= 1;
        hfwn hfwn1 = gspe0.g == null ? hfwn.a : gspe0.g;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hfwn1.getClass();
        ((gizl)hftv1).f = hfwn1;
        ((gizl)hftv1).b |= 2;
        long v2 = gspe0.h;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizl)hftp0.b_message).g = v2;
        return (gizl)hftp0.N_build();
    }

    private static hhcr q(Long long0, String s) {
        hfys hfys0 = crvw.c().k(long0, s);
        if(hfys0 != null) {
            hhcr hhcr0 = hhcr.b(hfys0.g);
            return hhcr0 == null ? hhcr.k : hhcr0;
        }
        return hhcr.a;
    }

    private final void r(gsom gsom0) {
        if(!hvko.a.q().V()) {
            return;
        }
        gsog gsog0 = (gsog)((ProtoLiteMessage)gsoi.a).v_newBuilder();
        if(hvka.a.b().g()) {
            if(!gsom0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gsom0).ensureMutable();
            }
            gson gson0 = (gson)gsom0.b_message;
            gsoi gsoi0 = (gsoi)((ProtoLiteBuilder)gsog0).N_build();
            gsoi0.getClass();
            gson0.e = gsoi0;
            gson0.b |= 1;
            return;
        }
        int v = csln.b(this.d);
        gsog0.a("reg_extra_os", String.format(Locale.US, "api=%d rel=%s sec=%s", ((int)Build.VERSION.SDK_INT), Build.VERSION.RELEASE, Build.VERSION.SECURITY_PATCH));
        gsog0.a("reg_extra_gcore", String.format(Locale.US, "verName=%s verCode=%d buildNum=%d buildType=%s arch=%d screen=%d", bbrc.o(), bbrc.f(), bbrc.h(), bbrc.l(), bbrc.e(), bbrc.d()));
        gsog0.a("reg_extra_mdp", (v == -1 ? "INVALID_MODULE_INFO" : String.format(Locale.US, "ver=%d apkVerName=%s apkVerCode=%d", v, csln.c(this.d), csln.a(this.d))));
        gsog0.a("reg_extra_locale", cslm.e(this.d));
        gsog0.a("reg_extra_timezone", TimeZone.getDefault().getID());
        try {
            gsog0.a("reg_extra_lang", Locale.getDefault().getISO3Language());
        }
        catch(MissingResourceException | NullPointerException unused_ex) {
            gsog0.a("reg_extra_lang", bbqr.c(Locale.getDefault().getLanguage()));
        }
        Context context0 = this.d;
        String s = csli.k(context0);
        if(s == null) {
            s = "";
        }
        gsog0.a("reg_extra_mccmnc", s);
        Locale locale0 = Locale.US;
        String s1 = csli.e(context0);
        String s2 = csli.m(context0);
        Boolean boolean0 = Boolean.valueOf(csli.w(context0));
        Boolean boolean1 = Boolean.valueOf(csli.u(context0));
        boolean z = false;
        if(context0 == null) {
            Level level0 = cslm.h();
            csli.a.g(level0).x("ConnectivityHelper.isRoaming was passed a null context");
        }
        else {
            NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isConnected() && networkInfo0.isRoaming()) {
                z = true;
            }
        }
        gsog0.a("reg_extra_carrier", String.format(locale0, "gid1=%s spn=%s wifi=%b cellular=%b roaming=%b", s1, s2, boolean0, boolean1, Boolean.valueOf(z)));
        if(!gsom0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsom0).ensureMutable();
        }
        gson gson1 = (gson)gsom0.b_message;
        gsoi gsoi1 = (gsoi)((ProtoLiteBuilder)gsog0).N_build();
        gsoi1.getClass();
        gson1.e = gsoi1;
        gson1.b |= 1;
    }

    private final void s(gsom gsom0, boolean z, boolean z1) {
        if(!z && !z1) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsnt.a).v_newBuilder();
        if(z) {
            String s = bbrc.o();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsnt gsnt0 = (gsnt)hftp0.b_message;
            s.getClass();
            gsnt0.b = s;
            int v = bbrc.f();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnt)hftp0.b_message).c = v;
            long v1 = bbrc.h();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnt)hftp0.b_message).d = v1;
            String s1 = bbrc.l();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsnt gsnt1 = (gsnt)hftp0.b_message;
            s1.getClass();
            gsnt1.e = s1;
            int v2 = bbrc.e();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnt)hftp0.b_message).f = v2;
            int v3 = bbrc.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnt)hftp0.b_message).g = v3;
            Context context0 = this.d;
            int v4 = csln.b(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnt)hftp0.b_message).j = v4;
            String s2 = csln.c(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsnt gsnt2 = (gsnt)hftp0.b_message;
            s2.getClass();
            gsnt2.k = s2;
            int v5 = csln.a(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnt)hftp0.b_message).l = v5;
            if(!TextUtils.isEmpty(hvko.A())) {
                String s3 = hvko.A();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gsnt)hftp0.b_message).m = s3;
            }
        }
        if(z1) {
            crxu crxu0 = new crxu();
            boolean z2 = crxu0.q();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsnt)hftp0.b_message).h = z2;
            ggqj ggqj0 = crxu.a.v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(crxu.s(((gsoj)map$Entry0.getKey()))) {
                label_66:
                    int v6 = ((gsoj)map$Entry0.getKey()).a();
                    boolean z3 = crxu0.r(((String)map$Entry0.getValue()));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gsnt gsnt3 = (gsnt)hftp0.b_message;
                    hfvh hfvh0 = gsnt3.i;
                    if(!hfvh0.b) {
                        gsnt3.i = hfvh0.a();
                    }
                    gsnt3.i.put(Integer.valueOf(v6), Boolean.valueOf(z3));
                }
                else {
                    if(hvle.f()) {
                        continue;
                    }
                    Object object1 = map$Entry0.getKey();
                    if(cryd.f.contains(object1)) {
                        goto label_66;
                    }
                }
            }
        }
        if(hvjw.a.e().p()) {
            hfys hfys0 = crvw.c().l();
            if(hfys0 == null) {
                ((ggtj)cryd.e.j()).x("Device consent status does not exist!");
            }
            else {
                hhcr hhcr0 = hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gsnt gsnt4 = (gsnt)hftp0.b_message;
                gsnt4.n = hhcr0.a();
            }
        }
        if(!gsom0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsom0).ensureMutable();
        }
        gson gson0 = (gson)gsom0.b_message;
        gsnt gsnt5 = (gsnt)hftp0.N_build();
        gsnt5.getClass();
        gson0.j = gsnt5;
        gson0.b |= 4;
    }

    private static SafeHtml[] t(List list0) {
        SafeHtml[] arr_safeHtml = new SafeHtml[list0.size()];
        for(int v = 0; v < list0.size(); ++v) {
            arr_safeHtml[v] = cryd.o(((ghim)list0.get(v)));
        }
        return arr_safeHtml;
    }
}

