import java.util.List;
import java.util.Locale;

public final class fclq implements lqj {
    public final fcjn a;

    public fclq(fcjn fcjn0) {
        this.a = fcjn0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        List list0 = (List)object0;
        Locale locale0 = Locale.getDefault();
        fcjn.a.h(String.format(locale0, "Setting %d devices", list0.size()), new Object[0]);
        this.a.e = list0;
        this.a.q();
    }
}

