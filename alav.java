import java.util.HashMap;

public final class alav {
    private final ywh a;

    public alav(ywh ywh0) {
        this.a = ywh0;
    }

    public final alda a() {
        return new alcz(this.a);
    }

    public final alcy b() {
        ywh ywh0 = this.a;
        ywh0.k();
        ywf[] arr_ywf = {yux.a, yux.b};
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < 2; ++v) {
            ywf ywf0 = arr_ywf[v];
            alda alda0 = ywf0.a() ? new alcs(alcx.a(ywh0.a())) : this.a();
            hashMap0.put(ywf0, alda0);
        }
        return new alcy(hashMap0);
    }
}

