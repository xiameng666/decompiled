import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;

public final class ifsv implements PublicKey {
    private transient idqg a;
    private transient ifqo b;
    private static final long serialVersionUID = 3230324130542413475L;

    public ifsv(idzh idzh0) {
        this.a(idzh0);
    }

    private final void a(idzh idzh0) {
        ifqo ifqo0 = (ifqo)ifpl.a(idzh0);
        this.b = ifqo0;
        this.a = ifsy.a(ifqo0.b);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ifsv) && this.a.y(((ifsv)object0).a) && Arrays.equals(this.b.c(), ((ifsv)object0).b.c());
    }

    @Override
    public final String getAlgorithm() {
        return "XMSSMT";
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
        return this.a.hashCode() + iftq.a(this.b.c()) * 37;
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

