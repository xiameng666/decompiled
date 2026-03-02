import android.support.v4.app.FragmentManager.LaunchedFragmentInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

final class es implements acn {
    final fm a;

    public es(fm fm0) {
        this.a = fm0;
        super();
    }

    @Override  // acn
    public final void jN(Object object0) {
        String[] arr_s = (String[])((Map)object0).keySet().toArray(new String[0]);
        ArrayList arrayList0 = new ArrayList(((Map)object0).values());
        int[] arr_v = new int[arrayList0.size()];
        for(int v = 0; v < arrayList0.size(); ++v) {
            arr_v[v] = ((Boolean)arrayList0.get(v)).booleanValue() ? 0 : -1;
        }
        fm fm0 = this.a;
        FragmentManager.LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = (FragmentManager.LaunchedFragmentInfo)fm0.x.pollFirst();
        if(fragmentManager$LaunchedFragmentInfo0 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this.toString());
            return;
        }
        String s = fragmentManager$LaunchedFragmentInfo0.a;
        if(fm0.b.c(s) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + s);
        }
    }
}

