import java.util.Locale;

final class igdx extends iggi {
    public igdx() {
        super(igcr.n, igdz.F, igdz.G);
    }

    @Override  // igfx
    public final int b(Locale locale0) {
        return igeq.a(locale0).m;
    }

    @Override  // igfx
    public final long m(long v, String s, Locale locale0) {
        String[] arr_s = igeq.a(locale0).f;
        int v1 = arr_s.length;
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            if(arr_s[v1].equalsIgnoreCase(s)) {
                return this.l(v, v1);
            }
        }
        throw new igdb(igcr.n, s);
    }

    @Override  // igfx
    public final String r(int v, Locale locale0) {
        return igeq.a(locale0).f[v];
    }
}

