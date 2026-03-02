import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore.Audio.Media;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class camd extends clid {
    static final Long a;
    public static camd b;
    public final AtomicBoolean c;
    private static final bboh d;
    private final Handler e;
    private final Runnable f;

    static {
        camd.d = bboh.b("GmscoreIpa", bbcu.ee);
        camd.a = TimeUnit.SECONDS.toMillis(huhz.a.h().x());
    }

    public camd(Context context0) {
        super("ipa", "MediastoreContentObserver", null);
        this.c = new AtomicBoolean(false);
        this.e = new clht(context0.getMainLooper());
        this.f = new camc(this, context0);
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        if(!this.c.getAndSet(true)) {
            this.e.postDelayed(this.f, camd.a.longValue());
        }
    }

    public static void b(Context context0) {
        synchronized(camd.class) {
            if(camd.b == null) {
                camd.b = new camd(context0.getApplicationContext());
                ContentResolver contentResolver0 = context0.getContentResolver();
                try {
                    if(huhz.k()) {
                        contentResolver0.registerContentObserver(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, true, camd.b);
                        return;
                    }
                    return;
                }
                catch(NoClassDefFoundError | SecurityException unused_ex) {
                    goto label_12;
                }
            }
            return;
        label_12:
            cakj.a().c(52);
            ((ggtj)camd.d.i()).x("Could not register mediastore content observer");
        }
    }

    public static void c(Context context0) {
        synchronized(camd.class) {
            if(camd.b != null) {
                context0.getContentResolver().unregisterContentObserver(camd.b);
                camd.b = null;
            }
        }
    }
}

