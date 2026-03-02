import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.factoryreset.wizard.FactoryResetWizardChimeraActivity;
import j..time.Duration;
import j..time.Instant;

public final class dmnf extends ibuo implements ibts {
    public dmnf(Object object0) {
        super(1, object0, FactoryResetWizardChimeraActivity.class, "finishFlow", "finishFlow(I)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v1;
        int v = ((Number)object0).intValue();
        FactoryResetWizardChimeraActivity factoryResetWizardChimeraActivity0 = (FactoryResetWizardChimeraActivity)this.e;
        dmnv dmnv0 = factoryResetWizardChimeraActivity0.a().d;
        Duration duration0 = Duration.between(factoryResetWizardChimeraActivity0.a().l, Instant.now());
        dmls dmls0 = factoryResetWizardChimeraActivity0.a().k;
        if(dmls0 == null) {
            v1 = 2;
        }
        else if(!dmls0.b.isEmpty()) {
            v1 = 4;
        }
        else {
            v1 = 5;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hahz.a).v_newBuilder();
        String s = dmnv0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hahz)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hahz)hftp1.b_message).d = 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hahu.a).v_newBuilder();
        long v2 = duration0.toNanos();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((hahu)hftv1).b = v2;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hahu)hftp2.b_message).c = v1 - 2;
        hahu hahu0 = (hahu)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hahz hahz0 = (hahz)hftp1.b_message;
        hahu0.getClass();
        hahz0.c = hahu0;
        hahz0.b = 7;
        hahz hahz1 = (hahz)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hahz1.getClass();
        hapr0.ca = hahz1;
        hapr0.h |= 0x100;
        dmnv0.b(hftp0);
        dmmt dmmt0 = factoryResetWizardChimeraActivity0.l;
        if(dmmt0 == null) {
            ibuq.j("factoryResetClearcutLogsUploader");
            dmmt0 = null;
        }
        if(hwja.a.b().b()) {
            azzc azzc0 = new azzc();
            azzc0.a = new azcc(dmmt0.a.m);
            azzd azzd0 = azzc0.a();
            dmmt0.a.m.iF(azzd0);
        }
        else {
            evrg.d(Status.b);
        }
        factoryResetWizardChimeraActivity0.setResult(v);
        factoryResetWizardChimeraActivity0.finish();
        return ibom.a;
    }
}

