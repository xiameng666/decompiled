import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public final class bndl implements blyh {
    private final String a;
    private final String b;
    private final String c;
    private final ChannelIdValue d;

    public bndl(String s, String s1, String s2, ChannelIdValue channelIdValue0) {
        batl.s(s);
        this.a = s;
        batl.s(s1);
        this.b = s1;
        batl.s(s2);
        this.c = s2;
        batl.s(channelIdValue0);
        this.d = channelIdValue0;
    }

    @Override  // blyh
    public final JSONObject a() {
        throw null;
    }

    public final String b() {
        Object object0;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("typ", this.a);
            jSONObject0.put("challenge", this.b);
            jSONObject0.put("origin", this.c);
            ChannelIdValue channelIdValue0 = this.d;
            switch(channelIdValue0.b.ordinal()) {
                case 1: {
                    jSONObject0.put("cid_pubkey", this.d.c);
                    return jSONObject0.toString();
                }
                case 2: {
                    String s = channelIdValue0.d;
                    if(s == null) {
                        object0 = null;
                    }
                    else {
                        try {
                            object0 = new JSONObject(s);
                        }
                        catch(JSONException jSONException1) {
                            throw new RuntimeException(jSONException1);
                        }
                    }
                    jSONObject0.put("cid_pubkey", object0);
                    return jSONObject0.toString();
                }
                default: {
                    return jSONObject0.toString();
                }
            }
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bndl) ? this.a.equals(((bndl)object0).a) && this.b.equals(((bndl)object0).b) && this.c.equals(((bndl)object0).c) && this.d.equals(((bndl)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return (((this.a.hashCode() + 0x1F) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }
}

