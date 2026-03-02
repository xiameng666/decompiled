import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import j..time.Duration;
import j..time.Instant;
import j..util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class gpiw implements gphv {
    public final Map a;
    public final Map b;
    private static final Duration c;
    private static final Duration d;
    private static final gfss e;
    private final fgvt f;
    private final boolean g;
    private final gmcg h;
    private final gpiy i;

    static {
        gpiw.c = Duration.ofMinutes(5L);
        gpiw.d = Duration.ofHours(1L);
        gpiw.e = new gfss(" ");
    }

    public gpiw(gpiy gpiy0, fgvt fgvt0, boolean z) {
        this.h = new gmaq();
        this.a = new HashMap();
        this.b = new HashMap();
        this.i = gpiy0;
        this.f = fgvt0;
        this.g = z;
    }

    @Override  // gphv
    public final gphy a(gphs gphs0, Set set0) {
        gmcd gmcd0;
        gmce gmce0;
        gpiv gpiv0 = new gpiv(new Account(gphs0.b, "com.google"), gpiw.f(set0));
        Map map0 = this.b;
        synchronized(map0) {
            gmcd0 = (gmcd)map0.get(gpiv0);
            if(gmcd0 == null) {
                gmce0 = new gmce(new gpit(this, gpiv0));
                gmce0.hB(new gpiu(this, gpiv0), this.h);
                map0.put(gpiv0, gmce0);
                gmcd0 = gmce0;
            }
            else {
                gmce0 = null;
            }
        }
        if(gmce0 != null) {
            gmce0.run();
        }
        try {
            return (gphy)gmcd0.get();
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            throw (throwable0 instanceof gphx) ? ((gphx)throwable0) : new gphx("Failed to refresh token", throwable0);
        }
    }

    @Override  // gphv
    public final gphy b(gphs gphs0, Set set0) {
        Account account0 = new Account(gphs0.b, "com.google");
        try {
            gpiv gpiv0 = new gpiv(account0, gpiw.f(set0));
            Map map0 = this.a;
            return this.c(gpiv0);
        }
        catch(gphx gphx0) {
            throw gphx0;
        }
        catch(Throwable throwable0) {
            throw new gphx("Failed to get auth token", throwable0);
        }
    }

    public final gphy c(gpiv gpiv0) {
        gphy gphy0 = (gphy)this.a.get(gpiv0);
        if(gphy0 != null) {
            Instant instant0 = gphy0.c;
            if(instant0 == null) {
                Instant instant1 = this.f.d();
                if(Duration.between(gphy0.b, instant1).compareTo(gpiw.d.minus(gpiw.c)) < 0) {
                    return gphy0;
                }
            }
            else if(Duration.between(this.f.d(), instant0).compareTo(gpiw.c) > 0) {
                return gphy0;
            }
            this.e(gphy0);
        }
        return this.d(gpiv0);
    }

    public final gphy d(gpiv gpiv0) {
        gphy gphy0;
        try {
            TokenData tokenData0 = acso.n(this.i.a, gpiv0.a, gpiv0.b, null);
            Instant instant0 = this.i.b.d();
            Instant instant1 = (Instant)Optional.ofNullable(tokenData0.c).map(new gpix()).orElse(null);
            gphy0 = new gphy(tokenData0.b, instant0, instant1);
        }
        catch(acse acse0) {
            throw new gphx(acse0);
        }
        if(!this.g && gphy0.c == null) {
            return gphy0;
        }
        this.a.put(gpiv0, gphy0);
        return gphy0;
    }

    public final void e(gphy gphy0) {
        try {
            acso.j(this.i.a, gphy0.a);
        }
        catch(acse acse0) {
            throw new gphx(acse0);
        }
    }

    private static final String f(Set set0) {
        return "oauth2:" + gpiw.e.b(set0);
    }
}

