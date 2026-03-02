import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import j..time.Instant;

public final class kwk extends kwc {
    public final String g;
    public final CharSequence h;
    public final PendingIntent i;
    public final boolean j;
    public final CharSequence k;
    public final CharSequence l;
    public final Icon m;
    public final Instant n;
    public boolean o;
    public boolean p;
    public final boolean q;

    public kwk(String s, CharSequence charSequence0, PendingIntent pendingIntent0, boolean z, CharSequence charSequence1, CharSequence charSequence2, Icon icon0, Instant instant0, kvg kvg0, boolean z1, CharSequence charSequence3, CharSequence charSequence4, kvs kvs0, boolean z2, boolean z3, boolean z4) {
        ibuq.f(s, "type");
        ibuq.f(charSequence0, "title");
        ibuq.f(pendingIntent0, "pendingIntent");
        ibuq.f(icon0, "icon");
        ibuq.f(kvg0, "beginGetCredentialOption");
        super(s, kvg0, (charSequence3 == null ? charSequence0 : charSequence3), z1, charSequence4, kvs0);
        this.g = s;
        this.h = charSequence0;
        this.i = pendingIntent0;
        this.j = z;
        this.k = charSequence1;
        this.l = charSequence2;
        this.m = icon0;
        this.n = instant0;
        this.o = z3;
        this.p = z4;
        this.q = z2;
        if(s.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
        if(charSequence0.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("title must not be empty");
    }

    public kwk(String s, CharSequence charSequence0, PendingIntent pendingIntent0, boolean z, CharSequence charSequence1, CharSequence charSequence2, Icon icon0, Instant instant0, kvg kvg0, boolean z1, CharSequence charSequence3, CharSequence charSequence4, boolean z2, boolean z3, boolean z4, int v) {
        this(s, charSequence0, pendingIntent0, z, charSequence1, charSequence2, icon0, instant0, kvg0, z1, ((v & 0x400) == 0 ? charSequence3 : charSequence0), ((v & 0x800) == 0 ? charSequence4 : null), null, ((v & 0x2000) == 0 ? z2 : kjm.b(kvg0.c)), ((boolean)(((v & 0x4000) == 0 ? 1 : 0) & ((int)z3))), ((boolean)(((v & 0x8000) == 0 ? 1 : 0) & ((int)z4))));
    }

    @Override  // kwc
    public final String a() {
        return this.g;
    }
}

