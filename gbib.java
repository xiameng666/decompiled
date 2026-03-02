import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.List;

public final class gbib implements gbhm {
    private final boolean a;
    private final ByteString b;
    private final WidgetConfig c;
    private final List d;
    private final String e;
    private final Long f;

    public gbib(boolean z, ByteString hfsf0, WidgetConfig widgetConfig0, List list0, String s, Long long0) {
        ibuq.f(hfsf0, "sessionData");
        ibuq.f(list0, "accounts");
        super();
        this.a = z;
        this.b = hfsf0;
        this.c = widgetConfig0;
        this.d = list0;
        this.e = s;
        this.f = long0;
    }

    @Override  // gbhm
    public final int a() {
        return 8;
    }

    @Override  // gbhm
    public final long b() {
        return 0L;
    }

    @Override  // gbhm
    public final Object c() {
        return ibom.a;
    }

    @Override  // gbhm
    public final void d(Object object0, Object object1) {
        ibuq.f(object0, "setter");
        String s = this.e;
        if(s != null && s.length() != 0) {
            ((gbic)object0).G(s);
        }
        Long long0 = this.f;
        if(long0 != null) {
            ((gbic)object0).H(long0.longValue());
        }
        int v = this.d.indexOf(this.c.a);
        ((gbic)object0).e(this.d, v);
        ((gbic)object0).x(this.a);
        ((gbic)object0).B(((long)this.c.d));
        ((gbic)object0).Q(this.b);
    }
}

