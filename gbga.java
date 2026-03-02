import android.content.Context;
import com.google.android.wallet.bender3.framework.storage.Bender3Database;

public final class gbga {
    public final icck a;
    public final gbla b;
    public gmcd c;

    public gbga(Context context0, String s, icck icck0) {
        ibuq.f(context0, "applicationContext");
        ibuq.f(s, "instantBuySessionId");
        gbla gbla0 = gbku.b(Bender3Database.m, context0).v();
        gmcd gmcd0 = icpu.e(icck0, new gbfw(gbla0, s, null));
        ibuq.f(context0, "applicationContext");
        ibuq.f(s, "instantBuySessionId");
        ibuq.f(gbla0, "instantBuySessionDao");
        ibuq.f(gmcd0, "futureInstantBuySessionEntity");
        super();
        this.a = icck0;
        this.b = gbla0;
        this.c = gmcd0;
    }
}

