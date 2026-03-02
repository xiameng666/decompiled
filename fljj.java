import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class fljj implements Callable {
    public final fljw a;
    public final AccountContext b;

    public fljj(fljw fljw0, AccountContext accountContext0) {
        this.a = fljw0;
        this.b = accountContext0;
    }

    @Override
    public final Object call() {
        fmgo fmgo0 = new fmgo();
        flba.a();
        fmgo0.b(System.currentTimeMillis());
        fmgo0.c(flce.c().a());
        fmgp fmgp0 = fmgo0.a();
        ContactId contactId0 = this.b.c().f();
        try {
            ContentValues contentValues0 = new ContentValues();
            HashMap hashMap0 = new HashMap();
            hashMap0.put("last_reported_capabilities", new ArrayList(fmgp0.b));
            hashMap0.put("last_reported_capabilities_time_ms", Long.valueOf(fmgp0.a));
            contentValues0.put("registration_properties", flbm.i(hashMap0));
            return Boolean.valueOf(this.a.k.k(contactId0, contentValues0));
        }
        catch(IOException unused_ex) {
            flbj.c("SQLiteRegStore", "Failed to update registration properties.");
            return Boolean.valueOf(false);
        }
    }
}

