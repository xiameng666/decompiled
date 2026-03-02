import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.SyncState;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class ehbk {
    public boolean a;
    private static final String[] b;
    private static final Uri c;
    private final ehbp d;
    private final String e;
    private final String[] f;
    private final Object g;

    static {
        ehbk.b = new String[]{"data"};
        ehbk.c = ContactsContract.SyncState.CONTENT_URI;
    }

    public ehbk(ehbp ehbp0, Account account0) {
        byte[] arr_b;
        this.g = new Object();
        this.a = false;
        this.d = ehbp0;
        String s = account0.name;
        String s1 = account0.type;
        this.e = "account_name=? AND account_type=?";
        this.f = new String[]{s, s1};
        try {
            arr_b = this.d();
        }
        catch(SQLException sQLException0) {
            String s2 = sQLException0.getMessage();
            if(s2 != null && s2.contains("Unable to convert")) {
                egig.b("FSA2_SyncState", "Error to read sync state bytes from CP2, clearing...");
                this.c(ContentProviderOperation.newDelete(ehbk.c).withSelection(this.e, this.f).build());
            }
            arr_b = null;
        }
        if(arr_b == null) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("account_name", s);
            contentValues0.put("account_type", s1);
            contentValues0.put("data", ehbk.e(egyn.a));
            this.c(ContentProviderOperation.newInsert(ehbk.c).withValues(contentValues0).build());
        }
    }

    public final ContentProviderOperation a(egyn egyn0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("data", ehbk.e(egyn0));
        return ContentProviderOperation.newUpdate(ehbk.c).withValues(contentValues0).withSelection(this.e, this.f).build();
    }

    public final egyn b() {
        byte[] arr_b = this.d();
        egyn egyn0 = egyn.a;
        if(arr_b != null) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)egyn0), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                egyn0 = (egyn)hftv0;
            }
            catch(hfur hfur0) {
                this.a = true;
                egig.c("FSA2_SyncState", "error when parsing blob to proto", hfur0);
                this.c(this.a(egyn0));
            }
        }
        egig.g("FSA2_SyncState", "@readSyncState: %s", egyn0);
        return egyn0;
    }

    public final void c(ContentProviderOperation contentProviderOperation0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(contentProviderOperation0);
        try {
            synchronized(this.g) {
                this.d.c(arrayList0);
            }
        }
        catch(RemoteException | OperationApplicationException exception0) {
            egig.c("FSA2_SyncState", "Failed to apply database operation", exception0);
            throw new ehfh(exception0);
        }
    }

    final byte[] d() {
        Object object0 = this.g;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        Cursor cursor0 = this.d.a(ehbk.c, ehbk.b, this.e, this.f, null);
        TWR.declareResource(cursor0);
        if(cursor0 != null) {
            TWR.useResource$NT(cursor0);
            if(cursor0.moveToNext()) {
                TWR.useResource$NT(cursor0);
                byte[] arr_b = cursor0.getBlob(0);
                FIN.finallyCodeBegin$NT(v);
                return arr_b;
            }
            FIN.finallyExec$NT(v);
            return null;
        }
        TWR.useResource$NT(null);
        egig.b("FSA2_SyncState", "Failed to query CP2");
        throw new ehfh(new RemoteException("Unable to query CP2"));
    }

    static final byte[] e(egyn egyn0) {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            egyn0.writeToStream(byteArrayOutputStream0);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            egig.c("FSA2_SyncState", "Error when converting FocusSyncState to bytes.", iOException0);
            return null;
        }
    }
}

