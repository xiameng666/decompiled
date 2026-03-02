import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

public final class arcv implements Runnable {
    public final String a;
    public final arfu b;

    public arcv(arfu arfu0, String s) {
        this.b = arfu0;
        this.a = s;
    }

    @Override
    public final void run() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity0 = this.b.a;
        d2dSourceChimeraActivity0.p = this.a;
        du du0 = d2dSourceChimeraActivity0.a(d2dSourceChimeraActivity0.s);
        if((du0 instanceof arrx)) {
            ((arrx)du0).A(d2dSourceChimeraActivity0.p);
        }
    }
}

