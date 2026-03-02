import android.os.Bundle;
import java.util.Arrays;

public final class eppt implements azsu, azsw {
    public static final eppt a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Long i;
    public final Long j;

    static {
        eppt.a = new epps().b();
    }

    public eppt(boolean z, boolean z1, String s, boolean z2, String s1, String s2, boolean z3, Long long0, Long long1) {
        this.b = z;
        this.c = z1;
        this.d = s;
        this.e = z2;
        this.h = z3;
        this.f = s1;
        this.g = s2;
        this.i = long0;
        this.j = long1;
    }

    public final Bundle a() {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", this.b);
        bundle0.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", this.c);
        bundle0.putString("com.google.android.gms.signin.internal.serverClientId", this.d);
        bundle0.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle0.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", this.e);
        bundle0.putString("com.google.android.gms.signin.internal.hostedDomain", this.f);
        bundle0.putString("com.google.android.gms.signin.internal.logSessionId", this.g);
        bundle0.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", this.h);
        Long long0 = this.i;
        if(long0 != null) {
            bundle0.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", long0.longValue());
        }
        Long long1 = this.j;
        if(long1 != null) {
            bundle0.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", long1.longValue());
        }
        return bundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof eppt) ? this.b == ((eppt)object0).b && this.c == ((eppt)object0).c && bata.b(this.d, ((eppt)object0).d) && this.e == ((eppt)object0).e && this.h == ((eppt)object0).h && bata.b(this.f, ((eppt)object0).f) && bata.b(this.g, ((eppt)object0).g) && bata.b(this.i, ((eppt)object0).i) && bata.b(this.j, ((eppt)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.f, this.g, this.i, this.j});
    }
}

