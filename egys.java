import android.content.Context;
import android.database.Cursor;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

public final class egys {
    public final Context a;

    public egys(Context context0) {
        this.a = context0;
    }

    public final int a() {
        Set set0 = this.c();
        int v = 0;
        if(!set0.isEmpty()) {
            ehbp ehbp0 = new ehbp(this.a.getContentResolver(), null, gfsx.m(egzl.b));
            Map map0 = egyz.a(this.a).b();
            for(Object object0: ehfr.c(egys.d(set0), this.a, ehbp0)) {
                if(!map0.containsKey(ehbl.a(((ehge)object0).b))) {
                    ++v;
                }
            }
        }
        return v;
    }

    public final int b() {
        return this.c().size();
    }

    public final Set c() {
        Set set0 = new HashSet();
        try(Cursor cursor0 = cclu.b(this.a.getContentResolver(), "content://com.android.contacts/raw_contacts", new String[]{"_id", "account_type", "data_set"}, "account_type!= \"com.google\" AND deleted=0", null, null)) {
            efpm efpm0 = efpb.c(this.a).d(EnumSet.of(efpa.f, efpa.c));
            if(cursor0 != null) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    long v = cursor0.getLong(0);
                    if(efpm0.a(cursor0.getString(1), cursor0.getString(2)).c == efoy.e) {
                        set0.add(Long.valueOf(v));
                    }
                }
                return set0;
            }
            TWR.useResource$NT(null);
            throw new cjuh(13, "Failed to query sim contact count: NULL cursor");
        }
        catch(IOException unused_ex) {
            egig.b("FSA2_SimContactsCounter", "Failed to query sim contact count: Cannot create classifier.");
            return set0;
        }
    }

    public static final String d(Set set0) {
        return a.T(set0, "_id IN (", ",", ")");
    }
}

