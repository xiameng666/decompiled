import android.view.LayoutInflater;
import android.view.View;

public final class bvxl implements ibts {
    public final hgmo a;
    public final View b;
    public final bvxo c;
    public final View d;
    public final LayoutInflater e;

    public bvxl(hgmo hgmo0, View view0, bvxo bvxo0, View view1, LayoutInflater layoutInflater0) {
        this.a = hgmo0;
        this.b = view0;
        this.c = bvxo0;
        this.d = view1;
        this.e = layoutInflater0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v2;
        ibuq.f(((hgmn)object0), "it");
        hgmo hgmo0 = this.a;
        int v = hgmo0.b;
        int v1 = 0;
        switch(v) {
            case 0: {
                v2 = 3;
                break;
            }
            case 2: {
                v2 = 1;
                break;
            }
            case 3: {
                v2 = 2;
                break;
            }
            default: {
                v2 = 0;
            }
        }
        if(v2 != 0) {
            switch(v2 - 1) {
                case 0: {
                    hgmq hgmq0 = v == 2 ? ((hgmq)hgmo0.c) : hgmq.a;
                    ibuq.e(hgmq0, "getBindElement(...)");
                    bvxo bvxo0 = this.c.g.a(hgmq0);
                    if(bvxo0 != null) {
                        bvxo0.b(this.d, this.e);
                    }
                    return ibom.a;
                }
                case 1: {
                    View view0 = this.b;
                    if(!(v == 3 ? ((Boolean)hgmo0.c).booleanValue() : false)) {
                        v1 = 8;
                    }
                    view0.setVisibility(v1);
                    return ibom.a;
                }
                default: {
                    ((ggtj)bvxo.c.j()).x("DynamicElementModifications effect cast not supported");
                    return ibom.a;
                }
            }
        }
        throw null;
    }
}

