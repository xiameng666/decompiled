import java.util.ArrayList;
import java.util.List;

public final class fdpk {
    private final List a;
    private final int b;

    public fdpk() {
        this(20);
    }

    public fdpk(int v) {
        this.a = new ArrayList();
        this.b = v;
    }

    public final void a(String s) {
        List list0 = this.a;
        list0.add(0, a.r(s, ffmi.a(System.currentTimeMillis()), ", "));
        if(list0.size() > this.b) {
            list0.remove(list0.size() - 1);
        }
    }

    public final void b(String s, String s1) {
        this.a(a.r(s1, s, ": "));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; true; ++v) {
            List list0 = this.a;
            if(v >= list0.size()) {
                break;
            }
            stringBuilder0.append(((String)list0.get(v)));
            if(v < list0.size() - 1) {
                stringBuilder0.append("\n");
            }
        }
        return stringBuilder0.toString();
    }
}

