import android.content.Context;

public final class eive {
    public final Context a;
    public final eiur b;
    public final gfsx c;
    public final eivd d;

    public eive(Context context0, eiur eiur0) {
        this.d = eivd.a();
        this.a = context0;
        this.b = eiur0;
        this.c = gfsx.l(bayn.f(context0));
    }

    public final String a(int v) {
        return this.a.getResources().getString(v);
    }

    public final void b() {
        gfsx gfsx0 = this.c;
        if(!gfsx0.i()) {
            eiup.b("Missing NotificationManager - cannot cancel notification", new Object[0]);
            return;
        }
        ((bayn)gfsx0.d()).m(1, evuh.Y);
    }
}

