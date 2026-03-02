import java.util.List;

public final class gqlo {
    public final String a;
    public final gqln b;
    private static final ggfp c;

    static {
        gqlo.c = ggfp.M(gqln.b, gqln.d, gqln.c, gqln.e);
    }

    public gqlo() {
        throw null;
    }

    public gqlo(String s, gqln gqln0) {
        if(s == null) {
            throw new NullPointerException("Null value");
        }
        this.a = s;
        if(gqln0 == null) {
            throw new NullPointerException("Null facetIdScheme");
        }
        this.b = gqln0;
    }

    public static gfsx a(String s) {
        gfsx gfsx0 = gqlo.b(s);
        return gfsx0.i() && ((gqlo)gfsx0.d()).d() ? gfsx0 : gfqx.a;
    }

    public static gfsx b(String s) {
        glwd glwd0 = glwd.b(s);
        gqln gqln0 = gqln.a(glwd0.a);
        String s1 = glwd0.b;
        if(gqlo.c.contains(gqln0) && !gfta.c(s1)) {
            if(gqln.e.equals(gqln0)) {
                gqln0 = gqln.c;
            }
            if(!gqln0.equals(gqln.b)) {
                goto label_11;
            }
            List list0 = gfud.e('@').n(s1);
            if(list0.size() == 2 && !((String)list0.get(0)).isEmpty() && !((String)list0.get(1)).isEmpty()) {
                CharSequence charSequence0 = (CharSequence)list0.get(0);
                if(ghjc.e.l(charSequence0)) {
                label_11:
                    glwd glwd1 = new glwd();
                    glwd1.a = gqln0.f;
                    glwd1.b = s1;
                    return gfsx.m(new gqlo(glwd1.toString(), gqln0));
                }
            }
        }
        return gfqx.a;
    }

    public static gqlo c(hhyf hhyf0) {
        glwd glwd0 = glwd.b(hhyf0.c);
        return new gqlo((hhyf0.c.endsWith("/") ? hhyf0.c.substring(0, hhyf0.c.length() - 1) : hhyf0.c), gqln.a(glwd0.a));
    }

    public final boolean d() {
        return this.b.equals(gqln.b);
    }

    public final boolean e() {
        return this.b.equals(gqln.d);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gqlo) && this.a.equals(((gqlo)object0).a) && this.b.equals(((gqlo)object0).b);
    }

    public final boolean f() {
        return this.b.equals(gqln.c);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "FacetId{value=" + this.a + ", facetIdScheme=" + this.b.toString() + "}";
    }
}

