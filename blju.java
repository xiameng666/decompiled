import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class blju extends cjtm {
    private final bnba a;
    private final bmdk b;
    private final String c;

    static {
        bnaa.d("IncrementAndGetCounterOperation");
    }

    public blju(bmdk bmdk0, String s, azug azug0) {
        super(0xD6, "IncrementAndGetCounter", azug0);
        this.b = bmdk0;
        this.c = s;
        this.a = (bnba)bnba.e.b();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        long v;
        try {
            String s = this.c;
            gftb.z(s, "keyStorageIdentifier cannot be null");
            gftb.b(((boolean)(s.trim().isEmpty() ^ 1)), "keyStorageIdentifier cannot be empty");
            bnba bnba0 = this.a;
            gftb.z(s, "identifier cannot be null");
            bnaz bnaz0 = bnba0.b(s);
            if(bnaz0 == null) {
                v = -1L;
                goto label_14;
            }
            SQLiteDatabase sQLiteDatabase0 = bnba0.a();
            v = bnaz0.b + 1L;
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("counter", Long.valueOf(v));
            if(sQLiteDatabase0.update("registered_credentials", contentValues0, "id = ?", new String[]{s}) == 1) {
            label_14:
                ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
                this.b.a(Status.b, v, apiMetadata0);
                return;
            }
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.b = "Error incrementing the counter of the key in the SQLite database";
            throw bxly0.a();
        }
        catch(bxma bxma0) {
            Status status0 = bxma0.a();
            ApiMetadata apiMetadata1 = cckf.d(bbdp.bv);
            this.b.a(status0, -1L, apiMetadata1);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.b.a(status0, -1L, apiMetadata0);
    }
}

