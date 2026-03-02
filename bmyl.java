import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import com.google.android.gms.fido.fido2.ui.widgets.SquareImageView;
import j..util.Objects;

final class bmyl implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmym a;

    public bmyl(bmym bmym0) {
        Objects.requireNonNull(bmym0);
        this.a = bmym0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bmym bmym0 = this.a;
        bmym0.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if(!bmcn.d) {
            SquareImageView squareImageView0 = (SquareImageView)bmym0.b.findViewById(0x7F0B1DEE);  // id:qr_image
            ImageView imageView0 = (ImageView)bmym0.b.findViewById(0x7F0B1BD0);  // id:passkey_image
            int v = squareImageView0.getWidth();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
            if(viewGroup$LayoutParams0 != null) {
                viewGroup$LayoutParams0.height = v / 5;
                viewGroup$LayoutParams0.width = v / 5;
                imageView0.requestLayout();
            }
        }
        bmym0.ag.o(bmym0.b.getBottom());
    }
}

