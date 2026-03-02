import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

final class ql {
    public int a;
    public float b;
    public float c;
    public float d;
    public int[] e;
    public boolean f;
    public final TextView g;
    public final Context h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public ql(TextView textView0) {
        this.a = 0;
        this.b = -1.0f;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = new int[0];
        this.f = false;
        this.g = textView0;
        this.h = textView0.getContext();
    }

    public final boolean a() {
        return !(this.g instanceof pf);
    }

    public static final int[] b(int[] arr_v) {
        if(arr_v.length != 0) {
            Arrays.sort(arr_v);
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                int v2 = arr_v[v1];
                if(v2 > 0) {
                    Integer integer0 = v2;
                    if(Collections.binarySearch(arrayList0, integer0) < 0) {
                        arrayList0.add(integer0);
                    }
                }
            }
            if(arr_v.length != arrayList0.size()) {
                int v3 = arrayList0.size();
                int[] arr_v1 = new int[v3];
                for(int v = 0; v < v3; ++v) {
                    arr_v1[v] = (int)(((Integer)arrayList0.get(v)));
                }
                return arr_v1;
            }
        }
        return arr_v;
    }
}

