import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import j..time.Instant;

public final class byas extends bxzv {
    public final String g;
    public final Drawable h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Instant l;
    public final String m;
    public final boolean n;
    public final byap o;

    public byas(String s, String s1, String s2, PendingIntent pendingIntent0, Intent intent0, String s3, Drawable drawable0, Integer integer0, Integer integer1, Integer integer2, Instant instant0, String s4, boolean z, byap byap0) {
        ibuq.f(s, "providerId");
        ibuq.f(s1, "entryKey");
        ibuq.f(s2, "entrySubkey");
        ibuq.f(s3, "userProviderDisplayName");
        ibuq.f(instant0, "lastUsedTime");
        super(s, s1, s2, pendingIntent0, intent0, true);
        this.g = s3;
        this.h = drawable0;
        this.i = integer0;
        this.j = integer1;
        this.k = integer2;
        this.l = instant0;
        this.m = s4;
        this.n = z;
        this.o = byap0;
    }
}

