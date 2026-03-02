import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import j..util.Objects;

final class fdzn {
    final fczq a;
    final fdzv b;

    public fdzn(fdzv fdzv0, fczq fczq0) {
        this.a = fczq0;
        Objects.requireNonNull(fdzv0);
        this.b = fdzv0;
        super();
    }

    public final void a(hhsq hhsq0, hhsq hhsq1) {
        ffds ffds0 = ((felm)this.b.v.get()).c;
        String s = this.a.b;
        ContentValues contentValues0 = new ContentValues();
        if(hhsq0 == null && hhsq1 == null) {
            contentValues0.put("crypto", "");
        }
        else if(hhsq1 == null) {
            byte[] arr_b = hhsq0.m();
            contentValues0.put("crypto", ghjc.d.o(arr_b));
        }
        else {
            byte[] arr_b1 = new byte[0x92];
            byte[] arr_b2 = hhsq0.m();
            byte[] arr_b3 = hhsq1.m();
            System.arraycopy(arr_b2, 0, arr_b1, 0, 73);
            System.arraycopy(arr_b3, 0, arr_b1, 73, 73);
            contentValues0.put("crypto", ghjc.d.o(arr_b1));
        }
        try {
            ffds0.a.getWritableDatabase().update("connectionConfigurations", contentValues0, "name=?", new String[]{s});
        }
        catch(SQLiteException sQLiteException0) {
            Log.e("ConnectionConfig", "savePreviousAndPenultimateCryptosFor failed: ", sQLiteException0);
        }
    }
}

