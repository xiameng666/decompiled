import android.content.res.Resources;
import android.net.Network;
import org.json.JSONObject;

public final class rhs {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final ggef d;
    public final int e;
    public final Network f;
    public final bkbc g;

    public rhs() {
        throw null;
    }

    public rhs(String s, String s1, JSONObject jSONObject0, ggef ggef0, int v, Network network0, bkbc bkbc0) {
        this.a = s;
        this.b = s1;
        this.c = jSONObject0;
        this.d = ggef0;
        this.e = v;
        this.f = network0;
        this.g = bkbc0;
    }

    public static rhr a() {
        rhr rhr0 = new rhr();
        rhr0.e("");
        rhr0.a = "";
        rhr0.b = new JSONObject();
        rhr0.d(30);
        rhr0.c("Accept-Language", Resources.getSystem().getConfiguration().getLocales().get(0).toLanguageTag());
        return rhr0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof rhs) && this.a.equals(((rhs)object0).a) && this.b.equals(((rhs)object0).b) && this.c.equals(((rhs)object0).c) && this.d.equals(((rhs)object0).d) && this.e == ((rhs)object0).e) {
            Network network0 = this.f;
            if(network0 == null) {
                if(((rhs)object0).f == null) {
                    return this.g == null ? ((rhs)object0).g == null : this.g.equals(((rhs)object0).g);
                }
            }
            else if(network0.equals(((rhs)object0).f)) {
                return this.g == null ? ((rhs)object0).g == null : this.g.equals(((rhs)object0).g);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ (this.f == null ? 0 : this.f.hashCode())) * 1000003;
        bkbc bkbc0 = this.g;
        if(bkbc0 != null) {
            v = bkbc0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final String toString() {
        return "HttpRequest{url=" + this.a + ", requestMethod=" + this.b + ", postData=" + this.c + ", requestProperties=" + this.d + ", timeoutInSec=" + this.e + ", network=" + this.f + ", urlConnectionFactory=" + this.g + "}";
    }
}

