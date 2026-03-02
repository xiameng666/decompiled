import android.accounts.Account;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.Settings.Global;
import j..util.Objects;
import java.util.ArrayList;

public final class ehbp {
    public final ContentResolver a;
    private final Account b;
    private final gfsx c;

    public ehbp(ContentResolver contentResolver0) {
        this(contentResolver0, null, gfqx.a);
    }

    public ehbp(ContentResolver contentResolver0, Account account0, gfsx gfsx0) {
        this.a = contentResolver0;
        this.b = account0;
        this.c = gfsx0;
    }

    public final Cursor a(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return this.a.query(uri0, arr_s, s, arr_s1, s1);
    }

    public final Uri b(Uri uri0, ContentValues contentValues0) {
        return this.f() ? this.a.insert(uri0, contentValues0) : null;
    }

    public final ContentProviderResult[] c(ArrayList arrayList0) {
        if(this.f()) {
            return this.a.applyBatch("com.android.contacts", arrayList0);
        }
        throw new RemoteException("Cannot write to this account now.");
    }

    public final int d(Uri uri0, String s) {
        return this.f() ? this.a.delete(uri0, s, null) : 0;
    }

    public final int e(Uri uri0, ContentValues contentValues0, String s) {
        return this.f() ? this.a.update(uri0, contentValues0, s, null) : 0;
    }

    private final boolean f() {
        if(hwyp.i()) {
            hxdo hxdo0 = hxdo.a;
            if(hxdo0.b().h()) {
                hxbk.k();
                if(!hxbk.g() || Settings.Global.getInt(this.a, "device_provisioned", 0) == 1) {
                    Account account0 = this.b;
                    if(ehbp.g(account0) && Objects.equals("com.android.contacts", "com.android.contacts")) {
                        if(account0 == null) {
                            throw new IllegalStateException("Account is null");
                        }
                        if(hxdo0.b().C()) {
                            if(ContentResolver.getIsSyncable(account0, "com.android.contacts") == 0) {
                                egig.b("FSA2_ContentResolverWrapper", "Sync is turned off.");
                                return false;
                            }
                        }
                        else if(ContentResolver.getIsSyncable(account0, "com.android.contacts") <= 0) {
                            egig.b("FSA2_ContentResolverWrapper", "Sync is turned off.");
                            return false;
                        }
                    }
                }
            }
        }
        if(hxbk.g() && hxbk.f()) {
            Account account1 = this.b;
            if(ehbp.g(account1) && Objects.equals("com.android.contacts", "com.android.contacts")) {
                batl.s(account1);
                gfsx gfsx0 = this.c;
                if(gfsx0.i() && (egzm.a.a(account1) != null && egzm.a.a(account1) != gfsx0.d())) {
                    egig.d("FSA2_ContentResolverWrapper", "Sync owner [%s] is not current.", new Object[]{(gfsx0.i() ? ((egzl)gfsx0.d()).name() : "null")});
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean g(Account account0) {
        return account0 != null && account0.type.equals("com.google");
    }
}

