import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class epvg {
    public static final epvg a;
    public final Map b;

    static {
        epvg.a = new epvg();
    }

    private epvg() {
        this.b = new HashMap();
    }

    public final Set a(String s, Account account0) {
        epvf epvf0 = new epvf(s, account0);
        Set set0 = (Set)this.b.get(epvf0);
        return set0 == null ? null : ggch.j(set0).l(new epve()).p();
    }

    public final boolean b(String s, Account account0) {
        epvf epvf0 = new epvf(s, account0);
        return this.b.containsKey(epvf0);
    }
}

