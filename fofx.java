import android.accounts.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fofx implements glzn {
    public final fofy a;
    public final gfsi b;

    public fofx(fofy fofy0, gfsi gfsi0) {
        this.a = fofy0;
        this.b = gfsi0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        fofy fofy0;
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = ((List)object0).iterator();
        while(true) {
            fofy0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            fkvi fkvi0 = fofy0.b.a(((Account)object1));
            arrayList0.add(((gmcd)this.b.apply(fkvi0)));
        }
        return gdtf.a(arrayList0).a(new fofw(fofy0, ((List)object0), arrayList0), gmap.a);
    }
}

