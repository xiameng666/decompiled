package com.google.android.gms.pay.factoryreset;

import MessageLite;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.content.Context;
import android.content.Intent;
import bbcu;
import bboh;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import dlmf;
import dmgv;
import dmhl;
import dmks;
import dmkt;
import dmku;
import dmkv;
import dmkw;
import dola;
import domu;
import domv;
import dptv;
import dpuj;
import dqhq;
import dqhs;
import dqie;
import dqjj;
import dqjl;
import dqmp;
import dqna;
import earn;
import fsyh;
import ftcj;
import gfnh;
import gged_interceptors;
import ggeo;
import ggtj;
import glzd;
import gmbu;
import gmcd;
import gmcg;
import gtlr;
import gtpr;
import gtte;
import gttf;
import heal;
import hkdx;
import hkdy;
import hkus;
import hwix;
import ibpo;
import ibps;
import ibpz;
import ibuq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class PayFactoryResetChimeraReceiver extends BroadcastReceiver {
    public static final bboh b;
    public gmcg c;
    public dmkw d;

    static {
        PayFactoryResetChimeraReceiver.b = bboh.b("Pay", bbcu.cZ);
    }

    public final gmcg a() {
        gmcg gmcg0 = this.c;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("executor");
        return null;
    }

    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        gmcd gmcd0;
        Iterator iterator2;
        List list0;
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        bboh bboh0 = PayFactoryResetChimeraReceiver.b;
        ((ggtj)bboh0.h()).x("Factory Reset broadcast received");
        if(!hwix.a.b().a()) {
            Map map0 = ibpz.q(dlmf.c(context0, dmgv.d()));
            ArrayList arrayList0 = new ArrayList(map0.size());
            for(Object object0: map0.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                String s1 = (String)((Map.Entry)object0).getValue();
                ((ggtj)bboh0.h()).B("Running cleanup for account %s", s1);
                dola dola0 = new dola(s1, s);
                domv domv0 = domu.a(AppContextProvider.a());
                Preconditions.b(domv0);
                new dmks(dola0, domv0).inject(this);
                ((ggtj)bboh0.h()).x("Undigitizing cards");
                dmkw dmkw0 = this.d;
                if(dmkw0 == null) {
                    ibuq.j("closedLoopHandler");
                    dmkw0 = null;
                }
                ((ggtj)dmkw.a.h()).x("undigitizing all closed loop cards");
                try {
                    gged_interceptors gged0 = dmkw0.b.e();
                    ibuq.e(gged0, "readAllBundles(...)");
                    list0 = ibpo.ar(gged0);
                }
                catch(earn earn0) {
                    a.ae(dmkw.a.h(), "No storage key available", earn0);
                    list0 = ibps.a;
                }
                catch(dmhl dmhl0) {
                    a.ae(dmkw.a.h(), "Error opening the bundle database", dmhl0);
                    list0 = ibps.a;
                }
                ArrayList arrayList1 = new ArrayList(ibpo.q(list0, 10));
                Iterator iterator1 = list0.iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    fsyh fsyh0 = (fsyh)object1;
                    switch((ftcj.b(fsyh0.n) == null ? ftcj.d : ftcj.b(fsyh0.n)).ordinal()) {
                        case 1: {
                            dqna dqna0 = dmkw0.d;
                            long v = fsyh0.c;
                            String s2 = dqjj.L("deleteTicketCentricProduct");
                            gfnh gfnh0 = dqjl.a(fsyh0);
                            if(gfnh0 == null) {
                                ((ggtj)dqna.a.j()).A("The CanonicalTransitBundle for card %d is null.", v);
                                gmcd0 = gmbu.g();
                                break;
                            }
                            else {
                                dqie dqie0 = dqna0.b;
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtte.a).v_newBuilder();
                                gtpr gtpr0 = dqie0.e.a();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp0.b_message;
                                iterator2 = iterator1;
                                gtpr0.getClass();
                                ((gtte)hftv0).g = gtpr0;
                                ((gtte)hftv0).b |= 2;
                                if(!hftv0.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv1 = hftp0.b_message;
                                ((gtte)hftv1).e = s2;
                                if(!hftv1.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv2 = hftp0.b_message;
                                ((gtte)hftv2).c = v;
                                if(!hftv2.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv3 = hftp0.b_message;
                                ((gtte)hftv3).d = 5;
                                if(!hftv3.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv4 = hftp0.b_message;
                                ((gtte)hftv4).h = 1;
                                if(!hftv4.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((gtte)hftp0.b_message).i = true;
                                heal heal0 = dqhs.a(((MessageLite)gfnh0));
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                gtte gtte0 = (gtte)hftp0.b_message;
                                heal0.getClass();
                                gtte0.f = heal0;
                                gtte0.b |= 1;
                                gtte gtte1 = (gtte)hftp0.N_build();
                                ggeo ggeo0 = ggeo.l("6", "e35");
                                gmcd0 = dptv.c(dqie0.d, dpuj.x, ((MessageLite)gtte1), ((MessageLite)gttf.a), ggeo0);
                                goto label_142;
                            }
                            goto label_90;
                        }
                        case 2: {
                        label_90:
                            dqmp dqmp0 = dmkw0.c;
                            long v1 = fsyh0.c;
                            String s3 = dqjj.L("deleteCardCentricProduct");
                            bboh bboh1 = dqmp.a;
                            ((ggtj)bboh1.h()).x("Moving card");
                            hkus hkus0 = dqjl.b(fsyh0);
                            if(hkus0 == null) {
                                ((ggtj)bboh1.j()).A("The CanonicalAccountbasedPassBundle for card %d is null.", v1);
                                gmcd0 = gmbu.g();
                            }
                            else {
                                dqhq dqhq0 = dqmp0.b;
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkdx.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((hkdx)hftp1.b_message).f = s3;
                                gtpr gtpr1 = dqhq0.e.a();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv5 = hftp1.b_message;
                                gtpr1.getClass();
                                ((hkdx)hftv5).h = gtpr1;
                                ((hkdx)hftv5).b |= 2;
                                if(!hftv5.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((hkdx)hftp1.b_message).c = 1;
                                ((hkdx)hftp1.b_message).d = v1;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv6 = hftp1.b_message;
                                ((hkdx)hftv6).e = 2;
                                if(!hftv6.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv7 = hftp1.b_message;
                                ((hkdx)hftv7).i = 1;
                                if(!hftv7.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hkdx hkdx0 = (hkdx)hftp1.b_message;
                                hkdx0.k = gtlr.a(5);
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((hkdx)hftp1.b_message).j = true;
                                heal heal1 = dqhs.a(((MessageLite)hkus0));
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hkdx hkdx1 = (hkdx)hftp1.b_message;
                                heal1.getClass();
                                hkdx1.g = heal1;
                                hkdx1.b |= 1;
                                hkdx hkdx2 = (hkdx)hftp1.N_build();
                                ggeo ggeo1 = ggeo.l("4", "e35");
                                gmcd0 = dptv.c(dqhq0.b, dpuj.a, ((MessageLite)hkdx2), ((MessageLite)hkdy.a), ggeo1);
                            }
                            break;
                        }
                        default: {
                            gmcd0 = gmbu.g();
                        }
                    }
                    iterator2 = iterator1;
                label_142:
                    arrayList1.add(gmcd0);
                    iterator1 = iterator2;
                }
                arrayList0.add(glzd.f(gmbu.o(ibpo.ar(arrayList1)), new dmkv(new dmku()), this.a()));
            }
            if(!arrayList0.isEmpty()) {
                this.beginAsync();
                gmbu.a(arrayList0).c(new dmkt(this), this.a());
            }
            return;
        }
        ((ggtj)bboh0.h()).x("Feature is turned off.");
    }
}

