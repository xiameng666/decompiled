import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ajqx {
    private static final bboh a;
    private final String b;

    static {
        ajqx.a = akea.b("EnrollmentManager");
    }

    public ajqx(String s) {
        this.b = s;
    }

    static final ByteString a(hnns hnns0) {
        int v1;
        clbs clbs0 = clbv.a(AppContextProvider.a());
        clbc clbc0 = new clbc(null);
        clbc0.c(hnns0);
        clcf clcf0 = clcg.a(new clbd(clbc0), cjzj.b);
        ajqw ajqw0 = new ajqw();
        clcn clcn0 = clbs0.e(clcf0, ajqw0, new bblp(0x7FFFFFFF, 9), -1, 0x4800).e();
        try {
            clcn0.a().get(30L, TimeUnit.SECONDS);
        }
        catch(TimeoutException timeoutException0) {
            a.ae(ajqx.a.j(), "Request timed out.", timeoutException0);
            throw new ajqv("Request timed out.", timeoutException0, -1);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            a.ae(ajqx.a.j(), "Thread interrupted.", interruptedException0);
            throw new ajqv("Thread interrupted.", interruptedException0, -2);
        }
        catch(ExecutionException executionException0) {
            a.ae(ajqx.a.j(), "Execution failed.", executionException0);
            if((executionException0.getCause() instanceof clbr)) {
                v1 = ((clbr)executionException0.getCause()).a();
            }
            else if((executionException0.getCause() instanceof clbw)) {
                gfsx gfsx0 = ((clbw)executionException0.getCause()).b;
                v1 = gfsx0.i() ? ((clcq)gfsx0.d()).a() : -4;
            }
            else {
                v1 = -3;
            }
            throw new ajqv("Execution failed.", executionException0, v1);
        }
        finally {
            clcn0.b();
        }
        int v2 = ajqw0.b;
        if(v2 == 200) {
            return ajqw0.a;
        }
        ((ggtj)ajqx.a.h()).z("Unexpected response code %d", v2);
        throw new ajqv(ajqw0.b);
    }

    public final int b(Context context0, boolean z, int v) {
        int v2;
        boolean z2;
        boolean z1;
        Object object0;
        try {
            object0 = aktq.a;
            ajqy ajqy0 = ajqy.a;
            gfsx gfsx0 = ajqy0.a(context0);
            if(gfsx0.i()) {
                ((ggtj)ajqx.a.h()).x("Returning certificates list from cache");
                object0 = gfsx0.d();
                z1 = true;
            }
            else {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)object0).v_newBuilder();
                hput hput0 = hput.a;
                ByteString hfsf0 = ajqx.a(hput0.c().v());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aktq aktq0 = (aktq)hftp0.b_message;
                hfsf0.getClass();
                aktq0.b |= 2;
                aktq0.c = hfsf0;
                ByteString hfsf1 = ajqx.a(hput0.c().u());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aktq aktq1 = (aktq)hftp0.b_message;
                hfsf1.getClass();
                aktq1.b |= 4;
                aktq1.d = hfsf1;
                long v1 = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(hput0.c().a());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aktq aktq2 = (aktq)hftp0.b_message;
                aktq2.b |= 8;
                aktq2.e = v1;
                aktq aktq3 = (aktq)hftp0.N_build();
                ((ggtj)ajqx.a.h()).x("Successfully downloaded certificates.");
                ajqy0.b(context0, aktq3);
                z1 = false;
                object0 = aktq3;
            }
            z2 = z1;
            v2 = 0;
        }
        catch(ajqv ajqv0) {
            ggtj ggtj0 = (ggtj)((ggtj)ajqx.a.j()).s(ajqv0);
            int v3 = ajqv0.a;
            ggtj0.z("Download failed with status: %d", v3);
            if(z) {
                FolsomGcmTaskChimeraService.a.d("scheduleCertificatesSyncRetry", new Object[0]);
                clkn clkn0 = new clkn();
                clkn0.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
                clkn0.t("com.google.android.gms.auth.folsom.RETRY_KEY_SYNC_FOR_CERTIFICATES");
                clkn0.p = true;
                clkn0.e(30L, hput.a.c().k());
                clkn0.t = FolsomGcmTaskChimeraService.d();
                clkn0.g(0);
                clkn0.v(2);
                clko clko0 = clkn0.a();
                cljp.a(context0).f(clko0);
            }
            v2 = v3;
            z2 = false;
        }
        if((((aktq)object0).b & 2) != 0 && ((aktq)object0).c.size() > 0) {
            if((((aktq)object0).b & 4) != 0 && ((aktq)object0).d.size() > 0) {
                return this.c(context0, ((aktq)object0).c, ((aktq)object0).d, v, z2);
            }
            ((ggtj)ajqx.a.j()).x("Failed to download signature.");
            akdz.f(4, v, z2, v2, 0L, this.b);
            return 2;
        }
        ((ggtj)ajqx.a.j()).x("Failed to download certificate.");
        akdz.f(3, v, z2, v2, 0L, this.b);
        return 1;
    }

    final int c(Context context0, ByteString hfsf0, ByteString hfsf1, int v, boolean z) {
        RecoveryController recoveryController0 = RecoveryController.getInstance(context0);
        long v1 = 0L;
        if(hpuy.c()) {
            try {
                v1 = gqpa.a(hfsf0.toByteArray()).a;
            }
            catch(gqox gqox0) {
                a.ae(akdx.a.j(), "Failed to parse the certificates.", gqox0);
            }
        }
        if(hput.g()) {
            try {
                frli frli0 = ((akba)akba.b.b()).d;
                ajxk ajxk0 = ((ajwt)akba.g(frli0.a())).i;
                if(ajxk0 == null) {
                    ajxk0 = ajxk.a;
                }
                if(v1 != ((long)ajxk0.b)) {
                    ajvt.b(false);
                    ajxk ajxk1 = ((ajwt)akba.g(frli0.a())).i;
                    if(ajxk1 == null) {
                        ajxk1 = ajxk.a;
                    }
                    akba.g(frli0.b(new akao(ajxk1, ((int)v1)), gmap.a));
                }
            }
            catch(IOException | acse exception0) {
                a.ae(ajqx.a.j(), "Failed to get cert serial.", exception0);
            }
        }
        try {
            recoveryController0.initRecoveryService(hput.d(), hfsf0.toByteArray(), hfsf1.toByteArray());
            ((ggtj)ajqx.a.h()).x("Recovery service is initialized.");
            akdz.f(6, v, z, 0, v1, this.b);
            return 4;
        }
        catch(CertificateException | InternalRecoveryServiceException throwable0) {
            a.ae(ajqx.a.j(), "Failed to initialize RecoveryController.", throwable0);
            akdz.f(5, v, z, 0, v1, this.b);
            return 3;
        }
    }
}

