import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

public final class ekeb extends ekeo {
    public final Map a;
    private static final ggfp b;

    static {
        ekeb.b = ggfp.L("data15", "data14", "raw_contact_id");
    }

    public ekeb() {
        super("vnd.android.cursor.item/photo");
        this.a = new HashMap();
    }

    @Override  // ekcc
    public final ggfp a() {
        return ekeb.b;
    }

    @Override  // ekcc
    public final void b(Cursor cursor0) {
        int v = cursor0.getColumnCount();
        int v1 = cursor0.getColumnIndex("data15");
        batl.p(v1, v, "Photo index not found.");
        byte[] arr_b = cursor0.getBlob(v1);
        int v2 = cursor0.getColumnIndex("data14");
        batl.p(v2, v, "Photo file id index not found.");
        long v3 = cursor0.getLong(v2);
        int v4 = cursor0.getColumnIndex("raw_contact_id");
        batl.p(v4, v, "RawContactId index not found.");
        Long long0 = cursor0.getLong(v4);
        ekea ekea0 = new ekea(v3, arr_b != null);
        this.a.put(long0, ekea0);
    }
}

