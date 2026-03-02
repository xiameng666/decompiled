import java.util.HashMap;

final class alnh {
    private final ywh a;

    public alnh(ywh ywh0) {
        this.a = ywh0;
    }

    public final alpw a() {
        return this.b(this.a.k().a());
    }

    public final alpw b(ywf ywf0) {
        return ywf0.a() ? new alpf(alpt.a(this.a.a())) : new alpv(this.a);
    }

    public final alpu c() {
        this.a.k();
        ywf[] arr_ywf = {yux.a, yux.b};
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < 2; ++v) {
            ywf ywf0 = arr_ywf[v];
            hashMap0.put(ywf0, this.b(ywf0));
        }
        return new alpu(hashMap0);
    }
}

