import android.app.job.JobParameters;

public final class crpc implements Runnable {
    public final crph a;
    public final JobParameters b;

    public crpc(crph crph0, JobParameters jobParameters0) {
        this.a = crph0;
        this.b = jobParameters0;
    }

    @Override
    public final void run() {
        ((crpg)this.a.a).c(this.b);
    }
}

