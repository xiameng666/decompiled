import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public final class bwdi {
    private final icck a;
    private final bvwy b;
    private final bwdm c;

    public bwdi(icck icck0, bvwy bvwy0, bwdm bwdm0) {
        ibuq.f(icck0, "coroutineScope");
        ibuq.f(bwdm0, "uiFlowFlags");
        super();
        this.a = icck0;
        this.b = bvwy0;
        this.c = bwdm0;
    }

    public final bwdb a(hgme hgme0, ViewGroup viewGroup0) {
        int v = hgme0.b;
        int v1 = hglq.a(v);
        ExtendedFloatingActionButton extendedFloatingActionButton0 = null;
        if(v1 != 0) {
            switch(v1 - 1) {
                case 3: {
                    hglx hglx0 = v == 5 ? ((hglx)hgme0.c) : hglx.a;
                    ibuq.e(hglx0, "getModifyFabOnScrollAction(...)");
                    bvwy bvwy0 = this.b;
                    String s = hglx0.c;
                    ibuq.e(s, "getFabViewId(...)");
                    View view0 = bvwy0.b(s, viewGroup0);
                    icck icck0 = this.a;
                    bwdm bwdm0 = this.c;
                    if((view0 instanceof ExtendedFloatingActionButton)) {
                        extendedFloatingActionButton0 = (ExtendedFloatingActionButton)view0;
                    }
                    return new bwda(icck0, bwdm0, viewGroup0, bvwy0, hglx0, extendedFloatingActionButton0);
                }
                case 5: {
                    List list0 = ibxv.j(new ibxm(new ibxm(bwdz.e(viewGroup0), true, new bwcv()), true, bwdh.a));
                    return new bwcx(this.a, this.c, viewGroup0, list0);
                }
                default: {
                    if(v1 - 1 != 9) {
                        return null;
                    }
                    hgls hgls0 = v == 11 ? ((hgls)hgme0.c) : hgls.a;
                    ibuq.e(hgls0, "getCompositeAction(...)");
                    hfuo hfuo0 = hgls0.b;
                    ibuq.e(hfuo0, "getActionList(...)");
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: hfuo0) {
                        ibuq.c(((hgme)object0));
                        bwdb bwdb0 = this.a(((hgme)object0), viewGroup0);
                        if(bwdb0 != null) {
                            arrayList0.add(bwdb0);
                        }
                    }
                    return new bwcz(arrayList0);
                }
            }
        }
        throw null;
    }
}

