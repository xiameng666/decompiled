import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;

public final class flms implements Callable {
    public final flmu a;
    public final String b;

    public flms(flmu flmu0, String s) {
        this.a = flmu0;
        this.b = s;
    }

    @Override
    public final Object call() {
        Uri uri0 = this.a.l("messages");
        try(Cursor cursor0 = this.a.e.h(uri0, new String[]{"id"}, "message_id = ?", new String[]{this.b}, null, null)) {
            return cursor0.getCount() != 0 ? Boolean.valueOf(true) : Boolean.valueOf(false);
        }
    }
}

