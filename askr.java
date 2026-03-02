import android.accounts.Account;
import com.google.android.gms.backup.common.util.session.ParcelableSession;

public final class askr extends lsb {
    public static final bboh a;
    public static final grkv b;
    public static final grkv c;
    public final asms d;
    public final asmc e;
    public final icck f;
    public final icnj g;
    public final icnj h;
    public final icnj i;
    public final icnl j;
    private final aqrd k;

    static {
        askr.a = bboh.b("BackupSettingsDeviceDataViewModel", bbcu.dF);
        grkx grkx0 = grkw.a(((ProtoLiteMessage)grkv.a).v_newBuilder());
        grjn grjn0 = grjm.a(((ProtoLiteMessage)grjl.a).v_newBuilder());
        grnr grnr0 = grnq.a(((ProtoLiteMessage)grnp.a).v_newBuilder());
        grnr0.b(grno.b);
        grjn0.b(grnr0.a());
        ProtoLiteBuilder hftp0 = grjn0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((grjl)hftv0).b |= 0x20;
        ((grjl)hftv0).h = true;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((grjl)hftv1).b |= 8;
        ((grjl)hftv1).f = true;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((grjl)hftv2).b |= 2;
        ((grjl)hftv2).d = true;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        grjl.b(((grjl)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grjl grjl0 = (grjl)hftp0.b_message;
        grjl0.b |= 4;
        grjl0.e = true;
        grkx0.b(grjn0.a());
        grmy grmy0 = grmx.a(((grmv)((ProtoLiteMessage)grmw.b).v_newBuilder()));
        grmy0.c();
        grmy0.b(gvff.k);
        grkx0.c(grmy0.a());
        askr.b = grkx0.a();
        grkx grkx1 = grkw.a(((ProtoLiteMessage)grkv.a).v_newBuilder());
        grjn grjn1 = grjm.a(((ProtoLiteMessage)grjl.a).v_newBuilder());
        grnr grnr1 = grnq.a(((ProtoLiteMessage)grnp.a).v_newBuilder());
        grnr1.b(grno.c);
        grjn1.b(grnr1.a());
        grkx1.b(grjn1.a());
        grmy grmy1 = grmx.a(((grmv)((ProtoLiteMessage)grmw.b).v_newBuilder()));
        grmy1.c();
        grmy1.b(gvff.l);
        grkx1.c(grmy1.a());
        askr.c = grkx1.a();
    }

    public askr(asms asms0, asmc asmc0, aseh aseh0, asmy asmy0, asni asni0, icck icck0, aqrd aqrd0) {
        ibuq.f(asms0, "deviceDataBackupStateUseCase");
        ibuq.f(asmc0, "backupsNetworkSettingsUseCase");
        ibuq.f(icck0, "viewModelScope");
        super();
        this.d = asms0;
        this.e = asmc0;
        this.f = icck0;
        this.k = aqrd0;
        icnl icnl0 = icnm.a(Boolean.valueOf(false));
        this.j = icnl0;
        askn askn0 = new askn(this, null);
        this.g = iclp.b(new iclv(asmy0.a, askn0), icck0, icmy.a(0L, 3), aqqe.a);
        icig icig0 = icjg.a(asni0.c, 0xFAL);
        asko asko0 = new asko(null);
        this.h = iclp.b(icmm.a(icnl0, asmc0.b, icig0, asko0), icck0, icmy.a(0L, 3), aqqe.a);
        this.i = aseh0.b;
    }

    public final Object a(Account account0, grkv grkv0, grjo grjo0, ibrl ibrl0) {
        grkz grkz0 = grky.a(((ProtoLiteMessage)grku.a).v_newBuilder());
        grkz0.c(gqub.t);
        grkz0.b(grkv0);
        grku grku0 = grkz0.a();
        grnu grnu0 = grnt.a(((ProtoLiteMessage)grns.a).v_newBuilder());
        grnu0.b(gqtz.V);
        grnm grnm0 = grnl.a(((ProtoLiteMessage)grnk.a).v_newBuilder());
        ibuq.f(grjo0, "value");
        ProtoLiteBuilder hftp0 = grnm0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp0.b_message;
        grjo0.getClass();
        grnk0.g = grjo0;
        grnk0.b |= 16;
        grnu0.d(grnm0.a());
        grns grns0 = grnu0.a();
        String s = account0.name;
        grkh grkh0 = ParcelableSession.b().c();
        Object object0 = ictn.b(this.k.a(s, grku0, grns0, grkh0), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

