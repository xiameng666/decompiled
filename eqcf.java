import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import j..util.Objects;
import java.util.ArrayList;

final class eqcf implements Runnable {
    final eqck a;

    public eqcf(eqck eqck0) {
        Objects.requireNonNull(eqck0);
        this.a = eqck0;
        super();
    }

    @Override
    public final void run() {
        eqck eqck0 = this.a;
        Context context0 = eqck0.j;
        int v = erpb.a(context0).p("com.google").length;
        eqlx eqlx0 = eqck0.k;
        eqlx0.j(v);
        evql evql0 = eqck0.B;
        if(evql0 != null) {
            bbre bbre0 = new bbre(eqck0.f);
            evql0.v(bbre0, new eqby(eqck0));
            evql0.y(bbre0, new eqbz(eqck0));
        }
        evql evql1 = eqck0.C;
        if(evql1 != null) {
            evql1.y(new bbre(eqck0.f), new eqbw(eqck0));
        }
        evql evql2 = eqck0.D;
        if(evql2 != null) {
            evql2.s(new bbre(eqck0.f), new eqcc(eqck0));
        }
        gmcd gmcd0 = eqck0.E;
        if(gmcd0 != null) {
            gmcd0.hB(new eqbx(eqck0, gmcd0), new bbre(eqck0.f));
        }
        boolean z = erpc.a(eqck0.s);
        if(z) {
            eqck.h.j("Starting account transfer (3p mfm/AT API)", new Object[0]);
            boolean z1 = eqck0.w;
            eqck0.A = new epzj(context0, eqlx0, eqck0.H, eqck0.t.booleanValue(), eqck0.s.i);
            eqck0.A.c(z1);
        }
        if(eqck0.w) {
            eqck.h.j("Starting Fido flow.", new Object[0]);
            if(eqck0.I == null) {
                eqck0.I = new eqcp(context0, eqck0.J);
            }
            ArrayList arrayList0 = eqck0.m.g;
            if(eqck0.t.booleanValue()) {
                eqck0.I.d(arrayList0);
            }
            else {
                eqck0.I.c(arrayList0);
            }
            eqlx0.z(8);
            eqlx0.s(4);
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.x(5);
            messagePayload0.am(new SecondDeviceAuthPayload(eqck0.x));
            if(eqck0.y) {
                eqlf eqlf0 = eqrn.b(context0);
                for(Object object0: arrayList0) {
                    BootstrapAccount bootstrapAccount0 = (BootstrapAccount)object0;
                    if(eqlf0.c(new Account(bootstrapAccount0.b, bootstrapAccount0.c))) {
                        bootstrapAccount0.s(true);
                    }
                }
                SecondDeviceAuthPayload secondDeviceAuthPayload0 = messagePayload0.p;
                secondDeviceAuthPayload0.h.add(Integer.valueOf(8));
                secondDeviceAuthPayload0.g = arrayList0;
            }
            eqck0.m(messagePayload0);
        }
        if(!z && !eqck0.w) {
            eqck.h.j("Starting account transfer (classic)", new Object[0]);
            eqck0.z = eqck0.o.a(context0, eqlx0, eqck0.H, eqck0.u, eqck0.t.booleanValue(), eqck0.m.g);
            eqck0.z.c();
        }
    }
}

