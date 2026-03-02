import android.content.Context;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import j..util.Objects;

public final class dudr implements ibth {
    public final duew a;

    public dudr(duew duew0) {
        this.a = duew0;
    }

    @Override  // ibth
    public final Object a() {
        duew duew0 = this.a;
        Context context0 = duew0.requireContext();
        gtxf gtxf0 = gtxf.b(((gtxg)Objects.requireNonNull(duew0.aH)).h);
        if(gtxf0 == null) {
            gtxf0 = gtxf.f;
        }
        duew0.startActivity(dlnf.bH(context0, dtzb.d(gtxf0)));
        duew0.aO.setVisibility(8);
        dvfh dvfh0 = duew0.ai;
        ProvisioningId provisioningId0 = duew0.aP;
        evql evql0 = dvfh0.J.a();
        evql0.b(new dvdz(dvfh0, provisioningId0));
        evql0.A(new dvea());
        return ibom.a;
    }
}

