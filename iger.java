import java.util.Locale;

final class iger extends iged {
    public iger(igdz igdz0) {
        super(igdz0);
    }

    @Override  // igfx
    public final int b(Locale locale0) {
        return igeq.a(locale0).l;
    }

    @Override  // igfx
    public final String o(int v, Locale locale0) {
        return igeq.a(locale0).e[v];
    }

    @Override  // igfx
    protected final int oW(String s, Locale locale0) {
        Integer integer0 = (Integer)igeq.a(locale0).i.get(s);
        if(integer0 != null) {
            return (int)integer0;
        }
        throw new igdb(igcr.h, s);
    }

    @Override  // igfx
    public final String r(int v, Locale locale0) {
        return igeq.a(locale0).d[v];
    }
}

