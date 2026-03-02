import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;

public final class flmp implements Runnable {
    public final flmu a;
    public final gged_interceptors b;

    public flmp(flmu flmu0, gged_interceptors gged0) {
        this.a = flmu0;
        this.b = gged0;
    }

    @Override
    public final void run() {
        String s = TextUtils.join(",", Collections.nCopies(((ggna)this.b).c, "?"));
        String[] arr_s = (String[])this.b.toArray(new String[((ggna)this.b).c]);
        flmu flmu0 = this.a;
        Uri uri0 = flmu0.l("notifications");
        if(flmu0.e.a(uri0, "notification_id IN (" + s + ")", arr_s) > 0) {
            flmu0.R();
        }
    }
}

