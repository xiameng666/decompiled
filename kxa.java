import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import j..time.Instant;

public final class kxa extends kwc {
    public final CharSequence g;
    public final CharSequence h;
    public final CharSequence i;
    public final PendingIntent j;
    public final Icon k;
    public final Instant l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public kxa(CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, PendingIntent pendingIntent0, Icon icon0, Instant instant0, boolean z, kvq kvq0, boolean z1, CharSequence charSequence3, CharSequence charSequence4, kvs kvs0, boolean z2, boolean z3, boolean z4) {
        ibuq.f(charSequence0, "username");
        ibuq.f(charSequence2, "typeDisplayName");
        ibuq.f(pendingIntent0, "pendingIntent");
        ibuq.f(icon0, "icon");
        ibuq.f(kvq0, "beginGetPublicKeyCredentialOption");
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", kvq0, (charSequence3 == null ? charSequence0 : charSequence3), z1, charSequence4, kvs0);
        this.g = charSequence0;
        this.h = charSequence1;
        this.i = charSequence2;
        this.j = pendingIntent0;
        this.k = icon0;
        this.l = instant0;
        this.m = z;
        this.n = z3;
        this.o = z4;
        this.p = z2;
        if(charSequence0.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty");
        }
        if(charSequence2.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("typeDisplayName must not be empty");
    }

    public kxa(CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, PendingIntent pendingIntent0, Icon icon0, Instant instant0, boolean z, kvq kvq0, boolean z1, CharSequence charSequence3, CharSequence charSequence4, kvs kvs0, boolean z2, boolean z3, boolean z4, int v) {
        this(charSequence0, charSequence1, charSequence2, pendingIntent0, icon0, instant0, z, kvq0, z1, ((v & 0x200) == 0 ? charSequence3 : charSequence0), ((v & 0x400) == 0 ? charSequence4 : null), ((v & 0x800) == 0 ? kvs0 : null), ((v & 0x1000) == 0 ? z2 : kjm.b(kvq0.c)), ((boolean)(((v & 0x2000) == 0 ? 1 : 0) & ((int)z3))), ((boolean)(((v & 0x4000) == 0 ? 1 : 0) & ((int)z4))));
    }
}

