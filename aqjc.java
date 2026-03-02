import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;

public final class aqjc implements AdapterView.OnItemClickListener {
    public final SetBackupAccountChimeraActivity a;

    public aqjc(SetBackupAccountChimeraActivity setBackupAccountChimeraActivity0) {
        this.a = setBackupAccountChimeraActivity0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        int v2 = ((ListView)adapterView0).getCount() - 1;
        SetBackupAccountChimeraActivity setBackupAccountChimeraActivity0 = this.a;
        if(v == v2) {
            setBackupAccountChimeraActivity0.c();
            return;
        }
        setBackupAccountChimeraActivity0.g(setBackupAccountChimeraActivity0.l[v]);
    }
}

