import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class accs extends de {
    public View.OnClickListener ag;
    private ImageView ah;
    private Bitmap ai;

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(0, 0x7F160C03);  // style:Theme.AppCompat.DialogWhenLarge
        if(this.getArguments() != null) {
            this.ai = (Bitmap)this.getArguments().getParcelable("image");
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E00A4, viewGroup0, false);  // layout:appinvite_image_preview
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B16EC);  // id:image_full_view
        this.ah = imageView0;
        imageView0.setImageBitmap(this.ai);
        this.ah.setContentDescription(this.getString(0x7F1501A7));  // string:appinvite_image_preview "Invitation image preview"
        View.OnClickListener view$OnClickListener0 = this.ag;
        if(view$OnClickListener0 != null) {
            this.ah.setOnClickListener(view$OnClickListener0);
        }
        return view0;
    }
}

