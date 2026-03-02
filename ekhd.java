import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;

public final class ekhd extends cjtm {
    static final Set a;
    private static final bboh b;
    private final ekfh c;
    private final String d;
    private final String e;
    private final String[] f;
    private final ekat g;

    static {
        ekhd.b = bboh.b("CBR_RestoreContactsOp", bbcu.bN);
        ekhd.a = new HashSet();
    }

    public ekhd(ekfh ekfh0, String s, String s1, String[] arr_s, azug azug0) {
        super(0x87, "RestoreContacts", azug0);
        this.c = ekfh0;
        this.d = s;
        this.e = s1;
        this.f = arr_s;
        this.g = new ekat();
    }

    private static void b(Context context0, int v) {
        ejze.a().q(v, bayo.a(context0.getApplicationContext()).f(), 3);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        String s;
        Set set0 = ekhd.a;
        synchronized(set0) {
            s = this.e;
            if(set0.contains(s)) {
                ekhd.b(context0, 6);
                this.c.g(Status.f, ApiMetadata.b);
                return;
            }
            goto label_8;
        }
        return;
    label_8:
        set0.add(s);
        int v = 4;
        boolean z = false;
        try {
            this.g.a();
            gsug gsug0 = new ekfu(context0).a(ekfr.a(context0, this.d), s, this.f);
            this.g.b(context0, "fetch_contacts", true);
            new ekbg(context0, ekhh.d("SUW_Restore")).a(gsug0, this.d, false);
            goto label_31;
        }
        catch(acse acse0) {
            goto label_35;
        }
        catch(iapl iapl0) {
            goto label_50;
        }
        catch(RemoteException remoteException0) {
            goto label_65;
        }
        catch(OperationApplicationException operationApplicationException0) {
            goto label_80;
        }
        catch(RuntimeException runtimeException0) {
            goto label_95;
            try {
            label_31:
                ekgn.b(context0, s, System.currentTimeMillis());
                goto label_124;
            }
            catch(acse acse0) {
            }
            catch(iapl iapl0) {
                goto label_49;
            }
            catch(RemoteException remoteException0) {
                goto label_64;
            }
            catch(OperationApplicationException operationApplicationException0) {
                goto label_79;
            }
            catch(RuntimeException runtimeException0) {
                goto label_94;
            }
            catch(Throwable throwable1) {
                goto label_112;
            }
            z = true;
            try {
            label_35:
                ((ggtj)((ggtj)((ggtj)ekhd.b.i()).s(acse0)).ar(13600)).x("Auth Exception when fetching contacts from server");
                ejze.a().d("restore_error:authentication_failure");
                if(z) {
                    goto label_38;
                }
                goto label_39;
            }
            catch(Throwable throwable1) {
                goto label_113;
            }
        label_38:
            v = 3;
        label_39:
            ekhd.b(context0, v);
            this.c.g((z ? Status.b : Status.d), ApiMetadata.b);
            synchronized(ekhd.a) {
                ekhd.a.remove(this.e);
            }
            return;
        label_49:
            z = true;
            try {
            label_50:
                ((ggtj)((ggtj)((ggtj)ekhd.b.i()).s(iapl0)).ar(13601)).x("Status Exception when fetching contacts from server");
                ejze.a().d(a.ab(iapl0.a.t, "restore_error:status_error:"));
                if(z) {
                    goto label_53;
                }
                goto label_54;
            }
            catch(Throwable throwable1) {
                goto label_113;
            }
        label_53:
            v = 3;
        label_54:
            ekhd.b(context0, v);
            this.c.g((z ? Status.b : Status.d), ApiMetadata.b);
            synchronized(ekhd.a) {
                ekhd.a.remove(this.e);
            }
            return;
        label_64:
            z = true;
            try {
            label_65:
                ((ggtj)((ggtj)((ggtj)ekhd.b.i()).s(remoteException0)).ar(13602)).x("Contacts write failed during the execution of a remote method.");
                ejze.a().d("restore_error:cp2_remote_exception");
                if(z) {
                    goto label_68;
                }
                goto label_69;
            }
            catch(Throwable throwable1) {
                goto label_113;
            }
        label_68:
            v = 3;
        label_69:
            ekhd.b(context0, v);
            this.c.g((z ? Status.b : Status.d), ApiMetadata.b);
            synchronized(ekhd.a) {
                ekhd.a.remove(this.e);
            }
            return;
        label_79:
            z = true;
            try {
            label_80:
                ((ggtj)((ggtj)((ggtj)ekhd.b.i()).s(operationApplicationException0)).ar(13603)).x("Failed to write contacts to CP2.");
                ejze.a().d("restore_error:cp2_operation_exception");
                if(z) {
                    goto label_83;
                }
                goto label_84;
            }
            catch(Throwable throwable1) {
                goto label_113;
            }
        label_83:
            v = 3;
        label_84:
            ekhd.b(context0, v);
            this.c.g((z ? Status.b : Status.d), ApiMetadata.b);
            synchronized(ekhd.a) {
                ekhd.a.remove(this.e);
            }
            return;
        label_94:
            z = true;
            try {
            label_95:
                ((ggtj)((ggtj)((ggtj)ekhd.b.i()).s(runtimeException0)).ar(13604)).x("Failed to restore contacts due to runtime exception.");
                ejze.a().d("restore_error:runtime_error:" + runtimeException0.getMessage());
                goto label_100;
            }
            catch(Throwable throwable1) {
            }
            goto label_113;
        }
        catch(Throwable throwable1) {
            goto label_113;
        }
    label_100:
        if(z) {
            v = 3;
        }
        ekhd.b(context0, v);
        this.c.g((z ? Status.b : Status.d), ApiMetadata.b);
        synchronized(ekhd.a) {
            ekhd.a.remove(this.e);
        }
        return;
    label_112:
        z = true;
    label_113:
        if(z) {
            v = 3;
        }
        ekhd.b(context0, v);
        this.c.g((z ? Status.b : Status.d), ApiMetadata.b);
        synchronized(ekhd.a) {
            ekhd.a.remove(this.e);
        }
        throw throwable1;
    label_124:
        ekhd.b(context0, 3);
        this.c.g(Status.b, ApiMetadata.b);
        synchronized(set0) {
            set0.remove(this.e);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.g(status0, ApiMetadata.b);
    }
}

