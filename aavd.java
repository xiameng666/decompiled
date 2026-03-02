import android.content.Intent;
import android.webkit.WebSettings;

public final class aavd implements Runnable {
    public final aavf a;
    public final String b;

    public aavd(aavf aavf0, String s) {
        this.a = aavf0;
        this.b = s;
    }

    @Override
    public final void run() {
        aaur.b(new Intent("com.google.android.gms.octarine.action.WARMUP").putExtra("extra.accountName", this.b), this.a.a);
        WebSettings.getDefaultUserAgent(this.a.a);
    }
}

