import android.os.Parcel;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;
import j..util.Objects;

public final class arfu extends wby implements arfv {
    public final D2dSourceChimeraActivity a;

    public arfu() {
        super("com.google.android.gms.backup.d2d.migrate.service.ID2dSourceCallbacks");
    }

    public arfu(D2dSourceChimeraActivity d2dSourceChimeraActivity0) {
        Objects.requireNonNull(d2dSourceChimeraActivity0);
        this.a = d2dSourceChimeraActivity0;
        super("com.google.android.gms.backup.d2d.migrate.service.ID2dSourceCallbacks");
    }

    @Override  // arfv
    public final void a() {
        D2dSourceChimeraActivity.j.j("Authorization request is passed to the activity.", new Object[0]);
        Objects.requireNonNull(this.a);
        arcs arcs0 = new arcs(this.a);
        this.a.runOnUiThread(arcs0);
    }

    @Override  // arfv
    public final void b() {
        D2dSourceChimeraActivity.j.h("onCancelRequestedFromTarget called.", new Object[0]);
        Objects.requireNonNull(this.a);
        arcm arcm0 = new arcm(this.a);
        this.a.runOnUiThread(arcm0);
    }

    @Override  // arfv
    public final void c() {
        Objects.requireNonNull(this.a);
        arcm arcm0 = new arcm(this.a);
        this.a.runOnUiThread(arcm0);
    }

    @Override  // arfv
    public final void d() {
        Objects.requireNonNull(this.a);
        arcu arcu0 = new arcu(this.a);
        this.a.runOnUiThread(arcu0);
    }

    @Override  // arfv
    public final void e() {
        Objects.requireNonNull(this.a);
        arcp arcp0 = new arcp(this.a);
        this.a.runOnUiThread(arcp0);
    }

    @Override  // arfv
    public final void f() {
        Objects.requireNonNull(this.a);
        arct arct0 = new arct(this.a);
        this.a.runOnUiThread(arct0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                this.h();
                break;
            }
            case 2: {
                String s = parcel0.readString();
                arfu.gr(parcel0);
                this.l(s);
                break;
            }
            case 3: {
                this.a();
                break;
            }
            case 4: {
                this.d();
                break;
            }
            case 5: {
                this.c();
                break;
            }
            case 6: {
                this.e();
                break;
            }
            case 7: {
                this.f();
                break;
            }
            case 8: {
                this.m();
                break;
            }
            case 9: {
                this.n();
                break;
            }
            case 10: {
                this.k();
                break;
            }
            case 11: {
                boolean z = wbz.i(parcel0);
                arfu.gr(parcel0);
                this.j(z);
                break;
            }
            case 12: {
                this.b();
                break;
            }
            case 13: {
                this.g();
                break;
            }
            case 14: {
                this.i();
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // arfv
    public final void g() {
        D2dSourceChimeraActivity.j.h("onError called.", new Object[0]);
        Objects.requireNonNull(this.a);
        arcm arcm0 = new arcm(this.a);
        this.a.runOnUiThread(arcm0);
    }

    @Override  // arfv
    public final void h() {
        Objects.requireNonNull(this.a);
        arco arco0 = new arco(this.a);
        this.a.runOnUiThread(arco0);
    }

    @Override  // arfv
    public final void i() {
        D2dSourceChimeraActivity.j.h("onServiceStopped called.", new Object[0]);
        Objects.requireNonNull(this.a);
        arcn arcn0 = new arcn(this.a);
        this.a.runOnUiThread(arcn0);
    }

    @Override  // arfv
    public final void j(boolean z) {
        Objects.requireNonNull(this.a);
        arcw arcw0 = new arcw(this.a);
        this.a.runOnUiThread(arcw0);
    }

    @Override  // arfv
    public final void k() {
        Objects.requireNonNull(this.a);
        arcr arcr0 = new arcr(this.a);
        this.a.runOnUiThread(arcr0);
    }

    @Override  // arfv
    public final void l(String s) {
        arcv arcv0 = new arcv(this, s);
        this.a.runOnUiThread(arcv0);
    }

    @Override  // arfv
    public final void m() {
        Objects.requireNonNull(this.a);
        arcx arcx0 = new arcx(this.a);
        this.a.runOnUiThread(arcx0);
    }

    @Override  // arfv
    public final void n() {
        Objects.requireNonNull(this.a);
        arcq arcq0 = new arcq(this.a);
        this.a.runOnUiThread(arcq0);
    }
}

