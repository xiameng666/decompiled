import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

public final class ifrg implements Key, PublicKey {
    private transient ifiv a;
    private transient String b;
    private transient byte[] c;
    private static final long serialVersionUID = 1L;

    public ifrg(idzh idzh0) {
        this.a(idzh0);
    }

    private final void a(idzh idzh0) {
        ifiv ifiv0 = (ifiv)ifpl.a(idzh0);
        this.a = ifiv0;
        this.b = ifuf.c(ifiv0.b.e);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ifrg) ? Arrays.equals(this.getEncoded(), ((ifrg)object0).getEncoded()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return this.b;
    }

    @Override
    public final byte[] getEncoded() {
        if(this.c == null) {
            this.c = ifsq.b(this.a);
        }
        return iftq.j(this.c);
    }

    @Override
    public final String getFormat() {
        return "X.509";
    }

    @Override
    public final int hashCode() {
        return iftq.a(this.getEncoded());
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.a(idzh.b(((byte[])objectInputStream0.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.getEncoded());
    }
}

