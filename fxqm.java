import com.google.android.gms.leveldb.WriteBatch;

public final class fxqm {
    public final WriteBatch a;
    public int b;

    public fxqm() {
        this.a = WriteBatch.create();
    }

    public final void a() {
        this.a.close();
    }

    public final void b(byte[] arr_b, byte[] arr_b1) {
        this.a.put(arr_b, arr_b1);
        ++this.b;
    }
}

