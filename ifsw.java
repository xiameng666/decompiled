import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;

public final class ifsw implements PrivateKey {
    private transient ifqu a;
    private transient idqg b;
    private transient idqy c;
    private static final long serialVersionUID = 0x76EA24CF15920952L;

    public ifsw(idvk idvk0) {
        this.a(idvk0);
    }

    private final void a(idvk idvk0) {
        this.c = idvk0.c;
        this.b = ifhv.a(idvk0.b.b).b.a;
        this.a = (ifqu)ifoj.a(idvk0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ifsw) && this.b.y(((ifsw)object0).b) && Arrays.equals(this.a.a(), ((ifsw)object0).a.a());
    }

    @Override
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override
    public final byte[] getEncoded() {
        try {
            return ifok.a(this.a, this.c).u();
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
        return this.b.hashCode() + iftq.a(this.a.a()) * 37;
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

