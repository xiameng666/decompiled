import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.AccountState;

public final class ejwk extends ejvr {
    private final String b;
    private final AccountState c;

    public ejwk(ejtq ejtq0, String s, AccountState accountState0, azug azug0) {
        super(ejtq0, "SetAccountState", azug0);
        this.b = s;
        this.c = accountState0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        String s = this.b;
        ejth ejth0 = ejte.b(context0, s);
        if(ejth0 == null) {
            this.a.d(new Status(6000), ApiMetadata.b);
            return;
        }
        long v = ejth0.e == null ? 0L : ((long)ejth0.e);
        for(int v1 = 0; v1 < 0x40; ++v1) {
            AccountState accountState0 = this.c;
            if(accountState0.b[v1]) {
                v = accountState0.a[v1] ? v | 1L << v1 : v & ~(1L << v1);
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("account_state", Long.valueOf(v));
        context0.getContentResolver().update(ejtu.a, contentValues0, "account_name=?", new String[]{s});
        this.a.d(new Status(0), ApiMetadata.b);
    }
}

