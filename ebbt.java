import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.SetOnboardingInfoRequest;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

@cmcs(a = cmcr.c)
public final class ebbt extends ebav {
    dqhb a;
    eayj b;
    private final donp c;
    private final SetOnboardingInfoRequest d;

    public ebbt(SetOnboardingInfoRequest setOnboardingInfoRequest0, String s, donp donp0, azug azug0) {
        super("SetOnboardingInfo", s, azug0);
        this.d = setOnboardingInfoRequest0;
        this.c = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        try {
            SetOnboardingInfoRequest setOnboardingInfoRequest0 = this.d;
            byte[] arr_b = setOnboardingInfoRequest0.a.a;
            if(arr_b == null) {
                Status status0 = new Status(10);
                this.c.x(status0);
                return;
            }
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dpyw.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(((dpyw)hftv0).d) {
                this.c();
                dqhb dqhb0 = this.a;
                Account account0 = setOnboardingInfoRequest0.b;
                gftb.check(account0);
                IntentSource intentSource0 = setOnboardingInfoRequest0.c;
                gftb.check(intentSource0);
                dqhb0.b(account0, true, new dqga(true, intentSource0.a)).get();
                this.c.x(Status.b);
                return;
            }
            hwoz.i();
            if(hwoz.a.b().k()) {
                this.c();
                Account account1 = setOnboardingInfoRequest0.b;
                if(account1 != null) {
                    dqhb dqhb1 = this.a;
                    boolean z = ((dpyw)hftv0).d;
                    IntentSource intentSource1 = setOnboardingInfoRequest0.c;
                    gftb.check(intentSource1);
                    dqhb1.b(account1, z, new dqga(true, intentSource1.a)).get();
                    dqhb dqhb2 = this.a;
                    icpu.e(iccl.b(dqhb2.a), new dqgx(dqhb2, account1, null)).get();
                    if((((dpyw)hftv0).b & 1) != 0) {
                        dqhb dqhb3 = this.a;
                        dpyv dpyv0 = ((dpyw)hftv0).e;
                        if(dpyv0 == null) {
                            dpyv0 = dpyv.a;
                        }
                        ibuq.f(dpyv0, "supervisedChildOnboardingInfo");
                        icpu.e(iccl.b(dqhb3.a), new dqha(dqhb3, account1, dpyv0, null)).get();
                    }
                }
                this.d(((dpyw)hftv0), context0);
                return;
            }
            this.d(((dpyw)hftv0), context0);
        }
        catch(dmhl | hfur | ExecutionException | InterruptedException unused_ex) {
            this.c.x(Status.d);
        }
    }

    private final void c() {
        if(this.b == null) {
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.b = new eayj(domv0);
        }
        this.b.inject(this);
    }

    private final void d(dpyw dpyw0, Context context0) {
        SQLiteDatabase sQLiteDatabase0 = dmhk.d(new dpyp(context0).a).c();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("is_onboarding_complete", Boolean.valueOf(dpyw0.c));
        contentValues0.put("environment", dmgv.d());
        if(sQLiteDatabase0.insertWithOnConflict("OnboardingInfo", null, contentValues0, 5) >= 0L) {
            this.c.x(Status.b);
            return;
        }
        this.c.x(Status.d);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.x(Status.d);
    }

    @Override  // ebav
    protected final ExecutorService r() {
        return new bblp(1, 10);
    }
}

