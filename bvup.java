import android.content.Intent;
import android.webkit.WebSettings;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;

public final class bvup implements lqj {
    public final GrowthWebViewChimeraActivity a;
    public final Intent b;
    public final WebSettings c;

    public bvup(GrowthWebViewChimeraActivity growthWebViewChimeraActivity0, Intent intent0, WebSettings webSettings0) {
        this.a = growthWebViewChimeraActivity0;
        this.b = intent0;
        this.c = webSettings0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        this.a.m(this.b, this.c, ((int)(((Integer)object0))) == 0);
        this.a.m.k(this.a);
    }
}

