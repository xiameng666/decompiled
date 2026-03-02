import java.lang.ref.WeakReference;

abstract class azpw extends basd {
    private static final WeakReference a;
    private WeakReference b;

    static {
        azpw.a = new WeakReference(null);
    }

    public azpw(byte[] arr_b) {
        super(arr_b);
        this.b = azpw.a;
    }

    protected abstract byte[] a();

    @Override  // basd
    public final byte[] hy() {
        byte[] arr_b;
        synchronized(this) {
            arr_b = (byte[])this.b.get();
            if(arr_b == null) {
                arr_b = this.a();
                this.b = new WeakReference(arr_b);
            }
        }
        return arr_b;
    }
}

