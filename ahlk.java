import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager.FeatureRequest;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ahlk extends cjtm {
    public static final int a;
    private final int b;
    private final azxs c;
    private final Bundle d;
    private final ahla e;

    @Deprecated
    public ahlk(ahla ahla0, int v, azug azug0) {
        super(0xB0, "AuthEarlyUpdate", azug0);
        batl.s(ahla0);
        this.e = ahla0;
        this.b = v;
        this.c = null;
        this.d = null;
    }

    public ahlk(azxs azxs0, int v, Bundle bundle0, azug azug0) {
        super(0xB0, "AuthEarlyUpdate", azug0);
        batl.s(azxs0);
        this.c = azxs0;
        this.b = v;
        this.e = null;
        this.d = bundle0;
    }

    static ahlj b(einq einq0) {
        int v1;
        long v = SystemClock.elapsedRealtime();
        evql evql0 = einq0.cE("com.google.android.gms.auth_api_early_update", 0xF1B18AD, new String[]{"ANDROID_AUTH"}, null, "");
        evql0.b(new ahlh());
        evql0.A(new ahli());
        try {
            evrg.o(evql0, hpoy.a.d().b(), TimeUnit.MILLISECONDS);
            if(evql0.n()) {
                goto label_18;
            }
            else {
                v1 = 6;
            }
        }
        catch(ExecutionException unused_ex) {
            Log.w("AuthEarlyUpdate", String.format("[EURequestFeaturesOperation]Failed to sync Phenotype flags."));
            v1 = 4;
        }
        catch(TimeoutException unused_ex) {
            Log.w("AuthEarlyUpdate", String.format("[EURequestFeaturesOperation]Failed to sync Phenotype flags."));
            v1 = 3;
        }
        catch(InterruptedException unused_ex) {
            Log.w("AuthEarlyUpdate", String.format("[EURequestFeaturesOperation]Failed to sync Phenotype flags."));
            v1 = 5;
        }
        goto label_19;
    label_18:
        v1 = 2;
    label_19:
        long v2 = SystemClock.elapsedRealtime() - v;
        ahlj ahlj0 = new ahlj();
        ahlj0.a = v2;
        ahlj0.b = v1;
        return ahlj0;
    }

    private final void c(Status status0, boolean z) {
        ahla ahla0 = this.e;
        if(ahla0 != null) {
            ahla0.a(status0, z, cckf.d(bbdp.E));
        }
        azxs azxs0 = this.c;
        if(azxs0 != null) {
            azxs0.a(status0);
        }
    }

    private final void d(ahkw ahkw0, int v, int v1, long v2, Context context0, int v3, ahlj ahlj0, int v4) {
        ghrx ghrx0 = ahlk.e(v, v1, v2, ahlj0, v4);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ghrx0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ghrx0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghrx)hftp0.b_message).k = v3 - 1;
        ((ghrx)hftp0.b_message).b |= 0x100;
        ghrx ghrx1 = (ghrx)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ghrx1).jf(5, null);
        hftp1.X(((ProtoLiteMessage)ghrx1));
        this.g(ahkw0, hftp1, context0);
    }

    private static final ghrx e(int v, int v1, long v2, ahlj ahlj0, int v3) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghrx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghrx)hftv0).d = v - 1;
        ((ghrx)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ghrx)hftv1).b |= 1;
        ((ghrx)hftv1).c = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((ghrx)hftv2).b |= 16;
        ((ghrx)hftv2).g = v2;
        int v4 = ahlj0.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        if(v4 == 0) {
            throw null;
        }
        ((ghrx)hftv3).i = v4 - 1;
        ((ghrx)hftv3).b |= 0x40;
        int v5 = (int)ahlj0.a;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((ghrx)hftv4).b |= 0x20;
        ((ghrx)hftv4).h = v5;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghrx)hftp0.b_message).j = v3 - 1;
        ((ghrx)hftp0.b_message).b |= 0x80;
        return (ghrx)hftp0.N_build();
    }

    @Override  // cjtm
    public final void f(Context context0) {
        int v11;
        int v10;
        int v9;
        int v8;
        long v4;
        ahkw ahkw0 = new ahkw(context0);
        ahle ahle0 = ahle.a(context0);
        einq einq0 = new einq(context0);
        ahlf ahlf0 = new ahlf();
        ahlj ahlj0 = ahlk.b(einq0);
        if(ahle0.c()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghrx.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ghrx)hftp0.b_message).d = 4;
            ((ghrx)hftp0.b_message).b |= 2;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghww.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((ghww)hftp1.b_message).c = 2;
            ((ghww)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghrx ghrx0 = (ghrx)hftp0.b_message;
            ghww ghww0 = (ghww)hftp1.N_build();
            ghww0.getClass();
            ghrx0.f = ghww0;
            ghrx0.b |= 8;
            int v = (int)ahlj0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((ghrx)hftv0).b |= 0x20;
            ((ghrx)hftv0).h = v;
            int v1 = ahlj0.b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghrx ghrx1 = (ghrx)hftp0.b_message;
            if(v1 == 0) {
                throw null;
            }
            ghrx1.i = v1 - 1;
            ghrx1.b |= 0x40;
            ghrx ghrx2 = (ghrx)hftp0.N_build();
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ghrx2).jf(5, null);
            hftp2.X(((ProtoLiteMessage)ghrx2));
            this.g(ahkw0, hftp2, context0);
            this.c(Status.b, true);
            return;
        }
        long v2 = System.currentTimeMillis();
        long v3 = SystemClock.elapsedRealtime();
        ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
        moduleManager$FeatureRequest0.setUrgent(ahlf0);
        hpoy hpoy0 = hpoy.a;
        if(hpoy0.d().i()) {
            v4 = v3;
            moduleManager$FeatureRequest0.requestFeatureAtVersion("auth_suw", 0xF1B1C95L);
        }
        else {
            v4 = v3;
            moduleManager$FeatureRequest0.requestFeatureAtLatestVersion("auth_suw");
        }
        if(!ahle0.a.requestFeatures(moduleManager$FeatureRequest0)) {
            this.c(new Status(30502), false);
            this.d(ahkw0, 4, ((int)(SystemClock.elapsedRealtime() - v4)), v2, context0, 3, ahlj0, 1);
            return;
        }
        Bundle bundle0 = this.d;
        long v5 = hpoy.b();
        if(bundle0 != null) {
            v5 = bundle0.getLong("timeout_for_request_feature_in_ms", v5);
        }
        boolean z = hpoy0.d().h();
        if(Long.compare(v5, -1L) == 0 || v5 <= 0L) {
            v5 = hpoy.b();
        }
        long v6 = Math.min(hpoy0.d().a(), v5);
        if(z) {
            long v7 = v5;
            try {
                while(v7 > 0L && (!ahlf0.a(Math.min(v7, v6), TimeUnit.MILLISECONDS) && !ahle0.c())) {
                    v7 = v5 - (SystemClock.elapsedRealtime() - v4);
                }
                SystemClock.elapsedRealtime();
                ahle0.c();
                goto label_83;
            label_74:
                ahlf0.a(v5, TimeUnit.MILLISECONDS);
                ahle0.c();
                goto label_83;
            }
            catch(InterruptedException unused_ex) {
            }
            goto label_77;
        }
        else {
            goto label_74;
        label_77:
            Log.w("AuthEarlyUpdate", String.format("[EURequestFeaturesOperation]waitUntilSidecarUpdated() call was interrupted!"));
            v8 = 30500;
            v9 = 1;
            v10 = 4;
            v11 = 5;
            goto label_98;
        }
    label_83:
        long v12 = v5 - (SystemClock.elapsedRealtime() - v4);
        v9 = ahle0.d();
        if(v9 == 2) {
            v10 = 2;
            v8 = 0;
            v11 = 1;
        }
        else if(v12 > 0L) {
            v10 = 4;
            v8 = 30502;
            v11 = 4;
        }
        else {
            v10 = 3;
            v8 = 30501;
            v11 = 1;
        }
    label_98:
        int v13 = (int)(SystemClock.elapsedRealtime() - v4);
        if(v8 != 0) {
            Log.w("AuthEarlyUpdate", "Sidecar was not updated after requestFeatures() call! Need to wait longer or something is wrong!");
            ahlf ahlf1 = new ahlf();
            Log.i("AuthEarlyUpdate", "[EUActionHelper]Performing unrequestFeature()");
            ModuleManager.FeatureRequest moduleManager$FeatureRequest1 = new ModuleManager.FeatureRequest();
            moduleManager$FeatureRequest1.unrequestFeature("auth_suw");
            moduleManager$FeatureRequest1.setUrgent(ahlf1);
            if(!ahle0.a.requestFeatures(moduleManager$FeatureRequest1)) {
                Log.w("AuthEarlyUpdate", "Sidecar unrequest feature failed!");
            }
            try {
                ahlf1.a(hpoy.a.d().c(), TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException unused_ex) {
                Log.w("AuthEarlyUpdate", String.format("[EURequestFeaturesOperation]unrequestFeature() call was interrupted!"));
            }
            this.d(ahkw0, v10, v13, v2, context0, v11, ahlj0, v9);
            this.c(new Status(v8), false);
            return;
        }
        ghrx ghrx3 = ahlk.e(2, v13, v2, ahlj0, v9);
        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)ghrx3).jf(5, null);
        hftp3.X(((ProtoLiteMessage)ghrx3));
        this.g(ahkw0, hftp3, context0);
        this.c(Status.b, true);
    }

    private final void g(ahkw ahkw0, ProtoLiteBuilder hftp0, Context context0) {
        ahkw0.a(context0, ahkw0.b(2, this.b, hftp0, context0));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c(status0, false);
    }
}

