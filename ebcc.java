import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.UpdateSettingsRequest;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import java.io.IOException;

@cmcs(a = cmcr.c)
public final class ebcc extends ebav {
    ecga a;
    private final String b;
    private final UpdateSettingsRequest c;
    private final donp d;
    private AndroidInjector e;

    public ebcc(UpdateSettingsRequest updateSettingsRequest0, String s, donp donp0, azug azug0) {
        super("UpdateSettings", s, azug0);
        this.b = s;
        this.c = updateSettingsRequest0;
        this.d = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        UpdateSettingsRequest updateSettingsRequest0 = this.c;
        String s = updateSettingsRequest0.a.name;
        String s1 = dlmj.b(context0, s);
        if(s1 == null) {
            this.d.x(Status.d);
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
            this.e = new eayx(dola0, dmgr0, domw0, domv0, domq0);
        }
        this.e.inject(this);
        try {
            this.a.c(updateSettingsRequest0);
            this.d.x(Status.b);
        }
        catch(IOException | dpuk | ecfz exception0) {
            throw new cjuh(7, null, null, exception0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.x(status0);
    }
}

