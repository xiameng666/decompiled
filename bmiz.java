import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class bmiz implements blyh {
    private final String a;
    private final Integer b;
    private final AuthenticatorResponse c;

    public bmiz(bmja bmja0, Integer integer0, AuthenticatorResponse authenticatorResponse0) {
        batl.s(bmja0.d);
        this.a = bmja0.d;
        this.b = integer0;
        batl.s(authenticatorResponse0);
        this.c = authenticatorResponse0;
    }

    @Override  // blyh
    public final JSONObject a() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("responseType", this.a);
            jSONObject0.put("requestId", this.b.intValue());
            jSONObject0.put("authenticatorResponse", this.c.a());
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException("Error encoding ResponseMessage to JSON object", jSONException0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmiz) ? bata.b(this.a, ((bmiz)object0).a) && bata.b(this.b, ((bmiz)object0).b) && bata.b(this.c, ((bmiz)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        return this.a().toString();
    }
}

