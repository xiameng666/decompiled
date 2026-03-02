import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;

public final class bvxt extends bvxo {
    public static final bboh a;

    static {
        bvxt.a = bboh.b("UiFlow", bbcu.ff);
    }

    public bvxt(hgmq hgmq0, fhwo fhwo0, bvwy bvwy0, bvxp bvxp0, bvwa bvwa0, du du0, bwdm bwdm0) {
        super(hgmq0, bvwy0, fhwo0, bvwa0, bvxp0, du0, bwdm0);
    }

    @Override  // bvxo
    public final void a(View view0, LayoutInflater layoutInflater0) {
        ibuq.f(layoutInflater0, "inflater");
        ViewGroup viewGroup0 = (view0 instanceof ViewGroup) ? ((ViewGroup)view0) : null;
        if(viewGroup0 == null) {
            ((ggtj)bvxt.a.j()).x("Failed binding ListContainerElement - missing view");
            return;
        }
        this.d(viewGroup0);
        hgmq hgmq0 = this.d;
        String s = hgmq0.h;
        ibuq.e(s, "getContentDescription(...)");
        if(s.length() > 0) {
            viewGroup0.setContentDescription(hgmq0.h);
        }
        hfuo hfuo0 = (hgmq0.e == 16 ? ((hgne)hgmq0.f) : hgne.a).b;
        ibuq.e(hfuo0, "getChildrenList(...)");
        ibxl ibxl0 = new ibxl(((ibxm)ibxv.l(ibpo.aA(hfuo0), new bvxr())));
        while(ibxl0.hasNext()) {
            Object object0 = ibxl0.next();
            bvxo bvxo0 = this.g.a(((hgmq)object0));
            if(bvxo0 == null) {
                ((ggtj)bvxt.a.j()).x("Failed binding ListContainerElement child - missing binder");
            }
            else {
                FrameLayout frameLayout0 = new FrameLayout(viewGroup0.getContext());
                frameLayout0.setId(0x7F0B0FCE);  // id:container
                frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                viewGroup0.addView(frameLayout0);
                bvxo0.b(frameLayout0, layoutInflater0);
            }
        }
        ibxl ibxl1 = new ibxl(new ibxm(bwdz.d(viewGroup0), true, bvxs.a));
        while(ibxl1.hasNext()) {
            Object object1 = ibxl1.next();
            ((bwcd)object1).g(this.i);
        }
    }
}

