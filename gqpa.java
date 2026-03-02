import java.util.List;
import org.w3c.dom.Element;

public final class gqpa {
    public final long a;
    public final gged_interceptors b;
    public final gged_interceptors c;

    private gqpa(long v, gged_interceptors gged0, gged_interceptors gged1) {
        this.a = v;
        this.b = gged0;
        this.c = gged1;
    }

    public static gqpa a(byte[] arr_b) {
        Element element0 = gqoy.c(arr_b);
        long v = Long.parseLong(((String)gqoy.e(2, element0, new String[]{"metadata", "serial"}).get(0)));
        Long.parseLong(((String)gqoy.e(2, element0, new String[]{"metadata", "refresh-interval"}).get(0)));
        List list0 = gqoy.e(1, element0, new String[]{"intermediates", "cert"});
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            ggdy0.i(gqoy.b(gqoy.d(((String)object0))));
        }
        gged_interceptors gged0 = ggdy0.h();
        List list1 = gqoy.e(3, element0, new String[]{"endpoints", "cert"});
        ggdy ggdy1 = new ggdy();
        for(Object object1: list1) {
            ggdy1.i(gqoy.b(gqoy.d(((String)object1))));
        }
        return new gqpa(v, gged0, ggdy1.h());
    }
}

