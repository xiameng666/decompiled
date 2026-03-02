import com.google.android.gms.personalsafety.detection.FinderTagInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ehvz extends clcp {
    private FinderTagInfo b;
    private final ehvy c;

    public ehvz(clcq clcq0, ehvy ehvy0) {
        super(clcq0);
        this.c = ehvy0;
    }

    public final FinderTagInfo a() {
        String s8;
        List list1;
        List list0;
        String s7;
        String s6;
        String s5;
        String s4;
        try {
            Boolean boolean0 = Boolean.valueOf(false);
            try {
                JSONArray jSONArray0 = new JSONObject(this.c.a).getJSONArray("products");
                if(jSONArray0.length() > 0) {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(0);
                    JSONObject jSONObject1 = jSONObject0.getJSONObject("softwareInfo");
                    JSONObject jSONObject2 = jSONObject0.getJSONObject("configuration");
                    JSONObject jSONObject3 = jSONObject0.getJSONObject("assets");
                    String s = jSONObject1.getString("productData");
                    String s1 = jSONObject1.getString("networkId");
                    String s2 = jSONObject2.getString("manufacturerName");
                    String s3 = jSONObject2.getString("modelName");
                    ArrayList arrayList0 = new ArrayList();
                    JSONArray jSONArray1 = jSONObject2.getJSONArray("learnMoreItems");
                    for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                        arrayList0.add(jSONArray1.getString(v1));
                    }
                    ArrayList arrayList1 = new ArrayList();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("instructionsToDisableItems");
                    for(int v = 0; v < jSONArray2.length(); ++v) {
                        arrayList1.add(jSONArray2.getString(v));
                    }
                    s4 = s1;
                    s5 = s;
                    s6 = s2;
                    s7 = s3;
                    list0 = arrayList0;
                    list1 = arrayList1;
                    s8 = jSONObject3.getString("defaultHeroIcon");
                }
                else {
                    s7 = null;
                    s8 = null;
                    list0 = null;
                    s6 = null;
                    s5 = null;
                    s4 = null;
                    list1 = null;
                }
            }
            catch(JSONException jSONException0) {
                throw new gfuz(jSONException0);
            }
            this.b = new FinderTagInfo(null, s7, s8, null, null, null, list0, s6, s5, s4, list1, boolean0);
        }
        catch(gpzy | NullPointerException unused_ex) {
            ((ggtj)((ggtj)eicd.a.h()).ar(0x31EE)).B("DULT response out ProductData invalid JSON: %s .", this.c.a);
        }
        return this.b;
    }
}

