import android.accounts.Account;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class cpws {
    public static final Map a;
    public final Context b;

    static {
        cpws.a = new HashMap();
    }

    public cpws(Context context0) {
        this.b = context0;
    }

    public static String a(String s, String s1, Account account0) {
        String s2 = a.r(s1, s, "-");
        return account0 == null ? s2 : s2 + "-" + account0.name;
    }
}

