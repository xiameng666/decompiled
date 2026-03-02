import android.content.ComponentName;
import android.content.pm.ServiceInfo;
import java.util.List;

public final class bych {
    public static final List a;
    public final List b;
    public final ComponentName c;
    public final ComponentName d;
    private final ComponentName e;
    private final ServiceInfo f;
    private final ServiceInfo g;
    private final boolean h;
    private final boolean i;

    static {
        bych.a = ibpo.g(new String[]{"androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", "android.credentials.TYPE_PASSWORD_CREDENTIAL"});
    }

    public bych(ComponentName componentName0, ServiceInfo serviceInfo0, List list0, ComponentName componentName1, ServiceInfo serviceInfo1, ComponentName componentName2, boolean z) {
        ibuq.f(componentName0, "credentialManagerService");
        ibuq.f(list0, "capabilities");
        super();
        this.e = componentName0;
        this.f = serviceInfo0;
        this.b = list0;
        this.c = componentName1;
        this.g = serviceInfo1;
        this.d = componentName2;
        this.h = true;
        this.i = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!ibuq.m(this.getClass(), (object0 == null ? null : object0.getClass()))) {
            return false;
        }
        ibuq.d(object0, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.provider.CredentialProviderInfo");
        return ibuq.m(this.e, ((bych)object0).e) && ibuq.m(this.f, ((bych)object0).f) && ibuq.m(this.b, ((bych)object0).b) && ibuq.m(this.c, ((bych)object0).c) && ibuq.m(this.g, ((bych)object0).g) && ibuq.m(this.d, ((bych)object0).d) && this.i == ((bych)object0).i;
    }
}

