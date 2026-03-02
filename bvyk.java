import com.google.android.gms.growth.uiflow.ui.widget.ViewPagerExtended;

public final class bvyk extends aaw {
    final ViewPagerExtended a;
    final bvym d;

    public bvyk(ViewPagerExtended viewPagerExtended0, bvym bvym0) {
        this.a = viewPagerExtended0;
        this.d = bvym0;
        super(true);
    }

    @Override  // aaw
    public final void b() {
        ViewPagerExtended viewPagerExtended0 = this.a;
        if(viewPagerExtended0.a() > 0) {
            this.d.e(viewPagerExtended0);
            return;
        }
        this.g(false);
        this.d.a.onBackPressed();
        this.g(true);
    }
}

