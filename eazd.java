import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetBulletinsRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.List;

@cmcs(a = cmcr.c)
public final class eazd extends ebav {
    public AndroidInjector a;
    public Account b;
    public dlvt c;
    public dlvx d;
    public dpyp e;
    public dqhb f;
    private final GetBulletinsRequest g;
    private final donp h;
    private final bboh n;

    public eazd(GetBulletinsRequest getBulletinsRequest0, String s, donp donp0, azug azug0) {
        ibuq.f(getBulletinsRequest0, "request");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("GetCallouts", s, azug0);
        this.g = getBulletinsRequest0;
        this.h = donp0;
        this.n = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // ebaw
    public final void b(Context context0) {
        String s1;
        ibuq.f(context0, "context");
        String s = this.g.a.name;
        ibuq.e(s, "name");
        dlvx dlvx0 = null;
        try {
            s1 = acso.e(context0, s);
            goto label_13;
        }
        catch(IOException iOException0) {
            a.ae(this.n.i(), "Failed to fetch account ID.", iOException0);
        }
        catch(acse acse0) {
            a.ae(this.n.i(), "Failed to fetch account ID.", acse0);
        }
        this.h.q(Status.d, null);
        s1 = null;
    label_13:
        if(s1 != null) {
            if(this.a == null) {
                dola dola0 = new dola(s, s1, dlmf.e(context0, dmgv.d()));
                domw domw0 = this.i;
                dpss dpss0 = dpst.a(dola0);
                edlf edlf0 = new edlf();
                dnya dnya0 = new dnya(this.g);
                dmgr dmgr0 = new dmgr(this.j);
                edop edop0 = new edop();
                dmhd dmhd0 = new dmhd(hgeh.b);
                domv domv0 = domu.a(AppContextProvider.a());
                Preconditions.b(domv0);
                this.a = new eaun(dola0, dmgr0, dnya0, new eefy("", 0L), dmhd0, dpss0, domw0, edlf0, edop0, domv0);
            }
            AndroidInjector androidInjector0 = this.a;
            if(androidInjector0 == null) {
                ibuq.j("component");
                androidInjector0 = null;
            }
            androidInjector0.inject(this);
            try {
                dpyp dpyp0 = this.e;
                if(dpyp0 == null) {
                    ibuq.j("onboardingDatastore");
                    dpyp0 = null;
                }
                if(dpyp0.a()) {
                    goto label_49;
                }
                else {
                    goto label_40;
                }
                goto label_70;
            }
            catch(dmhl dmhl0) {
                a.ae(this.n.i(), "Failed to read onboarding state, assuming completed.", dmhl0);
                goto label_49;
            }
        label_40:
            Boolean boolean0 = (Boolean)icbb.c(new eazc(this, null));
            if(boolean0 == null) {
                ((ggtj)this.n.i()).x("Get data from proto data store timed-out, assuming onboarding is complete.");
                goto label_49;
            }
            else if(boolean0.booleanValue()) {
            label_49:
                dlvt dlvt0 = this.c;
                if(dlvt0 == null) {
                    ibuq.j("bulletinDataManager");
                    dlvt0 = null;
                }
                gged_interceptors gged0 = dlvt0.a();
                dluh dluh0 = dlug.a(((ProtoLiteMessage)dluf.a).v_newBuilder());
                ProtoLiteBuilder hftp0 = dluh0.a;
                List list0 = DesugarCollections.unmodifiableList(((dluf)hftp0.b_message).b);
                ibuq.e(list0, "getCalloutsList(...)");
                new hfxu(list0);
                ibuq.c(gged0);
                ibuq.f(gged0, "values");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dluf dluf0 = (dluf)hftp0.b_message;
                hfuo hfuo0 = dluf0.b;
                if(!hfuo0.c()) {
                    dluf0.b = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(gged0, dluf0.b);
                ProtoSafeParcelable protoSafeParcelable1 = ftqe.a(((MessageLite)dluh0.a()));
                this.h.q(Status.b, protoSafeParcelable1);
            }
            else {
                ((ggtj)this.n.h()).x("Onboarding incomplete. No callouts.");
                ProtoSafeParcelable protoSafeParcelable0 = ftqe.a(((MessageLite)dlug.a(((ProtoLiteMessage)dluf.a).v_newBuilder()).a()));
                this.h.q(Status.b, protoSafeParcelable0);
            }
        label_70:
            if(this.g.b) {
                try {
                    dlvx dlvx1 = this.d;
                    if(dlvx1 == null) {
                        ibuq.j("bulletinSyncManager");
                    }
                    else {
                        dlvx0 = dlvx1;
                    }
                    dlvx0.a(true);
                }
                catch(IOException iOException1) {
                    a.ae(this.n.i(), "Could not sync callouts from server.", iOException1);
                }
                catch(dpuk dpuk0) {
                    a.ae(this.n.i(), "Could not sync callouts from server.", dpuk0);
                }
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.h.q(Status.d, null);
    }
}

