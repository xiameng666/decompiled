import com.google.android.gms.location.ActivityRecognitionResult;

public final class fvxt implements cnxm {
    public final fvxw a;

    public fvxt(fvxw fvxw0) {
        this.a = fvxw0;
    }

    @Override  // cnxm
    public final void f(ActivityRecognitionResult activityRecognitionResult0) {
        fvxu fvxu0 = new fvxu(this.a, activityRecognitionResult0);
        this.a.b.execute(fvxu0);
    }
}

