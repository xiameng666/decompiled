import java.util.Map.Entry;

public final class ajd {
    public static adx a(acfl acfl0, kas kas0) {
        kay.i(acfl0);
        adw adw0 = new adw();
        for(Object object0: acfl0.b().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            try {
                Object object1 = kas0.a(map$Entry0.getValue());
                adw0.d(map$Entry0.getKey(), object1);
            }
            catch(Throwable throwable0) {
                adw0.c(map$Entry0.getKey(), aea.a(throwable0));
            }
        }
        for(Object object2: acfl0.a().entrySet()) {
            adw0.b(((Map.Entry)object2).getKey(), ((acgs)((Map.Entry)object2).getValue()).a, ((acgs)((Map.Entry)object2).getValue()).b);
        }
        return adw0.a();
    }
}

