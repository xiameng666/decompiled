import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings.Secure;
import java.util.ArrayList;
import java.util.List;

public final class byce {
    private final Context a;

    public byce(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    public final List a(bycd bycd0) {
        bych bych1;
        List list0;
        ComponentName componentName0 = null;
        ibuq.f(bycd0, "usecase");
        if(bycd0 == bycd.a) {
            bych bych0 = this.b();
            if(bych0 != null) {
                return ibpo.b(bych0);
            }
        }
        else {
            if(bycd0 == bycd.b) {
                Context context0 = this.a;
                ibuq.f(context0, "context");
                if(bbqa.d()) {
                    String s = Settings.Secure.getString(context0.getContentResolver(), "credential_service");
                    if(s == null) {
                        list0 = ibps.a;
                    }
                    else {
                        List list1 = ibzk.T(s, new String[]{":"}, 0, 6);
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: list1) {
                            ComponentName componentName1 = ComponentName.unflattenFromString(((String)object0));
                            if(componentName1 != null) {
                                arrayList0.add(componentName1);
                            }
                        }
                        list0 = arrayList0;
                    }
                }
                else {
                    list0 = ibpo.b(new ComponentName("com.google.android.gms", "com.google.android.gms.auth.api.credentials.credman.service.GcpmCredentialProviderEventsService"));
                }
                List list2 = new ArrayList();
                for(Object object1: list0) {
                    ComponentName componentName2 = (ComponentName)object1;
                    try {
                        bych1 = null;
                        bych1 = bycg.a(context0, componentName2, false);
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                    if(bych1 != null) {
                        list2.add(bych1);
                    }
                }
                return list2;
            }
            if(bycd0 == bycd.c) {
                bych bych2 = this.b();
                if(bych2 != null) {
                    componentName0 = bych2.d;
                }
                if(componentName0 != null) {
                    return ibpo.b(bych2);
                }
            }
        }
        return ibps.a;
    }

    private final bych b() {
        ComponentName componentName0;
        Context context0 = this.a;
        ibuq.f(context0, "context");
        if(bbqa.d()) {
            String s = Settings.Secure.getString(context0.getContentResolver(), "credential_service_primary");
            componentName0 = s == null ? null : ComponentName.unflattenFromString(s);
        }
        else {
            componentName0 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.api.credentials.credman.service.GcpmCredentialProviderEventsService");
        }
        if(componentName0 == null) {
            return null;
        }
        try {
            return bycg.a(context0, componentName0, true);
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }
}

