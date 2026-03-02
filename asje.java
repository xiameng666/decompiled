import android.accounts.Account;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;

public final class asje implements View.OnClickListener {
    public final SetBackupAccountFlowChimeraActivity a;

    public asje(SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity0) {
        this.a = setBackupAccountFlowChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity0 = this.a;
        Account account0 = setBackupAccountFlowChimeraActivity0.r;
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.u;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        grjl grjl0 = setBackupAccountFlowChimeraActivity0.q;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)grjl0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)grjl0));
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = grno.b;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((grnp)hftp3.b_message).c = grno0.d;
        ((grnp)hftp3.b_message).b |= 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grjl grjl1 = (grjl)hftp2.b_message;
        grnp grnp0 = (grnp)hftp3.N_build();
        grnp0.getClass();
        grjl1.c = grnp0;
        grjl1.b |= 1;
        boolean z = ashj.c(setBackupAccountFlowChimeraActivity0);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grjl grjl2 = (grjl)hftp2.b_message;
        grjl2.b |= 16;
        grjl2.g = z;
        setBackupAccountFlowChimeraActivity0.q = (grjl)hftp2.N_build();
        grjl grjl3 = setBackupAccountFlowChimeraActivity0.q;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp1.b_message;
        grjl3.getClass();
        grkv0.h = grjl3;
        grkv0.b |= 8;
        grmv grmv0 = (grmv)((ProtoLiteMessage)grmw.b).v_newBuilder();
        grmv0.a(gvff.m);
        grmw grmw0 = (grmw)((ProtoLiteBuilder)grmv0).N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkv grkv1 = (grkv)hftp1.b_message;
        grmw0.getClass();
        grkv1.y = grmw0;
        grkv1.d |= 0x20000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv grkv2 = (grkv)hftp1.N_build();
        grkv2.getClass();
        grku0.d = grkv2;
        grku0.b |= 2;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grku grku1 = (grku)hftp0.N_build();
        grku1.getClass();
        grkg0.f = grku1;
        grkg0.b |= 4;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        gqtz gqtz0 = gqtz.X;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grns grns0 = (grns)hftp4.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        grjw grjw0 = setBackupAccountFlowChimeraActivity0.a();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp5.b_message;
        grjw0.getClass();
        grnk0.i = grjw0;
        grnk0.b |= 0x80;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grns grns1 = (grns)hftp4.b_message;
        grnk grnk1 = (grnk)hftp5.N_build();
        grnk1.getClass();
        grns1.f = grnk1;
        grns1.b |= 8;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grns grns2 = (grns)hftp4.N_build();
        grns2.getClass();
        grkg1.g = grns2;
        grkg1.b |= 8;
        aqrn.c(setBackupAccountFlowChimeraActivity0.getApplicationContext(), grkf0, account0).z(new asjb());
        grjl grjl4 = setBackupAccountFlowChimeraActivity0.q;
        aqjl.a.d(setBackupAccountFlowChimeraActivity0, grjl4.d);
        aqjl.a.h(setBackupAccountFlowChimeraActivity0, grjl4.e);
        aqjl.a.b(setBackupAccountFlowChimeraActivity0, grjl4.f);
        aqjl.a.c(setBackupAccountFlowChimeraActivity0, grjl4.h);
        if(!bbic.a().d(setBackupAccountFlowChimeraActivity0, new Intent().setClassName(setBackupAccountFlowChimeraActivity0, "com.google.android.gms.backup.BackupAccountManagerService"), new asji(setBackupAccountFlowChimeraActivity0, account0), 1)) {
            SetBackupAccountFlowChimeraActivity.j.f("Cannot connect to BackupAccountManagerService.", new Object[0]);
            setBackupAccountFlowChimeraActivity0.finishAndRemoveTask();
        }
    }
}

