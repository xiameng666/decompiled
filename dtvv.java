import android.content.Context;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class dtvv {
    public static final bboh a;
    public final dtze b;
    private final cqxc c;

    static {
        dtvv.a = bboh.b("Pay", bbcu.cZ);
    }

    public dtvv(cqxc cqxc0, dtze dtze0) {
        this.c = cqxc0;
        this.b = dtze0;
    }

    final void a(String s, String s1, Context context0) {
        hkoy hkoy0 = hkoy.y;
        dtvg dtvg0 = new dtvg();
        dtvh dtvh0 = new dtvh();
        dtvn dtvn0 = new dtvn();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtxj.a).v_newBuilder();
        gtxb gtxb0 = gtxb.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtxj gtxj0 = (gtxj)hftp0.b_message;
        gtxj0.b = gtxb0.a();
        this.c(s, s1, context0, hkoy0, dtvg0, dtvh0, dtvn0, hftp0);
    }

    final void b(String s, String s1, Context context0, boolean z) {
        hkoy hkoy0 = hkoy.w;
        dtvr dtvr0 = new dtvr();
        dtva dtva0 = new dtva();
        dtvb dtvb0 = new dtvb(z);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtxj.a).v_newBuilder();
        gtxb gtxb0 = gtxb.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtxj gtxj0 = (gtxj)hftp0.b_message;
        gtxj0.b = gtxb0.a();
        this.c(s, s1, context0, hkoy0, dtvr0, dtva0, dtvb0, hftp0);
    }

    public final void c(String s, String s1, Context context0, hkoy hkoy0, dtvu dtvu0, dtvs dtvs0, dtvt dtvt0, ProtoLiteBuilder hftp0) {
        ProvisioningId provisioningId0 = new ProvisioningId(s);
        evql evql0 = this.c.k(provisioningId0);
        evql0.b(new dtve(this, s1, s, dtvu0, context0, dtvs0, hftp0, dtvt0, hkoy0));
        evql0.A(new dtvf());
    }
}

