import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class fllu implements Callable {
    public final flmu a;
    public final ConversationId b;
    public final long c;
    public final long d;

    public fllu(flmu flmu0, ConversationId conversationId0, long v, long v1) {
        this.a = flmu0;
        this.b = conversationId0;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final Object call() {
        Object object2;
        Cursor cursor1;
        ContentValues contentValues1;
        fmga fmga0;
        gged_interceptors gged0;
        ContentValues contentValues0 = new ContentValues();
        fmft fmft0 = fmft.g;
        contentValues0.put("message_status", Integer.valueOf(fmft0.o));
        flmu flmu0 = this.a;
        ConversationId conversationId0 = this.b;
        String s = Long.toString(flmu0.d(conversationId0));
        fmft fmft1 = fmft.f;
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        flba.a();
        long v = this.c;
        long v1 = this.d;
        String[] arr_s = {s, Integer.toString(fmft1.o), Long.toString(timeUnit0.toMicros(System.currentTimeMillis() + v - v1))};
        ggdy ggdy0 = new ggdy();
        Cursor cursor0 = flmu0.e.h(flmu0.l("messages INNER JOIN contacts ON sender_contact_row_id = " + flnh.b("contacts", "id")), null, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us < ?", arr_s, null, null);
        flnc flnc0 = flmu0.e;
        try {
            if(cursor0.moveToFirst()) {
                flnc0.b(flmu0.l("messages"), contentValues0, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us < ?", arr_s);
                gged0 = flon.b(conversationId0, cursor0);
                ggqk ggqk0 = flof.e(gged0).E();
                while(true) {
                label_19:
                    if(!ggqk0.hasNext()) {
                        goto label_40;
                    }
                    Object object0 = ggqk0.next();
                    fmga0 = (fmga)object0;
                    ggdy0.i(fmga0.a);
                    contentValues1 = new ContentValues();
                    cursor1 = cursor0;
                    goto label_29;
                }
            }
            else {
                goto label_51;
            }
            goto label_53;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        try {
        label_29:
            long v2 = TimeUnit.MILLISECONDS.toMicros(v);
            long v3 = TimeUnit.MILLISECONDS.toMicros(v1);
            contentValues1.put("server_timestamp_us", Long.valueOf(fmga0.d - v2 + v3));
            flnc0.b(flmu0.l("messages"), contentValues1, "message_id = ?", new String[]{fmga0.a});
            flmu0.P(fmga0.a);
            flmu.ap();
            ggdy0 = ggdy0;
            gged0 = gged0;
            fmft1 = fmft1;
            cursor0 = cursor1;
            goto label_19;
        label_40:
            ggdy ggdy1 = ggdy0;
            cursor1 = cursor0;
            flmu0.J(conversationId0);
            flmu0.Q(fmft1);
            flmu0.Q(fmft0);
            ggqk ggqk1 = flof.d(gged0).E();
            while(ggqk1.hasNext()) {
                Object object1 = ggqk1.next();
                flmu0.d.b(((fmaj)object1));
            }
            goto label_53;
        label_51:
            ggdy1 = ggdy0;
            cursor1 = cursor0;
        label_53:
            object2 = ggdy1.h();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor1, throwable0);
            throw throwable0;
        }
        if(cursor1 != null) {
            cursor1.close();
        }
        return object2;
    }
}

