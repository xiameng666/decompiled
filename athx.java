import java.io.File;
import java.io.RandomAccessFile;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import jeb.synthetic.TWR;

public final class athx implements athw {
    private final String a;
    private final athb b;
    private final atns c;
    private final int d;
    private final aqys e;

    public athx(String s, SecretKey secretKey0, int v, aqys aqys0) {
        if(!hqjb.j()) {
            s = null;
        }
        this.a = s;
        this.b = new athb(secretKey0, aqys0);
        this.c = new atns(secretKey0);
        this.d = v;
        gftb.check(aqys0);
        this.e = aqys0;
    }

    @Override  // athw
    public final void a(File file0, atia atia0) {
        gged_interceptors gged0;
        athh athh0;
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "r");
        try {
            randomAccessFile0.seek(randomAccessFile0.length() - 8L);
            long v = randomAccessFile0.readLong();
            int v1 = this.d;
            if(v1 == 0) {
                athb athb1 = this.b;
                arah arah1 = athx.b(randomAccessFile0, v, this.a, this.e);
                if((arah1.b & 16) == 0 && (arah1.b & 0x20) == 0) {
                    athb1.b(1);
                    athh0 = atgz.a(arah1, v, athb1.b, athb1.a);
                }
                else {
                    athh0 = athb1.a(0, arah1, v);
                }
            }
            else {
                athb athb0 = this.b;
                arah arah0 = athx.b(randomAccessFile0, v, this.a, this.e);
                if(v1 == 1) {
                    athb0.b(1);
                    athh0 = atgz.a(arah0, v, athb0.b, athb0.a);
                }
                else {
                    athh0 = athb0.a(v1, arah0, v);
                }
            }
            atns atns0 = this.c;
            switch(athh0.a) {
                case 1: {
                    gged0 = gged_interceptors.l(new atnq(atns0.a));
                    break;
                }
                case 2: {
                    ggdy ggdy0 = new ggdy();
                    ggdy0.i(new atnq(atns0.a));
                    if(athh0.d.i() && athh0.d.d() == aram.c) {
                        ggdy0.i(atnp.a);
                    }
                    gged0 = ggdy0.h();
                    break;
                }
                default: {
                    throw new IllegalArgumentException(String.format(Locale.US, "invalid code level: %d", ((int)athh0.a)));
                }
            }
            atiw atiw0 = new atiw(atia0, gged0);
            try {
                atgf atgf0 = new atgf(randomAccessFile0, athh0);
                try {
                    atiw0.c();
                    while(true) {
                        try {
                            if(!atgf0.c()) {
                                break;
                            }
                            atiw0.a(((atjv)atgf0.b()));
                        }
                        catch(Throwable throwable2) {
                            TWR.safeClose$NT(atiw0, throwable2);
                            throw throwable2;
                        }
                    }
                    atiw0.close();
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(atgf0, throwable1);
                    throw throwable1;
                }
                atgf0.close();
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new atgk("Error decrypting chunk", generalSecurityException0);
            }
            catch(atib atib0) {
                if((atib0.getCause() instanceof atnt)) {
                    Throwable throwable3 = ((atnt)atib0.getCause()).getCause();
                    if((throwable3 instanceof InvalidKeyException)) {
                        this.e.v(17, 4, this.a);
                    }
                    else if((throwable3 instanceof IllegalBlockSizeException) || (throwable3 instanceof BadPaddingException)) {
                        this.e.v(18, 4, this.a);
                    }
                }
                throw new atgk("Chunk processing failed", atib0);
            }
            try {
                if(!Arrays.equals(atia0.b(), athh0.c.toByteArray())) {
                    this.e.v(15, 4, this.a);
                    throw new atit();
                }
            }
            catch(aqli aqli0) {
                throw new atgk("Error calculating output checksum digest", aqli0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(randomAccessFile0, throwable0);
            throw throwable0;
        }
        randomAccessFile0.close();
    }

    static arah b(RandomAccessFile randomAccessFile0, long v, String s, aqys aqys0) {
        long v1 = randomAccessFile0.length();
        if(Long.compare(v, v1) < 0 && v >= 0L) {
            randomAccessFile0.seek(v);
            int v2 = glwy.h(randomAccessFile0.length() - 8L - v);
            byte[] arr_b = new byte[v2];
            randomAccessFile0.readFully(arr_b);
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)arah.a), arr_b, 0, v2, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                return (arah)hftv0;
            }
            catch(hfur hfur0) {
                aqys0.v(24, 4, s);
                throw new atis(String.format(Locale.US, "Could not read chunks metadata at position %d of file of %d bytes", v, v1), hfur0);
            }
        }
        aqys0.v(23, 4, s);
        throw new atis(String.format(Locale.US, "%d is not valid position for chunks metadata in file of %d bytes", v, v1));
    }
}

