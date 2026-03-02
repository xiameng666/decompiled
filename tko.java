import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class tko extends tao {
    private static final long serialVersionUID = 1L;

    @Override  // tao
    public final tal a() {
        return ((szs)this.b).a(this);
    }

    @Override  // tao
    public final tar c() {
        return tar.i;
    }

    @Override  // tao
    public final tkm e(InputStream inputStream0) {
        tkm tkm0 = new tkm();
        tap.a(inputStream0, tkm0.a);
        byte[] arr_b = new byte[4];
        tap.a(inputStream0, arr_b);
        try {
            int v = inputStream0.available();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        int v1 = ByteBuffer.wrap(arr_b).getInt();
        if(v1 > v) {
            throw new IllegalArgumentException();
        }
        byte[] arr_b1 = new byte[v1];
        tap.a(inputStream0, arr_b1);
        tkm0.b = arr_b1;
        return tkm0;
    }
}

