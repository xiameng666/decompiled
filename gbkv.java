import android.content.Context;
import com.google.android.wallet.bender3.framework.storage.Bender3Database;

public final class gbkv {
    public static final gbkv a;
    private static volatile Bender3Database b;

    static {
        gbkv.a = new gbkv();
    }

    public final Bender3Database a(Context context0) {
        Bender3Database bender3Database1;
        ibuq.f(context0, "context");
        Bender3Database bender3Database0 = gbkv.b;
        if(bender3Database0 == null) {
            synchronized(this) {
                bender3Database1 = gbkv.b;
                if(bender3Database1 == null) {
                    bender3Database1 = gbku.b(Bender3Database.m, context0);
                    gbkv.b = bender3Database1;
                }
            }
            return bender3Database1;
        }
        return bender3Database0;
    }
}

