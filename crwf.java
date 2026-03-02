import android.content.ContentValues;

public final class crwf {
    final ContentValues a;

    public crwf() {
        this.a = new ContentValues();
    }

    public crwf(ContentValues contentValues0) {
        this.a = new ContentValues(contentValues0);
    }

    public final crwg a() {
        return new crwg(new ContentValues(this.a));
    }

    public final void b(Long long0) {
        this.a.put("carrier_id", long0);
    }

    public final void c(String s) {
        this.a.put("cpid", s);
    }

    public final void d(hfys hfys0) {
        this.e((hfys0 == null ? null : hfys0.toBytesArray()));
    }

    public final void e(byte[] arr_b) {
        this.a.put("consent_record", arr_b);
    }

    public final void f(Long long0) {
        this.a.put("expiration_time", long0);
    }

    public final void g(String s) {
        this.a.put("iccid", s);
    }

    public final void h(byte[] arr_b) {
        this.a.put("notification_stats", arr_b);
    }

    public final void i(hfyu hfyu0) {
        this.j((hfyu0 == null ? null : hfyu0.toBytesArray()));
    }

    public final void j(byte[] arr_b) {
        this.a.put("sim_extra", arr_b);
    }

    public final void k(Integer integer0) {
        this.a.put("sim_state", integer0);
    }
}

