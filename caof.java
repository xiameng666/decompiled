import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import j..util.Objects;
import java.util.List;
import jeb.synthetic.FIN;

final class caof implements evqf {
    final List a;
    final gmcu b;
    final caoh c;

    public caof(caoh caoh0, List list0, gmcu gmcu0) {
        this.a = list0;
        this.b = gmcu0;
        Objects.requireNonNull(caoh0);
        this.c = caoh0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        SQLiteDatabase sQLiteDatabase0;
        Void void0 = (Void)object0;
        List list0 = this.a;
        this.c.d.b(list0.size());
        this.b.q(Boolean.valueOf(true));
        int v = 0;
        try {
            sQLiteDatabase0 = this.c.c.b.getWritableDatabase();
        }
        catch(SQLiteException unused_ex) {
            goto label_24;
        }
        sQLiteDatabase0.beginTransaction();
        int v1 = FIN.finallyOpen$NT();
        if(((long)list0.size()) <= huhz.d()) {
            String[] arr_s = new String[list0.size()];
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("_ID");
            stringBuilder0.append(" IN (");
            while(v < list0.size()) {
                arr_s[v] = Long.toString(((Long)list0.get(v)).longValue());
                stringBuilder0.append((v == 0 ? "?" : ", ?"));
                ++v;
            }
            stringBuilder0.append(")");
            v = sQLiteDatabase0.delete("IntermediateStore", stringBuilder0.toString(), arr_s);
            sQLiteDatabase0.setTransactionSuccessful();
            FIN.finallyCodeBegin$NT(v1);
        label_24:
            List list1 = this.a;
            if(v != list1.size()) {
                ((ggtj)((ggtj)caoh.a.i()).ar(5997)).F("Intermediate store ids deletion failed: ids deleted: %d, ids should have been deleted: %d", v, list1.size());
                cakj.a().c(18);
            }
            return;
        }
        throw new IllegalArgumentException("The ids size exceeds max allowed size " + huhz.d() + ": " + list0.size());
    }
}

