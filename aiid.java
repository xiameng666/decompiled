import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

public final class aiid {
    private final Context a;
    private static final baun b;

    static {
        aiid.b = new baun(new String[]{"AuthTokenProvider"});
    }

    public aiid(Context context0) {
        this.a = context0;
    }

    public final String a(Account account0, int v) {
        int v1 = 0;
        while(v1 < v + 1) {
            aiid.b.d("getting auth token. Attempt %d", new Object[]{v1});
            try {
                String s = "oauth2:" + hpqx.d();
                String s1 = acso.f(this.a, account0, s);
                aiid.b.h("successfully got auth token", new Object[0]);
                return s1;
            }
            catch(IOException iOException0) {
                aiid.b.n("Retryable error when getting auth token", iOException0, new Object[0]);
                ++v1;
            }
        }
        aiid.b.m(a.f(v, "Failed to retrieve an auth token after ", " attempts"), new Object[0]);
        return null;
    }
}

