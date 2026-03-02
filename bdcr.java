import java.util.ArrayList;
import java.util.List;

public final class bdcr implements ibts {
    public final bddc a;

    public bdcr(bddc bddc0) {
        this.a = bddc0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        List list0 = (List)object0;
        ibuq.c(list0);
        ibuq.f(list0, "accountNames");
        bgnl bgnl0 = new bgnl();
        ibuq.f(list0, "accountNames");
        bgnl0.setArguments(jyu.a(new ibns[]{new ibns("title_res_id_key", ((int)0x7F152714)), new ibns("positive_button_res_id_key", ((int)0x7F152717)), new ibns("cancel_button_res_id_key", ((int)0x7F1507F2)), new ibns("account_name_list_key", new ArrayList(list0))}));  // string:pwm_move_passwords_account_selector_title "Choose where to save these passwords"
        bgnl0.show(this.a.getChildFragmentManager(), "account_selection_dialog_tag");
        return ibom.a;
    }
}

