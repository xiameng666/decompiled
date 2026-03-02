import android.database.Cursor;
import android.net.Uri;
import j..util.Optional;
import java.util.function.Supplier;
import jeb.synthetic.TWR;

public final class ahzu implements Supplier {
    public final ahzz a;
    public final Uri b;

    public ahzu(ahzz ahzz0, Uri uri0) {
        this.a = ahzz0;
        this.b = uri0;
    }

    @Override
    public final Object get() {
        Object object0;
        Cursor cursor0 = this.a.e.getContentResolver().query(this.b, ahzz.c, null, null, null);
        if(cursor0 != null) {
            try {
                if(cursor0.moveToNext()) {
                    object0 = Optional.ofNullable(cursor0.getString(cursor0.getColumnIndexOrThrow("address")));
                    goto label_8;
                }
                goto label_10;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_8:
            cursor0.close();
            return object0;
        }
    label_10:
        if(cursor0 != null) {
            cursor0.close();
        }
        return Optional.empty();
    }
}

