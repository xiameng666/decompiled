import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.internal.MatrixCursorParcelable;

public final class egml extends eglh {
    protected final String a;
    private final eggv b;
    private final Uri c;
    private final String[] d;
    private final String e;
    private final String[] r;
    private final String s;

    public egml(String s, int v, eggv eggv0, Uri uri0, String[] arr_s, String s1, String[] arr_s1, String s2, azug azug0) {
        super(s, v, null, "QueryGalProvider", azug0);
        this.a = s;
        this.b = eggv0;
        this.c = uri0;
        this.d = arr_s;
        this.e = s1;
        this.r = arr_s1;
        this.s = s2;
    }

    private final void b(egof egof0, MatrixCursorParcelable matrixCursorParcelable0) {
        eggv eggv0 = this.b;
        if(eggv0 != null) {
            try {
                ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                eggv0.h(egof0.h, matrixCursorParcelable0, apiMetadata0);
            }
            catch(RemoteException remoteException0) {
                egig.c("QueryGalProviderOperation", "Operation failed remotely: ", remoteException0);
            }
        }
    }

    @Override  // eglh
    public final void d(Context context0, azug azug0) {
        if(!"com.google.android.syncadapters.contacts".equals(this.a)) {
            egig.k("QueryGalProviderOperation", "Not allowed to the caller.");
            this.b(egof.f, null);
            return;
        }
        try(Cursor cursor0 = context0.getContentResolver().query(this.c, this.d, this.e, this.r, this.s)) {
            MatrixCursorParcelable matrixCursorParcelable0 = new MatrixCursorParcelable(cursor0);
            this.b(egof.a, matrixCursorParcelable0);
        }
        catch(UnsupportedOperationException unused_ex) {
            this.b(egof.g, null);
        }
    }
}

