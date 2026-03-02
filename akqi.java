import android.accounts.Account;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.setupdesign.GlifLayout;

public final class akqi implements lqj {
    public final akql a;
    public final View b;

    public akqi(akql akql0, View view0) {
        this.a = akql0;
        this.b = view0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        akql akql0 = this.a;
        String s = akql0.getString(0x7F153681, new Object[]{(((Account)object0) == null ? "" : ((Account)object0).name)});  // string:work_profile_will_fail_description "%1$s\n\nThis account is managed by your 
                                                                                                                            // organization and can\'t be added to your personal profile.\n\nYou can use your managed 
                                                                                                                            // account in work apps marked with a briefcase badge."
        if(hpwj.g()) {
            View view0 = this.b.findViewById(0x7F0B2009);  // id:setup_wizard_layout
            if((view0 instanceof GlifLayout) && ((Account)object0) != null) {
                gaif gaif0 = (gaif)((GlifLayout)view0).t(gaif.class);
                if(gaif0 == null) {
                    ((GlifLayout)view0).K(s);
                }
                else {
                    gaif0.f(((Account)object0).name);
                    ((GlifLayout)view0).K(akql0.getString(0x7F153681, new Object[]{""}).trim().trim());  // string:work_profile_will_fail_description "%1$s\n\nThis account is managed by your 
                                                                                                         // organization and can\'t be added to your personal profile.\n\nYou can use your managed 
                                                                                                         // account in work apps marked with a briefcase badge."
                }
            }
        }
        else {
            ((TextView)akql0.getView().findViewById(0x7F0B0C08)).setText(s);  // id:auth_managed_work_profile_will_fail_description
        }
        if(((Account)object0) != null) {
            cchj cchj0 = cchj.b(akql0.getContext());
            if(!akql0.a.c) {
                if(cchj0.m(((Account)object0))) {
                    Log.i("Auth", "[AuthManaged, WorkProfileWillFail] account removed");
                    akql0.a.c = true;
                    return;
                }
                Log.e("Auth", "[AuthManaged, WorkProfileWillFail] account removed failed");
            }
        }
    }
}

