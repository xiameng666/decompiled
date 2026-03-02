import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class blnn {
    public static final bboh a;
    public final SQLiteDatabase b;
    private final bnbb c;

    static {
        blnn.a = bnaa.d("AssetLinksCache");
    }

    public blnn(Context context0) {
        bnbb bnbb0 = bnbb.c(context0);
        this.c = bnbb0;
        this.b = bxlg.a(bnbb0, "fido_embedded_security_key.db", true);
    }

    public final long a() {
        return System.currentTimeMillis() / 1000L;
    }
}

