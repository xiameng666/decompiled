package com.google.android.gms.location.settings;

import a;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.UserManager;
import batl;
import bbdg;
import bbnp;
import bbnu;
import bboh;
import ccmq;
import cnvi;
import cnvs;
import cnvz;
import com.google.android.chimera.IntentOperation;
import huuq;
import j..util.Objects;

public class LocationOffWarningIntentOperation extends IntentOperation {
    static final bboh a;
    public static final int b;

    static {
        LocationOffWarningIntentOperation.a = bboh.a("LOWD");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.jc);
        long v = System.currentTimeMillis();
        Long long0 = (long)0L;
        long v1 = (long)(((Long)cnvz.i(cnvz.c().d(new cnvs(), long0), long0)));
        if(v < v1) {
            cnvz.c().e(0L);
            if(v1 - v > huuq.b()) {
                goto label_7;
            }
        }
        else {
        label_7:
            if(Objects.equals(intent0.getAction(), "com.google.android.gms.location.settings.SHOW_LOWD") && !bbnp.e(this)) {
                Object object0 = this.getSystemService("audio");
                batl.s(object0);
                if(((AudioManager)object0).getMode() != 2) {
                    huuq huuq0 = huuq.a;
                    if(huuq0.c().f() || !ActivityManager.isRunningInTestHarness() && !ActivityManager.isRunningInUserTestHarness()) {
                        if(huuq0.c().g()) {
                            UserManager userManager0 = (UserManager)this.getSystemService("user");
                            if(userManager0 == null || !userManager0.hasUserRestriction("no_share_location") && !userManager0.hasUserRestriction("no_config_location")) {
                                goto label_16;
                            }
                        }
                        else {
                        label_16:
                            RestrictionsManager restrictionsManager0 = (RestrictionsManager)this.getSystemService("restrictions");
                            if(restrictionsManager0 == null) {
                            label_20:
                                if(((double)bbnu.a(this)) >= huuq0.c().a() && bbnu.k(this)) {
                                    int v2 = intent0.getIntExtra("EXTRA_OLD_LOCATION_MODE", 0);
                                    if(v2 != 0) {
                                        long v3 = cnvz.c().a();
                                        if(System.currentTimeMillis() - cnvz.c().b() >= v3) {
                                            long v4 = Math.min(Math.max(v3 * huuq0.c().b(), huuq0.c().e()), huuq0.c().d());
                                            cnvz.c().f(new cnvi(System.currentTimeMillis()));
                                            cnvz.c().g(v4);
                                            try {
                                                Intent intent1 = new Intent();
                                                intent1.setComponent(new ComponentName(this, "com.google.android.gms.location.settings.LocationOffWarningActivity"));
                                                intent1.putExtra("previousMode", v2);
                                                intent1.setFlags(0x10000000);
                                                this.startActivity(intent1);
                                            }
                                            catch(SecurityException securityException0) {
                                                a.ae(LocationOffWarningIntentOperation.a.i(), "failed to start LOWD", securityException0);
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                Bundle bundle0 = restrictionsManager0.getApplicationRestrictions();
                                if(bundle0 == null || !bundle0.getBoolean("suppressLocationDialog", false)) {
                                    goto label_20;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

