package com.google.android.gms.googlehelp;

import a;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bbcu;
import bboh;
import bsoj;
import bttg;
import bttu;
import btux;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcChimeraActivity;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import gfsx;
import ggtj;

public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {
    private static final bboh b;

    static {
        GcmChimeraBroadcastReceiver.b = bboh.b("gH_GcmBroadcastReceiver", bbcu.aw);
    }

    static final void a(Context context0, String s, int v) {
        MetricsIntentOperation.b(context0, s, "com.google.android.apps.helprtc", 88, v, true);
    }

    private final void b(Context context0, Intent intent0) {
        GcmChimeraBroadcastReceiver.startWakefulService(context0, intent0);
        if(this.isOrderedBroadcast()) {
            this.setResultCode(-1);
        }
    }

    private static final boolean c(Context context0, Intent intent0) {
        Intent intent1 = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity")).addFlags(0x30000000);
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            ((ggtj)GcmChimeraBroadcastReceiver.b.i()).x("Received screenshare invite with no bundle");
            return false;
        }
        if(!"MOBILE_SCREENSHARE".equals(bundle0.getString("type"))) {
            return false;
        }
        String s = OpenHelpRtcChimeraActivity.a(bundle0);
        if(TextUtils.isEmpty(s)) {
            ((ggtj)GcmChimeraBroadcastReceiver.b.i()).x("Received screenshare invite with no invitation ID");
            return false;
        }
        String s1 = bttu.a(s);
        GcmChimeraBroadcastReceiver.a(context0, s1, 0x97);
        bttg.A(context0, s1, "com.google.android.apps.helprtc", 66, 68);
        intent1.putExtra("launch_source_key", "launch_source_gcm_value");
        for(Object object0: bundle0.keySet()) {
            String s2 = (String)object0;
            Object object1 = bundle0.get(s2);
            if(object1 != null) {
                intent1.putExtra(s2, object1.toString());
            }
        }
        try {
            context0.startActivity(intent1);
        }
        catch(ActivityNotFoundException | SecurityException exception0) {
            GcmChimeraBroadcastReceiver.a(context0, s1, 0x98);
            bttg.A(context0, s1, "com.google.android.apps.helprtc", 66, 69);
            a.ae(GcmChimeraBroadcastReceiver.b.i(), "Unable to start the screenshare activity.", exception0);
        }
        return true;
    }

    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0 != null) {
            bsoj.a(context0);
            if("gcm".equals(bsoj.e(intent0)) && !GcmChimeraBroadcastReceiver.c(context0, intent0)) {
                String s = intent0.getStringExtra("type");
                if("CHAT_TYPING".equals(s)) {
                    String s1 = intent0.getStringExtra("participantId");
                    btux btux0 = intent0.hasExtra("status") ? ((btux)gfsx.l(btux.b(Integer.parseInt(intent0.getStringExtra("status")))).f(btux.a)) : btux.a;
                    Intent intent1 = new Intent().setClassName(context0, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_UPDATE_AGENT_TYPING_STATUS", true).putExtra("EXTRA_NEW_TYPING_STATUS", btux0.e).putExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID", s1);
                    if(intent0.hasExtra("clientTime")) {
                        intent1.putExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", Long.parseLong(intent0.getStringExtra("clientTime")));
                    }
                    this.b(context0, intent1);
                    return;
                }
                if("CHAT_MESSAGE".equals(s)) {
                    this.b(context0, new Intent().setClassName(context0, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_CONVERSATION_UPDATE", true));
                    return;
                }
                if("CHAT_QUEUE".equals(s)) {
                    String s2 = intent0.getStringExtra("version");
                    this.b(context0, new Intent().setClassName(context0, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_QUEUE_STATUS_UPDATE", true).putExtra("EXTRA_REQUEST_VERSION", s2));
                }
            }
        }
    }
}

