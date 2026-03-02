import android.view.View;
import android.widget.Toast;
import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;
import com.google.android.gms.auth.api.credentials.yolo.ui.EventsInterceptableLinearLayout;
import j..util.Objects;
import java.util.ArrayList;

public final class ahkt implements gmbg {
    final CredentialsSettingsChimeraActivity a;

    public ahkt(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity0) {
        Objects.requireNonNull(credentialsSettingsChimeraActivity0);
        this.a = credentialsSettingsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.m(true);
        this.a.g();
        Toast.makeText(this.a.getContainerActivity(), "Failed to load credential settings for this account", 1).show();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity0 = this.a;
        credentialsSettingsChimeraActivity0.m(false);
        new ArrayList();
        ArrayList arrayList0 = new ArrayList(((AccountCredentialSettings)object0).c);
        arrayList0.clear();
        ahks ahks0 = new ahks(this);
        arrayList0.addAll(gged_interceptors.h(gggq.d(((AccountCredentialSettings)object0).c, ahks0)));
        AccountCredentialSettings accountCredentialSettings0 = new AccountCredentialSettings(((AccountCredentialSettings)object0).a, ((AccountCredentialSettings)object0).b, arrayList0, ((AccountCredentialSettings)object0).d);
        credentialsSettingsChimeraActivity0.p = accountCredentialSettings0;
        if(accountCredentialSettings0.d) {
            credentialsSettingsChimeraActivity0.n(false);
            credentialsSettingsChimeraActivity0.n.setVisibility(0);
            credentialsSettingsChimeraActivity0.o.setVisibility(8);
            return;
        }
        credentialsSettingsChimeraActivity0.n(true);
        credentialsSettingsChimeraActivity0.n.setVisibility(8);
        credentialsSettingsChimeraActivity0.o.setVisibility(0);
        boolean z = accountCredentialSettings0.a;
        credentialsSettingsChimeraActivity0.j.setChecked(z);
        credentialsSettingsChimeraActivity0.k.setChecked(accountCredentialSettings0.b);
        credentialsSettingsChimeraActivity0.l.removeAllViews();
        for(Object object1: accountCredentialSettings0.c) {
            String s = axzh.b(((String)object1));
            View view0 = credentialsSettingsChimeraActivity0.getLayoutInflater().inflate(0x7F0E025D, null, false);  // layout:credentials_app_item
            credentialsSettingsChimeraActivity0.l(view0, s);
            credentialsSettingsChimeraActivity0.l.addView(view0);
            view0.setOnClickListener(new ahkk(credentialsSettingsChimeraActivity0, s));
        }
        EventsInterceptableLinearLayout eventsInterceptableLinearLayout0 = (EventsInterceptableLinearLayout)credentialsSettingsChimeraActivity0.findViewById(0x7F0B1378);  // id:extra_options
        float f = eventsInterceptableLinearLayout0.getAlpha();
        if(!z) {
            if(f != 0.5f) {
                eventsInterceptableLinearLayout0.setVisibility(0);
                eventsInterceptableLinearLayout0.setAlpha(1.0f);
                eventsInterceptableLinearLayout0.a = true;
                eventsInterceptableLinearLayout0.animate().alpha(0.5f).setListener(new ahkr(credentialsSettingsChimeraActivity0, eventsInterceptableLinearLayout0));
            }
        }
        else if(f != 1.0f) {
            eventsInterceptableLinearLayout0.setAlpha(0.5f);
            eventsInterceptableLinearLayout0.animate().alpha(1.0f).setListener(new ahkq(credentialsSettingsChimeraActivity0, eventsInterceptableLinearLayout0));
        }
        if(!z && bbmn.h(credentialsSettingsChimeraActivity0, "com.google.android.gms").size() > 1) {
            credentialsSettingsChimeraActivity0.findViewById(0x7F0B20EF).setVisibility(0);  // id:storage_enabled_helper_text
            return;
        }
        credentialsSettingsChimeraActivity0.findViewById(0x7F0B20EF).setVisibility(8);  // id:storage_enabled_helper_text
    }
}

