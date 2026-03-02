import android.content.Context;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

public final class audw implements ibts {
    public final aueg a;
    public final Context b;

    public audw(aueg aueg0, Context context0) {
        this.a = aueg0;
        this.b = context0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        boolean z = ((ModuleInstallResponse)object0).a();
        ((ggtj)aueg.b.h()).I("SessionId:%s install state:%s", ((ModuleInstallResponse)object0).a, z);
        if(z) {
            aueg.m(this.b);
        }
        return ibom.a;
    }
}

