import java.nio.ByteBuffer;

public abstract class armj {
    private boolean a;
    private armi b;

    public armj() {
        this.a = false;
    }

    protected abstract int a(byte[] arg1, int arg2, int arg3);

    protected void c() {
    }

    protected abstract void d(byte[] arg1, int arg2, int arg3);

    public final ByteBuffer e(int v) {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v);
        for(int v1 = 0; v1 < v; v1 += this.a(byteBuffer0.array(), v1, v - v1)) {
        }
        return byteBuffer0;
    }

    final void f(armi armi0) {
        synchronized(this) {
            if(this.a) {
                ((armp)armi0).u();
                return;
            }
            this.b = armi0;
        }
    }

    final void g() {
        synchronized(this) {
            if(!this.a) {
                this.a = true;
                this.c();
                armi armi0 = this.b;
                if(armi0 != null) {
                    ((armp)armi0).u();
                }
            }
        }
    }
}

