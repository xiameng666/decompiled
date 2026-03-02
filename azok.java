import j..util.Optional;

final class azok extends gfvk {
    private final einq a;
    private final gemk b;

    public azok(einq einq0, gemk gemk0) {
        this.a = einq0;
        this.b = gemk0;
    }

    @Override  // gfvk
    public final Object a(Object object0) {
        gged_interceptors gged0;
        ggdy ggdy0 = new ggdy();
        int v = ((azoj)object0).b;
        Optional optional0 = azjg.a(this.b, ((azoj)object0).a);
        if(optional0.isEmpty()) {
            gged0 = ggna.a;
        }
        else {
            Optional optional1 = azjg.b(((geml)optional0.get()), v);
            if(optional1.isEmpty()) {
                gged0 = ggna.a;
            }
            else {
                gged0 = ((genf)optional1.get()).e.isEmpty() ? gged_interceptors.i(((geml)optional0.get()).d) : gged_interceptors.i(((genf)optional1.get()).e);
            }
        }
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            String s = (String)gged0.get(v2);
            Object object1 = azom.b(this.a, s, ((azoj)object0).c);
            if(object1.b != 1) {
                return object1;
            }
            ggdy0.k(object1.a);
        }
        return azol.a(ggdy0.h());
    }
}

