import android.database.Cursor;
import java.text.SimpleDateFormat;
import java.util.Locale;

final class blqo {
    final long a;
    final byte[] b;

    public blqo(Cursor cursor0) {
        blzn.d(cursor0.getString(cursor0.getColumnIndex("id")));
        new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS", Locale.US).parse(cursor0.getString(cursor0.getColumnIndex("registration_time")));
        this.a = cursor0.getLong(cursor0.getColumnIndex("counter"));
        this.b = cursor0.getBlob(cursor0.getColumnIndex("key_data"));
        bnbb.d(cursor0);
    }
}

