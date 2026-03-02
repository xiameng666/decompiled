import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;

public final class ifsu implements PrivateKey {
    private transient idqg a;
    private transient ifqm b;
    private transient idqy c;
    private static final long serialVersionUID = 0x6A9C720EFA7851B3L;

    public ifsu(idvk idvk0) {
        this.a(idvk0);
    }

    private final void a(idvk idvk0) {
        this.c = idvk0.c;
        this.a = ifhw.a(idvk0.b.b).c.a;
        this.b = (ifqm)ifoj.a(idvk0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ifsu) && this.a.y(((ifsu)object0).a) && Arrays.equals(this.b.a(), ((ifsu)object0).b.a());
    }

    @Override
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override
    public final byte[] getEncoded() {
        try {
            return ifok.a(this.b, this.c).u();
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
        return this.a.hashCode() + iftq.a(this.b.a()) * 37;
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

