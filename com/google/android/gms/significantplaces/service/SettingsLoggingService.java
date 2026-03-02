package com.google.android.gms.significantplaces.service;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.os.Bundle;
import android.provider.Settings.Secure;
import azts;
import cclw;
import cihq;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import epib;
import epic;
import epid;
import epnf;
import epng;
import epom;
import evql;
import ezcp;
import gixx;
import gixy;
import gkwg;
import gkwh;
import ibnx;
import ibom;
import ibpo;
import ibrl;
import ibrx;
import iccl;
import icpu;
import ictn;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class SettingsLoggingService extends GmsTaskBoundService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        try {
            icpu.e(iccl.b(cclw.b), new epic(this, null)).get();
            return 0;
        }
        catch(InterruptedException interruptedException0) {
            a.ae(epid.a.j(), "Failed to log significant places settings", interruptedException0);
            return 2;
        }
        catch(ExecutionException executionException0) {
            a.ae(epid.a.j(), "Failed to log significant places settings", executionException0);
            return 2;
        }
    }

    public final Object d(ibrl ibrl0) {
        int v8;
        int v7;
        int v6;
        int v3;
        Object object3;
        epib epib0;
        if((ibrl0 instanceof epib)) {
            epib0 = (epib)ibrl0;
            int v = epib0.e;
            if((v & 0x80000000) == 0) {
                epib0 = new epib(this, ibrl0);
            }
            else {
                epib0.e = v - 0x80000000;
            }
        }
        else {
            epib0 = new epib(this, ibrl0);
        }
        Object object0 = epib0.c;
        Object object1 = ibrx.a;
        int v1 = 0;
        boolean z = true;
        switch(epib0.e) {
            case 0: {
                ibnx.b(object0);
                epib0.e = 1;
                object0 = epom.a.c(epib0);
                if(object0 != object1) {
                    goto label_21;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_21:
                int v2 = Settings.Secure.getInt(this.getContentResolver(), "mandatory_biometrics", 0) == 1 ? 1 : 0;
                evql evql0 = new azts(this, null).ch();
                epib0.a = (List)object0;
                epib0.b = v2;
                epib0.e = 2;
                Object object2 = ictn.b(evql0, epib0);
                if(object2 != object1) {
                    object3 = (List)object0;
                    object0 = object2;
                    v3 = v2;
                    break;
                }
                return object1;
            }
            case 2: {
                v3 = epib0.b;
                object3 = epib0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Bundle bundle0 = ((ezcp)object0).a.getBundle("Place");
        boolean z1 = bundle0 != null && bundle0.getBoolean("key_trustlet_is_configured", false);
        int v4 = v3 == 0 ? 0 : 1;
        if(z1) {
            ++v4;
        }
        cihq cihq0 = cihq.v();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
        gixx gixx0 = gixx.B;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixy)hftp0.b_message).d = gixx0.H;
        ((gixy)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkwh.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkwg.a).v_newBuilder();
        int v5 = ((List)object3).size();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((gkwg)hftv0).b |= 1;
        ((gkwg)hftv0).c = v5;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gkwg)hftv1).b |= 2;
        ((gkwg)hftv1).d = v4;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gkwg)hftv2).b |= 4;
        ((gkwg)hftv2).e = z1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        if(1 != v3) {
            z = false;
        }
        gkwg gkwg0 = (gkwg)hftp2.b_message;
        gkwg0.b |= 8;
        gkwg0.f = z;
        if((object3 instanceof Collection) && ((Collection)object3).isEmpty()) {
            v6 = 0;
        }
        else {
            v6 = 0;
            for(Object object4: ((Iterable)object3)) {
                epnf epnf0 = epnf.b(((epng)object4).j);
                if(epnf0 == null) {
                    epnf0 = epnf.e;
                }
                if(epnf0 == epnf.b) {
                    ++v6;
                    if(v6 < 0) {
                        ibpo.l();
                    }
                }
            }
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkwg gkwg1 = (gkwg)hftp2.b_message;
        gkwg1.b |= 16;
        gkwg1.g = v6;
        if((object3 instanceof Collection) && ((Collection)object3).isEmpty()) {
            v7 = 0;
        }
        else {
            v7 = 0;
            for(Object object5: ((Iterable)object3)) {
                epnf epnf1 = epnf.b(((epng)object5).j);
                if(epnf1 == null) {
                    epnf1 = epnf.e;
                }
                if(epnf1 == epnf.c) {
                    ++v7;
                    if(v7 < 0) {
                        ibpo.l();
                    }
                }
            }
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkwg gkwg2 = (gkwg)hftp2.b_message;
        gkwg2.b |= 0x20;
        gkwg2.h = v7;
        if((object3 instanceof Collection) && ((Collection)object3).isEmpty()) {
            v8 = 0;
        }
        else {
            v8 = 0;
            for(Object object6: ((Iterable)object3)) {
                epnf epnf2 = epnf.b(((epng)object6).j);
                if(epnf2 == null) {
                    epnf2 = epnf.e;
                }
                if(epnf2 == epnf.d) {
                    ++v8;
                    if(v8 < 0) {
                        ibpo.l();
                    }
                }
            }
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkwg gkwg3 = (gkwg)hftp2.b_message;
        gkwg3.b |= 0x40;
        gkwg3.i = v8;
        if(!(object3 instanceof Collection) || !((Collection)object3).isEmpty()) {
            for(Object object7: ((Iterable)object3)) {
                int v9 = ((epng)object7).j;
                if((epnf.b(v9) == null ? epnf.e : epnf.b(v9)) != epnf.d && (epnf.b(v9) == null ? epnf.e : epnf.b(v9)) != epnf.c && (epnf.b(v9) == null ? epnf.e : epnf.b(v9)) != epnf.b) {
                    ++v1;
                    if(v1 < 0) {
                        ibpo.l();
                    }
                }
            }
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkwg gkwg4 = (gkwg)hftp2.b_message;
        gkwg4.b |= 0x80;
        gkwg4.j = v1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkwh gkwh0 = (gkwh)hftp1.b_message;
        gkwg gkwg5 = (gkwg)hftp2.N_build();
        gkwg5.getClass();
        gkwh0.e = gkwg5;
        gkwh0.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixy gixy0 = (gixy)hftp0.b_message;
        gkwh gkwh1 = (gkwh)hftp1.N_build();
        gkwh1.getClass();
        gixy0.E = gkwh1;
        gixy0.b |= 0x8000000;
        cihq0.c(hftp0.N_build()).a();
        return ibom.a;
    }
}

