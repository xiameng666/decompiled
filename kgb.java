import android.graphics.Insets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;

class kgb extends kgf {
    final WindowInsets.Builder a;

    public kgb() {
        this.a = new WindowInsets.Builder();
    }

    public kgb(kgq kgq0) {
        super(kgq0);
        WindowInsets windowInsets0 = kgq0.e();
        this.a = windowInsets0 == null ? new WindowInsets.Builder() : new WindowInsets.Builder(windowInsets0);
    }

    @Override  // kgf
    public kgq a() {
        kgq kgq0 = kgq.r(this.a.build());
        kgq0.b.h(null);
        return kgq0;
    }

    @Override  // kgf
    public void b(jxn jxn0) {
        Insets insets0 = jxn0.a();
        this.a.setStableInsets(insets0);
    }

    @Override  // kgf
    public void c(jxn jxn0) {
        Insets insets0 = jxn0.a();
        this.a.setSystemWindowInsets(insets0);
    }
}

