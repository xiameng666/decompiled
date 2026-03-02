import java.util.Iterator;

public final class fxda implements gfsi {
    public final fxdb a;
    public final int b;

    public fxda(fxdb fxdb0, int v) {
        this.a = fxdb0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fxdb fxdb0;
        if(((hecr)object0) == null) {
            return new fvuo();
        }
        Object object1 = new fvuo();
        Iterator iterator0 = ((hecr)object0).a.iterator();
        fvuc fvuc0 = null;
        while(true) {
            fxdb0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object2 = iterator0.next();
            fvuc fvuc1 = (fvuc)object2;
            if(!fvuc1.c()) {
                fxdb0.a(fvuc1, ((fvuo)object1));
            }
            else if(this.b == 3) {
                fvuc0 = fvuc1;
            }
            else {
                fxdb0.a(fvuc1, fxdb0.b);
            }
        }
        if(fvuc0 == null) {
            return object1;
        }
        fxdb0.b = new fvuo();
        fxdb0.a(fvuc0, fxdb0.b);
        return object1;
    }
}

