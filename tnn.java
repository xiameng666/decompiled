import java.util.Map;

public final class tnn extends ttm {
    static {
    }

    public tnn(Map map0) {
        super(map0);
    }

    public final tuk a() {
        return new tuk(((tpb)this.f(tpb.a)).d);
    }

    @Override  // ttm
    public final tur b() {
        tpg tpg0 = (tpg)this.a.get(tpg.a);
        byte[] arr_b = tur.a;
        if(tpg0.p(new syf(arr_b))) {
            return new tur(tpg0.k(arr_b));
        }
        throw new IllegalStateException("Missing PAN");
    }

    public final tns c() {
        return ((toy)this.f(toy.a)).a();
    }
}

