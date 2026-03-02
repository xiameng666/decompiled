import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmjg implements flwr {
    @Override  // flwr
    public final fmfr a(AccountContext accountContext0, hnub hnub0) {
        if((hnsv.b(hnub0.n) == null ? hnsv.k : hnsv.b(hnub0.n)).equals(hnsv.d)) {
            hnud hnud0 = hnub0.e == 103 ? ((hnud)hnub0.f) : hnud.a;
            if(gfqz.e((hnud0.c == null ? hntr.a : hnud0.c).d, "image/jpeg")) {
                hnud hnud1 = hnub0.e == 103 ? ((hnud)hnub0.f) : hnud.a;
                byte[] arr_b = (hnud1.c == null ? hntr.a : hnud1.c).e.toByteArray();
                fmjn fmjn0 = new fmjn(null);
                fmjn0.e(arr_b);
                fmjn0.b(0);
                fmjn0.b = null;
                fmjn0.f((hnub0.e == 103 ? ((hnud)hnub0.f) : hnud.a).d);
                fmjn0.c((hnub0.e == 103 ? ((hnud)hnub0.f) : hnud.a).e);
                hnud hnud2 = hnub0.e == 103 ? ((hnud)hnub0.f) : hnud.a;
                fmjn0.d((hnud2.c == null ? hntr.a : hnud2.c).g);
                fmjl fmjl0 = new fmjl();
                hnud hnud3 = hnub0.e == 103 ? ((hnud)hnub0.f) : hnud.a;
                hntr hntr0 = hnud3.c == null ? hntr.a : hnud3.c;
                fmjl0.b((hntr0.c == null ? hnxf.a : hntr0.c).c);
                hnud hnud4 = hnub0.e == 103 ? ((hnud)hnub0.f) : hnud.a;
                hntr hntr1 = hnud4.c == null ? hntr.a : hnud4.c;
                hnxf hnxf0 = hntr1.c == null ? hnxf.a : hntr1.c;
                fmjl0.c((hnxf0.e == null ? hftw.a : hnxf0.e).b);
                fmjn0.a = fmjl0.a();
                gfsx gfsx0 = fmia.c(fmjn0.a());
                if(gfsx0.i()) {
                    fmfo fmfo0 = new fmfo();
                    fmfo0.c("photos");
                    fmfo0.b(((byte[])gfsx0.d()));
                    return fmcs.a(fmfo0.a());
                }
                flbj.c("PhotoMsgConverter", "Failed to serialize photo message");
                return fmcs.d(ByteString.b);
            }
            flbj.c("PhotoMsgConverter", "Attempted to convert non-jpeg Photo message");
            return fmcs.d(ByteString.b);
        }
        flbj.c("PhotoMsgConverter", "Attempted to convert non-photo LighterMessage");
        return fmcs.d(ByteString.b);
    }

    @Override  // flwr
    public final gfsx b(JSONObject jSONObject0) {
        gfsx gfsx1;
        try {
            fmfo fmfo0 = new fmfo();
            fmfo0.c(jSONObject0.getString("TYPE"));
            JSONObject jSONObject1 = jSONObject0.getJSONObject("CONTENT");
            try {
                fmjn fmjn0 = new fmjn(null);
                fmjn0.f(((Integer)jSONObject1.get("WIDTH")).intValue());
                fmjn0.c(((Integer)jSONObject1.get("HEIGHT")).intValue());
                fmjn0.d(((Integer)jSONObject1.get("SIZE")).intValue());
                fmjn0.b(((Integer)jSONObject1.get("DOWNLOAD_STATUS")).intValue());
                if(jSONObject1.has("THUMBNAIL")) {
                    fmjn0.e(Base64.decode(jSONObject1.getString("THUMBNAIL"), 2));
                }
                if(jSONObject1.has("MEDIA_ID")) {
                    gfsx gfsx0 = fmjm.a(((JSONObject)jSONObject1.get("MEDIA_ID")));
                    if(gfsx0.i()) {
                        fmjn0.a = (fmjm)gfsx0.d();
                    }
                }
                if(jSONObject1.has("LOCAL_URI")) {
                    fmjn0.b = (String)jSONObject1.get("LOCAL_URI");
                }
                gfsx1 = gfsx.m(fmjn0.a());
            }
            catch(Exception exception0) {
                flbj.d("PhotoData", "failed to convert JSON Object to PhotoData", exception0);
                gfsx1 = gfqx.a;
            }
            if(!gfsx1.i()) {
                flbj.c("PhotoMsgConverter", "failed to convert JSONObject to CustomMessage without photoData");
                return gfqx.a;
            }
            gfsx gfsx2 = fmia.c(((fmjo)gfsx1.d()));
            if(!gfsx2.i()) {
                flbj.c("PhotoMsgConverter", "failed to convert JSONObject to CustomMessage without photoData in byte array");
                return gfqx.a;
            }
            fmfo0.b(((byte[])gfsx2.d()));
            return gfsx.m(fmfo0.a());
        }
        catch(JSONException unused_ex) {
            flbj.c("PhotoMsgConverter", "failed to convert JSONObject to CustomMessage");
            return gfqx.a;
        }
    }

    @Override  // flwr
    public final gfsx c(fmfp fmfp0) {
        gfsx gfsx2;
        flbj.a("PhotoMsgConverter", "encode photo custom message");
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("TYPE", fmfp0.a);
            gfsx gfsx0 = fmia.b(fmfp0.b);
            if(!gfsx0.i()) {
                flbj.c("PhotoMsgConverter", "failed to convert CustomMessage to JSONObject without photoData");
                return gfqx.a;
            }
            Object object0 = gfsx0.d();
            flbj.a("PhotoData", "encode photo data");
            try {
                JSONObject jSONObject1 = new JSONObject();
                fmjm fmjm0 = ((fmjo)object0).a;
                if(fmjm0 != null && fmjm0.b().i()) {
                    jSONObject1.put("MEDIA_ID", fmjm0.b().d());
                }
                String s = ((fmjo)object0).b;
                if(s != null) {
                    jSONObject1.put("LOCAL_URI", s);
                }
                jSONObject1.put("WIDTH", ((fmjo)object0).d);
                jSONObject1.put("HEIGHT", ((fmjo)object0).e);
                jSONObject1.put("SIZE", ((fmjo)object0).f);
                jSONObject1.put("DOWNLOAD_STATUS", ((fmjo)object0).g);
                gfsx gfsx1 = ((fmjo)object0).c;
                if(gfsx1.i() && ((byte[])gfsx1.d()).length > 0) {
                    Bitmap bitmap0 = BitmapFactory.decodeByteArray(((byte[])gfsx1.d()), 0, ((byte[])gfsx1.d()).length);
                    if(bitmap0 != null) {
                        jSONObject1.put("THUMBNAIL_HEIGHT", bitmap0.getHeight());
                        jSONObject1.put("THUMBNAIL_WIDTH", bitmap0.getWidth());
                        jSONObject1.put("THUMBNAIL", Base64.encodeToString(((byte[])gfsx1.d()), 2));
                    }
                }
                flbj.a("PhotoData", "return photoData JSON Optional back");
                gfsx2 = gfsx.m(jSONObject1);
            }
            catch(JSONException jSONException0) {
                flbj.d("PhotoData", "failed to convert photoData to JSON Object", jSONException0);
                gfsx2 = gfqx.a;
            }
            if(!gfsx2.i()) {
                flbj.c("PhotoMsgConverter", "failed to convert CustomMessage to JSONObject without photoDataJson");
                return gfqx.a;
            }
            jSONObject0.put("CONTENT", gfsx2.d());
            flbj.a("PhotoMsgConverter", "return photo custom message json optional back");
            return gfsx.m(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("PhotoMsgConverter", "failed to convert CustomMessage to JSONObject");
            return gfqx.a;
        }
    }

    @Override  // flwr
    public final ProtoLiteBuilder d(fmga fmga0) {
        gfsx gfsx0 = fmia.a(fmga0);
        if(!gfsx0.i()) {
            flbj.c("PhotoMsgConverter", "Attempted to convert non-photo Message");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
            hnsv hnsv0 = hnsv.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnub hnub0 = (hnub)hftp0.b_message;
            hnub0.n = hnsv0.a();
            return hftp0;
        }
        fmjo fmjo0 = (fmjo)gfsx0.d();
        Object object0 = fmjo0.c.i() ? fmjo0.c.d() : null;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
        hnsv hnsv1 = hnsv.d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub1 = (hnub)hftp1.b_message;
        hnub1.n = hnsv1.a();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnud.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hntr.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hnxf.a).v_newBuilder();
        fmjm fmjm0 = fmjo0.a;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        hnxf hnxf0 = (hnxf)hftp4.b_message;
        fmjm0.a.getClass();
        hnxf0.c = fmjm0.a;
        hftw hftw0 = hftw.b(fmjm0.b);
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp4.b_message;
        hftw0.getClass();
        ((hnxf)hftv0).e = hftw0;
        ((hnxf)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((hnxf)hftp4.b_message).d = 10;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hntr hntr0 = (hntr)hftp3.b_message;
        hnxf hnxf1 = (hnxf)hftp4.N_build();
        hnxf1.getClass();
        hntr0.c = hnxf1;
        hntr0.b |= 1;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hntr)hftp3.b_message).d = "image/jpeg";
        ByteString hfsf0 = ByteString.copyFrom(((byte[])object0));
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((hntr)hftv1).e = hfsf0;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        ((hntr)hftv2).f = "image/jpeg";
        int v = fmjo0.f;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hntr)hftp3.b_message).g = v;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hnud hnud0 = (hnud)hftp2.b_message;
        hntr hntr1 = (hntr)hftp3.N_build();
        hntr1.getClass();
        hnud0.c = hntr1;
        hnud0.b |= 1;
        int v1 = fmjo0.d;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((hnud)hftv3).d = v1;
        int v2 = fmjo0.e;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hnud)hftp2.b_message).e = v2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub2 = (hnub)hftp1.b_message;
        hnud hnud1 = (hnud)hftp2.N_build();
        hnud1.getClass();
        hnub2.f = hnud1;
        hnub2.e = 103;
        return hftp1;
    }
}

