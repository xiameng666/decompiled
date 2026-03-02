import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class ctkw extends ctxs {
    public final ctlj a;
    public final icta b;
    public static final int c;
    private static final bboh d;
    private final PackageManager e;

    static {
        ctkw.d = ctnb.a("AppCast", new ibuk(ctkw.class));
    }

    public ctkw(ctlj ctlj0) {
        ibuq.f(ctlj0, "exoController");
        super();
        this.a = ctlj0;
        this.e = AppContextProvider.b().getPackageManager();
        this.b = new icta();
    }

    @Override  // ctzf
    public final icig c(icig icig0) {
        return new icht(new ctkv(this, icig0, null));
    }

    @Override  // ctzf
    public final Object d() {
        ProtoLiteMessage hftv0;
        ((ggtj)ctkw.d.h()).x("Fetching app list from remote device.");
        synchronized(this) {
            Intent intent0 = new Intent("android.intent.action.MAIN");
            intent0.addCategory("android.intent.category.LAUNCHER");
            PackageManager packageManager0 = this.e;
            List list0 = packageManager0.queryIntentActivities(intent0, 0);
            ibuq.e(list0, "queryIntentActivities(...)");
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object0: list0) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(((ResolveInfo)object0).activityInfo.packageName, 0x20000);
                ibuq.e(applicationInfo0, "getApplicationInfo(...)");
                ctzq ctzq0 = ctzp.a(((ProtoLiteMessage)ctza.a).v_newBuilder());
                String s = ((ResolveInfo)object0).activityInfo.packageName;
                ibuq.e(s, "packageName");
                ctzq0.b(s);
                ctzq0.c(packageManager0.getApplicationLabel(applicationInfo0).toString());
                arrayList0.add(ctzq0.a());
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctyz.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            List list1 = DesugarCollections.unmodifiableList(((ctyz)hftp0.b_message).b);
            ibuq.e(list1, "getAppsList(...)");
            new hfxu(list1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ctyz ctyz0 = (ctyz)hftp0.b_message;
            hfuo hfuo0 = ctyz0.b;
            if(!hfuo0.c()) {
                ctyz0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, ctyz0.b);
            hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
        }
        return (ctyz)hftv0;
    }

    @Override  // ctzf
    public final Object e(ctzc ctzc0) {
        Drawable drawable0;
        try {
            synchronized(this) {
                drawable0 = this.e.getApplicationIcon(ctzc0.c);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return ctzz.a(((ProtoLiteMessage)ctzd.a).v_newBuilder()).a();
        }
        ibuq.c(drawable0);
        ByteString hfsf0 = ctwb.a(drawable0, 0x60, 0x60);
        cuaa cuaa0 = ctzz.a(((ProtoLiteMessage)ctzd.a).v_newBuilder());
        ibuq.f(hfsf0, "value");
        ProtoLiteBuilder hftp0 = cuaa0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctzd ctzd0 = (ctzd)hftp0.b_message;
        hfsf0.getClass();
        ctzd0.b |= 1;
        ctzd0.c = hfsf0;
        return cuaa0.a();
    }
}

