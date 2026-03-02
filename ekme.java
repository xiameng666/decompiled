import android.content.Context;

public final class ekme extends lqd {
    private final efyp a;
    private gmcd h;

    public ekme(Context context0) {
        efol efol0 = new efol();
        efol0.a = 80;
        this.a = new efzw(context0, efol0.a());
    }

    @Override  // lqd
    protected final void c() {
        gmcd gmcd0 = this.h;
        if(gmcd0 != null) {
            gmcd0.cancel(true);
        }
        gmcd gmcd1 = fhra.b(this.a.b());
        this.h = gmcd1;
        gmbu.t(gmcd1, new ekmd(this), gmap.a);
    }
}

