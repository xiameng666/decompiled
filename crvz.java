import android.content.ContentValues;

public final class crvz {
    public static final crwa a(ContentValues contentValues0) {
        return new crwa(new ContentValues(contentValues0));
    }

    public static final void b(hfyr hfyr0, ContentValues contentValues0) {
        contentValues0.put("carrier_extra", hfyr0.toBytesArray());
    }

    public static final void c(Long long0, ContentValues contentValues0) {
        contentValues0.put("carrier_id", long0);
    }

    public static final void d(gspd gspd0, ContentValues contentValues0) {
        contentValues0.put("list_cpid_endpoints_resp", (gspd0 == null ? null : gspd0.toBytesArray()));
    }
}

