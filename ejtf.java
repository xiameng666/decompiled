import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ejtf extends AsyncTask {
    private final Context a;
    private final Account[] b;

    public ejtf(ejtg ejtg0, Context context0, Account[] arr_account) {
        Objects.requireNonNull(ejtg0);
        super();
        this.a = context0;
        this.b = arr_account;
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        Context context0 = this.a;
        Account[] arr_account = this.b;
        List list0 = ejte.c(context0, null, null);
        int v = 0;
        while(v < arr_account.length) {
            Account account0 = arr_account[v];
            if(ejte.d(account0)) {
                String s = account0.name;
                for(Object object0: list0) {
                    if(!((ejth)object0).b.name.equalsIgnoreCase(s)) {
                        continue;
                    }
                    goto label_23;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("account_name", account0.name);
                contentValues0.put("morning_customized_time", Long.valueOf(hxsx.e() * 3600000L));
                contentValues0.put("afternoon_customized_time", Long.valueOf(hxsx.c() * 3600000L));
                contentValues0.put("evening_customized_time", Long.valueOf(hxsx.d() * 3600000L));
                context0.getContentResolver().insert(ejtu.a, contentValues0);
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("initialize", true);
                ContentResolver.requestSync(account0, "com.google.android.gms.reminders", bundle0);
            }
        label_23:
            ++v;
        }
        Iterator iterator1 = list0.iterator();
    label_26:
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            ejth ejth0 = (ejth)object1;
            String s1 = ejth0.b.name;
            int v1 = 0;
            while(v1 < arr_account.length) {
                if(s1.equalsIgnoreCase(arr_account[v1].name)) {
                    continue label_26;
                }
                ++v1;
            }
            ArrayList arrayList0 = new ArrayList();
            String[] arr_s = {String.valueOf(ejth0.a)};
            arrayList0.add(ContentProviderOperation.newDelete(ejtz.a).withSelection("account_id=?", arr_s).build());
            arrayList0.add(ContentProviderOperation.newDelete(ejtw.a).withSelection("account_id=?", arr_s).build());
            arrayList0.add(ContentProviderOperation.newDelete(ejtx.a).withSelection("account_id=?", arr_s).build());
            arrayList0.add(ContentProviderOperation.newDelete(ejtu.a).withSelection("_id=?", arr_s).build());
            bbeh.c(context0.getContentResolver(), arrayList0, "RemindersAccount");
        }
        return null;
    }
}

