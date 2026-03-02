import android.os.OutcomeReceiver;
import com.google.android.gms.identitycredentials.CredentialInformationRequest;
import com.google.android.gms.identitycredentials.CredentialInformationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bxwz extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final CredentialInformationRequest f;
    final OutcomeReceiver g;
    final bxxc h;

    public bxwz(CredentialInformationRequest credentialInformationRequest0, OutcomeReceiver outcomeReceiver0, bxxc bxxc0, ibrl ibrl0) {
        this.f = credentialInformationRequest0;
        this.g = outcomeReceiver0;
        this.h = bxxc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bxwz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bxwz(this.f, this.g, this.h, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object5;
        Object object4;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.e == 0) {
            ibnx.b(object0);
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = this.f.a.iterator();
            object4 = this.h;
            object3 = iterator0;
            object2 = arrayList0;
        }
        else {
            object2 = this.d;
            object3 = this.c;
            object4 = this.b;
            object5 = this.a;
            ibnx.b(object0);
            goto label_24;
        }
        while(((Iterator)object3).hasNext()) {
            Object object6 = ((Iterator)object3).next();
            this.a = object2;
            this.b = object4;
            this.c = object3;
            this.d = object2;
            this.e = 1;
            object0 = ((bxxc)object4).a(((String)object6), this);
            if(object0 != object1) {
                object5 = object2;
            label_24:
                ((List)object2).add(object0);
                object2 = object5;
                continue;
            }
            return object1;
        }
        CredentialInformationResponse credentialInformationResponse0 = new CredentialInformationResponse(((List)object2));
        this.g.onResult(credentialInformationResponse0);
        return ibom.a;
    }
}

