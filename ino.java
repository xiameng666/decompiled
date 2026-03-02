import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class ino {
    private final Context a;

    public ino(Context context0) {
        this.a = context0;
    }

    public final void a(String s) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            this.a.startActivity(intent0);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            throw new IllegalArgumentException("Can\'t open " + s + '.', activityNotFoundException0);
        }
    }
}

