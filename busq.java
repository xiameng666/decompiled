import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public final class busq {
    public static final busq a;

    static {
        busq.a = new busq();
    }

    public final Intent a(Context context0, String s, bujp bujp0, int v) {
        ibuq.f(context0, "context");
        ibuq.f(s, "accountName");
        ibuq.f(bujp0, "acquisitionInfo");
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialActivity");
        intent0.putExtra("id", String.valueOf(ghfs.a.c(s, StandardCharsets.UTF_8).c()));
        Uri.Builder uri$Builder0 = Uri.parse(htuh.e().j()).buildUpon();
        String s1 = bujp0.e;
        if(!ibzk.D(s1)) {
            uri$Builder0.appendQueryParameter("utm_id", s1);
        }
        String s2 = bujp0.d.toLowerCase(Locale.ROOT);
        ibuq.e(s2, "toLowerCase(...)");
        uri$Builder0.appendQueryParameter("utm_source", s2);
        String s3 = bujp0.c.toLowerCase(Locale.ROOT);
        ibuq.e(s3, "toLowerCase(...)");
        uri$Builder0.appendQueryParameter("utm_medium", s3);
        String s4 = bujp0.b.toLowerCase(Locale.ROOT);
        ibuq.e(s4, "toLowerCase(...)");
        uri$Builder0.appendQueryParameter("utm_campaign", s4);
        boolean z = true;
        switch(v) {
            case 0: {
            label_22:
                if((context0.getResources().getConfiguration().uiMode & 0x30) != 0x20) {
                    z = false;
                }
                uri$Builder0.appendQueryParameter("dm", String.valueOf(z));
                String s5 = uri$Builder0.build().toString();
                ibuq.e(s5, "toString(...)");
                intent0.putExtra("url", s5);
                return intent0;
            }
            case 1: {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            default: {
                uri$Builder0.appendQueryParameter("g1_last_touchpoint", String.valueOf(v - 2));
                goto label_22;
            }
        }
    }
}

