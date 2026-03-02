import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import java.util.concurrent.Callable;

public final class flma implements Callable {
    public final flmu a;
    public final fmeo b;

    public flma(flmu flmu0, fmeo fmeo0) {
        this.a = flmu0;
        this.b = fmeo0;
    }

    @Override
    public final Object call() {
        flmu flmu0 = this.a;
        fmeo fmeo0 = this.b;
        long v = flmu0.c(fmeo0.a);
        if(v == -1L) {
            return flmu0.h(fmeo0);
        }
        ContentValues contentValues0 = floa.a(fmeo0);
        Uri uri0 = flmu0.l("contacts");
        if(flmu0.e.b(uri0, contentValues0, "id = ?", new String[]{String.valueOf(v)}) < 0) {
            throw new SQLiteException("Failed to update contact.");
        }
        flmu0.at(fmeo0);
        return v;
    }
}

