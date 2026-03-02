import java.util.Map;

public final class ajag {
    public int a;
    private boolean b;
    private ggeo c;
    private byte d;

    public final ajah a() {
        if(this.d == 1) {
            ggeo ggeo0 = this.c;
            if(ggeo0 != null) {
                int v = this.a;
                if(v != 0) {
                    return new ajah(this.b, ggeo0, v);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == 0) {
            stringBuilder0.append(" hasAccessDeniedError");
        }
        if(this.c == null) {
            stringBuilder0.append(" blockDataMap");
        }
        if(this.a == 0) {
            stringBuilder0.append(" resultType");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(Map map0) {
        this.c = ggeo.k(map0);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = 1;
    }
}

