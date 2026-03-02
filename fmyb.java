import android.content.Context;

public final class fmyb implements Runnable {
    public final Context a;
    public final String b;

    public fmyb(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override
    public final void run() {
        flav.b(this.a, this.b);
    }
}

