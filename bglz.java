import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.os.Build.VERSION;
import android.os.PersistableBundle;

public final class bglz {
    private final ClipboardManager a;

    public bglz(ClipboardManager clipboardManager0) {
        this.a = clipboardManager0;
    }

    public final void a(String s, CharSequence charSequence0) {
        ClipData clipData0 = ClipData.newPlainText(charSequence0, s);
        ibuq.e(clipData0, "newPlainText(...)");
        this.a.setPrimaryClip(clipData0);
    }

    public final void b(String s, CharSequence charSequence0) {
        ClipData.Item clipData$Item0 = new ClipData.Item(s);
        ClipDescription clipDescription0 = new ClipDescription(charSequence0, new String[]{"text/plain"});
        if(!hsas.e()) {
            if(Build.VERSION.SDK_INT > 0x20) {
                bglz.d(clipDescription0);
            }
        }
        else if(bbqa.c()) {
            bglz.d(clipDescription0);
        }
        ClipData clipData0 = new ClipData(clipDescription0, clipData$Item0);
        this.a.setPrimaryClip(clipData0);
    }

    public static final boolean c() {
        return hsas.e() ? bbqa.c() : Build.VERSION.SDK_INT > 0x20;
    }

    private static final void d(ClipDescription clipDescription0) {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putBoolean("android.content.extra.IS_SENSITIVE", true);
        clipDescription0.setExtras(persistableBundle0);
    }
}

