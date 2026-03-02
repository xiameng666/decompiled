import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class aifv implements glzm {
    public static final ggeo a;
    private final Context b;
    private final GoogleSignInOptions c;
    private final String d;
    private final gfsx e;

    static {
        ggek ggek0 = new ggek();
        Integer integer0 = (int)5;
        ggek0.i(integer0, integer0);
        Integer integer1 = (int)4;
        ggek0.i(integer1, integer1);
        Integer integer2 = (int)12500;
        ggek0.i(Integer.valueOf(17), integer2);
        ggek0.i(Integer.valueOf(16), integer2);
        Integer integer3 = (int)7;
        ggek0.i(integer3, integer3);
        ggek0.i(Integer.valueOf(13), Integer.valueOf(0x30D5));
        Integer integer4 = (int)10;
        ggek0.i(integer4, integer4);
        aifv.a = ggek0.b();
    }

    public aifv(Context context0, GoogleSignInOptions googleSignInOptions0, String s, gfsx gfsx0) {
        this.b = context0;
        this.c = googleSignInOptions0;
        this.d = s;
        this.e = gfsx0;
    }

    @Override  // glzm
    public final gmcd a() {
        HashSet hashSet0 = new HashSet(this.c.a());
        boolean z = hashSet0.contains(bsba.a) || hashSet0.contains(bsba.b) || hashSet0.contains(bsba.d) || this.c.r.containsKey(Integer.valueOf(1));
        aztt aztt0 = this.b(z);
        gfsx gfsx0 = this.e;
        gmcd gmcd0 = gfsx0.i() ? new bxkx(aztt0, ((Activity)gfsx0.d())).a : bxky.a(aztt0);
        aifu aifu0 = new aifu();
        return glzd.g(glyi.f(gmcd0, aztb.class, aifu0, gmap.a), new aifr(this, z), gmap.a);
    }

    public final aztt b(boolean z) {
        gfsx gfsx0;
        epps epps0 = new epps();
        epps0.g = true;
        GoogleSignInOptions googleSignInOptions0 = this.c;
        epps0.e = googleSignInOptions0.o;
        epps0.f = googleSignInOptions0.q;
        if(googleSignInOptions0.k) {
            epps0.b = true;
            epps0.c(googleSignInOptions0.n);
            epps0.c = googleSignInOptions0.n;
        }
        if(googleSignInOptions0.l) {
            epps0.d = googleSignInOptions0.m;
            epps0.a = true;
            epps0.c(googleSignInOptions0.n);
            epps0.c = googleSignInOptions0.n;
        }
        aztt aztt0 = new aztt(this.b);
        eppt eppt0 = epps0.b();
        aztt0.d(eppr.c, eppt0);
        aztt0.c = this.d;
        aztt0.a = googleSignInOptions0.j;
        Set set0 = new HashSet(googleSignInOptions0.a());
        if(aifp.b(googleSignInOptions0)) {
            set0 = aifp.a(set0);
        }
        for(Object object0: set0) {
            batl.t(((Scope)object0), "Scope must not be null");
            aztt0.b.add(((Scope)object0));
        }
        if(!z) {
            return aztt0;
        }
        GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable0 = (GoogleSignInOptionsExtensionParcelable)googleSignInOptions0.r.get(Integer.valueOf(1));
        if(googleSignInOptionsExtensionParcelable0 == null) {
            gfsx0 = gfqx.a;
        }
        else {
            Bundle bundle0 = googleSignInOptionsExtensionParcelable0.c;
            if(bundle0 == null) {
                gfsx0 = gfqx.a;
            }
            else {
                bsay bsay0 = new bsay();
                if(bundle0.containsKey("com.google.android.gms.games.key.isHeadless")) {
                    bsay0.a = bundle0.getBoolean("com.google.android.gms.games.key.isHeadless");
                }
                if(bundle0.containsKey("com.google.android.gms.games.key.showConnectingPopup")) {
                    if(bundle0.containsKey("com.google.android.gms.games.key.connectingPopupGravity")) {
                        boolean z1 = bundle0.getBoolean("com.google.android.gms.games.key.showConnectingPopup");
                        int v = bundle0.getInt("com.google.android.gms.games.key.connectingPopupGravity");
                        bsay0.b = z1;
                        bsay0.c = v;
                    }
                    else {
                        bsay0.b = bundle0.getBoolean("com.google.android.gms.games.key.showConnectingPopup");
                        bsay0.c = 17;
                    }
                }
                if(bundle0.containsKey("com.google.android.gms.games.key.retryingSignIn")) {
                    bsay0.d = bundle0.getBoolean("com.google.android.gms.games.key.retryingSignIn");
                }
                if(bundle0.containsKey("com.google.android.gms.games.key.sdkVariant")) {
                    bsay0.e = bundle0.getInt("com.google.android.gms.games.key.sdkVariant");
                }
                if(bundle0.containsKey("com.google.android.gms.games.key.unauthenticated")) {
                    bsay0.h = bundle0.getBoolean("com.google.android.gms.games.key.unauthenticated");
                }
                String s = bundle0.getString("com.google.android.gms.games.key.forceResolveAccountKey");
                if(s != null) {
                    bsay0.f = s;
                }
                if(bundle0.containsKey("com.google.android.gms.games.key.skipPgaCheck")) {
                    bsay0.i = bundle0.getBoolean("com.google.android.gms.games.key.skipPgaCheck");
                }
                if(bundle0.containsKey("com.google.android.gms.games.key.skipWelcomePopup")) {
                    bsay0.b(Boolean.valueOf(bundle0.getBoolean("com.google.android.gms.games.key.skipWelcomePopup")));
                }
                ArrayList arrayList0 = bundle0.getStringArrayList("com.google.android.gms.games.key.proxyApis");
                if(arrayList0 != null) {
                    int v1 = arrayList0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        String s1 = (String)arrayList0.get(v2);
                        bsay0.g.add(s1);
                    }
                }
                bsay0.k = (GoogleSignInAccount)bundle0.getParcelable("com.google.android.gms.games.key.googleSignInAccount");
                bsay0.l = bundle0.getString("com.google.android.gms.games.key.realClientPackageName", null);
                if(bundle0.containsKey("com.google.android.gms.games.key.API_VERSION")) {
                    bsay0.m = bundle0.getInt("com.google.android.gms.games.key.API_VERSION");
                }
                String s2 = bundle0.getString("com.google.android.gms.games.key.gameRunToken");
                if(s2 != null) {
                    bsay0.n = s2;
                }
                if(bundle0.containsKey("com.google.android.gms.games.key.isGmsCoreUiInitiatedRequest")) {
                    bsay0.p = bundle0.getBoolean("com.google.android.gms.games.key.isGmsCoreUiInitiatedRequest");
                }
                gfsx0 = gfsx.m(bsay0.a());
            }
        }
        azta_api azta0 = googleSignInOptions0.a().contains(bsba.d) ? bsba.e : bsba.c;
        bsay bsay1 = new bsay(((bsaz)gfsx0.g()));
        bsay1.m = 6;
        bsay1.b(Boolean.valueOf(true));
        aztt0.d(azta0, bsay1.a());
        return aztt0;
    }

    public static final gmcd c(aztw aztw0) {
        return glzd.f(fhra.a(aztw0.c(new epsz(epsx.a, aztw0))), new aifs(), gmap.a);
    }
}

