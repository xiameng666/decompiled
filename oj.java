import android.view.View;

final class oj extends rt {
    final ok a;

    public oj(ok ok0, View view0) {
        this.a = ok0;
        super(view0);
    }

    @Override  // rt
    public final nr a() {
        ol ol0 = this.a.a.l;
        return ol0 == null ? null : ol0.a();
    }

    @Override  // rt
    public final boolean b() {
        this.a.a.o();
        return true;
    }

    @Override  // rt
    public final boolean c() {
        oo oo0 = this.a.a;
        if(oo0.n != null) {
            return false;
        }
        oo0.l();
        return true;
    }
}

