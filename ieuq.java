import java.security.Key;
import java.security.PublicKey;

public interface ieuq extends Key, PublicKey {
    byte[] getPublicData();
}

