import android.content.pm.PackageManager.NameNotFoundException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.c;
import com.google.android.gms.ads.identifier.d;
import j..util.Objects;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class crpb extends crqc {
    public final crju a;
    public final crju b;
    public final crju c;
    public final crju d;
    public final crju e;
    public final crju f;
    private final Map g;

    public crpb(crqq crqq0) {
        super(crqq0);
        this.g = new HashMap();
        crjx crjx0 = this.ap();
        Objects.requireNonNull(crjx0);
        this.a = new crju(crjx0, "last_delete_stale", 0L);
        crjx crjx1 = this.ap();
        Objects.requireNonNull(crjx1);
        this.b = new crju(crjx1, "last_delete_stale_batch", 0L);
        crjx crjx2 = this.ap();
        Objects.requireNonNull(crjx2);
        this.c = new crju(crjx2, "backoff", 0L);
        crjx crjx3 = this.ap();
        Objects.requireNonNull(crjx3);
        this.d = new crju(crjx3, "last_upload", 0L);
        crjx crjx4 = this.ap();
        Objects.requireNonNull(crjx4);
        this.e = new crju(crjx4, "last_upload_attempt", 0L);
        crjx crjx5 = this.ap();
        Objects.requireNonNull(crjx5);
        this.f = new crju(crjx5, "midnight_offset", 0L);
    }

    @Override  // crqc
    protected final void aM() {
    }

    public c b(String s) {
        return d.a(this.aj());
    }

    @Deprecated
    final Pair c(String s) {
        crpa crpa1;
        c c0;
        this.n();
        long v = SystemClock.elapsedRealtime();
        crpa crpa0 = (crpa)this.g.get(s);
        if(crpa0 != null && v < crpa0.c) {
            return new Pair(crpa0.a, Boolean.valueOf(crpa0.b));
        }
        long v1 = this.am().h(s) + v;
        try {
            try {
                c0 = this.b(s);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                if(crpa0 != null && v < crpa0.c + this.am().j(s, crif.c)) {
                    return new Pair(crpa0.a, Boolean.valueOf(crpa0.b));
                }
                c0 = null;
            }
            if(c0 == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.valueOf(false));
            }
            String s1 = c0.a;
            crpa1 = s1 == null ? new crpa("", c0.b, v1) : new crpa(s1, c0.b, v1);
        }
        catch(Exception exception0) {
            this.aJ().j.b("Unable to get advertising id", exception0);
            crpa1 = new crpa("", false, v1);
        }
        this.g.put(s, crpa1);
        return new Pair(crpa1.a, Boolean.valueOf(crpa1.b));
    }

    final Pair d(String s, crmb crmb0) {
        return crmb0.o() ? this.c(s) : new Pair("", Boolean.valueOf(false));
    }

    @Deprecated
    final String e(String s, boolean z) {
        this.n();
        String s1 = z ? ((String)this.c(s).first) : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigest0 = crqx.D();
        return messageDigest0 == null ? null : String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest(s1.getBytes())));
    }
}

