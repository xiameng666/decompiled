import android.accounts.Account;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Groups;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import jeb.synthetic.TWR;

public final class ehab {
    public static final String[] a;
    public final ehad b;
    public final ehbo c;
    public final ehac d;
    public final ehac e;
    public final ehac f;
    private final ehbp g;
    private final ehim h;
    private final gfsx i;

    static {
        ehab.a = new String[]{"_count"};
    }

    public ehab(Account account0, ehbp ehbp0, ehim ehim0) {
        this(account0, ehbp0, ehim0, true);
    }

    public ehab(Account account0, ehbp ehbp0, ehim ehim0, boolean z) {
        ehbo ehbo0 = new ehbo();
        this.c = ehbo0;
        this.d = new ehac(ehab.d(ContactsContract.Groups.CONTENT_URI, account0, z), ehbo0, ehim0);
        this.b = new ehad(account0, z, ehbp0, ehbo0, ehim0);
        this.e = new ehac(ehab.d(ContactsContract.Data.CONTENT_URI, account0, z), ehbo0, ehim0);
        this.f = new ehac(ehab.d(ContactsContract.Data.CONTENT_URI, account0, z), ehbo0, ehim0);
        gfsx gfsx0 = hxcs.c() ? ehdh.a(account0.name) : gfqx.a;
        this.i = gfsx0;
        this.g = ehbp0;
        this.h = ehim0;
    }

    public static int a(ehbp ehbp0, Uri uri0, String s, String[] arr_s) {
        int v;
        Cursor cursor0 = ehbp0.a(uri0, new String[]{"_count"}, s, arr_s, null);
        try {
            if(cursor0 == null) {
                throw new RemoteException("Unable to query CP2");
            }
            cursor0.moveToLast();
            v = cursor0.getInt(0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    public static Uri b(Uri uri0) {
        return uri0.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    public static Uri c(Uri uri0, Account account0) {
        return ehab.d(uri0, account0, true);
    }

    public static Uri d(Uri uri0, Account account0, boolean z) {
        if(account0 == null) {
            return uri0;
        }
        Uri.Builder uri$Builder0 = uri0.buildUpon().appendQueryParameter("account_name", account0.name).appendQueryParameter("account_type", account0.type);
        if(z) {
            uri$Builder0.appendQueryParameter("caller_is_syncadapter", "true");
        }
        return uri$Builder0.build();
    }

    public final void e(ContentProviderOperation.Builder contentProviderOperation$Builder0) {
        this.c.a(contentProviderOperation$Builder0, true);
    }

    public final void f() {
        long v = this.i.i() ? System.currentTimeMillis() : 0L;
        try {
            synchronized(this.c) {
                ehab.g(this.g, this.c, this.h);
            }
        }
        finally {
            gfsx gfsx0 = this.i;
            if(gfsx0.i()) {
                ((ehdk)gfsx0.d()).a(ehdi.b, System.currentTimeMillis() - v);
            }
        }
    }

    public static void g(ehbp ehbp0, ehbo ehbo0, ehim ehim0) {
        if(ehbo0.h()) {
            return;
        }
        int v = ehbo0.b();
        ArrayList arrayList0 = ehbo0.c();
        try {
            ehbp0.c(arrayList0);
        }
        catch(TransactionTooLargeException transactionTooLargeException0) {
            egig.f("FSA2_DatabaseHelper", "TransactionTooLarge temporary for batch %d", arrayList0.size());
            if(hxai.a.b().b()) {
                try {
                    Map map0 = ehbo0.e();
                    ArrayList arrayList1 = new ArrayList(arrayList0.size());
                    for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
                        if(((ContentProviderOperation)arrayList0.get(v2)).isYieldAllowed()) {
                            arrayList1.add(Integer.valueOf(v2));
                        }
                    }
                    ehbn.a(ehbp0, arrayList0, arrayList1, map0, 0, arrayList0.size(), ehim0);
                    return;
                }
                catch(TransactionTooLargeException transactionTooLargeException1) {
                    egig.c("FSA2_DatabaseHelper", "TransactionTooLarge after splitting batch", transactionTooLargeException0);
                    throw new ehfh(transactionTooLargeException1);
                }
                catch(RemoteException | OperationApplicationException exception0) {
                    egig.c("FSA2_DatabaseHelper", "Exception after splitting batch", transactionTooLargeException0);
                    throw new ehfh(exception0);
                }
            }
            egig.c("FSA2_DatabaseHelper", "TransactionTooLarge", transactionTooLargeException0);
            throw new ehfh(transactionTooLargeException0);
        }
        catch(RemoteException remoteException0) {
            egig.c("FSA2_DatabaseHelper", "Failed to apply at least one operation", remoteException0);
            throw new ehfh(remoteException0);
        }
        catch(OperationApplicationException operationApplicationException0) {
            int v3 = v - operationApplicationException0.getNumSuccessfulYieldPoints();
            egig.c("FSA2_DatabaseHelper", String.format(Locale.US, "Failed to apply %d of the %d operations", v3, v), operationApplicationException0);
            throw new ehfh(operationApplicationException0);
        }
        finally {
            ehbo0.f();
        }
    }

    public final void h() {
        egiv.R();
        int v = (int)hwzc.a.c().j();
        Integer.valueOf(v).getClass();
        ehbo ehbo0 = this.c;
        synchronized(ehbo0) {
            if(ehbo0.b() >= v) {
                this.f();
            }
        }
    }
}

