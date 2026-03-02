import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public abstract class ifsp extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    private final idqg keyOid;
    private final Set keyOids;

    protected ifsp(idqg idqg0) {
        this.keyOid = idqg0;
        this.keyOids = null;
    }

    protected ifsp(Set set0) {
        this.keyOid = null;
        this.keyOids = set0;
    }

    private void checkAlgorithm(idqg idqg0) {
        idqg idqg1 = this.keyOid;
        if(idqg1 != null) {
            if(idqg1.y(idqg0)) {
                return;
            }
            throw new InvalidKeySpecException("incorrect algorithm OID for key: " + idqg0);
        }
        if(this.keyOids.contains(idqg0)) {
            return;
        }
        throw new InvalidKeySpecException("incorrect algorithm OID for key: " + idqg0);
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec keySpec0) {
        if((keySpec0 instanceof PKCS8EncodedKeySpec)) {
            byte[] arr_b = ((PKCS8EncodedKeySpec)keySpec0).getEncoded();
            try {
                idvk idvk0 = idvk.d(arr_b);
                this.checkAlgorithm(idvk0.b.a);
                return this.generatePrivate(idvk0);
            }
            catch(InvalidKeySpecException invalidKeySpecException0) {
                throw invalidKeySpecException0;
            }
            catch(IllegalStateException illegalStateException0) {
                throw new InvalidKeySpecException(illegalStateException0.getMessage());
            }
            catch(Exception exception0) {
                throw new InvalidKeySpecException(exception0.toString());
            }
        }
        throw new InvalidKeySpecException(dlbc.i(keySpec0, "Unsupported key specification: "));
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec keySpec0) {
        if((keySpec0 instanceof X509EncodedKeySpec)) {
            byte[] arr_b = ((X509EncodedKeySpec)keySpec0).getEncoded();
            try {
                idzh idzh0 = idzh.b(arr_b);
                this.checkAlgorithm(idzh0.a.a);
                return this.generatePublic(idzh0);
            }
            catch(InvalidKeySpecException invalidKeySpecException0) {
                throw invalidKeySpecException0;
            }
            catch(Exception exception0) {
                throw new InvalidKeySpecException(exception0.toString());
            }
        }
        throw new InvalidKeySpecException(a.O(keySpec0, "Unknown key specification: ", "."));
    }
}

