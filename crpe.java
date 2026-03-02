import android.app.job.JobParameters;

public final class crpe implements Runnable {
    public final crph a;
    public final crji b;
    public final JobParameters c;

    public crpe(crph crph0, crji crji0, JobParameters jobParameters0) {
        this.a = crph0;
        this.b = crji0;
        this.c = jobParameters0;
    }

    @Override
    public final void run() {
        this.b.k.a("AppMeasurementJobService processed last upload request.");
        ((crpg)this.a.a).c(this.c);
    }
}

