import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

final class ekcb implements ekcc {
    final Map a;
    private static final ggfp b;

    static {
        ekcb.b = new ggoh("contact_last_updated_timestamp");
    }

    public ekcb() {
        this.a = new HashMap();
    }

    @Override  // ekcc
    public final ggfp a() {
        return ekcb.b;
    }

    @Override  // ekcc
    public final void b(Cursor cursor0) {
        int v = cursor0.getColumnCount();
        int v1 = cursor0.getColumnIndex("_id");
        batl.p(v1, v, "Contact Id index not found.");
        long v2 = cursor0.getLong(v1);
        int v3 = cursor0.getColumnIndex("contact_last_updated_timestamp");
        batl.p(v3, v, "Contact Last Updated Timestamp index not found.");
        Long long0 = cursor0.getLong(v3);
        this.a.put(Long.valueOf(v2), long0);
    }
}

