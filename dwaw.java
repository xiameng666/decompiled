import com.google.android.gms.pay.pass.valuable.model.program.GiftCardProgram;

public final class dwaw implements dpug {
    public final dway a;

    public dwaw(dway dway0) {
        this.a = dway0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        guzv guzv0 = ((gvaa)object0).b;
        if(guzv0 == null) {
            guzv0 = guzv.a;
        }
        GiftCardProgram giftCardProgram0 = new GiftCardProgram(guzv0);
        this.a.K(giftCardProgram0);
    }
}

