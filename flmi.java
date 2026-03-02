import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;

public final class flmi implements Callable {
    public final flmu a;
    public final String b;
    public final fmft c;

    public flmi(flmu flmu0, String s, fmft fmft0) {
        this.a = flmu0;
        this.b = s;
        this.c = fmft0;
    }

    @Override
    public final Object call() {
        Uri uri0 = this.a.l("messages");
        try(Cursor cursor0 = this.a.e.h(uri0, new String[]{"id"}, "message_id = ? AND message_status = ?", new String[]{this.b, String.valueOf(this.c.o)}, null, null)) {
            return cursor0.getCount() != 0 ? Boolean.valueOf(true) : Boolean.valueOf(false);
        }
    }
}

