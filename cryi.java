import android.os.Bundle;
import com.google.android.gms.mobiledataplan.CellularInfo;
import com.google.android.gms.mobiledataplan.DataPlanUsageHistory;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse.Filter;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.QoeMetrics;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportChannel;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import j..util.Collection.-EL;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public final class cryi {
    public static final bboh a;
    private static final ggeo b;
    private static final String[] c;
    private static final String[] d;

    static {
        ggek ggek0 = new ggek();
        ggek0.i(gspo.a, "Unspecified");
        ggek0.i(gspo.b, "Generic");
        ggek0.i(gspo.c, "Video");
        ggek0.i(gspo.d, "Composite");
        ggek0.i(gspo.e, "Google One");
        ggek0.i(gspo.g, "Unrecognized");
        cryi.b = ggek0.b();
        cryi.c = new String[]{"Unspecified", "2G", "3G", "4G", "ALL"};
        cryi.d = new String[]{"UNSPECIFIED", "ZERO", "LOW", "HIGH"};
        cryi.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public static long a(hjin hjin0) {
        return hjin0.c * 1000000L + ((long)hjin0.d) / 1000L;
    }

    static DataPlanUsageHistory b(gsnq gsnq0) {
        return gsnq0 == null ? null : new DataPlanUsageHistory(((int)gsnq0.b), gsnq0.c);
    }

    // This method was un-flattened
    public static MdpDataPlanStatusResponse c(gsou gsou0, String s, Bundle bundle0) {
        int v21;
        int v20;
        String s4;
        String s3;
        int v19;
        MdpDataPlanStatus[] arr_mdpDataPlanStatus1;
        int v17;
        hfwn hfwn1;
        CellularInfo[] arr_cellularInfo1;
        int v1;
        int v;
        WalletBalanceInfo walletBalanceInfo0;
        String s1 = gsou0.h.isEmpty() ? null : gsou0.h;
        gsqh gsqh0 = gsou0.i == null ? gsqh.a : gsou0.i;
        if(gsqh0 == null) {
            walletBalanceInfo0 = null;
        }
        else {
            hjin hjin0 = gsqh0.e == null ? hjin.a : gsqh0.e;
            if(hjin0 != null && !hjin0.b.isEmpty()) {
                walletBalanceInfo0 = new WalletBalanceInfo();
                walletBalanceInfo0.a = cryi.a((gsqh0.e == null ? hjin.a : gsqh0.e));
                walletBalanceInfo0.b = (gsqh0.e == null ? hjin.a : gsqh0.e).b;
                switch(gsqh0.f) {
                    case 0: {
                        v = 2;
                        break;
                    }
                    case 1: {
                        v = 3;
                        break;
                    }
                    default: {
                        v = 0;
                    }
                }
                if(v == 0) {
                    v = 1;
                }
                switch(v - 2) {
                    case 0: {
                        v1 = 1;
                        break;
                    }
                    case 1: {
                        v1 = 2;
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
                walletBalanceInfo0.c = v1;
                walletBalanceInfo0.e = gsqh0.h;
                walletBalanceInfo0.f = gsqh0.i;
                if((gsqh0.b & 2) != 0 && ((ProtoLiteMessage)(gsqh0.g == null ? hfwn.a : gsqh0.g)).isInitialized()) {
                    hfwn hfwn0 = gsqh0.g == null ? hfwn.a : gsqh0.g;
                    walletBalanceInfo0.d = (long)(TimeUnit.SECONDS.toMillis(hfwn0.b) + TimeUnit.NANOSECONDS.toMillis(((long)hfwn0.c)));
                }
                if(hvly.d()) {
                    if((gsqh0.b & 4) != 0 && (gsqh0.j == null ? hjin.a : gsqh0.j).b.equals((gsqh0.e == null ? hjin.a : gsqh0.e).b)) {
                        walletBalanceInfo0.g = cryi.a((gsqh0.j == null ? hjin.a : gsqh0.j));
                    }
                    if((gsqh0.b & 16) != 0 && (gsqh0.l == null ? hjin.a : gsqh0.l).b.equals((gsqh0.e == null ? hjin.a : gsqh0.e).b)) {
                        walletBalanceInfo0.h = cryi.a((gsqh0.l == null ? hjin.a : gsqh0.l));
                    }
                    if((gsqh0.b & 8) != 0 && (gsqh0.k == null ? hjin.a : gsqh0.k).b.equals((gsqh0.e == null ? hjin.a : gsqh0.e).b)) {
                        walletBalanceInfo0.i = cryi.a((gsqh0.k == null ? hjin.a : gsqh0.k));
                        if(!gsqh0.m.isEmpty()) {
                            walletBalanceInfo0.j = gsqh0.m;
                        }
                    }
                }
            }
            else {
                ((ggtj)cryi.a.j()).x("Rpc wallet info passed invalid remaining balance which cannot be converted");
                walletBalanceInfo0 = null;
            }
        }
        String s2 = gsou0.e.isEmpty() ? null : gsou0.e;
        Integer integer0 = gsou0.k == 0 ? null : ((int)gsou0.k);
        Long long0 = gsou0.j == 0L ? null : ((long)gsou0.j);
        if(hvks.h()) {
            gspl gspl0 = gsou0.l == null ? gspl.a : gsou0.l;
            hfuo hfuo0 = (gspl0.b == null ? gsnj.a : gspl0.b).b;
            if(hvks.a.f().z()) {
                Iterator iterator0 = hfuo0.iterator();
                boolean z = false;
                boolean z1 = false;
                while(true) {
                    int v2 = 7;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    switch(((gsnn)object0).b) {
                        case 0: {
                            v2 = 2;
                            break;
                        }
                        case 1: {
                            v2 = 3;
                            break;
                        }
                        case 2: {
                            v2 = 4;
                            break;
                        }
                        case 3: {
                            v2 = 5;
                            break;
                        }
                        case 4: {
                            v2 = 6;
                            break;
                        }
                        case 5: {
                            break;
                        }
                        default: {
                            v2 = 0;
                        }
                    }
                    if(v2 == 0) {
                        v2 = 1;
                    }
                    switch(v2 - 2) {
                        case 3: {
                            z1 = true;
                            break;
                        }
                        case 5: {
                            z = true;
                        }
                    }
                }
                ArrayList arrayList0 = new ArrayList(hfuo0);
                if(!z) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsnn.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gsnn)hftv0).b = 5;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gsnn)hftp0.b_message).c = 1;
                    arrayList0.add(((gsnn)hftp0.N_build()));
                }
                if(!z1) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gsnn.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    ((gsnn)hftv1).b = 3;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gsnn)hftp1.b_message).c = 2;
                    arrayList0.add(((gsnn)hftp1.N_build()));
                }
                hfuo0 = arrayList0;
            }
            int v3 = hfuo0.size();
            CellularInfo[] arr_cellularInfo = new CellularInfo[v3];
            for(int v4 = 0; v4 < hfuo0.size(); ++v4) {
                gsnn gsnn0 = (gsnn)hfuo0.get(v4);
                arr_cellularInfo[v4] = new CellularInfo(((int)gsnn0.b), ((int)gsnn0.c));
            }
            arr_cellularInfo1 = v3 > 0 ? arr_cellularInfo : null;
        }
        else {
            arr_cellularInfo1 = null;
        }
        hfuo hfuo1 = gsou0.d;
        if((gsou0.b & 2) == 0) {
            hfwn1 = hfyn.h(System.currentTimeMillis());
        }
        else {
            hfwn1 = gsou0.g;
            if(hfwn1 == null) {
                hfwn1 = hfwn.a;
            }
        }
        Long long1 = hfwn1 == null ? null : hfyn.b(hfwn1);
        int v5 = 0;
        for(Object object1: hfuo1) {
            gsnp gsnp0 = (gsnp)object1;
            if(gsnp0.l.size() > 0) {
                v5 += gsnp0.l.size();
            }
            else {
                ++v5;
            }
        }
        MdpDataPlanStatus[] arr_mdpDataPlanStatus = new MdpDataPlanStatus[v5];
        if(v5 != 0) {
            bboh bboh0 = cryi.a;
            bboh0.g(cslm.h()).z("Number of rpcPlans: %d", hfuo1.size());
            int v6 = 0;
            Iterator iterator2 = hfuo1.iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                gsnp gsnp1 = (gsnp)object2;
                if(gsnp1.l.size() == 0) {
                    MdpDataPlanStatus mdpDataPlanStatus0 = new MdpDataPlanStatus();
                    mdpDataPlanStatus0.b = gsnp1.c;
                    mdpDataPlanStatus0.c = gsnp1.h;
                    mdpDataPlanStatus0.d = cryi.g((gspo.b(gsnp1.e) == null ? gspo.g : gspo.b(gsnp1.e)), null);
                    long v7 = gsnp1.f;
                    Long.valueOf(v7).getClass();
                    mdpDataPlanStatus0.e = v7;
                    long v8 = gsnp1.g;
                    Long.valueOf(v8).getClass();
                    mdpDataPlanStatus0.f = v8;
                    mdpDataPlanStatus0.g = new MdpFlexTimeWindow[0];
                    cruz.a(gspj.a((gspj.b(gsnp1.i) == 0 ? 1 : gspj.b(gsnp1.i))), mdpDataPlanStatus0);
                    mdpDataPlanStatus0.i = gsnp1.d;
                    mdpDataPlanStatus0.j = null;
                    mdpDataPlanStatus0.o = hfyn.b(hfwn1);
                    mdpDataPlanStatus0.p = gsnp1.j;
                    long v9 = gsnp1.k;
                    Long.valueOf(v9).getClass();
                    mdpDataPlanStatus0.q = v9;
                    mdpDataPlanStatus0.r = null;
                    mdpDataPlanStatus0.s = cryi.j((gspk.a(gsnp1.m) == 0 ? 1 : gspk.a(gsnp1.m)));
                    mdpDataPlanStatus0.u = cryi.i((gsnp1.n == null ? gsps.a : gsnp1.n));
                    mdpDataPlanStatus0.v = cryi.b((gsnp1.o == null ? gsnq.a : gsnp1.o));
                    arr_mdpDataPlanStatus[v6] = mdpDataPlanStatus0;
                    hfwn1 = hfwn1;
                    integer0 = integer0;
                    ++v6;
                }
                else {
                    Integer integer1 = integer0;
                    Iterator iterator3 = gsnp1.l.iterator();
                    while(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        gspn gspn0 = (gspn)object3;
                        bboh0.g(cslm.h()).B("rpcMod: %s", gspn0);
                        MdpDataPlanStatus mdpDataPlanStatus1 = new MdpDataPlanStatus();
                        mdpDataPlanStatus1.b = gsnp1.c;
                        mdpDataPlanStatus1.c = gspn0.h.isEmpty() ? gsnp1.h : gspn0.h;
                        mdpDataPlanStatus1.d = cryi.g((gspo.b(gsnp1.e) == null ? gspo.g : gspo.b(gsnp1.e)), new hfuh(gspn0.e, gspn.a));
                        long v10 = gspn0.c;
                        Long.valueOf(v10).getClass();
                        mdpDataPlanStatus1.e = v10;
                        long v11 = gspn0.f;
                        Long.valueOf(v11).getClass();
                        mdpDataPlanStatus1.f = v11;
                        int v12 = 0;
                        gsoc[] arr_gsoc = (gsoc[])gspn0.k.toArray(new gsoc[0]);
                        int v13 = arr_gsoc.length;
                        int v14 = 0;
                        while(v14 < v13) {
                            if(!arr_gsoc[v14].c) {
                                ++v12;
                            }
                            ++v14;
                            v13 = v13;
                        }
                        MdpFlexTimeWindow[] arr_mdpFlexTimeWindow = new MdpFlexTimeWindow[v12];
                        int v15 = 0;
                        int v16 = 0;
                        while(v15 < arr_gsoc.length) {
                            gsoc gsoc0 = arr_gsoc[v15];
                            if(gsoc0.c) {
                                v17 = v15;
                                arr_mdpDataPlanStatus1 = arr_mdpDataPlanStatus;
                                s4 = s1;
                            }
                            else {
                                v17 = v15;
                                int v18 = gsoc0.b;
                                if(v18 == 0) {
                                    arr_mdpDataPlanStatus1 = arr_mdpDataPlanStatus;
                                }
                                else {
                                    arr_mdpDataPlanStatus1 = arr_mdpDataPlanStatus;
                                    switch(v18) {
                                        case 1: {
                                            v19 = 3;
                                            break;
                                        }
                                        case 2: {
                                            v19 = 4;
                                            break;
                                        }
                                        case 3: {
                                            v19 = 5;
                                            break;
                                        }
                                        default: {
                                            v19 = 1;
                                        }
                                    }
                                }
                                switch(v19 - 2) {
                                    case 1: {
                                        s3 = "DAILY";
                                        break;
                                    }
                                    case 2: {
                                        s3 = "WEEKDAYS";
                                        break;
                                    }
                                    case 3: {
                                        s3 = "WEEKENDS";
                                        break;
                                    }
                                    default: {
                                        s3 = null;
                                    }
                                }
                                s4 = s1;
                                arr_mdpFlexTimeWindow[v16] = new MdpFlexTimeWindow(s3, gsoc0.d, gsoc0.e, (gsoc0.f == 0 ? 100 : gsoc0.f));
                                ++v16;
                            }
                            v15 = v17 + 1;
                            arr_gsoc = arr_gsoc;
                            arr_mdpDataPlanStatus = arr_mdpDataPlanStatus1;
                            s1 = s4;
                        }
                        mdpDataPlanStatus1.g = arr_mdpFlexTimeWindow;
                        cruz.a(gspj.a((gspj.b(gspn0.i) == 0 ? 1 : gspj.b(gspn0.i))), mdpDataPlanStatus1);
                        mdpDataPlanStatus1.i = gsnp1.d;
                        mdpDataPlanStatus1.j = gspn0.m.isEmpty() ? null : gspn0.m;
                        mdpDataPlanStatus1.o = hfyn.b(hfwn1);
                        mdpDataPlanStatus1.p = gspn0.d;
                        mdpDataPlanStatus1.q = gspn0.g;
                        mdpDataPlanStatus1.r = gspn0.j;
                        mdpDataPlanStatus1.s = cryi.j((gspk.a(gspn0.l) == 0 ? 1 : gspk.a(gspn0.l)));
                        mdpDataPlanStatus1.t = gspn0.n != 1;
                        mdpDataPlanStatus1.k = gspn0.o.isEmpty() ? null : gspn0.o;
                        mdpDataPlanStatus1.l = gspn0.p.isEmpty() ? null : gspn0.p;
                        mdpDataPlanStatus1.m = gsnp1.e;
                        switch(gspn0.q) {
                            case 0: {
                                v21 = v20;
                                break;
                            }
                            case 1: {
                                v20 = 3;
                                v21 = 3;
                                break;
                            }
                            case 2: {
                                v20 = 4;
                                v21 = 4;
                                break;
                            }
                            case 3: {
                                v20 = 5;
                                v21 = 5;
                                break;
                            }
                            default: {
                                v20 = 0;
                                v21 = 1;
                            }
                        }
                        if(v21 == 1) {
                            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                        }
                        mdpDataPlanStatus1.w = v21 - 2;
                        mdpDataPlanStatus1.x = gspn0.r;
                        mdpDataPlanStatus1.y = gspn0.s;
                        mdpDataPlanStatus1.z = gspn0.t;
                        mdpDataPlanStatus1.A = gspn0.u;
                        mdpDataPlanStatus1.n = gspn0.e;
                        if((gsnp1.b & 1) != 0) {
                            mdpDataPlanStatus1.u = cryi.i((gsnp1.n == null ? gsps.a : gsnp1.n));
                        }
                        if((gsnp1.b & 2) != 0) {
                            mdpDataPlanStatus1.v = cryi.b((gsnp1.o == null ? gsnq.a : gsnp1.o));
                        }
                        arr_mdpDataPlanStatus[v6] = mdpDataPlanStatus1;
                        ++v6;
                        iterator3 = iterator3;
                        integer1 = integer1;
                        iterator2 = iterator2;
                        long1 = long1;
                        arr_mdpDataPlanStatus = arr_mdpDataPlanStatus;
                        s1 = s1;
                        continue;
                    }
                    hfwn1 = hfwn1;
                    integer0 = integer1;
                }
            }
        }
        return crvd.a(s, arr_mdpDataPlanStatus, bundle0, s1, walletBalanceInfo0, integer0, long0, long1, arr_cellularInfo1, s2, null);
    }

    public static MdpUpsellOfferResponse d(gsqd gsqd0) {
        ArrayList arrayList1;
        Iterator iterator1;
        MdpUpsellPlan[] arr_mdpUpsellPlan;
        hfuo hfuo0 = gsqd0.d;
        if(hfuo0.isEmpty()) {
            arr_mdpUpsellPlan = new MdpUpsellPlan[0];
        }
        else {
            ArrayList arrayList0 = new ArrayList(hfuo0.size());
            for(Iterator iterator0 = hfuo0.iterator(); iterator0.hasNext(); iterator0 = iterator1) {
                Object object0 = iterator0.next();
                gsqf gsqf0 = (gsqf)object0;
                if(!gsqf0.d.isEmpty() && !gsqf0.c.isEmpty() && !gsqf0.e.isEmpty() && !gsqf0.h.isEmpty() && gsqf0.g >= 0L) {
                    String s = gsqf0.d;
                    String s1 = gsqf0.c;
                    int v = 3;
                    String s2 = cryi.g((gspo.b(gsqf0.f) == null ? gspo.g : gspo.b(gsqf0.f)), null);
                    long v1 = gsqf0.g;
                    String s3 = gsqf0.h;
                    switch(gsqf0.i) {
                        case 0: {
                            v = 2;
                            break;
                        }
                        case 1: {
                            break;
                        }
                        case 2: {
                            v = 4;
                            break;
                        }
                        case 3: {
                            v = 5;
                            break;
                        }
                        case 4: {
                            v = 6;
                            break;
                        }
                        default: {
                            v = 0;
                        }
                    }
                    if(v == 0) {
                        v = 1;
                    }
                    String[] arr_s = cryi.c;
                    if(v == 1) {
                        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                    }
                    iterator1 = iterator0;
                    arrayList0.add(new MdpUpsellPlan(s, s1, s2, v1, s3, arr_s[v - 2], gsqf0.j, gsqf0.k, gsqf0.l, gsqf0.e, gsqf0.m, gsqf0.n, gsqf0.o, ((gged_interceptors)Collection.-EL.stream(new hfuh(gsqf0.p, gsqf.a)).map(new cryg()).collect(ggaf.a)), cryi.f(gsqf0.q)));
                    continue;
                }
                else {
                    iterator1 = iterator0;
                }
            }
            arr_mdpUpsellPlan = (MdpUpsellPlan[])arrayList0.toArray(new MdpUpsellPlan[arrayList0.size()]);
        }
        Bundle bundle0 = new Bundle();
        if(!gsqd0.e.isEmpty()) {
            bundle0.putString("purchase_term_html", gsqd0.e);
        }
        if(!gsqd0.f.isEmpty()) {
            bundle0.putString("purchase_method_description", gsqd0.f);
        }
        if((gsqd0.b & 2) != 0) {
            for(Object object1: DesugarCollections.unmodifiableMap((gsqd0.g == null ? gsoi.a : gsqd0.g).b).entrySet()) {
                bundle0.putString(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
            }
        }
        hfuo hfuo1 = gsqd0.j;
        if(hfuo1 != null && !hfuo1.isEmpty()) {
            arrayList1 = new ArrayList();
            for(Object object2: hfuo1) {
                String s4 = ((gsqc)object2).b.trim();
                String s5 = ((gsqc)object2).c.trim();
                if(!s4.isEmpty() && !s5.isEmpty()) {
                    arrayList1.add(new MdpUpsellOfferResponse.Filter(s4, s5));
                }
            }
        }
        else {
            arrayList1 = new ArrayList();
        }
        if((gsqd0.b & 1) != 0) {
            new ArrayList();
            String s6 = (gsqd0.c == null ? gsqb.a : gsqd0.c).d;
            gsqb gsqb0 = gsqd0.c;
            String s7 = (gsqb0 == null ? gsqb.a : gsqb0).e;
            String s8 = (gsqb0 == null ? gsqb.a : gsqb0).b;
            if(gsqb0 == null) {
                gsqb0 = gsqb.a;
            }
            String s9 = gsqb0.c;
            Integer integer0 = gsqd0.i == 0 ? null : ((int)gsqd0.i);
            long v2 = gsqd0.h;
            return v2 == 0L ? new MdpUpsellOfferResponse(s6, s7, s8, s9, arr_mdpUpsellPlan, bundle0, integer0, null, null, arrayList1) : new MdpUpsellOfferResponse(s6, s7, s8, s9, arr_mdpUpsellPlan, bundle0, integer0, v2, null, arrayList1);
        }
        new ArrayList();
        return new MdpUpsellOfferResponse(null, null, null, null, arr_mdpUpsellPlan, bundle0, null, null, null, arrayList1);
    }

    public static CarrierSupportInfo e(gsnm gsnm0) {
        if(gsnm0 == null) {
            return null;
        }
        CarrierSupportInfo carrierSupportInfo0 = new CarrierSupportInfo();
        if(!gsnm0.b.isEmpty()) {
            carrierSupportInfo0.a = gsnm0.b;
        }
        if(!gsnm0.c.isEmpty()) {
            carrierSupportInfo0.b = gsnm0.c;
        }
        int v = gsnm0.d.size();
        if(v == 0) {
            return carrierSupportInfo0;
        }
        CarrierSupportChannel[] arr_carrierSupportChannel = new CarrierSupportChannel[v];
        for(int v1 = 0; v1 < v; ++v1) {
            CarrierSupportChannel carrierSupportChannel0 = new CarrierSupportChannel();
            gsnl gsnl0 = (gsnl)gsnm0.d.get(v1);
            if(!gsnl0.b.isEmpty()) {
                carrierSupportChannel0.a = gsnl0.b;
            }
            if(!gsnl0.c.isEmpty()) {
                carrierSupportChannel0.b = gsnl0.c;
            }
            if(!gsnl0.d.isEmpty()) {
                carrierSupportChannel0.c = gsnl0.d;
            }
            if(!gsnl0.e.isEmpty()) {
                carrierSupportChannel0.d = gsnl0.e;
            }
            if(!gsnl0.f.isEmpty()) {
                carrierSupportChannel0.e = gsnl0.f;
            }
            int v2 = 1;
            int v3 = gsnl0.g;
            if(gspy.b(v3) != 2 && (gspy.b(v3) != 0 && gspy.b(v3) != 1)) {
                int v4 = gspy.b(v3);
                if(v4 != 0) {
                    v2 = v4;
                }
                carrierSupportChannel0.f = gspy.a(v2);
            }
            arr_carrierSupportChannel[v1] = carrierSupportChannel0;
        }
        carrierSupportInfo0.c = arr_carrierSupportChannel;
        return carrierSupportInfo0;
    }

    public static gged_interceptors f(List list0) {
        return (gged_interceptors)Collection.-EL.stream(list0).map(new cryf()).collect(ggaf.a);
    }

    public static String g(gspo gspo0, List list0) {
        String s2;
        int v2;
        ggeo ggeo0 = cryi.b;
        String s = (String)ggeo0.get(gspo0);
        if(s == null) {
            s = (String)ggeo0.get(gspo.a);
        }
        if(list0 != null && !list0.isEmpty()) {
            Iterator iterator0 = list0.iterator();
            String s1 = s + "[";
            while(true) {
                int v = 0;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                gspp gspp0 = (gspp)object0;
                if(gspp0 != null && gspp0 != gspp.k) {
                    int v1 = gspp0.a();
                    while(v < 10) {
                        v2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}[v];
                        if(v2 != 0) {
                            if(v2 - 2 == v1) {
                                goto label_21;
                            }
                            else {
                                ++v;
                                continue;
                            }
                        }
                        throw null;
                    }
                }
                v2 = 1;
            label_21:
                if(v2 != 1) {
                    switch(v2) {
                        case 1: {
                            s2 = "UNRECOGNIZED";
                            break;
                        }
                        case 2: {
                            s2 = "UNSPECIFIED";
                            break;
                        }
                        case 3: {
                            s2 = "GENERIC";
                            break;
                        }
                        case 4: {
                            s2 = "VIDEO";
                            break;
                        }
                        case 5: {
                            s2 = "VIDEO_BROWSING";
                            break;
                        }
                        case 6: {
                            s2 = "MUSIC";
                            break;
                        }
                        case 7: {
                            s2 = "GAMING";
                            break;
                        }
                        case 8: {
                            s2 = "SOCIAL";
                            break;
                        }
                        case 9: {
                            s2 = "MESSAGING";
                            break;
                        }
                        case 10: {
                            s2 = "VIDEO_OFFLINE";
                            break;
                        }
                        default: {
                            s2 = "null";
                        }
                    }
                    s1 = s1 + s2 + ",";
                }
            }
            return s1.substring(0, s1.length() - 1) + "]";
        }
        return s;
    }

    public static int[] h(String s) {
        int v4;
        if(s == null) {
            throw new IllegalArgumentException("category string is null");
        }
        int v = s.indexOf("[");
        int v1 = s.indexOf("]");
        if(v != -1 && v1 != -1) {
            if(v >= v1) {
                throw new IllegalArgumentException(s + " format error");
            }
            List list0 = gfud.g(",").n(s.substring(v + 1, v1));
            int v2 = list0.size();
            int[] arr_v = new int[v2];
            for(int v3 = 0; v3 < v2; ++v3) {
                try {
                    switch(((String)list0.get(v3))) {
                        case "GAMING": {
                            v4 = 7;
                            break;
                        }
                        case "GENERIC": {
                            v4 = 3;
                            break;
                        }
                        case "MESSAGING": {
                            v4 = 9;
                            break;
                        }
                        case "MUSIC": {
                            v4 = 6;
                            break;
                        }
                        case "SOCIAL": {
                            v4 = 8;
                            break;
                        }
                        case "UNRECOGNIZED": {
                            v4 = 1;
                            break;
                        }
                        case "UNSPECIFIED": {
                            v4 = 2;
                            break;
                        }
                        case "VIDEO": {
                            v4 = 4;
                            break;
                        }
                        case "VIDEO_BROWSING": {
                            v4 = 5;
                            break;
                        }
                        case "VIDEO_OFFLINE": {
                            v4 = 10;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException();
                        }
                    }
                    arr_v[v3] = v4;
                }
                catch(IllegalArgumentException unused_ex) {
                    arr_v[v3] = 1;
                }
            }
            return arr_v;
        }
        return null;
    }

    private static QoeMetrics i(gsps gsps0) {
        return gsps0 == null ? null : new QoeMetrics(((long)gsps0.b), ((float)gsps0.c), ((float)gsps0.d));
    }

    private static String j(int v) {
        String[] arr_s = cryi.d;
        if(v != 1) {
            return arr_s[v - 2];
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}

