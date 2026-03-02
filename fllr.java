import android.content.ContentValues;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Callable;

public final class fllr implements Callable {
    public final flmu a;
    public final ContentValues b;
    public final List c;
    public final String[] d;

    public fllr(flmu flmu0, ContentValues contentValues0, List list0, String[] arr_s) {
        this.a = flmu0;
        this.b = contentValues0;
        this.c = list0;
        this.d = arr_s;
    }

    @Override
    public final Object call() {
        Uri uri0 = this.a.l("messages");
        return this.a.e.b(uri0, this.b, a.a(flnh.c(this.c.size()), "message_id IN (", ") AND message_status = ?"), this.d);
    }
}

