import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import jeb.synthetic.TWR;

public final class fllo implements Runnable {
    public final flmu a;
    public final String b;
    public final String[] c;
    public final String d;
    public final String[] e;
    public final long f;
    public final String g;
    public final long h;
    public final ConversationId i;

    public fllo(flmu flmu0, String s, String[] arr_s, String s1, String[] arr_s1, long v, String s2, long v1, ConversationId conversationId0) {
        this.a = flmu0;
        this.b = s;
        this.c = arr_s;
        this.d = s1;
        this.e = arr_s1;
        this.f = v;
        this.g = s2;
        this.h = v1;
        this.i = conversationId0;
    }

    @Override
    public final void run() {
        flmu flmu0 = this.a;
        Uri uri0 = flmu0.l("messages");
        flnc flnc0 = flmu0.e;
        flnc0.a(uri0, this.b, this.c);
        flnc0.a(flmu0.l("messages"), this.d, this.e);
        flmu0.Y(this.f);
        Uri uri1 = flmu0.l("messages");
        String s = this.g;
        Cursor cursor0 = flnc0.h(uri1, new String[]{"message_id"}, "conversation_row_id = ?", new String[]{s}, null, "1");
        try {
            if(!cursor0.moveToFirst()) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("update_timestamp_us", Long.valueOf(-1L));
                flnc0.b(flmu0.l("conversations"), contentValues0, "id = ?", new String[]{String.valueOf(s)});
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        flnc flnc1 = flmu0.e;
        try(Cursor cursor1 = flnc1.h(flmu0.l("conversations"), new String[]{"last_deleted_timestamp_us"}, "id = ?", new String[]{s}, null, null)) {
            if(cursor1.moveToFirst()) {
                long v = cursor1.getLong(0);
                long v1 = this.h;
                if(v < v1) {
                    ContentValues contentValues1 = new ContentValues();
                    contentValues1.put("last_deleted_timestamp_us", Long.valueOf(v1));
                    flnc1.b(flmu0.l("conversations"), contentValues1, "id = ?", new String[]{String.valueOf(s)});
                }
            }
        }
        flmu0.J(this.i);
        flmu0.L();
        flmu.ao();
    }
}

