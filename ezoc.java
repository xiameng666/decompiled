import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public final class ezoc extends ezmz {
    private static final ggtl c;
    private final hfem d;

    static {
        ezoc.c = ezqu.c();
    }

    public ezoc(hfem hfem0, bkcm bkcm0, ezrk ezrk0) {
        super("WriteDeviceLevelSettingsOperation", bkcm0, ezrk0);
        this.d = hfem0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ggtl ggtl0 = ezoc.c;
        ggtl0.h().ar(0x4449).B("Executing operation \'%s\'...", this.q());
        ezrk ezrk0 = this.b;
        if(ezrk0.b()) {
            hfem hfem0 = this.d;
            ArrayList arrayList0 = new ArrayList();
            if(ezrk0.c(9)) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfqn.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((hfqn)hftv0).b |= 1;
                ((hfqn)hftv0).c = 9;
                int v = ezrk.d(hfem0.d);
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hfqn)hftp0.b_message).d = v - 1;
                ((hfqn)hftp0.b_message).b |= 2;
                arrayList0.add(((hfqn)hftp0.N_build()));
            }
            if(ezrk0.c(10)) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfqn.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((hfqn)hftv1).b |= 1;
                ((hfqn)hftv1).c = 10;
                int v1 = ezrk.d(hfem0.c);
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hfqn)hftp1.b_message).d = v1 - 1;
                ((hfqn)hftp1.b_message).b |= 2;
                arrayList0.add(((hfqn)hftp1.N_build()));
            }
            hfqn[] arr_hfqn = (hfqn[])arrayList0.toArray(new hfqn[0]);
            ezrk0.a.d(arr_hfqn);
        }
        this.a.e(Status.b);
        ggtl0.h().ar(0x444A).B("Operation \'%s\' successful!", this.q());
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.e(status0);
        ezoc.c.j().ar(0x444B).P("Operation \'%s\' failed with status \'%d\'!", this.q(), status0.i);
    }
}

