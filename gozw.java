import java.util.Set;

public final class gozw {
    public static Object a(gozx gozx0, gpay gpay0) {
        gpew gpew0 = gozx0.a(gpay0);
        return gpew0 == null ? null : gpew0.a();
    }

    public static Object b(gozx gozx0, Class class0) {
        return gozw.a(gozx0, new gpay(gpax.class, class0));
    }

    public static Set c(gozx gozx0, Class class0) {
        gpay gpay0 = new gpay(gpax.class, class0);
        if(((gpba)gozx0).a.contains(gpay0)) {
            return (Set)((gpba)gozx0).b.c(gpay0).a();
        }
        throw new gpan(String.format("Attempting to request an undeclared dependency Set<%s>.", gpay0));
    }
}

