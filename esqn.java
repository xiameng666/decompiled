import java.util.Set;
import org.json.JSONObject;

public final class esqn implements essj {
    @Override  // essj
    public final esrz b(JSONObject jSONObject0, JSONObject jSONObject1) {
        return new esql(jSONObject0);
    }

    @Override  // essj
    public final essa c(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essb essb0, Set set0) {
        if(!essb0.c()) {
            throw new essi();
        }
        uwm uwm0 = new uwm(jSONObject0);
        return new esqm(this, ((esql)esrz0).a, uwm0);
    }

    @Override  // essj
    public final esse d(esrz esrz0, JSONObject jSONObject0, byte[] arr_b, essg essg0, essb essb0) {
        uwm uwm0 = new uwm(jSONObject0);
        uwo uwo0 = uwe.c(new uwk(((esql)esrz0).a, uwm0), ((int)(Math.abs(essg0.a) % 100000000L)));
        byte[] arr_b1 = uwo0.a();
        return new esrx(uwm0.a, arr_b1, uwo0.a, uwo0.b, uwo0.c + 2000);
    }

    @Override  // essj
    public final String e() {
        return "unknown";
    }
}

