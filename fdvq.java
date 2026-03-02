import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class fdvq {
    public final Lock a;
    public int b;
    public int c;
    public int d;
    public final ArrayList e;
    public int f;

    public fdvq() {
        this.a = new ReentrantLock();
        this.e = new ArrayList();
        this.f = 0;
    }
}

