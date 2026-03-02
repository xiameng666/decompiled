import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.provider.ContactsContract.RawContacts;
import android.util.Base64;
import java.util.ArrayList;

public final class ehap {
    public static final String[] a;

    static {
        ehap.a = new String[]{"_id", "account_type", "data_set", "account_name", "sourceid", "sync1", "sync2", "sync3", "sync4"};
    }

    public static final ContentValues a(String s, String s1, String s2, String s3, String s4, Context context0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("account_name", s2);
        contentValues0.put("account_type", s3);
        contentValues0.putNull("sourceid");
        contentValues0.put("data_set", s4);
        Context context1 = efpb.c(context0).a;
        efoy efoy0 = new efpm(efpb.b(), context1).a(s, s1).c;
        if(hxci.a.b().d() && efoy0 == efoy.d && s3 != null && "com.google".equals(s3)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eggh.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)egpo.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((egpo)hftv0).c = efoy0.k;
            ((egpo)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((egpo)hftp1.b_message).e = 1;
            ((egpo)hftp1.b_message).b |= 4;
            egpo egpo0 = (egpo)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            eggh eggh0 = (eggh)hftp0.b_message;
            egpo0.getClass();
            eggh0.c = egpo0;
            eggh0.b |= 1;
            contentValues0.put("sync1", Base64.encodeToString(((eggh)hftp0.N_build()).toBytesArray(), 2));
        }
        return contentValues0;
    }

    public static final boolean b(long v, ContentValues contentValues0, ContentValues contentValues1, ContentResolver contentResolver0) {
        ArrayList arrayList0 = new ArrayList();
        ContentProviderOperation contentProviderOperation0 = ContentProviderOperation.newUpdate(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, v)).withValues(contentValues0).build();
        ContentProviderOperation contentProviderOperation1 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValues(contentValues1).build();
        arrayList0.add(contentProviderOperation0);
        arrayList0.add(contentProviderOperation1);
        try {
            return new ehbp(contentResolver0).c(arrayList0).length == 2;
        }
        catch(RemoteException | OperationApplicationException exception0) {
            egig.d("FSA2_ContactsMigrater", "Error in creating deleted entry. RawContact ID is %d ", new Object[]{v});
            throw exception0;
        }
        return true;
    }
}

