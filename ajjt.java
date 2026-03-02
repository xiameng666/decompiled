import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajjt extends cjtm {
    private final ajhd a;
    private final byte[] b;
    private static final baun c;

    static {
        ajjt.c = new baun(new String[]{"HaveKeyWithKeyHandleOperation"}, null);
    }

    public ajjt(ajhd ajhd0, byte[] arr_b, azug azug0) {
        super(0x81, "HaveKeyWithKeyHandleOperation", azug0);
        this.a = ajhd0;
        this.b = arr_b;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajjt.c.h("Have key with key handle operation is called.", new Object[0]);
        try {
            ajfn ajfn0 = new ajfn(context0);
            byte[] arr_b = this.b;
            ajiz ajiz0 = ajfn0.g(arr_b);
            if(hptm.a.b().c() && ajiz0.d == null && !ajiz0.a.equals("fido:android_corp_strongbox_key") && !new ygc(ajjt.c).b(arr_b)) {
                String s = bbmu.c(arr_b);
                ajfn.c.d("Deleting key instance for [keyHandle=%s].", new Object[]{s});
                ajfo ajfo0 = ajfo.c(ajfn0.b);
                try {
                    SQLiteDatabase sQLiteDatabase0 = ajfo0.getReadableDatabase();
                }
                catch(SQLiteException sQLiteException0) {
                    throw new ajiv("failed to open db ", sQLiteException0);
                }
                if(sQLiteDatabase0.delete("keys", "key_handle = ?", new String[]{s}) <= 0) {
                    ajfn.c.m("No rows found for [keyHandle=%s]", new Object[]{s});
                }
                else {
                    ajfn.c.d("Successfully deleted key instance.", new Object[0]);
                    try {
                        ygc.d(arr_b);
                    }
                    catch(ygj unused_ex) {
                    }
                }
                ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
                this.a.b(false, apiMetadata0);
            }
            ApiMetadata apiMetadata1 = cckf.d(bbdp.R);
            this.a.b(true, apiMetadata1);
        }
        catch(ajiv unused_ex) {
            ApiMetadata apiMetadata2 = cckf.d(bbdp.R);
            this.a.b(false, apiMetadata2);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

