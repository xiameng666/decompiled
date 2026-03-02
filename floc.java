import android.database.Cursor;
import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public final class floc {
    public static gfsx a(Cursor cursor0) {
        gfsx gfsx0;
        if(cursor0.getPosition() != -1 || cursor0.moveToFirst()) {
            int v = flqk.b.length + 7;
            fmeu fmeu0 = fmev.a();
            if(ConversationId.IdType.a(cursor0.getInt(1)) == ConversationId.IdType.b) {
                fmew fmew0 = new fmew();
                fmex fmex0 = new fmex();
                fmex0.c(cursor0.getString(2));
                fmex0.b(cursor0.getString(3));
                fmew0.c(fmex0.a());
                fmew0.b(floa.b(flqk.b.length, cursor0));
                fmeu0.f(fmew0);
            }
            else {
                fmew fmew1 = new fmew();
                fmew1.d(floa.b(v, cursor0));
                fmew1.b(floa.b(flqk.b.length, cursor0));
                fmeu0.f(fmew1);
            }
            fmeu0.b(flbm.h(cursor0.getBlob(7)));
            fmeu0.m(cursor0.getLong(8));
            fmeu0.n(cursor0.getLong(9));
            HashMap hashMap0 = flbm.g(cursor0.getBlob(10));
            if(hashMap0.isEmpty()) {
                flbj.c("ConversationCursors", "Failed to deserialize conversation properties: No properties.");
            }
            else {
                if(hashMap0.containsKey("expiration_time_ms")) {
                    fmeu0.i(((Long)hashMap0.get("expiration_time_ms")).longValue());
                }
                else {
                    fmeu0.i(-1L);
                }
                if(hashMap0.containsKey("blockable")) {
                    fmeu0.c(((Boolean)hashMap0.get("blockable")).booleanValue());
                }
                if(hashMap0.containsKey("title")) {
                    fmeu0.q(((String)hashMap0.get("title")));
                }
                if(hashMap0.containsKey("image_url")) {
                    fmeu0.k(((String)hashMap0.get("image_url")));
                }
                if(hashMap0.containsKey("image_stale")) {
                    fmeu0.l(((Boolean)hashMap0.get("image_stale")).booleanValue());
                }
                if(hashMap0.containsKey("image")) {
                    Bitmap bitmap0 = flbm.a(((byte[])hashMap0.get("image")));
                    if(bitmap0 != null) {
                        fmeu0.j(bitmap0);
                    }
                }
                if(hashMap0.containsKey("suggestion_list")) {
                    HashMap hashMap1 = flbm.g(((byte[])hashMap0.get("suggestion_list")));
                    try {
                        fmhq fmhq0 = fmhr.a();
                        fmhq0.c(((String)hashMap1.get("ID")));
                        fmhq0.e(((Integer)hashMap1.get("RENDER_STYLE")).intValue());
                        fmhq0.d(((String)hashMap1.get("MESSAGE_ID")));
                        fmhq0.b(((String)hashMap1.get("HINT_TEXT")));
                        gged_interceptors gged0 = flbp.b(((ArrayList)hashMap1.get("SUGGESTIONS")), new flpr());
                        if(gged0.isEmpty()) {
                            gfsx0 = gfqx.a;
                        }
                        else {
                            fmhq0.f(gged0);
                            gfsx0 = gfsx.m(fmhq0.a());
                        }
                    }
                    catch(NullPointerException | IllegalStateException | ClassCastException exception0) {
                        flbj.d("ChipsListConverters", "failed to convert HashMap to SuggestionList", exception0);
                        gfsx0 = gfqx.a;
                    }
                    fmeu0.a = gfsx0;
                }
                if(hashMap0.containsKey("capabilities")) {
                    try {
                        fmeu0.d(gged_interceptors.i(((ArrayList)hashMap0.get("capabilities"))));
                    }
                    catch(ClassCastException classCastException0) {
                        flbj.d("ConversationCursors", "Error deserializing Capabilities in Conversation properties", classCastException0);
                    }
                }
                if(hashMap0.containsKey("properties_expiration_time_ms")) {
                    fmeu0.o(((Long)hashMap0.get("properties_expiration_time_ms")).longValue());
                }
                else {
                    fmeu0.o(-1L);
                }
                if(hashMap0.containsKey("server_timestamp_us")) {
                    fmeu0.p(((Long)hashMap0.get("server_timestamp_us")).longValue());
                }
                if(hashMap0.containsKey("conversation_context")) {
                    fmeu0.e(flbm.c(((String)hashMap0.get("conversation_context"))));
                }
                if(hashMap0.containsKey("created_timestamp_ms")) {
                    fmeu0.h(((Long)hashMap0.get("created_timestamp_ms")).longValue());
                }
            }
            try {
                return gfsx.m(fmeu0.a());
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        return gfqx.a;
    }

    public static HashMap b(byte[] arr_b) {
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        try {
            Object object0 = new ObjectInputStream(byteArrayInputStream0).readObject();
            return (object0 instanceof HashMap) ? ((HashMap)object0) : new HashMap();
        }
        catch(IOException | ClassNotFoundException exception0) {
            flbj.d("ConversationCursors", "Error reading conversation properties.", exception0);
            return new HashMap();
        }
    }

    public static HashMap c(fmev fmev0) {
        HashMap hashMap0 = new HashMap();
        floc.f(hashMap0, fmev0);
        gfsx gfsx0 = fmev0.j;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            HashMap hashMap1 = new HashMap();
            hashMap1.put("ID", ((fmhr)object0).b);
            hashMap1.put("MESSAGE_ID", ((fmhr)object0).c);
            hashMap1.put("RENDER_STYLE", Integer.valueOf(((fmhr)object0).e));
            flps flps0 = new flps();
            hashMap1.put("SUGGESTIONS", flbp.d(((fmhr)object0).d, flps0));
            hashMap1.put("HINT_TEXT", ((fmhr)object0).f);
            hashMap0.put("suggestion_list", flbm.i(hashMap1));
        }
        hashMap0.put("capabilities", new ArrayList(fmev0.k));
        hashMap0.put("properties_expiration_time_ms", Long.valueOf(fmev0.l));
        hashMap0.put("conversation_context", flbm.e(fmev0.n));
        return hashMap0;
    }

    public static byte[] d(HashMap hashMap0) {
        try {
            return flbm.i(hashMap0);
        }
        catch(IOException iOException0) {
            flbj.d("ConversationCursors", "Failed to serialize conversation properties.", iOException0);
            return new byte[0];
        }
    }

    public static byte[] e(fmev fmev0) {
        try {
            return flbm.i(floc.c(fmev0));
        }
        catch(IOException iOException0) {
            flbj.d("ConversationCursors", "Failed to serialize conversation properties.", iOException0);
            return new byte[0];
        }
    }

    public static void f(HashMap hashMap0, fmev fmev0) {
        hashMap0.put("expiration_time_ms", Long.valueOf(fmev0.f));
        hashMap0.put("blockable", Boolean.valueOf(fmev0.h));
        hashMap0.put("image_stale", Boolean.valueOf(fmev0.e));
        hashMap0.put("server_timestamp_us", Long.valueOf(fmev0.m));
        hashMap0.put("created_timestamp_ms", Long.valueOf(fmev0.o));
        gfsx gfsx0 = fmev0.b;
        if(gfsx0.i()) {
            hashMap0.put("title", gfsx0.d());
        }
        gfsx gfsx1 = fmev0.c;
        if(gfsx1.i()) {
            hashMap0.put("image_url", gfsx1.d());
        }
        gfsx gfsx2 = fmev0.d;
        if(gfsx2.i()) {
            hashMap0.put("image", flbm.j(((Bitmap)gfsx2.d())));
        }
    }
}

