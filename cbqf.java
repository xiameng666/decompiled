import android.accounts.Account;
import android.app.Application;
import android.os.UserManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class cbqf extends ibsl implements ibtw {
    final cbqh a;
    final Account b;

    public cbqf(cbqh cbqh0, Account account0, ibrl ibrl0) {
        this.a = cbqh0;
        this.b = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbqf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbqf(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        lqi lqi0 = this.a.b;
        lqi0.ii(cbqb.f);
        Application application0 = this.a.a();
        gvnb gvnb0 = gvna.a(((ProtoLiteMessage)gvmz.a).v_newBuilder());
        gvnb0.b();
        gvmz gvmz0 = gvnb0.a();
        cboa cboa0 = hukj.c() ? cboa.a : cboa.b;
        try {
            Object object1 = application0.getSystemService(UserManager.class);
            ibuq.c(object1);
            cbob cbob0 = cbob.a.a();
            String s = this.b.name;
            ibuq.e(s, "name");
            ibuq.e(ckie.b, "CD_INITIATOR_CATEGORY_2");
            gvmk gvmk0 = cbvx.a();
            hfuo hfuo0 = cbob0.a(gvmz0, application0, s, ckie.b, gvmk0, cboa0).b;
            ibuq.e(hfuo0, "getMembersList(...)");
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: hfuo0) {
                gvnd gvnd0 = ((gvmq)object2).d;
                if(gvnd0 == null) {
                    gvnd0 = gvnd.a;
                }
                if(gvnd0.b) {
                    arrayList0.add(object2);
                }
            }
            Object object3 = new ArrayList(ibpo.q(arrayList0, 10));
            for(Object object4: arrayList0) {
                gvmq gvmq0 = (gvmq)object4;
                String s1 = (gvmq0.c == null ? gvmr.a : gvmq0.c).e;
                ibuq.e(s1, "getEmail(...)");
                String s2 = s1.length() <= 0 ? (gvmq0.c == null ? gvmr.a : gvmq0.c).f : (gvmq0.c == null ? gvmr.a : gvmq0.c).e;
                ibuq.c(s2);
                ibuq.c(gvmq0);
                ((Collection)object3).add(new cbqc(gvmq0, ((UserManager)object1).someUserHasAccount(s2, "com.google")));
            }
            if(((List)object3).isEmpty()) {
                lqi0.ii(cbqb.g);
                return object3;
            }
            lqi0.ii(cbqb.h);
            return object3;
        }
        catch(acse acse0) {
            a.ae(cbqh.a.j(), "Failed to load children: Google Auth exception", acse0);
            this.a.b.ii(cbqb.i);
        }
        catch(iapl iapl0) {
            a.ae(cbqh.a.j(), "Failed to load children: Status Exception", iapl0);
            if(iapl0.a.t.ordinal() == 5) {
                this.a.b.ii(cbqb.g);
            }
            else {
                this.a.b.ii(cbqb.i);
            }
        }
        Object object5 = Collections.EMPTY_LIST;
        ibuq.e(object5, "emptyList(...)");
        return object5;
    }
}

