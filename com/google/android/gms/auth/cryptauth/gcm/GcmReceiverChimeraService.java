package com.google.android.gms.auth.cryptauth.gcm;

import ajfn;
import ajgg;
import ajgq;
import ajio;
import ajiv;
import ajiz;
import android.accounts.Account;
import android.content.Intent;
import baun;
import bbdg;
import bbmu;
import ccmq;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import erzp;
import hptg;

public class GcmReceiverChimeraService extends TracingIntentService {
    private static final baun a;

    static {
        GcmReceiverChimeraService.a = new baun(new String[]{"GcmReceiverService"}, null);
    }

    public GcmReceiverChimeraService() {
        super("CryptauthGcmIntentReceiver");
        this.setIntentRedelivery(true);
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent0) {
        Account account0;
        ajiz ajiz0;
        ccmq.a().a(bbdg.nc);
        if(!hptg.c()) {
            return;
        }
        try {
            if(intent0 == null) {
                GcmReceiverChimeraService.a.m("Received null intent.", new Object[0]);
                return;
            }
            ajgg ajgg0 = new ajgg(this);
            ajfn ajfn0 = new ajfn(this);
            if(!intent0.hasExtra("S")) {
                ajgq.a.m("Missing target service", new Object[0]);
            }
            else if(!intent0.hasExtra("H")) {
                ajgq.a.m("Missing active key handle field", new Object[0]);
            }
            else {
                byte[] arr_b = bbmu.d(intent0.getStringExtra("H"));
                try {
                    ajiz0 = ajfn0.g(arr_b);
                }
                catch(ajiv ajiv0) {
                    ajgq.a.n("Couldn\'t retrieve key from key handle", ajiv0, new Object[0]);
                    account0 = null;
                    goto label_21;
                }
                account0 = new Account(ajiz0.f, "com.google");
            label_21:
                if(account0 == null) {
                    ajgq.a.m("Account could not be retrieved from key handle", new Object[0]);
                }
                else {
                    if(intent0.hasExtra("F")) {
                        String s = intent0.getStringExtra("F");
                        ajgq.a.h("Sending device sync feature broadcast for " + s, new Object[0]);
                        ajio.a(3);
                        String s1 = account0.name;
                        Intent intent1 = new Intent("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FEATURE");
                        intent1.setPackage("com.google.android.gms");
                        intent1.putExtra("account_name", s1);
                        intent1.putExtra("feature_name", s);
                        this.sendBroadcast(intent1);
                    }
                    String s2 = intent0.getStringExtra("S");
                    if(s2.hashCode() == 50 && s2.equals("2")) {
                        String s3 = intent0.getStringExtra("K");
                        if(s3 == null) {
                            ajgq.a.m("Missing device sync key name", new Object[0]);
                        }
                        else {
                            ajgg0.a(account0, s3, intent0.getStringExtra("I"));
                        }
                    }
                    else {
                        ajgq.a.m("Unrecognized target service: " + s2, new Object[0]);
                    }
                }
            }
        }
        catch(RuntimeException runtimeException0) {
            GcmReceiverChimeraService.a.n("Error", runtimeException0, new Object[0]);
        }
        finally {
            erzp.c(intent0);
        }
    }
}

