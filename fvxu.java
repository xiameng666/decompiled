import com.google.android.gms.location.ActivityRecognitionResult;

public final class fvxu implements Runnable {
    public final fvxw a;
    public final ActivityRecognitionResult b;

    public fvxu(fvxw fvxw0, ActivityRecognitionResult activityRecognitionResult0) {
        this.a = fvxw0;
        this.b = activityRecognitionResult0;
    }

    @Override
    public final void run() {
        synchronized(this.a) {
            fuxg fuxg0 = fuxc.a(this.b);
            this.a.e.add(fuxg0);
            this.a.d.d(fuxg0);
            fuxg fuxg1 = this.a.d.a();
            this.a.e.add(fuxg1);
            this.a.a();
        }
    }
}

