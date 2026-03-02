package com.google.android.gms.checkin;

import a;
import android.content.Context;
import android.content.Intent;
import avuv;
import baun;
import bbdg;
import bbmq;
import ccmp;
import esah;
import fftn;

public class CheckinChimeraService.TriggerReceiver extends esah {
    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        boolean z3;
        int v1;
        boolean z2;
        boolean z = false;
        if("com.google.android.c2dm.intent.RECEIVE".equals(intent0.getAction()) && !intent0.hasCategory("android.server.checkin.CHECKIN")) {
            CheckinChimeraService.a.j("Ignored a trigger: " + intent0, new Object[0]);
            return;
        }
        if("android.intent.action.SIM_STATE_CHANGED".equals(intent0.getAction())) {
            if(!fftn.k(context0.getContentResolver(), "checkin_trigger_on_sim_change", false)) {
                return;
            }
            String s = intent0.getStringExtra("ss");
            if(!"LOADED".equals(s) && !"ABSENT".equals(s)) {
                CheckinChimeraService.a.j(a.X(intent0, s, "Ignored SIM state change trigger: ", " sim state: "), new Object[0]);
                return;
            }
        }
        boolean z1 = true;
        baun baun0 = CheckinChimeraService.a;
        baun0.j("launching from TriggerReceiver: " + intent0, new Object[0]);
        String s1 = intent0.getAction();
        int v = 9;
        if(s1 == null) {
            z2 = false;
            z3 = false;
            v1 = 9;
        }
        else {
            if("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(s1)) {
                v = 5;
            }
            else if("com.google.android.c2dm.intent.RECEIVE".equals(s1)) {
                v = "UPLOAD_NONE".equals(intent0.getStringExtra("CheckinService_logUploadPolicy")) ? 17 : 11;
                z1 = false;
            }
            else if("android.app.action.DEVICE_OWNER_CHANGED".equals(s1)) {
                if(!bbmq.Q(context0)) {
                    v = 16;
                    goto label_33;
                }
                baun0.d("Ignoring ACTION_DEVICE_OWNER_CHANGED for ARC++ device", new Object[0]);
                return;
            }
            else {
                if(intent0.hasExtra("CheckinService_onStart_checkinReason")) {
                    v = avuv.a(intent0.getIntExtra("CheckinService_onStart_checkinReason", 8));
                }
                z1 = false;
            }
        label_33:
            if("android.server.checkin.CHECKIN".equals(s1)) {
                z = intent0.getBooleanExtra("fetchSystemUpdates", false);
            }
            z2 = z;
            v1 = v;
            z3 = z1;
        }
        CheckinChimeraService.e(4, intent0);
        new ccmp().a(bbdg.rw);
        CheckinIntentOperation.a(context0, false, v1, z2, z3, intent0);
    }
}

