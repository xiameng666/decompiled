import android.util.Log;
import android.util.LruCache;
import j..util.Objects;
import java.io.File;
import java.io.IOException;

final class azfi extends LruCache {
    public azfi(azfv azfv0, int v) {
        Objects.requireNonNull(azfv0);
        super(v);
    }

    @Override  // android.util.LruCache
    protected final Object create(Object object0) {
        String s = (String)object0;
        try {
            byte[] arr_b = azfv.y(new File(s));
            if(arr_b == null) {
                Log.w("CCTLogStoreUtil", "Tried to deserialize a null PLC.");
                return null;
            }
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hlsi.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                return (hlsi)hftv0;
            }
            catch(hfur hfur0) {
                Log.w("CCTLogStoreUtil", "Couldn\'t parse PlayLoggerContext proto.", hfur0);
                return null;
            }
        }
        catch(IOException iOException0) {
            Log.e("CCTFlatFileLogStore", "Failed to read and parse PlayLoggerContext file " + s, iOException0);
            return null;
        }
    }
}

