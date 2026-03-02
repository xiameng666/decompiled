import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import java.util.ArrayList;
import jeb.synthetic.TWR;

public final class ehid {
    public static final String[] a;
    public static final String[] b;
    private final Context c;

    static {
        ehid.a = new String[]{"_id", "raw_contact_id", "data_sync1", "data_version", "data14", "data_sync4"};
        ehid.b = new String[]{"vnd.android.cursor.item/photo"};
    }

    public ehid(Context context0) {
        this.c = context0;
    }

    public static String a(String[] arr_s) {
        return arr_s[0] + " " + arr_s[1] + " " + arr_s[2];
    }

    public final void b(Uri uri0) {
        Account account0;
        if(uri0 == null) {
            egig.b("SyncHighResPhoto", "High res sync request with no raw contact URI.");
            return;
        }
        ContentProviderClient contentProviderClient0 = this.c.getContentResolver().acquireContentProviderClient(uri0);
        if(contentProviderClient0 == null) {
            egig.b("SyncHighResPhoto", "High res sync request with no content provider client.");
            return;
        }
        long v = ContentUris.parseId(uri0);
        StringBuilder stringBuilder0 = new StringBuilder("mimetype=? AND raw_contact_id=");
        stringBuilder0.append(v);
        try {
            Cursor cursor0 = contentProviderClient0.query(ContactsContract.Data.CONTENT_URI, ehid.a, stringBuilder0.toString(), ehid.b, null);
            String s = a.D(ContentUris.parseId(uri0), "_id=", " AND account_type = \'com.google\'");
            Cursor cursor1 = contentProviderClient0.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"account_name", "account_type"}, s, null, null);
            try {
                if(cursor1 == null) {
                    egig.b("SyncHighResPhoto", "Error reading from provider to get account.");
                    goto label_25;
                }
                else if(cursor1.moveToNext()) {
                    account0 = new Account(cursor1.getString(0), cursor1.getString(1));
                    goto label_23;
                }
                else {
                    goto label_25;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor1, throwable0);
                throw throwable0;
            }
        label_23:
            cursor1.close();
            goto label_28;
        label_25:
            if(cursor1 != null) {
                cursor1.close();
            }
            account0 = null;
        label_28:
            try {
                while(!Thread.currentThread().isInterrupted() && cursor0.moveToNext()) {
                    long v3 = cursor0.getLong(0);
                    String[] arr_s = ehcv.e(cursor0.getString(2));
                    long v4 = cursor0.getLong(3);
                    String s1 = cursor0.getString(4);
                    long v5 = cursor0.getLong(5);
                    ehid.a(arr_s);
                    if(!TextUtils.isEmpty(arr_s[1]) && !"Sync_High_Res".equals(arr_s[2]) && s1 == null) {
                        arr_s[2] = "Sync_High_Res";
                        try {
                            ArrayList arrayList0 = new ArrayList();
                            arrayList0.add(ContentProviderOperation.newUpdate(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, v3).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build()).withValue("data_sync1", ehid.a(arr_s)).withValue("data_sync3", null).withValue("data_sync4", Long.valueOf(v5 + 1L)).withSelection(a.u(v4, "data_version="), null).build());
                            contentProviderClient0.applyBatch(arrayList0);
                            ContentResolver.requestSync(account0, "com.android.contacts", new Bundle());
                        }
                        catch(OperationApplicationException unused_ex) {
                            throw new cjuh(13, "error writing photo data into provider");
                        }
                    }
                }
            }
            finally {
                cursor0.close();
            }
        }
        catch(RemoteException unused_ex) {
        }
        finally {
            contentProviderClient0.release();
        }
    }
}

