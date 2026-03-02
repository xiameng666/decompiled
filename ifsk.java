import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

public final class ifsk implements Key, PublicKey {
    private transient idqg a;
    private transient ifny b;
    private static final long serialVersionUID = 1L;

    public ifsk(idzh idzh0) {
        this.a(idzh0);
    }

    private final void a(idzh idzh0) {
        this.a = ifhs.a(idzh0.a.b).a.a;
        this.b = (ifny)ifpl.a(idzh0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ifsk) && this.a.y(((ifsk)object0).a) && Arrays.equals(this.b.a(), ((ifsk)object0).b.a());
    }

    @Override
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override
    public final byte[] getEncoded() {
        try {
            return ifpn.a(this.b).u();
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override
    public final String getFormat() {
        return "X.509";
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + iftq.a(this.b.a()) * 37;
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

