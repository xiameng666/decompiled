import android.content.ContentResolver;
import android.provider.Settings.Global;

public final class fyql {
    public static final float a(ContentResolver contentResolver0) {
        return Settings.Global.getFloat(contentResolver0, "animator_duration_scale", 1.0f);
    }
}

