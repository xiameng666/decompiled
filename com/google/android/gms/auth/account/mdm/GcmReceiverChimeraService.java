package com.google.android.gms.auth.account.mdm;

import adqj;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import bbmq;
import clht;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import gfta;
import java.util.HashMap;
import java.util.Map;

public class GcmReceiverChimeraService extends TracingIntentService {
    Handler a;
    private HandlerThread b;

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
        this.setIntentRedelivery(true);
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getStringExtra("action");
            if(s != null && s.equals("account_wipe")) {
                String s1 = intent0.getStringExtra("action_token");
                String s2 = intent0.getStringExtra("email");
                if(!gfta.c(s1) && !gfta.c(s2)) {
                    long v = bbmq.d(this.getApplicationContext());
                    this.a.post(new adqj(this, v, s1, s2));
                }
            }
        }
    }

    public static final Map b(String s) {
        Map map0 = new HashMap();
        map0.put("Authorization", "GoogleDMToken token=" + s);
        map0.put("Content-type", "application/x-protobuffer");
        map0.put("Accept-Encoding", "gzip");
        return map0;
    }

    @Override  // com.google.android.chimera.IntentService
    public final void onCreate() {
        HandlerThread handlerThread0 = new HandlerThread("dm-account-wipe", 10);
        this.b = handlerThread0;
        handlerThread0.start();
        this.a = new clht(this.b.getLooper());
        super.onCreate();
    }

    @Override  // com.google.android.chimera.IntentService
    public final void onDestroy() {
        HandlerThread handlerThread0 = this.b;
        if(handlerThread0 != null) {
            handlerThread0.quit();
        }
        super.onDestroy();
    }
}

