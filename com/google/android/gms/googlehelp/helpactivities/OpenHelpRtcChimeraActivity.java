package com.google.android.gms.googlehelp.helpactivities;

import a;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import avyq;
import bayn;
import bbcu;
import bblp;
import bboh;
import btkq;
import bttg;
import btti;
import bttu;
import btwm;
import cjok;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import evuh;
import gmcg;
import htkd;
import htkq;
import juo;
import xob;

@GmsCoreVeId(0x3F422)
public class OpenHelpRtcChimeraActivity extends xob {
    private static final bboh j;
    private gmcg k;
    private btti l;
    private boolean m;

    static {
        OpenHelpRtcChimeraActivity.j = bboh.b("gH_OpenHelpRtcActivity", bbcu.aw);
    }

    public OpenHelpRtcChimeraActivity() {
        this.m = false;
    }

    public static String a(Bundle bundle0) {
        return bundle0 == null ? null : bundle0.getString("invitationId");
    }

    final boolean b() {
        return btkq.a(this) > 0;
    }

    final void c(String s, int v, int v1) {
        MetricsIntentOperation.b(this.getApplicationContext(), bttu.a(s), "com.google.android.apps.helprtc", 108, v, true);
        bttg.A(this, bttu.a(s), "com.google.android.apps.helprtc", 67, v1);
    }

    private final void f(String s) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.helprtc"));
            this.m = true;
            this.startActivityForResult(intent0, 100);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            this.c(s, 0x9D, 0x3F);
            a.e(OpenHelpRtcChimeraActivity.j.i(), "%s", "No Play Store or browser available for screenshare app download", activityNotFoundException0);
            Toast.makeText(this, "No Play Store or browser available for screenshare app download", 1).show();
            this.finishAndRemoveTask();
        }
    }

    private final void g() {
        if(this.b() && ((long)btkq.a(this)) > htkd.j()) {
            Intent intent0 = new Intent().setComponent(new ComponentName("com.google.android.apps.helprtc", "com.google.android.apps.helprtc.ui.ScreenshareActivity")).addFlags(0x30000000);
            Bundle bundle0 = this.getIntent().getExtras();
            if(bundle0 != null) {
                for(Object object0: bundle0.keySet()) {
                    String s = (String)object0;
                    Object object1 = bundle0.get(s);
                    if(object1 != null) {
                        intent0.putExtra(s, object1.toString());
                    }
                }
            }
            try {
                this.startActivity(intent0);
            }
            catch(Exception exception0) {
                a.ae(OpenHelpRtcChimeraActivity.j.i(), "Unable to start the screenshare activity.", exception0);
            }
            finally {
                this.finishAndRemoveTask();
            }
            return;
        }
        this.c(this.getIntent().getExtras().getString("invitationId"), (this.b() ? 0x9C : 0x9B), (this.b() ? 62 : 61));
        String s1 = OpenHelpRtcChimeraActivity.a(this.getIntent().getExtras());
        Intent intent1 = new Intent().setClassName(this.getApplicationContext(), "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity");
        intent1.putExtra("play_store_key", "play_store_value");
        intent1.putExtra("invitationId", s1);
        PendingIntent pendingIntent0 = cjok.a(this.getApplicationContext(), 10104, intent1, 0xA000000);
        Context context0 = this.getApplicationContext();
        bayn bayn0 = bayn.f(context0);
        juo juo0 = new juo(context0, "open_helprtc_channel_id");
        juo0.D("Install app for screen share");
        juo0.m = 1;
        juo0.E(3);
        juo0.s(avyq.a(this, 0x7F080CAE));
        juo0.k("Tap to install from the Play Store");
        juo0.h = pendingIntent0;
        juo0.h(true);
        if(bayn0.c("open_helprtc_channel_id") == null) {
            bayn0.p(new NotificationChannel("open_helprtc_channel_id", "Support", 4));
        }
        if(htkq.e()) {
            Notification notification0 = juo0.a();
            bayn0.w(0x1008, evuh.bI, notification0);
        }
        else {
            bayn0.u(0x1008, juo0.a());
        }
        this.moveTaskToBack(true);
    }

    private static boolean h(Intent intent0) {
        return intent0.getExtras() != null && "launch_source_gcm_value".equals(intent0.getExtras().getString("launch_source_key"));
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 100) {
            int v2 = btkq.a(this);
            int v3 = v2 <= 0 ? 0 : 1;
            if(v3 == 0 || ((long)v2) <= htkd.j()) {
                String s = OpenHelpRtcChimeraActivity.a((this.getIntent() == null ? null : this.getIntent().getExtras()));
                HelpConfig helpConfig0 = new HelpConfig();
                helpConfig0.b = "com.google.android.apps.helprtc";
                helpConfig0.e = bttu.a(s);
                Context context0 = this.getApplicationContext();
                if(this.k == null) {
                    this.k = new bblp(0x7FFFFFFF, 9);
                }
                this.k.execute(new btwm(context0, helpConfig0, s, this.k, this.l));
                this.c(s, (1 == v3 ? 0xA1 : 0xA0), (1 == v3 ? 67 : 66));
                Toast.makeText(this, "Google Support Services has not been installed", 1).show();
                this.finishAndRemoveTask();
            }
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.l = new btti(this);
        this.requestWindowFeature(1);
        if(OpenHelpRtcChimeraActivity.h(this.getIntent())) {
            this.g();
            return;
        }
        this.finishAndRemoveTask();
    }

    @Override  // xoi
    protected final void onDestroy() {
        btti btti0 = this.l;
        if(btti0 != null) {
            btti0.close();
        }
        super.onDestroy();
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        if(OpenHelpRtcChimeraActivity.h(intent0) && this.m) {
            this.startActivity(intent0);
            return;
        }
        if(OpenHelpRtcChimeraActivity.h(intent0) && !this.m) {
            this.setIntent(intent0);
            this.g();
            return;
        }
        if(intent0.getExtras() != null && "play_store_value".equals(intent0.getExtras().getString("play_store_key"))) {
            this.f(intent0.getExtras().getString("invitationId"));
            return;
        }
        if(intent0.getExtras() != null && "launch_source_package_update_value".equals(intent0.getExtras().getString("launch_source_key"))) {
            String s = OpenHelpRtcChimeraActivity.a(this.getIntent().getExtras());
            Bundle bundle0 = intent0.getExtras();
            this.c(s, ("android.intent.action.PACKAGE_CHANGED".equals(bundle0.getString("package_change_type_key")) ? 0x9F : 0x9E), ("android.intent.action.PACKAGE_CHANGED".equals(bundle0.getString("package_change_type_key")) ? 65 : 0x40));
            this.g();
        }
    }
}

