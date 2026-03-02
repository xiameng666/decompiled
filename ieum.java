import java.security.Key;
import java.security.PublicKey;

public interface ieum extends Key, PublicKey {
    byte[] getPointEncoding();
}

