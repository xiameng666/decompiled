import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import j..util.Map.-EL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ekdz extends ekeo {
    public final Map a;
    public static final int b;
    private static final ggfp c;
    private final Context e;

    static {
        ekdz.c = ggfp.M("data1", "data2", "data3", "raw_contact_id");
    }

    public ekdz(Context context0) {
        super("vnd.android.cursor.item/phone_v2");
        this.a = new HashMap();
        this.e = context0;
    }

    @Override  // ekcc
    public final ggfp a() {
        return ekdz.c;
    }

    @Override  // ekcc
    public final void b(Cursor cursor0) {
        int v = cursor0.getColumnCount();
        int v1 = cursor0.getColumnIndex("data1");
        batl.p(v1, v, "Phone Address index not found.");
        String s = cursor0.getString(v1);
        Resources resources0 = this.e.getResources();
        int v2 = cursor0.getColumnIndex("data2");
        batl.p(v2, v, "Phone Type index not found.");
        String s1 = ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources0, cursor0.getInt(v2), "data3").toString();
        int v3 = cursor0.getColumnIndex("raw_contact_id");
        batl.p(v3, v, "RawContactId index not found.");
        long v4 = cursor0.getLong(v3);
        if(s == null) {
            return;
        }
        ekdr ekdr0 = new ekdr();
        ekdx ekdx0 = new ekdx(s, s1, v4);
        ((List)Map.-EL.computeIfAbsent(this.a, Long.valueOf(v4), ekdr0)).add(ekdx0);
    }
}

