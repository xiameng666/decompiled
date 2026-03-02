import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.UpdateSettingsRequest;

public final class dlux implements View.OnClickListener {
    public final dlvb a;
    public final hjrp b;

    public dlux(dlvb dlvb0, hjrp hjrp0) {
        this.a = dlvb0;
        this.b = hjrp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        hjrp hjrp0 = this.b;
        ibuq.f(hjrp0, "action");
        dlvb dlvb0 = this.a;
        if(hjrp0.b == 17) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftgg.a).v_newBuilder();
            ibuq.e(hftp0, "newBuilder(...)");
            if((hjrp0.b == 17 ? ((hjtd)hjrp0.c) : hjtd.a).b) {
                ftgf ftgf0 = ftgf.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ftgg ftgg0 = (ftgg)hftp0.b_message;
                ftgg0.e = ftgf0.a();
                ftgg0.b |= 4;
            }
            if((hjrp0.b == 17 ? ((hjtd)hjrp0.c) : hjtd.a).c) {
                ftgf ftgf1 = ftgf.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ftgg ftgg1 = (ftgg)hftp0.b_message;
                ftgg1.d = ftgf1.a();
                ftgg1.b |= 2;
            }
            UpdateSettingsRequest updateSettingsRequest0 = new UpdateSettingsRequest();
            updateSettingsRequest0.a = dlvb0.c;
            grnu grnu0 = grnt.a(((ProtoLiteMessage)grns.a).v_newBuilder());
            grnu0.b(gqtz.kQ);
            grnm grnm0 = grnl.a(((ProtoLiteMessage)grnk.a).v_newBuilder());
            grng grng0 = grnf.a(((grnd)((ProtoLiteMessage)grne.a).v_newBuilder()));
            grng0.c();
            hfui hfui0 = (hjrp0.b == 17 ? ((hjtd)hjrp0.c) : hjtd.a).e;
            ibuq.e(hfui0, "getRenderedSoyMessageIdsList(...)");
            grng0.b(hfui0);
            grnm0.b(grng0.a());
            grnu0.d(grnm0.a());
            updateSettingsRequest0.c = ftqe.a(((MessageLite)grnu0.a()));
            updateSettingsRequest0.b = ftqe.a(((MessageLite)hftp0.N_build()));
            evql evql0 = dlvb0.e.bz(updateSettingsRequest0);
            evql0.z(new dluz());
            evql0.A(new dlva());
        }
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        hael hael0 = haek.a(((ProtoLiteMessage)hagk.a).v_newBuilder());
        hael0.b("click_action");
        hael0.c("email_optin_card_dialog_positive_button_gmscore");
        hafk0.c(hael0.a());
        hapr hapr0 = hafk0.a();
        dlvb0.d.b(hapr0);
    }
}

