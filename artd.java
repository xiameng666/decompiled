import android.content.Context;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.Set;

public final class artd {
    public final baun a;
    public final Set b;
    public final Context c;
    public arvr d;
    public int e;
    public int f;
    public gaef g;
    private final arsy h;

    public artd(Context context0, arsy arsy0) {
        this.a = new aqql(new String[]{"ProgressSender"});
        this.b = new HashSet();
        this.e = 0;
        this.f = 0;
        this.c = context0;
        this.h = arsy0;
    }

    final void a(String s, boolean z) {
        Boolean boolean1;
        if(!z) {
            this.b.add(s);
        }
        arvr arvr0 = this.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        artm artm0 = (artm)hftp0.b_message;
        s.getClass();
        artm0.b |= 1;
        artm0.c = s;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)artl.a).v_newBuilder();
        if(z) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            artl artl0 = (artl)hftp1.b_message;
            artl0.b |= 1;
            artl0.c = true;
        }
        else {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            artl artl1 = (artl)hftp1.b_message;
            artl1.b |= 16;
            artl1.f = true;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        artm artm1 = (artm)hftp0.b_message;
        artl artl2 = (artl)hftp1.N_build();
        artl2.getClass();
        artm1.d = artl2;
        artm1.b |= 2;
        artm artm2 = (artm)hftp0.N_build();
        Boolean boolean0 = null;
        if(arvr0 == null) {
            boolean1 = null;
        }
        else {
            try {
                arvr0.a(artm2.toBytesArray());
                boolean1 = Boolean.valueOf(true);
            }
            catch(RemoteException unused_ex) {
                boolean1 = Boolean.valueOf(false);
                this.a.m("Remote exception while sending update for ui callback", new Object[0]);
            }
        }
        if(this.g != null) {
            try {
                if(z) {
                    this.a.d("Posting done notification on PORTAL %d %d", new Object[]{((int)0x7F13000C), ((int)0)});  // plurals:backup_extension_data_restore_success_notification_for_portal
                    this.g.a(0x7F13000C, 0, new int[0]);  // plurals:backup_extension_data_restore_success_notification_for_portal
                }
                else {
                    this.a.d("Posting failure notification on PORTAL", new Object[0]);
                    this.g.b(0x7F13000B, 0, new int[0]);  // plurals:backup_extension_data_restore_cancel_or_failure_notification_for_portal
                }
                boolean0 = Boolean.valueOf(true);
            }
            catch(RemoteException unused_ex) {
                boolean0 = Boolean.valueOf(false);
                this.a.m("Remote exception while sending update for portal callback", new Object[0]);
            }
        }
        arsy arsy0 = this.h;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giec.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((giec)hftv0).b |= 1;
        ((giec)hftv0).c = z;
        if(boolean0 == null && boolean1 == null) {
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            giec giec0 = (giec)hftp2.b_message;
            giec0.b |= 8;
            giec0.f = true;
        }
        if(boolean0 != null) {
            boolean z1 = boolean0.booleanValue();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            giec giec1 = (giec)hftp2.b_message;
            giec1.b |= 2;
            giec1.d = z1;
        }
        if(boolean1 != null) {
            boolean z2 = boolean1.booleanValue();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            giec giec2 = (giec)hftp2.b_message;
            giec2.b |= 4;
            giec2.e = z2;
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        giec giec3 = (giec)hftp2.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp3.b_message;
        giec3.getClass();
        ghys0.aj = giec3;
        ghys0.d |= 0x800;
        arsy0.a(((ghys)hftp3.N_build()), ghyr.aw);
    }
}

