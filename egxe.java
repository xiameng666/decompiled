import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import j..util.Objects;

final class egxe extends fpyq {
    final egxg a;

    public egxe(egxg egxg0, fpyy fpyy0, fpyy fpyy1) {
        Objects.requireNonNull(egxg0);
        this.a = egxg0;
        super(fpyy0, fpyy1);
    }

    @Override  // fpyq
    public final boolean a(String s) {
        Uri uri0 = Uri.parse(s);
        if(URLUtil.isNetworkUrl(s)) {
            try {
                Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
                this.a.startActivity(intent0);
                return true;
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                a.ae(egxg.a.j(), "Could not find activity to open url", activityNotFoundException0);
            }
        }
        return false;
    }
}

