import java.util.List;

public final class bede {
    public final bedd a;
    public final int b;
    public final gfsx c;
    public final gfsx d;
    public final gfsx e;

    public bede() {
        throw null;
    }

    public bede(bedd bedd0, int v, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        if(bedd0 == null) {
            throw new NullPointerException("Null entryType");
        }
        this.a = bedd0;
        this.b = v;
        this.c = gfsx0;
        this.d = gfsx1;
        this.e = gfsx2;
    }

    public static bede a(bedh bedh0, List list0) {
        gfsx gfsx0 = list0 != null && !list0.isEmpty() ? gfsx.m(gged_interceptors.i(list0)) : gfqx.a;
        gfsx gfsx1 = gfsx.m(bedh0);
        return new bede(bedd.a, 0, gfsx1, gfqx.a, gfsx0);
    }

    public static bede b(gged_interceptors gged0) {
        gfsx gfsx0 = gfsx.m(gged0);
        return new bede(bedd.e, 0, gfqx.a, gfsx0, gfqx.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bede) && this.a.equals(((bede)object0).a) && this.b == ((bede)object0).b && this.c.equals(((bede)object0).c) && this.d.equals(((bede)object0).d) && this.e.equals(((bede)object0).e);
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "CheckupResultEntry{entryType=" + this.a.toString() + ", displayCount=" + this.b + ", credentialGroupBrandingInfoPair=" + this.c + ", checkupSubgroup=" + this.d + ", checkupIssueSubType=" + this.e + "}";
    }
}

