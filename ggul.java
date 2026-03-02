import java.util.Set;

public final class ggul {
    private static final gguh a;
    private static final ggug b;

    static {
        ggul.a = new gguj();
        ggul.b = new gguk();
    }

    public static ggui a(Set set0) {
        ggue ggue0 = new ggue(ggul.a);
        ggue0.f = ggul.b;
        for(Object object0: set0) {
            ggsx ggsx0 = (ggsx)object0;
            ggwv.d(ggsx0, "key");
            if(ggsx0.b) {
                ggwv.d(ggsx0, "key");
                ggue0.c.remove(ggsx0);
                ggue0.d.put(ggsx0, ggue.b);
            }
            else {
                ggwv.d(ggsx0, "key");
                ggue0.d.remove(ggsx0);
                ggue0.c.put(ggsx0, ggue.a);
            }
        }
        return new gguf(ggue0);
    }
}

