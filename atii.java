import java.io.InputStream;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import javax.crypto.SecretKey;

public final class atii implements Callable {
    public final atig a;
    public static final int b;
    private static final aqql c;
    private final atgh d;
    private final athm e;
    private final InputStream f;
    private final String g;
    private final SecureRandom h;
    private final aqys i;
    private final aqlk j;
    private final ProtoLiteBuilder k;

    static {
        atii.c = new aqql(new String[]{"EncryptedFullBackupTask"});
    }

    public atii(atgh atgh0, athm athm0, atig atig0, InputStream inputStream0, String s, ProtoLiteBuilder hftp0, SecureRandom secureRandom0, aqys aqys0, aqlk aqlk0) {
        this.d = atgh0;
        this.e = athm0;
        this.f = inputStream0;
        this.a = atig0;
        this.g = s;
        this.k = hftp0;
        this.h = secureRandom0;
        this.i = aqys0;
        this.j = aqlk0;
    }

    private final arad a(SecretKey secretKey0, arax arax0) {
        byte[] arr_b = new byte[0x20];
        this.h.nextBytes(arr_b);
        atif atif0 = new atif(this.j, secretKey0, arax0);
        return this.a.e(this.k, atif0, arr_b);
    }

    @Override
    public final Object call() {
        arad arad1;
        try {
            atgh atgh0 = this.d;
            String s = this.g;
            gfsx gfsx0 = atgh0.c(s);
            if(gfsx0.i()) {
                atii.c.h("Found previous chunk listing for %s", new Object[]{s});
            }
            athm athm0 = this.e;
            athk athk0 = athm0.a();
            if(athk0.c) {
                atii.c.h("Key was rotated or newly generated for %s, so performing a full backup.", new Object[]{s});
                gfsx0 = gfqx.a;
                atgh0.e(s);
            }
            atig atig0 = this.a;
            if(atig0.c() && gfsx0.i() && !atig0.b(((arad)gfsx0.d()))) {
                gfsx0 = gfqx.a;
                atgh0.e(s);
            }
            ProtoLiteBuilder hftp0 = this.k;
            aqet aqet0 = hftp0.cN();
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)aqet0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)aqet0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((aqet)hftp1.b_message).i = 1;
            ((aqet)hftp1.b_message).b |= 16;
            aqet aqet1 = (aqet)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((aqfe)hftp0.b_message).l = hfvv.a;
            hftp0.cM(aqet1);
            if(gfsx0.i()) {
                arad arad0 = (arad)gfsx0.d();
                if((arad0.b & 8) != 0 && arad0.g.size() == 0x20) {
                    arad1 = atig0.d(hftp0, new atif(this.j, athk0.a, athk0.b), arad0);
                }
                else {
                    this.i.g(29, 2);
                    arad1 = this.a(athk0.a, athk0.b);
                }
            }
            else {
                arad1 = this.a(athk0.a, athk0.b);
            }
            atii.c.j("Backup and upload succeeded, saving new listings", new Object[0]);
            athm0.b(athk0);
            atgh0.f(s, ((MessageLite)arad1));
            atii.c.j("Saved chunk listing for %s", new Object[]{s});
        }
        catch(aqyd aqyd0) {
            atii.c.f("Permanent upload exception, wiping state", new Object[0]);
            this.d.e(this.g);
            throw aqyd0;
        }
        catch(aqxz aqxz0) {
            atii.c.f("Inconsistent state between client and server, wiping state", new Object[0]);
            this.d.e(this.g);
            throw aqxz0;
        }
        finally {
            ghjp.a(this.f);
        }
        return null;
    }
}

