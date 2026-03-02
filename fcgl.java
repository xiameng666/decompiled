import com.google.android.gms.wearable.AppTheme;
import j..util.Objects;
import java.util.function.Consumer;

public final class fcgl {
    public static final baun a;
    static final AppTheme b;
    private final azts c;

    static {
        fcgl.a = new fcgf(new String[]{"AppThemeFetcher"});
        fcdy fcdy0 = new fcdy();
        fcdy0.a(3);
        fcgl.b = fcdy0.a;
    }

    public fcgl(azts azts0) {
        this.c = azts0;
    }

    public final void a(String s, Consumer consumer0) {
        if(s == null) {
            consumer0.accept(fcgl.b);
            return;
        }
        evql evql0 = this.c.cl(s);
        Objects.requireNonNull(consumer0);
        evql0.b(new fcgi(consumer0));
        evql0.A(new fcgj(consumer0));
        evql0.a(new fcgk(consumer0));
    }
}

