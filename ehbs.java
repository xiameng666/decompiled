import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

public final class ehbs {
    public static void a(Context context0) {
        synchronized(ehbs.class) {
            PackageManager packageManager0 = context0.getPackageManager();
            ComponentName componentName0 = new ComponentName("com.google.android.gms", "com.google.android.gms.people.sync.focus.ContactsSyncAdapterService");
            ComponentName componentName1 = new ComponentName("com.google.android.syncadapters.contacts", "com.google.android.syncadapters.contacts.ContactsSyncAdapterService");
            ehjp.a(packageManager0, componentName0, 2);
            int v1 = ehjp.a(context0.getPackageManager(), componentName1, 2);
            hxds.a.b().f();
            hxbh.a.b().b();
            boolean z = bbqa.c() ? packageManager0.hasSystemFeature("com.google.android.gms.feature.contacts_sync_disabled") : ehjp.b(packageManager0) ^ 1;
            if(z) {
                efpr efpr0 = efpr.a();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giph.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((giph)hftv0).c = 1;
                ((giph)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((giph)hftp0.b_message).d = 2;
                ((giph)hftp0.b_message).b |= 2;
                efpr0.g(((giph)hftp0.N_build()));
                egig.k("FsaEntryPointSwitcher", "FSA1 package doesn\'t exist or was disabled, disabling GmsCore entry point.");
                ehbs.b(context0, componentName0, 2);
                return;
            }
            if(!hwzc.a.c().an()) {
                if(v1 != 1) {
                    ehbs.b(context0, componentName1, 0);
                }
                ehbs.b(context0, componentName0, 2);
            }
            else if(ehbs.b(context0, componentName0, 1) && v1 != 1) {
                ehbs.b(context0, componentName1, 2);
            }
            ehjp.a(packageManager0, componentName1, 2);
            ehjp.a(packageManager0, componentName0, 2);
        }
    }

    private static boolean b(Context context0, ComponentName componentName0, int v) {
        egig.i("FsaEntryPointSwitcher", "setting component enabled=%d for %s", Integer.valueOf(v), componentName0.getClassName());
        try {
            bbmq.H(context0, componentName0, v);
            egig.e("FsaEntryPointSwitcher", "Setting component enabled succeeds.");
            return true;
        }
        catch(IllegalArgumentException | SecurityException exception0) {
            egig.l("FsaEntryPointSwitcher", "SetComponentEnabledSetting failed for %s", exception0);
            return false;
        }
    }
}

