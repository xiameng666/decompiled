import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.Set;

public final class fecy implements Runnable {
    public final fedp a;
    public final Set b;
    public final String c;

    public fecy(fedp fedp0, Set set0, String s) {
        this.a = fedp0;
        this.b = set0;
        this.c = s;
    }

    @Override
    public final void run() {
        Iterator iterator1;
        fecy fecy0 = this;
        for(Iterator iterator0 = fecy0.b.iterator(); iterator0.hasNext(); iterator0 = iterator1) {
            String s = fecy0.c;
            Object object0 = iterator0.next();
            fdpl fdpl0 = fecy0.a.h.a(s, ((fdpl)object0));
            fdvl fdvl0 = fecy0.a.c;
            SQLiteDatabase sQLiteDatabase0 = fdvl0.c.getReadableDatabase();
            sQLiteDatabase0.beginTransaction();
            try {
                Cursor cursor0 = sQLiteDatabase0.query("dataItemsAndAssets", fdxc.a, "packageName=? AND signatureDigest=? AND deleted=0", new String[]{fdpl0.b, fdpl0.d}, null, null, "seqId", null);
                sQLiteDatabase0.setTransactionSuccessful();
                if(cursor0 == null) {
                    iterator1 = iterator0;
                }
                else {
                    cursor0.moveToFirst();
                    while(!cursor0.isAfterLast()) {
                        fduq fduq0 = fdur.f(cursor0);
                        fdve fdve0 = new fdve(fdvl0, fduq0.a, fduq0.b.a, fduq0.b.b, fduq0.f);
                        fdvl0.f.add(fdve0);
                        iterator0 = iterator0;
                    }
                    iterator1 = iterator0;
                    ffmn.d("DataItems", "forceSyncDataItems - Force syncing %d data items for app %s", new Object[]{cursor0.getCount(), fdpl0});
                    cursor0.close();
                }
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            ffmn.a("AppCatalogService", "reconcileDataItems - Reconcile ENQUEUED for: - %s on %s", new Object[]{((fdpl)object0), s});
            fecy0 = this;
        }
    }
}

