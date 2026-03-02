import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;

public abstract class fvor extends fvnr {
    protected static volatile boolean a = false;
    protected static volatile AudioRecord b;
    protected static volatile Thread c;
    public final Context d;
    private static volatile Object e;

    static {
        fvor.e = new Object();
    }

    public fvor(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0) {
        super(fvls0, fvlt0, fybc0);
        gftb.check(context0);
        this.d = context0;
        fvor.a = false;
    }

    protected abstract int a();

    @Override  // fvnr
    protected final void b() {
        synchronized(fvor.e) {
            if(fvor.a) {
                return;
            }
            if(fvor.b != null) {
                return;
            }
            int v1 = this.f() * 2000 / 1000 * this.e();
            int v2 = AudioRecord.getMinBufferSize(this.f(), 16, this.a());
            if(v2 != -2 && v2 != -1) {
                fvor.a = true;
                fvor.c = new Thread(new fvop(this, Math.max(v1 * 4, v2)), "Audio Thread");
                fvor.c.setPriority(4);
                fvor.c.start();
            }
        }
    }

    @Override  // fvnr
    protected final void c() {
        synchronized(fvor.e) {
            fvor.a = false;
            try {
                synchronized(fvor.c) {
                    fvor.c.notifyAll();
                }
                fvor.c.join();
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }

    protected abstract int d();

    protected abstract int e();

    protected abstract int f();

    protected abstract AudioFormat g();

    protected abstract boolean h(int arg1, int arg2, long arg3);
}

