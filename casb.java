import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

public final class casb implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ActivityInfo activityInfo0 = ((ResolveInfo)object0).activityInfo;
        return (activityInfo0 == null ? null : activityInfo0.metaData) == null ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

