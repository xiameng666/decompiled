import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.instantapps.ui.InstallSupervisorChimeraFragment.2;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;

public final class cabe extends cacb {
    public boolean a;
    private TextView ai;
    private int aj;
    private ServiceConnection ak;
    private BroadcastReceiver al;
    public yxh b;
    private static final Intent c;

    static {
        cabe.c = new Intent().setPackage("com.android.vending").setAction("com.google.android.finsky.BIND_PLAY_INSTALL_SERVICE");
    }

    public cabe() {
        this.aj = 0;
    }

    public final void A(int v) {
        int v1;
        this.aj = v;
        boolean z = true;
        boolean z1 = false;
        switch(v) {
            case 0: 
            case 1: {
                v1 = 0x7F152FC7;  // string:supervisor_downloading_description "Downloading %1$s"
                z = false;
                break;
            }
            case 4: {
                v1 = 0x7F152FC9;  // string:supervisor_installing_description "Installing %1$s"
                z = false;
                break;
            }
            case 2: 
            case 3: 
            case 5: {
                v1 = 0;
                z1 = true;
                z = false;
                break;
            }
            case 6: {
                v1 = 0;
                break;
            }
            default: {
                Log.w("InstallSupervisorChimeraFragment", String.format("Unknown install update %d", v));
                v1 = 0;
                z = false;
            }
        }
        if(v1 != 0) {
            this.ai.setText(this.getString(v1, new Object[]{this.getString(0x7F152FCA)}));  // string:supervisor_title "Google Play services for Instant Apps"
        }
        if(z) {
            this.y("InstallSupervisorFragment.Success");
            OptInChimeraActivity optInChimeraActivity0 = this.ag;
            if(optInChimeraActivity0 != null) {
                optInChimeraActivity0.g();
            }
        }
        if(z1) {
            this.z();
        }
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        OptInChimeraActivity optInChimeraActivity0 = this.d;
        if(optInChimeraActivity0 != null) {
            optInChimeraActivity0.l.setVisibility(8);
            optInChimeraActivity0.m.setVisibility(8);
        }
        if(bundle0 != null) {
            this.a = bundle0.getBoolean("InstallRequested", false);
            this.aj = bundle0.getInt("LastInstallUpdate", 0);
        }
        if(this.ak == null) {
            this.ak = new cabd(this);
        }
        if(this.al == null) {
            this.al = new InstallSupervisorChimeraFragment.2(this);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E097A, viewGroup0, false);  // layout:setup_download_supervisor_fragment
        TextView textView0 = (TextView)view0.findViewById(0x7F0B10E6);  // id:description
        this.ai = textView0;
        textView0.setText(this.getString(0x7F152FC7, new Object[]{this.getString(0x7F152FCA)}));  // string:supervisor_downloading_description "Downloading %1$s"
        return view0;
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putBoolean("InstallRequested", this.a);
        bundle0.putInt("LastInstallUpdate", this.aj);
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        Context context0 = this.requireContext();
        if(this.a) {
            this.A(this.aj);
        }
        else if(!context0.bindService(cabe.c, this.ak, 1)) {
            Log.e("InstallSupervisorChimeraFragment", String.format("Failed to bind to service"));
            this.z();
        }
        context0.registerReceiver(this.al, new IntentFilter("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS"));
    }

    @Override  // du
    public final void onStop() {
        super.onStop();
        if(this.b != null) {
            try {
                this.requireContext().unbindService(this.ak);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                Log.e("InstallSupervisorChimeraFragment", "Exception: ", illegalArgumentException0);
            }
            this.b = null;
        }
        this.requireContext().unregisterReceiver(this.al);
    }

    public final void y(String s) {
        OptInChimeraActivity optInChimeraActivity0 = this.ah;
        if(optInChimeraActivity0 != null) {
            optInChimeraActivity0.l(s);
        }
    }

    public final void z() {
        this.y("InstallSupervisorFragment.Failure");
        OptInChimeraActivity optInChimeraActivity0 = this.ag;
        if(optInChimeraActivity0 != null) {
            optInChimeraActivity0.m(0);
        }
    }
}

