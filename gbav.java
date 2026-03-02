import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.io.File;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public final class gbav extends gaok {
    private final gbap b;
    private final gcsk c;
    private final gaxk d;

    public gbav(gamx gamx0, gbap gbap0, gaxk gaxk0, gcsk gcsk0) {
        super(gamx0);
        this.b = gbap0;
        this.d = gaxk0;
        this.c = gcsk0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        String s10;
        JSONObject jSONObject2;
        JSONObject jSONObject1;
        JSONObject jSONObject0;
        String s8;
        String s7;
        gaym gaym0;
        gcsn gcsn0;
        String s3;
        String s1;
        WidgetConfig widgetConfig0 = this.e(gano0);
        hdbk hdbk0 = (hdbk)gawi.i(gano0.a, "documentUploadData", ((MessageLite)hdbk.a));
        fbbd fbbd0 = (fbbd)gawi.d(gano0.a, "extraEncryptionConfig", ((MessageLite)fbbd.a));
        String s = gano0.a.getStringExtra("filename");
        gavs.g(s, "BE_DUA_04", this.f());
        if(widgetConfig0.b == 22) {
            gaxl.a();
            if(hzls.a.b().d()) {
                s1 = "http://localhost:8887/docfe";
                goto label_15;
            }
            goto label_10;
        }
        else {
        label_10:
            int v = hdbk0.c;
            if(v == 8) {
                s1 = ghiq.a(((ghip)hdbk0.d)).b;
            }
            else {
                s1 = v == 5 ? ((String)hdbk0.d) : "";
            }
        }
        try {
        label_15:
            gamx gamx0 = this.d();
            Context context0 = this.a;
            String s2 = this.b.c(gamx0, context0, widgetConfig0.a, gbbh.a(widgetConfig0.b), false);
            if(fbbd0 == null) {
                s3 = bbmu.b(gbax.a(context0, s));
            }
            else {
                gaxj gaxj0 = this.d.a(widgetConfig0.a);
                byte[] arr_b = gbax.a(context0, s);
                s3 = arr_b == null ? null : bbmu.b(gaxj0.a(fbbd0, arr_b));
            }
            String s4 = "IMAGE_JPEG";
            String s5 = context0.getContentResolver().getType(Uri.parse(s));
            if(!TextUtils.isEmpty(s5)) {
                switch(s5) {
                    case "application/pdf": {
                        s4 = "APPLICATION_PDF";
                        break;
                    }
                    case "image/png": {
                        s4 = "IMAGE_PNG";
                    }
                }
            }
            gcsg gcsg0 = new gcsg(s1 + "?s7e_mode=b64file", ckzv.b);
            ibuq.f(s2, "authToken");
            ibuq.f(hdbk0, "documentUploadData");
            gbbc gbbc0 = ((gbbg)this.c).a;
            ibuq.f(s2, "authToken");
            ibuq.f(hdbk0, "documentUploadData");
            Uri.Builder uri$Builder0 = new Uri.Builder();
            uri$Builder0.appendQueryParameter("s7e_file", s3);
            if((hdbk0.b & 2) != 0) {
                uri$Builder0.appendQueryParameter("s7e_keytype", String.valueOf(hdbk0.f));
            }
            uri$Builder0.appendQueryParameter("mime_type", s4);
            uri$Builder0.appendQueryParameter("file_name", s);
            uri$Builder0.appendQueryParameter("os_type", "android");
            gaxl.a();
            if(hzjc.c()) {
                uri$Builder0.appendQueryParameter("quality_preprocessing", "true");
            }
            if((hdbk0.b & 1) != 0) {
                uri$Builder0.appendQueryParameter("upload_token", Base64.encodeToString(hdbk0.e.toByteArray(), 2));
            }
            String s6 = uri$Builder0.build().getEncodedQuery();
            gcsn0 = new gcsi(new gcsl(gcsg0, null, (s6 == null ? new byte[0] : s6.getBytes()), s2), new gbaw(gbbc0.a)).a();
            gaym0 = this.f();
            s7 = gcvz.a(gcsn0.c(), "UTF-8");
        }
        catch(gcqt | gcqz exception0) {
            goto label_104;
        }
        try {
            Object object0 = gcsn0.b();
            gavs.g(object0, "BE-DUNU-01", gaym0);
            s8 = new String(((byte[])object0), s7);
            jSONObject0 = new JSONObject(s8);
            goto label_72;
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
        }
        catch(gcqz gcqz0) {
            goto label_65;
        }
        catch(gcqt exception0) {
            goto label_104;
        }
        try {
            Log.e("DocumentUploadNetwork", "unsupported charset: " + s7, unsupportedEncodingException0);
            goto label_71;
        label_65:
            Log.e("DocumentUploadNetwork", "Network exception happens in retrieval of response data: ", gcqz0);
            goto label_71;
            try {
                jSONObject0 = new JSONObject(s8);
                goto label_72;
            }
            catch(JSONException jSONException0) {
                Log.e("DocumentUploadNetwork", "Could not parse response.", jSONException0);
            }
        label_71:
            jSONObject0 = null;
        label_72:
            if(jSONObject0 == null) {
                return ganp.j();
            }
            String s9 = jSONObject0.optString("status").equals("SUCCESS") ? jSONObject0.optString("document_token") : null;
            if(s9 == null) {
                return ganp.j();
            }
            Intent intent0 = ganp.e(0);
            intent0.putExtra("documentToken", s9);
            intent0.putExtra("shortFileName", s.substring(s.lastIndexOf(((int)File.separatorChar)) + 1));
            try {
                jSONObject1 = new JSONObject(jSONObject0.getString("document_upload_callback_data_json"));
            }
            catch(JSONException jSONException1) {
                Log.e("DocumentUploadNetwork", "Could not parse response.", jSONException1);
                jSONObject1 = null;
            }
            if(jSONObject1 != null) {
                gaxl.a();
                if(hzjc.c()) {
                    try {
                        jSONObject2 = jSONObject1.getJSONObject("image_quality_details");
                    }
                    catch(JSONException jSONException2) {
                        Log.e("DocumentUploadNetwork", "Could not get document upload quality details.", jSONException2);
                        jSONObject2 = null;
                    }
                    if(jSONObject2 != null) {
                        intent0.putExtra("documentImageQualityDetails", jSONObject2.toString());
                    }
                }
                try {
                    s10 = jSONObject1.getString("mime_type");
                }
                catch(JSONException jSONException3) {
                    Log.e("DocumentUploadNetwork", "Could not find mime type.", jSONException3);
                    s10 = null;
                }
                if(s10 != null) {
                    intent0.putExtra("documentUploadData", s10);
                }
            }
            return new ganp(intent0);
        }
        catch(gcqt | gcqz exception0) {
        label_104:
            Intent intent1 = (exception0 instanceof gcqt) ? ((gcqt)exception0).a : null;
            return intent1 == null ? ganp.j() : ganp.i(intent1);
        }
    }
}

