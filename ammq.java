import j..util.function.Function.-CC;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.Function;

public final class ammq implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        int v3;
        int v1;
        DataInputStream dataInputStream0;
        int v;
        ghfu ghfu0;
        InputStream inputStream0;
        ByteString hfsf0 = (ByteString)object0;
        try {
            inputStream0 = hfsf0.newInput();
            ghfu0 = ghfu.a;
            gftb.z(ghfu0, "Funnel");
            v = -1;
        }
        catch(IOException unused_ex) {
            return null;
        }
        try {
            dataInputStream0 = new DataInputStream(inputStream0);
            v1 = dataInputStream0.readByte();
            v3 = dataInputStream0.readByte() & 0xFF;
            goto label_18;
        }
        catch(IOException iOException0) {
            throw iOException0;
        }
        catch(Exception exception0) {
        }
        int v2 = -1;
        v3 = -1;
        throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + v + " numHashFunctions: " + v3 + " dataLength: " + v2, exception0);
        try {
            v3 = dataInputStream0.readByte() & 0xFF;
            goto label_18;
        }
        catch(IOException iOException0) {
            throw iOException0;
        }
        catch(Exception exception0) {
        }
        v2 = -1;
        v3 = -1;
        v = v1;
        throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + v + " numHashFunctions: " + v3 + " dataLength: " + v2, exception0);
        try {
        label_18:
            v = dataInputStream0.readInt();
            ghfp ghfp0 = ghfp.values()[v1];
            ghfo ghfo0 = new ghfo(glul.a(v, 0x40L));
            for(int v4 = 0; true; ++v4) {
                if(v4 >= v) {
                    return new ghfn(ghfo0, v3, ghfu0, ghfp0);
                }
                long v5 = dataInputStream0.readLong();
                while(true) {
                    AtomicLongArray atomicLongArray0 = ghfo0.a;
                    long v6 = atomicLongArray0.get(v4);
                    long v7 = v6 | v5;
                    if(v6 == v7) {
                        break;
                    }
                    if(atomicLongArray0.compareAndSet(v4, v6, v7)) {
                        ghfo0.b.b(((long)(Long.bitCount(v7) - Long.bitCount(v6))));
                        break;
                    }
                }
            }
        }
        catch(IOException iOException0) {
        }
        catch(Exception exception0) {
            v2 = v;
            v = v1;
            throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + v + " numHashFunctions: " + v3 + " dataLength: " + v2, exception0);
        }
        try {
            throw iOException0;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

