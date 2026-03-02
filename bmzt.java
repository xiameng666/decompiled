import android.view.View;

public final class bmzt {
    private final bmzs a;
    private final Runnable b;

    public bmzt(du du0, Runnable runnable0) {
        this.a = (bmzs)new lso(du0).a(bmzs.class);
        this.b = runnable0;
    }

    public final void a() {
        if(this.a.a) {
            this.e();
        }
    }

    public final void b(Runnable runnable0) {
        if(this.a.a) {
            return;
        }
        runnable0.run();
        this.e();
    }

    public final boolean c() {
        return this.a.a;
    }

    public static final void d(View view0) {
        view0.setAlpha(0.3f);
    }

    private final void e() {
        this.b.run();
        this.a.a = true;
    }
}

