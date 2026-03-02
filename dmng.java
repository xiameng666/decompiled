import com.google.android.gms.pay.factoryreset.wizard.FactoryResetWizardChimeraActivity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class dmng extends ibuo implements ibts {
    public dmng(Object object0) {
        super(1, object0, FactoryResetWizardChimeraActivity.class, "setActiveAccount", "setActiveAccount(Lcom/google/android/gms/tapandpay/firstparty/AccountInfo;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((AccountInfo)object0), "p0");
        FactoryResetWizardChimeraActivity factoryResetWizardChimeraActivity0 = (FactoryResetWizardChimeraActivity)this.e;
        factoryResetWizardChimeraActivity0.setIntent(factoryResetWizardChimeraActivity0.getIntent().putExtra("account_info", ((AccountInfo)object0)));
        dmov dmov0 = (dmov)factoryResetWizardChimeraActivity0.a().e.ij();
        if(dmov0 != null && dmov0 != dmov.a) {
            factoryResetWizardChimeraActivity0.l(dmov0);
        }
        return ibom.a;
    }
}

