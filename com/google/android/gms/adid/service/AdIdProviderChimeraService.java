package com.google.android.gms.adid.service;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import aayz;
import aaza;
import android.content.Intent;
import android.os.IBinder;
import bbdg;
import ccmq;
import com.google.android.chimera.Service;
import gldi;
import gldm;
import glil;
import glim;

public final class AdIdProviderChimeraService extends Service {
    aaza a;

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        try {
            return this.a.onBind(intent0);
        }
        catch(RuntimeException runtimeException0) {
            long v = System.currentTimeMillis();
            glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gldm)hftv0).b |= 1;
            ((gldm)hftv0).e = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gldm)hftp0.b_message).g = 2;
            ((gldm)hftp0.b_message).b |= 4;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gldi.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gldi)hftv1).f = 1;
            ((gldi)hftv1).b |= 8;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gldi)hftp1.b_message).c = 3;
            ((gldi)hftp1.b_message).b |= 1;
            gldi gldi0 = (gldi)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gldm gldm0 = (gldm)hftp0.b_message;
            gldi0.getClass();
            gldm0.d = gldi0;
            gldm0.c = 4;
            glil0.s(hftp0);
            aayz.a(((glim)((ProtoLiteBuilder)glil0).N_build()));
            throw runtimeException0;
        }
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.uh);
        this.a = new aaza();
    }
}

