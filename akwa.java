import android.accounts.Account;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class akwa {
    private final ajes a;
    private final akww b;
    private final akws c;

    public akwa(ajes ajes0, akww akww0, akws akws0) {
        this.a = ajes0;
        this.b = akww0;
        this.c = akws0;
    }

    public final evql a(Account account0, alem alem0, int v) {
        if(cpje.c()) {
            if(hpyt.d()) {
                return this.b.a().f(new bblp(1, 10), new akvy(this, account0, alem0, v));
            }
            if(hpyw.h()) {
                try {
                    return evrg.d(this.b.d(account0)).f(new bblp(1, 10), new akvy(this, account0, alem0, v));
                }
                catch(IOException iOException0) {
                    throw new akvz(iOException0);
                }
            }
            ArrayList arrayList0 = new ArrayList();
            return evrg.d(this.b.e(account0, arrayList0)).f(new bblp(1, 10), new akvy(this, account0, alem0, v));
        }
        if(hpyt.d()) {
            return this.b(account0, this.b.f(), alem0, v);
        }
        if(hpyw.h()) {
            try {
                return this.b(account0, this.b.d(account0), alem0, v);
            }
            catch(IOException iOException1) {
                throw new akvz(iOException1);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        return this.b(account0, this.b.e(account0, arrayList1), alem0, v);
    }

    public final evql b(Account account0, List list0, alem alem0, int v) {
        String s;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqut.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqut gqut0 = (gqut)hftp0.b_message;
        hfuf hfuf0 = gqut0.b;
        if(!hfuf0.c()) {
            gqut0.b = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: list0) {
            gqut0.b.i(((gqus)object0).a());
        }
        akws akws0 = this.c;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: akws0.b.b(account0, arrayList1)) {
            gqus gqus0 = (gqus)object1;
            if(!akws0.c.g(account0, gqus0)) {
                arrayList0.add(gqus0);
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqut gqut1 = (gqut)hftp0.b_message;
        hfuf hfuf1 = gqut1.c;
        if(!hfuf1.c()) {
            gqut1.c = ProtoLiteMessage.C(hfuf1);
        }
        for(Object object2: arrayList0) {
            gqut1.c.i(((gqus)object2).a());
        }
        gqut gqut2 = (gqut)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqux.a).v_newBuilder();
        gquw gquw0 = gquw.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqux gqux0 = (gqux)hftp1.b_message;
        gqux0.b = gquw0.a();
        ByteString hfsf0 = gqut2.getDefaultInstanceForType();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gqux)hftp1.b_message).c = hfsf0;
        gqux gqux1 = (gqux)hftp1.N_build();
        ArrayList arrayList2 = ggia.d(new String[]{"PublicKey", "authzen"});
        if(hpyz.h()) {
            arrayList2.add("DeviceSync:BetterTogether");
        }
        if(alem0 == alem.b) {
            return v == 3 ? this.a.i(9, arrayList2, "ForceRegistration", account0, gqux1.toBytesArray()) : this.a.i(4, arrayList2, "ForceRegistration", account0, gqux1.toBytesArray());
        }
        if(v == 2) {
            s = hpyw.a.f().i();
            return this.a.i(4, arrayList2, s, account0, gqux1.toBytesArray());
        }
        s = alem0 == alem.c ? hpyw.a.f().h() : hpyw.a.f().g();
        return v == 3 ? this.a.i(9, arrayList2, s, account0, gqux1.toBytesArray()) : this.a.i(4, arrayList2, s, account0, gqux1.toBytesArray());
    }
}

