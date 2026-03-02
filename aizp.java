import java.util.Set;

public final class aizp {
    public int a;
    private int b;
    private ggfp c;
    private byte d;

    public final aizq a() {
        if(this.d == 1) {
            int v = this.a;
            if(v != 0) {
                ggfp ggfp0 = this.c;
                if(ggfp0 != null) {
                    return new aizq(v, this.b, ggfp0);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == 0) {
            stringBuilder0.append(" updateOption");
        }
        if(this.d == 0) {
            stringBuilder0.append(" access");
        }
        if(this.c == null) {
            stringBuilder0.append(" packageNames");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.b = v;
        this.d = 1;
    }

    public final void c(Set set0) {
        this.c = ggfp.G(set0);
    }
}

