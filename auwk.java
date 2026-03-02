import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

public final class auwk implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        if(hqur.c()) {
            return Boolean.valueOf(avgh.a());
        }
        return Build.BRAND != null && TextUtils.equals(Build.BRAND.toUpperCase(Locale.US), "SAMSUNG") || Build.MANUFACTURER != null && TextUtils.equals(Build.MANUFACTURER.toUpperCase(Locale.US), "SAMSUNG") ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }
}

