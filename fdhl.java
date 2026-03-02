import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class fdhl extends bakp implements fceu {
    private final int d;

    public fdhl(DataHolder dataHolder0, int v, int v1) {
        super(dataHolder0, v);
        this.d = v1;
    }

    @Override  // fceu
    public final Uri a() {
        return Uri.parse(this.r("path"));
    }

    @Override  // fceu
    public final Map b() {
        int v = this.d;
        Map map0 = new HashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            fdhi fdhi0 = new fdhi(this.a, this.b + v1);
            if(fdhi0.a() != null) {
                map0.put(fdhi0.a(), fdhi0);
            }
        }
        return map0;
    }

    @Override  // fceu
    public final byte[] c() {
        return this.w("data");
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new fdhj(this);
    }

    @Override
    public final String toString() {
        boolean z = Log.isLoggable("DataItem", 3);
        byte[] arr_b = this.c();
        Map map0 = this.b();
        StringBuilder stringBuilder0 = new StringBuilder("DataItemRef{ ");
        stringBuilder0.append("uri=" + this.a());
        String s = arr_b == null ? "null" : ((int)arr_b.length);
        stringBuilder0.append(", dataSz=" + s.toString());
        stringBuilder0.append(a.aj(map0, ", numAssets="));
        if(z && !map0.isEmpty()) {
            stringBuilder0.append(", assets=[");
            String s1 = "";
            for(Object object0: map0.entrySet()) {
                stringBuilder0.append(s1 + ((String)((Map.Entry)object0).getKey()) + ": " + ((fcev)((Map.Entry)object0).getValue()).b());
                s1 = ", ";
            }
            stringBuilder0.append("]");
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }
}

