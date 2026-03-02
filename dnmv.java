import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;

public final class dnmv implements ibts {
    public final dnnk a;
    public final View b;

    public dnmv(dnnk dnnk0, View view0) {
        this.a = dnnk0;
        this.b = view0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dnnk dnnk0 = this.a;
        ImageView imageView0 = null;
        if(!hwev.c()) {
            CardView cardView0 = dnnk0.aj;
            if(cardView0 == null) {
                ibuq.j("cardView");
                cardView0 = null;
            }
            cardView0.setVisibility(0);
            dmet dmet0 = dnnk0.y();
            ImageView imageView1 = dnnk0.ak;
            if(imageView1 == null) {
                ibuq.j("cardArtView");
            }
            else {
                imageView0 = imageView1;
            }
            dmet0.e(((dmew)object0), imageView0);
        }
        else if(((dmew)object0) != null) {
            ComposeViewHeader composeViewHeader0 = (ComposeViewHeader)this.b.findViewById(0x7F0B0995);  // id:ViewHeader
            fuho fuho0 = composeViewHeader0.a();
            ibuq.d(fuho0, "null cannot be cast to non-null type com.google.android.libraries.tapandpay.ui.compose.viewheader.ViewHeaderState.Default");
            composeViewHeader0.b(fuhm.a(((fuhm)fuho0), new fugr(fujl.a(dnnk0.y().i(dmex.b(((dmew)object0))), null, null, new frxp(0), false, false, null, 0xF7)), null, 6));
            return ibom.a;
        }
        return ibom.a;
    }
}

