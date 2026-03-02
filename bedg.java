import java.io.Serializable;

public final class bedg implements gqms, Serializable {
    public final String a;
    public final gfsx b;
    public final String c;
    public final gqmg d;
    public final heqb e;
    public final hery f;
    private final gfsx g;

    public bedg() {
        throw null;
    }

    public bedg(String s, gfsx gfsx0, String s1, gfsx gfsx1, gqmg gqmg0, heqb heqb0, hery hery0) {
        if(s == null) {
            throw new NullPointerException("Null username");
        }
        this.a = s;
        this.b = gfsx0;
        if(s1 == null) {
            throw new NullPointerException("Null signonRealm");
        }
        this.c = s1;
        this.g = gfsx1;
        if(gqmg0 == null) {
            throw new NullPointerException("Null credentialType");
        }
        this.d = gqmg0;
        if(heqb0 == null) {
            throw new NullPointerException("Null passwordSpecificsData");
        }
        this.e = heqb0;
        this.f = hery0;
    }

    @Override  // gqms
    public final gfsx a() {
        return this.g;
    }

    @Override  // gqms
    public final gfsx b() {
        if(gqmq.a(this)) {
            return gfsx.m(new bedf(this.f.f));
        }
        gqme gqme0 = new gqme();
        return this.b.b(gqme0);
    }

    @Override  // gqms
    public final gqmg c() {
        return this.d;
    }

    @Override  // gqms
    public final String d() {
        return this.c;
    }

    @Override  // gqms
    public final String e() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bedg) && this.a.equals(((bedg)object0).a) && this.b.equals(((bedg)object0).b) && this.c.equals(((bedg)object0).c) && this.g.equals(((bedg)object0).g) && this.d.equals(((bedg)object0).d) && ((ProtoLiteMessage)this.e).equals(((bedg)object0).e)) {
            return this.f == null ? ((bedg)object0).f == null : ((ProtoLiteMessage)this.f).equals(((bedg)object0).f);
        }
        return false;
    }

    public static bedg f(hery hery0) {
        return new bedg(hery0.k, gfqx.a, (hery0.g.indexOf(58) == -1 ? a.a(hery0.g, "https://", "/") : hery0.g), gfqx.a, gqmg.c, heqb.a, hery0);
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.d.hashCode();
        heqb heqb0 = this.e;
        if(((ProtoLiteMessage)heqb0).isImmutable()) {
            v1 = ((ProtoLiteMessage)heqb0).s();
        }
        else {
            int v2 = heqb0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)heqb0).s();
                heqb0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        hery hery0 = this.f;
        if(hery0 == null) {
            return (v * 1000003 ^ v1) * 1000003;
        }
        if(((ProtoLiteMessage)hery0).isImmutable()) {
            return ((ProtoLiteMessage)hery0).s() ^ (v * 1000003 ^ v1) * 1000003;
        }
        int v3 = hery0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)hery0).s();
            hery0.memoizedHashCode = v3;
        }
        return v3 ^ (v * 1000003 ^ v1) * 1000003;
    }

    @Override
    public final String toString() {
        return "Credential{username=" + this.a + ", password=" + this.b.toString() + ", signonRealm=" + this.c + ", federationUrl=" + this.g.toString() + ", credentialType=" + this.d.toString() + ", passwordSpecificsData=" + this.e.toString() + ", passkey=" + this.f + "}";
    }
}

