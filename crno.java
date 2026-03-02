import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

public final class crno extends crbz {
    private JobScheduler a;

    public crno(crkt crkt0) {
        super(crkt0);
    }

    @Override  // crbz
    protected final void d() {
        this.a = (JobScheduler)this.aj().getSystemService("jobscheduler");
    }

    @Override  // crbz
    protected final boolean p() {
        return true;
    }

    final int q() {
        return 0x34C54FA2;
    }

    final crta r() {
        this.a();
        this.n();
        if(this.a == null) {
            return crta.g;
        }
        if(!this.am().z()) {
            return crta.h;
        }
        if(this.f().a < 119000L) {
            return crta.f;
        }
        if(!crqx.ax(this.aj())) {
            return crta.c;
        }
        return this.k().F() ? crta.b : crta.e;
    }

    public final void s(long v) {
        this.a();
        this.n();
        if(this.a != null && this.a.getPendingJob(this.q()) != null) {
            this.aJ().k.a("[sgtm] There\'s an existing pending job, skip this schedule.");
            return;
        }
        crta crta0 = this.r();
        if(crta0 != crta.b) {
            this.aJ().k.b("[sgtm] Not eligible for Scion upload", crta0.name());
            return;
        }
        this.aJ().k.b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(v));
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        int v1 = this.q();
        JobScheduler jobScheduler0 = this.a;
        batl.s(jobScheduler0);
        this.aJ().k.b("[sgtm] Scion upload job scheduled with result", (jobScheduler0.schedule(new JobInfo.Builder(v1, new ComponentName(this.aj(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(v).setOverrideDeadline(v + v).setExtras(persistableBundle0).build()) == 1 ? "SUCCESS" : "FAILURE"));
    }
}

