import java.util.LinkedList;

public final class fuuq {
    protected final LinkedList a;
    public final LinkedList b;
    public long c;
    public final fuwz d;
    public final fuuo e;
    public final fuup f;

    public fuuq() {
        this.d = new fuwz();
        this.c = -1L;
        this.b = new LinkedList();
        this.a = new LinkedList();
        this.e = new fuuo();
        this.f = new fuup();
    }

    public final boolean a(long v) {
        LinkedList linkedList0 = this.b;
        linkedList0.addLast(Long.valueOf(v));
        boolean z = false;
        if(linkedList0.size() >= 2 && v - ((long)(((Long)linkedList0.getFirst()))) >= 110000L) {
            z = true;
        }
        while(((long)(((Long)linkedList0.getFirst()))) + 200000L < v) {
            linkedList0.removeFirst();
        }
        return z;
    }
}

