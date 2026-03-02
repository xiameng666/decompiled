import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetOnboardingInfoRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutionException;

@cmcs(a = cmcr.c)
public final class eazr extends ebav {
    dqhb a;
    eava b;
    private final donp c;
    private final GetOnboardingInfoRequest d;

    public eazr(GetOnboardingInfoRequest getOnboardingInfoRequest0, String s, donp donp0, azug azug0) {
        super("GetOnboardingInfo", s, azug0);
        this.c = donp0;
        this.d = getOnboardingInfoRequest0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        GetOnboardingInfoRequest getOnboardingInfoRequest0 = this.d;
        if(getOnboardingInfoRequest0.b) {
            if(this.b == null) {
                domv domv0 = domu.a(AppContextProvider.a());
                Preconditions.b(domv0);
                this.b = new eava(domv0);
            }
            this.b.inject(this);
            try {
                dqhb dqhb0 = this.a;
                Account account0 = getOnboardingInfoRequest0.a;
                gftb.check(account0);
                Boolean boolean0 = (Boolean)((glyq)dqhb0.a(account0)).u();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dpyw.a).v_newBuilder();
                boolean z = boolean0.booleanValue();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((dpyw)hftp0.b_message).d = z;
                hwoz.i();
                if(hwoz.a.b().l()) {
                    dqhb dqhb1 = this.a;
                    Account account1 = getOnboardingInfoRequest0.a;
                    gftb.check(account1);
                    dpzb dpzb0 = (dpzb)((glyq)glzd.f(dqhb1.b.a(account1).a(), new dqgd(new dqgc()), gmap.a)).u();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dpyv.a).v_newBuilder();
                    boolean z1 = dpzb0.b;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((dpyv)hftv0).b = z1;
                    boolean z2 = dpzb0.c;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((dpyv)hftp1.b_message).c = z2;
                    dpyv dpyv0 = (dpyv)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dpyw dpyw0 = (dpyw)hftp0.b_message;
                    dpyv0.getClass();
                    dpyw0.e = dpyv0;
                    dpyw0.b |= 1;
                }
                ProtoSafeParcelable protoSafeParcelable0 = new ProtoSafeParcelable();
                protoSafeParcelable0.a = ((dpyw)hftp0.N_build()).toBytesArray();
                this.c.q(Status.b, protoSafeParcelable0);
            }
            catch(ExecutionException | InterruptedException unused_ex) {
                this.c.q(Status.d, null);
            }
            return;
        }
        try {
            boolean z3 = new dpyp(context0).a();
            donp donp0 = this.c;
            Status status0 = Status.b;
            ProtoSafeParcelable protoSafeParcelable1 = new ProtoSafeParcelable();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dpyw.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((dpyw)hftp2.b_message).c = z3;
            protoSafeParcelable1.a = ((dpyw)hftp2.N_build()).toBytesArray();
            donp0.q(status0, protoSafeParcelable1);
        }
        catch(dmhl dmhl0) {
            throw new cjuh(8, "Could not read from Wallet onboarding proto data store", null, dmhl0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.q(Status.d, null);
    }
}

