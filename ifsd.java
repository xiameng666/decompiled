import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

public final class ifsd implements Key, PrivateKey {
    private transient ifmf a;
    private transient idqy b;
    private static final long serialVersionUID = 1L;

    public ifsd(idvk idvk0) {
        this.a(idvk0);
    }

    private final void a(idvk idvk0) {
        this.b = idvk0.c;
        this.a = (ifmf)ifoj.a(idvk0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ifsd) ? Arrays.equals(this.a.a(), ((ifsd)object0).a.a()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return "Picnic";
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
        return iftq.a(this.a.a());
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

