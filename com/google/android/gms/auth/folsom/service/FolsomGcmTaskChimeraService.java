package com.google.android.gms.auth.folsom.service;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import acse;
import ajqx;
import ajvt;
import ajxa;
import ajxc;
import ajxe;
import ajxh;
import ajxj;
import akba;
import akbi;
import akbl;
import akbm;
import akbn;
import akbo;
import akdv;
import akdy;
import akdz;
import akea;
import akem;
import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import aqee;
import baun;
import bbdg;
import bbmq;
import bbmt;
import bboy;
import cchj;
import ccmq;
import cljp;
import clkm;
import clkn;
import clko;
import clkq;
import clks;
import clkz;
import cllb;
import cllc;
import cllr;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import gfsx;
import gggq;
import ggqk;
import ggtj;
import ghsy;
import ghta;
import ghtp;
import greh;
import grej;
import hfrj;
import hfsl;
import hfsm;
import hftc;
import hfuo;
import hfur;
import hfvu;
import hfwc;
import hfwr;
import hpuq;
import hput;
import hpvl;
import hpvv;
import hrwa;
import hrwd;
import hrwu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class FolsomGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final baun a;

    static {
        FolsomGcmTaskChimeraService.a = akea.a("RecoverableKeyStoreGmsGcmTaskChimeraService");
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        boolean z12;
        hfwc hfwc0;
        ProtoLiteMessage hftv2;
        hfsl hfsl0;
        hftc hftc0;
        ajxc ajxc7;
        ajxc ajxc6;
        boolean z11;
        boolean z10;
        ajxc ajxc5;
        boolean z9;
        boolean z8;
        boolean z7;
        boolean z6;
        String s8;
        Map.Entry map$Entry0;
        Iterator iterator5;
        ajxa ajxa0;
        ajxc ajxc4;
        boolean z5;
        boolean z4;
        Context context1;
        int v6;
        int v5;
        Account[] arr_account2;
        ajxc ajxc3;
        ajxc ajxc2;
        ajxc ajxc1;
        ajxc ajxc0;
        Iterator iterator4;
        akba akba1;
        ccmq.a().a(bbdg.mM);
        String s = cllr0.a;
        baun baun0 = FolsomGcmTaskChimeraService.a;
        baun0.d("onRunTask. tag: %s", new Object[]{s});
        String s1 = UUID.randomUUID().toString();
        if(!hpuq.c()) {
            baun0.f("The flag for the RecoverableKeyStoreGms module is false. Stop running task.", new Object[0]);
            return 2;
        }
        Context context0 = this.getApplicationContext();
        if(s.startsWith("com.google.android.gms.auth.folsom.SYNC_")) {
            Bundle bundle0 = cllr0.b;
            if(bundle0 == null) {
                baun0.f("Null extras is not allowed.", new Object[0]);
                return 2;
            }
            for(Object object0: bundle0.keySet()) {
                baun0.d("extras. key: %s, value: %s", new Object[]{((String)object0), bundle0.get(((String)object0))});
            }
            String s2 = bundle0.getString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
            if(s2 == null) {
                baun0.f("Cannot have null account name.", new Object[0]);
                return 2;
            }
            return FolsomGcmTaskChimeraService.i(context0, new Account(s2, "com.google"));
        }
        if(s.startsWith("com.google.android.gms.auth.folsom.CONSENT_SYNC_")) {
            Bundle bundle1 = cllr0.b;
            if(bundle1 == null) {
                baun0.f("Null extras is not allowed.", new Object[0]);
                return 2;
            }
            String s3 = bundle1.getString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
            if(s3 == null) {
                baun0.f("Cannot have null account name.", new Object[0]);
                return 2;
            }
            if(!bundle1.containsKey("com.google.android.gms.auth.folsom.EXTRA_CONSENT_VALUE")) {
                baun0.f("Missing consent value.", new Object[0]);
                return 2;
            }
            boolean z = bundle1.getBoolean("com.google.android.gms.auth.folsom.EXTRA_CONSENT_VALUE");
            Account account0 = new Account(s3, "com.google");
            akbm akbm0 = new akbm();
            akbm0.a = account0;
            akbm0.c = gfsx.m(Boolean.valueOf(z));
            akbm0.b = akbn.r;
            akbl akbl0 = new akbl(akbm0.a());
            synchronized(akbl.class) {
                try {
                    akbo akbo0 = akbl0.d;
                    gfsx gfsx0 = akbo0.d;
                    if(gfsx0.i()) {
                        try {
                            boolean z1 = ((Boolean)gfsx0.d()).booleanValue();
                            Account account1 = akbl0.e;
                            String s4 = account1.name;
                            ArrayList arrayList0 = new ArrayList();
                            Map map0 = ((akba)akba.b.b()).k(s4);
                            ggqk ggqk0 = akbl0.h.b.E();
                            while(ggqk0.hasNext()) {
                                Object object1 = ggqk0.next();
                                String s5 = (String)object1;
                                if(map0.containsKey(s5) && ((Boolean)map0.get(s5)).booleanValue() != z1) {
                                    arrayList0.add(s5);
                                }
                            }
                            if(arrayList0.isEmpty()) {
                                goto label_83;
                            }
                            else {
                                ArrayList arrayList1 = new ArrayList();
                                for(Object object2: arrayList0) {
                                    String s6 = (String)object2;
                                    akba akba0 = akbl0.c;
                                    List list0 = akba0.i(account1.name, s6);
                                    if(!list0.isEmpty() && ((ajxe)list0.get(0)).c != 0 && !akdy.c(((ajxe)gggq.p(list0)).d.toByteArray())) {
                                        akba0.o(account1.name, s6, z1);
                                        if(akbl.y(s6)) {
                                            arrayList1.add(s6);
                                        }
                                    }
                                }
                                akbl0.m();
                                for(Object object3: arrayList1) {
                                    akbl0.v(((String)object3));
                                }
                            }
                        }
                        catch(acse | IOException exception0) {
                            throw new akbi(13, exception0);
                        }
                        akbl.I(akbo0, 3);
                        return 0;
                        try {
                        label_83:
                            ((ggtj)akbl.b.h()).x("Skipping consent sync - all domains up to date");
                        }
                        catch(acse | IOException exception0) {
                            throw new akbi(13, exception0);
                        }
                    }
                    else {
                        ((ggtj)akbl.b.h()).x("Consent not specified in syncConsent");
                    }
                    akbl.I(akbo0, 3);
                }
                catch(akbi akbi0) {
                    akbl.I(akbl0.d, akbi0.a);
                }
            }
            return 0;
        }
        switch(s.hashCode()) {
            case 0x90D78F11: {
                if(s.equals("com.google.android.gms.auth.folsom.RETRY_KEY_SYNC_FOR_BACKUP_ACCOUNT")) {
                    if(!hput.a.c().H()) {
                        Bundle bundle2 = cllr0.b;
                        if(bundle2 == null) {
                            baun0.f("Null extras is not allowed.", new Object[0]);
                            return 2;
                        }
                        for(Object object4: bundle2.keySet()) {
                            Object[] arr_object = {((String)object4), bundle2.get(((String)object4))};
                            FolsomGcmTaskChimeraService.a.d("extras. key: %s, value: %s", arr_object);
                        }
                        return FolsomGcmTaskChimeraService.i(context0, new aqee(context0).a());
                    }
                    baun0.f("Ignore deprecated RETRY_KEY_SYNC_WITH_BACKUP_ACCOUNT task", new Object[0]);
                    return 2;
                }
                break;
            }
            case 0xA9528F60: {
                if(s.equals("com.google.android.gms.auth.folsom.RETRY_PRE_ENROLLMENT_FOR_ALL_ACCOUNTS")) {
                    baun0.d("Retrying pre_enrollment", new Object[0]);
                    return ajvt.c(false) ? 1 : 0;
                }
                break;
            }
            case 0xDE38CFA2: {
                return s.equals("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE") ? FolsomGcmTaskChimeraService.j(context0, 11, s1) : 0;
            }
            case 603771005: {
                return s.equals("com.google.android.gms.auth.folsom.RETRY_KEY_SYNC_FOR_CERTIFICATES") ? FolsomGcmTaskChimeraService.j(context0, 8, s1) : 0;
            }
            case 0x50ABD060: {
                if(s.equals("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED")) {
                    Account[] arr_account = cchj.b(context0).p("com.google");
                    for(int v1 = 0; v1 < arr_account.length; ++v1) {
                        FolsomGcmTaskChimeraService.g(context0, arr_account[v1].name);
                    }
                    double f = hpvv.a.g().b();
                    if((((double)new Random(System.currentTimeMillis() / 604800000L + bbmq.d(context0)).nextFloat()) < f)) {
                        Account[] arr_account1 = cchj.b(context0).p("com.google");
                        int v2 = arr_account1.length;
                        int v3 = 0;
                        while(v3 < v2) {
                            String s7 = arr_account1[v3].name;
                            boolean z2 = akdv.b;
                            KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService(KeyguardManager.class);
                            boolean z3 = keyguardManager0 != null && keyguardManager0.isDeviceSecure();
                            int v4 = bbmq.T() ^ 1;
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghta.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            ((ghta)hftv0).b |= 1;
                            ((ghta)hftv0).c = z2;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp0.b_message;
                            ((ghta)hftv1).b |= 2;
                            ((ghta)hftv1).d = z3;
                            if(!hftv1.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ghta ghta0 = (ghta)hftp0.b_message;
                            ghta0.b |= 4;
                            ghta0.e = v4;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                akba1 = (akba)akba.b.b();
                                iterator4 = akba1.h(s7).iterator();
                                ajxc0 = ajxc.a;
                                ajxc1 = ajxc0;
                                ajxc2 = ajxc1;
                                ajxc3 = ajxc2;
                            }
                            catch(IOException | acse unused_ex) {
                                arr_account2 = arr_account1;
                                v5 = v2;
                                v6 = v3;
                                context1 = context0;
                                z4 = z3;
                                z5 = z2;
                                goto label_363;
                            }
                        alab1:
                            while(true) {
                                try {
                                label_166:
                                    if(!iterator4.hasNext()) {
                                        goto label_192;
                                    }
                                    Object object5 = iterator4.next();
                                    ajxc4 = (ajxc)object5;
                                    arr_account2 = arr_account1;
                                    ajxa0 = ajxa.b(ajxc4.h);
                                }
                                catch(IOException | acse unused_ex) {
                                    arr_account2 = arr_account1;
                                    v5 = v2;
                                    goto label_359;
                                }
                                if(ajxa0 == null) {
                                    ajxa0 = ajxa.j;
                                }
                                try {
                                    v5 = v2;
                                    if(ajxa0.equals(ajxa.b)) {
                                        ajxc0 = ajxc4;
                                    }
                                    else if((ajxa.b(ajxc4.h) == null ? ajxa.j : ajxa.b(ajxc4.h)).equals(ajxa.c)) {
                                        ajxc2 = ajxc4;
                                    }
                                    else if((ajxa.b(ajxc4.h) == null ? ajxa.j : ajxa.b(ajxc4.h)).equals(ajxa.e)) {
                                        ajxc1 = ajxc4;
                                    }
                                    else if((ajxa.b(ajxc4.h) == null ? ajxa.j : ajxa.b(ajxc4.h)).equals(ajxa.d)) {
                                        ajxc3 = ajxc4;
                                    }
                                    arr_account1 = arr_account2;
                                    v2 = v5;
                                    goto label_166;
                                label_192:
                                    arr_account2 = arr_account1;
                                    v5 = v2;
                                    iterator5 = akba1.j(s7).entrySet().iterator();
                                    while(true) {
                                    label_195:
                                        if(!iterator5.hasNext()) {
                                            goto label_359;
                                        }
                                        Object object6 = iterator5.next();
                                        map$Entry0 = (Map.Entry)object6;
                                        s8 = (String)map$Entry0.getKey();
                                        if(s8.isEmpty() || akbl.A(s8)) {
                                            continue;
                                        }
                                        z6 = ((ajxj)map$Entry0.getValue()).c;
                                        s8.getClass();
                                        Integer integer0 = (Integer)ajxc0.f.get(s8);
                                        z7 = integer0 != null && ((int)integer0) != 0;
                                        s8.getClass();
                                        Integer integer1 = (Integer)ajxc2.f.get(s8);
                                        z8 = integer1 != null && ((int)integer1) != 0;
                                        s8.getClass();
                                        v6 = v3;
                                        break alab1;
                                    }
                                }
                                catch(IOException | acse unused_ex) {
                                    goto label_359;
                                }
                            }
                            try {
                                Integer integer2 = (Integer)ajxc3.f.get(s8);
                                z9 = integer2 != null && ((int)integer2) != 0;
                                s8.getClass();
                                Integer integer3 = (Integer)ajxc1.f.get(s8);
                                if(integer3 != null && ((int)integer3) != 0) {
                                    ajxc5 = ajxc1;
                                    z10 = true;
                                }
                                else {
                                    ajxc5 = ajxc1;
                                    z10 = false;
                                }
                                z11 = ajxc2.g != 0;
                                if(hpvl.e()) {
                                    ajxc6 = ajxc2;
                                    ajxc7 = ajxc3;
                                    if(akba1.G(s7, s8) == 4) {
                                        context1 = context0;
                                        z4 = z3;
                                        z5 = z2;
                                        z12 = true;
                                        goto label_286;
                                    }
                                    else {
                                        context1 = context0;
                                        z4 = z3;
                                        z5 = z2;
                                        goto label_285;
                                    }
                                    goto label_232;
                                }
                                else {
                                label_232:
                                    ajxc6 = ajxc2;
                                    ajxc7 = ajxc3;
                                    ByteString hfsf0 = akba1.f(s7, s8);
                                    hftc0 = hftc.a;
                                    hfsl0 = hfsf0.k();
                                    context1 = context0;
                                    goto label_238;
                                }
                                goto label_285;
                            }
                            catch(IOException | acse unused_ex) {
                                goto label_360;
                            }
                            try {
                            label_238:
                                hftv2 = ((ProtoLiteMessage)grej.a).x_newMutableInstance();
                                z4 = z3;
                            }
                            catch(IOException | acse unused_ex) {
                                goto label_361;
                            }
                            try {
                                z5 = z2;
                                hfwc0 = hfvu.a.c(hftv2);
                                z5 = z2;
                                goto label_253;
                            }
                            catch(hfur hfur0) {
                            }
                            catch(hfwr hfwr0) {
                                z5 = z2;
                                goto label_262;
                            }
                            catch(IOException iOException0) {
                                z5 = z2;
                                goto label_266;
                            }
                            catch(RuntimeException runtimeException0) {
                                goto label_272;
                            }
                            catch(acse unused_ex) {
                                goto label_362;
                            }
                            try {
                                try {
                                    z5 = z2;
                                    goto label_257;
                                }
                                catch(IOException unused_ex) {
                                    goto label_363;
                                }
                                try {
                                label_253:
                                    hfwc0.l(hftv2, hfsm.p(hfsl0), hftc0);
                                    hfwc0.g(hftv2);
                                    goto label_275;
                                }
                                catch(hfur hfur0) {
                                }
                                catch(hfwr hfwr0) {
                                    goto label_262;
                                }
                                catch(IOException iOException0) {
                                    goto label_266;
                                }
                                catch(RuntimeException runtimeException0) {
                                    goto label_272;
                                }
                                try {
                                label_257:
                                    if(hfur0.b) {
                                        hfur0 = new hfur(hfur0);
                                    }
                                    hfur0.a = hftv2;
                                    throw hfur0;
                                label_262:
                                    hfur hfur1 = hfwr0.a();
                                    hfur1.a = hftv2;
                                    throw hfur1;
                                label_266:
                                    if((iOException0.getCause() instanceof hfur)) {
                                        throw (hfur)iOException0.getCause();
                                    }
                                    hfur hfur2 = new hfur(iOException0);
                                    hfur2.a = hftv2;
                                    throw hfur2;
                                label_272:
                                    if((runtimeException0.getCause() instanceof hfur)) {
                                        throw (hfur)runtimeException0.getCause();
                                    }
                                    throw runtimeException0;
                                    try {
                                    label_275:
                                        hfsl0.z(0);
                                    }
                                    catch(hfur hfur3) {
                                        hfur3.a = hftv2;
                                        throw hfur3;
                                    }
                                    ProtoLiteMessage.P_makeImmutable(hftv2);
                                    ProtoLiteMessage.P_makeImmutable(hftv2);
                                    if(((grej)hftv2).c == 1 && ((greh)((grej)hftv2).d).b) {
                                        z12 = true;
                                        goto label_286;
                                    }
                                    goto label_285;
                                }
                                catch(IOException unused_ex) {
                                    goto label_363;
                                }
                            }
                            catch(acse unused_ex) {
                                goto label_363;
                            }
                            try {
                                z12 = true;
                                goto label_286;
                            label_285:
                                z12 = false;
                            }
                            catch(IOException | acse unused_ex) {
                                goto label_360;
                            }
                            try {
                            label_286:
                                hfuo hfuo0 = ((ajxj)map$Entry0.getValue()).d;
                                boolean z13 = !hfuo0.isEmpty() && akdy.c(((ajxe)gggq.p(hfuo0)).d.toByteArray());
                                int v7 = ajxh.a(akba1.E(s7, s8));
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghsy.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv3 = hftp1.b_message;
                                s8.getClass();
                                ((ghsy)hftv3).b |= 1;
                                ((ghsy)hftv3).c = s8;
                                if(!hftv3.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv4 = hftp1.b_message;
                                ((ghsy)hftv4).b |= 8;
                                ((ghsy)hftv4).f = z6;
                                if(!hftv4.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv5 = hftp1.b_message;
                                ((ghsy)hftv5).b |= 2;
                                ((ghsy)hftv5).d = z7;
                                if(!hftv5.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv6 = hftp1.b_message;
                                ((ghsy)hftv6).b |= 4;
                                ((ghsy)hftv6).e = z8;
                                if(!hftv6.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv7 = hftp1.b_message;
                                ((ghsy)hftv7).b |= 0x80;
                                ((ghsy)hftv7).j = z9;
                                if(!hftv7.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv8 = hftp1.b_message;
                                ((ghsy)hftv8).b |= 0x100;
                                ((ghsy)hftv8).k = z10;
                                if(!hftv8.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ghsy ghsy0 = (ghsy)hftp1.b_message;
                                ghsy0.b |= 0x400;
                                ghsy0.m = z11;
                                int v8 = hfuo0.size();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv9 = hftp1.b_message;
                                ((ghsy)hftv9).b |= 0x40;
                                ((ghsy)hftv9).i = v8;
                                if(!hftv9.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv10 = hftp1.b_message;
                                ((ghsy)hftv10).b |= 16;
                                ((ghsy)hftv10).g = z13;
                                if(!hftv10.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv11 = hftp1.b_message;
                                ((ghsy)hftv11).b |= 0x20;
                                ((ghsy)hftv11).h = z12;
                                if(!hftv11.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ghsy ghsy1 = (ghsy)hftp1.b_message;
                                ghsy1.b |= 0x200;
                                ghsy1.l = v7;
                                arrayList2.add(((ghsy)hftp1.N_build()));
                                iterator5 = iterator5;
                                s7 = s7;
                                v3 = v6;
                                ajxc0 = ajxc0;
                                ajxc1 = ajxc5;
                                ajxc2 = ajxc6;
                                ajxc3 = ajxc7;
                                context0 = context1;
                                z3 = z4;
                                z2 = z5;
                                goto label_195;
                            label_359:
                                v6 = v3;
                            label_360:
                                context1 = context0;
                            label_361:
                                z4 = z3;
                            label_362:
                                z5 = z2;
                            }
                            catch(IOException | acse unused_ex) {
                            }
                        label_363:
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ghta ghta1 = (ghta)hftp0.b_message;
                            hfuo hfuo1 = ghta1.g;
                            if(!hfuo1.c()) {
                                ghta1.g = ProtoLiteMessage.E(hfuo1);
                            }
                            hfrj.E(arrayList2, ghta1.g);
                            int v9 = akem.h(z5, z4, akea.b("RecoveryControllerProxy"));
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((ghta)hftp0.b_message).f = v9 - 1;
                            ((ghta)hftp0.b_message).b |= 8;
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghtp.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ProtoLiteMessage hftv12 = hftp2.b_message;
                            ((ghtp)hftv12).c = 6;
                            ((ghtp)hftv12).b |= 1;
                            if(!hftv12.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ((ghtp)hftp2.b_message).i = 9;
                            ((ghtp)hftp2.b_message).b |= 0x100;
                            ghta ghta2 = (ghta)hftp0.N_build();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ghtp ghtp0 = (ghtp)hftp2.b_message;
                            ghta2.getClass();
                            ghtp0.m = ghta2;
                            ghtp0.b |= 0x1000;
                            akdz.n(hftp2);
                            v3 = v6 + 1;
                            arr_account1 = arr_account2;
                            v2 = v5;
                            context0 = context1;
                        }
                    }
                    return 0;
                }
                break;
            }
            default: {
                return 0;
            }
        }
        return 0;
    }

    public static cllc d() {
        return cllb.a(0, ((int)hput.a.c().n()), ((int)hput.a.c().o()));
    }

    public static void e(Context context0) {
        FolsomGcmTaskChimeraService.a.d("initializePeriodicCertUpdate", new Object[0]);
        if(hrwa.a.b().p()) {
            cljp cljp0 = cljp.a(context0);
            clks clks0 = new clks();
            clks0.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
            clks0.q("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE");
            clks0.v(2);
            clks0.l(true);
            clks0.a = clkz.e(((int)hput.a.c().f()));
            cljp0.f(clks0.a());
            return;
        }
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        clkq0.t("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE");
        clkq0.y(0, 1);
        clkq0.x(0, 1);
        clkq0.p = true;
        clkq0.v(2);
        clkq0.t = cllc.a;
        long v = hput.a.c().h();
        long v1 = hput.a.c().g();
        if(hrwu.d()) {
            clkq0.j(clkm.a(v));
        }
        else {
            clkq0.a = v;
            clkq0.b = v1;
        }
        cljp.a(context0).f(clkq0.a());
    }

    public static void f(Context context0) {
        FolsomGcmTaskChimeraService.a.d("initializePeriodicKeySyncCheck", new Object[0]);
        if(hrwd.k()) {
            cljp cljp0 = cljp.a(context0);
            clks clks0 = new clks();
            clks0.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
            clks0.q("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED");
            clks0.v(2);
            clks0.p = true;
            clks0.l(true);
            clks0.a = clkz.j;
            cljp0.f(clks0.a());
            return;
        }
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        clkq0.t("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED");
        clkq0.g(0);
        clkq0.p = true;
        clkq0.v(2);
        clkq0.t = FolsomGcmTaskChimeraService.d();
        long v = hput.a.c().j();
        long v1 = hput.a.c().i();
        if(hrwu.d()) {
            clkq0.j(clkm.a(v));
        }
        else {
            clkq0.a = v;
            clkq0.b = v1;
        }
        cljp.a(context0).f(clkq0.a());
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void fW() {
        FolsomGcmTaskChimeraService.a.d("onInitializeTasks", new Object[0]);
        Context context0 = this.getBaseContext();
        FolsomGcmTaskChimeraService.f(context0);
        if(akdv.b) {
            FolsomGcmTaskChimeraService.e(context0);
        }
    }

    public static void g(Context context0, String s) {
        FolsomGcmTaskChimeraService.h(context0, s, 1L, 2L);
    }

    public static void h(Context context0, String s, long v, long v1) {
        FolsomGcmTaskChimeraService.a.d("scheduleKeySync to happen in %d~%d s.", new Object[]{v, v1});
        Bundle bundle0 = new Bundle();
        bundle0.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", s);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        String s1 = "com.google.android.gms.auth.folsom.SYNC_" + bboy.c(bbmq.aa(s, "SHA-256"));
        if(s1.length() > 90) {
            s1 = s1.substring(0, 90);
        }
        clkn0.t(s1);
        clkn0.p = true;
        clkn0.e(v, v1);
        clkn0.t = FolsomGcmTaskChimeraService.d();
        clkn0.g(0);
        clkn0.v(2);
        clkn0.u = bundle0;
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }

    private static int i(Context context0, Account account0) {
        if(account0 == null) {
            KeySyncIntentOperation.a.f("Cannot sync keys. No backup account set.", new Object[0]);
            return 0;
        }
        if(!bbmt.e(cchj.b(context0).o(), account0)) {
            KeySyncIntentOperation.a.d("Cannot sync keys for removed account", new Object[0]);
            return 0;
        }
        return KeySyncIntentOperation.a(account0, 9) == 2 ? 0 : 1;
    }

    private static int j(Context context0, int v, String s) {
        String s1;
        if(!akdv.b) {
            FolsomGcmTaskChimeraService.a.d("Cert update is running on pre P device", new Object[0]);
            return 0;
        }
        int v1 = new ajqx(s).b(context0, false, v);
        baun baun0 = FolsomGcmTaskChimeraService.a;
        if(v1 == 1) {
            s1 = "CERT_DOWNLOAD_FAILED";
        }
        else {
            switch(v1) {
                case 2: {
                    s1 = "SIG_DOWNLOAD_FAILED";
                    break;
                }
                case 3: {
                    s1 = "INIT_RECOVERY_SERVICE_FAILED";
                    break;
                }
                default: {
                    s1 = "INIT_RECOVERY_SERVICE_SUCCESS";
                }
            }
        }
        baun0.h("Cert download and update status=[%s]", new Object[]{s1});
        return v1 - 1 == 3 ? 0 : 1;
    }
}

