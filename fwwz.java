import com.google.android.gms.location.ActivityTransition;
import java.util.Map.Entry;
import java.util.Map;

public final class fwwz {
    public static gwww a(gwwv gwwv0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwww.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwww)hftp0.b_message).c = gwwv0.g;
        ((gwww)hftp0.b_message).b |= 1;
        return (gwww)hftp0.N_build();
    }

    public static gwww b(int v, Map map0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwww.a).v_newBuilder();
        gwwv gwwv0 = gwwv.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwww)hftv0).c = gwwv0.g;
        ((gwww)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwww gwww0 = (gwww)hftp0.b_message;
        gwww0.b |= 2;
        gwww0.d = v;
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                gwxi gwxi0 = fwxc.a(((ActivityTransition)map$Entry0.getKey()).a);
                int v1 = ((ActivityTransition)map$Entry0.getKey()).b;
                gwxw gwxw0 = (gwxw)fwxc.a.get(Integer.valueOf(v1));
                if(gwxi0 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwxe.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    ((gwxe)hftv1).c = gwxi0.k;
                    ((gwxe)hftv1).b |= 1;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gwxe)hftp1.b_message).d = gwxw0.d;
                    ((gwxe)hftp1.b_message).b |= 2;
                    int v2 = (int)(((Integer)map$Entry0.getValue()));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gwxe gwxe0 = (gwxe)hftp1.b_message;
                    gwxe0.b |= 4;
                    gwxe0.e = v2;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwww gwww1 = (gwww)hftp0.b_message;
                    gwxe gwxe1 = (gwxe)hftp1.N_build();
                    gwxe1.getClass();
                    hfuo hfuo0 = gwww1.e;
                    if(!hfuo0.c()) {
                        gwww1.e = ProtoLiteMessage.E(hfuo0);
                    }
                    gwww1.e.add(gwxe1);
                }
            }
        }
        return (gwww)hftp0.N_build();
    }
}

