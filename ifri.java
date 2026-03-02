import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

public final class ifri implements Key, PrivateKey {
    private transient ifiz a;
    private transient String b;
    private transient byte[] c;
    private transient idqy d;
    private static final long serialVersionUID = 1L;

    public ifri(idvk idvk0) {
        this.a(idvk0);
    }

    private final void a(idvk idvk0) {
        ifiz ifiz0 = (ifiz)ifoj.a(idvk0);
        this.d = idvk0.c;
        this.a = ifiz0;
        this.b = ifuf.c(ifiz0.b.c);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ifri) ? Arrays.equals(this.getEncoded(), ((ifri)object0).getEncoded()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return this.b;
    }

    @Override
    public final byte[] getEncoded() {
        if(this.c == null) {
            this.c = ifsq.a(this.a, this.d);
        }
        return iftq.j(this.c);
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

