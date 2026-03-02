import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONObject;

public final class cbxm implements jqv {
    public final Context a;
    public final String b;

    public cbxm(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        String s = bzoe.h(AppContextProvider.a()).c(huli.g(), "GCM");
        clcf clcf0 = clcg.e((huli.a.e().w() + huli.g() + "/rel/" + "topics" + ("?&subscriber_token=" + s)), clbk.a, clbj.a);
        clcj clcj0 = clbv.a(this.a).e(clcf0, new cbxn(jqt0), clhl.b.b(clhr.a), -1, 0x4600);
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("public_topic_name", "ulp");
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(jSONObject0.toString().getBytes(StandardCharsets.UTF_8));
        clcj0.q(this.a, byteBuffer0, clbk.a, clbj.a);
        clcj0.n("POST");
        clcs clcs0 = clbz.a(clbk.a, clbj.a);
        String s1 = new adgg(AppContextProvider.a()).b(AppContextProvider.a(), new Account(this.b, "com.google"), "oauth2:email https://www.googleapis.com/auth/firebase.messaging");
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Content-Type", "application/json");
        hashMap0.put("X-GFE-SSL", "yes");
        hashMap0.put("Authorization", "OAuth " + s1);
        for(Object object0: hashMap0.entrySet()) {
            clcs0.a(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        clcj0.m(new clct(clcs0));
        clcj0.l();
        clcj0.e().a();
        return String.format("Query %s for JSON", ((clcu)clcf0).b);
    }
}

