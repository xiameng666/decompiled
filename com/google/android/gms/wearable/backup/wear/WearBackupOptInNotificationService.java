package com.google.android.gms.wearable.backup.wear;

import MessageLite;
import android.content.Context;
import aqjk;
import baun;
import bbdg;
import ccmq;
import cjtb;
import cljp;
import clkn;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import fcgf;
import fctt;
import ffck;
import frce;
import frie;
import frif;
import frli;
import glzd;
import gmap;
import gmbu;
import gmcd;
import hzub;

public class WearBackupOptInNotificationService extends GmsTaskBoundService {
    public static final baun a;

    static {
        WearBackupOptInNotificationService.a = new fcgf(new String[]{"OptInNotificationService"});
    }

    public static void d(Context context0, int v, long v1) {
        long v2 = hzub.a.d().f() + v1;
        long v3 = hzub.a.d().h();
        WearBackupOptInNotificationService.a.h("Scheduling opt-in notification task with %d seconds delay", new Object[]{v2});
        cljp cljp0 = cljp.a(context0);
        clkn clkn0 = new clkn();
        clkn0.t("wear_backup_opt_in_notification_service");
        clkn0.p = true;
        clkn0.v(v);
        clkn0.w("com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService");
        clkn0.e(v2, v3 + v2);
        cljp0.f(clkn0.a());
    }

    public static boolean e(Context context0) {
        boolean z = new aqjk(context0).i();
        WearBackupOptInNotificationService.a.d("isBackupEnabled=%b", new Object[]{Boolean.valueOf(z)});
        return z;
    }

    public static frli f(Context context0) {
        frie frie0 = frif.a();
        frce frce0 = new frce(context0);
        frce0.d("wearable");
        frce0.e("wear_backup_opt_in_notification.pb");
        frie0.f(frce0.a());
        frie0.e(((MessageLite)ffck.a));
        frif frif0 = frie0.a();
        return cjtb.a.a(frif0);
    }

    public static gmcd g() {
        WearBackupOptInNotificationService.a.d("Notification disabled: device is not wearable", new Object[0]);
        return gmbu.i(Boolean.valueOf(false));
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        ccmq.a().a(bbdg.nD);
        baun baun0 = WearBackupOptInNotificationService.a;
        baun0.d("onRunTaskAsync", new Object[0]);
        if(WearBackupOptInNotificationService.e(this)) {
            baun0.j("Backup is already enabled, not showing notification", new Object[0]);
            return gmbu.i(Integer.valueOf(0));
        }
        return glzd.g(WearBackupOptInNotificationService.g(), new fctt(this), gmap.a);
    }
}

