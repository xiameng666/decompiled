import android.accounts.Account;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class ehfs {
    private final ehab a;
    private final Account b;
    private final ehbp c;

    public ehfs(ehab ehab0, Account account0, ehbp ehbp0) {
        this.a = ehab0;
        this.b = account0;
        this.c = ehbp0;
    }

    public final int a(long v, long v1, long v2) {
        Uri uri0 = ehab.c(ContactsContract.Data.CONTENT_URI, this.b);
        Map map0 = this.b(uri0, v, null);
        if(Long.compare(map0.size(), v2) > 0) {
            egig.m("GroupMembershipMigrater", "Too many contacts to move, contact count = %d", new Object[]{map0.size()});
            return -1;
        }
        Map map1 = this.b(uri0, v1, map0.keySet());
        Set set0 = map0.keySet();
        try {
            for(Object object0: set0) {
                Long long0 = (Long)object0;
                long v3 = (long)long0;
                if(map1.containsKey(long0)) {
                    ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newAssertQuery(this.a.f.a);
                    this.a.f.b.a(contentProviderOperation$Builder0.withSelection("mimetype=\'vnd.android.cursor.item/group_membership\' AND data1=? AND raw_contact_id=?", new String[]{String.valueOf(v1), String.valueOf(v3)}).withExpectedCount(1), false);
                    Long long1 = (Long)map0.get(long0);
                    this.a.e.d(long1, false);
                }
                else {
                    ContentProviderOperation.Builder contentProviderOperation$Builder1 = ContentProviderOperation.newAssertQuery(this.a.f.a);
                    this.a.f.b.a(contentProviderOperation$Builder1.withSelection("mimetype=\'vnd.android.cursor.item/group_membership\' AND data1=? AND raw_contact_id=?", new String[]{String.valueOf(v1), String.valueOf(v3)}).withExpectedCount(0), false);
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("data1", Long.valueOf(v1));
                    Long long2 = (Long)map0.get(long0);
                    this.a.e.l(long2, contentValues0);
                    this.a.b.p(long0);
                }
                this.a.h();
            }
            this.a.f();
            egig.h("GroupMembershipMigrater", "Successfully moved %d contacts and deleted group membership for %d contacts", map0.size() - map1.size(), map1.size());
            return set0.size();
        }
        catch(ehfh ehfh0) {
            egig.c("GroupMembershipMigrater", "Failed to move contacts", ehfh0);
            return -2;
        }
    }

    private final Map b(Uri uri0, long v, Set set0) {
        Map map0 = new HashMap();
        String s = set0 == null ? "mimetype=\'vnd.android.cursor.item/group_membership\' AND data1=?" : a.T(set0, "mimetype=\'vnd.android.cursor.item/group_membership\' AND data1=? AND raw_contact_id IN (", ",", ")");
        try(Cursor cursor0 = this.c.a(uri0, new String[]{"raw_contact_id", "_id"}, s, new String[]{String.valueOf(v)}, null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                map0.put(Long.valueOf(cursor0.getLong(0)), Long.valueOf(cursor0.getLong(1)));
            }
        }
        return map0;
    }
}

