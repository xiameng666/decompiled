import android.text.TextUtils;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;

public final class bvue implements Runnable {
    public final GrowthWebViewChimeraActivity a;
    public final int b;
    public final int c;
    public final String d;

    public bvue(GrowthWebViewChimeraActivity growthWebViewChimeraActivity0, int v, int v1, String s) {
        this.a = growthWebViewChimeraActivity0;
        this.b = v;
        this.c = v1;
        this.d = s;
    }

    @Override
    public final void run() {
        this.a.o.evaluateJavascript(htxm.a.c().c() + "(" + TextUtils.join(",", new Object[]{((int)this.b), ((int)this.c), this.d}) + ");", null);
    }
}

