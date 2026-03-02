import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.chimera.WebView;

public final class bway implements ibts {
    public final Parcelable a;

    public bway(Parcelable parcelable0) {
        this.a = parcelable0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((WebView)object0), "$this$initializeWebView");
        ((WebView)object0).restoreState(((Bundle)this.a));
        String s = ((WebView)object0).getUrl();
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            if(!ibuq.m(uri0.getQueryParameter("dark"), bwba.a(((WebView)object0)))) {
                ibuq.c(uri0);
                ((WebView)object0).loadUrl(bwba.b(((WebView)object0), uri0).toString());
            }
        }
        return ibom.a;
    }
}

