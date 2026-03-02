import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.os.SystemClock;

public class crpx extends crqc {
    private final AlarmManager a;
    private crdj b;
    private Integer c;

    public crpx(crqq crqq0) {
        super(crqq0);
        this.a = (AlarmManager)this.aj().getSystemService("alarm");
    }

    @Override  // crqc
    protected void aM() {
        AlarmManager alarmManager0 = this.a;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.i());
        }
        this.j();
    }

    public void b() {
        this.aA();
        this.aJ().k.a("Unscheduling upload");
        AlarmManager alarmManager0 = this.a;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.i());
        }
        this.e().a();
        this.j();
    }

    public void c(long v) {
        this.aA();
        if(!this.al().a) {
            Context context0 = this.aj();
            if(!crqx.ae(context0)) {
                this.aJ().j.a("Receiver not registered/enabled");
            }
            if(!crqx.au(context0)) {
                this.aJ().j.a("Service not registered/enabled");
            }
        }
        this.b();
        this.aJ().k.b("Scheduling upload, millis", Long.valueOf(v));
        SystemClock.elapsedRealtime();
        if(v < crcu.F() && !this.e().d()) {
            this.e().c(v);
        }
        if(this.al().a) {
            this.d(v);
            return;
        }
        Context context1 = this.aj();
        ComponentName componentName0 = new ComponentName(context1, "com.google.android.gms.measurement.AppMeasurementJobService");
        int v1 = this.g();
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("action", "com.google.android.gms.measurement.UPLOAD");
        cjwl.a(context1, new JobInfo.Builder(v1, componentName0).setMinimumLatency(v).setOverrideDeadline(v + v).setExtras(persistableBundle0).build(), "UploadAlarm");
    }

    public void d(long v) {
        throw new UnsupportedOperationException();
    }

    protected final crdj e() {
        if(this.b == null) {
            this.b = new crpw(this, this.m.i);
        }
        return this.b;
    }

    private final int g() {
        if(this.c == null) {
            this.c = (int)0x30670462;
        }
        return (int)this.c;
    }

    private final PendingIntent i() {
        Context context0 = this.aj();
        return PendingIntent.getBroadcast(context0, 0, new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0x2000000);
    }

    private final void j() {
        JobScheduler jobScheduler0 = (JobScheduler)this.aj().getSystemService("jobscheduler");
        if(jobScheduler0 != null) {
            jobScheduler0.cancel(this.g());
        }
    }
}

