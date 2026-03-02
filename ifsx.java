import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;

public final class ifsx implements PublicKey {
    private transient ifqw a;
    private transient idqg b;
    private static final long serialVersionUID = 0xB20AC9535BF5C7DAL;

    public ifsx(idzh idzh0) {
        this.a(idzh0);
    }

    private final void a(idzh idzh0) {
        ifqw ifqw0 = (ifqw)ifpl.a(idzh0);
        this.a = ifqw0;
        this.b = ifsy.a(ifqw0.b);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ifsx)) {
            ifsx ifsx0 = (ifsx)object0;
            try {
                if(this.b.y(ifsx0.b) && Arrays.equals(this.a.a(), ifsx0.a.a())) {
                    return true;
                }
            }
            catch(IOException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public final String getAlgorithm() {
        return "XMSS";
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
        try {
            return this.b.hashCode() + iftq.a(this.a.a()) * 37;
        }
        catch(IOException unused_ex) {
            return this.b.hashCode();
        }
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

