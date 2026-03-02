import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Drawable;

public final class bybs extends bxzv {
    public final String g;
    public final Drawable h;
    public final String i;

    public bybs(String s, String s1, String s2, PendingIntent pendingIntent0, Intent intent0, String s3, Drawable drawable0, String s4) {
        ibuq.f(s, "providerId");
        ibuq.f(s1, "entryKey");
        ibuq.f(s2, "entrySubkey");
        ibuq.f(s3, "title");
        ibuq.f(drawable0, "icon");
        super(s, s1, s2, pendingIntent0, intent0, true);
        this.g = s3;
        this.h = drawable0;
        this.i = s4;
    }
}

