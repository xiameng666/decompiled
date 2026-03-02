import com.google.android.gms.nearby.sharing.AppInfo;
import com.google.android.gms.nearby.sharing.Attachment;

public final class dggb {
    public static final AppInfo a(Attachment attachment0) {
        ibuq.f(attachment0, "<this>");
        byte[] arr_b = attachment0.d().getByteArray("com.google.android.gms.nearby.sharing.EXTRA_APP_INFO_BYTES");
        if(arr_b != null) {
            try {
                return (AppInfo)ddst.b(arr_b, AppInfo.CREATOR);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                dcvz.a.e().f(illegalArgumentException0).p("Received invalid AppInfo.", new Object[0]);
            }
        }
        return null;
    }

    public static final void b(Attachment attachment0, AppInfo appInfo0) {
        ibuq.f(attachment0, "<this>");
        attachment0.d().putByteArray("com.google.android.gms.nearby.sharing.EXTRA_APP_INFO_BYTES", bauc.n(appInfo0));
    }
}

