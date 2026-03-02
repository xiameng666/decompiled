import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;

public final class ejte {
    public static final bboh a;

    static {
        ejte.a = bboh.b("RemindersAccount", bbcu.s);
    }

    public static ejth a(Context context0, Account account0) {
        if(ejte.d(account0)) {
            List list0 = ejte.c(context0, "account_name=?", new String[]{account0.name});
            return list0.isEmpty() ? null : ((ejth)list0.get(0));
        }
        return null;
    }

    public static ejth b(Context context0, String s) {
        return ejte.a(context0, new Account(s, "com.google"));
    }

    public static List c(Context context0, String s, String[] arr_s) {
        List list0 = new ArrayList();
        Cursor cursor0 = context0.getContentResolver().query(ejtu.a, new String[]{"_id", "account_name", "storage_version", "sync_status", "account_state"}, s, arr_s, null);
        if(cursor0 != null) {
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    list0.add(new ejth(cursor0.getLong(0), new Account(cursor0.getString(1), "com.google"), ejxe.b(cursor0, 2), (cursor0.isNull(3) ? null : cursor0.getBlob(3)), ejxe.b(cursor0, 4)));
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
            cursor0.close();
            return list0;
        }
        return list0;
    }

    public static boolean d(Account account0) {
        return account0 != null && !TextUtils.isEmpty(account0.name) && "com.google".equalsIgnoreCase(account0.type);
    }

    public static void e(Context context0, ejth ejth0) {
        ArrayList arrayList0 = new ArrayList();
        String[] arr_s = {String.valueOf(ejth0.a)};
        ContentValues contentValues0 = new ContentValues();
        contentValues0.putNull("storage_version");
        contentValues0.putNull("sync_status");
        Boolean boolean0 = Boolean.valueOf(true);
        contentValues0.put("need_sync_snooze_preset", boolean0);
        arrayList0.add(ContentProviderOperation.newUpdate(ejtu.a).withSelection("_id=?", arr_s).withValues(contentValues0).build());
        ContentValues contentValues1 = new ContentValues();
        contentValues1.put("silent_change", boolean0);
        contentValues1.put("dirty_sync_bit", boolean0);
        arrayList0.add(ContentProviderOperation.newUpdate(ejtz.a).withSelection("account_id=?", arr_s).withValues(contentValues1).build());
        bbeh.c(context0.getContentResolver(), arrayList0, "RemindersAccount");
    }
}

