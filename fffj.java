import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class fffj implements Runnable {
    public final ffgm a;

    public fffj(ffgm ffgm0) {
        this.a = ffgm0;
    }

    @Override
    public final void run() {
        HashSet hashSet2;
        fdvl fdvl0;
        ffgm ffgm0 = this.a;
        List list0 = ffgm0.getPackageManager().getInstalledPackages(0);
        HashSet hashSet0 = new HashSet();
        for(Object object0: list0) {
            hashSet0.add(((PackageInfo)object0).packageName);
        }
        if(ffgp.k()) {
            hashSet0.add("com.google.android.wearable.app");
            hashSet0.add("com.google.android.gms");
        }
        String s = ffgm0.G.f();
        if(s != null) {
            hashSet0.add(s);
        }
        ffew ffew0 = ffgm0.H;
        HashSet hashSet1 = new HashSet();
        for(Object object1: ffew0.i.values()) {
            for(Object object2: ((Set)object1)) {
                hashSet1.add(((fdpl)object2).b);
            }
        }
        hashSet0.addAll(hashSet1);
        fdvl0 = fdvl.m();
        SQLiteDatabase sQLiteDatabase0 = fdvl0.c.getWritableDatabase();
        hashSet2 = new HashSet(hashSet0);
        try(Cursor cursor0 = sQLiteDatabase0.query(true, "dataItemsAndAssets", new String[]{"packageName"}, "deleted=0", null, null, null, null, null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                String s1 = cursor0.getString(0);
                batl.s(s1);
                hashSet2.add(s1);
            }
        }
        hashSet2.removeAll(hashSet0);
        for(Object object3: hashSet2) {
            fdvl0.H(((String)object3));
        }
    }
}

