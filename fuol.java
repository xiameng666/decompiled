import android.os.Build.VERSION;
import android.view.View;

public final class fuol implements keg {
    public final boolean a;
    public final View b;

    public fuol(boolean z, View view0) {
        this.a = z;
        this.b = view0;
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        ibuq.f(view0, "<unused var>");
        jxn jxn0 = kgq0.f(0x207);
        funy.b(this.b, Integer.valueOf(jxn0.b), Integer.valueOf((this.a ? jxn0.c : 0)), Integer.valueOf(jxn0.d), Integer.valueOf((this.a ? jxn0.e : 0)));
        jxn jxn1 = jxn.e(0, (this.a ? 0 : jxn0.c), 0, (this.a ? 0 : jxn0.e));
        kgd kgd0 = Build.VERSION.SDK_INT >= 34 ? new kge(kgq0) : new kgd(kgq0);
        kgd0.d(0x207, jxn1);
        return kgd0.a();
    }
}

