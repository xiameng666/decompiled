import android.os.Bundle;
import java.util.List;

public final class fcaw implements gdan {
    public fcav a;
    public final gdcl b;
    public hcet c;

    public fcaw(gdcl gdcl0) {
        this.b = gdcl0;
    }

    public final hceu a() {
        fcav fcav0 = (fcav)this.b.b.h("FilterCategoryDialogFragment");
        this.a = fcav0;
        hcet hcet0 = fcav0 == null ? this.c : fcav0.F();
        if(hcet0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hceu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hceu hceu0 = (hceu)hftp0.b_message;
            hfuo hfuo0 = hceu0.b;
            if(!hfuo0.c()) {
                hceu0.b = ProtoLiteMessage.E(hfuo0);
            }
            hceu0.b.add(hcet0);
            return (hceu)hftp0.N_build();
        }
        return null;
    }

    public final void b(hces hces0) {
        fcav fcav0 = this.a;
        if(fcav0 != null) {
            fcav0.dismiss();
        }
        this.c = null;
        fcav fcav1 = new fcav();
        Bundle bundle0 = new Bundle();
        gciq.j(bundle0, "filterCategoryProto", ((MessageLite)hces0));
        bundle0.putInt("themeResourceId", this.b.c);
        bundle0.putString("analyticsSessionId", this.b.f);
        bundle0.putParcelable("parentLogContext", this.b.e);
        fcav1.setArguments(bundle0);
        this.a = fcav1;
        fcav1.al = this.b.a;
        fcav1.ao = this;
        fcav1.am = this.b.d;
        fcav1.show(this.b.b, "FilterCategoryDialogFragment");
    }

    public final void c() {
        gdcl gdcl0 = this.b;
        fcav fcav0 = (fcav)gdcl0.b.h("FilterCategoryDialogFragment");
        this.a = fcav0;
        if(fcav0 != null) {
            fcav0.al = gdcl0.a;
            fcav0.ao = this;
            fcav0.am = gdcl0.d;
        }
    }

    @Override  // gdan
    public final boolean lb(List list0) {
        fcav fcav0 = (fcav)this.b.b.h("FilterCategoryDialogFragment");
        this.a = fcav0;
        return fcav0 == null || fcav0.lb(list0);
    }

    @Override  // gdan
    public final boolean ld(List list0) {
        fcav fcav0 = (fcav)this.b.b.h("FilterCategoryDialogFragment");
        this.a = fcav0;
        return fcav0 == null || fcav0.ld(list0);
    }

    @Override  // gdan
    public final boolean le() {
        fcav fcav0 = (fcav)this.b.b.h("FilterCategoryDialogFragment");
        this.a = fcav0;
        return fcav0 != null && fcav0.le();
    }
}

