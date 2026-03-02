import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class flvd {
    public final Context a;
    public final flrd b;
    public final flsl c;
    public final flvy d;
    public flbz e;
    public final Map f;
    public fljw g;

    public flvd(Context context0, flvy flvy0, flrd flrd0) {
        this.f = new HashMap();
        Context context1 = context0.getApplicationContext();
        this.a = context1;
        this.d = flvy0;
        this.b = flrd0;
        this.c = flsl.a(context1);
    }

    public final gmcd a(gmcd gmcd0, ContactId contactId0) {
        return gmbu.n(new flus(this, contactId0, gmcd0), gmap.a);
    }

    public final gmcd b(UUID uUID0, flzo flzo0, gmcd gmcd0, AccountContext accountContext0, flqw flqw0, boolean z) {
        return this.i(uUID0, 0, flzo0, gmcd0, accountContext0.c().f(), flqw0, z, accountContext0, null);
    }

    public final gmcd c(AccountContext accountContext0, ContactId contactId0, glzn glzn0, int v, flqw flqw0, boolean z) {
        if(this.g == null) {
            return gmbu.h(new RuntimeException("tachyonRegistrationHandler is null"));
        }
        if(this.e == null) {
            return gmbu.h(new RuntimeException("oAuthTokenProvider is null"));
        }
        gmcd gmcd0 = this.h(flvd.f(glzn0), contactId0, 6);
        if(z) {
            gmcd gmcd1 = gmbu.b(new gmcd[]{gmcd0}).b(new flur(this, gmcd0, contactId0, accountContext0), gmap.a);
            gmcd0 = gmbu.b(new gmcd[]{gmcd1}).b(new flug(this, gmcd1, glzn0, gmcd0), gmap.a);
        }
        if(v == 0 && accountContext0 != null) {
            gmcd gmcd2 = gmbu.b(new gmcd[]{gmcd0}).b(new flut(this, gmcd0, accountContext0), gmap.a);
            gmcd gmcd3 = gmbu.b(new gmcd[]{gmcd2}).a(new fluu(gmcd2), gmap.a);
            gmcd0 = gmbu.b(new gmcd[]{gmcd3}).b(new fluh(this, gmcd3, glzn0, gmcd0), gmap.a);
        }
        else if(v != 1 && v != 2) {
            return gmbu.h(new RuntimeException("Invalid RequestType: 0"));
        }
        if(flqw0.a.d == 0) {
            return gmcd0;
        }
        flva flva0 = new flva(this, flqw0, glzn0);
        return gmbu.b(new gmcd[]{gmcd0}).b(new flue(this, gmcd0, flva0), gmap.a);
    }

    public final gmcd d(UUID uUID0, flzo flzo0, gmcd gmcd0, ContactId contactId0, flqw flqw0, boolean z) {
        return this.i(uUID0, 1, flzo0, gmcd0, contactId0, flqw0, z, null, null);
    }

    public final gmcd e(UUID uUID0, gfsi gfsi0, AccountContext accountContext0) {
        gmcd gmcd0 = gmbu.n(new fluz(this, accountContext0), gmap.a);
        return gmbu.d(new gmcd[]{gmcd0}).b(new fluf(this, gmcd0, gfsi0, uUID0, accountContext0), gmap.a);
    }

    public static final gmcd f(glzn glzn0) {
        try {
            return glzn0.a(null);
        }
        catch(Exception exception0) {
            return gmbu.h(exception0);
        }
    }

    @Override
    protected final void finalize() {
        flvy flvy0 = this.d;
        if(flvy0.c != null) {
            flvy0.a.unregisterReceiver(flvy0.b);
            iakr iakr0 = flvy0.c;
            if((iakr0 instanceof ianj_grpcChannel)) {
                try {
                    ((ianj_grpcChannel)iakr0).d();
                }
                catch(Exception exception0) {
                    flbj.d("StubFactory", "Failed to shutdown", exception0);
                }
            }
        }
    }

    public final gmcd g(UUID uUID0, flzo flzo0, gmcd gmcd0, AccountContext accountContext0, fmbl fmbl0, flqw flqw0) {
        return this.i(uUID0, 2, flzo0, gmcd0, accountContext0.c().f(), flqw0, true, accountContext0, fmbl0);
    }

    public final gmcd h(gmcd gmcd0, ContactId contactId0, int v) {
        return gmbu.b(new gmcd[]{gmcd0}).b(new flup(this, gmcd0, v, contactId0), gmap.a);
    }

    private final gmcd i(UUID uUID0, int v, flzo flzo0, gmcd gmcd0, ContactId contactId0, flqw flqw0, boolean z, AccountContext accountContext0, fmbl fmbl0) {
        flbo.b();
        return this.c(accountContext0, contactId0, new fluq(this, uUID0, v, flzo0, z, gmcd0, contactId0, accountContext0, fmbl0), v, flqw0, z);
    }
}

