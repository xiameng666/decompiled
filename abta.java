import android.content.Context;

public final class abta implements evqf {
    public final abtd a;

    public abta(abtd abtd0) {
        this.a = abtd0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        int v = ((gged_interceptors)object0).size();
        abtd abtd0 = this.a;
        boolean z = true;
        abtd0.e.l(Boolean.valueOf(true));
        Integer integer0 = v;
        Context context0 = abtd0.b;
        String s = context0.getString(0x7F152F65, new Object[]{integer0});  // string:storage_management_nr_local_passwords "%1$d"
        abtd0.f.l(s);
        String s1 = context0.getResources().getQuantityString(0x7F13009C, v, new Object[]{integer0});  // plurals:storage_management_nr_local_passwords_will_be_deleted
        abtd0.h.l(s1);
        if(v <= 0) {
            z = false;
        }
        Boolean boolean0 = Boolean.valueOf(z);
        abtd0.g.l(boolean0);
        abtd0.j.l(boolean0);
        String s2 = v == 0 ? "All your data will be deleted including settings, accounts, databases, etc." : context0.getResources().getQuantityString(0x7F130023, v, new Object[]{integer0});  // plurals:icing_storage_management_clear_all_data_dlg_text_with_passwords
        abtd0.i.l(s2);
        abtd0.k.l(s2);
    }
}

