import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

public final class ifsh implements Key, PublicKey {
    private transient ifnv a;
    private static final long serialVersionUID = 1L;

    public ifsh(idzh idzh0) {
        this.a(idzh0);
    }

    private final void a(idzh idzh0) {
        this.a = (ifnv)ifpl.a(idzh0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ifsh) ? Arrays.equals(this.a.a(), ((ifsh)object0).a.a()) : false;
    }

    @Override
    public final String getAlgorithm() {
        return ifuf.c(this.a.b.S);
    }

    @Override
    public final byte[] getEncoded() {
        try {
            return ifpn.a(this.a).u();
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
        return iftq.a(this.a.a());
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

