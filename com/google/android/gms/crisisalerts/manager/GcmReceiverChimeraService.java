package com.google.android.gms.crisisalerts.manager;

import ProtoLiteMessage;
import android.content.Intent;
import android.os.Bundle;
import bbdg;
import bgrz;
import bgtb;
import bgti;
import bgtr;
import bsoa;
import ccmq;
import fxmv;
import hftc;
import hfur;
import hgud;

public class GcmReceiverChimeraService extends bgtr {
    public bgtb a;
    private static final fxmv b;

    static {
        bgrz.a("Gcm");
        GcmReceiverChimeraService.b = new fxmv(50, new bgti());
    }

    public GcmReceiverChimeraService() {
        super("CrisisAlerts");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent0) {
        ccmq.a().a(bbdg.vr);
        try {
            fxmv fxmv0 = GcmReceiverChimeraService.b;
            fxmv0.d(1);
            if(intent0 == null) {
                fxmv0.d(2);
            }
            else {
                Bundle bundle0 = intent0.getExtras();
                if(bundle0 == null) {
                    fxmv0.d(4);
                }
                else {
                    byte[] arr_b = bundle0.getByteArray("rawData");
                    if(arr_b == null) {
                        fxmv0.d(5);
                    }
                    else {
                        try {
                            hftc hftc0 = hftc.a();
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hgud.a), arr_b, 0, arr_b.length, hftc0);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            fxmv0.d(6);
                            if(this.a.b(((hgud)hftv0))) {
                                fxmv0.d(6);
                            }
                            else {
                                fxmv0.d(3);
                            }
                        }
                        catch(hfur unused_ex) {
                            GcmReceiverChimeraService.b.d(7);
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            bsoa.b(intent0);
            throw throwable0;
        }
        bsoa.b(intent0);
    }
}

