import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Drawable;

public final class bybt extends bxzv {
    public final String g;
    public final String h;
    public final Drawable i;
    public final boolean j;
    public final boolean k;

    public bybt(String s, String s1, String s2, PendingIntent pendingIntent0, Intent intent0, String s3, String s4, Drawable drawable0, boolean z, boolean z1) {
        ibuq.f(s, "providerId");
        ibuq.f(s1, "entryKey");
        ibuq.f(s2, "entrySubkey");
        ibuq.f(s3, "title");
        ibuq.f(s4, "providerDisplayName");
        ibuq.f(drawable0, "icon");
        super(s, s1, s2, pendingIntent0, intent0, false);
        this.g = s3;
        this.h = s4;
        this.i = drawable0;
        this.j = z;
        this.k = z1;
    }
}

