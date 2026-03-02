import com.google.android.gms.pay.GetImagesForValuableResponse;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvtp implements evqf {
    public final dvts a;

    public dvtp(dvts dvts0) {
        this.a = dvts0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        dvts dvts0 = this.a;
        if(((GetImagesForValuableResponse)object0).a.length > 0) {
            ((ggtj)dvts.a.h()).B("Image retrieved for valuable %s.", ((Valuable)dvts0.am.d()).b);
            dvlr dvlr0 = dvts0.al;
            String s = ((Valuable)dvts0.am.d()).b;
            dvlr0.a(gjco.b, gjct.b, gjcr.c, s);
            dvts0.ap.setImageBitmap(((GetImagesForValuableResponse)object0).a[0]);
            dvts0.ap.setVisibility(0);
            return;
        }
        ((ggtj)dvts.a.j()).B("No image found for valuable %s", ((Valuable)dvts0.am.d()).b);
        dvlr dvlr1 = dvts0.al;
        String s1 = ((Valuable)dvts0.am.d()).b;
        dvlr1.a(gjco.b, gjct.c, gjcr.c, s1);
    }
}

