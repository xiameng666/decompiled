import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Groups;
import android.provider.ContactsContract.RawContacts;
import android.provider.ContactsContract.SyncState;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class ehbu {
    private static String a;
    private final Context b;
    private final cchj c;
    private final egyq d;

    static {
    }

    public ehbu(Context context0, cchj cchj0) {
        egyq egyq0 = new egyq(context0);
        super();
        this.b = context0;
        this.c = cchj0;
        this.d = egyq0;
    }

    public static ehbu a(Context context0) {
        ehbu ehbu0;
        synchronized(ehbu.class) {
            ehbu0 = new ehbu(context0, cchj.b(context0));
        }
        return ehbu0;
    }

    public final void b(String s, ProtoLiteBuilder hftp0) {
        int v5;
        int v4;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(s != null) {
            Account[] arr_account = this.c.p("com.google");
            boolean z = false;
            for(int v1 = 0; v1 < arr_account.length; ++v1) {
                if(s.equals(arr_account[v1].name)) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giqo.a).v_newBuilder();
                    if(hwyp.h()) {
                        egyq egyq0 = this.d;
                        int v2 = egyq0.d(s);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        giqo giqo0 = (giqo)hftp1.b_message;
                        giqo0.b |= 1;
                        giqo0.c = v2;
                        int v3 = egyq0.c(s);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        giqo giqo1 = (giqo)hftp1.b_message;
                        giqo1.b |= 2;
                        giqo1.d = v3;
                    }
                    try {
                        ehbu.a = hxdo.e() ? null : "dirty = 0 AND sourceid IS NOT NULL";
                        Account account0 = new Account(s, "com.google");
                        Uri uri0 = ehab.c(ContactsContract.RawContacts.CONTENT_URI, account0);
                        Context context0 = this.b;
                        v4 = context0.getContentResolver().delete(uri0, ehbu.a, null);
                        if(hwyi.z()) {
                            HashSet hashSet0 = new HashSet();
                            Account account1 = new Account(s, "com.google");
                            Uri uri1 = ehab.c(ContactsContract.Groups.CONTENT_URI, account1);
                            String s1 = this.c(s);
                            Cursor cursor0 = context0.getContentResolver().query(uri1, new String[]{"_id"}, s1, null, null);
                            if(cursor0 != null) {
                                try {
                                    if(cursor0.getCount() > 0) {
                                        while(cursor0.moveToNext()) {
                                            hashSet0.add(Long.valueOf(cursor0.getLong(0)));
                                        }
                                    }
                                }
                                catch(Throwable throwable0) {
                                    TWR.safeClose$NT(cursor0, throwable0);
                                    throw throwable0;
                                }
                            }
                            if(cursor0 != null) {
                                cursor0.close();
                            }
                            if(!hashSet0.isEmpty()) {
                                egzr egzr0 = new egzr(context0);
                                TWR.declareResource(egzr0);
                                TWR.useResource$NT(egzr0);
                                if(egzr0.b()) {
                                    TWR.useResource$NT(egzr0);
                                    if(!egzr0.e(hashSet0, null)) {
                                        TWR.useResource$NT(egzr0);
                                        throw new RemoteException("Failed to delete GroupContactOrders from CPG");
                                    }
                                }
                                else {
                                    TWR.useResource$NT(egzr0);
                                    egig.k("FSA2_CpgSessionManager", "CPG is disabled, cannot remove present groupContactOrders from CPG");
                                }
                                TWR.useResource$NT(egzr0);
                                if(!egzr0.c()) {
                                    TWR.useResource$NT(egzr0);
                                    throw new RemoteException("Failed to flush GroupContactOrder updates to CPG");
                                }
                            }
                        }
                        Account account2 = new Account(s, "com.google");
                        Uri uri2 = ehab.c(ContactsContract.Groups.CONTENT_URI, account2);
                        String s2 = this.c(s);
                        v5 = context0.getContentResolver().delete(uri2, s2, null);
                        Uri uri3 = ContactsContract.SyncState.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
                        int v6 = context0.getContentResolver().delete(uri3, "account_type =\'com.google\' AND account_name = ? ", new String[]{s});
                    }
                    catch(IllegalStateException | IllegalArgumentException | InterruptedException | ExecutionException | UnsupportedOperationException | SQLiteException | SecurityException | RemoteException exception0) {
                        throw new cjuh(13, "Google contacts cleanup failed", null, exception0);
                    }
                    if(v6 > 0) {
                        z = true;
                    }
                    egig.j("GoogleContactsCleaner", "Cleanup google contacts %b, cleanup group %b, cleanup sync state %b.", Boolean.valueOf(v4 > 0), Boolean.valueOf(v5 > 0), Boolean.valueOf(z));
                    if(hwyp.h()) {
                        egyq egyq1 = this.d;
                        int v7 = egyq1.d(s);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        giqo giqo2 = (giqo)hftp1.b_message;
                        giqo2.b |= 4;
                        giqo2.e = v7;
                        int v8 = egyq1.c(s);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((giqo)hftv0).b |= 8;
                        ((giqo)hftv0).f = v8;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        giqo giqo3 = (giqo)hftp1.b_message;
                        giqo3.b |= 16;
                        giqo3.g = v4;
                        giqo giqo4 = (giqo)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        giqp giqp0 = (giqp)hftp0.b_message;
                        giqo4.getClass();
                        giqp0.d = giqo4;
                        giqp0.b |= 2;
                    }
                    this.d.c(s);
                    FIN.finallyCodeBegin$NT(v);
                    return;
                }
            }
            throw new cjuh(4, "Account attempting to cleanup Google Contacts is not signed in.");
        }
        throw new cjuh(5, "Account name is null.");
    }

    private final String c(String s) {
        Account account0 = new Account(s, "com.google");
        Uri uri0 = ehab.c(ContactsContract.Data.CONTENT_URI, account0);
        HashSet hashSet0 = new HashSet();
        Cursor cursor0 = this.b.getContentResolver().query(uri0, new String[]{"data1"}, "mimetype=\'vnd.android.cursor.item/group_membership\'", null, null);
        if(cursor0 != null) {
            try {
                if(cursor0.getCount() > 0) {
                    while(cursor0.moveToNext()) {
                        hashSet0.add(Long.valueOf(cursor0.getLong(0)));
                    }
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        String s1 = hxdo.e() ? null : "system_id IS NULL AND title != \'Starred in Android\' AND sourceid IS NOT NULL AND dirty = \'0\' ";
        return hashSet0.isEmpty() ? s1 : s1 + " AND _id NOT IN (" + TextUtils.join(",", hashSet0) + ")";
    }
}

