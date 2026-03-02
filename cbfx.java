import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

public final class cbfx implements cbfv {
    public static final bboh a;
    public final Context b;
    private final bavt c;

    static {
        cbfx.a = bboh.b("SupervisionCoreManager", bbcu.ac);
    }

    public cbfx(Context context0, bavt bavt0) {
        ibuq.f(context0, "context");
        super();
        this.b = context0;
        this.c = bavt0;
    }

    @Override  // cbfv
    public final Object a(ibrl ibrl0) {
        cbfw cbfw0;
        if((ibrl0 instanceof cbfw)) {
            cbfw0 = (cbfw)ibrl0;
            int v = cbfw0.c;
            if((v & 0x80000000) == 0) {
                cbfw0 = new cbfw(this, ibrl0);
            }
            else {
                cbfw0.c = v - 0x80000000;
            }
        }
        else {
            cbfw0 = new cbfw(this, ibrl0);
        }
        Object object0 = cbfw0.a;
        Object object1 = ibrx.a;
        switch(cbfw0.c) {
            case 0: {
                ibnx.b(object0);
                azty[] arr_azty = {capp.a(this.b)};
                evql evql0 = this.c.b(arr_azty);
                cbfw0.c = 1;
                object0 = ictn.b(evql0, cbfw0);
                return object0 == object1 ? object1 : Boolean.valueOf(((ModuleAvailabilityResponse)object0).a);
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(((ModuleAvailabilityResponse)object0).a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // cbfv
    public final void b(String s, int v) {
        PackageInfo packageInfo0;
        try {
            packageInfo0 = this.b.getPackageManager().getPackageInfo("com.google.android.gms.supervision", 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            a.ae(cbfx.a.j(), "Supervision Core APK is not installed.", packageManager$NameNotFoundException0);
            packageInfo0 = null;
        }
        if(packageInfo0 == null) {
            ((ggtj)cbfx.a.j()).x("Supervision Core APK is not installed.");
            return;
        }
        if(packageInfo0.applicationInfo == null || !packageInfo0.applicationInfo.enabled) {
            try {
                cjmp.a(this.b, "com.google.android.gms.supervision", 1, v);
                cbfx.c(gvkg.b, s);
            }
            catch(SecurityException securityException0) {
                a.ae(cbfx.a.j(), "Failed to enable Supervision Core APK.", securityException0);
                cbfx.c(gvkg.c, s);
            }
        }
    }

    public static final void c(gvkg gvkg0, String s) {
        if(hujq.a.c().g()) {
            gvkq gvkq0 = gvkq.ek;
            gvib gvib0 = gvia.a(((hftr)((ProtoLiteMessage)gvij.a).v_newBuilder()));
            gvks gvks0 = gvkr.a(((ProtoLiteMessage)gvki.a).v_newBuilder());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvkh.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ibuq.f(gvkg0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gvkh)hftv0).c = gvkg0.f;
            ((gvkh)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvkh gvkh0 = (gvkh)hftp0.b_message;
            gvkh0.b |= 2;
            gvkh0.d = s;
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ibuq.e(hftv1, "build(...)");
            ibuq.f(((gvkh)hftv1), "value");
            ProtoLiteBuilder hftp1 = gvks0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvki gvki0 = (gvki)hftp1.b_message;
            ((gvkh)hftv1).getClass();
            gvki0.c = (gvkh)hftv1;
            gvki0.b = 41;
            gvib0.c(gvks0.a());
            cbfb.a(gvkq0, gvib0.a());
            return;
        }
        gvkq gvkq1 = gvkq.ek;
        hftr hftr0 = (hftr)((ProtoLiteMessage)gvij.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gvki.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gvkh.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        ((gvkh)hftv2).c = gvkg0.f;
        ((gvkh)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        gvkh gvkh1 = (gvkh)hftp3.b_message;
        gvkh1.b |= 2;
        gvkh1.d = s;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gvki gvki1 = (gvki)hftp2.b_message;
        gvkh gvkh2 = (gvkh)hftp3.N_build();
        gvkh2.getClass();
        gvki1.c = gvkh2;
        gvki1.b = 41;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gvij gvij0 = (gvij)hftr0.b_message;
        gvki gvki2 = (gvki)hftp2.N_build();
        gvki2.getClass();
        gvij0.d = gvki2;
        gvij0.c = 3;
        cbba.a(gvkq1, ((gvij)((ProtoLiteBuilder)hftr0).N_build()));
    }
}

