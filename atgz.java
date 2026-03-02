import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

public final class atgz {
    public static athh a(arah arah0, long v, atfv atfv0, aqys aqys0) {
        arae arae0 = atgz.b(arah0.e, atfv0, aqys0);
        if((araj.b(arah0.c) == null ? araj.a : araj.b(arah0.c)) != araj.b) {
            aqys0.y(22);
            throw new athc("Unsupported CipherType: " + (araj.b(arah0.c) == null ? araj.a : araj.b(arah0.c)).c);
        }
        int v1 = arah0.d;
        arag arag0 = arag.a;
        if((arag.b(v1) == null ? arag.a : arag.b(v1)) != arag0 && (arag.b(v1) == null ? arag0 : arag.b(v1)) != arag.b) {
            arag arag1 = arag.b(v1);
            if(arag1 != null) {
                arag0 = arag1;
            }
            throw new athc("Unsupported ChunkOrderingType: " + arag0.d);
        }
        if((arac.b(arah0.f) == null ? arac.a : arac.b(arah0.f)) != arac.b) {
            aqys0.y(21);
            throw new athc("Unsupported ChecksumType: " + (arac.b(arah0.f) == null ? arac.a : arac.b(arah0.f)).c);
        }
        athg athg0 = new athg(null);
        athg0.c(1);
        athg0.b(atgy.a(arae0, v));
        athg0.d(arae0.d);
        return athg0.a();
    }

    private static arae b(ByteString hfsf0, atfv atfv0, aqys aqys0) {
        try {
            byte[] arr_b = atfx.a(atfv0, hfsf0.toByteArray());
            return (arae)((ProtoLiteBuilder)((ProtoLiteMessage)arae.a).v_newBuilder().A(arr_b, hftc.a())).N_build();
        }
        catch(InvalidKeyException | InvalidAlgorithmParameterException exception1) {
            aqys0.y(19);
            throw new athc("Could not initialize Cipher to decrypt ChunkOrdering", exception1);
        }
        catch(IllegalBlockSizeException | BadPaddingException exception0) {
            aqys0.y(20);
            throw new athc("Error finalizing decrypt Cipher on ChunkOrdering", exception0);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new athc("Error decrypting ChunkOrdering", generalSecurityException0);
        }
        catch(hfur hfur0) {
            aqys0.y(24);
            throw new athc("Error parsing ChunkOrdering proto", hfur0);
        }
    }
}

