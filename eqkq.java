import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import j..util.Objects;

final class eqkq extends clht {
    final eqis a;

    public eqkq(eqis eqis0, Looper looper0) {
        Objects.requireNonNull(eqis0);
        this.a = eqis0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            int v = message0.what;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        ((eqdy)this.a.a).b.e();
                        eqqd.a.j("TargetBootstrapListener.onDisconnected()", new Object[0]);
                        eqqd eqqd0 = ((eqqa)((eqdy)this.a.a).a).a;
                        if(eqqd0.c && eqqd0.ah != 2) {
                            eqqd0.y();
                        }
                        return;
                    }
                    case 2: {
                        BootstrapCompletionResult bootstrapCompletionResult0 = message0.obj == null ? null : ((BootstrapCompletionResult)message0.obj);
                        ((eqdy)this.a.a).b.e();
                        eqqd eqqd1 = ((eqqa)((eqdy)this.a.a).a).a;
                        eqqd1.ah = 2;
                        baun baun0 = eqqd.a;
                        baun0.j("TargetBootstrapListener.onCompleted()", new Object[0]);
                        if(eqqd1.ak && eqqd1.ag == null) {
                            eqqd1.ai.c(108, Bundle.EMPTY);
                            return;
                        }
                        Bundle bundle0 = eqqd.B(eqqd1.ag);
                        baun0.j("handleCompletionResults()", new Object[0]);
                        TargetChimeraActivity targetChimeraActivity0 = (TargetChimeraActivity)eqqd1.getContext();
                        if(targetChimeraActivity0 == null) {
                            eqqd1.am = new eqqb(eqqd1, bundle0, bootstrapCompletionResult0);
                            baun0.f("TargetChimeraActivity is null in doneToSuw()", new Object[0]);
                            return;
                        }
                        targetChimeraActivity0.o(bundle0, bootstrapCompletionResult0);
                        return;
                    }
                    case 3: {
                        String s1 = (String)message0.obj;
                        eqdy eqdy0 = (eqdy)this.a.a;
                        eqqd.a.j(s1, new Object[0]);
                        return;
                    }
                    case 4: {
                        String s2 = (String)message0.obj;
                        eqqd.a.j(a.a(s2, "TargetBootstrapListener.onPinProvided(", ")"), new Object[0]);
                        eqqd.a.j("startPinCode()", new Object[0]);
                        Bundle bundle1 = new Bundle();
                        bundle1.putString("pin.code", s2);
                        ((eqqa)((eqdy)this.a.a).a).a.ai.c(0x71, bundle1);
                        return;
                    }
                    default: {
                        if(v != 5) {
                            throw new IllegalArgumentException(a.aG(message0, "Unrecognized message: "));
                        }
                        eqda eqda0 = this.a.a;
                        int v1 = (int)(((Integer)message0.obj));
                        if(v1 != 8004) {
                            ((eqdy)eqda0).b.e();
                        }
                        eqda eqda1 = ((eqdy)eqda0).a;
                        if(v1 == 8004) {
                            ((eqqa)eqda1).a.ai.c(0x73, Bundle.EMPTY);
                            return;
                        }
                        String s = "Something went wrong: " + epzh.a(v1);
                        eqqd.a.f(s, new Object[0]);
                        ((eqqa)eqda1).a.y();
                        return;
                    }
                }
            }
            TargetConnectionArgs targetConnectionArgs0 = (TargetConnectionArgs)message0.obj;
            eqqd.a.j("Device connected", new Object[0]);
            eqqd eqqd2 = ((eqqa)((eqdy)this.a.a).a).a;
            ProtoLiteBuilder hftp0 = eqqd2.aj.c;
            long v2 = System.currentTimeMillis() - eqqd2.aj.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghqv ghqv0 = (ghqv)hftp0.b_message;
            ghqv0.b |= 4;
            ghqv0.d = v2;
            eqqd2.ai.c(0x6F, Bundle.EMPTY);
        }
        catch(RemoteException remoteException0) {
            Log.e("SmartDevice", "Error invoking ISourceBootstrapListener.", remoteException0);
        }
    }
}

