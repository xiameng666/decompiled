import java.util.HashSet;
import java.util.Set;

public final class ekce {
    public final Set a;
    public long b;
    public boolean c;
    public boolean d;
    public String e;

    public ekce() {
        this.a = new HashSet();
    }

    public ekce(ekce ekce0) {
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.d = ekce0.d;
        this.c = ekce0.c;
        hashSet0.addAll(ekce0.a);
        this.b = ekce0.b;
        this.e = ekce0.e;
    }
}

