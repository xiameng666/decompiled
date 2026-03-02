import java.io.PrintWriter;

public abstract class fwzh {
    public final fwyj a;
    public final fvtb b;
    protected boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    public fwzh(fwyj fwyj0, fvtb fvtb0) {
        this.b = fvtb0;
        this.a = fwyj0;
    }

    public gmcd a() {
        return gmbu.i(new fvuo(0));
    }

    public void b(PrintWriter printWriter0) {
        printWriter0.println("  scan_sched:unk=" + this.d + ", sch=" + this.e + ", unschBatch=" + this.g + ", unschOneShot=" + this.f);
    }

    public void c() {
        this.c = true;
    }

    public abstract void d(boolean arg1);

    public abstract boolean e(fwzl arg1, fwyc arg2);

    public final void f(fvtd fvtd0, int v) {
        if(this.c) {
            return;
        }
        fwzg fwzg0 = new fwzg(this, fvtd0, v);
        this.a.a.execute(fwzg0);
    }
}

