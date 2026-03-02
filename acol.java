import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.UUID;

public final class acol extends cjtm {
    public static final baun a;
    public final Context b;
    public final acoy c;
    public int d;
    public final bcqx e;
    public final UUID f;
    private final GetAsterismConsentRequest g;
    private hobg h;
    private final bcqh i;

    static {
        acol.a = bcrh.a("api_get_asterism_consent");
    }

    public acol(Context context0, acoy acoy0, GetAsterismConsentRequest getAsterismConsentRequest0, azug azug0) {
        super(0xC7, "GetAsterismConsent", azug0);
        this.i = new acok(this, new bblf(new bblg(10)));
        this.b = context0;
        this.c = acoy0;
        this.g = getAsterismConsentRequest0;
        this.e = bcqx.a(context0);
        this.f = UUID.randomUUID();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        bcqx bcqx0 = this.e;
        UUID uUID0 = this.f;
        bcqx0.L(uUID0, 14);
        if(!hrcv.d()) {
            bcqx0.f(uUID0, gmfz.bb, gmfx.aN);
            this.j(new Status(34500));
            return;
        }
        GetAsterismConsentRequest getAsterismConsentRequest0 = this.g;
        if(getAsterismConsentRequest0 == null) {
            bcqx0.f(uUID0, gmfz.bb, gmfx.aO);
            this.j(new Status(34502));
            return;
        }
        this.d = getAsterismConsentRequest0.a;
        switch(getAsterismConsentRequest0.b) {
            case 1: {
                this.h = hobg.b;
                break;
            }
            case 2: {
                this.h = hobg.c;
                break;
            }
            default: {
                bcqx0.f(uUID0, gmfz.bb, gmfx.aP);
                this.j(new Status(34502));
                return;
            }
        }
        if(hrcv.e()) {
            bcpv.a(context0);
            if(!bcpv.b(context0)) {
                bcqx0.f(uUID0, gmfz.bb, gmfx.aY);
                this.j(new Status(34505));
                return;
            }
        }
        bbvl.h();
        hobg hobg0 = this.h;
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.GET_ASTERISM_CONSENT");
        intent0.putExtra("eventmanager.session_id", uUID0.toString());
        intent0.putExtra("eventmanager.trigger_type", 11);
        intent0.putExtra("eventmanager.extra_param", Bundle.EMPTY);
        intent0.putExtra("eventmanager.aster_client", hobg0.a());
        intent0.putExtra("eventmanager.on_sync_complete_callback_key", this.i.f);
        context0.startService(intent0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        GetAsterismConsentResponse getAsterismConsentResponse0 = acod.a(this.d, 0, "", "", 0);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
        this.c.a(status0, getAsterismConsentResponse0, apiMetadata0);
    }
}

