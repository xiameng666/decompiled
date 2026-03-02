import android.content.Context;
import android.content.Intent;

public final class buqz {
    private final Context a;

    public buqz(Context context0) {
        this.a = context0;
    }

    public final Intent a(String s, String s1, String s2, String s3) {
        ibuq.f(s1, "onramp");
        ibuq.f(s2, "product");
        ibuq.f(s3, "campaignId");
        Intent intent0 = new Intent();
        intent0.setClassName(this.a, "com.google.android.gms.googleone.smui.SmuiActivity");
        intent0.putExtra("account_name_key", s);
        intent0.putExtra("onramp", s1);
        intent0.putExtra("platform", "ANDROID");
        intent0.putExtra("product", s2);
        intent0.putExtra("campaign_id", s3);
        return intent0;
    }
}

