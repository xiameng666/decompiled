import com.google.android.gms.pay.pass.valuable.model.program.LoyaltyCardProgram;

public final class dwbb implements dpug {
    public final dwbd a;

    public dwbb(dwbd dwbd0) {
        this.a = dwbd0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        guzw guzw0 = ((gvac)object0).b;
        if(guzw0 == null) {
            guzw0 = guzw.a;
        }
        LoyaltyCardProgram loyaltyCardProgram0 = new LoyaltyCardProgram(guzw0);
        this.a.K(loyaltyCardProgram0);
    }
}

