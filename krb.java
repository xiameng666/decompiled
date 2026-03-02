import java.util.concurrent.Executor;
import org.json.JSONException;

public final class krb implements ibth {
    public final krd a;
    public final JSONException b;

    public krb(krd krd0, JSONException jSONException0) {
        this.a = krd0;
        this.b = jSONException0;
    }

    @Override  // ibth
    public final Object a() {
        krd krd0 = this.a;
        Executor executor0 = krd0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kqm(krd0, this.b));
        return ibom.a;
    }
}

