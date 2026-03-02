import android.util.Log;
import java.util.HashMap;
import java.util.Map.Entry;

public final class ffec {
    public static final String[] a;

    static {
        ffec.a = new String[]{"event_type", "path", "data", "tags", "asset_key", "asset_id"};
    }

    public static void a(baks baks0, fdun fdun0) {
        if(Log.isLoggable("EventHolderBuilder", 3)) {
            Log.d("EventHolderBuilder", "addRowToHolder: " + fdun0);
        }
        Map.Entry map$Entry0 = null;
        for(Object object0: fdun0.b().entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object0;
            if(map$Entry0 == null) {
                baks0.a(ffec.b(fdun0, map$Entry1));
                map$Entry0 = map$Entry1;
                continue;
            }
            if(map$Entry1.getKey() == null) {
                throw new IllegalStateException("Cannot construct an asset row with null key for: " + fdun0);
            }
            HashMap hashMap0 = new HashMap();
            hashMap0.put("path", fdun0.c.toString());
            hashMap0.put("asset_key", map$Entry1.getKey());
            hashMap0.put("asset_id", ((fdpo)map$Entry1.getValue()).b);
            if(Log.isLoggable("EventHolderBuilder", 3)) {
                Log.d("EventHolderBuilder", "buildRowForAsset: " + hashMap0.toString());
            }
            baks0.a(hashMap0);
            continue;
        }
        if(map$Entry0 == null) {
            baks0.a(ffec.b(fdun0, null));
        }
    }

    private static HashMap b(fdun fdun0, Map.Entry map$Entry0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event_type", Integer.valueOf(1));
        hashMap0.put("path", fdun0.c.toString());
        hashMap0.put("data", fdun0.e);
        hashMap0.put("tags", "");
        if(map$Entry0 != null) {
            hashMap0.put("asset_id", ((fdpo)map$Entry0.getValue()).b);
            hashMap0.put("asset_key", map$Entry0.getKey());
        }
        if(Log.isLoggable("EventHolderBuilder", 3)) {
            Log.d("EventHolderBuilder", "buildRowForChangedDataItem: " + hashMap0.toString());
        }
        return hashMap0;
    }
}

