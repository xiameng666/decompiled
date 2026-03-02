import android.content.Context;
import j..util.Objects;

public final class dtzb {
    public static int a(Context context0, int v, int v1) {
        return fsce.a(context0) ? v1 : v;
    }

    public static evql b(bavt bavt0) {
        evqp evqp0 = new evqp();
        evql evql0 = bavt0.b(new azty[]{new dtyy()});
        evql0.b(new dtyz(evqp0));
        Objects.requireNonNull(evqp0);
        evql0.A(new dtza(evqp0));
        return evqp0.a;
    }

    public static String c(Context context0, String s) {
        return s.toLowerCase(context0.getResources().getConfiguration().getLocales().get(0));
    }

    public static int d(gtxf gtxf0) {
        if(hwev.c()) {
            if(gtxf0.ordinal() != 0 && gtxf0.ordinal() != 1 && gtxf0.ordinal() != 2 && gtxf0.ordinal() != 3 && gtxf0.ordinal() != 4) {
                throw new IllegalArgumentException(String.format("Unknown mdoc type: %s", gtxf0.name()));
            }
            return 11;
        }
        switch(gtxf0.ordinal()) {
            case 0: 
            case 1: {
                return 8;
            }
            case 2: 
            case 3: 
            case 4: {
                return 11;
            }
            default: {
                throw new IllegalArgumentException(String.format("Unknown mdoc type: %s", gtxf0.name()));
            }
        }
    }
}

