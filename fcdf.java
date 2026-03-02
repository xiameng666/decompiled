import com.google.android.chimera.android.Activity;

public final class fcdf implements Runnable {
    public final Activity a;
    public final String b;

    public fcdf(Activity activity0, String s) {
        this.a = activity0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.setTitle(this.b);
    }
}

