import com.google.android.chimera.android.Activity;

public final class deqe implements ibth {
    public final Activity a;

    public deqe(Activity activity0) {
        this.a = activity0;
    }

    @Override  // ibth
    public final Object a() {
        Activity activity0 = this.a;
        if(activity0 != null) {
            activity0.finishAndRemoveTask();
        }
        return ibom.a;
    }
}

