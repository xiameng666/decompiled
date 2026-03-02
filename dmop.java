import android.view.View.OnClickListener;
import android.view.View;

public final class dmop implements View.OnClickListener {
    public final dmos a;

    public dmop(dmos dmos0) {
        this.a = dmos0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eflw eflw0 = new eflw();
        eflw0.b = this.a.getString(0x7F151E57);  // string:pay_frw_non_backupable_remove_confirm_title "Are you sure you want to remove 
                                                 // your balance?"
        eflw0.c = this.a.getString(0x7F151E56);  // string:pay_frw_non_backupable_remove_confirm_msg "You won\'t be able to recover 
                                                 // it"
        eflw0.e = this.a.getString(0x7F1507F2);  // string:common_cancel "Cancel"
        eflw0.d = this.a.getString(0x7F151E55);  // string:pay_frw_non_backupable_remove_confirm_button "Remove balance"
        eflw0.o = false;
        eflw0.y = new dmon(this.a);
        eflw0.z = new dmoo(this.a);
        eflw0.a().I(this.a.getChildFragmentManager(), "FrwNonBackupableCardsFragment");
    }
}

