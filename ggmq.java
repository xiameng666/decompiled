import java.io.Serializable;

final class ggmq extends ggmo implements Serializable {
    static final ggmo a;
    private static final long serialVersionUID;

    static {
        ggmq.a = new ggmq();
    }

    @Override  // ggmo
    public final int compare(Object object0, Object object1) {
        TimeRange ggmr0 = (TimeRange)object0;
        TimeRange ggmr1 = (TimeRange)object1;
        return ggbe.b.d(ggmr0.b, ggmr1.b).d(ggmr0.c, ggmr1.c).a();
    }
}

