import org.json.JSONException;

public final class kqp implements Runnable {
    public final krd a;
    public final JSONException b;

    public kqp(krd krd0, JSONException jSONException0) {
        this.a = krd0;
        this.b = jSONException0;
    }

    @Override
    public final void run() {
        kjk kjk0 = this.a.f;
        if(kjk0 == null) {
            ibuq.j("callback");
            kjk0 = null;
        }
        kjk0.a(new kmf(new klx(), this.b.getMessage()));
    }
}

