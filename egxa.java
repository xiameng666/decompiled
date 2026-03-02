import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;

public final class egxa implements Runnable {
    public final egxc a;
    public final ExtendedSyncStatus b;

    public egxa(egxc egxc0, ExtendedSyncStatus extendedSyncStatus0) {
        this.a = egxc0;
        this.b = extendedSyncStatus0;
    }

    @Override
    public final void run() {
        egxc egxc0 = this.a;
        ExtendedSyncStatus extendedSyncStatus0 = this.b;
        egxb egxb0 = egxc0.o(extendedSyncStatus0);
        if(egxb0 != null) {
            egxc0.ii(egxb0);
        }
        egvc egvc0 = egxc0.k;
        if(egvc0 != null) {
            String s = egxj.g(egxc0.h);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giqu)hftp0.b_message).c = 23;
            ((giqu)hftp0.b_message).b |= 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giqt.a).v_newBuilder();
            int v = extendedSyncStatus0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((giqt)hftv0).b |= 1;
            ((giqt)hftv0).c = v;
            int v1 = extendedSyncStatus0.e;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((giqt)hftv1).b |= 2;
            ((giqt)hftv1).d = v1;
            int v2 = extendedSyncStatus0.f;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((giqt)hftv2).b |= 4;
            ((giqt)hftv2).e = v2;
            int v3 = extendedSyncStatus0.g;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            giqt giqt0 = (giqt)hftp1.b_message;
            giqt0.b |= 8;
            giqt0.f = v3;
            giqt giqt1 = (giqt)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giqu giqu0 = (giqu)hftp0.b_message;
            giqt1.getClass();
            giqu0.j = giqt1;
            giqu0.b |= 0x80;
            giqu giqu1 = (giqu)hftp0.N_build();
            egvc0.a.j(giqu1, s);
        }
    }
}

