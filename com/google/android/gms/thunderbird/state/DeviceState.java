package com.google.android.gms.thunderbird.state;

import a;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import baub;
import bbnu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ewqs;
import ewqv;
import ewqw;
import ewsj;
import ewur;
import gfsx;
import gftb;
import ggdy;
import gged_interceptors;
import ggek;
import ggeo;
import ggna;
import ggnf;
import ggqj;
import ggtj;
import hzay;
import j..util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;

public final class DeviceState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    @Deprecated
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final ConnectionState q;

    static {
        DeviceState.CREATOR = new ewqw();
    }

    public DeviceState(int v, int v1, String s, String s1, String s2, String s3, boolean z, String s4, String s5, String s6, String s7, String s8, List list0, int v2, int v3, int v4, ConnectionState connectionState0) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = z;
        this.h = s4;
        this.i = s5;
        this.j = s6;
        this.k = s7;
        this.l = s8;
        this.m = list0 == null ? ggna.a : gged_interceptors.i(list0);
        this.n = v2;
        this.o = v3;
        this.p = v4;
        this.q = connectionState0;
    }

    public final DeviceState a(TelephoneNumber telephoneNumber0) {
        gfsx gfsx0 = gfsx.l(this.q);
        ggdy ggdy0 = new ggdy();
        ggdy0.k(this.m);
        ggdy0.i(telephoneNumber0);
        gged_interceptors gged0 = ggdy0.h();
        return ewqv.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, gged0, this.n, this.o, this.p, gfsx0);
    }

    public final gfsx b() {
        return gfsx.l(this.q);
    }

    public static gged_interceptors c(Context context0) {
        String s65;
        String s64;
        CellInfo cellInfo3;
        CellInfo cellInfo2;
        Iterator iterator3;
        String s61;
        String s60;
        String s59;
        gfsx gfsx3;
        String s52;
        int v14;
        String s51;
        ggtj ggtj0;
        String s50;
        String s49;
        String s47;
        String s46;
        String s45;
        String s44;
        String s43;
        String s40;
        String s39;
        String s38;
        String s37;
        String s36;
        String s35;
        int v13;
        int v12;
        int[] arr_v1;
        String s34;
        int[] arr_v;
        String s32;
        String s31;
        CellInfo cellInfo1;
        CellInfo cellInfo0;
        Iterator iterator1;
        String s28;
        String s27;
        String s26;
        TelephonyManager telephonyManager1;
        gfsx gfsx1;
        int v5;
        String s18;
        String s17;
        String s14;
        String s11;
        String s10;
        String s9;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        int v4;
        int v3;
        ggqj ggqj1;
        String s;
        ggeo ggeo0;
        Integer integer0 = (int)-1;
        Integer integer1 = (int)0x7FFFFFFF;
        if(hzay.M()) {
            try {
                SubscriptionManager subscriptionManager0 = (SubscriptionManager)context0.getSystemService("telephony_subscription_service");
                gftb.check(subscriptionManager0);
                List list0 = subscriptionManager0.getActiveSubscriptionInfoList();
                if(list0 != null && !list0.isEmpty()) {
                    ggek ggek0 = new ggek();
                    for(Iterator iterator0 = list0.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                        Object object0 = iterator0.next();
                        ggek0.i(Integer.valueOf(((SubscriptionInfo)object0).getSubscriptionId()), Integer.valueOf(((SubscriptionInfo)object0).getSimSlotIndex()));
                    }
                    ggeo0 = ggek0.g();
                }
                else {
                    ggeo0 = ggeo.l(integer1, integer0);
                }
            }
            catch(SecurityException securityException0) {
                a.ae(ewsj.a.j(), "cannot retrieve subscription ids - lost permission", securityException0);
                ggeo0 = ggeo.l(integer1, integer0);
            }
            ggdy ggdy0 = gged_interceptors.e(((ggnf)ggeo0).d);
            ggqj ggqj0 = ggeo0.v().om();
            while(ggqj0.hasNext()) {
                Object object1 = ggqj0.next();
                int v = (int)(((Integer)((Map.Entry)object1).getKey()));
                int v1 = (int)(((Integer)((Map.Entry)object1).getValue()));
                int v2 = hzay.y() ? bbnu.b(context0) : 0;
                TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
                gftb.check(telephonyManager0);
                if(v != 0x7FFFFFFF) {
                    telephonyManager0 = telephonyManager0.createForSubscriptionId(v);
                }
                try {
                    s = telephonyManager0.getImei();
                }
                catch(SecurityException securityException1) {
                    ggqj1 = ggqj0;
                    v3 = 0;
                    v4 = 0;
                    s1 = null;
                    s2 = null;
                    s3 = null;
                    s4 = null;
                    goto label_53;
                }
                try {
                    s5 = telephonyManager0.getSubscriberId();
                    goto label_57;
                }
                catch(SecurityException securityException1) {
                    ggqj1 = ggqj0;
                    s3 = s;
                    v3 = 0;
                    v4 = 0;
                    s1 = null;
                    s2 = null;
                    s4 = null;
                }
            label_53:
                String s6 = null;
                String s7 = null;
                String s8 = null;
                goto label_178;
                try {
                label_57:
                    s9 = telephonyManager0.getSimSerialNumber();
                }
                catch(SecurityException securityException1) {
                    ggqj1 = ggqj0;
                    v3 = 0;
                    v4 = 0;
                    s1 = null;
                    s6 = null;
                    s7 = null;
                    s8 = null;
                    s4 = s5;
                    s3 = s;
                    s2 = null;
                    goto label_178;
                }
                try {
                    s10 = telephonyManager0.getLine1Number();
                    goto label_82;
                }
                catch(SecurityException securityException1) {
                    ggqj1 = ggqj0;
                    v3 = 0;
                    v4 = 0;
                    s1 = null;
                    s7 = null;
                    s8 = null;
                    s6 = s9;
                }
                s4 = s5;
                s3 = s;
                s2 = null;
                goto label_178;
                try {
                label_82:
                    s11 = telephonyManager0.getSimCountryIso();
                    if(TextUtils.isEmpty(s11)) {
                        String s12 = telephonyManager0.getNetworkCountryIso();
                        ((ggtj)ewsj.a.j()).x("no sim country ISO 3166 available, fall back to network country ISO 3166");
                        s11 = s12;
                    }
                    if(TextUtils.isEmpty(s11)) {
                        ((ggtj)ewsj.a.j()).x("no country ISO 3166 available");
                        goto label_102;
                    }
                    else {
                        goto label_105;
                    }
                    goto label_107;
                }
                catch(SecurityException securityException1) {
                    ggqj1 = ggqj0;
                    v3 = 0;
                    v4 = 0;
                    s1 = null;
                    s7 = null;
                    s8 = s10;
                    s6 = s9;
                    s4 = s5;
                    s3 = s;
                    s2 = null;
                    goto label_178;
                }
            label_102:
                ggqj1 = ggqj0;
                String s13 = null;
                goto label_107;
            label_105:
                ggqj1 = ggqj0;
                s13 = s11.toUpperCase(Locale.US);
                try {
                label_107:
                    if(hzay.x()) {
                        s14 = telephonyManager0.getSimCountryIso();
                        if(TextUtils.isEmpty(s14)) {
                            ((ggtj)ewsj.a.j()).x("no sim country ISO 3166 available");
                            goto label_123;
                        }
                        else {
                            goto label_126;
                        }
                        goto label_128;
                    }
                    else {
                        goto label_148;
                    }
                    goto label_151;
                }
                catch(SecurityException securityException1) {
                    s7 = s13;
                    v3 = 0;
                    v4 = 0;
                    s1 = null;
                    s8 = s10;
                    s6 = s9;
                    s4 = s5;
                    s3 = s;
                    s2 = null;
                    goto label_178;
                }
            label_123:
                s7 = s13;
                String s15 = null;
                goto label_128;
            label_126:
                s7 = s13;
                s15 = s14.toUpperCase(Locale.US);
                try {
                label_128:
                    String s16 = telephonyManager0.getNetworkCountryIso();
                    if(TextUtils.isEmpty(s16)) {
                        ((ggtj)ewsj.a.j()).x("no network country ISO 3166 available");
                        s17 = s15;
                        s18 = null;
                    }
                    else {
                        s17 = s15;
                        s18 = s16.toUpperCase(Locale.US);
                    }
                }
                catch(SecurityException securityException1) {
                    v3 = 0;
                    v4 = 0;
                    s1 = s15;
                    s8 = s10;
                    s6 = s9;
                    s4 = s5;
                    s3 = s;
                    s2 = null;
                    goto label_178;
                }
                goto label_151;
            label_148:
                s7 = s13;
                s18 = null;
                s17 = null;
                try {
                label_151:
                    if(hzay.A()) {
                        v5 = telephonyManager0.getDataNetworkType();
                        v3 = v5;
                    }
                    else {
                        goto label_166;
                    }
                    goto label_167;
                }
                catch(SecurityException securityException1) {
                    s2 = s18;
                    s1 = s17;
                    s8 = s10;
                    s6 = s9;
                    s4 = s5;
                    s3 = s;
                    v3 = 0;
                    v4 = 0;
                    goto label_178;
                }
                v3 = v5;
                goto label_167;
            label_166:
                v3 = -1;
                try {
                label_167:
                    v4 = v3;
                    if(hzay.z()) {
                        gfsx gfsx0 = gfsx.m(ewqs.a(telephonyManager0).b());
                        gfsx1 = gfsx0;
                    }
                    else {
                        goto label_192;
                    }
                    goto label_193;
                }
                catch(SecurityException securityException1) {
                    s2 = s18;
                    s1 = s17;
                    s8 = s10;
                    s6 = s9;
                    s4 = s5;
                    s3 = s;
                }
            label_178:
                a.ae(ewsj.a.j(), "cannot retrieve device state - lost permission", securityException1);
                s18 = s2;
                gfsx1 = null;
                String s19 = s7;
                String s20 = s8;
                int v6 = v3;
                int v7 = v4;
                String s21 = s1;
                String s22 = s4;
                String s23 = s6;
                String s24 = s3;
                goto label_201;
            label_192:
                gfsx1 = null;
            label_193:
                s20 = s10;
                s19 = s7;
                v6 = v3;
                v7 = v4;
                s24 = s;
                s22 = s5;
                s21 = s17;
                s23 = s9;
            label_201:
                if(s20 != null) {
                    String s25 = s20.trim();
                    if(s25.isEmpty()) {
                        telephonyManager1 = telephonyManager0;
                        s26 = null;
                        goto label_211;
                    }
                    else {
                        s20 = s25;
                    }
                }
                telephonyManager1 = telephonyManager0;
                s26 = s20;
            label_211:
                ggdy ggdy1 = new ggdy();
                if(hzay.x()) {
                    ewur ewur0 = new ewur(context0, ggna.a, s21, s18);
                    ggdy1.i(TelephoneNumber.c(ewur0.d(s26)));
                    s27 = s18;
                    if(Build.VERSION.SDK_INT >= 33) {
                        SubscriptionManager subscriptionManager1 = (SubscriptionManager)context0.getSystemService("telephony_subscription_service");
                        gftb.check(subscriptionManager1);
                        s28 = s26;
                        try {
                            ggdy1.i(TelephoneNumber.f(ewur0.d(subscriptionManager1.getPhoneNumber(v, 1))));
                            ggdy1.i(TelephoneNumber.d(ewur0.d(subscriptionManager1.getPhoneNumber(v, 2))));
                            ggdy1.i(TelephoneNumber.e(ewur0.d(subscriptionManager1.getPhoneNumber(v, 3))));
                        }
                        catch(SecurityException securityException2) {
                            a.ae(ewsj.a.j(), "cannot use getPhoneNumber API - permission lost", securityException2);
                        }
                        catch(IllegalStateException illegalStateException0) {
                            a.ae(ewsj.a.j(), "cannot use getPhoneNumber API - subscription service unavailable", illegalStateException0);
                        }
                    }
                    else {
                        s28 = s26;
                    }
                }
                else {
                    s27 = s18;
                    s28 = s26;
                    ggdy1.i(TelephoneNumber.c(s28));
                    if(Build.VERSION.SDK_INT >= 33) {
                        SubscriptionManager subscriptionManager2 = (SubscriptionManager)context0.getSystemService("telephony_subscription_service");
                        gftb.check(subscriptionManager2);
                        try {
                            ggdy1.i(TelephoneNumber.f(subscriptionManager2.getPhoneNumber(v, 1)));
                            ggdy1.i(TelephoneNumber.d(subscriptionManager2.getPhoneNumber(v, 2)));
                            ggdy1.i(TelephoneNumber.e(subscriptionManager2.getPhoneNumber(v, 3)));
                        }
                        catch(SecurityException securityException3) {
                            a.ae(ewsj.a.j(), "cannot use getPhoneNumber API - permission lost", securityException3);
                        }
                        catch(IllegalStateException illegalStateException1) {
                            a.ae(ewsj.a.j(), "cannot use getPhoneNumber API - subscription service unavailable", illegalStateException1);
                        }
                    }
                }
                gged_interceptors gged0 = ggdy1.h();
                String s29 = DeviceState.d(telephonyManager1.getSimOperator());
                String s30 = DeviceState.d(telephonyManager1.getNetworkOperator());
                if(s30 == null) {
                    try {
                        List list1 = telephonyManager1.getAllCellInfo();
                        if(list1 == null) {
                            cellInfo0 = null;
                            break;
                        }
                        else {
                            iterator1 = list1.iterator();
                            goto label_258;
                        }
                        goto label_274;
                    }
                    catch(SecurityException securityException4) {
                        cellInfo0 = null;
                        a.ae(ewsj.a.j(), "cannot retrieve all cell info - lost permission", securityException4);
                        break;
                    }
                label_258:
                    cellInfo0 = null;
                    while(true) {
                        try {
                        label_259:
                            if(!iterator1.hasNext()) {
                                break;
                            }
                            Object object2 = iterator1.next();
                            cellInfo1 = (CellInfo)object2;
                            boolean z = cellInfo1.isRegistered();
                        }
                        catch(SecurityException securityException4) {
                            a.ae(ewsj.a.j(), "cannot retrieve all cell info - lost permission", securityException4);
                            break;
                        }
                        if(!z) {
                            goto label_259;
                        }
                        if((cellInfo1 instanceof CellInfoLte)) {
                            cellInfo0 = cellInfo1;
                            break;
                        }
                        cellInfo0 = cellInfo1;
                    }
                label_274:
                    if((cellInfo0 instanceof CellInfoNr)) {
                        s31 = ((CellIdentityNr)((CellInfoNr)cellInfo0).getCellIdentity()).getMccString();
                        s32 = ((CellIdentityNr)((CellInfoNr)cellInfo0).getCellIdentity()).getMncString();
                    }
                    else if((cellInfo0 instanceof CellInfoGsm)) {
                        s31 = ((CellInfoGsm)cellInfo0).getCellIdentity().getMccString();
                        s32 = ((CellInfoGsm)cellInfo0).getCellIdentity().getMncString();
                    }
                    else if((cellInfo0 instanceof CellInfoLte)) {
                        s31 = ((CellInfoLte)cellInfo0).getCellIdentity().getMccString();
                        s32 = ((CellInfoLte)cellInfo0).getCellIdentity().getMncString();
                    }
                    else if((cellInfo0 instanceof CellInfoWcdma)) {
                        s31 = ((CellInfoWcdma)cellInfo0).getCellIdentity().getMccString();
                        s32 = ((CellInfoWcdma)cellInfo0).getCellIdentity().getMncString();
                    }
                    else {
                        s31 = null;
                        s32 = null;
                    }
                    s30 = DeviceState.d((s32 == null || s31 == null ? null : s31 + s32));
                }
                String s33 = !hzay.a.o().av() || s29 != null || s30 == null ? s29 : s30;
                ggdy0.i(ewqv.a(v, v1, s24, s22, s23, s28, s26 != null, s33, (!hzay.a.o().aw() || s30 != null || s33 == null ? s30 : s33), s19, s21, s27, gged0, v2, v7, v6, gfsx1));
                ggqj0 = ggqj1;
            }
            return ggdy0.h();
        }
        try {
            SubscriptionManager subscriptionManager3 = (SubscriptionManager)context0.getSystemService("telephony_subscription_service");
            gftb.check(subscriptionManager3);
            List list2 = subscriptionManager3.getActiveSubscriptionInfoList();
            if(list2 != null && !list2.isEmpty()) {
                arr_v = new int[list2.size()];
                int v8 = 0;
                for(Object object3: list2) {
                    arr_v[v8] = ((SubscriptionInfo)object3).getSubscriptionId();
                    ++v8;
                }
            }
            else {
                arr_v = new int[]{0x7FFFFFFF};
            }
        }
        catch(SecurityException securityException5) {
            a.ae(ewsj.a.j(), "cannot retrieve subscription ids - lost permission", securityException5);
            arr_v = new int[]{0x7FFFFFFF};
        }
        ggdy ggdy2 = gged_interceptors.e(arr_v.length);
        int v9 = 0;
        while(v9 < arr_v.length) {
            int v10 = arr_v[v9];
            int v11 = hzay.y() ? bbnu.b(context0) : 0;
            TelephonyManager telephonyManager2 = (TelephonyManager)context0.getSystemService("phone");
            gftb.check(telephonyManager2);
            if(v10 != 0x7FFFFFFF) {
                telephonyManager2 = telephonyManager2.createForSubscriptionId(v10);
            }
            try {
                s34 = telephonyManager2.getImei();
            }
            catch(SecurityException securityException6) {
                arr_v1 = arr_v;
                v12 = 0;
                v13 = 0;
                s35 = null;
                s36 = null;
                s37 = null;
                s38 = null;
                s39 = null;
                goto label_348;
            }
            try {
                s40 = telephonyManager2.getSubscriberId();
                goto label_351;
            }
            catch(SecurityException securityException6) {
                arr_v1 = arr_v;
                s38 = s34;
                v12 = 0;
                v13 = 0;
                s35 = null;
                s36 = null;
                s37 = null;
                s39 = null;
            }
        label_348:
            String s41 = null;
            String s42 = null;
            goto label_482;
            try {
            label_351:
                s43 = telephonyManager2.getSimSerialNumber();
            }
            catch(SecurityException securityException6) {
                arr_v1 = arr_v;
                v12 = 0;
                v13 = 0;
                s35 = null;
                s36 = null;
                s41 = null;
                s42 = null;
                s39 = s40;
                s38 = s34;
                s37 = null;
                goto label_482;
            }
            try {
                s44 = telephonyManager2.getLine1Number();
                goto label_376;
            }
            catch(SecurityException securityException6) {
                arr_v1 = arr_v;
                v12 = 0;
                v13 = 0;
                s35 = null;
                s36 = null;
                s42 = null;
                s41 = s43;
            }
            s39 = s40;
            s38 = s34;
            s37 = null;
            goto label_482;
            try {
            label_376:
                s45 = telephonyManager2.getSimCountryIso();
                if(TextUtils.isEmpty(s45)) {
                    s45 = telephonyManager2.getNetworkCountryIso();
                    ((ggtj)ewsj.a.j()).x("no sim country ISO 3166 available, fall back to network country ISO 3166");
                }
                if(TextUtils.isEmpty(s45)) {
                    ((ggtj)ewsj.a.j()).x("no country ISO 3166 available");
                    s46 = null;
                }
                else {
                    goto label_396;
                }
                goto label_397;
            }
            catch(SecurityException securityException6) {
                arr_v1 = arr_v;
                v12 = 0;
                v13 = 0;
                s35 = null;
                s36 = null;
                s42 = s44;
                s41 = s43;
                s39 = s40;
                s38 = s34;
                s37 = null;
                goto label_482;
            }
        label_396:
            s46 = s45.toUpperCase(Locale.US);
            try {
            label_397:
                if(hzay.x()) {
                    s47 = telephonyManager2.getSimCountryIso();
                    if(TextUtils.isEmpty(s47)) {
                        ((ggtj)ewsj.a.j()).x("no sim country ISO 3166 available");
                        goto label_414;
                    }
                    else {
                        goto label_417;
                    }
                    goto label_419;
                }
                else {
                    goto label_450;
                }
                goto label_453;
            }
            catch(SecurityException securityException6) {
                arr_v1 = arr_v;
                v12 = 0;
                v13 = 0;
                s35 = null;
                s42 = s44;
                s41 = s43;
                s39 = s40;
                s38 = s34;
                s37 = s46;
                s36 = null;
                goto label_482;
            }
        label_414:
            arr_v1 = arr_v;
            String s48 = null;
            goto label_419;
        label_417:
            arr_v1 = arr_v;
            s48 = s47.toUpperCase(Locale.US);
            try {
            label_419:
                s49 = telephonyManager2.getNetworkCountryIso();
                boolean z1 = TextUtils.isEmpty(s49);
            }
            catch(SecurityException securityException6) {
                s50 = s48;
                goto label_435;
            }
            if(z1) {
                try {
                    ggtj0 = (ggtj)ewsj.a.j();
                }
                catch(SecurityException securityException6) {
                    s50 = s48;
                    goto label_435;
                }
                try {
                    s50 = s48;
                    ggtj0.x("no network country ISO 3166 available");
                    s51 = null;
                    goto label_453;
                }
                catch(SecurityException securityException6) {
                }
            label_435:
                v12 = 0;
                v13 = 0;
                s35 = s50;
                s42 = s44;
                s41 = s43;
                s39 = s40;
                s38 = s34;
                s37 = s46;
                s36 = null;
                goto label_482;
            }
            else {
                s50 = s48;
                s51 = s49.toUpperCase(Locale.US);
            }
            goto label_453;
        label_450:
            arr_v1 = arr_v;
            s51 = null;
            s50 = null;
            try {
            label_453:
                if(hzay.A()) {
                    v14 = telephonyManager2.getDataNetworkType();
                    v12 = v14;
                }
                else {
                    goto label_469;
                }
                goto label_470;
            }
            catch(SecurityException securityException6) {
                s36 = s51;
                s35 = s50;
                s42 = s44;
                s41 = s43;
                s39 = s40;
                s38 = s34;
                s37 = s46;
                v12 = 0;
                v13 = 0;
                goto label_482;
            }
            v12 = v14;
            goto label_470;
        label_469:
            v12 = -1;
            try {
            label_470:
                v13 = v12;
                if(hzay.z()) {
                    gfsx gfsx2 = gfsx.m(ewqs.a(telephonyManager2).b());
                    gfsx3 = gfsx2;
                    s52 = s46;
                }
                else {
                    goto label_497;
                }
                goto label_499;
            }
            catch(SecurityException securityException6) {
                s36 = s51;
                s35 = s50;
                s42 = s44;
                s41 = s43;
                s39 = s40;
                s38 = s34;
                s37 = s46;
            }
        label_482:
            a.ae(ewsj.a.j(), "cannot retrieve device state - lost permission", securityException6);
            s51 = s36;
            s52 = s37;
            gfsx3 = null;
            String s53 = s42;
            int v15 = v12;
            int v16 = v13;
            String s54 = s35;
            String s55 = s39;
            String s56 = s41;
            String s57 = s38;
            goto label_506;
        label_497:
            s52 = s46;
            gfsx3 = null;
        label_499:
            s53 = s44;
            s54 = s50;
            v15 = v12;
            v16 = v13;
            s57 = s34;
            s55 = s40;
            s56 = s43;
        label_506:
            if(s53 != null) {
                String s58 = s53.trim();
                if(s58.isEmpty()) {
                    s59 = null;
                    goto label_514;
                }
                else {
                    s53 = s58;
                }
            }
            s59 = s53;
        label_514:
            ggdy ggdy3 = new ggdy();
            if(hzay.x()) {
                ewur ewur1 = new ewur(context0, ggna.a, s54, s51);
                ggdy3.i(TelephoneNumber.c(ewur1.d(s59)));
                s60 = s51;
                if(Build.VERSION.SDK_INT >= 33) {
                    SubscriptionManager subscriptionManager4 = (SubscriptionManager)context0.getSystemService("telephony_subscription_service");
                    gftb.check(subscriptionManager4);
                    s61 = s59;
                    try {
                        ggdy3.i(TelephoneNumber.f(ewur1.d(subscriptionManager4.getPhoneNumber(v10, 1))));
                        ggdy3.i(TelephoneNumber.d(ewur1.d(subscriptionManager4.getPhoneNumber(v10, 2))));
                        ggdy3.i(TelephoneNumber.e(ewur1.d(subscriptionManager4.getPhoneNumber(v10, 3))));
                    }
                    catch(SecurityException securityException7) {
                        a.ae(ewsj.a.j(), "cannot use getPhoneNumber API - permission lost", securityException7);
                    }
                    catch(IllegalStateException illegalStateException2) {
                        a.ae(ewsj.a.j(), "cannot use getPhoneNumber API - subscription service unavailable", illegalStateException2);
                    }
                }
                else {
                    s61 = s59;
                }
            }
            else {
                s60 = s51;
                s61 = s59;
                ggdy3.i(TelephoneNumber.c(s61));
                if(Build.VERSION.SDK_INT >= 33) {
                    SubscriptionManager subscriptionManager5 = (SubscriptionManager)context0.getSystemService("telephony_subscription_service");
                    gftb.check(subscriptionManager5);
                    try {
                        ggdy3.i(TelephoneNumber.f(subscriptionManager5.getPhoneNumber(v10, 1)));
                        ggdy3.i(TelephoneNumber.d(subscriptionManager5.getPhoneNumber(v10, 2)));
                        ggdy3.i(TelephoneNumber.e(subscriptionManager5.getPhoneNumber(v10, 3)));
                    }
                    catch(SecurityException securityException8) {
                        a.ae(ewsj.a.j(), "cannot use getPhoneNumber API - permission lost", securityException8);
                    }
                    catch(IllegalStateException illegalStateException3) {
                        a.ae(ewsj.a.j(), "cannot use getPhoneNumber API - subscription service unavailable", illegalStateException3);
                    }
                }
            }
            gged_interceptors gged1 = ggdy3.h();
            String s62 = DeviceState.d(telephonyManager2.getSimOperator());
            String s63 = DeviceState.d(telephonyManager2.getNetworkOperator());
            if(s63 == null) {
                try {
                    List list3 = telephonyManager2.getAllCellInfo();
                    if(list3 == null) {
                        cellInfo2 = null;
                        break;
                    }
                    else {
                        iterator3 = list3.iterator();
                        goto label_561;
                    }
                    goto label_577;
                }
                catch(SecurityException securityException9) {
                    cellInfo2 = null;
                    a.ae(ewsj.a.j(), "cannot retrieve all cell info - lost permission", securityException9);
                    break;
                }
            label_561:
                cellInfo2 = null;
                while(true) {
                    try {
                    label_562:
                        if(!iterator3.hasNext()) {
                            break;
                        }
                        Object object4 = iterator3.next();
                        cellInfo3 = (CellInfo)object4;
                        boolean z2 = cellInfo3.isRegistered();
                    }
                    catch(SecurityException securityException9) {
                        a.ae(ewsj.a.j(), "cannot retrieve all cell info - lost permission", securityException9);
                        break;
                    }
                    if(!z2) {
                        goto label_562;
                    }
                    if((cellInfo3 instanceof CellInfoLte)) {
                        cellInfo2 = cellInfo3;
                        break;
                    }
                    cellInfo2 = cellInfo3;
                }
            label_577:
                if((cellInfo2 instanceof CellInfoNr)) {
                    s64 = ((CellIdentityNr)((CellInfoNr)cellInfo2).getCellIdentity()).getMccString();
                    s65 = ((CellIdentityNr)((CellInfoNr)cellInfo2).getCellIdentity()).getMncString();
                }
                else if((cellInfo2 instanceof CellInfoGsm)) {
                    s64 = ((CellInfoGsm)cellInfo2).getCellIdentity().getMccString();
                    s65 = ((CellInfoGsm)cellInfo2).getCellIdentity().getMncString();
                }
                else if((cellInfo2 instanceof CellInfoLte)) {
                    s64 = ((CellInfoLte)cellInfo2).getCellIdentity().getMccString();
                    s65 = ((CellInfoLte)cellInfo2).getCellIdentity().getMncString();
                }
                else if((cellInfo2 instanceof CellInfoWcdma)) {
                    s64 = ((CellInfoWcdma)cellInfo2).getCellIdentity().getMccString();
                    s65 = ((CellInfoWcdma)cellInfo2).getCellIdentity().getMncString();
                }
                else {
                    s64 = null;
                    s65 = null;
                }
                s63 = DeviceState.d((s65 == null || s64 == null ? null : s64 + s65));
            }
            String s66 = !hzay.a.o().av() || s62 != null || s63 == null ? s62 : s63;
            ggdy2.i(ewqv.a(v10, -1, s57, s55, s56, s61, s59 != null, s66, (!hzay.a.o().aw() || s63 != null || s66 == null ? s63 : s66), s52, s54, s60, gged1, v11, v16, v15, gfsx3));
            ++v9;
            arr_v = arr_v1;
        }
        return ggdy2.h();
    }

    public static String d(String s) {
        if(s != null) {
            if(s.length() >= 5 && s.length() <= 6) {
                if(s.startsWith("000")) {
                    return null;
                }
                char[] arr_c = s.toCharArray();
                for(int v = 0; v < arr_c.length; ++v) {
                    int v1 = arr_c[v];
                    if(v1 < 0x30 || v1 > 57) {
                        return null;
                    }
                }
                return s;
            }
            return null;
        }
        return null;
    }

    public final String e(Context context0) {
        if(!hzay.N()) {
            return this.f;
        }
        gfsx gfsx0 = hzay.x() ? new ewur(context0, this.m, this.k, this.l).b() : new ewur(context0, this.m, this.j).b();
        return gfsx0.i() ? ((TelephoneNumber)gfsx0.d()).a : null;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a == ((DeviceState)object0).a && this.b == ((DeviceState)object0).b && Objects.equals(this.c, ((DeviceState)object0).c) && Objects.equals(this.d, ((DeviceState)object0).d) && Objects.equals(this.e, ((DeviceState)object0).e) && Objects.equals(this.f, ((DeviceState)object0).f) && Objects.equals(this.h, ((DeviceState)object0).h) && Objects.equals(this.i, ((DeviceState)object0).i) && Objects.equals(this.j, ((DeviceState)object0).j) && Objects.equals(this.k, ((DeviceState)object0).k) && Objects.equals(this.l, ((DeviceState)object0).l) && Objects.equals(this.m, ((DeviceState)object0).m) && this.n == ((DeviceState)object0).n && this.o == ((DeviceState)object0).o && this.p == ((DeviceState)object0).p && Objects.equals(this.q, ((DeviceState)object0).q);
    }

    public final String f() {
        return this.i == null ? null : this.i.substring(0, 3);
    }

    public final String g() {
        return this.i == null ? null : this.i.substring(3);
    }

    public final String h() {
        return this.a == 0x7FFFFFFF ? "DEFAULT" : Integer.toString(this.a);
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return hzay.a.o().aP() ? this.h() + "{HomeMCCMNC=" + this.h + ", NetworkMCCMNC=" + this.i + "}" : this.h() + "{IMEI=" + this.c + ", IMSI=" + this.d + ", SimSlotIndex=" + this.b + ", PhoneNumber=" + this.f + ", HomeMCCMNC=" + this.h + ", NetworkMCCMNC=" + this.i + ", CountryIso=" + this.j + ", SimCountryIso=" + this.k + ", NetworkCountryIso=" + this.l + ", PhoneNumbers=" + this.m + ", InvocationBatteryPercentage=" + this.n + ", NetworkType=" + this.o + ", InvocationNetworkType=" + this.p + ", ConnectionState=" + this.q + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.c, false);
        baub.v(parcel0, 2, this.d, false);
        baub.v(parcel0, 3, this.e, false);
        baub.v(parcel0, 4, this.f, false);
        baub.v(parcel0, 6, this.h, false);
        baub.v(parcel0, 7, this.i, false);
        baub.o(parcel0, 9, this.a);
        baub.e(parcel0, 10, this.g);
        baub.v(parcel0, 11, this.j, false);
        baub.y(parcel0, 12, this.m, false);
        baub.o(parcel0, 13, this.b);
        baub.o(parcel0, 14, this.n);
        baub.v(parcel0, 15, this.k, false);
        baub.v(parcel0, 16, this.l, false);
        baub.o(parcel0, 17, this.o);
        baub.o(parcel0, 18, this.p);
        baub.t(parcel0, 19, this.q, v, false);
        baub.c(parcel0, v1);
    }
}

