import android.content.Context;
import android.content.pm.Signature;
import com.google.android.gms.auth.blockstore.AppRestoreInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ainy {
    public static final bboh a;
    final String b;
    public final aiuc c;
    public final aiyg d;
    public final Context e;
    public final gfsx f;
    final gmcg g;
    final gmcg h;
    private static final ggfp i;
    private final Signature[] j;
    private final aiqb k;
    private final gmbg l;

    static {
        ainy.a = aiqz.b("NotifyAppRestoreApiImpl");
        ainy.i = ggfp.M("com.google.android.apps.restore", "com.google.android.apps.pixelmigrate", "com.google.android.tungsten.setupwraith", "com.google.android.gms.api_test");
    }

    public ainy(aiuc aiuc0, aiyg aiyg0, aiqb aiqb0, String s, Signature[] arr_signature, Context context0, gfsx gfsx0) {
        this.l = new ainw(this);
        this.g = new bblp(0x7FFFFFFF, 10);
        this.h = new bblp(0x7FFFFFFF, 9);
        this.c = aiuc0;
        this.d = aiyg0;
        this.k = aiqb0;
        this.b = s;
        this.j = arr_signature;
        this.e = context0;
        this.f = gfsx0;
    }

    public final gmcd a(List list0, int v, AppRestoreInfo appRestoreInfo0) {
        int v1;
        if(bbod.c(hprv.d()) && hprv.g()) {
            bboh bboh0 = ainy.a;
            ((ggtj)bboh0.h()).x("Verifying API caller in onAppRestore.");
            if(hprv.a.f().j()) {
                ((ggtj)bboh0.h()).x("Signature verification disabled. Skipping.");
            }
            else {
                Signature[] arr_signature = this.j;
                if(arr_signature == null || arr_signature.length != 1) {
                    ((ggtj)bboh0.h()).x("single cert required");
                    return gmbu.h(new aiml(8));
                }
                try {
                    Signature signature0 = arr_signature[0];
                    MessageDigest messageDigest0 = MessageDigest.getInstance("SHA256");
                    messageDigest0.update(signature0.toByteArray());
                    byte[] arr_b = messageDigest0.digest();
                    String s = arr_b == null ? "" : bboy.e(arr_b);
                }
                catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                    ((ggtj)((ggtj)ainy.a.i()).s(noSuchAlgorithmException0)).B("Failed to get signature message digest for %s.", this.b);
                    return gmbu.h(new aiml(8));
                }
                Context context0 = this.e;
                String s1 = this.b;
                if(!ajcb.a(context0, s1) && !hprv.a.f().g().b.contains(a.r(s, this.b, ":"))) {
                    ((ggtj)bboh0.h()).B("%s is not a valid 2P app, throwing Exception.", s1);
                    return gmbu.h(new aiml(8));
                }
                if(ajcb.a(context0, s1) && !ainy.i.contains(s1)) {
                    ((ggtj)bboh0.h()).B("%s is not a valid 1P app, throwing Exception.", s1);
                    return gmbu.h(new aiml(8));
                }
            }
            if(list0 == null) {
                ((ggtj)bboh0.i()).x("restoredPackages list is null. Failing the API invocation.");
                return gmbu.h(new aiml(8));
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wty.a).v_newBuilder();
            switch(v) {
                case 0: {
                    v1 = 2;
                    break;
                }
                case 1: {
                    v1 = 3;
                    break;
                }
                default: {
                    v1 = 1;
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((wty)hftv0).c = v1 - 1;
            ((wty)hftv0).b |= 1;
            String s2 = this.b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            wty wty0 = (wty)hftp0.b_message;
            s2.getClass();
            wty0.b |= 2;
            wty0.d = s2;
            long v2 = (long)list0.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            wty wty1 = (wty)hftp0.b_message;
            wty1.b |= 4;
            wty1.e = v2;
            wty wty2 = (wty)hftp0.N_build();
            aiqb aiqb0 = this.k;
            ((ggtj)aiqk.a.h()).x("Buffering an AppRestoreNotificationEvent");
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ajaq.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((ajaq)hftv1).e = 9;
            ((ajaq)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ajaq ajaq0 = (ajaq)hftp1.b_message;
            wty2.getClass();
            ajaq0.d = wty2;
            ajaq0.c = 3;
            int v3 = ((aiqk)aiqb0).d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ajaq ajaq1 = (ajaq)hftp1.b_message;
            ajaq1.b |= 2;
            ajaq1.f = v3;
            aiqf aiqf0 = new aiqf(((ajaq)hftp1.N_build()));
            gmbu.t(glzd.g(gmbt.h(((aiqk)aiqb0).b.b(aiqf0, gmap.a)), new ains(this), gmap.a), this.l, gmap.a);
            ((ggtj)bboh0.h()).x("Upgrading access level for restoredPackages.");
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                String s3 = (String)object0;
                if(s3 == null) {
                    ((ggtj)bboh0.i()).x("restoredPackage is null. Skip granting access for it.");
                }
                else {
                    ((ggtj)bboh0.h()).B("Upgrading access level for %s", s3);
                    hashSet0.add(s3);
                }
            }
            return glzd.g(glzd.g(gmbt.h(this.c.h(hashSet0, this.f)), new aint(this, v, appRestoreInfo0, hashSet0), this.h), new ainu(this), this.h);
        }
        ((ggtj)ainy.a.h()).x("Feature flags are not enabled. Skip taking actions in onAppRestore.");
        return gmbx.a;
    }

    public final gmcd b() {
        boolean z;
        ajab ajab0 = ajab.a().a();
        if(hpsk.d()) {
            try {
                z = false;
                ((ggtj)aizo.a.h()).x("Clearing all the restore credential without restore access");
                AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
                aiyw aiyw0 = new aiyw(this.f, atomicBoolean0);
                z = ((Boolean)((glyq)glzd.f(((aizo)this.d).c.b(aiyw0, gmap.a), new aiyx(atomicBoolean0), gmap.a)).u()).booleanValue();
            }
            catch(ExecutionException | InterruptedException exception0) {
                a.ae(ainy.a.i(), "data store operation failed.", exception0);
            }
            ((ggtj)ainy.a.h()).B("Deleted restore credential without access, success= %s", Boolean.valueOf(z));
        }
        return glzd.g(gmbt.h(this.d.c(ajab0)), new ainv(this), gmap.a);
    }
}

