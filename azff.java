import android.util.Log;
import android.util.LruCache;
import j..util.Objects;
import java.io.IOException;

final class azff extends LruCache {
    final azfv a;

    public azff(azfv azfv0, int v) {
        Objects.requireNonNull(azfv0);
        this.a = azfv0;
        super(v);
    }

    @Override  // android.util.LruCache
    protected final void entryRemoved(boolean z, Object object0, Object object1, Object object2) {
        Integer integer0 = (Integer)object0;
        azfn azfn0 = (azfn)object1;
        azfn azfn1 = (azfn)object2;
        try {
            azfn0.close();
            if(azfn0.g < hram.b()) {
                azfq azfq0 = new azfq(azfn0.b.getName(), azfn0.g);
                this.a.h.put(integer0, azfq0);
            }
        }
        catch(IOException iOException0) {
            Log.e("CCTFlatFileLogStore", "Error closing evicted outputstream", iOException0);
        }
    }
}

