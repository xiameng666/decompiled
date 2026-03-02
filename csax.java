import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.euicc.DownloadableSubscription;
import android.telephony.euicc.EuiccManager;

public final class csax implements Runnable {
    public final csaz a;
    public final EuiccManager b;
    public final DownloadableSubscription c;
    public final String d;

    public csax(csaz csaz0, EuiccManager euiccManager0, DownloadableSubscription downloadableSubscription0, String s) {
        this.a = csaz0;
        this.b = euiccManager0;
        this.c = downloadableSubscription0;
        this.d = s;
    }

    @Override
    public final void run() {
        ((ggtj)csaz.a.h()).x("Initiated eSIM download subscription");
        Intent intent0 = new Intent();
        PendingIntent pendingIntent0 = this.a.y(intent0, this.d);
        this.b.downloadSubscription(this.c, true, pendingIntent0);
    }
}

