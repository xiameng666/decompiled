import android.content.ContentValues;
import android.net.Uri;
import android.util.Pair;
import java.util.concurrent.Callable;

public final class flmo implements Callable {
    public final flmu a;
    public final fmhr b;

    public flmo(flmu flmu0, fmhr fmhr0) {
        this.a = flmu0;
        this.b = fmhr0;
    }

    @Override
    public final Object call() {
        fmhr fmhr0 = this.b;
        flmu flmu0 = this.a;
        String s = fmhr0.c;
        gfsx gfsx0 = flmu0.t(s);
        Boolean boolean0 = Boolean.valueOf(false);
        if(!gfsx0.i()) {
            flbj.c("SQLiteMessagingStore", "Trying to save a SuggestionList whose Message has not been saved.");
            return Pair.create(boolean0, boolean0);
        }
        gfsx gfsx1 = flmu0.s(s, "conversation_row_id");
        if(!gfsx1.i()) {
            flbj.c("SQLiteMessagingStore", "Message exists without conversationId.");
            return Pair.create(boolean0, Boolean.valueOf(true));
        }
        gfsx gfsx2 = flmu0.r(((Long)gfsx1.d()).longValue());
        if(!gfsx2.i()) {
            flbj.c("SQLiteMessagingStore", "Message exists without conversation.");
            return Pair.create(boolean0, Boolean.valueOf(true));
        }
        fmev fmev0 = (fmev)gfsx2.d();
        gfsx gfsx3 = fmev0.j;
        if(gfsx3.i()) {
            gfsx gfsx4 = flmu0.t(((fmhr)gfsx3.d()).c);
            if(gfsx4.i() && ((long)(((Long)gfsx0.d()))) < ((long)(((Long)gfsx4.d())))) {
                return Pair.create(boolean0, Boolean.valueOf(true));
            }
        }
        fmeu fmeu0 = new fmeu(fmev0);
        fmeu0.a = gfsx.m(fmhr0);
        fmev fmev1 = fmeu0.a();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("conversation_properties", floc.e(fmev1));
        Uri uri0 = flmu0.l("conversations");
        String[] arr_s = {gfsx1.d().toString()};
        if(flmu0.e.b(uri0, contentValues0, "id = ?", arr_s) < 0) {
            flbj.c("SQLiteMessagingStore", "Failed to update conversation.");
            return Pair.create(boolean0, Boolean.valueOf(true));
        }
        flmu.ao();
        flmu0.K(fmev0.a);
        Boolean boolean1 = Boolean.valueOf(true);
        return Pair.create(boolean1, boolean1);
    }
}

