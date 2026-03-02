import android.accounts.Account;
import java.util.Iterator;
import java.util.List;

public final class fofu implements glzn {
    public final fofy a;
    public final String b;

    public fofu(fofy fofy0, String s) {
        this.a = fofy0;
        this.b = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Iterator iterator0 = ((List)object0).iterator();
        while(iterator0.hasNext()) {
            String s = this.b;
            Object object1 = iterator0.next();
            Account account0 = (Account)object1;
            if(s.equals(account0.name)) {
                gmcd gmcd0 = this.a.b.a(account0).d();
                return gdtf.b(new gmcd[]{gmcd0}).a(new fofv(this.a, s, gmcd0), gmap.a);
            }
        }
        return gmbu.i(null);
    }
}

