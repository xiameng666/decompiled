import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.chimera.modules.auth.blockstore.AppContextProvider;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class aizz implements aizv {
    public static final bboh a;
    private final Account b;
    private final azts c;

    static {
        aizz.a = aiqz.b("FolsomEncryptor");
    }

    public aizz(Account account0, azts azts0) {
        this.c = azts0;
        this.b = account0;
    }

    @Override  // aizv
    public final byte[] a(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            return aizz.d(this.e(), ByteString.copyFrom(arr_b));
        }
        throw new aizu("empty data to decrypt");
    }

    @Override  // aizv
    public final byte[] b(byte[] arr_b) {
        if(arr_b != null) {
            byte[] arr_b1 = this.e();
            try {
                byte[] arr_b2 = new byte[12];
                new SecureRandom().nextBytes(arr_b2);
                GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, arr_b2);
                SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b1, "AES");
                Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
                cipher0.init(1, secretKeySpec0, gCMParameterSpec0);
                return glwl.d(new byte[][]{arr_b2, cipher0.doFinal(arr_b)});
            }
            catch(NoSuchAlgorithmException | InvalidAlgorithmParameterException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException exception0) {
                throw new aizu("Can\'t encrypt with folsom keys", exception0);
            }
        }
        throw new aizu("Null data to encrypt");
    }

    public static azts c(long v) {
        Context context0 = AppContextProvider.a();
        ajqo ajqo0 = new ajqo();
        ajqo0.a = a.u(v, "single_device_snapshot/blockstore/");
        return new azts(context0, ajqo0.a());
    }

    private static byte[] d(byte[] arr_b, ByteString hfsf0) {
        try {
            if(hfsf0.size() < 12) {
                throw new BadPaddingException("Cyphertext is too short");
            }
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            ByteString hfsf1 = hfsf0.j(0, 12);
            ByteString hfsf2 = hfsf0.D(12);
            cipher0.init(2, secretKeySpec0, new GCMParameterSpec(0x80, hfsf1.toByteArray()));
            return cipher0.doFinal(hfsf2.toByteArray());
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new IllegalStateException(noSuchAlgorithmException0);
        }
        catch(BadPaddingException | NoSuchPaddingException | InvalidAlgorithmParameterException | IllegalBlockSizeException | InvalidKeyException exception0) {
            throw new aizu("Can\'t decrypt blockstore data", exception0);
        }
    }

    private final byte[] e() {
        List list0;
        try {
            list0 = (List)evrg.n(this.c.jx(this.b.name));
        }
        catch(InterruptedException | ExecutionException exception0) {
            throw new aizu("Can\'t get key material from folsom", exception0);
        }
        if(!list0.isEmpty()) {
            return ((SharedKey)gggq.p(list0)).b;
        }
        throw new aizu("Can\'t find any keys in folsom", 2);
    }
}

