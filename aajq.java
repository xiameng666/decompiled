import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class aajq extends aalb {
    public final aaja a;
    public final aajb b;
    public aapz c;
    public zem d;

    public aajq() {
        this.a = new aaja(this);
        this.b = new aajb(this);
    }

    @Override  // aalb
    protected final boolean E(grul grul0) {
        ibuq.f(grul0, "screenAlternative");
        return (grul0.b & 0x80) != 0;
    }

    @Override  // aakz
    public final grxw fT() {
        return this.z().b();
    }

    @Override  // du
    @ibni
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 9) {
            this.z().c();
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // du
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        ((aaiw)zgm.a(aaiw.class, this)).h(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0xB8BDF3A5, true, new aaiz(this)));
        return view0;
    }

    public final aapz z() {
        aapz aapz0 = this.c;
        if(aapz0 != null) {
            return aapz0;
        }
        ibuq.j("viewModel");
        return null;
    }
}

