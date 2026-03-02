import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

final class ekdh implements ekcc {
    public final Map a;
    private static final ggfp b;

    static {
        ekdh.b = ggfp.K("_id", "display_name");
    }

    public ekdh() {
        this.a = new HashMap();
    }

    @Override  // ekcc
    public final ggfp a() {
        return ekdh.b;
    }

    @Override  // ekcc
    public final void b(Cursor cursor0) {
        int v = cursor0.getColumnCount();
        int v1 = cursor0.getColumnIndex("display_name");
        batl.p(v1, v, "DisplayName index not found.");
        String s = cursor0.getString(v1);
        if(s == null) {
            return;
        }
        int v2 = cursor0.getColumnIndex("_id");
        batl.p(v2, v, "ContactId index not found for Name.");
        Long long0 = cursor0.getLong(v2);
        this.a.put(long0, s);
    }
}

