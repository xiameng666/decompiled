import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Callable;

public final class flmw implements Callable {
    public final flna a;
    public final ContactId b;
    public final ContentValues c;

    public flmw(flna flna0, ContactId contactId0, ContentValues contentValues0) {
        this.a = flna0;
        this.b = contactId0;
        this.c = contentValues0;
    }

    @Override
    public final Object call() {
        long v;
        boolean z = true;
        flna flna0 = this.a;
        ContactId contactId0 = this.b;
        try(Cursor cursor0 = flna0.c(contactId0)) {
            ContentValues contentValues0 = this.c;
            if(cursor0.moveToFirst()) {
                v = (long)cursor0.getInt(0);
                Uri uri0 = flna0.d("registration");
                flna0.a.b(uri0, contentValues0, "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(v), ((.AutoValue_ContactId)contactId0).b});
            }
            else {
                v = -1L;
            }
        }
        if(v == -1L) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

