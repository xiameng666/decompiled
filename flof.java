import java.util.List;

public abstract class flof {
    public abstract fmaj a();

    public abstract int b();

    public abstract Object c();

    public static gged_interceptors d(List list0) {
        ggdy ggdy0 = new ggdy();
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            flof flof0 = (flof)object0;
            if(flof0.b() == 1) {
                ggdy0.i(flof0.a());
            }
        }
        return ggdy0.h();
    }

    public static gged_interceptors e(List list0) {
        ggdy ggdy0 = new ggdy();
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            flof flof0 = (flof)object0;
            if(flof0.b() == 2) {
                ggdy0.i(flof0.c());
            }
        }
        return ggdy0.h();
    }
}

