public final class hflc implements gful_cronetEngineProvider {
    public final hfnh a;

    public hflc(hfnh hfnh0) {
        this.a = hfnh0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        hfky hfky0;
        try {
            hfky0 = hfkt.a(this.a);
        }
        catch(IllegalArgumentException unused_ex) {
            return ggna.a;
        }
        if(hfky0.b.size() != 1) {
            return ggna.a;
        }
        hfkx hfkx0 = (hfkx)hfky0.b.get(0);
        hfkw hfkw0 = hfkx0.b == 1 ? ((hfkw)hfkx0.c) : hfkw.a;
        hhex hhex0 = hfkw0.c == null ? hhex.a : hfkw0.c;
        return gged_interceptors.l(Integer.valueOf((hhex0.c == null ? hhew.a : hhex0.c).h));
    }
}

