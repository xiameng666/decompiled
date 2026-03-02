import android.webkit.ValueCallback;

public final class fccw implements ValueCallback {
    public final fccx a;
    public final String b;

    public fccw(fccx fccx0, String s) {
        this.a = fccx0;
        this.b = s;
    }

    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        this.a.a.loadUrl(this.b);
    }
}

