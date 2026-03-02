import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.wallet.bender3.framework.client.GoogleAccountStateSnapshot;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import j..util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class gbbl extends gaok {
    private final gbkz b;
    private final gbap c;
    private final gcsk d;

    public gbbl(gamx gamx0, gbkz gbkz0, gbap gbap0, gcsk gcsk0) {
        super(gamx0);
        this.b = gbkz0;
        this.c = gbap0;
        this.d = gcsk0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        zr zr0;
        int v10;
        List list0;
        ganp ganp2;
        Pair pair0;
        hdux hdux1;
        ByteString hfsf4;
        gkxj gkxj1;
        boolean z2;
        hckh hckh0;
        boolean z;
        int v4;
        Context context1;
        gcsg gcsg0;
        WidgetConfig widgetConfig0 = this.e(gano0);
        String s = widgetConfig0.c();
        Intent intent0 = gano0.a;
        int v = intent0.getIntExtra("actionRequestType", 0);
        Serializable serializable0 = intent0.getSerializableExtra("urlType");
        gaym gaym0 = this.f();
        ibts ibts0 = gavs.a;
        gavr.b(serializable0, "BE_O2NA_08", gaym0, ibts0, gbbl.l("urlType", v, gbbn.f));
        switch(((gbbn)serializable0).ordinal()) {
            case 0: {
                gbbq gbbq0 = (gbbq)gbbj.a().get(Integer.valueOf(widgetConfig0.c));
                if(gbbq0 != null) {
                    gbbm gbbm0 = (gbbm)gbbq0.e.a();
                    if(gbbm0 != null) {
                        gcsg0 = gbbm0.a(widgetConfig0);
                        goto label_34;
                    }
                }
                throw new IllegalArgumentException("Initialize not supported for widgetType: " + widgetConfig0.c);
            }
            case 1: {
                gbbq gbbq1 = (gbbq)gbbj.a().get(Integer.valueOf(widgetConfig0.c));
                if(gbbq1 != null) {
                    gbbm gbbm1 = (gbbm)gbbq1.f.a();
                    if(gbbm1 != null) {
                        gcsg0 = gbbm1.a(widgetConfig0);
                        goto label_34;
                    }
                }
                throw new IllegalArgumentException("Submit not supported for widgetType: " + widgetConfig0.c);
            }
            case 2: {
                int v1 = widgetConfig0.c;
                if(v1 != 1 && v1 != 2 && v1 != 8) {
                    throw new IllegalArgumentException("InitializeTemplate not supported for widgetType: " + v1);
                }
                gaxl.a();
                gbbm gbbm2 = new gbbm(hzlp.a.b().a() + "buyflowservice/initializetemplate", gbar.a("buyflowservice/initializetemplate"));
                gcsg0 = new gcsg(gbbm.b(widgetConfig0.b) + gbbm2.a, gbbm2.b);
                goto label_34;
            }
            case 3: {
                gcsg0 = new gbbm("addressentryservice/getaddresssuggestion", gbar.a("addressentryservice/getaddresssuggestion")).a(widgetConfig0);
                goto label_34;
            }
            case 4: {
                gcsg0 = new gbbm("addressmetadataservice/getsubregionsmetadata", gbar.a("addressmetadataservice/getsubregionsmetadata")).a(widgetConfig0);
            label_34:
                byte[] arr_b = intent0.getByteArrayExtra("bodyBytes");
                gavr.b(arr_b, "BE_O2NA_05", this.f(), ibts0, gbbl.k("bodyBytes", v, gcsg0.a));
                byte[] arr_b1 = intent0.hasExtra("sessionData") ? intent0.getByteArrayExtra("sessionData") : null;
                byte[] arr_b2 = intent0.hasExtra("productAuthToken") ? intent0.getByteArrayExtra("productAuthToken") : null;
                Integer integer0 = intent0.hasExtra("requestContextContentType") ? intent0.getIntExtra("requestContextContentType", 0) : null;
                hckj hckj0 = (hckj)gawi.d(intent0, "secureDataHeader", ((MessageLite)hckj.a));
                int v2 = gkwt.a(intent0.getIntExtra("logEndpoint", 0));
                GoogleAccountStateSnapshot googleAccountStateSnapshot0 = (GoogleAccountStateSnapshot)intent0.getParcelableExtra("googleAccountStateSnapshot");
                gavr.b(googleAccountStateSnapshot0, "BE_O2NA_06", this.f(), ibts0, gbbl.k("googleAccountStateSnapshot", v, gcsg0.a));
                Context context0 = this.a;
                gaxl.a();
                if(hzmb.c()) {
                    Account[] arr_account = googleAccountStateSnapshot0.a;
                    ArrayList arrayList0 = new ArrayList(arr_account.length);
                    int v3 = 0;
                    while(v3 < arr_account.length) {
                        arrayList0.add(arr_account[v3].name);
                        ++v3;
                        context0 = context0;
                    }
                    context1 = context0;
                    switch(v) {
                        case 0: {
                            v = 0;
                            v4 = 0;
                            z = false;
                            break;
                        }
                        case 2: {
                            v = 2;
                            v4 = 2;
                            z = false;
                            break;
                        }
                        default: {
                            v4 = v;
                            z = true;
                        }
                    }
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbbw.a).v_newBuilder();
                    fbbv fbbv0 = fbbv.c;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((fbbw)hftv0).f = fbbv0.d;
                    ((fbbw)hftv0).b |= 2;
                    long v5 = widgetConfig0.q;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((fbbw)hftp0.b_message).c = 8;
                    ((fbbw)hftp0.b_message).d = v5;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((fbbw)hftv1).b |= 4;
                    ((fbbw)hftv1).g = v == 2;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    ((fbbw)hftv2).b |= 8;
                    ((fbbw)hftv2).h = z;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    ((fbbw)hftv3).b |= 0x80;
                    ((fbbw)hftv3).m = z;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fbbw fbbw0 = (fbbw)hftp0.b_message;
                    hfuo hfuo0 = fbbw0.j;
                    if(!hfuo0.c()) {
                        fbbw0.j = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(arrayList0, fbbw0.j);
                    if(arr_b2 != null) {
                        gaxl.a();
                        ByteString hfsf0 = ByteString.copyFrom(arr_b2);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        fbbw fbbw1 = (fbbw)hftp0.b_message;
                        fbbw1.b |= 0x40;
                        fbbw1.l = hfsf0;
                    }
                    if(arr_b1 != null) {
                        ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        fbbw fbbw2 = (fbbw)hftp0.b_message;
                        fbbw2.b |= 1;
                        fbbw2.e = hfsf1;
                    }
                    if(integer0 != null && ((int)integer0) == 2) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        fbbw fbbw3 = (fbbw)hftp0.b_message;
                        fbbw3.b |= 0x100;
                        fbbw3.n = true;
                    }
                    gano gano1 = gbgs.a(widgetConfig0, ((fbbw)hftp0.N_build()));
                    ganp ganp0 = this.d().a(gano1);
                    hckh0 = ganp0.b() == 0 ? ((hckh)gawi.i(ganp0.a, "requestContextActionResponse", ((MessageLite)hckh.a))) : hckh.a;
                    if(arr_b2 != null) {
                        gaxl.a();
                    }
                    v = v4;
                }
                else {
                    context1 = context0;
                    hckk hckk0 = arr_b1 == null ? null : ((hckk)gawi.g(arr_b1, ((Parser)((ProtoLiteMessage)hckk.a).jf(7, null))));
                    Long long0 = (long)widgetConfig0.q;
                    int v6 = widgetConfig0.d;
                    String s1 = widgetConfig0.l;
                    boolean z1 = v == 2;
                    int v7 = widgetConfig0.f();
                    switch(v) {
                        case 0: {
                            v = 0;
                            z2 = false;
                            break;
                        }
                        case 2: {
                            v = 2;
                            z2 = false;
                            break;
                        }
                        default: {
                            z2 = true;
                        }
                    }
                    hckh0 = gbhe.a(context1, hckk0, long0, arr_b2, v6, s1, false, z1, v7, z2, widgetConfig0.a, googleAccountStateSnapshot0.a, widgetConfig0.b());
                }
                switch(v) {
                    case 0: {
                        hduv hduv0 = (hduv)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hduv.a).jf(7, null)));
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hduv0).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)hduv0));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hduv hduv1 = (hduv)hftp1.b_message;
                        hckh0.getClass();
                        hduv1.c = hckh0;
                        hduv1.b |= 1;
                        arr_b = ((hduv)hftp1.N_build()).toBytesArray();
                        break;
                    }
                    case 1: {
                        hdvd hdvd0 = (hdvd)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hdvd.a).jf(7, null)));
                        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hdvd0).jf(5, null);
                        hftp2.X(((ProtoLiteMessage)hdvd0));
                        if(!((hdvc)hftp2).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((hdvc)hftp2))).ensureMutable();
                        }
                        hdvd hdvd1 = (hdvd)((hdvc)hftp2).b_message;
                        hckh0.getClass();
                        hdvd1.c = hckh0;
                        hdvd1.b |= 1;
                        arr_b = ((hdvd)((ProtoLiteBuilder)(((hdvc)hftp2))).N_build()).toBytesArray();
                        break;
                    }
                    case 2: {
                        hduw hduw0 = (hduw)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hduw.a).jf(7, null)));
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hduw0).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)hduw0));
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        hduw hduw1 = (hduw)hftp3.b_message;
                        hckh0.getClass();
                        hduw1.c = hckh0;
                        hduw1.b |= 1;
                        arr_b = ((hduw)hftp3.N_build()).toBytesArray();
                        break;
                    }
                    case 3: {
                        hcih hcih0 = (hcih)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hcih.a).jf(7, null)));
                        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)hcih0).jf(5, null);
                        hftp4.X(((ProtoLiteMessage)hcih0));
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        hcih hcih1 = (hcih)hftp4.b_message;
                        hckh0.getClass();
                        hcih1.c = hckh0;
                        hcih1.b |= 1;
                        arr_b = ((hcih)hftp4.N_build()).toBytesArray();
                        break;
                    }
                    case 4: {
                        hcij hcij0 = (hcij)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hcij.a).jf(7, null)));
                        ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)hcij0).jf(5, null);
                        hftp5.X(((ProtoLiteMessage)hcij0));
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        hcij hcij1 = (hcij)hftp5.b_message;
                        hckh0.getClass();
                        hcij1.c = hckh0;
                        hcij1.b |= 1;
                        arr_b = ((hcij)hftp5.N_build()).toBytesArray();
                    }
                }
                gkxq gkxq0 = gkxq.a;
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gkxq0).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp6.b_message;
                if(v2 == 0) {
                    throw null;
                }
                ((gkxq)hftv4).c = v2 - 1;
                ((gkxq)hftv4).b |= 1;
                long v8 = hckh0.i;
                if(!hftv4.isImmutable()) {
                    hftp6.ensureMutable();
                }
                gkxq gkxq1 = (gkxq)hftp6.b_message;
                gkxq1.b |= 4;
                gkxq1.e = v8;
                gaxl.a();
                if(hzin.c() && v == 0) {
                    getm getm0 = gblv.a(((hduv)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hduv.a).jf(7, null)))).f, widgetConfig0.c);
                    if(getm0 != null && (getm0.b & 8) != 0) {
                        ByteString hfsf2 = getm0.f;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gkxq gkxq2 = (gkxq)hftp6.b_message;
                        hfsf2.getClass();
                        gkxq2.b |= 16;
                        gkxq2.g = hfsf2;
                    }
                    v = 0;
                }
                if(v2 != 1) {
                    gayy.c(this.f(), ((gkxq)hftp6.N_build()));
                }
                gaxl.a();
                if(hzin.c()) {
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gkxq gkxq3 = (gkxq)hftp6.b_message;
                    gkxq3.b &= -17;
                    gkxq3.g = gkxq0.g;
                }
                if(v == 2) {
                    hfuo hfuo1 = ((hduw)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hduw.a).jf(7, null)))).d;
                    zs zs0 = this.b.a(widgetConfig0, hckh0);
                    if(zs0 != null) {
                        HashSet hashSet0 = new HashSet();
                        for(Object object0: zs0.b) {
                            hashSet0.add(((zq)object0).c);
                        }
                        for(Object object1: hfuo1) {
                            if(hashSet0.contains(((ByteString)object1))) {
                                continue;
                            }
                            goto label_251;
                        }
                        return new ganp(ganp.e(1005));
                    }
                label_251:
                    v = 2;
                }
                if(v == 0) {
                    gaxl.a();
                    if(hzlp.a.b().e()) {
                        hduv hduv2 = (hduv)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hduv.a).jf(7, null)));
                        byte[] arr_b3 = hduv2.f.toByteArray();
                        gkxj gkxj0 = gkxj.b;
                        ByteString hfsf3 = ((gers)gawi.g(arr_b3, ((Parser)((ProtoLiteMessage)gers.b).jf(7, null)))).e;
                        getm getm1 = gblv.a(hduv2.f, widgetConfig0.c);
                        zs zs1 = this.b.a(widgetConfig0, hckh0);
                        if(zs1 == null) {
                            gkxj1 = gkxj0;
                        }
                        else {
                            gkxj1 = gkxj0;
                            Iterator iterator2 = zs1.b.iterator();
                            while(iterator2.hasNext()) {
                                Object object2 = iterator2.next();
                                zq zq0 = (zq)object2;
                                if(!zq0.d.isEmpty()) {
                                    gkxj1 = gkxj.c;
                                }
                                for(Object object3: zq0.d) {
                                    hduy hduy0 = (hduy)object3;
                                    if((hduy0.d == null ? hdux.a : hduy0.d).d && !zq0.c.equals(hfsf3)) {
                                        gkxj1 = gkxj1;
                                        iterator2 = iterator2;
                                        continue;
                                    }
                                    hdux hdux0 = hduy0.d;
                                    if(hdux0 == null) {
                                        hfsf4 = hfsf3;
                                        hdux1 = hdux.a;
                                    }
                                    else {
                                        hfsf4 = hfsf3;
                                        hdux1 = hdux0;
                                    }
                                    if((hdux1.b & 1) != 0 && ((hdux0 == null ? hdux.a : hdux0).b & 1) != 0) {
                                        if(getm1 == null) {
                                            gkxj1 = gkxj1;
                                            hfsf3 = hfsf4;
                                            iterator2 = iterator2;
                                            continue;
                                        }
                                        else {
                                            if(hdux0 == null) {
                                                hdux0 = hdux.a;
                                            }
                                            if(!hdux0.c.equals(getm1.d)) {
                                                gkxj1 = gkxj1;
                                                hfsf3 = hfsf4;
                                                iterator2 = iterator2;
                                                continue;
                                            }
                                        }
                                    }
                                    gfsx gfsx0 = gfsx.m(hduy0);
                                    pair0 = Pair.create(gkxj.d, gfsx0);
                                    goto label_303;
                                }
                            }
                        }
                        pair0 = Pair.create(gkxj1, gfqx.a);
                    label_303:
                        ganp ganp1 = ((gfsx)pair0.second).i() ? new ganp(this.j(0, ((hduy)((gfsx)pair0.second).d()).c.toByteArray(), hckh0).a.putExtra("templateWereUsed", true)) : ganp.j();
                        Pair pair1 = Pair.create(((gkxj)pair0.first), ganp1);
                        ganp2 = ((ganp)pair1.second).b() == 0 ? ((ganp)pair1.second) : null;
                        gkxj gkxj2 = (gkxj)pair1.first;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ((gkxq)hftp6.b_message).d = gkxj2.e;
                        ((gkxq)hftp6.b_message).b |= 2;
                    }
                    else {
                        ganp2 = null;
                    }
                }
                else {
                    ganp2 = null;
                }
                if(ganp2 == null) {
                    try {
                        gamx gamx0 = this.d();
                        String s2 = this.c.c(gamx0, context1, widgetConfig0.a, gbbh.a(widgetConfig0.b), v2 != 1);
                        gcsk gcsk0 = this.d;
                        if(hckj0 == null) {
                            list0 = null;
                        }
                        else if(hckj0.b.size() != 0) {
                            list0 = hckj0.b;
                        }
                        else if(hckj0.c.size() != 0) {
                            list0 = hckj0.c;
                        }
                        else {
                            list0 = null;
                        }
                        gcsi gcsi0 = ((gbbg)gcsk0).a(gcsg0, arr_b, s2, list0);
                        if(Objects.equals(widgetConfig0.l, "com.android.vending")) {
                            gaxl.a();
                            long v9 = hzmn.a.b().a();
                            if(v9 != 0L) {
                                this.f().c(v9);
                            }
                        }
                        ganp2 = this.j(v, ((byte[])gcsi0.a().b()), hckh0);
                    }
                    catch(gcqt | gcqz exception0) {
                        if((exception0 instanceof gcqt)) {
                            Intent intent1 = ((gcqt)exception0).a;
                            if(intent1 != null) {
                                ganp2 = ganp.i(intent1);
                                goto label_371;
                            }
                            goto label_343;
                        }
                        else {
                        label_343:
                            Log.e("O2NetworkAction", String.format(Locale.US, "Network Error: %s", exception0));
                            Intent intent2 = ganp.e(2);
                            if((exception0 instanceof gcqt)) {
                                v10 = 1002;
                            }
                            else if((exception0 instanceof gcqz)) {
                                hhna hhna0 = ((gcqz)exception0).a;
                                if(hhna0 == null) {
                                    v10 = 1004;
                                }
                                else if(hhna0.b == 502) {
                                    v10 = 1003;
                                }
                                else {
                                    v10 = 1001;
                                }
                            }
                            else {
                                v10 = 1004;
                            }
                            intent2.putExtra("actionResponseErrorType", v10);
                            intent2.putExtras(intent0);
                            ganp2 = new ganp(intent2);
                            if((exception0 instanceof gcqz)) {
                                hhna hhna1 = ((gcqz)exception0).a;
                                if(hhna1 != null) {
                                    byte[] arr_b4 = gbbh.c(hhna1, 0);
                                    if(arr_b4 != null) {
                                        intent2.putExtra("actionResponseErrorOrchestrationPayload", arr_b4);
                                    }
                                    byte[] arr_b5 = gbbh.c(hhna1, 1);
                                    if(arr_b5 != null) {
                                        intent2.putExtra("actionResponseErrorPaymentsError", arr_b5);
                                    }
                                }
                            }
                        }
                    }
                }
            label_371:
                gaxl.a();
                if(hzin.c() && ganp2.b() == 0 && v != 2) {
                    byte[] arr_b6 = gbbl.g(ganp2, false);
                    if(arr_b6 != null) {
                        gaxl.a();
                        fbbg fbbg0 = (fbbg)gawi.g(arr_b6, ((Parser)((ProtoLiteMessage)fbbg.a).jf(7, null)));
                        if(((fbbg0.b == null ? fbbf.a : fbbg0.b).b & 1) != 0) {
                            ByteString hfsf5 = (fbbg0.b == null ? fbbf.a : fbbg0.b).c;
                            if(!hftp6.b_message.isImmutable()) {
                                hftp6.ensureMutable();
                            }
                            gkxq gkxq4 = (gkxq)hftp6.b_message;
                            hfsf5.getClass();
                            gkxq4.b |= 8;
                            gkxq4.f = hfsf5;
                        }
                    }
                }
                if(ganp2.b() == 0 && v == 0) {
                    gaxl.a();
                    if(hzlp.a.b().b()) {
                        gbkz gbkz0 = this.b;
                        Set set0 = gbkz0.a.getAll().keySet();
                        SharedPreferences.Editor sharedPreferences$Editor0 = gbkz0.a.edit();
                        for(Object object4: set0) {
                            String s3 = (String)object4;
                            if(gbkz0.b(s3) == null) {
                                continue;
                                try {
                                label_396:
                                    Parser hfvs0 = (Parser)((ProtoLiteMessage)zt.a).jf(7, null);
                                    zr0 = ((zt)gawi.f(Base64.decode(s3, 0), hfvs0)).d;
                                }
                                catch(hfur hfur0) {
                                    Log.e("InitTemplateStorage", String.format(Locale.US, "Invalid key stored for InitializationTemplateStorage: %s", hfur0.getMessage()));
                                    continue;
                                }
                                if(zr0 == null) {
                                    zr0 = zr.a;
                                }
                                if(!s.equals(zr0.d)) {
                                    continue;
                                }
                                sharedPreferences$Editor0.remove(s3);
                                continue;
                            }
                            else {
                                goto label_396;
                            }
                            break;
                        }
                        sharedPreferences$Editor0.apply();
                    }
                }
                if(v2 != 1) {
                    gayy.b(this.f(), ((gkxq)hftp6.N_build()), (ganp2.b() == 0 ? gkxf.b : gkxf.e));
                }
                return ganp2;
            }
            case 5: {
                throw new IllegalArgumentException("Invalid url type");
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public static Intent b(int v, WidgetConfig widgetConfig0, gbbn gbbn0, byte[] arr_b, GoogleAccountStateSnapshot googleAccountStateSnapshot0, gaym gaym0) {
        String s = gbbl.l("urlType", v, gbbn.f);
        gavs.c(((boolean)(TextUtils.isEmpty(gbbn0.name()) ^ 1)), "BE_O2NA_02", gaym0, s);
        String s1 = gbbl.l("bodyBytes", v, gbbn0);
        gavr.b(arr_b, "BE_O2NA_03", gaym0, gavs.a, s1);
        String s2 = gbbl.l("googleAccountStateSnapshot", v, gbbn0);
        gavr.b(googleAccountStateSnapshot0, "BE_O2NA_04", gaym0, gavs.a, s2);
        Intent intent0 = gano.b("o2NetworkAction", widgetConfig0);
        intent0.putExtra("actionRequestType", v);
        intent0.putExtra("urlType", gbbn0);
        intent0.putExtra("bodyBytes", arr_b);
        intent0.putExtra("googleAccountStateSnapshot", googleAccountStateSnapshot0);
        return intent0;
    }

    public static gano c(WidgetConfig widgetConfig0, byte[] arr_b, byte[] arr_b1, hckj hckj0, boolean z, GoogleAccountStateSnapshot googleAccountStateSnapshot0, gaym gaym0) {
        return gbbl.i(0, widgetConfig0, gbbn.a, arr_b, arr_b1, null, null, hckj0, (z ? 2 : 1), googleAccountStateSnapshot0, gaym0);
    }

    public static byte[] g(ganp ganp0, boolean z) {
        gaxl.a();
        boolean z1 = hrnt.i();
        return gcvs.h(ganp0.a, z, z1);
    }

    public static byte[] h(ganp ganp0, gaym gaym0) {
        gaxl.a();
        boolean z = hrnt.i();
        byte[] arr_b = gcvs.h(ganp0.a, true, z);
        gavs.g(arr_b, "BE_O2NA_01", gaym0);
        return arr_b;
    }

    public static gano i(int v, WidgetConfig widgetConfig0, gbbn gbbn0, byte[] arr_b, byte[] arr_b1, hded hded0, hckk hckk0, hckj hckj0, int v1, GoogleAccountStateSnapshot googleAccountStateSnapshot0, gaym gaym0) {
        Intent intent0 = gbbl.b(v, widgetConfig0, gbbn0, arr_b, googleAccountStateSnapshot0, gaym0);
        if(hckk0 != null) {
            intent0.putExtra("sessionData", hckk0.toBytesArray());
        }
        if(arr_b1 != null) {
            intent0.putExtra("productAuthToken", arr_b1);
        }
        if(hded0 != null) {
            intent0.putExtra("requestContextContentType", (hdec.a(hded0.b) == 0 ? 2 : hdec.a(hded0.b)) - 1);
        }
        gawi.q(intent0, "secureDataHeader", ((MessageLite)hckj0));
        intent0.putExtra("logEndpoint", v1 - 1);
        return new gano(intent0);
    }

    private final ganp j(int v, byte[] arr_b, hckh hckh0) {
        Intent intent0 = ganp.e(0);
        gavs.g(arr_b, "BE_O2NA_07", this.f());
        gaxl.a();
        long v1 = (long)gaxm.w();
        gaxl.a();
        boolean z = hrnt.i();
        String s = gcvs.d(this.a, arr_b, v1, z);
        if(TextUtils.isEmpty(s)) {
            intent0.putExtra("bodyBytes", arr_b);
        }
        else {
            intent0.putExtra("bodyBytesfilename", s);
        }
        intent0.putExtra("actionRequestType", v);
        if(v == 2) {
            intent0.putExtra("requestContext", hckh0.toBytesArray());
        }
        return new ganp(intent0);
    }

    private static String k(String s, int v, String s1) {
        return String.format(Locale.US, "Field %s is absent, while the requestType is %d, the urlPath is %s.", s, v, s1);
    }

    private static String l(String s, int v, gbbn gbbn0) {
        return String.format(Locale.US, "Field %s is absent, while the requestType is %d, the urlType is %s.", s, v, gbbn0);
    }
}

