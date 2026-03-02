import android.content.Context;
import java.util.Set;

public final class ejzb {
    final ejzc a;

    static {
        bboh.b("ROM_DasherAccountLookup", bbcu.bN);
    }

    public ejzb(Context context0) {
        this.a = new ejzd(cchj.b(context0));
    }

    public final boolean a(String s) {
        Set set0 = ((ejzd)this.a).a;
        if(set0 == null) {
            return gfta.c(s) || s.endsWith("@gmail.com") ? false : !s.endsWith("@google.com");
        }
        return set0.contains(s);
    }
}

