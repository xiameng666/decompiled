package com.google.android.gms.crisisalerts.handler.presenters;

import MessageLite;
import a;
import android.content.Intent;
import android.net.Uri;
import bbng;
import bboh;
import bbqr;
import bgqd;
import bgqg;
import bgrt;
import bgrz;
import hftc;
import hfur;
import hfwn;
import hfxk;
import hfyn;
import hgtu;
import hguc;
import hgug;

public class EventLoggerIntentOperation extends bgqd {
    public bgrt a;
    public bgqg b;
    public bbng c;
    private static final bboh d;

    static {
        EventLoggerIntentOperation.d = bgrz.a("ELogIO");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null && intent0.getAction() != null) {
            try {
                hftc hftc0 = hftc.a();
                hguc hguc0 = (hguc)hfxk.c(intent0, "ex_al", ((MessageLite)hguc.a), hftc0);
                hftc hftc1 = hftc.a();
                hgug hgug0 = (hgug)hfxk.c(intent0, "ex_rd", ((MessageLite)hgug.a), hftc1);
                switch(bbqr.c(intent0.getAction())) {
                    case "com.google.android.gms.crisisalerts.handler.presenters.EVENT_CLICK": {
                        goto label_8;
                    }
                    case "com.google.android.gms.crisisalerts.handler.presenters.EVENT_DISMISS": {
                        goto label_15;
                    }
                }
                intent0.getAction();
                return;
            label_8:
                this.b.g((hguc0.c == null ? hgtu.a : hguc0.c));
                this.a.b(hguc0, hgug0, 2);
                if(!bbqr.d(hgug0.d)) {
                    Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(hgug0.d));
                    intent1.setFlags(0x10000000);
                    this.startActivity(intent1);
                    return;
                label_15:
                    long v = hfyn.b((hguc0.f == null ? hfwn.a : hguc0.f));
                    int v1 = Long.compare(v, 0L) <= 0 || v > this.c.a() ? 0 : 1;
                    if(v1 == 0) {
                        this.b.g((hguc0.c == null ? hgtu.a : hguc0.c));
                    }
                    this.a.b(hguc0, hgug0, (1 == v1 ? 4 : 3));
                }
            }
            catch(hfur hfur0) {
                a.ae(EventLoggerIntentOperation.d.j(), "alert action", hfur0);
            }
        }
    }
}

