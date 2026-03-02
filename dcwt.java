import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class dcwt {
    private final gfvn a;
    private final Context b;

    public dcwt(Context context0) {
        gfvh gfvh0 = new gfvh();
        gfvh0.f(hvqs.a.aT().aR(), TimeUnit.MILLISECONDS);
        this.a = gfvh0.c(new dcws(this, context0));
        this.b = context0;
    }

    public static void a(Context context0, String s, Uri uri0) {
        try {
            context0.grantUriPermission(s, uri0, 1);
            dcvz.a.d().i("Granted read permission of %s to %s", uri0, s);
        }
        catch(SecurityException securityException0) {
            dcvz.a.c().f(securityException0).i("Failed to grant read permission of %s to %s", uri0, s);
        }
    }

    public final void b(String s, Uri uri0) {
        Context context0 = this.b;
        if(dcww.b(context0).e() && hvqz.a.b().aH()) {
            try {
                kau kau0 = new kau(s, uri0);
                this.a.a(kau0);
            }
            catch(ExecutionException executionException0) {
                dcvz.a.c().f(executionException0.getCause()).i("Failed to grant read permission of %s to %s", uri0, s);
            }
            return;
        }
        dcwt.a(context0, s, uri0);
    }
}

