import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import j..util.Collection.-EL;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ahes implements bxto {
    public final List a;
    public final gged_interceptors b;

    public ahes(List list0, gged_interceptors gged0) {
        this.a = list0;
        this.b = gged0;
    }

    @Override  // bxto
    public final Object a(Object object0) {
        gged_interceptors gged0 = gged_interceptors.i(((List)object0));
        ggdy ggdy0 = new ggdy();
        int v = 0;
        while(true) {
            List list0 = this.a;
            if(v >= list0.size()) {
                goto label_15;
            }
            String s = ((ahbr)list0.get(v)).a;
            Bitmap bitmap0 = (Bitmap)gged0.get(v);
            ahax ahax0 = (ahax)this.b.get(v);
            if(!ahax0.a().b.containsKey("name")) {
                throw bxma.f(0x6EF5, "Invalid SD-JWT, missing name.");
            }
            if(!ahax0.a().b.containsKey("email")) {
                break;
            }
            ggdy0.i(new ahbj(s, bitmap0, new ahbk(((String)ahax0.a().b.get("name")), ((String)ahax0.a().b.get("email")), v), new ahbn(((gged_interceptors)Collection.-EL.stream(ahax0.a().b.v()).map(new ahbm()).collect(ggaf.a)))));
            ++v;
        }
        throw bxma.f(0x6EF5, "Invalid SD-JWT, missing email.");
    label_15:
        gged_interceptors gged1 = ggdy0.h();
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(); ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream()) {
            ArrayList arrayList0 = new ArrayList();
            JSONArray jSONArray0 = new JSONArray();
            int v1 = 0;
            while(true) {
                if(v1 >= ((ggna)gged1).c) {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("credentials", jSONArray0);
                    byte[] arr_b = jSONObject0.toString().getBytes(StandardCharsets.UTF_8);
                    byteArrayOutputStream1.write(ahbj.a((arrayList0.size() + 3) * 4));
                    byteArrayOutputStream1.write(ahbj.a(arr_b.length));
                    byteArrayOutputStream1.write(ahbj.a(arrayList0.size()));
                    Iterator iterator0 = arrayList0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object1 = iterator0.next();
                        byteArrayOutputStream1.write(ahbj.a(((Integer)object1).intValue()));
                    }
                    byteArrayOutputStream1.write(arr_b);
                    byteArrayOutputStream0.writeTo(byteArrayOutputStream1);
                    return byteArrayOutputStream1.toByteArray();
                }
                ahbj ahbj0 = (ahbj)gged1.get(v1);
                JSONObject jSONObject1 = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject1.put("format", "dc+sd-jwt");
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("title", ahbj0.c.a);
                        jSONObject3.put("subtitle", ahbj0.c.b);
                        jSONObject3.put("icon_id", ahbj0.c.c);
                    }
                    catch(JSONException jSONException2) {
                        throw bxma.g(0x6F2E, jSONException2);
                    }
                    jSONObject1.put("display_info", jSONObject3);
                    JSONArray jSONArray1 = new JSONArray();
                    gged_interceptors gged2 = ahbj0.d.b;
                    int v2 = gged2.size();
                    int v3 = 0;
                    while(true) {
                        if(v3 >= v2) {
                            break;
                        }
                        ahbl ahbl0 = (ahbl)gged2.get(v3);
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONObject4.put("name", ahbl0.a);
                            jSONObject4.put("display_name", ahbl0.b);
                            jSONObject4.put("display_value", ahbl0.c);
                        }
                        catch(JSONException jSONException3) {
                            throw bxma.g(0x6F2E, jSONException3);
                        }
                        jSONArray1.put(jSONObject4);
                        ++v3;
                        gged1 = gged1;
                        v1 = v1;
                    }
                    jSONObject1.put("fields", jSONArray1);
                    jSONObject2.put("id", ahbj0.a);
                    jSONObject2.put("credential", jSONObject1);
                }
                catch(JSONException jSONException1) {
                    throw bxma.g(0x6F2E, jSONException1);
                }
                jSONArray0.put(jSONObject2);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ahbj0.b.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                byte[] arr_b2 = byteArrayOutputStream2.toByteArray();
                arrayList0.add(Integer.valueOf(arr_b2.length));
                byteArrayOutputStream0.write(arr_b2);
                ++v1;
                gged1 = gged1;
            }
        }
        catch(IOException iOException0) {
            throw bxma.g(8, iOException0);
        }
        catch(JSONException jSONException0) {
            throw bxma.g(0x6F2E, jSONException0);
        }
    }
}

