import java.security.Key;
import java.security.PublicKey;

public interface ieuo extends Key, PublicKey {
    byte[] getPublicData();
}

