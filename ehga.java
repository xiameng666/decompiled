import android.accounts.Account;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.Groups;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import jeb.synthetic.TWR;

public final class ehga {
    public final Account a;
    private final ehbp b;
    private final egzr c;
    private final ehim d;

    static {
        batl.b(TextUtils.equals("sourceid", "sourceid"));
    }

    public ehga(Account account0, ehbp ehbp0, egzr egzr0, ehim ehim0) {
        this.a = account0;
        this.b = ehbp0;
        this.c = egzr0;
        this.d = ehim0;
    }

    public final void a(ContentProviderOperation contentProviderOperation0, String s) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(contentProviderOperation0);
        try {
            this.b.c(arrayList0);
        }
        catch(RemoteException | OperationApplicationException exception0) {
            egig.m("FSA2_MarkAndSweepUtil", "Failed to perform %s operation", new Object[]{s});
            throw new ehfh(exception0);
        }
    }

    public final void b(Uri uri0) {
        Uri uri1 = ehab.c(uri0, this.a);
        Cursor cursor0 = this.b.a(uri1, ehab.a, "sync2=\'SWEEP_MARK\'", null, null);
        try {
            if(cursor0 == null) {
                throw new ehfh(new RemoteException("Unable to query CP2."));
            }
            cursor0.moveToLast();
            cursor0.getInt(0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        String s = "sync2=\'SWEEP_MARK\' AND dirty = 0";
        if(hwyi.z()) {
            egzr egzr0 = this.c;
            if(egzr0.b() && uri0.equals(ContactsContract.Groups.CONTENT_URI)) {
                HashSet hashSet0 = new HashSet();
                Uri uri2 = ehab.c(ContactsContract.Groups.CONTENT_URI, this.a);
                String s1 = !((Boolean)ehij.a.mr()).booleanValue() || !hxab.c() ? "sync2=\'SWEEP_MARK\'" : "sync2=\'SWEEP_MARK\' AND dirty = 0";
                Cursor cursor1 = this.b.a(uri2, new String[]{"_id"}, s1, null, null);
                if(cursor1 != null) {
                    try {
                        if(cursor1.getCount() > 0) {
                            while(cursor1.moveToNext()) {
                                hashSet0.add(Long.valueOf(cursor1.getLong(0)));
                            }
                        }
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(cursor1, throwable1);
                        throw throwable1;
                    }
                }
                if(cursor1 != null) {
                    cursor1.close();
                }
                if(!hashSet0.isEmpty() && (egzr0.b() && !egzr0.e(hashSet0, this.d))) {
                    egig.b("FSA2_MarkAndSweepUtil", "Failed to remove present group contact orders");
                }
            }
        }
        ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newDelete(ehab.c(uri0, this.a));
        if(!((Boolean)ehij.a.mr()).booleanValue() || !hxab.c()) {
            s = "sync2=\'SWEEP_MARK\'";
        }
        this.a(contentProviderOperation$Builder0.withSelection(s, null).build(), "sweep");
    }
}

