import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class cabs extends cacb {
    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.d.r(0x7F1508C8, new cabq(this));  // string:common_restore "Restore"
        Intent intent0 = (Intent)this.getArguments().getParcelable("browserIntent");
        boolean z = bzve.c(this.getContext(), intent0);
        this.d.q((z ? 0x7F151B14 : 0x7F1507F2), new cabr(this, z, intent0));  // string:open_in_web_button "Open in web"
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E097E, viewGroup0, false);  // layout:setup_restore_supervisor_fragment
        ((TextView)view0.findViewById(0x7F0B10E6)).setText(this.getString(0x7F152852, new Object[]{this.getString(0x7F152FCA)}));  // id:description
        return view0;
    }
}

