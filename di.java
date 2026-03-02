import android.os.Bundle;

final class di extends ds {
    final du a;

    public di(du du0) {
        this.a = du0;
        super();
    }

    @Override  // ds
    public final void a() {
        this.a.ad.a();
        lrm.c(this.a);
        Bundle bundle0 = this.a.g;
        Bundle bundle1 = bundle0 == null ? null : bundle0.getBundle("registryState");
        this.a.ad.b(bundle1);
    }
}

