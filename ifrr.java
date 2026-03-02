import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

public final class ifrr implements Key, PrivateKey {
    private transient ifju a;
    private transient idqy b;
    private static final long serialVersionUID = 0x76EA24CF15920952L;

    public ifrr(idvk idvk0) {
        this.a(idvk0);
    }

    private final void a(idvk idvk0) {
        this.b = idvk0.c;
        this.a = (ifju)ifoj.a(idvk0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ifrr)) {
            ifrr ifrr0 = (ifrr)object0;
            try {
                return Arrays.equals(this.a.u(), ifrr0.a.u());
            }
            catch(IOException unused_ex) {
                throw new IllegalStateException("unable to perform equals");
            }
        }
        return false;
    }

    @Override
    public final String getAlgorithm() {
        return "LMS";
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
        try {
            return iftq.a(this.a.u());
        }
        catch(IOException unused_ex) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
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

