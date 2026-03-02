import android.database.Cursor;
import j..util.Map.-EL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ekdl extends ekeo {
    public final Map a;
    public static final int b;
    private static final ggfp c;

    static {
        ekdl.c = ggfp.K("data1", "raw_contact_id");
    }

    public ekdl() {
        super("vnd.android.cursor.item/nickname");
        this.a = new HashMap();
    }

    @Override  // ekcc
    public final ggfp a() {
        return ekdl.c;
    }

    @Override  // ekcc
    public final void b(Cursor cursor0) {
        int v = cursor0.getColumnCount();
        int v1 = cursor0.getColumnIndex("data1");
        batl.p(v1, v, "Nickname index not found.");
        String s = cursor0.getString(v1);
        if(s != null) {
            int v2 = cursor0.getColumnIndex("raw_contact_id");
            batl.p(v2, v, "ContactId index not found.");
            long v3 = cursor0.getLong(v2);
            ekdi ekdi0 = new ekdi();
            ((List)Map.-EL.computeIfAbsent(this.a, Long.valueOf(v3), ekdi0)).add(s);
        }
    }
}

