import java.util.List;
import java.util.Locale;

public class gbcg {
    public final MessageLite a;
    public int[] b;
    private int[] c;

    public gbcg(MessageLite hfvm0) {
        this.a = hfvm0;
    }

    public MessageLite a(MessageLite hfvm0, int v) {
        throw gbcg.m("getSubProperty", v, hfvm0);
    }

    public boolean b(MessageLite hfvm0, int v) {
        throw gbcg.m("hasField", v, hfvm0);
    }

    protected int[] c() {
        return new int[0];
    }

    public float d(MessageLite hfvm0, int v) {
        throw gbcg.m("getFloat", v, hfvm0);
    }

    public int e(MessageLite hfvm0, int v) {
        throw gbcg.m("getInt", v, hfvm0);
    }

    public MessageLite f(MessageLite hfvm0, int v) {
        throw gbcg.m("getProto", v, hfvm0);
    }

    public Object g(MessageLite hfvm0, int v) {
        throw gbcg.m("getEnum", v, hfvm0);
    }

    public List h(MessageLite hfvm0, int v) {
        throw gbcg.m("getList", v, hfvm0);
    }

    public int[] i() {
        return new int[0];
    }

    public final int[] j() {
        if(this.c == null) {
            this.c = this.c();
        }
        return this.c;
    }

    public boolean k(MessageLite hfvm0) {
        throw gbcg.m("getBoolean", 4, hfvm0);
    }

    public String l(MessageLite hfvm0) {
        throw gbcg.m("getString", 1, hfvm0);
    }

    private static IllegalArgumentException m(String s, int v, MessageLite hfvm0) {
        return new IllegalArgumentException(String.format(Locale.US, "%s does not support %s for fieldNumber: %d", hfvm0.getClass().getName(), s, v));
    }
}

