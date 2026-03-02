package com.google.android.gms.auth.folsom.recovery.wear.service;

import ProtoLiteMessage;
import a;
import ajxl;
import akea;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import bbdg;
import bbnp;
import bboh;
import ccmq;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import fczm;
import ggtj;
import hftc;
import hfur;
import j..util.Objects;

public class FolsomWearableChimeraService extends fczm {
    private static final bboh a;

    static {
        FolsomWearableChimeraService.a = akea.b("FolsomWearService");
    }

    @Override  // fczm
    public final void a(MessageEventParcelable messageEventParcelable0) {
        if(!Objects.equals(messageEventParcelable0.b, "/auth_folsom/key_retrieval_request")) {
            return;
        }
        bboh bboh0 = FolsomWearableChimeraService.a;
        ((ggtj)bboh0.h()).x("Received retrieval request. Opening provider activity. ");
        byte[] arr_b = messageEventParcelable0.c;
        if(arr_b != null) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ajxl.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                String s = ((ajxl)hftv0).b;
                String s1 = ((ajxl)hftv0).c;
                Bundle bundle0 = new Bundle();
                bundle0.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", s);
                bundle0.putString("SECURITY_DOMAIN", s1);
                bundle0.putString("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID", messageEventParcelable0.d);
                this.startActivity(new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.auth.folsom.recovery.wear.WearKeyProviderActivity")).setFlags(0x4000000).setFlags(0x10000000).putExtras(bundle0));
            }
            catch(hfur hfur0) {
                a.ae(FolsomWearableChimeraService.a.i(), "Unable to parse request", hfur0);
            }
            return;
        }
        ((ggtj)bboh0.j()).x("Request has no data.");
    }

    @Override  // fczm
    public final void onCreate() {
        ccmq.a().a(bbdg.mM);
        super.onCreate();
        if(bbnp.k(this.getApplicationContext())) {
            ((ggtj)FolsomWearableChimeraService.a.h()).x("listening for retrieval request");
            return;
        }
        ((ggtj)FolsomWearableChimeraService.a.h()).x("stopping service on non-phone device");
        this.stopSelf();
    }
}

