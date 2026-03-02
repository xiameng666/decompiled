import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import j..util.Objects;

final class fxtd extends clid {
    final fxtk a;

    public fxtd(fxtk fxtk0, Handler handler0) {
        Objects.requireNonNull(fxtk0);
        this.a = fxtk0;
        super("location", "UlrControllerWifiObserver", handler0);
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        Intent intent0 = new Intent("com.google.android.location.reporting.CHANGE_ON_WIFI_ALWAYS_SCAN_MODE");
        Message message0 = this.a.h.obtainMessage(1, intent0);
        this.a.h.sendMessage(message0);
    }
}

