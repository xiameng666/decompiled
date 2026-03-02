import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;

public final class eqzl implements eqsk {
    public final eqzp a;
    public final String b;
    public final String c;
    public final eqxg d;
    public final kau e;

    public eqzl(eqzp eqzp0, String s, String s1, eqxg eqxg0, kau kau0) {
        this.a = eqzp0;
        this.b = s;
        this.c = s1;
        this.d = eqxg0;
        this.e = kau0;
    }

    @Override  // eqsk
    public final void a() {
        eqzp.f.d("startServiceOnSource timed out for package: %s and action: %s", new Object[]{this.b, this.c});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjkz.a).v_newBuilder();
        eqxg eqxg0 = this.d;
        kau kau0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqzp eqzp0 = this.a;
        ((gjkz)hftp0.b_message).e = 0;
        ((gjkz)hftp0.b_message).b |= 4;
        gjkz gjkz0 = (gjkz)hftp0.N_build();
        eqzp0.k.r(gjkz0);
        try {
            StartServiceResponse startServiceResponse0 = new StartServiceResponse(0);
            eqxg0.a(Status.e, startServiceResponse0);
        }
        catch(RemoteException remoteException0) {
            eqzp.f.l(remoteException0);
        }
        finally {
            eqzp0.v.remove(kau0);
        }
    }
}

