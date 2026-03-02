package com.google.android.gms.constellation;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import acoe;
import acse;
import acso;
import actm;
import actv;
import adfy;
import adgh;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.util.Pair;
import azqi;
import azqj;
import bakc;
import baun;
import bbdg;
import bbwg;
import bbwq;
import bbxx;
import bbye;
import bbyu;
import bbzc;
import bbzr;
import bcah;
import bcai;
import bcaj;
import bcak;
import bcal;
import bcam;
import bcav;
import bcba;
import bcbc;
import bcbf;
import bcbh;
import bcbi;
import bcbk;
import bcbn;
import bcbq;
import bcbs;
import bcpt;
import bcpv;
import bcqa;
import bcqd;
import bcqe;
import bcql;
import bcqx;
import bcqy;
import bcqz;
import bcrc;
import bcrd;
import bcrg;
import bcrh;
import bcrj;
import bcrk;
import bcrr;
import bcsb;
import bcse;
import bzoe;
import cclw;
import ccmp;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.constellation.storage.gaialifecycle.ConstellationRoomDatabase;
import evrg;
import gged_interceptors;
import ggna;
import ggqk;
import gmet;
import gmeu;
import gmev;
import gmew;
import gmfx;
import gmfz;
import gmgj;
import gmgl;
import gmgn;
import gmgp;
import hfuo;
import hfvv;
import hfwn;
import hfyg;
import hobg;
import hobj;
import hobl;
import hobm;
import hobn;
import hobx;
import hoda;
import hodo;
import hodq;
import hoea;
import hoef;
import hoeg;
import hoel;
import hoeo;
import hoer;
import hoez;
import hofa;
import hofb;
import hofc;
import hofd;
import hofe;
import hofh;
import hofi;
import hofo;
import hofp;
import hofq;
import hofr;
import hofs;
import hoft;
import hofu;
import hogd;
import hogf;
import hogi;
import hrcv;
import hrdy;
import hreb;
import hrfc;
import hrfi;
import hrfs;
import hrfv;
import ibnq;
import ibps;
import ibuq;
import iccl;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class EventManager extends IntentOperation {
    private static final baun a;
    private boolean b;
    private Exception c;
    private bcbq d;
    private bcah e;
    private bcai f;

    static {
        EventManager.a = bcrh.a("event_manager");
    }

    public EventManager() {
        this.b = false;
    }

    private final String a() {
        try {
            String s = bzoe.h(this.getApplicationContext()).c(hrfc.d(), "GCM");
            SharedPreferences.Editor sharedPreferences$Editor0 = ((bcbs)this.d).c.edit();
            sharedPreferences$Editor0.putString("gcm_token", s);
            sharedPreferences$Editor0.apply();
            return s;
        }
        catch(IOException iOException0) {
            EventManager.a.g("Couldn\'t get GCM token", iOException0, new Object[0]);
            this.c = iOException0;
            this.b = true;
            return null;
        }
    }

    private final String b(Intent intent0, bcrd bcrd0) {
        String s1;
        String s = intent0.getAction();
        boolean z = intent0.getBooleanExtra("eventmanager.force_refresh", false);
        try {
            s1 = intent0.getStringExtra("iid_token");
        }
        catch(BadParcelableException badParcelableException0) {
            EventManager.a.g("BadparcelableException for iid token key: ", badParcelableException0, new Object[0]);
            s1 = null;
        }
        if(intent0.getBooleanExtra("eventmanager.generate_iid_token", false) || EventManager.g(s)) {
            if(TextUtils.isEmpty(s1)) {
                if(z) {
                    s1 = this.a();
                }
                else {
                    String s2 = this.a();
                    s1 = TextUtils.isEmpty(s2) ? ((bcbs)this.d).c.getString("gcm_token", null) : s2;
                }
            }
            bcrd0.f = s1;
        }
        return s1;
    }

    private final ArrayList c(Intent intent0, bcrd bcrd0) {
        Iterator iterator5;
        gmev gmev1;
        List list2;
        Object object3;
        int v;
        Iterator iterator1;
        gmfx gmfx1;
        gmeu gmeu0;
        gmev gmev0;
        bcai bcai0;
        bcqa bcqa0;
        baun baun0;
        String s1;
        Account account0;
        gged_interceptors gged0;
        List list0;
        HashMap hashMap0;
        Context context0;
        String s = intent0.getAction();
        boolean z = intent0.getBooleanExtra("eventmanager.generate_gaia_tokens", false);
        ArrayList arrayList0 = new ArrayList();
        try {
            arrayList0 = intent0.getStringArrayListExtra("gaia_tokens");
        }
        catch(BadParcelableException badParcelableException0) {
            EventManager.a.g("BadparcelableException for gaia tokens key: ", badParcelableException0, new Object[0]);
        }
        if(z || EventManager.g(s)) {
            if(arrayList0 == null || arrayList0.isEmpty()) {
                ArrayList arrayList1 = new ArrayList();
                if(hreb.d()) {
                    this.f = new bcai(bcqx.a(this.getBaseContext()));
                    try {
                        try {
                            bcqe.h();
                            context0 = this.getBaseContext();
                            hashMap0 = new HashMap();
                            new ArrayList();
                        }
                        catch(RemoteException | azqj | azqi exception0) {
                            goto label_349;
                        }
                        try {
                            if(adgh.e(context0)) {
                                if(bcqe.b == null) {
                                    bcqe.b = new adfy(context0.getApplicationContext());
                                }
                                try {
                                    actv actv0 = bcqe.b;
                                    actm actm0 = GetAccountsRequest.a();
                                    actm0.b("com.google");
                                    list0 = ((GetAccountsResponse)evrg.n(actv0.c(actm0.a()))).a;
                                }
                                catch(ExecutionException executionException0) {
                                    bcqe.c(context0, bcrd0, gmfz.H, executionException0);
                                    Throwable throwable0 = executionException0.getCause();
                                    if(throwable0 == null) {
                                        throw new RemoteException("Cause cannot be null");
                                    }
                                    Objects.requireNonNull(throwable0);
                                    if((throwable0 instanceof RemoteException)) {
                                        throw (RemoteException)throwable0;
                                    }
                                    if((throwable0 instanceof azqj)) {
                                        throw (azqj)throwable0;
                                    }
                                    if((throwable0 instanceof azqi)) {
                                        throw (azqi)throwable0;
                                    }
                                    bcqe.a.m("Unexpected exception while fetching accounts".concat(throwable0.toString()), new Object[0]);
                                    throw new RemoteException("Unexpected exception: ".concat(executionException0.getMessage()));
                                }
                                catch(InterruptedException interruptedException0) {
                                    bcqe.c(context0, bcrd0, gmfz.H, interruptedException0);
                                    Thread.currentThread().interrupt();
                                    bcqe.a.m("Interrupted while fetching accounts".concat(String.valueOf(interruptedException0.getCause())), new Object[0]);
                                    throw new RemoteException("Interrupted: ".concat(interruptedException0.getMessage()));
                                }
                                gged0 = gged_interceptors.k(adgh.i(list0));
                            }
                            else {
                                gged0 = gged_interceptors.k(acso.m(context0));
                            }
                            if(gged0.isEmpty()) {
                                goto label_85;
                            }
                            else {
                                ggqk ggqk0 = gged0.E();
                                while(true) {
                                label_48:
                                    if(!ggqk0.hasNext()) {
                                        goto label_80;
                                    }
                                    Object object0 = ggqk0.next();
                                    account0 = (Account)object0;
                                    goto label_51;
                                }
                            }
                            goto label_91;
                        }
                        catch(azqj | azqi | RemoteException exception1) {
                            goto label_88;
                        }
                    }
                    catch(bcqd exception0) {
                        goto label_349;
                    }
                    try {
                    label_51:
                        s1 = null;
                        s1 = acso.e(context0, account0.name);
                    }
                    catch(UserRecoverableAuthException userRecoverableAuthException0) {
                        goto label_62;
                    }
                    catch(IOException | acse exception2) {
                        goto label_67;
                    }
                    catch(Throwable throwable1) {
                        goto label_72;
                    }
                    if(s1 == null) {
                        try {
                            baun0 = bcqe.a;
                            try {
                                baun0.m("getAllDeviceGaiaIdsAndTokenDetails: Could not retrieve Gaia IDfor account: " + account0.name, new Object[0]);
                                bcqx.a(context0).u(bcrd0, gmfz.P, "getAllDeviceGaiaIdsAndTokenDetails: Could not retrieve Gaia ID");
                            }
                            catch(UserRecoverableAuthException userRecoverableAuthException0) {
                                goto label_62;
                            }
                            catch(IOException | acse exception2) {
                                goto label_67;
                            }
                        }
                        catch(Throwable throwable1) {
                            goto label_72;
                        }
                        try {
                            baun0.m("Could not process account due to missing Gaia ID: " + account0.name, new Object[0]);
                        }
                        catch(azqj | azqi | RemoteException exception1) {
                            goto label_88;
                        }
                        catch(bcqd exception0) {
                            goto label_349;
                        }
                        goto label_48;
                    }
                    else {
                        try {
                            try {
                                bcqa0 = bcqe.d(context0, account0, s1);
                                goto label_78;
                            }
                            catch(UserRecoverableAuthException userRecoverableAuthException0) {
                            }
                            catch(IOException | acse exception2) {
                                goto label_67;
                            }
                        label_62:
                            bcqa0 = bcqe.b(context0, bcrd0, s1, account0, userRecoverableAuthException0);
                        }
                        catch(Throwable throwable1) {
                            goto label_72;
                        }
                        try {
                            if(s1 == null) {
                                bcqe.a.m("Could not process account due to missing Gaia ID: " + account0.name, new Object[0]);
                                goto label_48;
                            }
                            goto label_78;
                        }
                        catch(azqj | azqi | RemoteException exception1) {
                            goto label_88;
                        }
                        catch(bcqd exception0) {
                            goto label_349;
                        }
                        try {
                        label_67:
                            bcqa0 = bcqe.a(context0, bcrd0, s1, account0, exception2);
                        }
                        catch(Throwable throwable1) {
                            goto label_72;
                        }
                        try {
                            if(s1 == null) {
                                bcqe.a.m("Could not process account due to missing Gaia ID: " + account0.name, new Object[0]);
                                goto label_48;
                            label_72:
                                if(s1 == null) {
                                    bcqe.a.m("Could not process account due to missing Gaia ID: " + account0.name, new Object[0]);
                                }
                                else {
                                    bcqe.a.m("tokenDetails was null after exception handling for Gaia ID: " + s1, new Object[0]);
                                    hashMap0.put(s1, new bcqa(null, account0.name));
                                }
                                throw throwable1;
                            }
                        label_78:
                            hashMap0.put(s1, bcqa0);
                            goto label_48;
                        label_80:
                            bcqe.a.d(String.format("Got tokens for %s accounts", hashMap0.size()), new Object[0]);
                            goto label_81;
                        }
                        catch(azqj | azqi | RemoteException exception1) {
                            goto label_88;
                        }
                        catch(bcqd exception0) {
                            goto label_349;
                        }
                    }
                    goto label_80;
                label_81:
                    if(hashMap0.isEmpty()) {
                        try {
                            try {
                                bcqd bcqd0 = new bcqd();
                                bcqe.c(context0, bcrd0, gmfz.I, bcqd0);
                                throw bcqd0;
                            label_85:
                                bcqe.a.m("No accounts found on device", new Object[0]);
                            }
                            catch(azqj | azqi | RemoteException exception1) {
                                try {
                                label_88:
                                    bcqx.a(context0).e(bcrd0, gmfz.G, exception1);
                                    bcqe.a.m("Error fetching accounts. Detail: ".concat(String.valueOf(exception1.getCause())), new Object[0]);
                                    throw exception1;
                                label_91:
                                    for(Object object1: hashMap0.entrySet()) {
                                        String s2 = (String)((Map.Entry)object1).getKey();
                                        bcqa bcqa1 = (bcqa)((Map.Entry)object1).getValue();
                                        if(bcqa1 != null) {
                                            String s3 = bcqa1.a;
                                            if(s3 != null) {
                                                EventManager.a.d(a.l(s3, s2, "gaiaId:", "has token:"), new Object[0]);
                                                arrayList1.add(s3);
                                            }
                                        }
                                    }
                                    bcam bcam0 = this.e.b(this.getApplicationContext(), bcrd0, hashMap0);
                                    bcai0 = this.f;
                                    ibuq.f(bcam0, "syncResult");
                                    gmev0 = gmev.a;
                                    gmeu0 = (gmeu)((ProtoLiteMessage)gmev0).v_newBuilder();
                                    ibuq.e(gmeu0, "newBuilder(...)");
                                    if((bcam0 instanceof bcal)) {
                                        gmgl gmgl1 = ((bcal)bcam0).a;
                                        if(!gmeu0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gmeu0).ensureMutable();
                                        }
                                        gmev gmev6 = (gmev)gmeu0.b_message;
                                        gmev6.c = gmgl1.a();
                                        gmev6.b |= 1;
                                        gmgp gmgp1 = gmgp.b;
                                        if(!gmeu0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gmeu0).ensureMutable();
                                        }
                                        gmev gmev7 = (gmev)gmeu0.b_message;
                                        gmev7.d = gmgp1.a();
                                        gmev7.b |= 2;
                                        gmfx1 = gmfx.a;
                                        if(!gmeu0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gmeu0).ensureMutable();
                                        }
                                        gmev gmev8 = (gmev)gmeu0.b_message;
                                        gmev8.e = gmfx1.a();
                                        gmev8.b |= 4;
                                        iterator1 = ((bcal)bcam0).b.iterator();
                                        while(true) {
                                        label_159:
                                            if(iterator1.hasNext()) {
                                                goto label_290;
                                            }
                                            gmev1 = gmev0;
                                        label_161:
                                            ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)gmeu0).N_build();
                                            ibuq.e(hftv0, "build(...)");
                                            java.util.Objects.toString(((gmev)hftv0));
                                            bcai0.b.d("LOGGING PAYLOAD (SyncGaias): ".concat(String.valueOf(((gmev)hftv0))), new Object[0]);
                                            bcai0.a(bcrd0, ((gmev)hftv0));
                                            List list1 = ggna.a;
                                            if((bcam0 instanceof bcal)) {
                                                list1 = (List)((bcal)bcam0).c;
                                                EventManager.a.d("Successfully synced gaias", new Object[0]);
                                            }
                                            else if((bcam0 instanceof bcak)) {
                                                EventManager.a.f(a.Y(((bcak)bcam0).e, ((bcak)bcam0).d, "Failed to sync gaias: ", " "), new Object[0]);
                                            }
                                            ibuq.f(this.getApplicationContext(), "context");
                                            ibuq.f(list1, "lifecycleStates");
                                            ArrayList arrayList2 = new ArrayList();
                                            for(Object object2: list1) {
                                                bcav bcav0 = (bcav)object2;
                                                bcbc bcbc0 = bcav0.e;
                                                Long long0 = bcav0.d;
                                                if((bcbc0 == bcbc.c || bcbc0 == bcbc.d) && long0 != null) {
                                                    switch(bcbc0.ordinal()) {
                                                        case 1: {
                                                            v = bcav0.c != null && bcav0.c.length() != 0 ? 1 : 2;
                                                            goto label_192;
                                                        }
                                                        case 2: {
                                                            goto label_191;
                                                        }
                                                    }
                                                    v = 0;
                                                    goto label_192;
                                                label_191:
                                                    v = 3;
                                                label_192:
                                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hoda.a).v_newBuilder();
                                                    String s5 = bcav0.b;
                                                    if(!hftp0.b_message.isImmutable()) {
                                                        hftp0.ensureMutable();
                                                    }
                                                    hoda hoda0 = (hoda)hftp0.b_message;
                                                    s5.getClass();
                                                    hoda0.c = s5;
                                                    hfwn hfwn0 = bcql.c(long0.longValue());
                                                    if(!hftp0.b_message.isImmutable()) {
                                                        hftp0.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv1 = hftp0.b_message;
                                                    hfwn0.getClass();
                                                    ((hoda)hftv1).e = hfwn0;
                                                    ((hoda)hftv1).b |= 1;
                                                    if(!hftv1.isImmutable()) {
                                                        hftp0.ensureMutable();
                                                    }
                                                    ((hoda)hftp0.b_message).d = v;
                                                    object3 = (hoda)hftp0.N_build();
                                                }
                                                else {
                                                    object3 = null;
                                                }
                                                if(object3 != null) {
                                                    arrayList2.add(object3);
                                                }
                                            }
                                            bcal bcal0 = new bcal(gmgl.c, ibps.a, arrayList2);
                                            list2 = (List)bcal0.c;
                                            EventManager.a.d("Successfully generated gaia signals", new Object[0]);
                                            bcai bcai1 = this.f;
                                            gmeu gmeu1 = (gmeu)((ProtoLiteMessage)gmev1).v_newBuilder();
                                            ibuq.e(gmeu1, "newBuilder(...)");
                                            gmgl gmgl2 = bcal0.a;
                                            if(!gmeu1.b_message.isImmutable()) {
                                                ((ProtoLiteBuilder)gmeu1).ensureMutable();
                                            }
                                            gmev gmev9 = (gmev)gmeu1.b_message;
                                            gmev9.c = gmgl2.a();
                                            gmev9.b |= 1;
                                            gmgp gmgp2 = gmgp.b;
                                            if(!gmeu1.b_message.isImmutable()) {
                                                ((ProtoLiteBuilder)gmeu1).ensureMutable();
                                            }
                                            gmev gmev10 = (gmev)gmeu1.b_message;
                                            gmev10.d = gmgp2.a();
                                            gmev10.b |= 2;
                                            gmfx gmfx2 = gmfx.a;
                                            if(!gmeu1.b_message.isImmutable()) {
                                                ((ProtoLiteBuilder)gmeu1).ensureMutable();
                                            }
                                            gmev gmev11 = (gmev)gmeu1.b_message;
                                            gmev11.e = gmfx2.a();
                                            gmev11.b |= 4;
                                            for(Object object4: list2) {
                                                hoda hoda1 = (hoda)object4;
                                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmew.a).v_newBuilder();
                                                ibuq.e(hftp1, "newBuilder(...)");
                                                String s6 = hoda1.c;
                                                if(!hftp1.b_message.isImmutable()) {
                                                    hftp1.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv2 = hftp1.b_message;
                                                s6.getClass();
                                                ((gmew)hftv2).b |= 1;
                                                ((gmew)hftv2).c = s6;
                                                int v1 = gmgn.a(hoda1.d);
                                                if(v1 == 0) {
                                                    v1 = 6;
                                                }
                                                if(!hftv2.isImmutable()) {
                                                    hftp1.ensureMutable();
                                                }
                                                gmew gmew0 = (gmew)hftp1.b_message;
                                                if(v1 == 1) {
                                                    throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                                                }
                                                gmew0.d = v1 - 2;
                                                gmew0.b |= 2;
                                                if((hoda1.b & 1) != 0) {
                                                    hfwn hfwn1 = hoda1.e;
                                                    if(hfwn1 == null) {
                                                        hfwn1 = hfwn.a;
                                                    }
                                                    if(!hftp1.b_message.isImmutable()) {
                                                        hftp1.ensureMutable();
                                                    }
                                                    gmew gmew1 = (gmew)hftp1.b_message;
                                                    hfwn1.getClass();
                                                    gmew1.e = hfwn1;
                                                    gmew1.b |= 4;
                                                }
                                                gmew gmew2 = (gmew)hftp1.N_build();
                                                if(!gmeu1.b_message.isImmutable()) {
                                                    ((ProtoLiteBuilder)gmeu1).ensureMutable();
                                                }
                                                gmev gmev12 = (gmev)gmeu1.b_message;
                                                gmew2.getClass();
                                                hfuo hfuo0 = gmev12.h;
                                                if(!hfuo0.c()) {
                                                    gmev12.h = ProtoLiteMessage.E(hfuo0);
                                                }
                                                gmev12.h.add(gmew2);
                                            }
                                            ProtoLiteMessage hftv3 = ((ProtoLiteBuilder)gmeu1).N_build();
                                            ibuq.e(hftv3, "build(...)");
                                            java.util.Objects.toString(((gmev)hftv3));
                                            bcai1.b.d("LOGGING PAYLOAD (GenerateSignals): ".concat(String.valueOf(((gmev)hftv3))), new Object[0]);
                                            bcai1.a(bcrd0, ((gmev)hftv3));
                                            goto label_287;
                                        }
                                    }
                                    else {
                                        gmev1 = gmev0;
                                        if(!(bcam0 instanceof bcak)) {
                                            throw new ibnq();
                                        }
                                        gmgl gmgl0 = ((bcak)bcam0).a;
                                        if(!gmeu0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gmeu0).ensureMutable();
                                        }
                                        gmev gmev2 = (gmev)gmeu0.b_message;
                                        gmev2.c = gmgl0.a();
                                        gmev2.b |= 1;
                                        gmgp gmgp0 = ((bcak)bcam0).b;
                                        if(!gmeu0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gmeu0).ensureMutable();
                                        }
                                        gmev gmev3 = (gmev)gmeu0.b_message;
                                        gmev3.d = gmgp0.a();
                                        gmev3.b |= 2;
                                        gmfx gmfx0 = ((bcak)bcam0).c;
                                        if(gmfx0 == null) {
                                            gmfx0 = bcai0.a;
                                        }
                                        if(!gmeu0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gmeu0).ensureMutable();
                                        }
                                        gmev gmev4 = (gmev)gmeu0.b_message;
                                        gmev4.e = gmfx0.a();
                                        gmev4.b |= 4;
                                        String s4 = ((bcak)bcam0).d;
                                        if(s4 != null) {
                                            if(!gmeu0.b_message.isImmutable()) {
                                                ((ProtoLiteBuilder)gmeu0).ensureMutable();
                                            }
                                            gmev gmev5 = (gmev)gmeu0.b_message;
                                            gmev5.b |= 8;
                                            gmev5.f = s4;
                                        }
                                        goto label_161;
                                    }
                                    arrayList0 = arrayList1;
                                    bcrd0.g = arrayList0;
                                    return arrayList0;
                                }
                                catch(RemoteException | azqj | azqi exception0) {
                                    goto label_349;
                                }
                            }
                        }
                        catch(bcqd exception0) {
                            goto label_349;
                        }
                    }
                    goto label_91;
                label_287:
                    if(!list2.isEmpty()) {
                        try {
                            bcrd0.i = list2;
                            arrayList0 = arrayList1;
                            bcrd0.g = arrayList0;
                            return arrayList0;
                        label_290:
                            Object object5 = iterator1.next();
                            bcaj bcaj0 = (bcaj)object5;
                            List list3 = bcaj0.b;
                            if(list3 == null) {
                                goto label_159;
                            }
                            Iterator iterator4 = list3.iterator();
                            while(true) {
                                if(!iterator4.hasNext()) {
                                    goto label_159;
                                }
                                Object object6 = iterator4.next();
                                bcbi bcbi0 = (bcbi)object6;
                                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gmet.a).v_newBuilder();
                                ibuq.e(hftp2, "newBuilder(...)");
                                gmgj gmgj0 = bcaj0.a;
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                gmet gmet0 = (gmet)hftp2.b_message;
                                gmet0.c = gmgj0.a();
                                gmet0.b |= 1;
                                if((bcbi0 instanceof bcbh)) {
                                    int v3 = bcai.d(((bcbh)bcbi0).a);
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv5 = hftp2.b_message;
                                    ((gmet)hftv5).d = v3 - 2;
                                    ((gmet)hftv5).b |= 2;
                                    if(!hftv5.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    gmet gmet3 = (gmet)hftp2.b_message;
                                    gmet3.e = gmfx1.a();
                                    gmet3.b |= 4;
                                    iterator5 = iterator1;
                                }
                                else {
                                    if(!(bcbi0 instanceof bcbf)) {
                                        throw new ibnq();
                                    }
                                    int v2 = bcai.d(((bcbf)bcbi0).a);
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv4 = hftp2.b_message;
                                    iterator5 = iterator1;
                                    ((gmet)hftv4).d = v2 - 2;
                                    ((gmet)hftv4).b |= 2;
                                    gmfx gmfx3 = ((bcbf)bcbi0).b;
                                    if(gmfx3 == null) {
                                        gmfx3 = bcai0.a;
                                    }
                                    if(!hftv4.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    gmet gmet1 = (gmet)hftp2.b_message;
                                    gmet1.e = gmfx3.a();
                                    gmet1.b |= 4;
                                    String s7 = ((bcbf)bcbi0).d;
                                    if(s7 != null) {
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        gmet gmet2 = (gmet)hftp2.b_message;
                                        gmet2.b |= 8;
                                        gmet2.f = s7;
                                    }
                                }
                                gmeu0.a(((gmet)hftp2.N_build()));
                                gmev0 = gmev0;
                                iterator1 = iterator5;
                            }
                        }
                        catch(RemoteException | azqj | azqi | bcqd exception0) {
                        label_349:
                            EventManager.a.g("Failed to set gaia tokens", exception0, new Object[0]);
                            this.f.b(bcrd0, gmgl.f, exception0);
                        }
                        arrayList0 = arrayList1;
                        bcrd0.g = arrayList0;
                        return arrayList0;
                    }
                }
                else {
                    bcqe.h();
                    Context context1 = this.getBaseContext();
                    arrayList1.addAll(bcqe.f(bcrd0, hrfc.c(), context1, new Bundle()).values());
                }
                arrayList0 = arrayList1;
            }
            bcrd0.g = arrayList0;
        }
        return arrayList0;
    }

    private final void d(bcrc bcrc0, bcrd bcrd0) {
        if(bcrc0.b) {
            bbwg bbwg0 = bbwg.b();
            Context context0 = this.getApplicationContext();
            if(hrfi.a.e().v()) {
                Pair pair0 = bbzr.b().a(context0).g();
                if(Long.compare(((Long)pair0.first).longValue(), -1L) == 0) {
                    gged_interceptors gged0 = bbwg0.b;
                    long v = System.currentTimeMillis();
                    if(!gged0.isEmpty()) {
                        long v1 = ((long)(((Long)gged0.get(0)))) + v;
                        Context context1 = context0.getApplicationContext();
                        bcbq bcbq0 = bbzr.b().a(context1);
                        bakc bakc0 = ((bcbs)bcbq0).c;
                        long v2 = bakc0.getLong("sync_retry_scheduling_frozen_timestamp_in_millis", 0L);
                        if(v2 > System.currentTimeMillis()) {
                            Object[] arr_object = {bcql.d(v2)};
                            bbwg.a.d("Sync re-try is frozen util %s", arr_object);
                        }
                        else {
                            bcbq0.l();
                            long v3 = Math.min(v1, bbwg.a(context0, v, null));
                            RefreshGcmTaskChimeraService.e(context1, v3, true);
                            SharedPreferences.Editor sharedPreferences$Editor0 = bakc0.edit();
                            sharedPreferences$Editor0.putLong("sync_retry_scheduling_frozen_timestamp_in_millis", System.currentTimeMillis() + bbwg0.c);
                            sharedPreferences$Editor0.apply();
                            bcbq0.w(v3, 1);
                        }
                    }
                }
                else {
                    Context context2 = context0.getApplicationContext();
                    bcbq bcbq1 = bbzr.b().a(context2);
                    int v4 = (int)(((Integer)pair0.second));
                    if(((long)(((Long)pair0.first))) == -1L) {
                        bbwg.a.d("Cannot schedule the next re-try time: current one is non-existing", new Object[0]);
                        bcbq1.m();
                    }
                    else {
                        gged_interceptors gged1 = bbwg0.b;
                        long v5 = System.currentTimeMillis();
                        if(v4 >= gged1.size()) {
                            bbwg.a.d("Cannot schedule the next re-try time: reach the end of the scheduling.", new Object[0]);
                            bcbq1.m();
                            bcbq1.l();
                            bbwg.d(context0);
                        }
                        else {
                            long v6 = v5 + ((long)(((Long)gged1.get(v4))));
                            RefreshGcmTaskChimeraService.e(context2, v6, true);
                            bcbq1.w(v6, v4 + 1);
                        }
                    }
                }
            }
            else {
                bbwg.a.d("Retry sync is disabled", new Object[0]);
            }
        }
        this.f();
        bcrd0.a();
    }

    private final void e(bcrd bcrd0) {
        Context context0 = this.getApplicationContext();
        bbwg.b();
        Context context1 = context0.getApplicationContext();
        bcbq bcbq0 = bbzr.b().a(context1);
        bcbq0.l();
        bcbq0.m();
        bbwg.b();
        bbwg.c(context0, bcrd0);
        this.f();
        bcrd0.a();
    }

    private final void f() {
        if(!hrcv.i()) {
            if(this.d.z()) {
            label_4:
                if(hrdy.i()) {
                    bbye.a().b();
                    RefreshGcmTaskChimeraService.d(this.getApplicationContext());
                }
                if(hrdy.j()) {
                    bbyu.h(this.getApplicationContext()).e();
                    RefreshGcmTaskChimeraService.f(this.getApplicationContext());
                }
            }
        }
        else if(this.d.y()) {
            goto label_4;
        }
    }

    private static final boolean g(String s) {
        return Objects.equals(s, "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION_IF_STATE_MISMATCH") || Objects.equals(s, "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION") || Objects.equals(s, "com.google.android.gms.constellation.eventmanager.GET_ASTERISM_CONSENT") || Objects.equals(s, "com.google.android.gms.constellation.eventmanager.SET_ASTERISM_CONSENT");
    }

    private static final void h(ResultReceiver resultReceiver0, int v, Bundle bundle0) {
        if(resultReceiver0 != null) {
            resultReceiver0.send(v, bundle0);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        boolean z8;
        hofo hofo0;
        String s16;
        hofs hofs5;
        HashMap hashMap0;
        bcse bcse0;
        ArrayList arrayList5;
        Map map3;
        hogf hogf0;
        Iterator iterator1;
        hoef hoef0;
        String s9;
        Iterator iterator0;
        ArrayList arrayList3;
        Map map2;
        Map map1;
        Map map0;
        ArrayList arrayList2;
        ArrayList arrayList1;
        List list0;
        Context context1;
        String s8;
        String s7;
        String s6;
        long v2;
        ResultReceiver resultReceiver3;
        Bundle bundle4;
        String s5;
        Bundle bundle2;
        Bundle bundle1;
        baun baun0;
        bcrd bcrd1;
        ResultReceiver resultReceiver1;
        ResultReceiver resultReceiver0;
        String s2;
        String s1;
        String s = intent0.getAction();
        try {
            this.d = bbzr.b().a(this.getBaseContext());
            s1 = intent0.getStringExtra("eventmanager.session_id");
        }
        catch(BadParcelableException badParcelableException0) {
            EventManager.a.g("BadparcelableException for UUID: ", badParcelableException0, new Object[0]);
            s2 = null;
            goto label_9;
        }
        s2 = s1;
        try {
        label_9:
            resultReceiver0 = (ResultReceiver)intent0.getParcelableExtra("eventmanager.on_sync_complete_callback_key");
        }
        catch(BadParcelableException badParcelableException1) {
            EventManager.a.g("BadparcelableException for resultReceiver: ", badParcelableException1, new Object[0]);
            resultReceiver1 = null;
            goto label_16;
        }
        resultReceiver1 = resultReceiver0;
    label_16:
        bcqx bcqx0 = bcqx.a(this);
        Context context0 = this.getApplicationContext();
        if(hreb.d()) {
            this.e = new bcah(new bcba(context0, ConstellationRoomDatabase.m.a(context0).u()), iccl.b(cclw.d));
        }
        if(TextUtils.isEmpty(s2)) {
            bcrd bcrd0 = new bcrd(UUID.randomUUID().toString());
            bcqx0.s(bcrd0, gmfz.aq);
            bcrd1 = bcrd0;
        }
        else {
            bcrd1 = new bcrd(s2);
        }
        bcqx0.s(bcrd1, gmfz.at);
        if(resultReceiver1 == null) {
            bcqx0.s(bcrd1, gmfz.ar);
        }
        if(Objects.equals(s, "com.google.android.gms.constellation.eventmanager.CACHE_EXTERNAL_CONSENT_ACTIVITY_STATE")) {
            gmfz gmfz0 = gmfz.b(intent0.getIntExtra("eventmanager.external_consent_activity_state", gmfz.aG.a()));
            String s3 = intent0.getStringExtra("eventmanager.calling_package_key");
            try {
                bbzr.b();
                bbzr.c(this.getApplicationContext(), 2).e(((bcbk)bcbn.a.getOrDefault(gmfz0, bcbk.f)), s3);
            }
            catch(bcqy bcqy0) {
                EventManager.a.g("Could not prepare state cache", bcqy0, new Object[0]);
                bcqx0.g(bcrd1, gmfz.aX, gmfx.bN, bcqy0.getMessage());
            }
            catch(bcrc bcrc0) {
                EventManager.a.g("Could not write state in cache", bcrc0, new Object[0]);
                bcqx0.g(bcrd1, gmfz.aX, gmfx.bP, bcrc0.getMessage());
            }
            return;
        }
        if(!Objects.equals(s, "com.google.android.gms.constellation.eventmanager.GENERATE_TOKENS") && !EventManager.g(s)) {
            return;
        }
        String s4 = this.b(intent0, bcrd1);
        ArrayList arrayList0 = this.c(intent0, bcrd1);
        if(EventManager.g(s)) {
            bcqx bcqx1 = bcqx.a(this.getBaseContext());
            if(TextUtils.isEmpty(bcrd1.f)) {
                if(this.b) {
                    bcqx1.e(bcrd1, gmfz.ak, this.c);
                }
                EventManager.a.m("Event manager is not initialized", new Object[0]);
                bcpv.a(this.getBaseContext().getApplicationContext());
                int v = bcpv.b(this.getBaseContext()) ^ 1;
                bcrc bcrc1 = new bcrc(gmfx.aC, ((boolean)v));
                this.d(bcrc1, bcrd1);
                Bundle bundle0 = new Bundle();
                bundle0.putSerializable("failure_verification_exception_key", bcrc1);
                EventManager.h(resultReceiver1, 0, bundle0);
                return;
            }
            bbwq bbwq0 = new bbwq(this.getApplicationContext());
            try {
                int v1 = intent0.getIntExtra("eventmanager.trigger_type", 0);
                bcrd1.c = v1;
                baun0 = EventManager.a;
                baun0.h("Starting session. sessionId: %s from trigger: %s", new Object[]{bcrd1.a, v1});
                switch(s) {
                    case "com.google.android.gms.constellation.eventmanager.GET_ASTERISM_CONSENT": {
                        goto label_672;
                    }
                    case "com.google.android.gms.constellation.eventmanager.SET_ASTERISM_CONSENT": {
                        goto label_606;
                    }
                    case "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION": {
                        bundle1 = new Bundle();
                        try {
                            bundle2 = intent0.getBundleExtra("eventmanager.extra_param");
                            this.getApplicationContext();
                            new ccmp().a(bbdg.es);
                            boolean z = intent0.hasExtra("eventmanager.max_verification_age_key");
                            goto label_80;
                        }
                        catch(bcrc bcrc2) {
                        }
                        break;
                    }
                    case "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION_IF_STATE_MISMATCH": {
                        goto label_592;
                    }
                    default: {
                        bcqx1.s(bcrd1, gmfz.as);
                        goto label_700;
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_695;
            }
            EventManager eventManager0 = this;
            Bundle bundle3 = bundle1;
            ResultReceiver resultReceiver2 = resultReceiver1;
            goto label_588;
        label_80:
            if(z) {
                try {
                    s5 = intent0.getStringExtra("eventmanager.policy_id_key");
                    goto label_87;
                }
                catch(bcrc bcrc2) {
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                bundle4 = bundle1;
                resultReceiver3 = resultReceiver1;
                eventManager0 = this;
                resultReceiver2 = resultReceiver3;
                bundle3 = bundle4;
                goto label_588;
                try {
                label_87:
                    v2 = intent0.getLongExtra("eventmanager.max_verification_age_key", -1L);
                    s6 = intent0.getStringExtra("eventmanager.certificate_hash_key");
                    s7 = intent0.getStringExtra("eventmanager.token_nonce_key");
                    s8 = intent0.getStringExtra("eventmanager.calling_package_key");
                    bbwq0.n();
                    context1 = bbwq0.c;
                    list0 = bcrk.b(context1, bcrd1).c(bcrd1, context1);
                    List list1 = bbwq.j(bundle2);
                    boolean z1 = bbxx.m(list1, "one_time_verification").equals("True");
                }
                catch(bcrc bcrc2) {
                    goto label_116;
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                if(!z1) {
                    try {
                        if(!bbwq0.q(bcrd1, list1, s5, s8)) {
                            bbwq0.b.h("Device is not consented", new Object[0]);
                            throw new bcqz();
                        }
                        goto label_105;
                    }
                    catch(bcrc bcrc2) {
                    }
                    catch(Throwable throwable0) {
                        goto label_695;
                    }
                    eventManager0 = this;
                    bundle3 = bundle1;
                    resultReceiver2 = resultReceiver1;
                    goto label_588;
                }
                try {
                label_105:
                    arrayList1 = new ArrayList();
                    if(list0.isEmpty()) {
                        arrayList2 = arrayList1;
                        bundle4 = bundle1;
                        resultReceiver3 = resultReceiver1;
                    }
                    else {
                        map0 = bcrk.b(context1, bcrd1).d(bcrd1, context1);
                        map1 = bcrk.b(context1, bcrd1).f();
                        map2 = bcpt.a().c(bcrd1);
                        goto label_119;
                    }
                    goto label_366;
                }
                catch(bcrc bcrc2) {
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
            label_116:
                bundle4 = bundle1;
                resultReceiver3 = resultReceiver1;
                eventManager0 = this;
                resultReceiver2 = resultReceiver3;
                bundle3 = bundle4;
                goto label_588;
            label_119:
                resultReceiver3 = resultReceiver1;
                try {
                    arrayList3 = new ArrayList();
                    goto label_125;
                }
                catch(bcrc bcrc2) {
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                bundle4 = bundle1;
                eventManager0 = this;
                resultReceiver2 = resultReceiver3;
                bundle3 = bundle4;
                goto label_588;
            label_125:
                bundle4 = bundle1;
                try {
                    iterator0 = bcrd1.g.iterator();
                    while(true) {
                    label_127:
                        boolean z2 = iterator0.hasNext();
                        if(!z2) {
                            goto label_144;
                        }
                        Object object0 = iterator0.next();
                        s9 = (String)object0;
                        hoef0 = hoef.a;
                        break;
                    }
                }
                catch(bcrc bcrc2) {
                    eventManager0 = this;
                    resultReceiver2 = resultReceiver3;
                    bundle3 = bundle4;
                    goto label_588;
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                bcrd bcrd2 = bcrd1;
                try {
                    try {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hoef0).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hoef hoef1 = (hoef)hftp0.b_message;
                        s9.getClass();
                        hoef1.b = s9;
                        arrayList3.add(((hoef)hftp0.N_build()));
                    }
                    catch(bcrc bcrc2) {
                        goto label_349;
                    }
                    try {
                        arrayList1 = arrayList1;
                        iterator0 = iterator0;
                        bcrd1 = bcrd2;
                        goto label_127;
                    }
                    catch(bcrc bcrc2) {
                        eventManager0 = this;
                        resultReceiver2 = resultReceiver3;
                        bundle3 = bundle4;
                        goto label_588;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
            label_144:
                ArrayList arrayList4 = arrayList1;
                bcrd2 = bcrd1;
                try {
                    iterator1 = list0.iterator();
                    while(true) {
                    label_147:
                        boolean z3 = iterator1.hasNext();
                        break;
                    }
                }
                catch(bcrc bcrc2) {
                    goto label_362;
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                if(z3) {
                    try {
                        Object object1 = iterator1.next();
                        String s10 = ((bcrj)object1).a;
                        bbwq0.b.j("observed a imsi ".concat(s10), new Object[0]);
                        String s11 = ((bcrj)object1).b;
                        String s12 = ((bcrj)object1).c;
                        gged_interceptors gged0 = ((bcrj)object1).d;
                        hofb hofb0 = (hofb)((ProtoLiteMessage)hofc.a).v_newBuilder();
                        hofb0.k(s10);
                        if(!TextUtils.isEmpty(s11)) {
                            if(!hofb0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hofb0).ensureMutable();
                            }
                            ((hofc)hofb0.b_message).c = s11;
                        }
                        if(!TextUtils.isEmpty(s12)) {
                            if(!hofb0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hofb0).ensureMutable();
                            }
                            ((hofc)hofb0.b_message).d = s12;
                        }
                        hofb0.a(gged0);
                        hoez hoez0 = (hoez)((ProtoLiteMessage)hofa.a).v_newBuilder();
                        if(!hoez0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hoez0).ensureMutable();
                        }
                        hofa hofa0 = (hofa)hoez0.b_message;
                        hofc hofc0 = (hofc)((ProtoLiteBuilder)hofb0).N_build();
                        hofc0.getClass();
                        hofa0.c = hofc0;
                        hofa0.b |= 1;
                        hoez0.a(arrayList3);
                        if(map0.containsKey(s10)) {
                            hogi hogi0 = (hogi)map0.get(s10);
                            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hogi0).jf(5, null);
                            hftp1.X(((ProtoLiteMessage)hogi0));
                            hogf0 = (hogf)hftp1;
                        }
                        else {
                            hogf0 = null;
                        }
                        if(map1 != null && map1.containsKey(s10)) {
                            Integer integer0 = (Integer)map1.get(s10);
                            int v3 = (int)integer0;
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hofd.a).v_newBuilder();
                            map3 = map0;
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ((hofd)hftp2.b_message).c = v3;
                            int v4 = SubscriptionManager.getSlotIndex(v3);
                            arrayList5 = arrayList3;
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ((hofd)hftp2.b_message).b = v4;
                            if(!hoez0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hoez0).ensureMutable();
                            }
                            hofa hofa1 = (hofa)hoez0.b_message;
                            hofd hofd0 = (hofd)hftp2.N_build();
                            hofd0.getClass();
                            hofa1.d = hofd0;
                            hofa1.b |= 2;
                            if(hogf0 != null && hrdy.i()) {
                                if(!hogf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                                }
                                ((hogi)hogf0.b_message).s = hfvv.a;
                                hogf0.k(bbwq0.h.d(v3));
                            }
                            if(hogf0 != null && hrdy.j()) {
                                if(!hogf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                                }
                                ((hogi)hogf0.b_message).v = hfvv.a;
                                hogf0.l(bbwq0.h.e(v3));
                            }
                            if(hogf0 == null) {
                                hogf0 = null;
                            }
                            else if(map2.containsKey(integer0)) {
                                if(!hogf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                                }
                                hfvv hfvv0 = hfvv.a;
                                ((hogi)hogf0.b_message).u = hfvv0;
                                hogf0.m(((Iterable)((Pair)map2.get(integer0)).first));
                                if(!hogf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                                }
                                ((hogi)hogf0.b_message).t = hfvv0;
                                hogf0.a(((Iterable)((Pair)map2.get(integer0)).second));
                            }
                            bcse0 = bbwq0.c(v3, list0.size());
                        }
                        else {
                            map3 = map0;
                            arrayList5 = arrayList3;
                            bcse0 = new bcsb(context1);
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hofd.a).v_newBuilder();
                            int v5 = bbzc.b;
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp3.b_message;
                            ((hofd)hftv0).c = v5;
                            int v6 = bbzc.c;
                            if(!hftv0.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ((hofd)hftp3.b_message).b = v6;
                            if(!hoez0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hoez0).ensureMutable();
                            }
                            hofa hofa2 = (hofa)hoez0.b_message;
                            hofd hofd1 = (hofd)hftp3.N_build();
                            hofd1.getClass();
                            hofa2.d = hofd1;
                            hofa2.b |= 2;
                        }
                        bbwq0.i.put(s10, bcse0);
                        if(hrfs.g()) {
                            bcrr bcrr0 = new bcrr(bbwq0.g);
                            bbwq0.j.put(s10, bcrr0);
                        }
                        hofq hofq0 = (hofq)((ProtoLiteMessage)hofs.a).v_newBuilder();
                        if(hogf0 != null) {
                            if(!hofq0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hofq0).ensureMutable();
                            }
                            hofs hofs0 = (hofs)hofq0.b_message;
                            hogi hogi1 = (hogi)((ProtoLiteBuilder)hogf0).N_build();
                            hogi1.getClass();
                            hofs0.g = hogi1;
                            hofs0.b |= 2;
                        }
                        if(!hofq0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hofq0).ensureMutable();
                        }
                        hofs hofs1 = (hofs)hofq0.b_message;
                        hofs1.f = hofr.a(3);
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hoft.a).v_newBuilder();
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        hoft hoft0 = (hoft)hftp4.b_message;
                        hofa hofa3 = (hofa)((ProtoLiteBuilder)hoez0).N_build();
                        hofa3.getClass();
                        hoft0.c = hofa3;
                        hoft0.b = 1;
                        if(!hofq0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hofq0).ensureMutable();
                        }
                        hofs hofs2 = (hofs)hofq0.b_message;
                        hoft hoft1 = (hoft)hftp4.N_build();
                        hoft1.getClass();
                        hofs2.e = hoft1;
                        hofs2.b |= 1;
                        hofq0.a(bbwq.j(bundle2));
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hofi.a).v_newBuilder();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp5.b_message;
                        s5.getClass();
                        ((hofi)hftv1).c = s5;
                        if(!hftv1.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp5.b_message;
                        ((hofi)hftv2).d = v2;
                        if(!hftv2.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        hofi hofi0 = (hofi)hftp5.b_message;
                        s8.getClass();
                        hofi0.f = s8;
                        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hoel.a).v_newBuilder();
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp6.b_message;
                        s6.getClass();
                        ((hoel)hftv3).b = s6;
                        if(!hftv3.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        hoel hoel0 = (hoel)hftp6.b_message;
                        s7.getClass();
                        s7 = s7;
                        hoel0.c = s7;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        hofi hofi1 = (hofi)hftp5.b_message;
                        hoel hoel1 = (hoel)hftp6.N_build();
                        hoel1.getClass();
                        hofi1.e = hoel1;
                        hofi1.b |= 1;
                        if(!hofq0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hofq0).ensureMutable();
                        }
                        hofs hofs3 = (hofs)hofq0.b_message;
                        hofi hofi2 = (hofi)hftp5.N_build();
                        hofi2.getClass();
                        hofs3.i = hofi2;
                        hofs3.b |= 4;
                        hobn hobn0 = bbwq.d();
                        ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)hobn0).jf(5, null);
                        hftp7.X(((ProtoLiteMessage)hobn0));
                        hobm hobm0 = (hobm)hftp7;
                        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hobx.a).v_newBuilder();
                        String s13 = bcse0.a();
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        hobx hobx0 = (hobx)hftp8.b_message;
                        s13.getClass();
                        hobx0.b = s13;
                        if(!hobm0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hobm0).ensureMutable();
                        }
                        hobn hobn1 = (hobn)hobm0.b_message;
                        hobx hobx1 = (hobx)hftp8.N_build();
                        hobx1.getClass();
                        hobn1.d = hobx1;
                        hobn1.b |= 1;
                        if(!hofq0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hofq0).ensureMutable();
                        }
                        hofs hofs4 = (hofs)hofq0.b_message;
                        hobn hobn2 = (hobn)((ProtoLiteBuilder)hobm0).N_build();
                        hobn2.getClass();
                        hofs4.j = hobn2;
                        hofs4.b |= 8;
                        arrayList4.add(((hofs)((ProtoLiteBuilder)hofq0).N_build()));
                        goto label_354;
                    }
                    catch(bcrc bcrc2) {
                    }
                    catch(Throwable throwable0) {
                        goto label_695;
                    }
                label_349:
                    eventManager0 = this;
                    resultReceiver2 = resultReceiver3;
                    bundle3 = bundle4;
                    bcrd1 = bcrd2;
                    goto label_588;
                    try {
                    label_354:
                        arrayList4 = arrayList4;
                        s8 = s8;
                        s6 = s6;
                        iterator1 = iterator1;
                        map0 = map3;
                        arrayList3 = arrayList5;
                        goto label_147;
                    }
                    catch(bcrc bcrc2) {
                    }
                    catch(Throwable throwable0) {
                        goto label_695;
                    }
                label_362:
                    bcrd1 = bcrd2;
                    eventManager0 = this;
                    resultReceiver2 = resultReceiver3;
                    bundle3 = bundle4;
                    goto label_588;
                }
                arrayList2 = arrayList4;
                bcrd1 = bcrd2;
                try {
                label_366:
                    hashMap0 = bbwq0.g(bbwq0.k(bcrd1, bbwq0.m(bcrd1, arrayList2)));
                }
                catch(bcrc bcrc2) {
                    eventManager0 = this;
                    resultReceiver2 = resultReceiver3;
                    bundle3 = bundle4;
                    goto label_588;
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
            }
            else {
                bundle4 = bundle1;
                resultReceiver3 = resultReceiver1;
                try {
                    try {
                        boolean z4 = intent0.hasExtra("eventmanager.verify_phone_number_request_key");
                    }
                    catch(bcrc bcrc2) {
                        eventManager0 = this;
                        resultReceiver2 = resultReceiver3;
                        bundle3 = bundle4;
                        goto label_588;
                    }
                    try {
                        if(z4) {
                            VerifyPhoneNumberRequest verifyPhoneNumberRequest0 = (VerifyPhoneNumberRequest)intent0.getParcelableExtra("eventmanager.verify_phone_number_request_key");
                            String s14 = verifyPhoneNumberRequest0.a;
                            boolean z5 = hrfc.a.b().A() && hrfv.a.b().b().b.contains(s14);
                            if(z5) {
                                baun0.d("Skipping storing verifications for policy ID: ".concat(String.valueOf(s14)), new Object[0]);
                            }
                            bcrd1.j = z5;
                            String s15 = intent0.getStringExtra("eventmanager.calling_package_key");
                            bbwq0.n();
                            List list2 = bcrk.b(bbwq0.c, bcrd1).c(bcrd1, bbwq0.c);
                            List list3 = bbwq.j(verifyPhoneNumberRequest0.d);
                            if(!bbxx.m(list3, "one_time_verification").equals("True") && !bbwq0.q(bcrd1, list3, s14, s15)) {
                                bbwq0.b.h("Device is not consented", new Object[0]);
                                throw new bcqz();
                            }
                            List list4 = bbwq0.k(bcrd1, bbwq0.m(bcrd1, bbwq0.i(bcrd1, s15, verifyPhoneNumberRequest0, list2)));
                            HashSet hashSet0 = new HashSet();
                            for(Object object2: verifyPhoneNumberRequest0.e) {
                                hashSet0.add(((ImsiRequest)object2).a);
                            }
                            hashMap0 = new HashMap();
                            hashMap0.put("UPI_FEATURES_ENABLED", new Bundle());
                            if(bcrd1.j) {
                                hashMap0.put("SKIP_STORING_VERIFS_ENABLED", new Bundle());
                            }
                            Iterator iterator3 = list4.iterator();
                            while(true) {
                            label_400:
                                if(!iterator3.hasNext()) {
                                    bundle3 = bundle4;
                                    goto label_572;
                                }
                                Object object3 = iterator3.next();
                                hofs5 = (hofs)object3;
                                if(hashSet0.isEmpty()) {
                                    hoft hoft2 = hofs5.e;
                                    if(hoft2 == null) {
                                        hoft2 = hoft.a;
                                    }
                                    hofa hofa4 = hoft2.b == 1 ? ((hofa)hoft2.c) : hofa.a;
                                    hofc hofc1 = hofa4.c;
                                    if(hofc1 == null) {
                                        hofc1 = hofc.a;
                                    }
                                    s16 = (String)hofc1.b.get(0);
                                }
                                else {
                                    s16 = null;
                                }
                                if(s16 == null) {
                                    hoft hoft3 = hofs5.e;
                                    if(hoft3 == null) {
                                        hoft3 = hoft.a;
                                    }
                                    hofa hofa5 = hoft3.b == 1 ? ((hofa)hoft3.c) : hofa.a;
                                    hofc hofc2 = hofa5.c;
                                    if(hofc2 == null) {
                                        hofc2 = hofc.a;
                                    }
                                    Iterator iterator4 = hofc2.b.iterator();
                                    while(true) {
                                    label_429:
                                        if(!iterator4.hasNext()) {
                                            break;
                                        }
                                        Object object4 = iterator4.next();
                                        String s17 = (String)object4;
                                        if(hashSet0.contains(s17)) {
                                            s16 = s17;
                                            break;
                                        }
                                    }
                                }
                                goto label_436;
                            }
                        }
                        else {
                            goto label_536;
                        }
                        bundle3 = bundle4;
                        goto label_572;
                    }
                    catch(bcrc bcrc2) {
                        eventManager0 = this;
                        resultReceiver2 = resultReceiver3;
                        bundle3 = bundle4;
                        goto label_588;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                goto label_429;
                try {
                label_436:
                    if(s16 == null) {
                        bbwq0.b.h("Verification for %s was not returned", new Object[]{0});
                    }
                    else {
                        Bundle bundle5 = bbwq0.a(hofs5);
                        bcrg.e();
                        if(!bcrg.d(hofs5)) {
                            bcrg.e();
                            if(bcrg.c(hofs5)) {
                                bundle5.putInt("result", 6);
                                hoer hoer0 = hofs5.c == 4 ? ((hoer)hofs5.d) : hoer.a;
                                hobj hobj0 = hoer0.c;
                                if(hobj0 == null) {
                                    hobj0 = hobj.a;
                                }
                                hobl hobl0 = hobl.b(hobj0.f);
                                if(hobl0 == null) {
                                    hobl0 = hobl.i;
                                }
                                bundle5.putInt("verification_method", hobl0.a());
                            }
                            else {
                                bcrg.e();
                                if(hofs5 != null && bcrg.a(hofs5) == 1 && hofr.b(hofs5.f) == 3) {
                                    EnumMap enumMap0 = bbwq.a;
                                    hofp hofp0 = hofs5.c == 9 ? ((hofp)hofs5.d) : hofp.a;
                                    switch(hofp0.b) {
                                        case 0: {
                                            hofo0 = hofo.a;
                                            break;
                                        }
                                        case 1: {
                                            hofo0 = hofo.b;
                                            break;
                                        }
                                        case 2: {
                                            hofo0 = hofo.c;
                                            break;
                                        }
                                        case 3: {
                                            hofo0 = hofo.d;
                                            break;
                                        }
                                        case 4: {
                                            hofo0 = hofo.e;
                                            break;
                                        }
                                        case 5: {
                                            hofo0 = hofo.f;
                                            break;
                                        }
                                        case 6: {
                                            hofo0 = hofo.g;
                                            break;
                                        }
                                        case 7: {
                                            hofo0 = hofo.h;
                                            break;
                                        }
                                        case 8: {
                                            hofo0 = hofo.i;
                                            break;
                                        }
                                        default: {
                                            hofo0 = null;
                                        }
                                    }
                                    if(hofo0 == null) {
                                        hofo0 = hofo.j;
                                    }
                                    bundle5.putInt("result", ((Integer)enumMap0.get(hofo0)).intValue());
                                    hofp hofp1 = hofs5.c == 9 ? ((hofp)hofs5.d) : hofp.a;
                                    hobl hobl1 = hobl.b(hofp1.d);
                                    if(hobl1 == null) {
                                        hobl1 = hobl.i;
                                    }
                                    bundle5.putInt("verification_method", hobl1.a());
                                    hofp hofp2 = hofs5.c == 9 ? ((hofp)hofs5.d) : hofp.a;
                                    hogd hogd0 = hofp2.c;
                                    if(hogd0 == null) {
                                        hogd0 = hogd.a;
                                    }
                                    bundle5.putLong("retry_after", bcql.b(hogd0));
                                }
                                else {
                                    bundle5.putInt("result", 0);
                                }
                            }
                        }
                        else if(bcrd1.j) {
                            bundle5.putInt("result", 1);
                            hofu hofu0 = hofs5.c == 3 ? ((hofu)hofs5.d) : hofu.a;
                            bundle5.putString("phone_number", hofu0.c);
                            hofu hofu1 = hofs5.c == 3 ? ((hofu)hofs5.d) : hofu.a;
                            bundle5.putInt("verification_method", hofu1.e);
                            hofu hofu2 = hofs5.c == 3 ? ((hofu)hofs5.d) : hofu.a;
                            hfwn hfwn0 = hofu2.d;
                            if(hfwn0 == null) {
                                hfwn0 = hfwn.a;
                            }
                            bundle5.putLong("verification_time_millis", hfyg.d(hfwn0).toEpochMilli());
                        }
                        else {
                            hofu hofu3 = hofs5.c == 3 ? ((hofu)hofs5.d) : hofu.a;
                            bundle5.putString("phone_number", hofu3.c);
                            bundle5.putInt("result", 1);
                        }
                        hashMap0.put(s16, bundle5);
                    }
                    goto label_400;
                }
                catch(bcrc bcrc2) {
                    eventManager0 = this;
                    resultReceiver2 = resultReceiver3;
                    bundle3 = bundle4;
                    goto label_588;
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                bundle3 = bundle4;
                goto label_572;
                try {
                    try {
                    label_536:
                        if(v1 == 7) {
                            bbwq0.n();
                            List list5 = bcrk.b(bbwq0.c, bcrd1).c(bcrd1, bbwq0.c);
                            List list6 = bbwq.j(bundle2);
                            if(!bbxx.m(list6, "one_time_verification").equals("True")) {
                                bbwq0.o(bcrd1);
                                bbwq0.f.a();
                                hobg hobg0 = hobg.a;
                                bbxx bbxx0 = bbwq0.d;
                                hoeg hoeg0 = bbxx0.d(bcrd1, hobg0);
                                if(!list6.isEmpty()) {
                                    hoeg0.a(list6);
                                }
                                boolean z6 = hrfc.a.b().q() ? bbxx.x(bbxx0.e(bcrd1, hoeg0), hobg0) : bbxx0.u(bcrd1, hoeg0, hobg0);
                                if(!z6) {
                                    bbwq0.b.h("Device is not consented", new Object[0]);
                                    throw new bcqz();
                                }
                            }
                            hashMap0 = bbwq0.g(bbwq0.k(bcrd1, bbwq0.m(bcrd1, bbwq0.h(bcrd1, list6, list5))));
                            bundle3 = bundle4;
                            goto label_572;
                        }
                    }
                    catch(bcrc bcrc2) {
                        eventManager0 = this;
                        resultReceiver2 = resultReceiver3;
                        bundle3 = bundle4;
                        goto label_588;
                    }
                    try {
                        bbwq0.n();
                        hashMap0 = bbwq0.g(bbwq0.l(bcrd1, bundle2, bcrk.b(bbwq0.c, bcrd1).c(bcrd1, bbwq0.c)));
                        bundle3 = bundle4;
                        goto label_572;
                    }
                    catch(bcrc bcrc2) {
                    }
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                eventManager0 = this;
                resultReceiver2 = resultReceiver3;
                bundle3 = bundle4;
                goto label_588;
            }
            try {
                bundle3 = bundle4;
                goto label_572;
            }
            catch(bcrc bcrc2) {
                eventManager0 = this;
                resultReceiver2 = resultReceiver3;
                bundle3 = bundle4;
                goto label_588;
                try {
                label_572:
                    bundle3.putSerializable("success_server_result_data_key", hashMap0);
                    goto label_578;
                }
                catch(bcrc bcrc2) {
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                eventManager0 = this;
                resultReceiver2 = resultReceiver3;
                goto label_588;
            label_578:
                resultReceiver2 = resultReceiver3;
                try {
                    EventManager.h(resultReceiver2, 1, bundle3);
                    goto label_584;
                }
                catch(bcrc bcrc2) {
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                eventManager0 = this;
                goto label_588;
            label_584:
                eventManager0 = this;
                try {
                    eventManager0.e(bcrd1);
                    goto label_700;
                }
                catch(bcrc bcrc2) {
                }
                catch(Throwable throwable0) {
                    goto label_695;
                }
                try {
                label_588:
                    bundle3.putSerializable("failure_verification_exception_key", bcrc2);
                    EventManager.h(resultReceiver2, 0, bundle3);
                    eventManager0.d(bcrc2, bcrd1);
                    goto label_700;
                    try {
                    label_592:
                        if(bbwq0.p(bcrd1)) {
                            EventManager.h(resultReceiver1, 1, null);
                            this.getApplicationContext();
                            new ccmp().a(bbdg.er);
                        }
                        else {
                            EventManager.h(resultReceiver1, 2, null);
                        }
                        this.e(bcrd1);
                    }
                    catch(bcrc bcrc3) {
                        Bundle bundle6 = new Bundle();
                        bundle6.putSerializable("failure_verification_exception_key", bcrc3);
                        EventManager.h(resultReceiver1, 0, bundle6);
                        this.d(bcrc3, bcrd1);
                    }
                    goto label_700;
                label_606:
                    Bundle bundle7 = new Bundle();
                    try {
                        Bundle bundle8 = intent0.getBundleExtra("eventmanager.extra_param");
                        boolean z7 = intent0.getBooleanExtra("eventmanager.consent_value", false);
                        hobg hobg1 = hobg.b(intent0.getIntExtra("eventmanager.aster_client", hobg.a.a()));
                        byte[] arr_b = intent0.getByteArrayExtra("eventmanager.audit_token");
                        String s18 = intent0.getStringExtra("eventmanager.consent_variant");
                        hoea hoea0 = hoea.b(intent0.getIntExtra("eventmanager.device_verification_consent_version", hoea.a.a()));
                        hofh hofh0 = hofh.b(intent0.getIntExtra("eventmanager.device_verification_consent_source", hofh.a.a()));
                        if(s18 != null) {
                            String s19 = intent0.getStringExtra("eventmanager.gaia_access_token");
                            String s20 = intent0.getStringExtra("eventmanager.consent_trigger");
                            bbxx bbxx1 = bbwq0.d;
                            ProtoLiteBuilder hftp9 = bbxx1.A(bcrd1, hobg1, arr_b, bbwq.j(bundle8));
                            ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)hoeo.a).v_newBuilder();
                            hodo hodo0 = z7 ? hodo.b : hodo.c;
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            hoeo hoeo0 = (hoeo)hftp10.b_message;
                            hoeo0.c = hodo0.a();
                            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)hoef.a).v_newBuilder();
                            if(!hftp11.b_message.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            hoef hoef2 = (hoef)hftp11.b_message;
                            s19.getClass();
                            hoef2.b = s19;
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            hoeo hoeo1 = (hoeo)hftp10.b_message;
                            hoef hoef3 = (hoef)hftp11.N_build();
                            hoef3.getClass();
                            hoeo1.d = hoef3;
                            hoeo1.b |= 1;
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            ProtoLiteMessage hftv4 = hftp10.b_message;
                            ((hoeo)hftv4).e = s18;
                            if(!hftv4.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            hoeo hoeo2 = (hoeo)hftp10.b_message;
                            s20.getClass();
                            hoeo2.f = s20;
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            hofe hofe0 = (hofe)hftp9.b_message;
                            hoeo hoeo3 = (hoeo)hftp10.N_build();
                            hoeo3.getClass();
                            hofe0.g = hoeo3;
                            hofe0.b |= 4;
                            bbxx1.s(bcrd1, z7, true, ((hofe)hftp9.N_build()));
                        }
                        else if(SetAsterismConsentRequest.a(hobg1.a(), hoea0.a(), hofh0.a())) {
                            List list7 = bbwq.j(bundle8);
                            bbwq0.d.y(bcrd1, z7, hobg1, arr_b, list7, hoea0, hofh0);
                        }
                        else {
                            int v7 = hodq.b(intent0.getIntExtra("eventmanager.consent_version", hodq.a(2)));
                            List list8 = bbwq.j(bundle8);
                            bbwq0.d.z(bcrd1, z7, true, hobg1, arr_b, list8, v7);
                        }
                        EventManager.h(resultReceiver1, 5, Bundle.EMPTY);
                    }
                    catch(bcrc bcrc4) {
                        bundle7.putSerializable("failure_verification_exception_key", bcrc4);
                        EventManager.h(resultReceiver1, 0, bundle7);
                    }
                    goto label_700;
                label_672:
                    Bundle bundle9 = new Bundle();
                    try {
                        Bundle bundle10 = intent0.getBundleExtra("eventmanager.extra_param");
                        hobg hobg2 = hobg.b(intent0.getIntExtra("eventmanager.aster_client", hobg.a.a()));
                        if(hrcv.g()) {
                            bbxx bbxx2 = bbwq0.d;
                            List list9 = bbwq.j(bundle10);
                            hoeg hoeg1 = bbxx2.d(bcrd1, hobg2);
                            if(!list9.isEmpty()) {
                                hoeg1.a(list9);
                            }
                            acoe acoe0 = bbxx2.a(bcrd1, hoeg1, hobg2);
                            bundle9.putSerializable("success_consent_version_key", Integer.valueOf(hodq.a(acoe0.b)));
                            z8 = GetAsterismConsentResponse.a(acoe0.a);
                        }
                        else {
                            List list10 = bbwq.j(bundle10);
                            z8 = bbwq0.d.t(bcrd1, list10, hobg2);
                        }
                        bundle9.putSerializable("success_consent_value_key", Boolean.valueOf(z8));
                        EventManager.h(resultReceiver1, 4, bundle9);
                    }
                    catch(bcrc bcrc5) {
                        bundle9.putSerializable("failure_verification_exception_key", bcrc5);
                        EventManager.h(resultReceiver1, 0, bundle9);
                    }
                    goto label_700;
                }
                catch(Throwable throwable0) {
                }
                goto label_695;
            }
            catch(Throwable throwable0) {
                try {
                label_695:
                    bbwq0.close();
                }
                catch(Throwable throwable1) {
                    throwable0.addSuppressed(throwable1);
                }
                throw throwable0;
            }
        label_700:
            bbwq0.close();
            return;
        }
        Bundle bundle11 = new Bundle();
        if(!arrayList0.isEmpty()) {
            bundle11.putStringArrayList("gaia_tokens", arrayList0);
        }
        if(!TextUtils.isEmpty(s4)) {
            bundle11.putString("iid_token", s4);
        }
        EventManager.h(resultReceiver1, 3, bundle11);
    }
}

