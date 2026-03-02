import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

public final class ifrx implements Key, PrivateKey {
    private transient iflp a;
    private transient idqy b;
    private static final long serialVersionUID = 1L;

    public ifrx(idvk idvk0) {
        this.a(idvk0);
    }

    private final void a(idvk idvk0) {
        this.b = idvk0.c;
        this.a = (iflp)ifoj.a(idvk0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ifrx) ? Arrays.equals(this.a.a(), ((ifrx)object0).a.a()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return "NH";
    }

    @Override
    public final byte[] getEncoded() {
        try {
            return ifok.a(this.a, this.b).u();
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override
    public final int hashCode() {
        short[] arr_v = this.a.a();
        if(arr_v == null) {
            return 0;
        }
        int v = arr_v.length;
        int v1;
        for(v1 = v + 1; true; v1 = v1 * 0x101 ^ arr_v[v] & 0xFF) {
            --v;
            if(v < 0) {
                break;
            }
        }
        return v1;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.a(idvk.d(((byte[])objectInputStream0.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

