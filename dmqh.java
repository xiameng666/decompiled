import android.content.Intent;
import android.net.Uri;

public final class dmqh {
    private final Intent a;

    public dmqh() {
        this.a = new Intent("android.intent.action.VIEW").setClassName("com.google.android.gms", "com.google.android.gms.pay.deeplink.DeepLinkActivity");
    }

    public final Intent a() {
        batl.s(this.a.getData());
        return this.a;
    }

    public final void b(String s) {
        Uri uri0 = Uri.parse(s);
        this.a.setData(uri0);
    }
}

