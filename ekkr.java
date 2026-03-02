import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

final class ekkr extends uq {
    final ImageView A;
    final Button B;
    final MaterialCardView C;
    final TextView t;
    final TextView u;
    final TextView v;
    final TextView w;
    final TextView x;
    final TextView y;
    final ImageView z;

    public ekkr(View view0) {
        super(view0);
        this.t = (TextView)view0.findViewById(0x1020016);
        this.u = (TextView)view0.findViewById(0x7F0B0C55);  // id:backup_contacts_status
        this.v = (TextView)view0.findViewById(0x7F0B0C56);  // id:backup_date
        this.w = (TextView)view0.findViewById(0x7F0B2458);  // id:view_contacts
        this.x = (TextView)view0.findViewById(0x7F0B0F07);  // id:circle_divider
        this.y = (TextView)view0.findViewById(0x7F0B1E67);  // id:restore
        this.z = (ImageView)view0.findViewById(0x7F0B1E6D);  // id:restore_icon
        this.A = (ImageView)view0.findViewById(0x7F0B1E6A);  // id:restore_complete_icon
        this.B = (Button)view0.findViewById(0x7F0B1E68);  // id:restore_button
        this.C = (MaterialCardView)view0.findViewById(0x7F0B18BE);  // id:material_card_view
    }

    public final void D(int v) {
        ekmx.b(this.w, v);
    }

    public final void E() {
        this.B.setVisibility(4);
        this.y.setVisibility(0);
    }

    public final void F() {
        this.y.setVisibility(4);
        this.B.setVisibility(0);
    }

    public final void G() {
        this.z.setVisibility(4);
        this.A.setVisibility(0);
    }

    public final void H() {
        this.A.setVisibility(4);
        this.z.setVisibility(0);
    }
}

