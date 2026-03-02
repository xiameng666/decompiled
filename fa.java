import android.support.v4.app.FragmentManager.LaunchedFragmentInfo;
import android.util.Log;
import androidx.activity.result.ActivityResult;

final class fa implements acn {
    final fm a;

    public fa(fm fm0) {
        this.a = fm0;
        super();
    }

    @Override  // acn
    public final void jN(Object object0) {
        fm fm0 = this.a;
        FragmentManager.LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = (FragmentManager.LaunchedFragmentInfo)fm0.x.pollLast();
        if(fragmentManager$LaunchedFragmentInfo0 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this.toString());
            return;
        }
        String s = fragmentManager$LaunchedFragmentInfo0.a;
        du du0 = fm0.b.c(s);
        if(du0 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + s);
            return;
        }
        du0.onActivityResult(fragmentManager$LaunchedFragmentInfo0.b, ((ActivityResult)object0).a, ((ActivityResult)object0).b);
    }
}

