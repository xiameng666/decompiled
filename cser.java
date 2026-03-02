import android.content.Context;

public final class cser implements Runnable {
    public final Context a;
    public final int b;

    public cser(Context context0, int v) {
        this.a = context0;
        this.b = v;
    }

    @Override
    public final void run() {
        crya.a(this.a, Integer.valueOf(this.b));
    }
}

