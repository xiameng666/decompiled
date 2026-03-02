import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class fusl {
    public final Map a;
    public final ArrayList b;

    public fusl() {
        this.a = new HashMap();
        this.b = new ArrayList();
    }

    public final String a(String s) {
        Map map0 = this.a;
        String s1 = (String)map0.get(s);
        if(s1 == null) {
            int v = map0.size();
            Character[] arr_character = fusm.a;
            Character[] arr_character1 = fusm.b;
            StringBuilder stringBuilder0 = new StringBuilder(3);
            if(v < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            while(v >= 0) {
                Character[] arr_character2 = stringBuilder0.length() == 0 ? arr_character : arr_character1;
                stringBuilder0.append(arr_character2[v % arr_character2.length].charValue());
                v = v / arr_character2.length - 1;
            }
            String s2 = stringBuilder0.toString();
            map0.put(s, s2);
            this.b.add(s);
            return s2;
        }
        return s1;
    }
}

