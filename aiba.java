import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class aiba implements azys {
    public final ConsentPromptUserResponse a;

    public aiba(ConsentPromptUserResponse consentPromptUserResponse0) {
        this.a = consentPromptUserResponse0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        aibd aibd0 = (aibd)object0;
        ahyl ahyl0 = (ahyl)aibd0.H();
        ApiMetadata apiMetadata0 = cclr.a(aibd0.r);
        ahyl0.c(this.a, apiMetadata0);
        azzf.a(Status.b, ((evqp)object1));
    }
}

