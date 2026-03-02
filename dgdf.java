import java.util.List;

public final class dgdf implements dgdh {
    public final dggc a;
    public final dgiy b;
    private final iced c;
    private final int d;
    private final String e;
    private final List f;
    private final List g;
    private final List h;
    private final List i;

    public dgdf(dggc dggc0, dgiy dgiy0, iced iced0) {
        this.a = dggc0;
        this.b = dgiy0;
        this.c = iced0;
        this.d = dggc0.a;
        this.e = dggc0.g;
        this.f = dggc0.c;
        this.g = dggc0.d;
        this.h = dggc0.e;
        this.i = dggc0.f;
    }

    @Override  // dgdh
    public final int a() {
        return this.d;
    }

    @Override  // dgdh
    public final String b() {
        return this.e;
    }

    @Override  // dgdh
    public final List c() {
        return this.i;
    }

    @Override  // dgdh
    public final List d() {
        return this.f;
    }

    @Override  // dgdh
    public final List e() {
        return this.g;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgdf)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dgdf)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((dgdf)object0).b) ? ibuq.m(this.c, ((dgdf)object0).c) : false;
    }

    @Override  // dgdh
    public final List f() {
        return this.h;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "Complete(content=" + this.a + ", postProcessor=" + this.b + ", cacheExpiredJob=" + this.c + ")";
    }
}

