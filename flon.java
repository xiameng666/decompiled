import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public final class flon {
    public static fmga a(ConversationId conversationId0, Cursor cursor0) {
        fmfm fmfm0 = fmga.a();
        fmfm0.j(cursor0.getString(1));
        fmfm0.f = fmfu.a(cursor0.getInt(2));
        fmfm0.k(fmft.a(cursor0.getInt(7)));
        fmfm0.m(cursor0.getLong(5));
        fmfm0.e(conversationId0);
        fmfm0.c(cursor0.getInt(9));
        fmfm0.g(cursor0.getInt(11));
        HashMap hashMap0 = flon.d(cursor0.getBlob(6));
        if(hashMap0.containsKey("content_type")) {
            int v = fmfn.b(glwy.c(((byte[])hashMap0.get("content_type"))));
            if(hashMap0.containsKey("message_content")) {
                switch(v - 1) {
                    case 0: {
                        byte[] arr_b = (byte[])hashMap0.get("message_content");
                        fmfm0.b = fmcs.d((arr_b == null ? ByteString.b : ByteString.copyFrom(arr_b)));
                        break;
                    }
                    case 1: {
                        fmfm0.s(new String(((byte[])hashMap0.get("message_content"))));
                        break;
                    }
                    case 2: {
                        fmfo fmfo0 = new fmfo();
                        fmfo0.c(new String(((byte[])hashMap0.get("custom_message_content_type"))));
                        fmfo0.b(((byte[])hashMap0.get("message_content")));
                        fmfm0.q(fmfo0.a());
                        break;
                    }
                    case 3: {
                        HashMap hashMap1 = flbm.g(((byte[])hashMap0.get("message_content")));
                        if(hashMap1.isEmpty()) {
                            flbj.c("MessageCursors", "Failed to deserialize RichText message content.");
                        }
                        gfsx gfsx0 = flpn.c(hashMap1);
                        if(gfsx0.i()) {
                            fmfm0.i(((fmhm)gfsx0.d()));
                        }
                        else {
                            fmfm0.b = fmcs.d(ByteString.b);
                        }
                        break;
                    }
                    default: {
                        fmfm0.o();
                    }
                }
            }
            else {
                fmfm0.b = fmcs.d(ByteString.b);
            }
        }
        else {
            fmfm0.b = fmcs.d(ByteString.b);
        }
        byte[] arr_b1 = (byte[])hashMap0.get("metadata");
        if(arr_b1 != null) {
            ggek ggek0 = new ggek();
            for(Object object0: flbm.h(arr_b1).entrySet()) {
                ggek0.i(((String)((Map.Entry)object0).getKey()), ByteString.copyFrom(((byte[])((Map.Entry)object0).getValue())));
            }
            fmfm0.l(ggek0.b());
        }
        byte[] arr_b2 = (byte[])hashMap0.get("fallback");
        if(arr_b2 != null) {
            fmfm0.f(new String(arr_b2));
        }
        byte[] arr_b3 = (byte[])hashMap0.get("snippet");
        if(arr_b3 != null) {
            fmfm0.n(new String(arr_b3));
        }
        fmfm0.h(glwy.c(((byte[])hashMap0.get("intended_rendering_type"))));
        byte[] arr_b4 = (byte[])hashMap0.get("ACTIVE_DECORATION_IDS");
        try {
            fmfm0.b(gged_interceptors.i(((ArrayList)flbm.d(arr_b4))));
        }
        catch(IOException | ClassNotFoundException | ClassCastException exception0) {
            flbj.g("MessageCursors", "Failed to deserialize active decoration ids.", exception0);
        }
        byte[] arr_b5 = (byte[])hashMap0.get("POSSIBLE_DECORATIONS");
        try {
            gged_interceptors gged0 = flbp.b(((ArrayList)flbm.d(arr_b5)), new floj());
            flok flok0 = new flok();
            ggek ggek1 = new ggek();
            ggqk ggqk0 = gged0.E();
            while(ggqk0.hasNext()) {
                Object object1 = ggqk0.next();
                ggek1.i(flok0.apply(object1), ((fmgg)object1));
            }
            fmfm0.e = ggek1.b();
        }
        catch(IOException | ClassNotFoundException | ClassCastException exception1) {
            flbj.g("MessageCursors", "Failed to deserialize possible decorations.", exception1);
        }
        switch(fmfz.a(cursor0.getInt(10)).ordinal()) {
            case 0: {
                fmfm0.c = fmct.a;
                break;
            }
            case 1: {
                fmfm0.c = fmcw.a;
                break;
            }
            case 2: {
                HashMap hashMap2 = flbm.g(((byte[])hashMap0.get("overlay_header")));
                fmfv fmfv0 = fmfw.a();
                fmfv0.k(((Integer)hashMap2.get("time_to_live_sec")).intValue());
                fmfv0.j(((Integer)hashMap2.get("OVERLAY_STYLE")).intValue());
                if(hashMap2.containsKey("display_icon")) {
                    fmfv0.d(ByteString.copyFrom(((byte[])hashMap2.get("display_icon"))));
                }
                if(hashMap2.containsKey("display_text")) {
                    fmfv0.e(((String)hashMap2.get("display_text")));
                }
                if(hashMap2.containsKey("dismiss_action")) {
                    gfsx gfsx1 = flbl.a(flbm.b(hashMap2.get("dismiss_action")), new flom());
                    fmbb fmbb0 = fmbi.c();
                    fmbb0.r();
                    fmfv0.b(((fmbi)gfsx1.f(fmbb0.a())));
                }
                if(hashMap2.containsKey("overlay_expire_time")) {
                    fmfv0.f(glwy.c(((byte[])hashMap2.get("overlay_expire_time"))));
                }
                gfsx gfsx2 = hashMap2.containsKey("overlay_lighter_icon") ? floh.a(flbm.g(((byte[])hashMap2.get("overlay_lighter_icon")))) : gfqx.a;
                if(gfsx2.i()) {
                    fmfv0.i(((fmfh)gfsx2.d()));
                }
                else {
                    fmfv0.i(fmfh.b());
                }
                if(hashMap2.containsKey("hide_snippet_in_conversation_list")) {
                    fmfv0.h(((Boolean)hashMap2.get("hide_snippet_in_conversation_list")).booleanValue());
                }
                if(hashMap2.containsKey("hide_dismiss_button")) {
                    fmfv0.g(((Boolean)hashMap2.get("hide_dismiss_button")).booleanValue());
                }
                if(hashMap2.containsKey("dismissible_by_tapping_outside")) {
                    fmfv0.c(((Boolean)hashMap2.get("dismissible_by_tapping_outside")).booleanValue());
                }
                fmfm0.c = fmcy.a(fmfv0.a());
                break;
            }
            case 3: {
                fmfm0.c = fmcu.a;
            }
        }
        fmfm0.a = floa.b(12, cursor0);
        return fmfm0.a();
    }

    public static gged_interceptors b(ConversationId conversationId0, Cursor cursor0) {
        ggdy ggdy0 = new ggdy();
        if(cursor0.moveToFirst()) {
            do {
                try {
                    ggdy0.i(flnv.b(flon.a(conversationId0, cursor0)));
                }
                catch(Exception unused_ex) {
                    fmai fmai0 = fmaj.a();
                    fmai0.g(10032);
                    fmai0.d(conversationId0);
                    ggdy0.i(flnv.a(fmai0.a()));
                }
            }
            while(cursor0.moveToNext());
            return ggdy0.h();
        }
        return ggdy0.h();
    }

    public static HashMap c(fmga fmga0) {
        byte[] arr_b;
        HashMap hashMap0 = new HashMap();
        fmfr fmfr0 = fmga0.f;
        hashMap0.put("content_type", glwy.l(fmfr0.a() - 1));
        int v = fmfr0.a() - 1;
        if(v == 0) {
            hashMap0.put("message_content", fmfr0.e().toByteArray());
        }
        else {
            switch(v) {
                case 1: {
                    hashMap0.put("message_content", flbn.b(fmfr0.d()));
                    break;
                }
                case 2: {
                    hashMap0.put("message_content", fmfr0.b().b);
                    hashMap0.put("custom_message_content_type", flbn.b(fmfr0.b().a));
                    break;
                }
                default: {
                    if(v == 3) {
                        hashMap0.put("message_content", flbm.i(flpn.d(fmfr0.c())));
                    }
                }
            }
        }
        ggeo ggeo0 = fmga0.i;
        if(!ggeo0.isEmpty()) {
            HashMap hashMap1 = new HashMap(ggeo0);
            try {
                HashMap hashMap2 = new HashMap();
                for(Object object0: hashMap1.entrySet()) {
                    hashMap2.put(((String)((Map.Entry)object0).getKey()), ((ByteString)((Map.Entry)object0).getValue()).toByteArray());
                }
                arr_b = flbm.i(hashMap2);
            }
            catch(IOException iOException0) {
                flbj.d("MessageCursors", "Failed to serialize message metadata.", iOException0);
                arr_b = new byte[0];
            }
            hashMap0.put("metadata", arr_b);
        }
        gfsx gfsx0 = fmga0.e;
        if(gfsx0.i()) {
            hashMap0.put("fallback", flbn.b(((String)gfsx0.d())));
        }
        gfsx gfsx1 = fmga0.h;
        if(gfsx1.i()) {
            hashMap0.put("snippet", flbn.b(((String)gfsx1.d())));
        }
        fmfx fmfx0 = fmga0.k;
        if(fmfx0.a().ordinal() == 2) {
            fmfw fmfw0 = fmfx0.b();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("time_to_live_sec", Integer.valueOf(fmfw0.e));
            hashMap3.put("OVERLAY_STYLE", Integer.valueOf(fmfw0.j));
            gfsx gfsx2 = fmfw0.a;
            if(gfsx2.i()) {
                hashMap3.put("dismiss_action", flnq.b(((fmbi)gfsx2.d())));
            }
            gfsx gfsx3 = fmfw0.b;
            if(gfsx3.i()) {
                hashMap3.put("display_icon", ((ByteString)gfsx3.d()).toByteArray());
            }
            gfsx gfsx4 = fmfw0.d;
            if(gfsx4.i()) {
                hashMap3.put("display_text", gfsx4.d());
            }
            gfsx gfsx5 = fmfw0.c;
            if(gfsx5.i()) {
                hashMap3.put("overlay_lighter_icon", flbm.i(floh.b(((fmfh)gfsx5.d()))));
            }
            gfsx gfsx6 = fmfw0.i;
            if(gfsx6.i()) {
                hashMap3.put("overlay_expire_time", glwy.l(((Integer)gfsx6.d()).intValue()));
            }
            hashMap3.put("hide_snippet_in_conversation_list", Boolean.valueOf(fmfw0.f));
            hashMap3.put("hide_dismiss_button", Boolean.valueOf(fmfw0.g));
            hashMap3.put("dismissible_by_tapping_outside", Boolean.valueOf(fmfw0.h));
            hashMap0.put("overlay_header", flbm.i(hashMap3));
        }
        hashMap0.put("intended_rendering_type", glwy.l(fmga0.l));
        hashMap0.put("ACTIVE_DECORATION_IDS", flbm.i(new ArrayList(fmga0.p)));
        hashMap0.put("POSSIBLE_DECORATIONS", flbm.i(flbp.d(fmga0.q.g(), new flol())));
        return hashMap0;
    }

    public static HashMap d(byte[] arr_b) {
        try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b); ObjectInputStream objectInputStream0 = new ObjectInputStream(byteArrayInputStream0)) {
            return (HashMap)objectInputStream0.readObject();
        }
        catch(IOException | ClassNotFoundException exception0) {
            flbj.d("MessageCursors", "Error loading message profile.", exception0);
            return new HashMap();
        }
    }
}

