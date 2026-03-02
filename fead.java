import android.content.ContentResolver;
import android.net.Uri;
import android.provider.Settings.System;
import android.util.Log;
import j..util.Objects;

final class fead extends clid {
    final ContentResolver a;
    final feah b;

    public fead(feah feah0, ContentResolver contentResolver0) {
        this.a = contentResolver0;
        Objects.requireNonNull(feah0);
        this.b = feah0;
        super("wearable", "WatchSetupContentObserver", null);
    }

    @Override  // clid
    public final void a(boolean z, Uri uri0) {
        if(Settings.System.getInt(this.a, "setup_wizard_has_run", 0) == 1) {
            Log.d("Wear_WifiService", "Setup wizard completed, performing initial wifi sync");
            this.b.j.set(true);
            this.b.k.sendEmptyMessage(1);
        }
    }
}

