import android.util.SparseIntArray;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import jeb.synthetic.TWR;

@Deprecated
public final class atiq implements athw {
    private static final aqql a;
    private final String b;
    private final SecretKey c;
    private final Cipher d;
    private final aqys e;

    static {
        atiq.a = new aqql(new String[]{"LegacyBackupFileDecryptorTaskImpl"});
    }

    public atiq(String s, SecretKey secretKey0, aqys aqys0) {
        try {
            this.d = Cipher.getInstance("AES/GCM/NoPadding");
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException exception0) {
            throw new aqli("AES/GCM/NoPadding not supported", exception0);
        }
        if(!hqjb.j()) {
            s = null;
        }
        this.b = s;
        this.c = secretKey0;
        this.e = aqys0;
    }

    @Override  // athw
    public final void a(File file0, atia atia0) {
        arah arah0;
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "r");
        try {
            randomAccessFile0.seek(randomAccessFile0.length() - 8L);
            long v = randomAccessFile0.readLong();
            long v1 = randomAccessFile0.length();
            if(Long.compare(v, v1) >= 0 || v < 0L) {
                this.e.v(23, 4, this.b);
                throw new atis(String.format(Locale.US, "%d is not valid position for chunks metadata in file of %d bytes", v, v1));
            }
            randomAccessFile0.seek(v);
            int v2 = (int)(randomAccessFile0.length() - 8L - v);
            byte[] arr_b = new byte[v2];
            randomAccessFile0.readFully(arr_b);
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)arah.a), arr_b, 0, v2, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                arah0 = (arah)hftv0;
            }
            catch(hfur unused_ex) {
                this.e.v(24, 4, this.b);
                throw new atis(String.format(Locale.US, "Could not read chunks metadata at position %d of file of %d bytes", v, v1));
            }
            arae arae0 = this.b(arah0);
            int v3 = arah0.d;
            arag arag0 = arag.a;
            if((arag.b(v3) == null ? arag.a : arag.b(v3)) == arag0 || (arag.b(v3) == null ? arag0 : arag.b(v3)) == arag.b) {
                atiq.a.d("Using explicit starts", new Object[0]);
                int[] arr_v = glwy.n(arae0.c);
                int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
                arr_v1[arr_v1.length - 1] = (int)v;
                Arrays.sort(arr_v1);
                SparseIntArray sparseIntArray0 = new SparseIntArray();
                int v4 = 0;
                while(v4 < arr_v1.length - 1) {
                    int v5 = arr_v1[v4];
                    ++v4;
                    sparseIntArray0.put(v5, arr_v1[v4] - v5);
                }
                int v7 = 0;
                for(int v6 = 0; v6 < sparseIntArray0.size(); ++v6) {
                    v7 = Math.max(v7, sparseIntArray0.valueAt(v6));
                }
                byte[] arr_b1 = new byte[v7];
                atia0.c();
                try {
                    for(Object object0: arae0.c) {
                        int v8 = (int)(((Integer)object0));
                        int v9 = sparseIntArray0.get(v8);
                        randomAccessFile0.seek(((long)v8));
                        randomAccessFile0.readFully(arr_b1, 0, v9);
                        atiq.d(atia0, this.c(arr_b1, v9, ((long)v8)));
                    }
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(atia0, throwable1);
                    throw throwable1;
                }
            }
            else {
                arag arag1 = arag.b(v3);
                if(arag1 != null) {
                    arag0 = arag1;
                }
                if(arag0 != arag.c) {
                    this.e.v(0x1F, 4, this.b);
                    throw new atix("Unknown chunk ordering type:" + (arag.b(arah0.d) == null ? arag.a : arag.b(arah0.d)).d);
                }
                atiq.a.d("Using inline lengths", new Object[0]);
                randomAccessFile0.seek(0L);
                atia0.c();
                while(true) {
                    try {
                        if(randomAccessFile0.getFilePointer() >= v) {
                            break;
                        }
                        long v10 = randomAccessFile0.getFilePointer();
                        int v11 = randomAccessFile0.readInt();
                        if(v11 <= 0) {
                            this.e.v(0x20, 4, this.b);
                            throw new atis("Encrypted chunk length not positive:" + v11);
                        }
                        if(((long)v11) + v10 > v) {
                            this.e.v(33, 4, this.b);
                            throw new atis(String.format(Locale.US, "Encrypted chunk longer (%d) than file (%d)", v11, v));
                        }
                        byte[] arr_b2 = new byte[v11];
                        randomAccessFile0.readFully(arr_b2);
                        atiq.d(atia0, this.c(arr_b2, v11, v10));
                    }
                    catch(Throwable throwable2) {
                        TWR.safeClose$NT(atia0, throwable2);
                        throw throwable2;
                    }
                }
            }
            atia0.close();
            if(!Arrays.equals(atia0.b(), arae0.d.toByteArray())) {
                this.e.v(15, 4, this.b);
                throw new atit();
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(randomAccessFile0, throwable0);
            throw throwable0;
        }
        randomAccessFile0.close();
    }

    private final arae b(arah arah0) {
        if((arac.b(arah0.f) == null ? arac.a : arac.b(arah0.f)) != arac.b) {
            this.e.v(21, 4, this.b);
            throw new atix("Unrecognized checksum type for backup (this version of backup only supports SHA-256): " + (arac.b(arah0.f) == null ? arac.a : arac.b(arah0.f)).c);
        }
        if((araj.b(arah0.c) == null ? araj.a : araj.b(arah0.c)) != araj.b) {
            this.e.v(22, 4, this.b);
            throw new atix("Unrecognized cipher type for backup (this version of backup only supports AES-256-GCM: " + (araj.b(arah0.c) == null ? araj.a : araj.b(arah0.c)).c);
        }
        try {
            GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, arah0.e.toByteArray(), 0, 12);
            this.d.init(2, this.c, gCMParameterSpec0);
        }
        catch(InvalidKeyException | InvalidAlgorithmParameterException exception0) {
            this.e.v(19, 4, this.b);
            throw new atgk("Could not initialize Cipher to decrypt ChunkOrdering", exception0);
        }
        try {
            byte[] arr_b = arah0.e.toByteArray();
            int v = arah0.e.size() - 12;
            byte[] arr_b1 = this.d.doFinal(arr_b, 12, v);
            return (arae)((ProtoLiteBuilder)((ProtoLiteMessage)arae.a).v_newBuilder().A(arr_b1, hftc.a())).N_build();
        }
        catch(IllegalBlockSizeException | BadPaddingException exception1) {
            this.e.v(20, 4, this.b);
            throw new atgk("Error finalizing decrypt Cipher on ChunkOrdering", exception1);
        }
    }

    private final byte[] c(byte[] arr_b, int v, long v1) {
        try {
            GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, arr_b, 0, 12);
            this.d.init(2, this.c, gCMParameterSpec0);
        }
        catch(InvalidKeyException | InvalidAlgorithmParameterException exception0) {
            this.e.v(17, 4, this.b);
            throw new atgk(String.format(Locale.US, "Unable to initialize Cipher for chunk at %d of %d bytes length", v1, v), exception0);
        }
        try {
            return this.d.doFinal(arr_b, 12, v - 12);
        }
        catch(IllegalBlockSizeException | BadPaddingException exception1) {
            this.e.v(18, 4, this.b);
            throw new atgk(String.format(Locale.US, "Unable to finalize Cipher for chunk at %d of %d bytes length", v1, v), exception1);
        }
    }

    private static final void d(atia atia0, byte[] arr_b) {
        atia0.a(new atjv(arr_b));
    }
}

