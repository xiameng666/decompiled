import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;

public final class egvc {
    public final efpr a;

    public egvc() {
        this.a = efpr.a();
    }

    final void a(String s, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = (z ? 20 : 19) - 1;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqu)hftp0.b_message).e = 2;
        ((giqu)hftp0.b_message).b |= 4;
        giqu giqu0 = (giqu)hftp0.N_build();
        this.a.j(giqu0, s);
    }

    final void b(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = 36;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqu)hftp0.b_message).e = 3;
        ((giqu)hftp0.b_message).b |= 4;
        giqu giqu0 = (giqu)hftp0.N_build();
        this.a.j(giqu0, s);
    }

    static int c(BackupAndSyncOptInState backupAndSyncOptInState0) {
        switch(backupAndSyncOptInState0.c) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            default: {
                return 1;
            }
        }
    }

    final void d(int v, giqr giqr0, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = 14;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giqu)hftv1).e = v - 1;
        ((giqu)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        giqu giqu0 = (giqu)hftp0.b_message;
        giqr0.getClass();
        giqu0.f = giqr0;
        giqu0.b |= 8;
        giqu giqu1 = (giqu)hftp0.N_build();
        this.a.j(giqu1, s);
    }

    public final void e(int v, int v1) {
        this.f(v, v1, null);
    }

    final void f(int v, int v1, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = v - 1;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqu)hftp0.b_message).e = v1 - 1;
        ((giqu)hftp0.b_message).b |= 4;
        giqu giqu0 = (giqu)hftp0.N_build();
        this.a.j(giqu0, s);
    }

    final void g(int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = 13;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giqu)hftv1).e = v - 1;
        ((giqu)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqu)hftp0.b_message).g = v1 - 1;
        ((giqu)hftp0.b_message).b |= 16;
        giqu giqu0 = (giqu)hftp0.N_build();
        this.a.j(giqu0, null);
    }

    final void h(int v, int v1, String s, int v2, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = v - 1;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giqu)hftv1).e = v1 - 1;
        ((giqu)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((giqu)hftv2).b |= 2;
        ((giqu)hftv2).d = z;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqu)hftp0.b_message).g = v2 - 1;
        ((giqu)hftp0.b_message).b |= 16;
        giqu giqu0 = (giqu)hftp0.N_build();
        this.a.j(giqu0, s);
    }

    final void i(giqs giqs0, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = 33;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giqu)hftv1).e = 3;
        ((giqu)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        giqu giqu0 = (giqu)hftp0.b_message;
        giqs0.getClass();
        giqu0.k = giqs0;
        giqu0.b |= 0x100;
        giqu giqu1 = (giqu)hftp0.N_build();
        this.a.j(giqu1, s);
    }
}

