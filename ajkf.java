import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajkf extends cjtm {
    private final ajha a;
    private final String b;
    private final Account c;
    private final baun d;

    public ajkf(ajha ajha0, String s, Account account0, azug azug0) {
        super(0x81, "RetrieveExportedSymmetricKeyOperation", azug0);
        this.d = new baun(new String[]{"RetrieveExportedSymmetricKeyOperation"}, null);
        this.a = ajha0;
        this.b = s;
        this.c = account0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajjb ajjb0;
        SQLiteDatabase sQLiteDatabase0;
        ajip ajip0 = new ajip(context0);
        ajip0.a = 6;
        ajfn ajfn0 = new ajfn(context0);
        try {
            String s = this.b;
            ajfn.c.d("Finding all symmetric key Instances for %s", new Object[]{s});
            String s1 = this.c.name;
            ajfo ajfo0 = ajfo.c(ajfn0.b);
            try {
                sQLiteDatabase0 = ajfo0.getReadableDatabase();
            }
            catch(SQLiteException sQLiteException0) {
                throw new ajiv("failed to open db", sQLiteException0);
            }
            sQLiteDatabase0.beginTransaction();
            try {
                Cursor cursor0 = ajfn.u(sQLiteDatabase0, new String[]{"key_handle", "key_type", "master_key", "active_status", "creation_time", "expiration_time"}, "key_name = ? AND account = ? AND exportable = ? AND key_form = ?", new String[]{s, s1, Integer.toString(2), Integer.toString(ygg.b.e)});
                if(cursor0 == null || !cursor0.moveToFirst()) {
                    throw new ajiv(a.a(s, "No exportable key for keyName=", " found."));
                }
                sQLiteDatabase0.setTransactionSuccessful();
                ajjb0 = ajfn.t(cursor0, s, s1);
            }
            finally {
                sQLiteDatabase0.endTransaction();
                ajfo0.close();
            }
        }
        catch(ajiv ajiv0) {
            this.d.l(ajiv0);
            ajip0.b = 10;
            ajip0.a();
            this.j(new Status(25506));
            return;
        }
        ExportedSymmetricKey exportedSymmetricKey0 = new ExportedSymmetricKey(ajjb0.b.a, ajjb0.b.c);
        ajip0.b = 1;
        ajip0.a();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
        this.a.c(exportedSymmetricKey0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

