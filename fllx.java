import android.database.Cursor;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class fllx implements Callable {
    public final flmu a;
    public final String b;
    public final String[] c;

    public fllx(flmu flmu0, String[] arr_s) {
        this.a = flmu0;
        this.b = "needs_delivery_receipt = ? AND server_timestamp_us > ?";
        this.c = arr_s;
    }

    @Override
    public final Object call() {
        flmu flmu0;
        HashMap hashMap0;
        hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        flmu0 = this.a;
        Uri uri0 = flmu0.l("messages");
        try(Cursor cursor0 = flmu0.e.h(uri0, new String[]{"message_id", "conversation_row_id"}, this.b, this.c, null, null)) {
            if(cursor0.moveToFirst()) {
                do {
                    long v = cursor0.getLong(1);
                    String s = cursor0.getString(0);
                    Long long0 = v;
                    if(!hashMap1.containsKey(long0)) {
                        hashMap1.put(long0, new ArrayList());
                    }
                    ((List)hashMap1.get(long0)).add(s);
                }
                while(cursor0.moveToNext());
            }
        }
        for(Object object0: hashMap1.keySet()) {
            gfsx gfsx0 = flmu0.r(((Long)object0).longValue());
            for(Object object1: ((List)hashMap1.get(((Long)object0)))) {
                String s1 = (String)object1;
                if(gfsx0.i()) {
                    if(!hashMap0.containsKey(((fmev)gfsx0.d()).a)) {
                        hashMap0.put(((fmev)gfsx0.d()).a, new ArrayList());
                    }
                    ((List)hashMap0.get(((fmev)gfsx0.d()).a)).add(s1);
                }
                else {
                    flbj.f("SQLiteMessagingStore", "Conversation decoding failed");
                }
            }
        }
        ggek ggek0 = new ggek();
        for(Object object2: hashMap0.keySet()) {
            ggek0.i(((ConversationId)object2), gged_interceptors.i(((Collection)hashMap0.get(((ConversationId)object2)))));
        }
        return ggek0.b();
    }
}

