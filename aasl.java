import com.google.android.gms.accountsettings.mg.ui.main.MainChimeraActivity;
import j..util.Objects;

public final class aasl implements lqj {
    public final MainChimeraActivity a;

    public aasl(MainChimeraActivity mainChimeraActivity0) {
        this.a = mainChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(aaua.c(((aatb)object0))) {
            MainChimeraActivity mainChimeraActivity0 = this.a;
            if(!Objects.equals(cjpd.c(mainChimeraActivity0.o, "google.account_settings.selected_account", null), ((aatb)object0).b)) {
                cjpa cjpa0 = mainChimeraActivity0.o.c();
                cjpa0.h("google.account_settings.selected_account", ((aatb)object0).b);
                cjpd.f(cjpa0);
                mainChimeraActivity0.l(((aatb)object0));
            }
        }
    }
}

