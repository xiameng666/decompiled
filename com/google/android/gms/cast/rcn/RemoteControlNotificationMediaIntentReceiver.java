package com.google.android.gms.cast.rcn;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import avbc;
import avbd;
import avbu;
import avbv;
import avjh;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import gkey;
import gkfm;
import ibuq;

public class RemoteControlNotificationMediaIntentReceiver extends TracingBroadcastReceiver {
    public static final avjh a;
    public final Context b;
    public boolean c;
    private final avbd d;
    private final avbv e;

    static {
        RemoteControlNotificationMediaIntentReceiver.a = new avjh("RCNIntentReceiver");
    }

    public RemoteControlNotificationMediaIntentReceiver(Context context0, avbd avbd0) {
        super("cast");
        this.c = false;
        this.b = context0;
        this.d = avbd0;
        this.e = avbd0.c;
    }

    public static Intent b(String s, String s1) {
        ibuq.f(s, "name");
        ibuq.f(s1, "castDeviceId");
        Intent intent0 = new Intent("com.google.android.apps.googletv.ACTION_VIRTUAL_REMOTE").setPackage("com.google.android.videos").addFlags(0x10000000).putExtra("referrer", "com.google.android.gms.cast.rcn");
        ibuq.e(intent0, "putExtra(...)");
        Intent intent1 = intent0.putExtra("device_name", s).putExtra("cast_device_id", s1);
        ibuq.e(intent1, "putExtra(...)");
        return intent1;
    }

    public static boolean c(PackageManager packageManager0, String s, String s1) {
        return packageManager0.resolveActivity(RemoteControlNotificationMediaIntentReceiver.b(s, s1), 0x10000) != null;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        avjh avjh0 = RemoteControlNotificationMediaIntentReceiver.a;
        avjh0.n("RCNMediaIntentReceiver received %s", intent0);
        String s = intent0.getAction();
        if(s == null) {
            avjh0.g("RCNMediaIntentReceiver received null action", new Object[0]);
            return;
        }
        avbc avbc0 = null;
        switch(s) {
            case "com.google.android.gms.cast.rcn.DISMISS": {
                String s9 = intent0.getStringExtra("extra_device_id");
                String s10 = intent0.getStringExtra("extra_session_id");
                if(!TextUtils.isEmpty(s9)) {
                    if(!TextUtils.isEmpty(s10)) {
                        avbv avbv0 = this.e;
                        long v = System.currentTimeMillis();
                        if(!TextUtils.isEmpty(s9) && !TextUtils.isEmpty(s10)) {
                            avbc0 = new avbu();
                            avbc0.a = s9;
                            avbc0.b = s10;
                            avbc0.c = v;
                        }
                        if(avbc0 != null) {
                            avbv0.d.put(s9, avbc0);
                            avbv0.c();
                        }
                    }
                    avbc0 = this.d.c(s9, false, gkfm.b);
                }
                if(avbc0 != null) {
                    avbc0.d.a(gkey.af);
                    return;
                }
                break;
            }
            case "com.google.android.gms.cast.rcn.QUEUE_NEXT": {
                String s8 = intent0.getStringExtra("extra_device_id");
                avbc avbc5 = this.d.a(s8);
                if(avbc5 != null) {
                    avbc5.g.i();
                    return;
                }
                break;
            }
            case "com.google.android.gms.cast.rcn.QUEUE_PREVIOUS": {
                String s1 = intent0.getStringExtra("extra_device_id");
                avbc avbc1 = this.d.a(s1);
                if(avbc1 != null) {
                    avbc1.g.j();
                    return;
                }
                break;
            }
            case "com.google.android.gms.cast.rcn.STOP_CASTING": {
                String s7 = intent0.getStringExtra("extra_device_id");
                if(!TextUtils.isEmpty(s7)) {
                    avbc0 = this.d.c(s7, true, gkfm.c);
                }
                if(avbc0 != null) {
                    avbc0.d.a(gkey.W);
                    return;
                }
                break;
            }
            case "com.google.android.gms.cast.rcn.TOGGLE_MUTE": {
                String s6 = intent0.getStringExtra("extra_device_id");
                avbc avbc4 = this.d.a(s6);
                if(avbc4 != null) {
                    avbc4.g.k();
                    return;
                }
                break;
            }
            case "com.google.android.gms.cast.rcn.TOGGLE_PLAY_BACK": {
                String s2 = intent0.getStringExtra("extra_device_id");
                avbc avbc2 = this.d.a(s2);
                if(avbc2 != null) {
                    avbc2.g.l();
                    return;
                }
                break;
            }
            case "com.google.android.gms.cast.rcn.VIRTUAL_REMOTE": {
                String s3 = intent0.getStringExtra("extra_media_route_name");
                String s4 = intent0.getStringExtra("extra_media_route_id");
                if(s3 != null && s4 != null) {
                    avjh0.m("start Gtv virtual remote activity");
                    Intent intent1 = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                    this.b.sendBroadcast(intent1);
                    Intent intent2 = RemoteControlNotificationMediaIntentReceiver.b(s3, s4);
                    this.b.startActivity(intent2);
                    String s5 = intent0.getStringExtra("extra_device_id");
                    avbc avbc3 = this.d.a(s5);
                    if(avbc3 != null) {
                        avbc3.d.a(gkey.ad);
                        return;
                    }
                }
                break;
            }
            default: {
                avjh0.g("RCNMediaIntentReceiver received unsupported action: %s", new Object[]{s});
            }
        }
    }
}

