import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetSettingsRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@cmcs(a = cmcr.c)
public final class ebac extends ebav {
    ecga a;
    private final String b;
    private final GetSettingsRequest c;
    private final donp d;
    private AndroidInjector e;

    public ebac(GetSettingsRequest getSettingsRequest0, String s, donp donp0, azug azug0) {
        super("GetSettings", s, azug0);
        this.b = s;
        this.c = getSettingsRequest0;
        this.d = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        GetSettingsRequest getSettingsRequest0 = this.c;
        String s = getSettingsRequest0.a.name;
        String s1 = dlmj.b(context0, s);
        if(s1 == null) {
            Status status0 = new Status(8);
            this.d.q(status0, null);
            return;
        }
        if(this.e == null) {
            domw domw0 = this.i;
            dola dola0 = dlmg.a(AppContextProvider.a(), s, s1);
            dmgr dmgr0 = new dmgr(this.b);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            domq domq0 = domp.a();
            Preconditions.b(domq0);
            this.e = new eavw(dola0, dmgr0, domw0, domq0, domv0);
        }
        this.e.inject(this);
        try {
            ProtoSafeParcelable protoSafeParcelable0 = ftqe.a(((MessageLite)this.a.a(getSettingsRequest0)));
            this.d.q(Status.b, protoSafeParcelable0);
        }
        catch(IOException | dpuk exception1) {
            throw new cjuh(7, null, null, exception1);
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            throw new cjuh(8, null, null, exception0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.q(status0, null);
    }
}

