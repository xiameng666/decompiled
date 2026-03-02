import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import jeb.synthetic.FIN;

public final class fvsw {
    private final SecretKeySpec a;
    private final Mac b;
    private final Cipher c;

    private fvsw(byte[] arr_b, byte[] arr_b1, fybc fybc0) {
        Cipher cipher0;
        this.a = new SecretKeySpec(arr_b, "AES");
        if(fybc0 == null) {
            fybb.b();
        }
        this.b = fvsw.e(arr_b1);
        try {
            cipher0 = null;
            cipher0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        }
        catch(GeneralSecurityException unused_ex) {
        }
        this.c = cipher0;
    }

    public final fvsv a(DataInputStream dataInputStream0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Mac mac0 = this.b;
        if(mac0 != null) {
            int v1 = dataInputStream0.readInt();
            if(v1 <= 0x200000 && v1 >= 0) {
                byte[] arr_b = fvsw.f(dataInputStream0, 20);
                if(arr_b != null && arr_b.length == 20) {
                    byte[] arr_b1 = fvsw.f(dataInputStream0, 16);
                    if(arr_b1 != null && arr_b1.length == 16) {
                        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b1);
                        byte[] arr_b2 = fvsw.f(dataInputStream0, v1);
                        if(arr_b2 != null && arr_b2.length == v1) {
                            int v2 = arr_b2.length + 40;
                            if(Arrays.equals(mac0.doFinal(arr_b2), arr_b)) {
                                fvsv fvsv0 = new fvsv(v2, this.d(arr_b2, ivParameterSpec0, 2));
                                FIN.finallyCodeBegin$NT(v);
                                return fvsv0;
                            }
                            throw new IOException("HMAC does not match.");
                        }
                        throw new IOException("Unable to read ciphertext.");
                    }
                    throw new IOException("Unable to read IV.");
                }
                throw new IOException("Unable to read HMAC.");
            }
            throw new IOException(String.format("Invalid data length or too long: %d bytes.", v1));
        }
        throw new IOException("Unable to create HMAC generator.");
    }

    public static fvsw b(byte[] arr_b, fybc fybc0) {
        if(arr_b != null && arr_b.length == 0x20) {
            return new fvsw(Arrays.copyOf(arr_b, 16), Arrays.copyOfRange(arr_b, 16, 0x20), fybc0);
        }
        throw new IllegalArgumentException("Cipher & Signing Key must be 32 bytes.");
    }

    public final void c(DataOutputStream dataOutputStream0, byte[] arr_b) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Mac mac0 = this.b;
        if(mac0 != null) {
            if(arr_b != null && arr_b.length <= 0x200000) {
                byte[] arr_b1 = new byte[16];
                new SecureRandom().nextBytes(arr_b1);
                IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b1);
                byte[] arr_b2 = this.d(arr_b, ivParameterSpec0, 1);
                byte[] arr_b3 = mac0.doFinal(arr_b2);
                dataOutputStream0.writeInt(arr_b2.length);
                dataOutputStream0.write(arr_b3);
                dataOutputStream0.write(ivParameterSpec0.getIV());
                dataOutputStream0.write(arr_b2);
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            throw new IOException("Invalid data: data is empty or too long.");
        }
        throw new IOException("Unable to create HMAC, data can not be signed.");
    }

    private final byte[] d(byte[] arr_b, IvParameterSpec ivParameterSpec0, int v) {
        Cipher cipher0 = this.c;
        if(cipher0 != null) {
            try {
                cipher0.init(v, this.a, ivParameterSpec0);
                return cipher0.doFinal(arr_b);
            }
            catch(GeneralSecurityException unused_ex) {
                throw new IOException("Failed to encrypt or decrypt.");
            }
        }
        throw new IOException("Unable to create cipher.");
    }

    private static Mac e(byte[] arr_b) {
        int v = 0;
        while(v < 2) {
            try {
                Mac mac0 = Mac.getInstance("HmacSHA1");
                mac0.init(new SecretKeySpec(arr_b, "HmacSHA1"));
                return mac0;
            }
            catch(NoSuchAlgorithmException unused_ex) {
                ++v;
            }
            catch(InvalidKeyException unused_ex) {
                return null;
            }
        }
        return null;
    }

    private static final byte[] f(InputStream inputStream0, int v) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[v];
        try {
            while(v > 0) {
                int v1 = inputStream0.read(arr_b, 0, v);
                if(v1 < 0) {
                    break;
                }
                byteArrayOutputStream0.write(arr_b, 0, v1);
                v -= v1;
            }
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException unused_ex) {
            return null;
        }
    }
}

