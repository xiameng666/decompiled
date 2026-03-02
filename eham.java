import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.Data;
import com.google.android.gms.people.cpg.callingcard.storage.CallingCardDatabase;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;

public final class eham {
    public static gged_interceptors a(Context context0, ehbp ehbp0, Account account0) {
        gged_interceptors gged0 = hwyi.n() ? ((gged_interceptors)oqj.b(CallingCardDatabase.v().u().a, true, false, new egdt())) : ggna.a;
        if(gged0.isEmpty()) {
            egig.e("FSA2_CallingCardOp", "No calling card photos to sync down.");
            return ggna.a;
        }
        egig.f("FSA2_CallingCardOp", "Found %d calling card photos to sync down.", gged0.size());
        ArrayList arrayList0 = new ArrayList();
        String s = eham.b(gged0);
        Cursor cursor0 = ehbp0.a(ehab.c(ContactsContract.Data.CONTENT_URI, account0), new String[]{"data1"}, s, null, null);
        try {
            if(cursor0 == null) {
                egig.b("FSA2_CallingCardOp", "Couldn\'t get the cursor when query calling card ID CP2 ref.");
                return ggna.a;
            }
            while(cursor0.moveToNext()) {
                arrayList0.add(Long.valueOf(cursor0.getLong(0)));
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        if(arrayList0.isEmpty()) {
            egig.e("FSA2_CallingCardOp", "No calling card photos to sync down.");
            return ggna.a;
        }
        ggfp ggfp0 = ggfp.L("x_calling_card_id", "x_sync1", "x_data_version");
        try {
            return egda.b(context0, gged_interceptors.i(arrayList0), ggfp0);
        }
        catch(egdi egdi0) {
            egig.c("FSA2_CallingCardOp", "Failed to get calling card photos to sync down", egdi0);
            return ggna.a;
        }
    }

    public static String b(List list0) {
        return a.T(list0, "data1 IN (", ",", ") AND mimetype=\'vnd.android.cursor.item/calling_card\'");
    }

    public static void c(ContentValues contentValues0) {
        if(contentValues0 != null) {
            ggqj ggqj0 = ggfp.O("x_calling_card_data", "x_calling_card_id", "x_calling_card_file_uuid", "x_calling_card_file_uri", "x_sync1", "x_sync2", new String[]{"x_sync3", "x_sync4", "x_sync5", "x_data_version", "x_assert_data_version"}).om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                contentValues0.remove(((String)object0));
            }
        }
    }
}

