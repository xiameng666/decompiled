import android.content.Context;

public final class czzs {
    public final dafo a;

    public czzs(Context context0, czvk czvk0) {
        this.a = new dafo(context0, czvk0, new daef());
    }

    public final daep a(String s) {
        daep daep0;
        synchronized(this) {
            daep0 = this.a.c(s);
        }
        return daep0;
    }

    public final void b() {
        synchronized(this) {
            this.a.k();
        }
    }

    public final boolean c() {
        return this.a.p();
    }
}

