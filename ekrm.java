import android.content.Context;

public final class ekrm implements Runnable {
    public final ekrs a;
    public final Context b;
    public final bbng c;

    public ekrm(ekrs ekrs0, Context context0, bbng bbng0) {
        this.a = ekrs0;
        this.b = context0;
        this.c = bbng0;
    }

    @Override
    public final void run() {
        synchronized(this.a.a) {
            this.a.a.b();
        }
        this.a.c(this.b, this.c);
    }
}

