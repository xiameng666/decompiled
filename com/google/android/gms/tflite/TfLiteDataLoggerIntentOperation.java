package com.google.android.gms.tflite;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Intent;
import cljp;
import clkm;
import clkq;
import clkr;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.tflite.AppContextProvider;
import com.google.android.gms.tflite.examplestore.TfLiteExampleStoreDataTtlService;
import evui;
import evvk;
import evvl;
import evvn;
import ggia;
import hyzh;
import igrg;
import igrh;
import igri;
import igrj;
import igrk;
import igrm;
import j..util.Objects;
import java.util.List;

public final class TfLiteDataLoggerIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(hyzh.c() && intent0 != null && Objects.equals(intent0.getAction(), "com.google.android.gms.tflite.LOG_PRIVATE_AGGREGATED_DATA")) {
            String s = intent0.getStringExtra("package_name");
            if(s == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)igrj.a).v_newBuilder();
            igrg igrg0 = (igrg)((ProtoLiteMessage)igrh.a).v_newBuilder();
            igrg0.a(ByteString.A(s));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            igrj igrj0 = (igrj)hftp0.b_message;
            igrh igrh0 = (igrh)((ProtoLiteBuilder)igrg0).N_build();
            igrh0.getClass();
            igrj0.c = igrh0;
            igrj0.b = 1;
            igrj igrj1 = (igrj)hftp0.N_build();
            evvn evvn0 = evvn.a();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)igri.a).v_newBuilder();
            igrk igrk0 = (igrk)((ProtoLiteMessage)igrm.a).v_newBuilder();
            igrk0.k("package_name", igrj1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            igri igri0 = (igri)hftp1.b_message;
            igrm igrm0 = (igrm)((ProtoLiteBuilder)igrk0).N_build();
            igrm0.getClass();
            igri0.c = igrm0;
            igri0.b |= 1;
            List list0 = ggia.h(ggia.d(new igri[]{((igri)hftp1.N_build())}), new evvk());
            clkq clkq0 = new clkq();
            clkq0.t("TfLiteDataTtlService");
            clkq0.w(TfLiteExampleStoreDataTtlService.b);
            clkq0.j(clkm.h);
            clkq0.v(1);
            clkq0.r(false);
            clkq0.g(2);
            clkq0.f(1, 1);
            clkr clkr0 = clkq0.a();
            cljp.a(AppContextProvider.a()).f(clkr0);
            clkm.a(clkr0.a);
            evvl evvl0 = new evvl(list0);
            evvn0.b.a(evvl0).hB(new evui(), evvn.a);
            return;
        }
        hyzh.c();
    }
}

