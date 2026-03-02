import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import java.util.List;

final class byer extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final bxyn d;
    final bxyi e;
    final SignalCredentialStateRequest f;
    final long g;

    public byer(bxyn bxyn0, bxyi bxyi0, SignalCredentialStateRequest signalCredentialStateRequest0, long v, ibrl ibrl0) {
        this.d = bxyn0;
        this.e = bxyi0;
        this.f = signalCredentialStateRequest0;
        this.g = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byer)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byer(this.d, this.e, this.f, this.g, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.c != 0) {
            object2 = this.b;
            object3 = this.a;
            ibnx.b(object0);
            ((bxyn)object3).o(((Status)object2), ((SignalCredentialStateResponse)object0), cckf.d(bbdp.cm));
            return Status.b;
        }
        ibnx.b(object0);
        bxyn bxyn0 = this.d;
        bxyi bxyi0 = this.e;
        SignalCredentialStateRequest signalCredentialStateRequest0 = this.f;
        Status status0 = Status.b;
        bxvo.a(this.g);
        this.a = bxyn0;
        this.b = status0;
        this.c = 1;
        Context context0 = bxyi0.e;
        List list0 = new byce(context0).a(bycd.b);
        if(!list0.isEmpty()) {
            byfi byfi0 = new byfi(context0);
            String s = bxyi0.b;
            ibuq.f(s, "callingPackage");
            ibuq.f(signalCredentialStateRequest0, "request");
            ibuq.f(list0, "providerInfoList");
            for(Object object4: list0) {
                bych bych0 = (bych)object4;
                gmcu gmcu0 = new gmcu();
                gmbu.t(gmcu0, new byfh(byfi0), gmap.a);
                if(bydf.b(bych0, ibpo.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"))) {
                    ComponentName componentName0 = bych0.c;
                    if(componentName0 == null) {
                        ((ggtj)byfi0.c.j()).x("Provider component name is null");
                    }
                    else {
                        Bundle bundle0 = bydf.a(byfi0.a, s, signalCredentialStateRequest0.b);
                        signalCredentialStateRequest0.c.putBundle("androidx.credentials.providerevents.extra.CALLING_APP_INFO", bundle0);
                        bydh bydh0 = new bydh(byfi0.a, s, componentName0, signalCredentialStateRequest0, gmcu0);
                        byfi0.b.put(componentName0, bydh0);
                        Intent intent0 = new Intent().setComponent(componentName0).setAction("android.credentials.EVENTS_SERVICE_ACTION").putExtra("androidx.credentials.providerevents.service.EVENTS_SERVICE_PROVIDER_KEY", "androidx.credentials.providerevents.playservices.CredentialEventsProviderPlayServices");
                        ibuq.e(intent0, "putExtra(...)");
                        if(bydh0.d(componentName0, intent0)) {
                            continue;
                        }
                        ((ggtj)byfi0.c.j()).x("Failed to bind to remote service %s, providerComponentName");
                    }
                }
                else {
                    ((ggtj)byfi0.c.j()).x("Provider is not valid.");
                }
            }
            SignalCredentialStateResponse signalCredentialStateResponse0 = new SignalCredentialStateResponse();
            if(signalCredentialStateResponse0 != object1) {
                object0 = signalCredentialStateResponse0;
                object3 = bxyn0;
                object2 = status0;
                ((bxyn)object3).o(((Status)object2), ((SignalCredentialStateResponse)object0), cckf.d(bbdp.cm));
                return Status.b;
            }
            return object1;
        }
        ((ggtj)bxyj.a.j()).x("No enabled providers found.");
        throw new cjuh(8, "No enabled providers found.");
    }
}

