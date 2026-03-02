import android.content.ContentValues;

public final class crwb {
    final ContentValues a;

    public crwb() {
        this.a = new ContentValues();
    }

    public crwb(ContentValues contentValues0) {
        this.a = new ContentValues(contentValues0);
    }

    public final crwc a() {
        return new crwc(new ContentValues(this.a));
    }

    public final void b(hfys hfys0) {
        byte[] arr_b = hfys0 == null ? null : hfys0.toBytesArray();
        this.a.put("consent_record", arr_b);
    }

    public final void c(hfyt hfyt0) {
        byte[] arr_b = hfyt0 == null ? null : hfyt0.toBytesArray();
        this.a.put("device_info", arr_b);
    }

    public final void d(Long long0) {
        this.a.put("version_index", long0);
    }
}

