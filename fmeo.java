import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmeo {
    public final ContactId a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final gfsx e;
    public final boolean f;
    public final long g;
    public final gged_interceptors h;
    public final gged_interceptors i;
    public final gfsx j;
    public final gfsx k;
    public final long l;

    public fmeo() {
        throw null;
    }

    public fmeo(ContactId contactId0, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, boolean z, long v, gged_interceptors gged0, gged_interceptors gged1, gfsx gfsx4, gfsx gfsx5, long v1) {
        this.a = contactId0;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
        this.e = gfsx3;
        this.f = z;
        this.g = v;
        this.h = gged0;
        this.i = gged1;
        this.j = gfsx4;
        this.k = gfsx5;
        this.l = v1;
    }

    public static fmen a() {
        fmen fmen0 = new fmen(null);
        fmen0.g(false);
        fmen0.i(ggna.a);
        fmen0.l(ggna.a);
        fmen0.k(0L);
        return fmen0;
    }

    @Deprecated
    public final gfsx b() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            gfsx gfsx0 = this.a.g();
            if(!gfsx0.i()) {
                return gfqx.a;
            }
            jSONObject0.put("CONTACT_ID", gfsx0.d());
            gfsx gfsx1 = this.b;
            if(gfsx1.i()) {
                jSONObject0.put("NAME", gfsx1.d());
            }
            gfsx gfsx2 = this.c;
            if(gfsx2.i()) {
                jSONObject0.put("A11Y_NAME", gfsx2.d());
            }
            gfsx gfsx3 = this.d;
            if(gfsx3.i()) {
                jSONObject0.put("IMAGE_URL", gfsx3.d());
            }
            gfsx gfsx4 = this.e;
            if(gfsx4.i()) {
                jSONObject0.put("IMAGE", Base64.encodeToString(flbm.j(((Bitmap)gfsx4.d())), 2));
            }
            jSONObject0.put("IS_IMAGE_STALE", this.f);
            jSONObject0.put("EXPIRATION_TIME_MILLIS", this.g);
            JSONArray jSONArray0 = new JSONArray();
            ggqk ggqk0 = this.h.E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                gfsx gfsx5 = ((fmfj)object0).a();
                if(gfsx5.i()) {
                    jSONArray0.put(gfsx5.d());
                }
            }
            jSONObject0.put("MENU_ITEMS", jSONArray0);
            JSONArray jSONArray1 = new JSONArray();
            ggqk ggqk1 = this.i.E();
            while(ggqk1.hasNext()) {
                Object object1 = ggqk1.next();
                gfsx gfsx6 = ((fmfj)object1).a();
                if(gfsx6.i()) {
                    jSONArray1.put(gfsx6.d());
                }
            }
            jSONObject0.put("TOOLBAR_BUTTONS", jSONArray1);
            gfsx gfsx7 = this.j;
            if(gfsx7.i()) {
                gfsx7.d();
                gfsx gfsx8 = ((fmhn)gfsx7.d()).a();
                if(gfsx8.i()) {
                    jSONObject0.put("CUSTOM_VIEW_CONTENT_MODEL_TYPE", 1);
                    jSONObject0.put("CUSTOM_VIEW_CONTENT_MODEL", gfsx8.d());
                }
            }
            gfsx gfsx9 = this.k;
            if(gfsx9.i()) {
                gfsx gfsx10 = ((fmfl)gfsx9.d()).a();
                if(gfsx10.i()) {
                    jSONObject0.put("UI_CONFIGURATIONS", gfsx10.d());
                }
            }
            return gfsx.m(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("Contact", "failed to convert Contact to JSONObject");
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 == this ? true : (object0 instanceof fmeo) && this.a.equals(((fmeo)object0).a) && this.g == ((fmeo)object0).g && this.d.equals(((fmeo)object0).d) && this.b.equals(((fmeo)object0).b) && this.f == ((fmeo)object0).f && this.k.equals(((fmeo)object0).k) && this.l == ((fmeo)object0).l;
    }

    @Override
    public final int hashCode() {
        int v = 0x4CF;
        int v1 = this.e.i() ? 0x4CF : 0x4D5;
        int v2 = (((this.a.hashCode() + 0x20F) * 0x1F + this.d.hashCode()) * 0x1F + v1) * 0x1F + this.b.hashCode();
        int v3 = this.k.i() ? this.k.d().hashCode() : 0x4D5;
        long v4 = this.g;
        if(!this.f) {
            v = 0x4D5;
        }
        return (((v2 * 0x1F + v) * 0x1F + fmem.a(v4)) * 0x1F + v3) * 0x1F + fmem.a(this.l);
    }

    @Override
    public final String toString() {
        return "Contact{contactId=" + this.a + ", name=" + this.b + ", a11yName=" + this.c + ", imageUrl=" + this.d + ", image=" + this.e + ", isImageStale=" + this.f + ", expirationTimeMillis=" + this.g + ", menuItems=" + this.h + ", toolbarButtons=" + this.i + ", customViewContentModel=" + this.j + ", lighterUiConfigurations=" + this.k + ", serverTimestampUs=" + this.l + "}";
    }
}

