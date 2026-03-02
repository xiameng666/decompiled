import com.google.android.gms.pay.pass.idcard.view.components.PresentationBottomSheet;

final class duka extends ibuo implements ibts {
    public duka(Object object0) {
        super(1, object0, PresentationBottomSheet.class, "onMoreButtonClicked", "onMoreButtonClicked(I)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v = ((Number)object0).intValue();
        PresentationBottomSheet presentationBottomSheet0 = (PresentationBottomSheet)this.e;
        icck icck0 = presentationBottomSheet0.a;
        if(icck0 != null) {
            icbb.b(icck0, null, null, new duke(presentationBottomSheet0, v, null), 3);
        }
        return ibom.a;
    }
}

