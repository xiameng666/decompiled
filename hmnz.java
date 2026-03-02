import java.util.Arrays;

public abstract class hmnz {
    protected byte[] a;
    public boolean b;
    public hmoe c;

    public hmnz() {
        this.c = new hmoe();
    }

    public void a(hmoe hmoe0) {
        throw null;
    }

    public final int b() {
        return this.c.c;
    }

    public final int c() {
        int v = this.c.i;
        if(v == 1) {
            return 0;
        }
        switch(v) {
            case 2: {
                return 1;
            }
            case 3: {
                return 3;
            }
            default: {
                return -1;
            }
        }
    }

    public final int d() {
        return this.c.b;
    }

    public final int e() {
        return this.c.d;
    }

    public final int f() {
        return this.c.a.length;
    }

    public abstract int g();

    public hmoe h() {
        return this.c.a();
    }

    public void i(hmno hmno0) {
        System.arraycopy(this.c.a, 0, this.a, 0, this.c.a.length);
        this.b = false;
    }

    public final void j(int v, byte[] arr_b) {
        System.arraycopy(arr_b, 0, this.a, v, arr_b.length);
        this.b = true;
    }

    public final byte[] k(int v, int v1) {
        return Arrays.copyOfRange(this.c.a, v, v1 + v);
    }

    public final int l() {
        return this.c.i;
    }

    public abstract void m(boolean arg1, hmno arg2);
}

