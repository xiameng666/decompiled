import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.NewUserRequest.Builder;
import android.os.PersistableBundle;
import android.os.UserManager;

final class cbqq extends ibsl implements ibtw {
    Object a;
    int b;
    final cbqu c;
    final String d;
    final Bundle e;
    final String f;

    public cbqq(cbqu cbqu0, String s, Bundle bundle0, String s1, ibrl ibrl0) {
        this.c = cbqu0;
        this.d = s;
        this.e = bundle0;
        this.f = s1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbqq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbqq(this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_50;
        }
        ibnx.b(object0);
        cbqu cbqu0 = this.c;
        String s = this.d;
        Context context0 = cbqu0.requireContext();
        this.a = context0;
        this.b = 1;
        gvnb gvnb0 = gvna.a(((ProtoLiteMessage)gvmz.a).v_newBuilder());
        gvnb0.b();
        gvmz gvmz0 = gvnb0.a();
        cboa cboa0 = hukj.c() ? cboa.a : cboa.b;
        try {
            Account account0 = (Account)cbqu0.y().d.ij();
            if(account0 == null) {
                goto label_47;
            }
            else {
                cbob cbob0 = cbob.a.a();
                Context context1 = cbqu0.requireContext();
                String s1 = account0.name;
                ibuq.e(s1, "name");
                ibuq.e(ckie.b, "CD_INITIATOR_CATEGORY_2");
                gvmk gvmk0 = cbvx.a();
                hfuo hfuo0 = cbob0.a(gvmz0, context1, s1, ckie.b, gvmk0, cboa0).b;
                ibuq.e(hfuo0, "getMembersList(...)");
                for(Object object3: hfuo0) {
                    if(!ibuq.m(((gvmq)object3).b, s)) {
                        continue;
                    }
                    goto label_31;
                }
                object3 = null;
            label_31:
                if(((gvmq)object3) == null) {
                    object0 = null;
                }
                else {
                    gvmr gvmr0 = ((gvmq)object3).c;
                    if(gvmr0 == null) {
                        gvmr0 = gvmr.a;
                    }
                    object0 = gvmr0 == null ? null : gvmr0.c;
                }
            }
            goto label_48;
        }
        catch(acse acse0) {
            a.ae(cbqu.b.j(), "Failed to get display name: Google Auth exception.", acse0);
        }
        catch(iapl iapl0) {
            a.ae(cbqu.b.j(), "Failed to get display name: Status Exception.", iapl0);
        }
        object0 = null;
        goto label_48;
    label_47:
        object0 = null;
    label_48:
        if(object0 != object1) {
            object2 = context0;
        label_50:
            String s2 = (String)object0;
            if(s2 == null) {
                s2 = "Child";
                ibuq.e("Child", "getString(...)");
            }
            ibns[] arr_ibns = new ibns[2];
            int v = 0;
            arr_ibns[0] = new ibns("isExpeditedSetup", Boolean.valueOf(false));
            arr_ibns[1] = new ibns("prefetchRequiredModules", Boolean.valueOf(true));
            PersistableBundle persistableBundle0 = jzg.a(arr_ibns);
            if(hujz.a.b().a()) {
                String s3 = cbqv.a(this.e);
                ibuq.f(s3, "value");
                for(Object object4: ibzk.ad(s3, 1000)) {
                    persistableBundle0.putString("ENCRYPTED_SESSION_BUNDLE" + (v == 0 ? "" : String.valueOf(v)), ((String)object4));
                    ++v;
                }
            }
            else {
                persistableBundle0.putString("ENCRYPTED_SESSION_BUNDLE", cbqv.a(this.e));
            }
            Object object5 = ((Context)object2).getSystemService(UserManager.class);
            ibuq.c(object5);
            NewUserRequest.Builder newUserRequest$Builder0 = new NewUserRequest.Builder();
            String s4 = this.f;
            newUserRequest$Builder0.setName(s2);
            if(ibzk.J(s4, "@gserviceslimited.com") && bbod.c(hpgg.b())) {
                s4 = s2;
            }
            newUserRequest$Builder0.setAccountName(s4);
            newUserRequest$Builder0.setAccountType("com.google");
            newUserRequest$Builder0.setAccountOptions(persistableBundle0);
            return new ibns(((UserManager)object5).createUser(newUserRequest$Builder0.build()), s2);
        }
        return object1;
    }
}

