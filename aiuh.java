import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.Set;
import java.util.concurrent.Executor;

public final class aiuh extends aiuc {
    public final Executor b;
    public final aiuk c;
    public static final int d;
    private static final bboh e;
    private final aiyg f;

    static {
        aiuh.e = aiqz.b("BlockstoreAccessControlDatabaseProtoDataStoreImpl");
    }

    public aiuh(Context context0, aiyg aiyg0, Executor executor0, aiuk aiuk0) {
        super(context0);
        this.f = aiyg0;
        this.b = executor0;
        this.c = aiuk0;
    }

    @Override  // aiuc
    public final int a(String s) {
        return this.c.a(s);
    }

    @Override  // aiuc
    public final gmcd b(String s) {
        aizp aizp0 = aizq.a();
        aizp0.a = 3;
        aizp0.c(new ggoh(s));
        aizq aizq0 = aizp0.a();
        return this.f.j(aizq0);
    }

    @Override  // aiuc
    public final gmcd c(String s) {
        return glzd.g(gmbt.h(this.f.b(s)), new aiud(this, s), this.b);
    }

    @Override  // aiuc
    public final gmcd d(String s, int v) {
        aizp aizp0 = aizq.a();
        aizp0.a = 2;
        aizp0.c(new ggoh(s));
        aizp0.b(v);
        aizq aizq0 = aizp0.a();
        return this.f.j(aizq0);
    }

    @Override  // aiuc
    @Deprecated
    public final gmcd e(long v) {
        return gmbx.a;
    }

    @Override  // aiuc
    public final gmcd f(String s) {
        gmcd gmcd0 = glzd.f(gmbt.h(this.f.f()), new aiug(), this.b);
        gmcd gmcd1 = this.c(s);
        return gmbu.d(new gmcd[]{gmcd0, gmcd1}).b(new aiue(this, gmcd0, gmcd1, s), this.b);
    }

    @Override  // aiuc
    public final gmcd g(String s, int v) {
        ggoh ggoh0 = new ggoh(s);
        aizp aizp0 = aizq.a();
        aizp0.a = 1;
        aizp0.c(ggoh0);
        aizp0.b(v);
        aizq aizq0 = aizp0.a();
        return this.f.j(aizq0);
    }

    @Override  // aiuc
    public final gmcd h(Set set0, gfsx gfsx0) {
        aizp aizp0 = aizq.a();
        aizp0.a = 1;
        aizp0.c(set0);
        aizp0.b(3);
        aizq aizq0 = aizp0.a();
        return this.f.k(aizq0, gfsx0);
    }

    static gmcd i(aiuc aiuc0, Context context0, String s, long v, int v1, Executor executor0) {
        PackageInfo packageInfo0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((wvj)hftv0).b |= 1;
        ((wvj)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        int v2 = 4;
        ((wvj)hftv1).b |= 4;
        ((wvj)hftv1).e = v1;
        int v3 = Long.compare(v, 0L);
        if(v3 > 0 && v1 == 0) {
            long v4 = v + hprv.a.f().d();
            for(Object object0: context0.getPackageManager().getInstalledPackages(0)) {
                packageInfo0 = (PackageInfo)object0;
                if(!packageInfo0.packageName.equals(s)) {
                    continue;
                }
                goto label_22;
            }
            packageInfo0 = null;
        label_22:
            if(packageInfo0 != null) {
                long v5 = packageInfo0.firstInstallTime;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                wvj wvj0 = (wvj)hftp0.b_message;
                wvj0.b |= 2;
                wvj0.d = v5;
                if(packageInfo0.firstInstallTime < v4) {
                    ((ggtj)aiuh.e.h()).X("Package %s installed at %d, smaller than threshold %d. Granting ACCESS_RESTORED.", s, Long.valueOf(packageInfo0.firstInstallTime), Long.valueOf(v4));
                    return glzd.f(gmbt.h(aiuc0.g(s, 3)), new aiuf(hftp0), executor0);
                }
                ((ggtj)aiuh.e.h()).X("Package %s installed at %d, bigger than threshold %d. Skipp granting ACCESS_RESTORED.", s, Long.valueOf(packageInfo0.firstInstallTime), Long.valueOf(v4));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((wvj)hftp0.b_message).g = 4;
                ((wvj)hftp0.b_message).b |= 16;
                return gmbu.i(((wvj)hftp0.N_build()));
            }
            ((ggtj)aiuh.e.j()).B("Failed to find PackageInfo for %s from PackageManager.", s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((wvj)hftp0.b_message).g = 6;
            ((wvj)hftp0.b_message).b |= 16;
            return gmbu.i(((wvj)hftp0.N_build()));
        }
        if(v3 <= 0) {
            v2 = 3;
        }
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wvj)hftp0.b_message).g = v2 - 1;
        ((wvj)hftp0.b_message).b |= 16;
        return gmbu.i(((wvj)hftp0.N_build()));
    }
}

