import android.content.Context;
import com.google.android.gms.backup.settings.navroot.BackupSettingsNavRootChimeraActivity;
import j..util.Objects;

final class asqi implements acl {
    final asqj a;

    public asqi(asqj asqj0) {
        Objects.requireNonNull(asqj0);
        this.a = asqj0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        asqj asqj0 = this.a;
        if(!asqj0.l) {
            asqj0.l = true;
            ((asqc)asqj0.h()).L(((BackupSettingsNavRootChimeraActivity)asqj0));
        }
    }
}

