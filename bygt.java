import android.util.Log;
import com.google.android.gms.identitycredentials.ui.CredentialSelectorChimeraActivity;

public final class bygt implements ibtx {
    final bzcc a;
    final CredentialSelectorChimeraActivity b;
    final aca c;
    final byns d;
    final aca e;
    final bzaz f;

    public bygt(bzcc bzcc0, CredentialSelectorChimeraActivity credentialSelectorChimeraActivity0, aca aca0, byns byns0, aca aca1, bzaz bzaz0) {
        this.a = bzcc0;
        this.b = credentialSelectorChimeraActivity0;
        this.c = aca0;
        this.d = byns0;
        this.e = aca1;
        this.f = bzaz0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$ModalBottomSheet");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dls.B(dls.w(cci.b(hfc.e)));
        bzcc bzcc0 = this.a;
        CredentialSelectorChimeraActivity credentialSelectorChimeraActivity0 = this.b;
        aca aca0 = this.c;
        byns byns0 = this.d;
        aca aca1 = this.e;
        bzaz bzaz0 = this.f;
        iau iau0 = dhw.a(hei.a, false);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        if(bzcc0 != null) {
            ((goz)object1).M(-1702460544);
            if(bzcc0.c.a.isEmpty()) {
                Log.e("CredentialSelector", "There are no available exporters");
                CredentialSelectorChimeraActivity.f(credentialSelectorChimeraActivity0);
            }
            else {
                bzcb.b(credentialSelectorChimeraActivity0.a(), bzcc0, aca0, ((goz)object1), 584);
            }
            ((goz)object1).A();
        }
        else if(byns0 != null) {
            ((goz)object1).M(0x9A8F7D7F);
            bynr.a(credentialSelectorChimeraActivity0.a(), byns0, aca0, aca1, ((goz)object1), 4680);
            ((goz)object1).A();
        }
        else if(bzaz0 == null) {
            ((goz)object1).M(0x9A992505);
            ((goz)object1).A();
            Log.e("CredentialSelector", "Failed to initialize the ui for any flow.");
            CredentialSelectorChimeraActivity.f(credentialSelectorChimeraActivity0);
        }
        else {
            ((goz)object1).M(-1701532280);
            bzay.f(credentialSelectorChimeraActivity0.a(), bzaz0, aca0, aca1, ((goz)object1), 4680);
            ((goz)object1).A();
        }
        ((goz)object1).z();
        return ibom.a;
    }
}

