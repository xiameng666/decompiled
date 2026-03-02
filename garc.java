import android.content.Intent;
import android.content.IntentSender;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class garc {
    public static int a(ganp ganp0) {
        return ganp0.a.getIntExtra("resultCode", -1);
    }

    public static Intent b(gano gano0) {
        return (Intent)gano0.a.getParcelableExtra("launchingIntent");
    }

    public static Intent c(ganp ganp0) {
        return (Intent)ganp0.a.getParcelableExtra("resultData");
    }

    public static gano d(Intent intent0, WidgetConfig widgetConfig0) {
        Intent intent1 = new Intent();
        intent1.putExtra("launchingIntent", intent0);
        return new gano(gano.d("startActivityForResult", widgetConfig0, intent1));
    }

    public static gano e(IntentSender intentSender0, WidgetConfig widgetConfig0) {
        Intent intent0 = new Intent();
        intent0.putExtra("launchingIntentSender", intentSender0);
        return new gano(gano.d("startActivityForResult", widgetConfig0, intent0));
    }

    public static ganp f(int v, Intent intent0) {
        gaxl.a();
        Intent intent1 = hzji.a.d().m() ? ganp.e(ganp.c(v)) : ganp.e(0);
        intent1.putExtra("resultCode", v);
        intent1.putExtra("resultData", intent0);
        return new ganp(intent1);
    }
}

