package com.google.android.gms.update.execution;

import android.app.job.JobParameters;
import android.os.SystemClock;
import baun;
import brzr;
import com.google.android.chimera.JobService;
import ezxn;
import ezye;
import fabk;
import gdqs;

public class ChimeraUpdateJobService extends JobService {
    public static final baun a;
    public static final Object b;
    private brzr c;
    private long d;

    static {
        ChimeraUpdateJobService.a = fabk.e("UpdateJobService");
        ChimeraUpdateJobService.b = new Object();
    }

    private final brzr a() {
        if(this.c == null) {
            this.c = new brzr(this, this.getClass(), 29);
        }
        return this.c;
    }

    @Override  // com.google.android.chimera.JobService
    public final boolean onStartJob(JobParameters jobParameters0) {
        ChimeraUpdateJobService.a.d("onStartJob", new Object[0]);
        this.d = SystemClock.elapsedRealtime();
        try(gdqs gdqs0 = this.a().k("onStartJob")) {
            this.startService(ezye.d(this));
        }
        return true;
    }

    @Override  // com.google.android.chimera.JobService
    public final boolean onStopJob(JobParameters jobParameters0) {
        long v = SystemClock.elapsedRealtime();
        ChimeraUpdateJobService.a.d("onStopJob: runtime=%d", new Object[]{((long)(v - this.d))});
        Object[] arr_object = {jobParameters0.getStopReason()};
        ChimeraUpdateJobService.a.d("onStopJob: stopReason=%d", arr_object);
        try(gdqs gdqs0 = this.a().k("onStopJob")) {
            ((ezxn)ezxn.b.b()).a(0x73);
        }
        return false;
    }
}

