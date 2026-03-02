import android.content.Context;
import android.nfc.NfcAdapter;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

public final class eswj {
    private final Context a;

    public eswj(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    public final eswi a() {
        if(!hysx.j() && hysx.i() && (!hysx.h() || !cjpd.i(new eubv(this.a).c, "has_dck_key", false)) && (hysx.l() || !hysx.g() || !new eubv(this.a).q())) {
            return hysx.a.f().l() ? eswi.b : eswi.a;
        }
        return eswi.c;
    }

    public final boolean b() {
        if(!hysx.j() && jys.d()) {
            NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(this.a);
            return nfcAdapter0 != null && nfcAdapter0.isObserveModeSupported();
        }
        return false;
    }

    public final boolean c() {
        if(hysx.j()) {
            return false;
        }
        int v = this.a().ordinal();
        switch(v) {
            case 0: {
                return true;
            }
            case 1: {
                Context context0 = this.a;
                etmk etmk0 = new etmk(context0);
                ibuq.f(ibzz.c, "<this>");
                long v1 = hysx.b();
                boolean z = etmk0.b(((int)ibzz.c.h.toSeconds(v1)));
                if(hysx.m()) {
                    esgi esgi0 = esgj.g(context0, null);
                    if(esgi0 != null) {
                        CardInfo cardInfo0 = new etrk(esgi0).b();
                        return cardInfo0 == null ? !z : !z || eswo.f(esgi0, cardInfo0);
                    }
                }
                return !z;
            }
            default: {
                if(v == 2) {
                    return false;
                }
                throw new ibnq();
            }
        }
    }
}

