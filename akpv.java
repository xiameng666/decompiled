import android.content.res.Resources.NotFoundException;
import com.google.android.gms.auth.managed.ui.GenericChimeraActivity;

public final class akpv {
    public akqh a;
    public final GenericChimeraActivity b;

    public akpv(GenericChimeraActivity genericChimeraActivity0) {
        this.b = genericChimeraActivity0;
    }

    public final akqg a() {
        du du0 = this.b.gy().g(0x1020002);
        if((du0 instanceof akqb)) {
            return akqg.a;
        }
        if((du0 instanceof akqa)) {
            return ((akqa)du0).a;
        }
        throw new IllegalStateException("Unknown fragment type loaded in unmanaged work profile opt in");
    }

    final void b(String s) {
        akqa akqa0;
        GenericChimeraActivity genericChimeraActivity0 = this.b;
        if(genericChimeraActivity0.gy().h(s) == null) {
            ca ca0 = new ca(genericChimeraActivity0.gy());
            switch(s) {
                case "UnmanagedWorkProfileBriefcaseBadgeScreen": {
                    akpz akpz1 = new akpz(null);
                    akpz1.c(0x7F153491);  // string:unmanaged_work_profile_opt_in_briefcase_badge_header "Work apps are marked 
                                          // with a briefcase badge"
                    akpz1.a = gfqx.a;
                    akpz1.b(0x7F15089B);  // string:common_next "Next"
                    akpz1.d(akqg.c);
                    akqa0 = akpz1.a();
                    break;
                }
                case "UnmanagedWorkProfileLoadingScreen": {
                    akqa0 = new akqb();
                    break;
                }
                case "UnmanagedWorkProfileSeparateAppsScreen": {
                    akpz akpz0 = new akpz(null);
                    akpz0.c(0x7F153493);  // string:unmanaged_work_profile_opt_in_separate_apps_header "Separate work apps from 
                                          // personal to stay organised?"
                    akpz0.a = gfsx.m(Integer.valueOf(0x7F1508A4));  // string:common_not_now "Not now"
                    akpz0.b(0x7F153492);  // string:unmanaged_work_profile_opt_in_separate_apps_accept_text "Separate apps"
                    akpz0.d(akqg.b);
                    akqa0 = akpz0.a();
                    break;
                }
                default: {
                    throw new Resources.NotFoundException("Cannot find a fragment for provided tag: " + s);
                }
            }
            ca0.z(0x1020002, akqa0, s);
            ca0.a();
        }
    }
}

