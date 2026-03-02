package com.google.android.gms.backup.transport.component;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.UserHandle;
import aqjk;
import aqql;
import aqqo;
import aqra;
import atfe;
import atff;
import atfi;
import atfj;
import bbcu;
import bbdg;
import bblp;
import bboh;
import ccmq;
import com.google.android.chimera.JobService;
import ghyr;
import ghys;
import gidb;
import gmcg;
import hqgx;
import hqhn;
import hqii;
import java.util.concurrent.TimeUnit;

public class GmsBackupSchedulerChimeraService extends JobService {
    public static final aqql a;
    private static final bboh b;
    private final gmcg c;
    private boolean d;

    static {
        GmsBackupSchedulerChimeraService.b = bboh.b("GmsBackupSchedulerChimeraService", bbcu.dF);
        GmsBackupSchedulerChimeraService.a = new aqql(new String[]{"GmsBackupScheduler"});
    }

    public GmsBackupSchedulerChimeraService() {
        this.c = new bblp(1, 10);
        this.d = true;
    }

    public static void a(Context context0) {
        hqii hqii0 = hqii.a;
        long v = hqii0.e().c();
        if(hqii.h()) {
            Intent intent0 = new Intent();
            intent0.setClassName(context0, "com.google.android.gms.backup.component.GmsBackupSchedulerService");
            ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent0, 0);
            if(resolveInfo0 != null && resolveInfo0.serviceInfo != null && "android.permission.BIND_JOB_SERVICE".equals(resolveInfo0.serviceInfo.permission)) {
                atfe atfe0 = atff.b(context0);
                JobInfo jobInfo0 = new JobInfo.Builder(1, new ComponentName(context0, "com.google.android.gms.backup.component.GmsBackupSchedulerService")).setRequiresCharging(atfe0.c).setRequiresDeviceIdle(atfe0.b).setRequiredNetworkType((atfe0.a ? 2 : 3)).setMinimumLatency(TimeUnit.MINUTES.toMillis(v)).build();
                JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
                try {
                    if((hqii0.e().A() ? jobScheduler0.scheduleAsPackage(jobInfo0, "com.google.android.gms", UserHandle.myUserId(), "GmsBackupSchedulerChimeraService") : jobScheduler0.scheduleAsPackage(jobInfo0, "com.google.android.gms.backup", UserHandle.myUserId(), "GmsBackupSchedulerChimeraService")) == 1) {
                        goto label_17;
                    }
                }
                catch(Exception exception0) {
                    GmsBackupSchedulerChimeraService.a.g("", exception0, new Object[0]);
                    long v1 = hqhn.c();
                    aqqo.a(GmsBackupSchedulerChimeraService.b, exception0, v1);
                }
                GmsBackupSchedulerChimeraService.a.j("Error scheduling job.", new Object[0]);
                return;
            label_17:
                GmsBackupSchedulerChimeraService.a.j("Scheduled task to run in %d minutes, while idle: %b, require charging: %b, require wifi: %b", new Object[]{v, Boolean.valueOf(atfe0.b), Boolean.valueOf(atfe0.c), Boolean.valueOf(atfe0.a)});
                return;
            }
            GmsBackupSchedulerChimeraService.a.j("Ineligible, not scheduling.", new Object[0]);
            return;
        }
        GmsBackupSchedulerChimeraService.a.j("Disabled, not scheduling.", new Object[0]);
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        ccmq.a().a(bbdg.mi);
    }

    @Override  // com.google.android.chimera.JobService
    public final boolean onStartJob(JobParameters jobParameters0) {
        aqql aqql0 = GmsBackupSchedulerChimeraService.a;
        aqql0.h("Hooray! Backup time!", new Object[0]);
        atfj atfj0 = new atfj(this);
        if(hqgx.d()) {
            atfj0.b(4);
        }
        if(hqgx.e()) {
            aqql0.h("Disabled, not running.", new Object[0]);
            return false;
        }
        if(!hqii.h()) {
            aqql0.m("Disabled, not running and cancelling future jobs.", new Object[0]);
            ProtoLiteBuilder hftp0 = aqra.b();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidb.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gidb gidb0 = (gidb)hftp1.b_message;
            gidb0.b |= 1;
            gidb0.c = false;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp0.b_message;
            gidb gidb1 = (gidb)hftp1.N_build();
            gidb1.getClass();
            ghys0.D = gidb1;
            ghys0.c |= 4;
            ghys ghys1 = (ghys)hftp0.N_build();
            atfj0.a.a(ghys1, ghyr.F);
            this.d = false;
            ((JobScheduler)this.getSystemService("jobscheduler")).cancel(1);
            return false;
        }
        if(!new aqjk(this).i()) {
            aqql0.m("Backup is disabled, not running.", new Object[0]);
            ProtoLiteBuilder hftp2 = aqra.b();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gidb.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp3.b_message;
            ((gidb)hftv0).b |= 1;
            ((gidb)hftv0).c = true;
            if(!hftv0.isImmutable()) {
                hftp3.ensureMutable();
            }
            gidb gidb2 = (gidb)hftp3.b_message;
            gidb2.b |= 2;
            gidb2.d = false;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ghys ghys2 = (ghys)hftp2.b_message;
            gidb gidb3 = (gidb)hftp3.N_build();
            gidb3.getClass();
            ghys2.D = gidb3;
            ghys2.c |= 4;
            ghys ghys3 = (ghys)hftp2.N_build();
            atfj0.a.a(ghys3, ghyr.F);
            return false;
        }
        hqii.a.e().B();
        atfi atfi0 = new atfi(this, atfj0, jobParameters0);
        this.c.execute(atfi0);
        return true;
    }

    @Override  // com.google.android.chimera.JobService
    public final boolean onStopJob(JobParameters jobParameters0) {
        return this.d;
    }
}

