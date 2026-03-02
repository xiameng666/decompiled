import java.util.List;

public final class eisx {
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    public eisx(String s, String s1, List list0) {
        this.a = s;
        String s2 = "external_ids#" + s1;
        this.c = s2;
        this.d = "__internal." + s2;
        this.b = list0;
    }
}

