import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class bcrd {
    public final String a;
    public final bcpz b;
    public int c;
    public Map d;
    public Map e;
    public String f;
    public List g;
    public ArrayList h;
    public List i;
    public boolean j;

    public bcrd(String s) {
        this.d = null;
        this.e = null;
        this.a = s;
        this.b = new bcpz(s);
        this.c = 0;
    }

    public final void a() {
        bhnd bhnd0 = this.b.b;
        if(bhnd0 != null) {
            bhnd0.close();
            bcpz.a.j("closed handle", new Object[0]);
        }
    }

    public final boolean b() {
        return this.c != 7 && this.c != 11;
    }
}

