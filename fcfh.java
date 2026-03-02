import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.List;

public final class fcfh {
    public final fcez a;
    private final PutDataRequest b;

    private fcfh(PutDataRequest putDataRequest0) {
        this.b = putDataRequest0;
        this.a = new fcez();
    }

    public static fcfh a(String s) {
        return new fcfh(PutDataRequest.a(s));
    }

    public final PutDataRequest b() {
        ffmg ffmg0 = ffmh.b(this.a);
        PutDataRequest putDataRequest0 = this.b;
        putDataRequest0.c = ffmg0.a.toBytesArray();
        List list0 = ffmg0.b;
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            String s = Integer.toString(v1);
            Asset asset0 = (Asset)list0.get(v1);
            if(s == null) {
                throw new IllegalStateException("asset key cannot be null: " + asset0);
            }
            if(asset0 == null) {
                throw new IllegalStateException("asset cannot be null: key=" + s);
            }
            if(Log.isLoggable("DataMap", 3)) {
                Log.d("DataMap", a.q(s, asset0, "asPutDataRequest: adding asset: ", " "));
            }
            putDataRequest0.d(s, asset0);
            ++v1;
            continue;
        }
        return putDataRequest0;
    }
}

