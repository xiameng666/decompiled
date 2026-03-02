import j..util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

public final class ggwn extends ggwm {
    public static final Map c;
    private final ggtq d;

    static {
        EnumMap enumMap0 = new EnumMap(ggtq.class);
        ggtq[] arr_ggtq = ggtq.values();
        for(int v = 0; v < arr_ggtq.length; ++v) {
            ggtq ggtq0 = arr_ggtq[v];
            ggwn[] arr_ggwn = new ggwn[10];
            for(int v1 = 0; v1 < 10; ++v1) {
                arr_ggwn[v1] = new ggwn(v1, ggtq0, ggtr.a);
            }
            enumMap0.put(ggtq0, arr_ggwn);
        }
        ggwn.c = DesugarCollections.unmodifiableMap(enumMap0);
    }

    public ggwn(int v, ggtq ggtq0, ggtr ggtr0) {
        super(ggtr0, v);
        ggwv.d(ggtq0, "format char");
        this.d = ggtq0;
        if(!ggtr0.c()) {
            int v1 = ggtq0.l;
            if(ggtr0.d()) {
                v1 &= 0xFFDF;
            }
            StringBuilder stringBuilder0 = new StringBuilder("%");
            ggtr0.f(stringBuilder0);
            stringBuilder0.append(((char)v1));
        }
    }

    @Override  // ggwm
    public final void a(ggwq ggwq0, Object object0) {
        ggwq0.e(object0, this.d, this.b);
    }
}

