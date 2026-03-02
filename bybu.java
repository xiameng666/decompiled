import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import j..time.Instant;

public final class bybu extends bxzv {
    public final bxzs g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Drawable m;
    public final boolean n;
    public final Instant o;
    public final boolean p;
    public final String q;
    public final boolean r;
    public final String s;
    public final byap t;

    public bybu(String s, String s1, String s2, PendingIntent pendingIntent0, Intent intent0, bxzs bxzs0, String s3, String s4, String s5, String s6, String s7, Drawable drawable0, boolean z, Instant instant0, boolean z1, String s8, boolean z2, String s9, byap byap0) {
        ibuq.f(s, "providerId");
        ibuq.f(s1, "entryKey");
        ibuq.f(s2, "entrySubkey");
        ibuq.f(bxzs0, "credentialType");
        ibuq.f(s3, "rawCredentialType");
        ibuq.f(s4, "credentialTypeDisplayName");
        ibuq.f(s5, "providerDisplayName");
        ibuq.f(s6, "userName");
        ibuq.f(s8, "entryGroupId");
        super(s, s1, s2, pendingIntent0, intent0, true);
        this.g = bxzs0;
        this.h = s3;
        this.i = s4;
        this.j = s5;
        this.k = s6;
        this.l = s7;
        this.m = drawable0;
        this.n = z;
        this.o = instant0;
        this.p = z1;
        this.q = s8;
        this.r = z2;
        this.s = s9;
        this.t = byap0;
    }
}

