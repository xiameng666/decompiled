import android.accounts.Account;
import android.content.ContentResolver;
import android.widget.Toast;

public final class eguo implements evqc {
    public final eguv a;
    public final Account b;

    public eguo(eguv eguv0, Account account0) {
        this.a = eguv0;
        this.b = account0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        if(hxdo.f()) {
            ContentResolver.setIsSyncable(this.b, "com.android.contacts", 0);
        }
        Boolean boolean0 = Boolean.valueOf(false);
        this.a.q.ii(boolean0);
        this.a.p.ii(boolean0);
        egrw egrw0 = this.a.z;
        if(egrw0 != null) {
            egvc egvc0 = egrw0.av;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqs.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giqs)hftp0.b_message).c = 2;
            ((giqs)hftp0.b_message).b |= 1;
            egvc0.i(((giqs)hftp0.N_build()), egrw0.a.name);
            egrw0.b.n();
            if(egrw0.getContext() != null) {
                egrw0.getContext().getResources();
                Toast.makeText(egrw0.getContext(), "Failed to turn off sync", 0).show();
            }
        }
    }
}

