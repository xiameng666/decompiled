import android.net.Uri;
import android.text.TextUtils.TruncateAt;
import java.util.List;

public final class bedc {
    public final String a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final heqb e;

    public bedc() {
        throw null;
    }

    public bedc(String s, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, heqb heqb0) {
        this.a = s;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
        this.e = heqb0;
    }

    public final bedb a() {
        bedb bedb0 = new bedb(null);
        bedb0.e(this.a);
        bedb0.d(this.e);
        gfsx gfsx0 = this.b;
        if(gfsx0.i()) {
            bedb0.b(((String)gfsx0.d()));
        }
        gfsx gfsx1 = this.c;
        if(gfsx1.i()) {
            bedb0.c(((String)gfsx1.d()));
        }
        gfsx gfsx2 = this.d;
        if(gfsx2.i()) {
            bedb0.f(((TextUtils.TruncateAt)gfsx2.d()));
        }
        return bedb0;
    }

    public final gfsx b() {
        Uri uri0 = Uri.parse(this.a);
        String s = uri0.getEncodedAuthority();
        if(uri0.getScheme().equals("android") && !gfta.c(s)) {
            List list0 = gfud.e('@').n(uri0.getEncodedAuthority());
            if(list0.size() == 2) {
                return gfsx.m(Uri.decode(((String)list0.get(1))));
            }
        }
        return gfqx.a;
    }

    public final String c() {
        String s = this.a;
        String s1 = Uri.parse(s).getEncodedAuthority();
        if(gfta.c(s1)) {
            return s;
        }
        gfsx gfsx0 = this.b();
        return gfsx0.i() ? ((String)gfsx0.d()) : s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bedc) && this.a.equals(((bedc)object0).a) && this.b.equals(((bedc)object0).b) && this.c.equals(((bedc)object0).c) && this.d.equals(((bedc)object0).d) && ((ProtoLiteMessage)this.e).equals(((bedc)object0).e);
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
        heqb heqb0 = this.e;
        if(((ProtoLiteMessage)heqb0).isImmutable()) {
            return ((ProtoLiteMessage)heqb0).s() ^ v * 1000003;
        }
        int v1 = heqb0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)heqb0).s();
            heqb0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "BlocklistEntry{signOnRealm=" + this.a + ", displayName=" + this.b + ", iconUrl=" + this.c + ", truncateAt=" + this.d + ", passwordSpecificsData=" + this.e + "}";
    }
}

