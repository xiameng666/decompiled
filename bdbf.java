import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

final class bdbf extends uq {
    public final MaterialButton A;
    public boolean B;
    private final View C;
    private final LinearLayout D;
    private final Button E;
    private final ConstraintLayout F;
    private final ConstraintLayout G;
    private final ConstraintLayout H;
    public final Button t;
    public final Button u;
    public final TextView v;
    public final MaterialButton w;
    public final MaterialButton x;
    public final MaterialButton y;
    public final MaterialButton z;

    public bdbf(View view0) {
        super(view0);
        this.C = this.a.findViewById(0x7F0B102F);  // id:credential_group_separator
        this.D = (LinearLayout)this.a.findViewById(0x7F0B1031);  // id:credential_group_signon_realm_list
        this.E = (Button)this.a.findViewById(0x7F0B1C79);  // id:picker_missing_username
        this.t = (Button)this.a.findViewById(0x7F0B1C83);  // id:picker_username
        this.F = (ConstraintLayout)this.a.findViewById(0x7F0B1C85);  // id:picker_username_group
        this.y = (MaterialButton)this.a.findViewById(0x7F0B1C76);  // id:picker_copy_username_button
        this.u = (Button)this.a.findViewById(0x7F0B1C7E);  // id:picker_password
        this.G = (ConstraintLayout)this.a.findViewById(0x7F0B1C80);  // id:picker_password_group
        this.z = (MaterialButton)this.a.findViewById(0x7F0B1C75);  // id:picker_copy_password_button
        this.A = (MaterialButton)this.a.findViewById(0x7F0B1C86);  // id:picker_view_password_button
        this.v = (TextView)this.a.findViewById(0x7F0B1C7A);  // id:picker_note
        this.H = (ConstraintLayout)this.a.findViewById(0x7F0B1C7C);  // id:picker_note_group
        this.w = (MaterialButton)this.a.findViewById(0x7F0B1C7D);  // id:picker_note_show_more_button
        this.x = (MaterialButton)this.a.findViewById(0x7F0B1C74);  // id:picker_copy_note_button
    }

    final void D(gqmd gqmd0, boolean z, boolean z1, String s) {
        if(z) {
            this.C.setVisibility(8);
        }
        else {
            this.C.setVisibility(0);
        }
        if(gqmd0.k().isEmpty()) {
            this.F.setVisibility(0);
            this.E.setVisibility(0);
            this.t.setVisibility(8);
            this.y.setVisibility(8);
        }
        else {
            String s1 = gqmd0.k();
            this.t.setText(s1);
            String s2 = gqmd0.k();
            this.t.setContentDescription(s2 + " " + "Username. Tap to use it for autofilling.");
            this.E.setVisibility(8);
            this.F.setVisibility(0);
        }
        if(gqmd0.i().equals(gqmg.b)) {
            this.G.setVisibility(0);
            try {
                bgnd.a(this.u.getContext(), this.u);
            }
            catch(Resources.NotFoundException unused_ex) {
                this.u.setTypeface(Typeface.MONOSPACE);
            }
            String s3 = ((grdf)((bedg)gqmd0.j()).b.d()).a;
            this.u.setText(s3);
            PasswordTransformationMethod passwordTransformationMethod0 = PasswordTransformationMethod.getInstance();
            this.u.setTransformationMethod(passwordTransformationMethod0);
            String s4 = bgms.a(gqmd0);
            if(!s4.isEmpty()) {
                this.H.setVisibility(0);
                this.v.setTextIsSelectable(false);
                this.v.setText(s4);
                this.v.getViewTreeObserver().addOnPreDrawListener(new bdbe(this));
            }
        }
        else {
            this.G.setVisibility(8);
        }
        Context context0 = this.a.getContext();
        bdav.a(this.D, z1, gqmd0, s, context0);
    }
}

