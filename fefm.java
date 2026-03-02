import android.os.Message;
import java.util.Vector;

final class fefm {
    private final Vector a;
    private int b;
    private int c;
    private int d;

    public fefm() {
        this.a = new Vector();
        this.b = 20;
        this.c = 0;
        this.d = 0;
    }

    final int a() {
        synchronized(this) {
        }
        return this.a.size();
    }

    final fefl b(int v) {
        fefl fefl0;
        synchronized(this) {
            int v2 = this.c + v;
            int v3 = this.b;
            if(v2 >= v3) {
                v2 -= v3;
            }
            if(v2 >= this.a()) {
                return null;
            }
            fefl0 = (fefl)this.a.get(v2);
        }
        return fefl0;
    }

    final void c() {
        synchronized(this) {
            this.c = 0;
            this.a.clear();
        }
    }

    final void d(fefp fefp0, Message message0, fefk fefk0, fefk fefk1) {
        synchronized(this) {
            ++this.d;
            Vector vector0 = this.a;
            if(vector0.size() < this.b) {
                vector0.add(new fefl(fefp0, message0, fefk0, fefk1));
                return;
            }
            fefl fefl0 = (fefl)vector0.get(this.c);
            int v1 = this.c + 1;
            this.c = v1;
            if(v1 >= this.b) {
                this.c = 0;
            }
            fefl0.a(fefp0, message0, fefk0, fefk1);
        }
    }

    final void e() {
        synchronized(this) {
            this.b = 50;
            this.d = 0;
            this.c();
        }
    }
}

