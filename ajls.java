import android.content.Context;
import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.auth.easyunlock.AppContextProvider;

public final class ajls {
    final ModuleManager a;
    private final ccmg b;
    private final boolean c;
    private final ccza d;
    private final ayvf e;

    public ajls() {
        boolean z = hpuh.a.d().e();
        this.c = z;
        Context context0 = AppContextProvider.a();
        if(z) {
            ccza ccza0 = new ccza(((int)hpuh.b()), cdxo.b);
            this.d = ccza0;
            ccza0.k();
            this.e = null;
        }
        else {
            this.d = null;
            this.e = new ayvf(new aytt(context0, "EASY_UNLOCK_COUNTERS").a(), ((int)hpuh.b()));
        }
        this.a = ModuleManager.get(context0);
        this.b = new ccmp();
    }

    public final void a(int v) {
        this.d("report_feature_support_result", v);
    }

    public final void b(int v) {
        if(hpuh.a.d().g()) {
            ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
            moduleManager$FeatureCheck0.checkFeatureAtAnyVersion(amjy.a.a);
            if(this.a.checkFeaturesAreAvailable(moduleManager$FeatureCheck0) == 0) {
                this.d("optional_module_start_service_result", v);
                return;
            }
        }
        this.d("start_service_result", v);
    }

    public final void c(int v) {
        if(v == 0) {
            this.b.a(bbdg.gu);
        }
        else {
            this.b.a(bbdg.gv);
        }
        if(hpuh.a.d().d()) {
            cdxr cdxr0 = cdxr.v();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzzg.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzzf.a).v_newBuilder();
            int v1 = gzze.a(v);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzzf gzzf0 = (gzzf)hftp1.b_message;
            if(v1 == 1) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            gzzf0.c = v1 - 2;
            gzzf0.b |= 1;
            gzzf gzzf1 = (gzzf)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzzg gzzg0 = (gzzg)hftp0.b_message;
            gzzf1.getClass();
            gzzg0.c = gzzf1;
            gzzg0.b = 1;
            cdxr0.j(((ProtoLiteMessage)(((gzzg)hftp0.N_build()))));
        }
        this.d("user_configuration_state", v);
    }

    private final void d(String s, int v) {
        if(!hpuh.a.d().f()) {
            return;
        }
        if(this.c) {
            ccza ccza0 = this.d;
            ccyw ccyw0 = ccza0.e(s);
            ccyv ccyv0 = ccyw0.f.f;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
            String s1 = ccyw0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((ccwq)hftv0).b |= 1;
            ((ccwq)hftv0).c = s1;
            ccwp ccwp0 = ccwp.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((ccwq)hftv1).d = ccwp0.g;
            ((ccwq)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((ccwq)hftv2).b |= 8;
            ((ccwq)hftv2).f = v;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ccwq ccwq0 = (ccwq)hftp0.b_message;
            ccwq0.b |= 0x20;
            ccwq0.h = 1L;
            ccyw0.a(hftp0, ccyv0);
            ccza0.j();
            return;
        }
        this.e.e(s).a(((long)v), 1L, ayvf.b);
        this.e.h();
    }
}

