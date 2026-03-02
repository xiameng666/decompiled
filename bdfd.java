import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bdfd extends bdfn {
    public bfom ag;
    public bfnb ah;
    public bfnb ai;
    public bfnb aj;
    public bfnb ak;
    public bfnb al;

    @Override  // fyfx
    public final Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        ((fyfv)dialog0).a().K(3);
        return dialog0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0845, viewGroup0, false);  // layout:pwm_checkup_action_bottom_sheet
        du du0 = this.getParentFragment();
        if(du0 == null) {
            du0 = this;
        }
        beqo beqo0 = (beqo)new lso(du0).a(beqo.class);
        this.ah = this.ag.a("view", new bdet(this, beqo0));
        this.ai = this.ag.a("edit", new bdeu(this, beqo0));
        this.aj = this.ag.a("delete", new bdev(this, beqo0));
        this.ak = this.ag.a("dismiss", new bdew(this, beqo0));
        this.al = this.ag.a("restore", new bdex(this, beqo0));
        view0.findViewById(0x7F0B0ECC).setOnClickListener(new bdey(this));  // id:checkup_issue_view_password
        view0.findViewById(0x7F0B0EC9).setOnClickListener(new bdez(this));  // id:checkup_issue_edit_password
        View view1 = view0.findViewById(0x7F0B0EC7);  // id:checkup_issue_dismiss_warning
        View view2 = view0.findViewById(0x7F0B0ECA);  // id:checkup_issue_restore_warning
        gfsx gfsx0 = beqo0.m;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            if(object0 == beqn.c) {
                view1.setVisibility(0);
                view2.setVisibility(8);
                view1.setOnClickListener(new bdfb(this));
            }
            else if(object0 == beqn.d) {
                view1.setVisibility(8);
                view2.setVisibility(0);
                view2.setOnClickListener(new bdfc(this));
            }
        }
        else {
            view1.setVisibility(8);
            view2.setVisibility(8);
        }
        view0.findViewById(0x7F0B0EC6).setOnClickListener(new bdfa(this));  // id:checkup_issue_delete_password
        return view0;
    }
}

