import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.content.Context;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import j..util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class dctq {
    public final dcst a;
    public final dcta b;
    public final icnj c;
    public final icnl d;
    private static final String e;
    private final Context f;
    private final Account g;
    private final cchj h;
    private final clgu i;

    static {
        dctq.e = "oauth2:" + hvqs.aV();
    }

    @AssistedInject
    public dctq(Context context0, clgu clgu0, dctc dctc0, @Assisted Account account0, @Assisted dcst dcst0) {
        ibuq.f(dctc0, "rpcClientFactory");
        ibuq.f(account0, "account");
        super();
        this.f = context0;
        this.i = clgu0;
        this.g = account0;
        this.a = dcst0;
        this.h = cchj.b(context0);
        this.b = dctc0.a(account0);
        icnl icnl0 = icnm.a(new dctw());
        this.d = icnl0;
        this.c = new icmp(icnl0);
    }

    public final Object a(String s, File file0, ibrl ibrl0) {
        String s3;
        Object object3;
        Object object2;
        dctn dctn0;
        String s1 = s;
        if((ibrl0 instanceof dctn)) {
            dctn0 = (dctn)ibrl0;
            int v = dctn0.d;
            if((v & 0x80000000) == 0) {
                dctn0 = new dctn(this, ibrl0);
            }
            else {
                dctn0.d = v - 0x80000000;
            }
        }
        else {
            dctn0 = new dctn(this, ibrl0);
        }
        Object object0 = dctn0.b;
        Object object1 = ibrx.a;
        switch(dctn0.d) {
            case 0: {
                ibnx.b(object0);
                ibuq.f(s1, "fileId");
                ibuq.f(file0, "file");
                hjiz hjiz0 = new hjiz(file0);
                clgu clgu0 = this.i;
                clbc clbc0 = new clbc(null);
                clbc0.c(hvqs.a.aT().cY());
                clbd clbd0 = new clbd(clbc0);
                ckcq ckcq0 = ckki.b;
                clcf clcf0 = clcg.a(clbd0, ckcq0);
                String s2 = this.b(this.g);
                claw claw0 = new claw(null);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcty.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                if(s2 != null) {
                    List list0 = DesugarCollections.unmodifiableList(((dcty)hftp0.b_message).b);
                    ibuq.e(list0, "getAuthorizationList(...)");
                    new hfxu(list0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dcty dcty0 = (dcty)hftp0.b_message;
                    hfuo hfuo0 = dcty0.b;
                    if(!hfuo0.c()) {
                        dcty0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    dcty0.b.add("Bearer " + s2);
                }
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                claw0.b(((MessageLite)(((dcty)hftv0))), ckki.c, dctz.a);
                clax clax0 = new clax(claw0);
                hjjz hjjz0 = new hjjz();
                hjjz0.a();
                object2 = clgu0.a(clcf0, "POST", clax0, hjiz0, null, new hjka(hjjz0), -1, 0x2604, ckcq0);
                try {
                    icig icig0 = icii.b(new ichv(new dctm(((hjjt)object2), this, s1, null)), 0, 2, 1);
                    dctp dctp0 = new dctp(this, s1, ((hjjt)object2));
                    dctn0.e = s1;
                    dctn0.a = object2;
                    dctn0.d = 1;
                    return icig0.oR(dctp0, dctn0) == object1 ? object1 : ibom.a;
                }
                catch(CancellationException cancellationException0) {
                    goto label_65;
                }
                catch(hjjv hjjv0) {
                    goto label_75;
                }
                return object1;
            }
            case 1: {
                try {
                    object3 = dctn0.a;
                    s3 = dctn0.e;
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object3;
                    s1 = s3;
                label_65:
                    dcvz.a.e().f(cancellationException0).h("File[%s]: Collecting coroutine cancelled.", s1);
                    dctu dctu0 = new dctu(s1, ((hjjt)object2));
                    dctn0.e = null;
                    dctn0.a = null;
                    dctn0.d = 2;
                    return this.d.a(dctu0, dctn0) == object1 ? object1 : ibom.a;
                }
                catch(hjjv hjjv0) {
                    object2 = object3;
                    s1 = s3;
                }
            label_75:
                dcvz.a.e().f(hjjv0).h("File[%s]: TransferException on collecting coroutine.", s1);
                dctn0.e = null;
                dctn0.a = null;
                dctn0.d = 3;
                return this.d.a(new dctu(s1, ((hjjt)object2), hjjv0.a()), dctn0) == object1 ? object1 : ibom.a;
            }
            case 2: 
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final String b(Account account0) {
        try {
            return this.h.c(account0, dctq.e, true);
        }
        catch(IOException iOException0) {
            dcvz.a.e().f(iOException0).p("Encounter IOException when getting auth token for cloud sharing.", new Object[0]);
            return null;
        }
        catch(AuthenticatorException authenticatorException0) {
            dcvz.a.e().f(authenticatorException0).p("Encounter AuthenticatorException when getting auth token for cloud sharing.", new Object[0]);
            return null;
        }
    }
}

