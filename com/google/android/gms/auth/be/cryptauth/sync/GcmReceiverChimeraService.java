package com.google.android.gms.auth.be.cryptauth.sync;

import a;
import aiix;
import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import bbcu;
import bboh;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import esah;
import ggtj;
import java.util.Iterator;

public class GcmReceiverChimeraService extends TracingIntentService {
    private static final bboh a;

    static {
        GcmReceiverChimeraService.a = bboh.b("GcmReceiverService", bbcu.bi);
    }

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent0) {
        int v4;
        int v2;
        int v1;
        try {
            ((ggtj)GcmReceiverChimeraService.a.h()).B("received gcm message from server. action: %s", intent0.getAction());
            Bundle bundle0 = intent0.getExtras();
            Iterator iterator0 = bundle0.keySet().iterator();
            while(true) {
                v1 = 0;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                bundle0.get(((String)object0));
            }
            if(intent0.hasExtra("registrationTickleType")) {
                String s = intent0.getStringExtra("registrationTickleType");
                try {
                    v2 = Integer.parseInt(s);
                    goto label_18;
                }
                catch(NumberFormatException numberFormatException0) {
                    a.e(GcmReceiverChimeraService.a.i(), "Could not parse tickle type: %s", s, numberFormatException0);
                }
            label_17:
                v2 = 0;
            }
            else {
                ((ggtj)GcmReceiverChimeraService.a.i()).x("server did not send a tickle type");
                goto label_17;
            }
        label_18:
            ((ggtj)GcmReceiverChimeraService.a.h()).z("received tickle %d from the server", v2);
            aiix aiix0 = aiix.a(this);
            switch(v2) {
                case 0: {
                    v1 = 1;
                    break;
                }
                case 1: {
                    v1 = 2;
                    break;
                }
                case 2: {
                    v1 = 3;
                    break;
                }
                case 3: {
                    v1 = 4;
                }
            }
            int v3 = 100;
            if(v1 == 0) {
                throw null;
            }
            switch(v1 - 1) {
                case 1: {
                    v4 = 1;
                    break;
                }
                case 2: {
                    v3 = 300;
                    v4 = 3;
                    break;
                }
                case 3: {
                    v4 = 2;
                    break;
                }
                default: {
                    aiix.c.f("unrecognized tickle type: %d", new Object[]{v2});
                    v4 = 3;
                    break;
                }
            }
            synchronized(aiix0.a) {
                for(Object object2: aiix0.b.a()) {
                    aiix0.e(v3, ((Account)object2).name, v4, 10, 0);
                }
            }
        }
        catch(RuntimeException runtimeException0) {
            a.ae(GcmReceiverChimeraService.a.i(), "Error", runtimeException0);
        }
        finally {
            esah.b(intent0);
        }
    }
}

