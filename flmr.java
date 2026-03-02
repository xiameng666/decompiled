import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import java.util.concurrent.Callable;

public final class flmr implements Callable {
    public final flmu a;
    public final ContentValues b;
    public final fmeo c;

    public flmr(flmu flmu0, ContentValues contentValues0, fmeo fmeo0) {
        this.a = flmu0;
        this.b = contentValues0;
        this.c = fmeo0;
    }

    @Override
    public final Object call() {
        flmu flmu0 = this.a;
        Uri uri0 = flmu0.l("contacts");
        long v = flmu0.e.c(uri0, this.b, 0);
        if(v < 0L) {
            throw new SQLiteException("Failed to save contact.");
        }
        flmu0.at(this.c);
        return v;
    }
}

