import android.os.Handler;

public final class fdwe {
    final Handler a;

    public fdwe(Handler handler0) {
        this.a = handler0;
        super();
    }

    public final void a(Runnable runnable0, long v) {
        this.a.postDelayed(runnable0, v);
    }
}

