import java.util.Deque;
import java.util.LinkedList;

public final class hmlf {
    public int a;
    public char[] b;
    final Deque c;
    final Deque d;
    final Deque e;
    boolean f;
    boolean g;
    boolean h;
    int i;
    hmle j;
    final hmlg k;
    int l;
    int m;
    final hmkj n;
    final hmkk o;
    final hmqm p;

    public hmlf(hmlg hmlg0, hmqm hmqm0, String s) {
        this.a = 0;
        this.c = new LinkedList();
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = 0;
        this.l = 0;
        this.m = 0;
        this.k = hmlg0;
        this.b = s.trim().toCharArray();
        this.n = new hmkj(hmlg0, hmqm0);
        this.o = new hmkk(hmlg0, hmqm0);
        this.p = hmqm0;
    }

    public final hmlj a() {
        return (hmlj)this.j.g.peek();
    }

    public final void b() {
        while(true) {
            Deque deque0 = this.c;
            if(deque0.isEmpty() || ((String)deque0.peek()).equals("(")) {
                break;
            }
            Deque deque1 = this.d;
            if(deque1.size() <= 1) {
                break;
            }
            String s = (String)deque0.pop();
            hmli hmli0 = (hmli)deque1.pop();
            hmli hmli1 = (hmli)deque1.pop();
            hmli hmli2 = this.o.a(s, hmli0, hmli1);
            this.c(s, hmli2);
            deque1.push(hmli2);
        }
    }

    public final void c(String s, hmli hmli0) {
        if(hmli0.b) {
            hmlh hmlh0 = new hmlh(s, hmli0.d, this.a + 1);
            this.e.push(hmlh0);
            hmli0.e = hmlh0;
            return;
        }
        this.e.clear();
    }

    public final boolean d() {
        int v = this.a + 1;
        return v < this.b.length && this.b[v] == 46;
    }

    public static void e(StringBuilder stringBuilder0, hmli hmli0) {
        if(hmli0 != null) {
            Object object0 = hmli0.a;
            if(object0 != null) {
                stringBuilder0.append(object0.toString());
                return;
            }
        }
        stringBuilder0.append("null");
    }

    public static final int f(String s) {
        switch(s.hashCode()) {
            case 37: {
                return s.equals("%") ? 4 : 0;
            }
            case 38: {
                return s.equals("&") ? 4 : 0;
            }
            case 42: {
                return s.equals("*") ? 4 : 0;
            }
            case 43: {
                return s.equals("+") ? 4 : 0;
            }
            case 45: {
                return s.equals("-") ? 4 : 0;
            }
            case 0x2F: {
                return s.equals("/") ? 4 : 0;
            }
            case 60: {
                return s.equals("<") ? 3 : 0;
            }
            case 62: {
                return s.equals(">") ? 3 : 0;
            }
            case 94: {
                return s.equals("^") ? 4 : 0;
            }
            case 0x7C: {
                return s.equals("|") ? 4 : 0;
            }
            case 1084: {
                return s.equals("!=") ? 3 : 0;
            }
            case 0x7A0: {
                return s.equals("==") ? 3 : 0;
            }
            case 0xDE3: {
                return s.equals("or") ? 2 : 0;
            }
            case 96727: {
                return s.equals("and") ? 2 : 0;
            }
            case 0x364E1D: {
                return s.equals("then") ? 1 : 0;
            }
            default: {
                return 0;
            }
        }
    }
}

