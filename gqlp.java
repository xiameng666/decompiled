final class gqlp extends gqmd {
    public final gged_interceptors a;
    private final gfsx b;
    private final ggfp c;
    private final gfsx d;
    private volatile transient gfsx e;
    private volatile transient boolean f;
    private volatile transient boolean g;

    public gqlp(gged_interceptors gged0, gfsx gfsx0, ggfp ggfp0, gfsx gfsx1) {
        if(gged0 == null) {
            throw new NullPointerException("Null credentials");
        }
        this.a = gged0;
        if(gfsx0 == null) {
            throw new NullPointerException("Null affiliatedGroupId");
        }
        this.b = gfsx0;
        if(ggfp0 == null) {
            throw new NullPointerException("Null signonRealmFacets");
        }
        this.c = ggfp0;
        if(gfsx1 == null) {
            throw new NullPointerException("Null federationIconUrl");
        }
        this.d = gfsx1;
    }

    @Override  // gqmd
    public final gfsx a() {
        return this.b;
    }

    @Override  // gqmd
    public final gfsx b() {
        return this.d;
    }

    @Override  // gqmd
    public final gged_interceptors c() {
        return this.a;
    }

    @Override  // gqmd
    public final ggfp d() {
        return this.c;
    }

    @Override  // gqmd
    public final gfsx e() {
        gfsx gfsx0;
        if(this.e == null) {
            synchronized(this) {
                if(this.e == null) {
                    ggqj ggqj0 = this.c.om();
                    while(ggqj0.hasNext()) {
                        Object object0 = ggqj0.next();
                        hhyf hhyf0 = (hhyf)object0;
                        if(((hhyf0.f == null ? hhye.a : hhyf0.f).b & 1) == 0) {
                            continue;
                        }
                        gfsx0 = gfsx.m((hhyf0.f == null ? hhye.a : hhyf0.f).c);
                        goto label_12;
                    }
                    gfsx0 = gfqx.a;
                label_12:
                    this.e = gfsx0;
                    if(this.e == null) {
                        throw new NullPointerException("getChangeOn() cannot return null");
                    }
                }
            }
            return this.e;
        }
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof gqmd)) {
            gged_interceptors gged0 = ((gqmd)object0).c();
            if(ggia.i(this.a, gged0)) {
                gfsx gfsx0 = ((gqmd)object0).a();
                if(this.b.equals(gfsx0)) {
                    ggfp ggfp0 = ((gqmd)object0).d();
                    if(this.c.equals(ggfp0)) {
                        gfsx gfsx1 = ((gqmd)object0).b();
                        return this.d.equals(gfsx1);
                    }
                }
            }
        }
        return false;
    }

    @Override  // gqmd
    public final boolean f() {
        if(!this.g) {
            synchronized(this) {
                if(!this.g) {
                    ggfp ggfp0 = this.c;
                    boolean z = false;
                    if(!ggfp0.isEmpty()) {
                        ggqj ggqj0 = ggfp0.om();
                        while(ggqj0.hasNext()) {
                            Object object0 = ggqj0.next();
                            if(((hhyf)object0).g) {
                                continue;
                            }
                            this.f = z;
                            this.g = true;
                            return this.f;
                        }
                        z = true;
                    }
                    this.f = z;
                    this.g = true;
                }
            }
            return this.f;
        }
        return this.f;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "CredentialGroup{credentials=" + this.a.toString() + ", affiliatedGroupId=" + this.b.toString() + ", signonRealmFacets=" + this.c.toString() + ", federationIconUrl=" + this.d.toString() + "}";
    }
}

