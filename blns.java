import java.util.Iterator;

public final class blns implements gfsi {
    public final blnu a;

    public blns(blnu blnu0) {
        this.a = blnu0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        blnu blnu0;
        Iterator iterator0 = ((Iterable)object0).iterator();
        String s = null;
        while(true) {
            blnu0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            s = (String)object1;
            if(s == null) {
                blnu0.c.a();
                return gfqx.a;
            }
        }
        blnu0.c.a();
        return gfsx.l(s);
    }
}

