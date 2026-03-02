import org.json.JSONException;

public final class kqm implements Runnable {
    public final krd a;
    public final JSONException b;

    public kqm(krd krd0, JSONException jSONException0) {
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
        String s = this.b.getMessage();
        kjk0.a((s == null || s.length() <= 0 ? new kmf(new klx(), "Unknown error") : new kmf(new klx(), s)));
    }
}

