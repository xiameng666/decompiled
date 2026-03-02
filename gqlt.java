import java.io.Serializable;

public final class gqlt implements Serializable {
    public final String a;
    public final hhyo b;
    public final gged_interceptors c;

    public gqlt() {
        throw null;
    }

    public gqlt(String s, hhyo hhyo0, gged_interceptors gged0) {
        this.a = s;
        this.b = hhyo0;
        this.c = gged0;
    }

    public static gqls a() {
        gqls gqls0 = new gqls();
        gqls0.b = "";
        return gqls0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gqlt) && this.a.equals(((gqlt)object0).a) && ((ProtoLiteMessage)this.b).equals(((gqlt)object0).b) && ggia.i(this.c, ((gqlt)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        hhyo hhyo0 = this.b;
        if(((ProtoLiteMessage)hhyo0).isImmutable()) {
            int v1 = ((ProtoLiteMessage)hhyo0).s();
            return this.c.hashCode() ^ (v * 1000003 ^ v1) * 1000003;
        }
        int v2 = hhyo0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)hhyo0).s();
            hhyo0.memoizedHashCode = v2;
        }
        return this.c.hashCode() ^ (v * 1000003 ^ v2) * 1000003;
    }

    @Override
    public final String toString() {
        return "AffiliatedGroup{id=" + this.a + ", groupBrandingInfo=" + this.b + ", credentialGroups=" + this.c + "}";
    }
}

