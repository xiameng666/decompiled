import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;

public final class egvo extends du implements View.OnClickListener {
    private egvs a;

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.getParentFragmentManager().ae("ImportingSimContactsFragment", egwg.b(-1, null));
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            bundle1 = Bundle.EMPTY;
        }
        ImportSimContactsRequest importSimContactsRequest0 = (ImportSimContactsRequest)bundle1.getParcelable("import_request");
        if(importSimContactsRequest0 == null) {
            throw new IllegalStateException("Missing required fragment argument: import_request");
        }
        egvs egvs0 = (egvs)new lso(this, egxn.d(this.requireContext())).a(egvs.class);
        this.a = egvs0;
        egvq egvq0 = egvs0.b;
        if(!egvq0.p()) {
            egvq0.h = importSimContactsRequest0;
            egvq0.i = egvq0.a.b(importSimContactsRequest0);
            egvq0.i.z(egvq0);
            if(egvq0.m()) {
                egvq0.b();
            }
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E04EB, viewGroup0, false);  // layout:importing_sim_contacts_screen
        ImageView imageView0 = (ImageView)view0.findViewById(0x1020006);
        TextView textView0 = (TextView)view0.findViewById(0x1020016);
        ProgressBar progressBar0 = (ProgressBar)view0.findViewById(0x102000D);
        TextView textView1 = (TextView)view0.findViewById(0x102000B);
        Button button0 = (Button)view0.findViewById(0x7F0B0F87);  // id:confirm_button
        button0.setOnClickListener(this);
        this.a.b.g(this.getViewLifecycleOwner(), new egvn(this, textView0, imageView0, progressBar0, textView1, button0));
        return view0;
    }
}

