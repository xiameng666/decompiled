package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import cust;
import cwfa;
import hvpp;

public class ValidatorIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        cust cust0 = cwfa.a;
        cust0.f().B("FastPair: received validator intent %s", intent0.getAction());
        String s = intent0.getAction();
        if(s != null) {
            switch(s) {
                case "com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR": {
                    this.startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR").putExtras(intent0));
                    return;
                }
                case "com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_REQUEST_TEST_SERVICE_CONNECTION": {
                    if(hvpp.aC()) {
                        this.startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_REQUEST_TEST_SERVICE_CONNECTION").putExtras(intent0));
                    }
                    break;
                }
                case "com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_SEND_EVENT_MESSAGE": {
                    this.startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_SEND_EVENT_MESSAGE").putExtras(intent0));
                    return;
                }
                default: {
                    cust0.g().B("FastPair: Invalid external intent, action=%s", s);
                }
            }
        }
    }
}

