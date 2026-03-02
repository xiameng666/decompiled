import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

final class ekif extends uq {
    final TextView t;
    final TextView u;
    final TextView v;
    final ImageView w;
    final ImageView x;
    final View y;
    final CompoundButton z;

    public ekif(View view0) {
        super(view0);
        this.t = (TextView)view0.findViewById(0x1020016);
        this.u = (TextView)view0.findViewById(0x7F0B0C56);  // id:backup_date
        this.v = (TextView)view0.findViewById(0x7F0B0FC4);  // id:contacts_count_summary
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B121D);  // id:encrypted_device_icon
        this.w = imageView0;
        imageView0.setVisibility(0);
        ImageView imageView1 = (ImageView)view0.findViewById(0x7F0B23CC);  // id:unlocked_device_icon
        this.x = imageView1;
        imageView1.setVisibility(4);
        this.y = view0.findViewById(0x1020018);
        CompoundButton compoundButton0 = (CompoundButton)view0.findViewById(0x7F0B22D2);  // id:toggle
        this.z = compoundButton0;
        compoundButton0.setChecked(false);
    }
}

