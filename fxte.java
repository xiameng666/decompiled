import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import j..util.Objects;

final class fxte extends clid {
    final fxtk a;

    public fxte(fxtk fxtk0, Handler handler0) {
        Objects.requireNonNull(fxtk0);
        this.a = fxtk0;
        super("location", "UlrControllerBatterySavingModeChangeObserver", handler0);
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        Intent intent0 = new Intent("com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE");
        Message message0 = this.a.h.obtainMessage(1, intent0);
        this.a.h.sendMessage(message0);
    }
}

