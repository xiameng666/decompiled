import android.accounts.Account;
import android.content.ContentResolver;
import android.widget.Toast;

public final class egun implements evqf {
    public final eguv a;
    public final Account b;

    public egun(eguv eguv0, Account account0) {
        this.a = eguv0;
        this.b = account0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        if(hxdo.f()) {
            ContentResolver.setIsSyncable(this.b, "com.android.contacts", 0);
        }
        this.a.q.ii(Boolean.valueOf(false));
        this.a.p.ii(Boolean.valueOf(true));
        egrw egrw0 = this.a.z;
        if(egrw0 != null) {
            egvc egvc0 = egrw0.av;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqs.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giqs)hftp0.b_message).c = 1;
            ((giqs)hftp0.b_message).b |= 1;
            egvc0.i(((giqs)hftp0.N_build()), egrw0.a.name);
            egrw0.b.n();
            if(egrw0.getContext() != null) {
                egrw0.getContext().getResources();
                Toast.makeText(egrw0.getContext(), "Sync turned off", 0).show();
            }
        }
    }
}

