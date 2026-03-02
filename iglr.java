import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class iglr implements Iterable {
    public final ArrayList a;
    private final HashMap b;

    public iglr(Map map0) {
        this.b = new HashMap();
        this.a = new ArrayList();
        String s = (String)map0.get("cookie");
        if(s != null) {
            String[] arr_s = s.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                String[] arr_s1 = arr_s[v].trim().split("=");
                if(arr_s1.length == 2) {
                    this.b.put(arr_s1[0], arr_s1[1]);
                }
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.b.keySet().iterator();
    }
}

