import android.content.pm.PackageManager;
import android.os.Build;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class azra {
    public static final Set a;
    public final boolean b;
    public final PackageManager c;

    static {
        azra.a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"com.android.settings", "com.android.systemui"})));
    }

    public azra(PackageManager packageManager0) {
        this.c = packageManager0;
        this.b = "google".equals(Build.BRAND) && packageManager0.hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE");
    }
}

