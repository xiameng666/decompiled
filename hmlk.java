import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class hmlk {
    public final Map a;
    public final Deque b;

    public hmlk() {
        this.a = new HashMap();
        this.b = new LinkedList();
    }

    public final hmle a() {
        return this.b.isEmpty() ? null : ((hmle)this.b.peek());
    }

    public final hmli b(String s) {
        hmkd hmkd0 = (hmkd)this.a.get(s);
        return hmkd0 == null ? null : hmkd0.a();
    }
}

