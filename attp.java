import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.activity.CastPopupChimeraActivity;

public abstract class attp extends atuu {
    protected int a;
    protected int b;
    protected int c;
    protected String d;
    private final avjh e;
    private final Handler f;

    protected attp(CastPopupChimeraActivity castPopupChimeraActivity0) {
        super(castPopupChimeraActivity0);
        this.e = new avjh("CastBaseActivity");
        this.f = new clht(Looper.getMainLooper());
        this.c = -1;
        this.d = "";
    }

    protected final String a() {
        return aurf.g(this.d);
    }

    protected final void b() {
        this.j.setShowWhenLocked(true);
        this.j.getWindow().addFlags(0x80);
    }

    protected final void c() {
        this.j.setShowWhenLocked(false);
        this.j.getWindow().clearFlags(0x80);
    }

    public abstract void d();

    public abstract void e(Intent arg1);

    public abstract void f(int arg1);

    @Override  // atuu
    public void g(Bundle bundle0) {
        Intent intent0 = this.j.getIntent();
        this.e.m("onCreate");
        this.e(intent0);
    }

    @Override  // atuu
    public void h() {
        this.e.m("onDestroy");
        this.f.removeCallbacksAndMessages(null);
    }

    @Override  // atuu
    public final void i(Intent intent0) {
        this.j.setIntent(intent0);
        this.e.m("onNewIntent");
        this.e(intent0);
        this.m();
    }

    @Override  // atuu
    public final void j() {
        this.e.m("onStart");
        this.m();
    }

    @Override  // atuu
    public void k() {
        this.e.m("onStop");
        this.e.p("current operation: %d, action result: %d", Integer.valueOf(this.b), Integer.valueOf(this.c));
        this.j.setRequestedOrientation(this.a);
        this.d();
    }

    protected void l(int v) {
        this.f(v);
        this.j.finish();
    }

    public abstract void m();
}

