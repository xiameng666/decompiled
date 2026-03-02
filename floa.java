import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class floa {
    public static ContentValues a(fmeo fmeo0) {
        byte[] arr_b;
        gfsx gfsx4;
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("lighter_id_type", Integer.valueOf(fmeo0.a.b().f));
        contentValues0.put("lighter_id_id", fmeo0.a.d());
        contentValues0.put("lighter_id_normalized_id", (fmeo0.a.b() == ContactId.ContactType.c ? flbd.a(fmeo0.a.d()) : fmeo0.a.d()));
        contentValues0.put("lighter_handler_id", ((String)fmeo0.a.c().g()));
        contentValues0.put("lighter_id_app_name", fmeo0.a.e());
        HashMap hashMap0 = new HashMap();
        hashMap0.put("expiration_time_ms", Long.valueOf(fmeo0.g));
        hashMap0.put("image_stale", Boolean.valueOf(fmeo0.f));
        hashMap0.put("server_timestamp_us", Long.valueOf(fmeo0.l));
        gfsx gfsx0 = fmeo0.b;
        if(gfsx0.i()) {
            hashMap0.put("name", gfsx0.d());
        }
        gfsx gfsx1 = fmeo0.d;
        if(gfsx1.i()) {
            hashMap0.put("image_url", gfsx1.d());
        }
        gfsx gfsx2 = fmeo0.e;
        if(gfsx2.i()) {
            hashMap0.put("image", flbm.j(((Bitmap)gfsx2.d())));
        }
        gged_interceptors gged0 = fmeo0.h;
        if(!gged0.isEmpty()) {
            hashMap0.put("menu_items", flbp.d(gged0, new flnz()));
        }
        gfsx gfsx3 = fmeo0.j;
        if(gfsx3.i()) {
            Object object0 = gfsx3.d();
            HashMap hashMap1 = new HashMap();
            hashMap1.put("TYPE", Integer.valueOf(1));
            hashMap1.put("CONTENT", flpn.d(((fmhn)object0).a));
            try {
                gfsx4 = gfsx.m(flbm.i(hashMap1));
            }
            catch(IOException iOException0) {
                flbj.d("SerRichTextModel", "Failed to serialize contact properties.", iOException0);
                gfsx4 = gfqx.a;
            }
            if(gfsx4.i()) {
                hashMap0.put("custom_view_content_type", Integer.valueOf(1));
                hashMap0.put("custom_view_content", gfsx4.d());
            }
        }
        gged_interceptors gged1 = fmeo0.i;
        if(!gged1.isEmpty()) {
            hashMap0.put("toolbar_buttons", flbp.d(gged1, new flnz()));
        }
        gfsx gfsx5 = fmeo0.k;
        if(gfsx5.i()) {
            Object object1 = gfsx5.d();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("BADGE", Integer.valueOf(((fmfl)object1).a));
            hashMap2.put("PROFILE_LABEL_STYLE", Integer.valueOf(((fmfl)object1).b));
            hashMap0.put("ui_configurations", hashMap2);
        }
        try {
            arr_b = flbm.i(hashMap0);
        }
        catch(IOException iOException1) {
            flbj.d("ContactCursors", "Failed to serialize contact properties.", iOException1);
            arr_b = new byte[0];
        }
        contentValues0.put("contact_properties", arr_b);
        return contentValues0;
    }

    public static ContactId b(int v, Cursor cursor0) {
        fmep fmep0 = new fmep(null);
        fmep0.c(cursor0.getString(2 + v));
        fmep0.d(cursor0.getString(4 + v));
        fmep0.e(ContactId.ContactType.a(cursor0.getInt(1 + v)));
        String s = cursor0.getString(v + 3);
        if(s != null) {
            fmep0.b(s);
        }
        return fmep0.a();
    }

    public static gfsx c(Cursor cursor0) {
        gfsx gfsx3;
        gfsx gfsx2;
        if(cursor0.getPosition() == -1 && !cursor0.moveToFirst()) {
            return gfqx.a;
        }
        fmen fmen0 = fmeo.a();
        fmen0.c(floa.b(0, cursor0));
        HashMap hashMap0 = flbm.g(cursor0.getBlob(5));
        if(hashMap0.containsKey("expiration_time_ms")) {
            fmen0.d(((Long)hashMap0.get("expiration_time_ms")).longValue());
        }
        else {
            fmen0.d(-1L);
        }
        if(hashMap0.containsKey("name")) {
            fmen0.j(((String)hashMap0.get("name")));
        }
        if(hashMap0.containsKey("image_url")) {
            fmen0.f(((String)hashMap0.get("image_url")));
        }
        if(hashMap0.containsKey("image_stale")) {
            fmen0.g(((Boolean)hashMap0.get("image_stale")).booleanValue());
        }
        if(hashMap0.containsKey("custom_view_content") && ((int)(((Integer)hashMap0.get("custom_view_content_type")))) == 1) {
            byte[] arr_b = (byte[])hashMap0.get("custom_view_content");
            if(arr_b != null && arr_b.length != 0) {
                HashMap hashMap1 = flbm.g(arr_b);
                if(hashMap1.containsKey("TYPE") && ((int)(((Integer)hashMap1.get("TYPE")))) == 1) {
                    gfsx gfsx0 = flbm.b(hashMap1.get("CONTENT"));
                    if(gfsx0.i()) {
                        gfsx gfsx1 = flpn.c(((HashMap)gfsx0.d()));
                        gfsx2 = gfsx1.i() ? gfsx.m(new fmhn(((fmhm)gfsx1.d()))) : gfqx.a;
                    }
                    else {
                        gfsx2 = gfqx.a;
                    }
                }
                else {
                    gfsx2 = gfqx.a;
                }
            }
            else {
                gfsx2 = gfqx.a;
            }
            if(gfsx2.i()) {
                fmen0.m(((fmhn)gfsx2.d()));
            }
        }
        fmen0.i(floa.d(hashMap0, "menu_items").h());
        fmen0.l(floa.d(hashMap0, "toolbar_buttons").h());
        if(hashMap0.containsKey("image")) {
            Bitmap bitmap0 = flbm.a(((byte[])hashMap0.get("image")));
            if(bitmap0 != null) {
                fmen0.e(bitmap0);
            }
        }
        if(hashMap0.containsKey("ui_configurations")) {
            try {
                HashMap hashMap2 = (HashMap)hashMap0.get("ui_configurations");
                try {
                    fmfk fmfk0 = new fmfk();
                    fmfk0.b(0);
                    fmfk0.c(0);
                    if(hashMap2.containsKey("BADGE")) {
                        fmfk0.b(((Integer)hashMap2.get("BADGE")).intValue());
                    }
                    if(hashMap2.containsKey("PROFILE_LABEL_STYLE")) {
                        fmfk0.c(((Integer)hashMap2.get("PROFILE_LABEL_STYLE")).intValue());
                    }
                    gfsx3 = gfsx.m(fmfk0.a());
                }
                catch(ClassCastException unused_ex) {
                    flbj.c("ContactCursors", "Failed to de-serialize UI configurations properties.");
                    gfsx3 = gfqx.a;
                }
                if(gfsx3.i()) {
                    fmen0.h(((fmfl)gfsx3.d()));
                }
            }
            catch(ClassCastException unused_ex) {
                flbj.c("ContactCursors", "Failed to de-serialize UI configurations map.");
            }
        }
        if(hashMap0.containsKey("server_timestamp_us")) {
            fmen0.k(((Long)hashMap0.get("server_timestamp_us")).longValue());
        }
        return gfsx.m(fmen0.a());
    }

    private static ggdy d(HashMap hashMap0, String s) {
        gfsx gfsx1;
        ArrayList arrayList0;
        ggdy ggdy0 = new ggdy();
        if(hashMap0.containsKey(s)) {
            try {
                arrayList0 = (ArrayList)hashMap0.get(s);
            }
            catch(ClassCastException classCastException0) {
                flbj.d("ContactCursors", "Failed to deserialize " + s, classCastException0);
                arrayList0 = new ArrayList();
            }
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Map map0 = (Map)arrayList0.get(v1);
                if(map0.containsKey("ACTION") && map0.containsKey("MENU_NAME")) {
                    fmfi fmfi0 = new fmfi(null);
                    fmfi0.c(((String)map0.get("MENU_NAME")));
                    gfsx gfsx0 = flbl.a(flbm.b(map0.get("ACTION")), new floi());
                    if(gfsx0.i()) {
                        fmfi0.a = (fmbi)gfsx0.d();
                        if(map0.containsKey("ICON")) {
                            fmfi0.b(Base64.decode(((String)map0.get("ICON")), 2));
                        }
                        gfsx1 = gfsx.m(fmfi0.a());
                    }
                    else {
                        flbj.c("MenuItemConv", "Parse Action failed.");
                        gfsx1 = gfqx.a;
                    }
                }
                else {
                    flbj.c("MenuItemConv", "Missing necessary properties.");
                    gfsx1 = gfqx.a;
                }
                if(gfsx1.i()) {
                    ggdy0.i(gfsx1.d());
                }
            }
        }
        return ggdy0;
    }
}

