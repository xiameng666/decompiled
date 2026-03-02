package com.google.android.gms.googlesettings.service.attribution;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Intent;
import bbcu;
import bbdi;
import bboh;
import buuk;
import buyr;
import buys;
import buyt;
import buyx;
import buyy;
import buyz;
import buza;
import buzc;
import buzd;
import buze;
import buzf;
import buzg;
import buzh;
import buzi;
import buzj;
import buzk;
import buzl;
import buzm;
import buzn;
import buzo;
import buzp;
import buzq;
import ccnr;
import ccns;
import ccod;
import ccoe;
import ccof;
import ccog;
import ccoh;
import ccoi;
import ccoj;
import ccok;
import ccpd;
import ccpe;
import ccpm;
import ccpr;
import clmv;
import clmw;
import clmy;
import clmz;
import clna;
import cmfb;
import cmfe;
import cmft;
import cmge;
import cmgf;
import cmhi;
import fgvt;
import ggtj;
import hfuo;
import hrno;
import hrzv;
import htva;
import ibnq;
import ibns;
import ibnx;
import ibom;
import ibpo;
import ibrl;
import ibrx;
import ibuq;
import ibzw;
import ibzy;
import ibzz;
import icbb;
import iccv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class FeatureStatusObserverIntentOperation extends buzc {
    public static final bboh a;
    public fgvt b;
    public cmhi c;
    public ccpr d;
    public buuk e;
    private static final buyx f;

    static {
        FeatureStatusObserverIntentOperation.f = new buyx();
        FeatureStatusObserverIntentOperation.a = bboh.b("FeatureStatusObserverIntentOperation", bbcu.fK);
    }

    public final Object a(String s, cmfb cmfb0, ibrl ibrl0) {
        String s5;
        clmv clmv5;
        ccok ccok0;
        String s4;
        ibns ibns1;
        cmfb cmfb6;
        Object object20;
        boolean z;
        Object object16;
        Object object15;
        long v9;
        Object object14;
        cmfb cmfb5;
        cmfb cmfb4;
        Object object8;
        long v6;
        Account account0;
        Object object7;
        long v5;
        cmfb cmfb3;
        String s2;
        String s1;
        cmfb cmfb1;
        Object object5;
        long v3;
        long v1;
        Object object2;
        buyy buyy0;
        if((ibrl0 instanceof buyy)) {
            buyy0 = (buyy)ibrl0;
            int v = buyy0.i;
            if((v & 0x80000000) == 0) {
                buyy0 = new buyy(this, ibrl0);
            }
            else {
                buyy0.i = v - 0x80000000;
            }
        }
        else {
            buyy0 = new buyy(this, ibrl0);
        }
        Object object0 = buyy0.g;
        Object object1 = ibrx.a;
        switch(buyy0.i) {
            case 0: {
                ibnx.b(object0);
                hfuo hfuo0 = hrno.f().b;
                ibuq.e(hfuo0, "getFeatureList(...)");
                object2 = new ArrayList(ibpo.q(hfuo0, 10));
                for(Object object3: hfuo0) {
                    bbdi bbdi0 = bbdi.b(((hrzv)object3).c);
                    if(bbdi0 == null) {
                        bbdi0 = bbdi.a;
                    }
                    ((Collection)object2).add(bbdi0);
                }
                v1 = ibzy.i(htva.a.b().c(), ibzz.c);
                long v2 = ibzy.i(htva.a.b().d(), ibzz.d);
                buuk buuk0 = this.c();
                buyy0.j = s;
                buyy0.k = cmfb0;
                buyy0.a = object2;
                buyy0.e = v1;
                buyy0.f = v2;
                buyy0.i = 1;
                Object object4 = buuk0.a(buyy0);
                if(object4 != object1) {
                    v3 = v2;
                    object5 = object4;
                    cmfb1 = cmfb0;
                    s1 = s;
                    goto label_50;
                }
                return object1;
            }
            case 1: {
                long v4 = buyy0.f;
                v1 = buyy0.e;
                object2 = buyy0.a;
                cmfb cmfb2 = buyy0.k;
                s1 = buyy0.j;
                ibnx.b(object0);
                v3 = v4;
                object5 = object0;
                cmfb1 = cmfb2;
            label_50:
                ccpr ccpr0 = this.d();
                buyy0.j = s1;
                buyy0.k = cmfb1;
                buyy0.a = object2;
                buyy0.b = (Account)object5;
                buyy0.e = v1;
                buyy0.f = v3;
                buyy0.i = 2;
                Object object6 = FeatureStatusObserverIntentOperation.f.a(ccpr0, ((List)object2), ((Account)object5), v1, buyy0);
                if(object6 != object1) {
                    s2 = s1;
                    cmfb3 = cmfb1;
                    object0 = object6;
                    v5 = v3;
                    object7 = object2;
                    account0 = (Account)object5;
                    v6 = v1;
                    goto label_75;
                }
                return object1;
            }
            case 2: {
                v5 = buyy0.f;
                v6 = buyy0.e;
                account0 = (Account)buyy0.b;
                object7 = buyy0.a;
                cmfb3 = buyy0.k;
                s2 = buyy0.j;
                ibnx.b(object0);
            label_75:
                object8 = (List)object0;
                if(!(object8 instanceof Collection) || !((Collection)object8).isEmpty()) {
                    for(Object object9: ((Iterable)object8)) {
                        if(!(((ccpe)object9) instanceof ccpd)) {
                            continue;
                        }
                        cmfb4 = cmfb3;
                        goto label_96;
                    }
                }
                ((ggtj)FeatureStatusObserverIntentOperation.a.h()).x("empty before state");
                return ibom.a;
            }
            case 3: {
                v5 = buyy0.f;
                v6 = buyy0.e;
                Object object10 = buyy0.c;
                Account account1 = (Account)buyy0.b;
                Object object11 = buyy0.a;
                cmfb4 = buyy0.k;
                s2 = buyy0.j;
                ibnx.b(object0);
                object8 = object10;
                account0 = account1;
                object7 = object11;
                while(true) {
                label_96:
                    long v7 = this.i();
                    ibzz ibzz0 = ibzz.c;
                    if(ibzw.b(ibzy.i(Math.max(0L, v7 - buzq.a), ibzz0), v5) >= 0) {
                        break;
                    }
                    buyy0.j = s2;
                    buyy0.k = cmfb4;
                    buyy0.a = object7;
                    buyy0.b = account0;
                    buyy0.c = object8;
                    buyy0.e = v6;
                    buyy0.f = v5;
                    buyy0.i = 3;
                    long v8 = Math.max(0L, buzq.a + ibzw.h(v5) - this.i());
                    ibzy.i(v8, ibzz0);
                    Object object12 = iccv.c(v8, buyy0);
                    if(object12 != object1) {
                        object12 = ibom.a;
                    }
                    if(object12 == object1) {
                        return object1;
                    }
                    cmfb4 = cmfb4;
                    v5 = v5;
                }
                buuk buuk1 = this.c();
                buyy0.j = s2;
                buyy0.k = cmfb4;
                buyy0.a = object7;
                buyy0.b = account0;
                buyy0.c = object8;
                buyy0.d = account0;
                buyy0.e = v6;
                buyy0.i = 4;
                Object object13 = buuk1.a(buyy0);
                if(object13 != object1) {
                    cmfb5 = cmfb4;
                    object14 = object8;
                    object0 = object13;
                    v9 = v6;
                    object15 = account0;
                    object16 = object15;
                    goto label_146;
                }
                return object1;
            }
            case 4: {
                long v10 = buyy0.e;
                object15 = buyy0.d;
                Object object17 = buyy0.c;
                Account account2 = (Account)buyy0.b;
                object7 = buyy0.a;
                cmfb5 = buyy0.k;
                String s3 = buyy0.j;
                ibnx.b(object0);
                s2 = s3;
                object14 = object17;
                object16 = account2;
                v9 = v10;
            label_146:
                ibns ibns0 = new ibns(object15, object0);
                Object object18 = ibns0.a;
                Object object19 = ibns0.b;
                if(!ibuq.m(object18, object19)) {
                    if(object18 == null) {
                        z = htva.d();
                    }
                    else {
                        z = object19 == null ? htva.d() : htva.a.b().s();
                    }
                    if(!z) {
                        ((ggtj)FeatureStatusObserverIntentOperation.a.h()).x("account changed");
                        return ibom.a;
                    }
                }
                ccpr ccpr1 = this.d();
                buyy0.j = s2;
                buyy0.k = cmfb5;
                buyy0.a = object14;
                buyy0.b = ibns0;
                buyy0.c = null;
                buyy0.d = null;
                buyy0.i = 5;
                object0 = FeatureStatusObserverIntentOperation.f.a(ccpr1, ((List)object7), ((Account)object16), v9, buyy0);
                if(object0 != object1) {
                    object20 = object14;
                    cmfb6 = cmfb5;
                    ibns1 = ibns0;
                    s4 = s2;
                    break;
                }
                return object1;
            }
            case 5: {
                ibns1 = (ibns)buyy0.b;
                object20 = buyy0.a;
                cmfb6 = buyy0.k;
                s4 = buyy0.j;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!(((List)object0) instanceof Collection) || !((List)object0).isEmpty()) {
            Iterator iterator2 = ((List)object0).iterator();
            while(iterator2.hasNext()) {
                boolean z1 = false;
                Object object21 = iterator2.next();
                if((((ccpe)object21) instanceof ccpd)) {
                    if(htva.d()) {
                        boolean z2 = ibns1.a != null;
                        if(ibns1.b != null) {
                            z1 = true;
                        }
                        ccok0 = ccpm.a(((List)object20), ((List)object0), Boolean.valueOf(z2), Boolean.valueOf(z1));
                    }
                    else {
                        ccok0 = ccpm.a(((List)object20), ((List)object0), null, null);
                    }
                    ibuq.f(s4, "sessionId");
                    ibuq.f(ccok0, "featureStatusDiff");
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cmft.a).v_newBuilder();
                    cmgf cmgf0 = cmge.a(((ProtoLiteMessage)cmfe.a).v_newBuilder());
                    cmgf0.e(s4);
                    if(cmfb6 != null) {
                        cmgf0.f(cmfb6);
                    }
                    ibuq.f(ccok0, "value");
                    ProtoLiteBuilder hftp1 = cmgf0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    cmfe cmfe0 = (cmfe)hftp1.b_message;
                    ccok0.getClass();
                    cmfe0.l = ccok0;
                    cmfe0.b |= 0x200;
                    ibuq.f(ccok0, "<this>");
                    clna clna0 = clmz.a(((ProtoLiteMessage)clmy.a).v_newBuilder());
                    ccoj ccoj0 = ccok0.c == null ? ccoj.a : ccok0.c;
                    ibuq.e(ccoj0, "getBefore(...)");
                    if((ccoj0.b & 0x40) == 0) {
                    label_223:
                        ccoj ccoj4 = ccok0.c == null ? ccoj.a : ccok0.c;
                        ibuq.e(ccoj4, "getBefore(...)");
                        if((ccoj4.b & 1) != 0) {
                            ccoj ccoj5 = ccok0.d == null ? ccoj.a : ccok0.d;
                            ibuq.e(ccoj5, "getAfter(...)");
                            if((ccoj5.b & 1) != 0) {
                                ccoj ccoj6 = ccok0.c == null ? ccoj.a : ccok0.c;
                                ibuq.e(ccoj6, "getBefore(...)");
                                ccod ccod0 = ccoj6.c == null ? ccod.a : ccoj6.c;
                                ccoj ccoj7 = ccok0.d == null ? ccoj.a : ccok0.d;
                                ibuq.e(ccoj7, "getAfter(...)");
                                ibns ibns2 = new ibns(ccod0, (ccoj7.c == null ? ccod.a : ccoj7.c));
                                clna0.c();
                                clmv clmv1 = buzp.a(ibns2, new buzi());
                                clna0.b(buzp.b(clmw.b, clmv1));
                            }
                        }
                        ccoj ccoj8 = ccok0.c == null ? ccoj.a : ccok0.c;
                        ibuq.e(ccoj8, "getBefore(...)");
                        if((ccoj8.b & 2) != 0) {
                            ccoj ccoj9 = ccok0.d == null ? ccoj.a : ccok0.d;
                            ibuq.e(ccoj9, "getAfter(...)");
                            if((ccoj9.b & 2) != 0) {
                                ccoj ccoj10 = ccok0.c == null ? ccoj.a : ccok0.c;
                                ibuq.e(ccoj10, "getBefore(...)");
                                ccoe ccoe0 = ccoj10.d == null ? ccoe.a : ccoj10.d;
                                ccoj ccoj11 = ccok0.d == null ? ccoj.a : ccok0.d;
                                ibuq.e(ccoj11, "getAfter(...)");
                                ibns ibns3 = new ibns(ccoe0, (ccoj11.d == null ? ccoe.a : ccoj11.d));
                                clna0.c();
                                clmv clmv2 = buzp.a(ibns3, new buzj());
                                clna0.b(buzp.b(clmw.c, clmv2));
                                clna0.c();
                                clmv clmv3 = buzp.a(ibns3, new buzk());
                                clna0.b(buzp.b(clmw.d, clmv3));
                            }
                        }
                        ccoj ccoj12 = ccok0.c == null ? ccoj.a : ccok0.c;
                        ibuq.e(ccoj12, "getBefore(...)");
                        if((ccoj12.b & 4) != 0) {
                            ccoj ccoj13 = ccok0.d == null ? ccoj.a : ccok0.d;
                            ibuq.e(ccoj13, "getAfter(...)");
                            if((ccoj13.b & 4) != 0) {
                                ccoj ccoj14 = ccok0.c == null ? ccoj.a : ccok0.c;
                                ibuq.e(ccoj14, "getBefore(...)");
                                ccog ccog0 = ccoj14.e == null ? ccog.a : ccoj14.e;
                                ccoj ccoj15 = ccok0.d == null ? ccoj.a : ccok0.d;
                                ibuq.e(ccoj15, "getAfter(...)");
                                ibns ibns4 = new ibns(ccog0, (ccoj15.e == null ? ccog.a : ccoj15.e));
                                clna0.c();
                                clmv clmv4 = buzp.a(ibns4, new buzl());
                                clna0.b(buzp.b(clmw.e, clmv4));
                                clna0.c();
                                clmw clmw0 = clmw.g;
                                ccns ccns0 = ((ccog)ibns4.a).d;
                                if(ccns0 == null) {
                                    ccns0 = ccns.a;
                                }
                                ccnr ccnr0 = ccnr.b(ccns0.c) == null ? ccnr.f : ccnr.b(ccns0.c);
                                ccns ccns1 = ((ccog)ibns4.b).d;
                                if(ccns1 == null) {
                                    ccns1 = ccns.a;
                                }
                                ibns ibns5 = new ibns(ccnr0, (ccnr.b(ccns1.c) == null ? ccnr.f : ccnr.b(ccns1.c)));
                                ccnr ccnr1 = ccnr.d;
                                ccnr ccnr2 = ccnr.e;
                                if(ibuq.m(ibns5, new ibns(ccnr1, ccnr2))) {
                                    clmv5 = clmv.c;
                                }
                                else {
                                    clmv5 = ibuq.m(ibns5, new ibns(ccnr2, ccnr1)) ? clmv.d : clmv.b;
                                }
                                clna0.b(buzp.b(clmw0, clmv5));
                                clna0.c();
                                clmv clmv6 = buzp.a(ibns4, new buzm());
                                clna0.b(buzp.b(clmw.f, clmv6));
                            }
                        }
                        ccoj ccoj16 = ccok0.c == null ? ccoj.a : ccok0.c;
                        ibuq.e(ccoj16, "getBefore(...)");
                        if((ccoj16.b & 8) != 0) {
                            ccoj ccoj17 = ccok0.d == null ? ccoj.a : ccok0.d;
                            ibuq.e(ccoj17, "getAfter(...)");
                            if((ccoj17.b & 8) != 0) {
                                ccoj ccoj18 = ccok0.c == null ? ccoj.a : ccok0.c;
                                ibuq.e(ccoj18, "getBefore(...)");
                                ccoh ccoh0 = ccoj18.f == null ? ccoh.a : ccoj18.f;
                                ccoj ccoj19 = ccok0.d == null ? ccoj.a : ccok0.d;
                                ibuq.e(ccoj19, "getAfter(...)");
                                ibns ibns6 = new ibns(ccoh0, (ccoj19.f == null ? ccoh.a : ccoj19.f));
                                clna0.c();
                                clmv clmv7 = buzp.a(ibns6, new buzn());
                                clna0.b(buzp.b(clmw.h, clmv7));
                            }
                        }
                        ccoj ccoj20 = ccok0.c == null ? ccoj.a : ccok0.c;
                        ibuq.e(ccoj20, "getBefore(...)");
                        if((ccoj20.b & 16) != 0) {
                            ccoj ccoj21 = ccok0.d == null ? ccoj.a : ccok0.d;
                            ibuq.e(ccoj21, "getAfter(...)");
                            if((ccoj21.b & 16) != 0) {
                                ccoj ccoj22 = ccok0.c == null ? ccoj.a : ccok0.c;
                                ibuq.e(ccoj22, "getBefore(...)");
                                ccoi ccoi0 = ccoj22.g == null ? ccoi.a : ccoj22.g;
                                ccoj ccoj23 = ccok0.d == null ? ccoj.a : ccok0.d;
                                ibuq.e(ccoj23, "getAfter(...)");
                                ibns ibns7 = new ibns(ccoi0, (ccoj23.g == null ? ccoi.a : ccoj23.g));
                                if(htva.a.b().A()) {
                                    clna0.c();
                                    clmv clmv8 = buzp.a(ibns7, new buzo());
                                    clna0.b(buzp.b(clmw.j, clmv8));
                                    clna0.c();
                                    clmv clmv9 = buzp.a(ibns7, new buze());
                                    clna0.b(buzp.b(clmw.k, clmv9));
                                    clna0.c();
                                    clmv clmv10 = buzp.a(ibns7, new buzf());
                                    clna0.b(buzp.b(clmw.l, clmv10));
                                }
                                else {
                                    clna0.c();
                                    clmv clmv11 = buzp.a(ibns7, new buzg());
                                    clna0.b(buzp.b(clmw.i, clmv11));
                                }
                            }
                        }
                        ccoj ccoj24 = ccok0.c == null ? ccoj.a : ccok0.c;
                        ibuq.e(ccoj24, "getBefore(...)");
                        if((ccoj24.b & 0x20) != 0) {
                            ccoj ccoj25 = ccok0.d == null ? ccoj.a : ccok0.d;
                            ibuq.e(ccoj25, "getAfter(...)");
                            if((ccoj25.b & 0x20) != 0) {
                                ccoj ccoj26 = ccok0.c == null ? ccoj.a : ccok0.c;
                                ibuq.e(ccoj26, "getBefore(...)");
                                ccof ccof0 = ccoj26.h == null ? ccof.a : ccoj26.h;
                                ccoj ccoj27 = ccok0.d == null ? ccoj.a : ccok0.d;
                                ibuq.e(ccoj27, "getAfter(...)");
                                ibns ibns8 = new ibns(ccof0, (ccoj27.h == null ? ccof.a : ccoj27.h));
                                clna0.c();
                                clmv clmv12 = buzp.a(ibns8, new buzh());
                                clna0.b(buzp.b(clmw.m, clmv12));
                            }
                        }
                    }
                    else {
                        ccoj ccoj1 = ccok0.d == null ? ccoj.a : ccok0.d;
                        ibuq.e(ccoj1, "getAfter(...)");
                        if((ccoj1.b & 0x40) == 0) {
                            goto label_223;
                        }
                        else {
                            ccoj ccoj2 = ccok0.c == null ? ccoj.a : ccok0.c;
                            ibuq.e(ccoj2, "getBefore(...)");
                            Boolean boolean0 = Boolean.valueOf(ccoj2.i);
                            ccoj ccoj3 = ccok0.d == null ? ccoj.a : ccok0.d;
                            ibuq.e(ccoj3, "getAfter(...)");
                            clmv clmv0 = buzp.a(new ibns(boolean0, Boolean.valueOf(ccoj3.i)), new buzd());
                            clna0.c();
                            clna0.b(buzp.b(clmw.n, clmv0));
                            if(clmv0 == clmv.b) {
                                goto label_223;
                            }
                        }
                    }
                    cmgf0.d(clna0.a());
                    cmfe cmfe1 = cmgf0.a();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cmft cmft0 = (cmft)hftp0.b_message;
                    cmfe1.getClass();
                    cmft0.e = cmfe1;
                    cmft0.b |= 4;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    cmhi cmhi0 = this.c;
                    if(cmhi0 == null) {
                        ibuq.j("gmsCoreMetrics");
                        cmhi0 = null;
                    }
                    if(htva.c()) {
                        Account account3 = (Account)ibns1.b;
                        s5 = account3 == null ? null : account3.name;
                    }
                    else {
                        s5 = null;
                    }
                    cmhi0.a(0x36304, ((cmft)hftv0), s5);
                    return ibom.a;
                }
            }
        }
        ((ggtj)FeatureStatusObserverIntentOperation.a.h()).x("empty after state");
        return ibom.a;
    }

    public final Object b(Intent intent0, ibrl ibrl0) {
        buza buza0;
        if((ibrl0 instanceof buza)) {
            buza0 = (buza)ibrl0;
            int v = buza0.c;
            if((v & 0x80000000) == 0) {
                buza0 = new buza(this, ibrl0);
            }
            else {
                buza0.c = v - 0x80000000;
            }
        }
        else {
            buza0 = new buza(this, ibrl0);
        }
        Object object0 = buza0.a;
        Object object1 = ibrx.a;
        switch(buza0.c) {
            case 0: {
                ibnx.b(object0);
                String s = null;
                if(!ibuq.m((intent0 == null ? null : intent0.getAction()), "com.google.android.gms.googlesettings.service.attribution.FEATURE_STATUS_DIFF")) {
                    ggtj ggtj0 = (ggtj)FeatureStatusObserverIntentOperation.a.h();
                    if(intent0 != null) {
                        s = intent0.getAction();
                    }
                    ggtj0.B("unexpected action: %s", s);
                    return ibom.a;
                }
                buyt buyt0 = buzq.b;
                if((buyt0 instanceof buyr)) {
                    String s1 = ((buyr)buyt0).a;
                    cmfb cmfb0 = ((buyr)buyt0).b;
                    try {
                        buza0.c = 1;
                        if(this.a(s1, cmfb0, buza0) == object1) {
                            return object1;
                        }
                        break;
                    }
                    catch(Throwable throwable0) {
                        buzq.b = buys.a;
                        throw throwable0;
                    }
                    return object1;
                }
                if(!(buyt0 instanceof buys)) {
                    throw new ibnq();
                }
                ((ggtj)FeatureStatusObserverIntentOperation.a.j()).x("invalid diff status");
                return ibom.a;
            }
            case 1: {
                try {
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    buzq.b = buys.a;
                    throw throwable0;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        buzq.b = buys.a;
        return ibom.a;
    }

    public final buuk c() {
        buuk buuk0 = this.e;
        if(buuk0 != null) {
            return buuk0;
        }
        ibuq.j("accountManager");
        return null;
    }

    public final ccpr d() {
        ccpr ccpr0 = this.d;
        if(ccpr0 != null) {
            return ccpr0;
        }
        ibuq.j("featureStatusFetcher");
        return null;
    }

    private final long i() {
        fgvt fgvt0 = this.b;
        if(fgvt0 == null) {
            ibuq.j("clock");
            fgvt0 = null;
        }
        return fgvt0.a();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        icbb.c(new buyz(this, intent0, null));
    }
}

