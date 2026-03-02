import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class esut {
    public Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public esut() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }

    public final esus a(String s) {
        return (esus)this.a.get(s.toLowerCase(Locale.ENGLISH));
    }
}

