import java.util.Map;

public class gazf {
    private final gazw a;

    public gazf(gazw gazw0) {
        this.a = gazw0;
    }

    protected final gazh a(String s) {
        gazi gazi0;
        Map map0 = this.a.a;
        String s1 = this.b(s);
        synchronized(map0) {
            gazi0 = (gazi)map0.get(s1);
            if(!(gazi0 instanceof gazh)) {
                if(gazi0 != null) {
                    throw new IllegalStateException("metric " + s1 + " already exists, but is not " + new ibuk(gazh.class).c() + "; is " + gazi0.getClass().getSimpleName());
                }
                gazi0 = new gazh(null);
                map0.put(s1, gazi0);
                return (gazh)gazi0;
            }
        }
        return (gazh)gazi0;
    }

    protected String b(String s) {
        return s;
    }
}

