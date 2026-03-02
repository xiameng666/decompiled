import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

public final class svl implements iebr {
    private final Cipher a;

    public svl(Cipher cipher0) {
        this.a = cipher0;
    }

    @Override  // iebr
    public final int a() {
        return 16;
    }

    @Override  // iebr
    public final int b(byte[] arr_b, int v, byte[] arr_b1, int v1) {
        try {
            return this.a.update(arr_b, v, 16, arr_b1, v1);
        }
        catch(ShortBufferException shortBufferException0) {
            throw new stt("Crypto error", shortBufferException0);
        }
    }

    @Override  // iebr
    public final String c() {
        return "AES";
    }

    @Override  // iebr
    public final void d(boolean z, iebu iebu0) {
        try {
            int v = z ? 1 : 2;
            if((iebu0 instanceof iepq)) {
                IvParameterSpec ivParameterSpec0 = new IvParameterSpec(((iepq)iebu0).a);
                this.a.init(v, ((svm)((iepq)iebu0).b).a, ivParameterSpec0);
                return;
            }
            this.a.init(v, ((svm)iebu0).a);
        }
        catch(InvalidKeyException | InvalidAlgorithmParameterException exception0) {
            throw new stt("Could not initialize cipher", exception0);
        }
    }

    @Override  // iebr
    public final void e() {
    }
}

