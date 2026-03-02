import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.telephony.CarrierRestrictionRules;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccManager;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;
import j..util.Collection.-EL;
import j..util.DesugarTimeZone;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class crzy implements Runnable {
    public final csaq a;
    public final csar b;
    public final ProtoLiteBuilder c;

    public crzy(csar csar0, ProtoLiteBuilder hftp0, csaq csaq0) {
        this.b = csar0;
        this.c = hftp0;
        this.a = csaq0;
    }

    @Override
    public final void run() {
        int v5;
        gsnx gsnx0;
        csao csao0;
        try {
            qil qil0 = this.b.d;
            baqr baqr0 = new baqr();
            baqr0.a = AppContextProvider.a().getApplicationInfo().uid;
            baqr0.e = "com.google.android.gms";
            baqr0.d = "com.google.android.gms";
            qhx qhx0 = (qhx)this.c.N_build();
            if(qil.a == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)qhx.a));
                ibjh ibjh1 = new ibjh(((MessageLite)qhu.a));
                qil.a = new gRPCMethodDescriptor(gRPCMethodType.a, "cloud.verticals.telco.subgraph.esim.EsimService/CreateEsimSession", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            qhu qhu0 = (qhu)qil0.e.callUnaryWithAuth(qil.a, baqr0, qhx0, 10000L, TimeUnit.MILLISECONDS, qil0.f);
            ((ggtj)csar.a.h()).B("eSIM receiving CreateEsimSession response: %s", qhu0);
            csao0 = new csao(qhu0);
        }
        catch(iapl iapl0) {
            a.ae(csar.a.j(), "eSIM CreateEsimSession RPC failed.", iapl0);
            csao0 = new csan(((long)iapl0.a.t.r));
        }
        catch(acse acse0) {
            a.ae(csar.a.j(), "eSIM could not authenticate to CreateEsimSession.", acse0);
            csao0 = new csan(27060L);
        }
        csaq csaq0 = this.a;
        long v = (csao0 instanceof csao) ? 0L : csap.a(csao0);
        MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity0 = ((csds)csaq0).a;
        mobileDataPlanDetailChimeraActivity0.o.j(hhct.dV, v);
        if(!(csao0 instanceof csao)) {
            ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("Failed to receive carrier information for eSIM");
            long v1 = csap.a(csao0);
            ((csds)csaq0).b.putLong("ESIM_RPC_STATUS_KEY", v1);
            cscb.B(mobileDataPlanDetailChimeraActivity0, ((csds)csaq0).b, hhct.eb, mobileDataPlanDetailChimeraActivity0.o.b);
            return;
        }
        qhu qhu1 = (qhu)csap.b(csao0, qhu.class);
        Bundle bundle0 = mobileDataPlanDetailChimeraActivity0.o.a();
        if(qhu1 == null) {
            ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("getCarrierInfo response was null in eSIM flow");
            cscb.B(mobileDataPlanDetailChimeraActivity0, bundle0, hhct.dD, mobileDataPlanDetailChimeraActivity0.o.b);
            return;
        }
        if(hvlq.q() && !qhu1.k.isEmpty()) {
            bundle0.putString("ESIM_CARRIER_INFO_LOCALE", qhu1.k);
        }
        if((qhu1.b & 2) != 0 && (qhu1.b & 4) != 0 && !qhu1.d.isEmpty()) {
            bundle0.putString("esim_carrier_account", qhu1.d);
            qhn qhn0 = qhu1.e == null ? qhn.a : qhu1.e;
            String s = (qhu1.e == null ? qhn.a : qhu1.e).d;
            bundle0.putString("esim_carrier_logo", qhn0.b);
            bundle0.putString("esim_carrier_name", s);
            bundle0.putString("esim_carrier_support", qhn0.e);
            bundle0.putString("esim_carrier_help", qhn0.f);
            if(!qhn0.l.isEmpty()) {
                bundle0.putString("esim_carrier_support_url", qhn0.l);
                bundle0.putBoolean("esim_link_to_store", qhn0.m);
            }
            if(hvlq.r() && !qhn0.c.isEmpty()) {
                bundle0.putString("esim_carrier_dark_mode_logo", qhn0.c);
            }
            csld csld0 = mobileDataPlanDetailChimeraActivity0.o;
            if(hvlq.q()) {
                try {
                    Bundle bundle1 = csld0.d;
                    hftc hftc0 = hftc.a();
                    gsnx0 = (gsnx)hfxk.d(bundle1, "esim_precheck_config", ((MessageLite)gsnx.a), hftc0);
                }
                catch(hfur | NullPointerException exception0) {
                    a.ae(csld.a.j(), "Failed to parse eSIM precheck config", exception0);
                    cscb.B(mobileDataPlanDetailChimeraActivity0, csld0.d, hhct.dx, csld0.b);
                    gsnx0 = gsnx.a;
                }
            }
            else {
                gsnx0 = gsnx.a;
            }
            qic qic0 = qic.b(qhn0.j) == null ? qic.e : qic.b(qhn0.j);
            boolean z = true;
            if(hvlq.m()) {
                if(hvlq.a.d().n()) {
                    goto label_136;
                }
                gged_interceptors gged0 = gged_interceptors.i(gsnx0.g);
                if(hvlq.q()) {
                    if(!gged0.isEmpty()) {
                        int v2 = gged0.size();
                        int v3 = 0;
                        while(v3 < v2) {
                            gsnu gsnu0 = (gsnu)gged0.get(v3);
                            if(!gfqz.e(gsnu0.b, Build.MANUFACTURER)) {
                                goto label_94;
                            }
                            hfuo hfuo0 = gsnu0.c;
                            if(!hfuo0.isEmpty()) {
                                Iterator iterator0 = hfuo0.iterator();
                                while(true) {
                                    if(!iterator0.hasNext()) {
                                        goto label_94;
                                    }
                                    Object object0 = iterator0.next();
                                    if(((String)object0).equals(Build.MODEL)) {
                                        break;
                                    }
                                }
                            }
                            hfuo hfuo1 = gsnu0.d;
                            if(!hfuo1.isEmpty()) {
                                for(Object object1: hfuo1) {
                                    if((!((String)object1).equals("Pixel") || !bbnp.m(mobileDataPlanDetailChimeraActivity0)) && !Build.MODEL.contains(((String)object1))) {
                                        continue;
                                    }
                                    goto label_98;
                                }
                                ++v3;
                                continue;
                            label_94:
                                ++v3;
                                continue;
                            }
                            goto label_98;
                        }
                        ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("Device has invalid manufacturer or model for eSIM");
                        cscb.B(mobileDataPlanDetailChimeraActivity0, bundle0, hhct.dy, mobileDataPlanDetailChimeraActivity0.o.b);
                        return;
                    }
                label_98:
                    EuiccManager euiccManager0 = (EuiccManager)mobileDataPlanDetailChimeraActivity0.getApplicationContext().getSystemService("euicc");
                    if(euiccManager0 != null && euiccManager0.isEnabled()) {
                        TelephonyManager telephonyManager0 = (TelephonyManager)mobileDataPlanDetailChimeraActivity0.getApplicationContext().getSystemService("phone");
                        if(hvlq.q()) {
                            PackageManager packageManager0 = mobileDataPlanDetailChimeraActivity0.getPackageManager();
                            if(gsnx0.f && packageManager0.hasSystemFeature("android.hardware.telephony.carrierlock")) {
                                CarrierRestrictionRules carrierRestrictionRules0 = telephonyManager0.getCarrierRestrictionRules();
                                if(carrierRestrictionRules0 == null) {
                                    ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("eSIM device could not read carrier network lock status.");
                                    goto label_113;
                                }
                                else if(carrierRestrictionRules0.isAllCarriersAllowed()) {
                                    mobileDataPlanDetailChimeraActivity0.n = true;
                                    goto label_113;
                                }
                                else {
                                    ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("eSIM device has a carrier network lock.");
                                }
                            }
                            else {
                                goto label_113;
                            }
                        }
                        else {
                        label_113:
                            boolean z1 = Build.VERSION.SDK_INT < 33 ? false : Collection.-EL.stream(telephonyManager0.getUiccCardsInfo()).anyMatch(new csdu());
                            List list0 = SubscriptionManager.from(mobileDataPlanDetailChimeraActivity0).getActiveSubscriptionInfoList();
                            if((!hvlq.q() || gsnx0.b) && list0.isEmpty()) {
                                ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("Device does not have active subscriptions, ineligible for eSIM.");
                            }
                            else if((!hvlq.q() || gsnx0.d) && Collection.-EL.stream(list0).anyMatch(new csdv())) {
                                ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("Device already has an active eSIM profile");
                                if(hvlq.q() && gsnx0.e && z1) {
                                    goto label_125;
                                }
                            }
                            else if((!hvlq.q() || gsnx0.c) && Collection.-EL.stream(list0).anyMatch(new csdw(s))) {
                                ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).B("Found active subscription with this eSIM carrier: %s", mobileDataPlanDetailChimeraActivity0);
                            }
                            else {
                            label_125:
                                if(hvlq.q() && gsnx0.h.size() > 0) {
                                    int v4 = TimeZone.getDefault().getRawOffset();
                                    for(Object object2: gsnx0.h) {
                                        if(DesugarTimeZone.getTimeZone(((String)object2)).getRawOffset() != v4) {
                                            continue;
                                        }
                                        goto label_136;
                                    }
                                }
                                else if(qic0 == qic.a || !cscn.y(mobileDataPlanDetailChimeraActivity0, qic0).isEmpty()) {
                                    goto label_136;
                                }
                            }
                        }
                    }
                    else {
                        ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("Device does not have eSIM enabled card");
                        cscb.B(mobileDataPlanDetailChimeraActivity0, bundle0, hhct.dy, mobileDataPlanDetailChimeraActivity0.o.b);
                        return;
                    label_136:
                        qht qht0 = qhu1.f == null ? qht.a : qhu1.f;
                        bundle0.putString("headline_text", qht0.b);
                        bundle0.putString("plan_description", qht0.i);
                        if(!qht0.c.isEmpty()) {
                            bundle0.putString("device_info", qht0.c);
                        }
                        if(!qht0.d.isEmpty()) {
                            bundle0.putString("network_type", qht0.d);
                        }
                        if(!qht0.e.isEmpty()) {
                            bundle0.putString("performance_info", qht0.e);
                        }
                        if(!qht0.f.isEmpty()) {
                            bundle0.putString("full_disclaimer", qht0.f);
                        }
                        if(!qht0.g.isEmpty()) {
                            bundle0.putString("important_disclaimer", qht0.g);
                        }
                        bundle0.putBoolean("enable_device_lock_prompt", (hvlq.q() ? !mobileDataPlanDetailChimeraActivity0.n && qht0.h : qht0.h));
                        if((qhu1.b & 1) != 0) {
                            qhq qhq0 = qhu1.c == null ? qhq.a : qhu1.c;
                            if(!qhq0.c.isEmpty()) {
                                bundle0.putString("esim_plan_name", qhq0.c);
                            }
                            else if(!qhq0.b.isEmpty()) {
                                bundle0.putString("esim_plan_name", qhq0.b);
                                ((ggtj)MobileDataPlanDetailChimeraActivity.j.h()).B("Received planId %s for eSIM flow.", qhq0.b);
                            }
                            if(!qhq0.d.isEmpty()) {
                                bundle0.putString("ESIM_PLAN_OFFERS_DETAILS_LINK_TEXT", qhq0.d);
                            }
                            if(!qhq0.e.isEmpty()) {
                                bundle0.putString("ESIM_PLAN_OFFERS_DETAILS_LINK_URL", qhq0.e);
                            }
                        }
                        switch(qhn0.g) {
                            case 0: {
                                v5 = 2;
                                break;
                            }
                            case 1: {
                                v5 = 3;
                                break;
                            }
                            case 2: {
                                v5 = 4;
                                break;
                            }
                            case 3: {
                                v5 = 5;
                                break;
                            }
                            default: {
                                v5 = 0;
                            }
                        }
                        if(v5 == 0) {
                            v5 = 1;
                        }
                        switch(v5 - 2) {
                            case 2: {
                                mobileDataPlanDetailChimeraActivity0.setTheme(0x7F160D1B);  // style:Theme.MobileDataPlan.LustRedGoogleMaterial
                                break;
                            }
                            case 3: {
                                if(hvlq.r()) {
                                    mobileDataPlanDetailChimeraActivity0.setTheme(0x7F160D19);  // style:Theme.MobileDataPlan.BlackYellowGoogleMaterial
                                }
                                else {
                                    mobileDataPlanDetailChimeraActivity0.setTheme(0x7F160D1A);  // style:Theme.MobileDataPlan.DefaultGoogleMaterial
                                }
                                break;
                            }
                            default: {
                                mobileDataPlanDetailChimeraActivity0.setTheme(0x7F160D1A);  // style:Theme.MobileDataPlan.DefaultGoogleMaterial
                            }
                        }
                        if(qhn0.h) {
                            bundle0.putBoolean("PLAN_OFFERS_ENABLED", true);
                        }
                        if((qhu1.b & 8) != 0) {
                            qhs qhs0 = qhu1.g == null ? qhs.a : qhu1.g;
                            bundle0.putInt("success_action", (qhr.b(qhs0.b) == null ? qhr.e : qhr.b(qhs0.b)).a());
                            if(!qhs0.c.isEmpty()) {
                                bundle0.putString("success_action_url", qhs0.c);
                            }
                            if(!qhs0.d.isEmpty()) {
                                bundle0.putString("success_action_playstore_id", qhs0.d);
                            }
                            bundle0.putBoolean("show_success_close_button", qhs0.e);
                        }
                        bundle0.putInt("subscription_id_type", (qic.b(qhn0.j) == null ? qic.e : qic.b(qhn0.j)).a());
                        if(!qhn0.k.isEmpty()) {
                            bundle0.putString("carrier_app_name", qhn0.k);
                        }
                        bundle0.putBoolean("show_new_phone_number", qhn0.i);
                        if(!qht0.j.isEmpty()) {
                            bundle0.putString("continue_button_text", qht0.j);
                        }
                        if(!qht0.k.isEmpty()) {
                            bundle0.putString("device_lock_prompt_text", qht0.k);
                        }
                        bundle0.putBoolean("enable_full_width_continue_button", qht0.l);
                        if((qhu1.b & 0x20) != 0) {
                            qho qho0 = qhu1.h == null ? qho.a : qhu1.h;
                            if(!qho0.b.isEmpty()) {
                                bundle0.putString("esim_download_header", qho0.b);
                            }
                        }
                        if((qhu1.b & 0x40) != 0) {
                            hfxk.m(bundle0, "ESIM_ACCOUNT_ERROR_CONFIG", ((MessageLite)(qhu1.i == null ? qhp.a : qhu1.i)));
                        }
                        if((qhu1.b & 0x80) != 0) {
                            hfxk.m(bundle0, "ESIM_DOWNLOAD_ERROR_CONFIG", ((MessageLite)(qhu1.j == null ? qhp.a : qhu1.j)));
                        }
                        if(!hvlq.p() || !qhn0.h || !qht0.m) {
                            z = false;
                        }
                        bundle0.putBoolean("COMBINED_PLAN_OFFERS_PAGE", z);
                        mobileDataPlanDetailChimeraActivity0.o.o(bundle0);
                        ((ggtj)MobileDataPlanDetailChimeraActivity.j.h()).x("Successfully stored CarrierInfo for eSIM flow. Continuing.");
                        if(z) {
                            mobileDataPlanDetailChimeraActivity0.r = new cscs();
                            ca ca0 = new ca(mobileDataPlanDetailChimeraActivity0.getSupportFragmentManager());
                            ca0.G(0x7F0B0FCE, mobileDataPlanDetailChimeraActivity0.r);  // id:container
                            ca0.a();
                            return;
                        }
                        ca ca1 = new ca(mobileDataPlanDetailChimeraActivity0.getSupportFragmentManager());
                        ca1.G(0x7F0B0FCE, mobileDataPlanDetailChimeraActivity0.q);  // id:container
                        ca1.a();
                        return;
                    }
                }
                else if(!bbnp.m(mobileDataPlanDetailChimeraActivity0) && !cslj.a()) {
                    ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("Device has invalid manufacturer or model for eSIM");
                }
                else {
                    goto label_98;
                }
            }
            cscb.B(mobileDataPlanDetailChimeraActivity0, bundle0, hhct.dy, mobileDataPlanDetailChimeraActivity0.o.b);
            return;
        }
        ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("No carrier info or welcome page fetched in eSIM flow");
        cscb.B(mobileDataPlanDetailChimeraActivity0, bundle0, hhct.dD, mobileDataPlanDetailChimeraActivity0.o.b);
    }
}

