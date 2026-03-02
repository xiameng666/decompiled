import com.google.android.chimera.android.Activity;

public final class fcbj implements ibts {
    public final Activity a;

    public fcbj(Activity activity0) {
        this.a = activity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        this.a.runOnUiThread(((Runnable)object0));
        return null;
    }
}

