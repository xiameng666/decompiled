package com.google.android.gms.drivingmode;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import bhlo;
import bhlr;
import gkee;
import gkef;
import hqpd;
import juh;
import juk;
import juo;

public class DrivingModeLocationNotificationIntentOperation extends bhlr {
    @Override  // bhlr
    public final void onHandleIntent(Intent intent0) {
        Log.i("CAR.DRIVINGMODE", "DrivingModeNotificationIntentOperation onHandleIntent from location module");
        if(intent0.getAction() == null) {
            return;
        }
        switch(intent0.getAction()) {
            case "com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SHOW": {
                this.a.k();
                this.a.l();
                return;
            }
            case "com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SNOOZE": {
                Log.i("CAR.DRIVINGMODE", "Snooze Driving Mode launch from notification.");
                this.b.b(gkef.bO, gkee.r);
                bhlo bhlo0 = this.a;
                bhlo0.j();
                long v = hqpd.c();
                long v1 = SystemClock.elapsedRealtime() + v;
                PendingIntent pendingIntent0 = bhlo0.e();
                bhlo0.a.i("CAR.DRIVINGMODE", 3, v1, pendingIntent0, "");
                juh juh0 = new juh(0, "Turn on now", bhlo0.d());
                juh juh1 = new juh(0, "Stop", bhlo0.b());
                String s = bhlo0.h(v, 0x7F13000F, 0x7F130010);  // plurals:car_driving_mode_notification_eta_mins
                juo juo0 = bhlo0.f();
                juo0.k(s);
                juk juk0 = new juk();
                juk0.e(s);
                juo0.v(juk0);
                juo0.K(true);
                juo0.y(juh0);
                juo0.y(juh1);
                bhlo0.o(0x300CEFC, juo0.a());
                return;
            }
            default: {
                Log.w("CAR.DRIVINGMODE", "Unexpected notification intent action received: " + intent0.getAction());
            }
        }
    }
}

