package com.google.android.gms.udc.gcm;

import android.content.Context;
import android.content.Intent;
import bblp;
import com.google.android.chimera.BroadcastReceiver;
import ezol;
import ezom;
import ezon;
import ezoo;
import ezop;
import ezoq;
import ezor;
import ezos;
import ezot;
import ezqo;
import ezqu;
import ezsz;
import fgvt;
import fgvy;
import fktv;
import flan;
import gfsi;
import ggtl;
import java.util.concurrent.Executor;

public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public static final ggtl b;
    public final gfsi c;
    public final gfsi d;
    public final gfsi e;
    public final gfsi f;
    public final fgvt g;
    private final Executor h;

    static {
        GcmChimeraBroadcastReceiver.b = ezqu.c();
    }

    public GcmChimeraBroadcastReceiver() {
        this.c = new ezoq();
        this.d = new ezor();
        this.e = new ezos();
        this.f = new ezot();
        this.h = new bblp(0x7FFFFFFF, 10);
        this.g = new fgvy();
    }

    GcmChimeraBroadcastReceiver(flan flan0, ezsz ezsz0, ezqo ezqo0, fktv fktv0, Executor executor0, fgvt fgvt0) {
        this.c = new ezol(flan0);
        this.d = new ezom(ezsz0);
        this.e = new ezon(ezqo0);
        this.f = new ezoo(fktv0);
        this.h = executor0;
        this.g = fgvt0;
    }

    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        ggtl ggtl0 = GcmChimeraBroadcastReceiver.b;
        ggtl0.h().ar(0x4457).x("Received GCM push notification.");
        if(intent0 != null && intent0.hasExtra("fsc_v1")) {
            ezop ezop0 = new ezop(this, context0, intent0, this.goAsync());
            this.h.execute(ezop0);
            return;
        }
        ggtl0.h().ar(0x4458).x("Message not relevant for UDC, skipping push notification handling...");
    }
}

