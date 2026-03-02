package com.google.android.gms.ipa.base;

import android.content.Context;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Files;
import bbcu;
import bbdg;
import bboh;
import caka;
import cakb;
import cakc;
import cakk;
import camd;
import canf;
import cank;
import ccmq;
import cliz;
import clja;
import cljb;
import cljp;
import clkm;
import clkq;
import clks;
import clla;
import cllp;
import cllr;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.BatchIndexingIntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.CorporaMaintenanceIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import ggtj;
import hrwa;
import hrwu;
import huhz;
import java.util.concurrent.TimeUnit;

public class IpaGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final int a;
    private static final bboh b;
    private static final cliz c;
    private static final cliz d;

    static {
        IpaGcmTaskChimeraService.b = bboh.b("GmscoreIpa", bbcu.ee);
        IpaGcmTaskChimeraService.c = new cliz(MediaStore.Files.getContentUri("external"), 1);
        IpaGcmTaskChimeraService.d = new cliz(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, 1);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.uX);
        switch(cllr0.a) {
            case "AppUsageReportGeneration": {
                cakk.a().b(new cakb(this));
                return 0;
            }
            case "AppsCorpusMaintenance": {
                cakk.a().b(new caka());
                return 0;
            }
            case "LogDiffBetweenMediastoreAndIcing": {
                cakk.a().b(new cakc(this));
                return 0;
            }
            case "MediaStoreBatchIndexingTask": {
                this.startService(IntentOperation.getStartIntent(this, BatchIndexingIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.BATCH_INDEX"));
                return 0;
            }
            case "MediaStoreCorporaMaintenance": {
                this.startService(IntentOperation.getStartIntent(this, CorporaMaintenanceIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.REINDEX"));
                return 0;
            }
            case "MediaStoreInstantIndexTask": {
                try {
                    Class class0 = camd.class;
                    synchronized(class0) {
                        if(camd.b == null) {
                            camd.b = new camd(this);
                        }
                        camd.b.onChange(false);
                    }
                }
                catch(Throwable throwable0) {
                    cljp cljp0 = cljp.a(this);
                    if(huhz.l() && huhz.n()) {
                        cljp0.f(IpaGcmTaskChimeraService.e());
                    }
                    throw throwable0;
                }
                cljp cljp1 = cljp.a(this);
                if(huhz.l() && huhz.n()) {
                    cljp1.f(IpaGcmTaskChimeraService.e());
                    return 0;
                }
                return 0;
            }
            default: {
                ((ggtj)((ggtj)IpaGcmTaskChimeraService.b.i()).ar(5977)).B("Unrecognized task tag: %s", cllr0.a);
                return 0;
            }
        }
    }

    public static void d(Context context0) {
        clla clla3;
        clla clla2;
        clla clla1;
        clla clla0;
        cljp cljp0 = cljp.a(context0);
        if(canf.c(context0)) {
            huhz huhz0 = huhz.a;
            if(huhz0.h().X()) {
                String s = new cank(context0.getSharedPreferences("MediastoreIndexerSharedPrefs", 0)).a.getString("maintenance_task_config", "");
                if(s == null || s.equals(canf.b(huhz.f(), huhz.e(), Boolean.valueOf(huhz.q())))) {
                    cljp0.f(IpaGcmTaskChimeraService.g(false));
                    goto label_12;
                }
                goto label_8;
            }
            else {
            label_8:
                cljp0.f(IpaGcmTaskChimeraService.g(true));
                cank cank0 = new cank(context0.getSharedPreferences("MediastoreIndexerSharedPrefs", 0));
                String s1 = canf.b(huhz.f(), huhz.e(), Boolean.valueOf(huhz.q()));
                cank0.a.edit().putString("maintenance_task_config", s1).commit();
            }
        label_12:
            if(hrwa.l()) {
                clks clks0 = IpaGcmTaskChimeraService.f("MediaStoreBatchIndexingTask", ((int)huhz0.h().n()));
                if(!huhz.p()) {
                    clks0.e();
                    clks0.j();
                }
                clla0 = clks0.a();
            }
            else {
                long v = TimeUnit.HOURS.toSeconds(huhz0.h().p());
                long v1 = TimeUnit.MINUTES.toSeconds(huhz0.h().o());
                clkq clkq0 = new clkq();
                clkq0.t("MediaStoreBatchIndexingTask");
                clkq0.i(huhz0.h().V());
                clkq0.y(2, 2);
                clkq0.x(huhz.p() ^ 1, 1);
                clkq0.f(huhz.p() ^ 1, 1);
                clkq0.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
                clkq0.v(1);
                if(hrwu.f()) {
                    clkq0.j(clkm.a(v));
                }
                else {
                    clkq0.a = v;
                    clkq0.b = v1;
                }
                clla0 = clkq0.a();
            }
            cljp0.f(clla0);
            if(huhz.o()) {
                if(hrwa.l()) {
                    clla1 = IpaGcmTaskChimeraService.f("LogDiffBetweenMediastoreAndIcing", ((int)huhz0.h().i())).a();
                }
                else {
                    long v2 = TimeUnit.DAYS.toSeconds(huhz0.h().j());
                    clkq clkq1 = new clkq();
                    clkq1.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
                    clkq1.t("LogDiffBetweenMediastoreAndIcing");
                    clkq1.x(0, 1);
                    clkq1.y(2, 2);
                    clkq1.v(0);
                    clkq1.j(clkm.a(v2));
                    clla1 = clkq1.a();
                }
                cljp0.f(clla1);
            }
        }
        if(huhz.l() && canf.c(context0)) {
            cljp0.f(IpaGcmTaskChimeraService.e());
        }
        if(huhz.j()) {
            if(hrwa.l()) {
                clks clks1 = IpaGcmTaskChimeraService.f("AppsCorpusMaintenance", ((int)huhz.a.h().d()));
                clks1.e();
                clks1.j();
                clla2 = clks1.a();
            }
            else {
                long v3 = TimeUnit.HOURS.toSeconds(huhz.a.h().f());
                long v4 = TimeUnit.MINUTES.toSeconds(huhz.a.h().e());
                clkq clkq2 = new clkq();
                clkq2.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
                clkq2.t("AppsCorpusMaintenance");
                clkq2.i(true);
                clkq2.y(2, 2);
                clkq2.x(1, 1);
                clkq2.u(huhz.a.h().U());
                if(hrwu.f()) {
                    clkq2.j(clkm.a(v3));
                }
                else {
                    clkq2.a = v3;
                    clkq2.b = v4;
                }
                clla2 = clkq2.a();
            }
            cljp0.f(clla2);
            if(huhz.i()) {
                if(hrwa.l() && !hrwa.a.b().b()) {
                    clla3 = IpaGcmTaskChimeraService.f("AppUsageReportGeneration", ((int)huhz.a.h().a())).a();
                }
                else {
                    long v5 = TimeUnit.HOURS.toSeconds(huhz.a.h().c());
                    long v6 = TimeUnit.MINUTES.toSeconds(huhz.a.h().b());
                    clkq clkq3 = new clkq();
                    clkq3.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
                    clkq3.t("AppUsageReportGeneration");
                    clkq3.x(0, 1);
                    clkq3.y(2, 2);
                    clkq3.v(1);
                    if(hrwu.f()) {
                        clkq3.j(clkm.a(v5));
                    }
                    else {
                        clkq3.a = v5;
                        clkq3.b = v6;
                    }
                    clla3 = clkq3.a();
                }
                cljp0.f(clla3);
            }
        }
    }

    private static cljb e() {
        clja clja0 = new clja();
        clja0.t("MediaStoreInstantIndexTask");
        clja0.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        clja0.v(1);
        clja0.x(0, 0);
        clja0.c(IpaGcmTaskChimeraService.c);
        if(huhz.k()) {
            clja0.c(IpaGcmTaskChimeraService.d);
        }
        return clja0.a();
    }

    private static clks f(String s, int v) {
        clks clks0 = new clks();
        clks0.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        clks0.q(s);
        clks0.l(false);
        clks0.m(v);
        clks0.v(2);
        return clks0;
    }

    private static cllp g(boolean z) {
        if(hrwa.l()) {
            clks clks0 = IpaGcmTaskChimeraService.f("MediaStoreCorporaMaintenance", ((int)huhz.a.h().r()));
            if(!huhz.p()) {
                clks0.e();
                clks0.j();
            }
            return clks0.a();
        }
        long v = TimeUnit.DAYS.toSeconds(huhz.f());
        long v1 = TimeUnit.HOURS.toSeconds(huhz.e());
        clkq clkq0 = new clkq();
        clkq0.t("MediaStoreCorporaMaintenance");
        clkq0.i(huhz.q());
        clkq0.y(2, 2);
        clkq0.x(huhz.p() ^ 1, 1);
        clkq0.f(huhz.p() ^ 1, 1);
        clkq0.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        clkq0.u(z);
        if(hrwu.f()) {
            clkq0.j(clkm.a(v));
            return clkq0.a();
        }
        clkq0.a = v;
        clkq0.b = v1;
        return clkq0.a();
    }
}

