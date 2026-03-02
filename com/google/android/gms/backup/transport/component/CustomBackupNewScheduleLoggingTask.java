package com.google.android.gms.backup.transport.component;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import aqjk;
import aqnj;
import aqql;
import aqra;
import aqsl;
import aqso;
import aqvc;
import aqvd;
import aqvj;
import atfe;
import atff;
import atfg;
import atfh;
import atfj;
import baun;
import bbdg;
import ccmq;
import cljp;
import clks;
import clkz;
import clla;
import cllr;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import gful_cronetEngineProvider;
import gfus;
import ghyr;
import ghys;
import giat;
import gibv;
import gibw;
import hqkm;

public class CustomBackupNewScheduleLoggingTask extends GmsTaskBoundService {
    private static final baun a;
    private final gful_cronetEngineProvider b;
    private final gful_cronetEngineProvider c;

    static {
        CustomBackupNewScheduleLoggingTask.a = aqql.a("CustomBackupNewScheduleLog");
    }

    public CustomBackupNewScheduleLoggingTask() {
        this.b = gfus.a(((gful_cronetEngineProvider)new atfg(this)));
        this.c = gfus.a(((gful_cronetEngineProvider)new atfh(this)));
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.mi);
        if(!CustomBackupNewScheduleLoggingTask.e()) {
            CustomBackupNewScheduleLoggingTask.a.j("Task is disabled.", new Object[0]);
            return 2;
        }
        baun baun0 = CustomBackupNewScheduleLoggingTask.a;
        baun0.j("Running", new Object[0]);
        hqkm hqkm0 = hqkm.a;
        if(hqkm0.b().j()) {
            baun0.j("Starting custom backups intent operation", new Object[0]);
            Intent intent0 = IntentOperation.getStartIntent(this, "com.google.android.gms.backup.settings.backupnow.RunCustomBackupsIntentOperation", "com.google.android.gms.backup.RUN_CUSTOM_BACKUPS");
            intent0.putExtra("require_unmetered_network", atff.a(this).a);
            this.startService(intent0);
        }
        if(hqkm0.b().e()) {
            int v = 5;
            baun0.j("Logging backup state", new Object[0]);
            atfj atfj0 = (atfj)this.b.mr();
            boolean z = new aqjk(this).i();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giat.a).v_newBuilder();
            int v1 = aqsl.a(this.getPackageManager()).c().ordinal();
            int v2 = 4;
            switch(v1) {
                case 0: {
                    v = 2;
                    break;
                }
                case 1: {
                    v = 3;
                    break;
                }
                case 2: {
                    v = 6;
                    break;
                }
                default: {
                    if(v1 == 3) {
                        v = 4;
                    }
                    else {
                        switch(v1) {
                            case 4: {
                                break;
                            }
                            case 5: {
                                v = 7;
                                break;
                            }
                            default: {
                                throw new RuntimeException(null, null);
                            }
                        }
                    }
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giat)hftp0.b_message).d = v - 1;
            ((giat)hftp0.b_message).b |= 2;
            switch(v) {
                case 4: {
                    try {
                        if(this.getPackageManager().getPackageInfo("com.google.android.apps.photos", 0).versionCode >= 222407) {
                            goto label_43;
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        CustomBackupNewScheduleLoggingTask.a.j("Photos APK not found on the device.", new Object[0]);
                    }
                    break;
                label_43:
                    aqso aqso0 = (aqso)this.c.mr();
                    aqvc aqvc0 = aqvd.a();
                    aqvc0.c(20);
                    aqvj aqvj0 = aqso0.b(aqvc0.a()).a;
                    if(aqvj0 != aqvj.c) {
                        v2 = aqvj0 == aqvj.b ? 3 : 2;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((giat)hftp0.b_message).c = v2 - 1;
                    ((giat)hftp0.b_message).b |= 1;
                    break;
                }
                case 3: 
                case 6: {
                    break;
                }
                default: {
                    goto label_43;
                }
            }
            boolean z1 = new aqnj(this).a().c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giat giat0 = (giat)hftp0.b_message;
            giat0.b |= 0x40;
            giat0.i = z1;
            giat giat1 = (giat)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gibv.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gibv)hftv0).b |= 1;
            ((gibv)hftv0).c = z;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gibv gibv0 = (gibv)hftp1.b_message;
            giat1.getClass();
            gibv0.d = giat1;
            gibv0.b |= 2;
            ProtoLiteBuilder hftp2 = aqra.b();
            gibv gibv1 = (gibv)hftp1.N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp2.b_message;
            gibv1.getClass();
            ghys0.at = gibv1;
            ghys0.d |= 0x400000;
            ghys ghys1 = (ghys)hftp2.N_build();
            atfj0.a.a(ghys1, ghyr.aH);
            return 0;
        }
        baun0.j("Logging without backup state", new Object[0]);
        ((atfj)this.b.mr()).a.a(((ghys)aqra.b().N_build()), ghyr.aH);
        return 0;
    }

    public static void d(Context context0) {
        if(!CustomBackupNewScheduleLoggingTask.e()) {
            CustomBackupNewScheduleLoggingTask.a.j("Not scheduling, disabled.", new Object[0]);
            return;
        }
        atfj atfj0 = new atfj(context0);
        if(!CustomBackupNewScheduleLoggingTask.e()) {
            CustomBackupNewScheduleLoggingTask.a.j("Not scheduling, disabled.", new Object[0]);
            return;
        }
        atfe atfe0 = atff.a(context0);
        clks clks0 = new clks();
        clks0.w("com.google.android.gms.backup.transport.component.CustomBackupNewScheduleLoggingTask");
        clks0.t("custom_backup_schedule_logging");
        clks0.l(true);
        clks0.p = true;
        clkz clkz0 = clkz.j;
        clks0.a = clkz0;
        hqkm hqkm0 = hqkm.a;
        if(hqkm0.b().k()) {
            clks0.v(1);
        }
        else {
            clks0.v(2);
        }
        boolean z = atfe0.a;
        if(z) {
            clks0.k();
        }
        boolean z1 = atfe0.c;
        if(z1) {
            clks0.e();
        }
        clla clla0 = clks0.a();
        cljp.a(context0).f(clla0);
        CustomBackupNewScheduleLoggingTask.a.j("Task is scheduled to run", new Object[0]);
        int v = clkz0.g;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gibw)hftv0).b |= 1;
        ((gibw)hftv0).c = z;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gibw gibw0 = (gibw)hftp0.b_message;
        gibw0.b |= 2;
        gibw0.d = z1;
        if(hqkm0.b().g()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gibw gibw1 = (gibw)hftp0.b_message;
            gibw1.b |= 4;
            gibw1.e = v;
        }
        ProtoLiteBuilder hftp1 = aqra.b();
        gibw gibw2 = (gibw)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gibw2.getClass();
        ghys0.as = gibw2;
        ghys0.d |= 0x200000;
        ghys ghys1 = (ghys)hftp1.N_build();
        atfj0.a.a(ghys1, ghyr.aG);
    }

    private static boolean e() {
        return hqkm.a.b().b();
    }
}

