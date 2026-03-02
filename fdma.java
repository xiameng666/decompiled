import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import java.util.ArrayList;
import java.util.List;

final class fdma extends fdlv {
    public fdma(azvd azvd0) {
        super(azvd0);
    }

    @Override  // fdix
    public final void B(GetConnectedNodesResponse getConnectedNodesResponse0) {
        ArrayList arrayList0 = new ArrayList();
        List list0 = getConnectedNodesResponse0.b;
        if(list0 != null) {
            arrayList0.addAll(list0);
        }
        this.r(new fdke(fdlg.a(getConnectedNodesResponse0.a), arrayList0));
    }
}

