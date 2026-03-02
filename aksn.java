import android.content.Context;
import android.content.Intent;

public final class aksn {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    public aksn(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public static final aksn a(Context context0, Intent intent0) {
        ibuq.f(intent0, "intent");
        boolean z = gagb.e(intent0);
        boolean z1 = gagb.c(intent0);
        boolean z2 = true;
        boolean z3 = intent0 != null && intent0.getBooleanExtra("preDeferredSetup", false);
        if(intent0 == null || !intent0.getBooleanExtra("portalSetup", false)) {
            z2 = false;
        }
        return new aksn(z, z1, z3, z2, gagb.b(intent0), intent0.getBooleanExtra("isSuwSuggestedActionFlow", false), intent0.getBooleanExtra("is_setup_wizard", false), gagb.d(context0));
    }

    public final icxt b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxt.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((icxt)hftv0).b |= 1;
        ((icxt)hftv0).c = this.a;
        boolean z = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((icxt)hftv1).b |= 2;
        ((icxt)hftv1).d = z;
        boolean z1 = this.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((icxt)hftv2).b |= 4;
        ((icxt)hftv2).e = z1;
        boolean z2 = this.d;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((icxt)hftv3).b |= 8;
        ((icxt)hftv3).f = z2;
        boolean z3 = this.e;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((icxt)hftv4).b |= 16;
        ((icxt)hftv4).g = z3;
        boolean z4 = this.f;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((icxt)hftv5).b |= 0x20;
        ((icxt)hftv5).h = z4;
        boolean z5 = this.g;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((icxt)hftv6).b |= 0x40;
        ((icxt)hftv6).i = z5;
        boolean z6 = this.h;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        icxt icxt0 = (icxt)hftp0.b_message;
        icxt0.b |= 0x80;
        icxt0.j = z6;
        ProtoLiteMessage hftv7 = hftp0.N_build();
        ibuq.e(hftv7, "build(...)");
        return (icxt)hftv7;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aksn)) {
            return false;
        }
        if(this.a != ((aksn)object0).a) {
            return false;
        }
        if(this.b != ((aksn)object0).b) {
            return false;
        }
        if(this.c != ((aksn)object0).c) {
            return false;
        }
        if(this.d != ((aksn)object0).d) {
            return false;
        }
        if(this.e != ((aksn)object0).e) {
            return false;
        }
        if(this.f != ((aksn)object0).f) {
            return false;
        }
        return this.g == ((aksn)object0).g ? this.h == ((aksn)object0).h : false;
    }

    @Override
    public final int hashCode() {
        return ((((((aksm.a(this.a) * 0x1F + aksm.a(this.b)) * 0x1F + aksm.a(this.c)) * 0x1F + aksm.a(this.d)) * 0x1F + aksm.a(this.e)) * 0x1F + aksm.a(this.f)) * 0x1F + aksm.a(this.g)) * 0x1F + aksm.a(this.h);
    }

    @Override
    public final String toString() {
        return "SuwChecks(firstRunValue=" + this.a + ", deferredSetupValue=" + this.b + ", preDeferredSetupValue=" + this.c + ", portalSetupValue=" + this.d + ", isSetupFlowValue=" + this.e + ", isSuwSuggestedActionFlowValue=" + this.f + ", gmsIsSetupWizardValue=" + this.g + ", isDeviceProvisionedValue=" + this.h + ")";
    }
}

