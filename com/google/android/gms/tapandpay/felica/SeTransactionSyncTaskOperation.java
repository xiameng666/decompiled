package com.google.android.gms.tapandpay.felica;

import MessageLite;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.content.Context;
import bbcu;
import bboh;
import cjuh;
import cljp;
import clkq;
import clkr;
import cllr;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dyco;
import dyct;
import dynw;
import ecyb;
import eset;
import esge;
import esgh;
import esgi;
import esgj;
import eshj;
import esjz;
import eskb;
import eskf;
import eskg;
import esoe;
import etmv;
import etsy;
import etti;
import ettj;
import fsim;
import gged_interceptors;
import ggek;
import ggna;
import ggqk;
import ggtj;
import gjsj;
import gjsr;
import gjsw;
import gjvu;
import gjzl;
import gmap;
import gtfc;
import gtni;
import gusm;
import gusn;
import guso;
import gusp;
import gusq;
import hfwn;
import hfym;
import hwwy;
import hyra;
import j..util.Collection.-EL;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class SeTransactionSyncTaskOperation implements esoe {
    private static final bboh a;

    static {
        SeTransactionSyncTaskOperation.a = bboh.b("TapAndPay", bbcu.aM);
    }

    @Override  // esoe
    public final int a(cllr cllr0, Context context0) {
        bboh bboh0 = SeTransactionSyncTaskOperation.a;
        bboh0.g(esgh.a()).x("Running task");
        String s = cllr0.a;
        if(!Objects.equals(s, "secard.transactions.sync") && !Objects.equals(s, "secard.transactions.sync.oneoff")) {
            ((ggtj)bboh0.j()).B("Got an unexpected task service tag: %s", s);
            return 2;
        }
        String s1 = esge.d();
        try {
            AccountInfo accountInfo0 = eset.f(context0, s1);
        }
        catch(eshj | cjuh exception0) {
            a.ae(SeTransactionSyncTaskOperation.a.i(), "Error retrieving active account", exception0);
            return 2;
        }
        if(accountInfo0 == null) {
            bboh0.g(esgh.a()).x("Skipping se transaction sync. Account is null");
            return 0;
        }
        eskb eskb0 = eskb.f(new esgi(accountInfo0, s1, context0));
        if(eskb0.z()) {
            if(!hyra.a.b().d()) {
                Level level0 = esgh.a();
                eskb.a.g(level0).B("Syncing offline FeliCa transactions for %s", eskb0.b.b);
                try {
                    List list0 = eskb0.o();
                }
                catch(eshj unused_ex) {
                    return 2;
                }
                if(!list0.isEmpty()) {
                    try {
                        int v = eskb0.d.e(eskb0.b.b);
                        int v1 = v ^ 1;
                        if(v == 0) {
                            eskb0.e.ae(4);
                        }
                        else {
                            etmv etmv0 = eskb0.e;
                            ProtoLiteBuilder hftp0 = etmv0.al(gjsj.ci);
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjsw.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((gjsw)hftv0).c = 2;
                            ((gjsw)hftv0).b |= 1;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gjsw)hftp1.b_message).e = 2;
                            ((gjsw)hftp1.b_message).b |= 4;
                            gjsw gjsw0 = (gjsw)hftp1.N_build();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gjzl gjzl0 = (gjzl)hftp0.b_message;
                            gjsw0.getClass();
                            gjzl0.X = gjsw0;
                            gjzl0.c |= 0x1000000;
                            etmv0.l(((gjzl)hftp0.N_build()));
                        }
                        boolean z = true;
                    }
                    catch(fsim fsim0) {
                        a.ae(eskb.a.h(), "Error checking if MFI account is logged in; should skip transaction sync", fsim0);
                        eskb0.e.ae(3);
                        z = false;
                        v1 = 1;
                    }
                    Object object0 = null;
                    if(v1 == 0) {
                        try {
                            gged_interceptors gged0 = Collection.-EL.stream(list0).anyMatch(new esjz()) ? eskb0.d.c(eskf.a) : ggna.a;
                        }
                        catch(fsim fsim1) {
                            a.ae(eskb.a.i(), "Error while reading ID transactions", fsim1);
                            gged0 = null;
                        }
                        try {
                            boolean z1 = false;
                            boolean z2 = false;
                            Object object1 = null;
                            for(Object object2: list0) {
                                eskg eskg0 = (eskg)object2;
                                eskf eskf0 = eskg0.c;
                                if(eskf0 != eskf.a) {
                                    if(eskf0 != eskf.b) {
                                        continue;
                                    }
                                    if(eskg0.h) {
                                        z2 = true;
                                        object1 = eskg0;
                                    }
                                    else {
                                        z2 = true;
                                    }
                                }
                                else if(eskg0.h) {
                                    z1 = true;
                                    object0 = eskg0;
                                }
                                else {
                                    z1 = true;
                                }
                            }
                            Level level1 = esgh.a();
                            eskb.a.g(level1).W("idCardsProvisioned: %s, qpCardsProvisioned: %s", z1, z2);
                            Level level2 = esgh.a();
                            eskb.a.g(level2).R("idDefaultFromGoogleDb: %s, qpDefaultFromGoogleDb: %s", object0, object1);
                            if(z1) {
                                if(gged0 == null) {
                                    try {
                                        gged1 = eskb0.d.c(eskf.a);
                                    label_94:
                                        if(gged1.isEmpty()) {
                                            goto label_132;
                                        }
                                        else {
                                            ecyb ecyb0 = hwwy.B() ? eskb0.d.a(eskf.a) : eskb0.c.a(eskf.a);
                                            if(((ProtoLiteMessage)ecyb.a).equals(ecyb0)) {
                                                goto label_128;
                                            }
                                            else {
                                                String s2 = ecyb0.b;
                                                dyct dyct0 = new dyct();
                                                String s3 = dyct0.e();
                                                dynw dynw0 = (dynw)gged1.get(0);
                                                String s4 = eskb.D(s2, dynw0);
                                                int v2 = 0;
                                                ggqk ggqk0 = gged1.E();
                                                while(ggqk0.hasNext()) {
                                                    Object object3 = ggqk0.next();
                                                    String s5 = eskb.D(s2, ((dynw)object3));
                                                    v2 |= s5.equals(s3);
                                                    hfwn hfwn0 = ((dynw)object3).f;
                                                    if(hfwn0 == null) {
                                                        hfwn0 = hfwn.a;
                                                    }
                                                    if(hfym.a(hfwn0, (dynw0.f == null ? hfwn.a : dynw0.f)) < 0 || ((dynw)object3).d <= dynw0.d) {
                                                        continue;
                                                    }
                                                    dynw0 = (dynw)object3;
                                                    s4 = s5;
                                                }
                                                if(!s4.equals(s3)) {
                                                    dyco dyco0 = new dyco(s4);
                                                    dyct0.a.b(dyco0, gmap.a);
                                                }
                                                goto label_124;
                                            }
                                        }
                                        goto label_211;
                                    }
                                    catch(fsim fsim3) {
                                        goto label_120;
                                    }
                                }
                                else {
                                    gged_interceptors gged1 = gged0;
                                }
                                goto label_94;
                            label_120:
                                a.ae(eskb.a.i(), "Error when reading default ID card", fsim3);
                                Map map0 = eskb.H(list0, eskb0.p());
                                eskb0.e.Y(3, 2);
                                goto label_130;
                            label_124:
                                if(v2 == 0) {
                                    map0 = eskb.H(list0, eskb0.p());
                                    eskb0.e.Y(3, 2);
                                    goto label_130;
                                label_128:
                                    map0 = eskb.H(list0, eskb0.p());
                                    eskb0.e.Y(3, 2);
                                label_130:
                                    Map map1 = map0;
                                    goto label_211;
                                }
                                goto label_132;
                            }
                            else {
                            label_132:
                                boolean z3 = !hwwy.B();
                                eskf eskf1 = eskf.b;
                                boolean z4 = eskb0.c.a(eskf1).e;
                                Level level3 = esgh.a();
                                eskb.a.g(level3).B("QP card is provisioned by Google %s", Boolean.valueOf(z4));
                                if(z2 && z4 && object1 == null) {
                                    etmv etmv1 = eskb0.e;
                                    ProtoLiteBuilder hftp2 = etmv1.al(gjsj.bU);
                                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gjsr.a).v_newBuilder();
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp3.b_message;
                                    ((gjsr)hftv1).c = 7;
                                    ((gjsr)hftv1).b |= 1;
                                    if(!hftv1.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv2 = hftp3.b_message;
                                    ((gjsr)hftv2).d = 6;
                                    ((gjsr)hftv2).b |= 2;
                                    if(!hftv2.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv3 = hftp3.b_message;
                                    ((gjsr)hftv3).g = 1;
                                    ((gjsr)hftv3).b |= 0x40;
                                    if(!hftv3.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv4 = hftp3.b_message;
                                    ((gjsr)hftv4).b |= 0x20;
                                    ((gjsr)hftv4).f = "";
                                    if(!hftv4.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv5 = hftp3.b_message;
                                    ((gjsr)hftv5).b |= 16;
                                    ((gjsr)hftv5).e = "";
                                    if(!hftv5.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gjsr)hftp3.b_message).h = 1;
                                    ((gjsr)hftp3.b_message).b |= 0x80;
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    gjzl gjzl1 = (gjzl)hftp2.b_message;
                                    gjsr gjsr0 = (gjsr)hftp3.N_build();
                                    gjsr0.getClass();
                                    gjzl1.M = gjsr0;
                                    gjzl1.c |= 0x400;
                                    etmv1.l(((gjzl)hftp2.N_build()));
                                    map1 = eskb.H(list0, eskb0.p());
                                    etmv1.Y(3, 5);
                                }
                                else {
                                    ggek ggek0 = new ggek();
                                    if(object0 != null) {
                                        ggek0.i(eskf.a, object0);
                                    }
                                    if(object1 != null && z4) {
                                        ggek0.i(eskf1, object1);
                                    }
                                    etmv etmv2 = eskb0.e;
                                    ProtoLiteBuilder hftp4 = etmv2.al(gjsj.cd);
                                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gjvu.a).v_newBuilder();
                                    if(!hftp5.b_message.isImmutable()) {
                                        hftp5.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv6 = hftp5.b_message;
                                    ((gjvu)hftv6).c = 2;
                                    ((gjvu)hftv6).b |= 1;
                                    if(!hftv6.isImmutable()) {
                                        hftp5.ensureMutable();
                                    }
                                    ((gjvu)hftp5.b_message).d = 1;
                                    ((gjvu)hftp5.b_message).b |= 2;
                                    if(!hftp4.b_message.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    gjzl gjzl2 = (gjzl)hftp4.b_message;
                                    gjvu gjvu0 = (gjvu)hftp5.N_build();
                                    gjvu0.getClass();
                                    gjzl2.U = gjvu0;
                                    gjzl2.c |= 0x100000;
                                    etmv2.l(((gjzl)hftp4.N_build()));
                                    map1 = ggek0.b();
                                }
                            }
                        }
                        catch(fsim fsim2) {
                            a.ae(eskb.a.i(), "Error while reading default cards", fsim2);
                            return 2;
                        }
                    label_211:
                        eskf[] arr_eskf = eskf.values();
                        z = true;
                        int v3 = 0;
                        while(v3 < arr_eskf.length) {
                            eskf eskf2 = arr_eskf[v3];
                            eskg eskg1 = (eskg)map1.get(eskf2);
                            if(eskg1 == null) {
                                Level level4 = esgh.a();
                                eskb.a.g(level4).R("No default card for %s, or doesn\'t belong to %s", eskf2, eskb0.b.b);
                            }
                            else {
                                try {
                                    if(eskf2 == eskf.a && gged0 != null) {
                                        gged_interceptors gged2 = eskb.j(gged0);
                                    }
                                    else {
                                        gged_interceptors gged3 = eskb0.d.c(eskf2);
                                        Level level5 = esgh.a();
                                        eskb.a.g(level5).H("Retrieved %d transactions for %s", gged3.size(), eskf2);
                                        gged2 = eskb.j(gged3);
                                    }
                                    ArrayList arrayList0 = new ArrayList();
                                    ggqk ggqk1 = gged2.E();
                                    while(ggqk1.hasNext()) {
                                        Object object4 = ggqk1.next();
                                        gusq gusq0 = (gusq)object4;
                                        if(eskf2 == eskf.b && gusp.b(gusq0.c) == 14) {
                                            continue;
                                        }
                                        arrayList0.add(gusq0);
                                    }
                                    if(!arrayList0.isEmpty()) {
                                        gusm gusm0 = (gusm)((ProtoLiteMessage)gusn.a).v_newBuilder();
                                        gtni gtni0 = eskf2.d;
                                        if(!gusm0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gusm0).ensureMutable();
                                        }
                                        gusn gusn0 = (gusn)gusm0.b_message;
                                        gusn0.d = gtni0.a();
                                        gusm0.a(arrayList0);
                                        gtfc gtfc0 = eskg1.a.d == null ? gtfc.a : eskg1.a.d;
                                        if(!gusm0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gusm0).ensureMutable();
                                        }
                                        gusn gusn1 = (gusn)gusm0.b_message;
                                        gtfc0.getClass();
                                        gusn1.c = gtfc0;
                                        gusn1.b |= 1;
                                        gusn gusn2 = (gusn)((ProtoLiteBuilder)gusm0).N_build();
                                        Level level6 = esgh.a();
                                        eskb.a.g(level6).B("Uploading SE transactions for %s", eskg1.a.G);
                                        try {
                                            etsy.b(eskb0.b, etti.N, ((MessageLite)gusn2), ((MessageLite)guso.a));
                                        }
                                        catch(IOException | ettj exception1) {
                                            a.e(eskb.a.h(), "Failed to upload SE transactions for %s", eskf2, exception1);
                                            goto label_261;
                                        }
                                    }
                                    goto label_262;
                                }
                                catch(fsim fsim4) {
                                    a.e(eskb.a.i(), "Error while reading transactions for %s", eskf2, fsim4);
                                }
                            label_261:
                                z = false;
                            }
                        label_262:
                            ++v3;
                        }
                    }
                    return z ? 0 : 2;
                }
            }
            return 0;
        }
        bboh0.g(esgh.a()).x("Skipping se transaction sync. Felica not enabled.");
        return 0;
    }

    @Override  // esoe
    public final void b(Context context0) {
        try {
            esgi esgi0 = esgj.g(context0, null);
            if(esgi0 != null) {
                eskb eskb0 = eskb.f(esgi0);
                if(eskb0.z() && eskb0.y()) {
                    SeTransactionSyncTaskOperation.c(context0, true);
                }
            }
        }
        catch(eshj | cjuh exception0) {
            a.ae(SeTransactionSyncTaskOperation.a.i(), "Error scheduling SE transaction sync", exception0);
        }
    }

    public static void c(Context context0, boolean z) {
        cljp cljp0 = cljp.a(context0);
        if(!z) {
            ((ggtj)SeTransactionSyncTaskOperation.a.h()).B("Cancelling task %s", "secard.transactions.sync");
            cljp0.d("secard.transactions.sync", "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService");
            return;
        }
        ((ggtj)SeTransactionSyncTaskOperation.a.h()).B("Scheduling task %s", "secard.transactions.sync");
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        clkq0.q("secard.transactions.sync");
        clkq0.a = hyra.a.b().b();
        clkq0.y(0, 1);
        clkq0.x(0, 1);
        clkq0.v(1);
        clkr clkr0 = clkq0.a();
        cljp.a(context0).f(clkr0);
    }
}

