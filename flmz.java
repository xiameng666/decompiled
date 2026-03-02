import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model..AutoValue_AccountContext;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.AccountUsers;
import java.util.concurrent.Callable;

public final class flmz implements Callable {
    public final flna a;
    public final AccountContext b;
    public final fmbl c;

    public flmz(flna flna0, AccountContext accountContext0, fmbl fmbl0) {
        this.a = flna0;
        this.b = accountContext0;
        this.c = fmbl0;
    }

    @Override
    public final Object call() {
        long v;
        AccountContext accountContext0 = this.b;
        flna flna0 = this.a;
        AccountUsers accountUsers0 = ((.AutoValue_AccountContext)accountContext0).b;
        try(Cursor cursor0 = flna0.b(accountUsers0)) {
            boolean z = cursor0.moveToFirst();
            fmbl fmbl0 = this.c;
            if(z) {
                v = (long)cursor0.getInt(0);
                gftb.q(flna0.a.g());
                Uri uri0 = flna0.d("registration");
                ContentValues contentValues0 = flos.a(accountContext0, fmbl0);
                flna0.a.b(uri0, contentValues0, "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(v), accountContext0.h()});
                flna0.i(v, accountUsers0);
                return v;
            }
            gftb.q(flna0.a.g());
            Uri uri1 = flna0.d("registration");
            ContentValues contentValues1 = flos.a(accountContext0, fmbl0);
            v = flna0.a.c(uri1, contentValues1, 0);
            flna0.i(v, accountUsers0);
        }
        return v;
    }
}

