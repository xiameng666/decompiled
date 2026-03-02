import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import java.util.List;

public final class flmj implements Runnable {
    public final flmu a;
    public final List b;

    public flmj(flmu flmu0, List list0) {
        this.a = flmu0;
        this.b = list0;
    }

    @Override
    public final void run() {
        fmpl fmpl0;
        flmu flmu0;
        long v = 0L;
        flmu0 = this.a;
        Uri uri0 = flmu0.l("blocks");
        try(Cursor cursor0 = flmu0.e.h(uri0, new String[]{"id"}, null, null, "id DESC", Integer.toString(1))) {
            if(cursor0.moveToFirst()) {
                v = cursor0.getLong(0);
            }
        }
        for(Object object0: this.b) {
            flmu0.S(((fmpl)object0), true);
        }
        Uri uri1 = flmu0.l("blocks");
        try(Cursor cursor1 = flmu0.e.h(uri1, flqg.a, "id <= ?", new String[]{Long.toString(v)}, null, null)) {
            while(true) {
                if(!cursor1.moveToNext()) {
                    break;
                }
                if(flnx.a(cursor1.getInt(1)) == flnx.e) {
                    fmex fmex0 = new fmex();
                    fmex0.c(cursor1.getString(2));
                    fmex0.b(cursor1.getString(4));
                    fmpl0 = fmpj.a(fmex0.a());
                }
                else {
                    fmep fmep0 = new fmep(null);
                    fmep0.c(cursor1.getString(2));
                    fmep0.e(((ContactId.ContactType)flny.a.ic().kt(flnx.a(cursor1.getInt(1)))));
                    fmep0.d(cursor1.getString(4));
                    String s = cursor1.getString(3);
                    if(!TextUtils.isEmpty(s)) {
                        fmep0.b(s);
                    }
                    fmpl0 = fmpj.b(fmep0.a());
                }
                flmu0.S(fmpl0, false);
            }
        }
    }
}

