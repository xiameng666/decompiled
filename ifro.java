import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

public final class ifro implements Key, PrivateKey {
    private transient ifli a;
    private transient String b;
    private transient idqy c;
    private static final long serialVersionUID = 1L;

    public ifro(idvk idvk0) {
        this.a(idvk0);
    }

    private final void a(idvk idvk0) {
        this.c = idvk0.c;
        ifli ifli0 = (ifli)ifoj.a(idvk0);
        this.a = ifli0;
        this.b = ifuf.c(ifli0.b.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ifro) ? Arrays.equals(this.getEncoded(), ((ifro)object0).getEncoded()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return this.b;
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
        return iftq.a(this.getEncoded());
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

