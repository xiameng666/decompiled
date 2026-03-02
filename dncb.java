import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public final class dncb implements kdz {
    final dnci a;

    public dncb(dnci dnci0) {
        this.a = dnci0;
        super();
    }

    @Override  // kdz
    public final void a(Menu menu0, MenuInflater menuInflater0) {
        ibuq.f(menu0, "menu");
        ibuq.f(menuInflater0, "menuInflater");
        menuInflater0.inflate(0x7F100014, menu0);  // menu:fop_card_details_menu
    }

    @Override  // kdz
    public final void b(Menu menu0) {
    }

    @Override  // kdz
    public final void c(Menu menu0) {
    }

    @Override  // kdz
    public final boolean d(MenuItem menuItem0) {
        ibuq.f(menuItem0, "menuItem");
        int v = menuItem0.getItemId();
        if(v == 0x7F0B03E1) {  // id:FeedbackItem
            dnci dnci0 = this.a;
            eeaw eeaw0 = dnci0.ai;
            dmgi dmgi0 = null;
            if(eeaw0 == null) {
                ibuq.j("navigationUtils");
                eeaw0 = null;
            }
            eeaw0.d(dnci0.an());
            dmgi dmgi1 = dnci0.ak;
            if(dmgi1 == null) {
                ibuq.j("eventLogger");
            }
            else {
                dmgi0 = dmgi1;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hagk.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hagk)hftv0).b = "FEEDBACK_PROVIDER";
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hagk)hftp1.b_message).c = "SEND_FEEDBACK";
            hagk hagk0 = (hagk)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hapr hapr0 = (hapr)hftp0.b_message;
            hagk0.getClass();
            hapr0.ab = hagk0;
            hapr0.c |= 0x8000000;
            dmgi0.b(((hapr)hftp0.N_build()));
            return true;
        }
        if(v == 0x7F0B08A1) {  // id:ThreeDotsItem
            this.a.y().g(true);
            return true;
        }
        return false;
    }
}

