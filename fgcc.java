import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager.ComponentInfoFlags;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;
import java.util.List;

public final class fgcc implements fgcg, AutoCloseable {
    public static final Uri a;
    private final String b;
    private final ContentProviderClient c;

    static {
        fgcc.a = Uri.parse("content://com.google.android.gms.common.appdoctor/fixes");
    }

    public fgcc(Context context0) {
        this.b = "com.google.android.gms";
        ProviderInfo providerInfo0 = Build.VERSION.SDK_INT < 33 ? context0.getPackageManager().resolveContentProvider("com.google.android.gms.common.appdoctor", 0) : context0.getPackageManager().resolveContentProvider("com.google.android.gms.common.appdoctor", PackageManager.ComponentInfoFlags.of(0L));
        if(providerInfo0 == null || !Objects.equals(providerInfo0.applicationInfo.packageName, "com.google.android.gms")) {
            throw new RemoteException("com.google.android.gms is not the authority.");
        }
        ContentProviderClient contentProviderClient0 = context0.getContentResolver().acquireContentProviderClient(fgcc.a);
        if(contentProviderClient0 == null) {
            throw new RemoteException("Unable to acquire ContentProviderClient");
        }
        this.c = contentProviderClient0;
    }

    private final Bundle a() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("com.google.android.common.appdoctor.package_name", this.b);
        return bundle0;
    }

    @Override  // fgcg
    public final List b() {
        Bundle bundle0 = this.a();
        Bundle bundle1 = this.c.call("get_fixes", null, bundle0);
        if(bundle1 == null) {
            Log.e("AppDoctorProviderClient", "Failed to get config from AppDoctorProvider.");
            return ggna.a;
        }
        byte[] arr_b = bundle1.getByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig");
        if(arr_b != null) {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)abzh.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                return ((abzh)hftv0).b;
            }
            catch(hfur hfur0) {
                Log.e("AppDoctorProviderClient", "Failed to parse TeleDoctorConfig.", hfur0);
                return ggna.a;
            }
        }
        Log.e("AppDoctorProviderClient", "TeleDoctor Config empty");
        return ggna.a;
    }

    @Override  // fgcg
    public final void c(String s) {
        Bundle bundle0 = this.a();
        bundle0.putString("com.google.android.gms.common.appdoctor.uuid", s);
        this.c.call("log_fix_in_progress", null, bundle0);
    }

    @Override  // fgcg
    public final void close() {
        this.c.close();
    }

    @Override  // fgcg
    public final void d(String s) {
        Bundle bundle0 = this.a();
        bundle0.putString("com.google.android.gms.common.appdoctor.uuid", s);
        this.c.call("mark_fix_attempted", null, bundle0);
    }

    @Override  // fgcg
    public final void e(String s) {
        Bundle bundle0 = this.a();
        bundle0.putString("com.google.android.gms.common.appdoctor.uuid", s);
        this.c.call("mark_fix_completed", null, bundle0);
    }
}

