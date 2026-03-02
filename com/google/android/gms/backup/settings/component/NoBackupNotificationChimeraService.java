package com.google.android.gms.backup.settings.component;

import MessageLite;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build.VERSION;
import aqee;
import aqhl;
import aqjk;
import aqjl;
import aqqk;
import aqql;
import aqyp;
import aqzc;
import aqzy;
import ashw;
import ashx;
import ashy;
import ashz;
import asia;
import avyq;
import baun;
import bayn;
import bbdg;
import ccmq;
import cjok;
import cjtb;
import cljp;
import clkn;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import evuh;
import frce;
import frie;
import frif;
import frli;
import giah;
import gieg;
import glyq;
import glzd;
import gmap;
import hqii;
import hqiq;
import hqlh;
import hqna;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class NoBackupNotificationChimeraService extends GmsTaskChimeraService {
    public static final baun a;

    static {
        NoBackupNotificationChimeraService.a = aqql.a("NoBackupNotification");
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.mj);
        if(NoBackupNotificationChimeraService.f(this)) {
            if(!new aqjk(this).i()) {
                NoBackupNotificationChimeraService.a.j("Backup is disabled, rescheduling.", new Object[0]);
                NoBackupNotificationChimeraService.e(this);
                return 0;
            }
            bayn bayn0 = bayn.f(this);
            if(hqlh.g() && bayn0 == null) {
                NoBackupNotificationChimeraService.a.f("Unable to send notifications.", new Object[0]);
                return 2;
            }
            evuh evuh0 = evuh.am;
            PendingIntent pendingIntent0 = cjok.a(this, 0, aqzc.i(giah.i), 0xA000000);
            hqna.a.b().c();
            aqjl aqjl0 = aqjl.a;
            String s = aqjl0.m(this) ? "Keep your device idle, charging, and connected to Wi-Fi for at least 2 hours" : "Tap to confirm backup settings";
            Notification.Builder notification$Builder0 = aqyp.b(this).setContentIntent(pendingIntent0).setAutoCancel(true).setContentTitle("Backup incomplete").setContentText(s);
            if(hqiq.a.c().h()) {
                notification$Builder0.setStyle(new Notification.BigTextStyle());
            }
            if(hqiq.e()) {
                aqyp.d(this, notification$Builder0);
            }
            else {
                notification$Builder0.setSmallIcon(avyq.a(this, 0x7F080B03)).setColor(this.getColor(0x7F060E7D));  // color:quantum_googblue600
            }
            bayn0.y("com.google.android.backup.notification.no_backup.tag", 3, evuh0, notification$Builder0.build());
            int v = NoBackupNotificationChimeraService.g(this);
            NoBackupNotificationChimeraService.a.h("Showing notification, times: %d", new Object[]{v});
            NoBackupNotificationChimeraService.d(this, v, true);
            aqqk aqqk0 = new aqqk(this);
            boolean z = aqjl0.m(this);
            long v1 = NoBackupNotificationChimeraService.h(v);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gieg.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gieg)hftv0).b |= 1;
            ((gieg)hftv0).c = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gieg)hftv1).b |= 2;
            ((gieg)hftv1).d = v1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gieg)hftv2).b |= 4;
            ((gieg)hftv2).e = z;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gieg)hftp0.b_message).h = 1;
            ((gieg)hftp0.b_message).b |= 0x20;
            ashw.a(((gieg)hftp0.N_build()), aqqk0);
            return 0;
        }
        NoBackupNotificationChimeraService.a.j("Disabled, not running and not rescheduling", new Object[0]);
        return 2;
    }

    public static void d(Context context0, int v, boolean z) {
        long v1 = NoBackupNotificationChimeraService.h(v);
        long v2 = TimeUnit.MINUTES.toSeconds(((long)(((int)hqii.a.e().j()))));
        long v3 = TimeUnit.MINUTES.toSeconds(v1);
        long v4 = TimeUnit.MINUTES.toSeconds(v1) + v2;
        cljp cljp0 = cljp.a(context0);
        clkn clkn0 = new clkn();
        clkn0.t("no_backup_notification_service");
        clkn0.p = true;
        clkn0.u(z);
        clkn0.j = "com.google.android.gms.backup.component.NoBackupNotificationService";
        clkn0.e(v3, v4);
        cljp0.f(clkn0.a());
        NoBackupNotificationChimeraService.a.j("Scheduled task to run in %d seconds, overriding: %b", new Object[]{v3, Boolean.valueOf(z)});
    }

    public static void e(Context context0) {
        boolean z1;
        boolean z = false;
        if(NoBackupNotificationChimeraService.f(context0)) {
            frce frce0 = new frce(context0);
            frce0.d("backup");
            frce0.e("NoBackupNotificationSettings.pb");
            Uri uri0 = frce0.a();
            frie frie0 = frif.a();
            frie0.f(uri0);
            frie0.e(((MessageLite)aqhl.a));
            frif frif0 = frie0.a();
            frli frli0 = cjtb.a.a(frif0);
            try {
                z1 = ((Boolean)((glyq)glzd.f(frli0.a(), new ashx(), gmap.a)).u()).booleanValue();
            }
            catch(InterruptedException | ExecutionException exception0) {
                asia.a.g("Failed to mark count reset status from the data store", exception0, new Object[0]);
                z1 = false;
            }
            boolean z2 = aqjl.a.m(context0);
            if(z2) {
                NoBackupNotificationChimeraService.i(context0);
                if(z1) {
                    try {
                        ((glyq)frli0.b(new ashz(), gmap.a)).u();
                    }
                    catch(InterruptedException | ExecutionException exception1) {
                        asia.a.g("Failed to clear count reset status from the data store", exception1, new Object[0]);
                    }
                }
                z = true;
            }
            else if(!z1) {
                NoBackupNotificationChimeraService.i(context0);
                try {
                    ((glyq)frli0.b(new ashy(), gmap.a)).u();
                }
                catch(InterruptedException | ExecutionException exception2) {
                    asia.a.g("Failed to mark count reset status from the data store", exception2, new Object[0]);
                }
                z = true;
            }
            aqqk aqqk0 = new aqqk(context0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gieg.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gieg)hftv0).b |= 8;
            ((gieg)hftv0).f = z1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gieg)hftv1).b |= 4;
            ((gieg)hftv1).e = z2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gieg)hftv2).b |= 16;
            ((gieg)hftv2).g = z;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gieg)hftp0.b_message).h = 2;
            ((gieg)hftp0.b_message).b |= 0x20;
            ashw.a(((gieg)hftp0.N_build()), aqqk0);
            return;
        }
        NoBackupNotificationChimeraService.a.j("Disabled, not rescheduling", new Object[0]);
    }

    public static boolean f(Context context0) {
        aqzy.a(context0);
        hqna.e();
        if(hqiq.a.c().e() && ((long)Build.VERSION.SDK_INT) >= hqii.a.e().m()) {
            Intent intent0 = new Intent();
            intent0.setClassName(context0, "com.google.android.gms.backup.component.NoBackupNotificationService");
            return context0.getPackageManager().resolveService(intent0, 0) != null && new aqee(context0).a() != null;
        }
        return false;
    }

    private static int g(Context context0) {
        int v1;
        synchronized(NoBackupNotificationChimeraService.class) {
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
            v1 = sharedPreferences0.getInt("times_shown", 0);
            if(!sharedPreferences0.edit().putInt("times_shown", v1 + 1).commit()) {
                NoBackupNotificationChimeraService.a.m("Failed to write notification preferences", new Object[0]);
            }
            NoBackupNotificationChimeraService.a.j("Times showed notification: %d", new Object[]{((int)(v1 + 1))});
        }
        return v1 + 1;
    }

    private static long h(int v) {
        String[] arr_s = hqii.a.e().n().split(";");
        Object[] arr_object = {Arrays.toString(arr_s)};
        NoBackupNotificationChimeraService.a.j("Current back off values: %s", arr_object);
        return (long)Long.valueOf(arr_s[Math.min(v, arr_s.length - 1)]);
    }

    private static void i(Context context0) {
        baun baun0 = NoBackupNotificationChimeraService.a;
        baun0.j("About to reset notification count", new Object[0]);
        bayn bayn0 = bayn.f(context0);
        if(hqlh.g() && bayn0 == null) {
            baun0.f("Unable to get NotificationManager.", new Object[0]);
            return;
        }
        bayn0.o("com.google.android.backup.notification.no_backup.tag", 3, evuh.am);
        NoBackupNotificationChimeraService.j(context0);
        NoBackupNotificationChimeraService.d(context0, 0, true);
    }

    private static void j(Context context0) {
        synchronized(NoBackupNotificationChimeraService.class) {
            baun baun0 = NoBackupNotificationChimeraService.a;
            baun0.j("Resetting the number of times shown.", new Object[0]);
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
            if(sharedPreferences0.getInt("times_shown", 0) != 0 && !sharedPreferences0.edit().putInt("times_shown", 0).commit()) {
                baun0.m("Failed to erase notification preferences", new Object[0]);
            }
        }
    }
}

