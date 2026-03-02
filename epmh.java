import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.significantplaces.settings.TrustedPlacesListChimeraActivity;

final class epmh extends ibsl implements ibtw {
    Object a;
    int b;
    int c;
    final epmi d;

    public epmh(epmi epmi0, ibrl ibrl0) {
        this.d = epmi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epmh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epmh(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        int v1;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                object2 = this.d.requireContext();
                iced iced0 = ((TrustedPlacesListChimeraActivity)object2).j;
                if(iced0 == null) {
                    goto label_14;
                }
                else {
                    this.a = object2;
                    this.c = 1;
                    if(iced0.r(this) != object1) {
                        goto label_14;
                    }
                }
                break;
            }
            case 1: {
                object2 = this.a;
                ibnx.b(object0);
            label_14:
                this.a = object2;
                this.c = 2;
                object0 = epnr.a.b(this);
                if(object0 != object1) {
                    goto label_21;
                }
                break;
            }
            case 2: {
                object2 = this.a;
                ibnx.b(object0);
            label_21:
                int v = ((Number)object0).intValue();
                if(v > 0) {
                    this.a = object2;
                    this.b = v;
                    this.c = 3;
                    if(epnr.a.c(0, this) != object1) {
                        object3 = object2;
                        v1 = v;
                        goto label_33;
                    }
                }
                else {
                    goto label_38;
                }
                break;
            }
            case 3: {
                v1 = this.b;
                object3 = this.a;
                ibnx.b(object0);
            label_33:
                epil.a();
                Context context0 = this.d.requireContext();
                Intent intent0 = new Intent().setComponent(new ComponentName(context0, "com.google.android.gms.significantplaces.settings.StalePlacesNoticeActivity")).putExtra("num_to_remove", v1);
                ibuq.e(intent0, "putExtra(...)");
                ((TrustedPlacesListChimeraActivity)object3).startActivity(intent0);
            label_38:
                lps lps0 = this.d.getViewLifecycleOwner();
                epmg epmg0 = new epmg(this.d, null);
                this.a = null;
                this.c = 4;
                if(lqy.b(lps0, lpf.d, epmg0, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

