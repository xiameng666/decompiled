import android.app.backup.BackupDataInput;
import android.content.Context;
import java.security.MessageDigest;
import javax.crypto.SecretKey;

public final class atip implements athz {
    public araq a;
    public araq b;
    private final int c;
    private final Context d;
    private final String e;
    private final BackupDataInput f;

    public atip(Context context0, String s, BackupDataInput backupDataInput0) {
        this.c = (int)glxd.b(hqiu.a.b().b(), 0L, 50000000L);
        gftb.check(context0);
        this.d = context0;
        gftb.check(s);
        this.e = s;
        this.f = backupDataInput0;
        this.a = araq.a;
    }

    @Override  // athz
    public final athy a(SecretKey secretKey0, byte[] arr_b, arad arad0, gged_interceptors gged0) {
        atke atke0;
        ggdy ggdy0;
        atgg atgg0;
        atgd atgd0 = new atgd(secretKey0);
        atgg0 = new atgg(this.f, this.a, arad0, atgd0);
        ggdy0 = new ggdy();
        try(atgj atgj0 = new atgj(new atkp(atgg0.a.E()), gged0); atkj atkj0 = new atkj(this.c, this.d, this.e, arad0)) {
            long v;
            for(v = 0L; true; v += (long)atjy0.b.b()) {
                if(!atgj0.c()) {
                    break;
                }
                atjy atjy0 = atgj0.a();
                atkj0.d(atjy0);
                ggdy0.i(atjy0.a);
            }
            atke0 = atkj0.b();
        }
        this.b = atgg0.b;
        gged_interceptors gged1 = ggdy0.h();
        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
        gged_interceptors gged2 = gged_interceptors.D(ggmi.a, gged1);
        int v1 = ((ggna)gged2).c;
        for(int v2 = 0; v2 < v1; ++v2) {
            messageDigest0.update(((athu)gged2.get(v2)).a);
        }
        return new athy(atke0, ByteString.copyFrom(messageDigest0.digest()), v);
    }
}

