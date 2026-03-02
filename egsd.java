import android.content.Context;

final class egsd {
    public static final bboh a;
    public final acqj b;
    public final Context c;
    private final egry d;

    static {
        egsd.a = bboh.b("CoreUiAuditRecordUtil", bbcu.f);
    }

    public egsd(Context context0) {
        acqn acqn0 = new acqn(context0.getApplicationContext());
        super();
        this.c = context0;
        this.b = acqn0;
        this.d = egry.a;
    }

    final void a(String s, boolean z, int v) {
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.al;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkl.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grnp)hftp2.b_message).c = grno0.d;
        ((grnp)hftp2.b_message).b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkl grkl0 = (grkl)hftp1.b_message;
        grnp grnp0 = (grnp)hftp2.N_build();
        grnp0.getClass();
        grkl0.c = grnp0;
        grkl0.b |= 1;
        if(z && v == 0) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkl grkl1 = (grkl)hftp1.b_message;
            grkl1.b |= 2;
            grkl1.d = true;
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp3.b_message;
        grkl grkl2 = (grkl)hftp1.N_build();
        grkl2.getClass();
        grkv0.l = grkl2;
        grkv0.b |= 0x100;
        grmv grmv0 = (grmv)((ProtoLiteMessage)grmw.b).v_newBuilder();
        grmv0.a((z ? gvff.B : gvff.C));
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkv grkv1 = (grkv)hftp3.b_message;
        grmw grmw0 = (grmw)((ProtoLiteBuilder)grmv0).N_build();
        grmw0.getClass();
        grkv1.y = grmw0;
        grkv1.d |= 0x20000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv grkv2 = (grkv)hftp3.N_build();
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
        gqtz gqtz0 = gqtz.aV;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grns grns0 = (grns)hftp4.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grki.a).v_newBuilder();
        grjy grjy0 = grjy.a;
        grjx grjx0 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx0.k(0x7F152507);  // string:people_backup_sync_activity_title "Back up & sync"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki0 = (grki)hftp5.b_message;
        grjy grjy1 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
        grjy1.getClass();
        grki0.c = grjy1;
        grki0.b |= 1;
        grjx grjx1 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx1.k(0x7F15250C);  // string:people_backup_sync_information_banner "Back up & sync device contacts by 
                              // automatically saving them as Google contacts. Google contacts are available across 
                              // Google services and can be managed on any signed-in device."
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki1 = (grki)hftp5.b_message;
        grjy grjy2 = (grjy)((ProtoLiteBuilder)grjx1).N_build();
        grjy2.getClass();
        grki1.d = grjy2;
        grki1.b |= 2;
        grjx grjx2 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx2.k(0x7F15250E);  // string:people_backup_sync_toggle_text "Automatically back up & sync device contacts"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki2 = (grki)hftp5.b_message;
        grjy grjy3 = (grjy)((ProtoLiteBuilder)grjx2).N_build();
        grjy3.getClass();
        grki2.e = grjy3;
        grki2.b |= 4;
        grjx grjx3 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx3.k(0x7F152509);  // string:people_backup_sync_exclude_sources_banner "Doesn\'t apply to contacts on 
                              // SIM or in accounts syncing with cloud services, like Exchange."
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki3 = (grki)hftp5.b_message;
        grjy grjy4 = (grjy)((ProtoLiteBuilder)grjx3).N_build();
        grjy4.getClass();
        grki3.f = grjy4;
        grki3.b |= 8;
        grjx grjx4 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx4.k(0x7F13003B);  // plurals:people_backup_sync_contacts_not_backed_up
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki4 = (grki)hftp5.b_message;
        grjy grjy5 = (grjy)((ProtoLiteBuilder)grjx4).N_build();
        grjy5.getClass();
        grki4.g = grjy5;
        grki4.b |= 0x20;
        grjx grjx5 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx5.k(0x7F15256B);  // string:people_select_account_for_backup "Pick account for backup"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki5 = (grki)hftp5.b_message;
        grjy grjy6 = (grjy)((ProtoLiteBuilder)grjx5).N_build();
        grjy6.getClass();
        grki5.h = grjy6;
        grki5.b |= 0x40;
        grjx grjx6 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx6.k(0x7F152512);  // string:people_backup_sync_will_sync_button "Contacts will start syncing soon"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki6 = (grki)hftp5.b_message;
        grjy grjy7 = (grjy)((ProtoLiteBuilder)grjx6).N_build();
        grjy7.getClass();
        grki6.i = grjy7;
        grki6.b |= 0x80;
        grjx grjx7 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx7.k(0x7F152506);  // string:people_backup_sync_account "Backup account"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki7 = (grki)hftp5.b_message;
        grjy grjy8 = (grjy)((ProtoLiteBuilder)grjx7).N_build();
        grjy8.getClass();
        grki7.j = grjy8;
        grki7.b |= 0x100;
        String s1 = hwyp.d();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki8 = (grki)hftp5.b_message;
        grki8.b |= 0x200;
        grki8.k = s1;
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp6.b_message;
        grki grki9 = (grki)hftp5.N_build();
        grki9.getClass();
        grnk0.l = grki9;
        grnk0.b |= 0x4000;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grns grns1 = (grns)hftp4.b_message;
        grnk grnk1 = (grnk)hftp6.N_build();
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
        this.c(grkf0, s).z(new egsc(grkf0));
    }

    final void b(String s, boolean z, int v) {
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.am;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkm.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = z ? grno.b : grno.c;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grnp)hftp2.b_message).c = grno0.d;
        ((grnp)hftp2.b_message).b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkm grkm0 = (grkm)hftp1.b_message;
        grnp grnp0 = (grnp)hftp2.N_build();
        grnp0.getClass();
        grkm0.c = grnp0;
        grkm0.b |= 1;
        if(z && v == 0) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkm grkm1 = (grkm)hftp1.b_message;
            grkm1.b |= 2;
            grkm1.d = true;
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp3.b_message;
        grkm grkm2 = (grkm)hftp1.N_build();
        grkm2.getClass();
        grkv0.m = grkm2;
        grkv0.b |= 0x200;
        grmv grmv0 = (grmv)((ProtoLiteMessage)grmw.b).v_newBuilder();
        grmv0.a((z ? gvff.B : gvff.C));
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grkv grkv1 = (grkv)hftp3.b_message;
        grmw grmw0 = (grmw)((ProtoLiteBuilder)grmv0).N_build();
        grmw0.getClass();
        grkv1.y = grmw0;
        grkv1.d |= 0x20000;
        grkv grkv2 = (grkv)hftp3.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
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
        gqtz gqtz0 = gqtz.aW;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grns grns0 = (grns)hftp4.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grki.a).v_newBuilder();
        grjy grjy0 = grjy.a;
        grjx grjx0 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx0.k(0x7F152508);  // string:people_backup_sync_activity_title_v2 "Sync device and SIM contacts"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki0 = (grki)hftp5.b_message;
        grjy grjy1 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
        grjy1.getClass();
        grki0.c = grjy1;
        grki0.b |= 1;
        grjx grjx1 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx1.k(0x7F152510);  // string:people_backup_sync_v2_information_banner "Google Contacts can automatically 
                              // sync contacts on your device and SIM so they\'re backed up to your account and available 
                              // across Google services and anywhere you sign in."
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki1 = (grki)hftp5.b_message;
        grjy grjy2 = (grjy)((ProtoLiteBuilder)grjx1).N_build();
        grjy2.getClass();
        grki1.d = grjy2;
        grki1.b |= 2;
        grjx grjx2 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx2.k(0x7F152511);  // string:people_backup_sync_v2_toggle_text "Sync device and SIM contacts automatically"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki2 = (grki)hftp5.b_message;
        grjy grjy3 = (grjy)((ProtoLiteBuilder)grjx2).N_build();
        grjy3.getClass();
        grki2.e = grjy3;
        grki2.b |= 4;
        grjx grjx3 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx3.k(0x7F152509);  // string:people_backup_sync_exclude_sources_banner "Doesn\'t apply to contacts on 
                              // SIM or in accounts syncing with cloud services, like Exchange."
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki3 = (grki)hftp5.b_message;
        grjy grjy4 = (grjy)((ProtoLiteBuilder)grjx3).N_build();
        grjy4.getClass();
        grki3.f = grjy4;
        grki3.b |= 8;
        grjx grjx4 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx4.k(0x7F13003B);  // plurals:people_backup_sync_contacts_not_backed_up
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki4 = (grki)hftp5.b_message;
        grjy grjy5 = (grjy)((ProtoLiteBuilder)grjx4).N_build();
        grjy5.getClass();
        grki4.g = grjy5;
        grki4.b |= 0x20;
        grjx grjx5 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx5.k(0x7F15256B);  // string:people_select_account_for_backup "Pick account for backup"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki5 = (grki)hftp5.b_message;
        grjy grjy6 = (grjy)((ProtoLiteBuilder)grjx5).N_build();
        grjy6.getClass();
        grki5.h = grjy6;
        grki5.b |= 0x40;
        grjx grjx6 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx6.k(0x7F152512);  // string:people_backup_sync_will_sync_button "Contacts will start syncing soon"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki6 = (grki)hftp5.b_message;
        grjy grjy7 = (grjy)((ProtoLiteBuilder)grjx6).N_build();
        grjy7.getClass();
        grki6.i = grjy7;
        grki6.b |= 0x80;
        grjx grjx7 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx7.k(0x7F152506);  // string:people_backup_sync_account "Backup account"
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki7 = (grki)hftp5.b_message;
        grjy grjy8 = (grjy)((ProtoLiteBuilder)grjx7).N_build();
        grjy8.getClass();
        grki7.j = grjy8;
        grki7.b |= 0x100;
        String s1 = hwyp.d();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grki grki8 = (grki)hftp5.b_message;
        grki8.b |= 0x200;
        grki8.k = s1;
        grki grki9 = (grki)hftp5.N_build();
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp6.b_message;
        grki9.getClass();
        grnk0.l = grki9;
        grnk0.b |= 0x4000;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grns grns1 = (grns)hftp4.b_message;
        grnk grnk1 = (grnk)hftp6.N_build();
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
        this.c(grkf0, s).z(new egsb(grkf0));
    }

    private final evql c(grkf grkf0, String s) {
        if(s == null) {
            return evrg.d(null).e(new egsa(this, grkf0, null));
        }
        evqp evqp0 = new evqp();
        new egrx(this.d, this.c, s, evqp0).start();
        return evqp0.a.e(new egsa(this, grkf0, s));
    }
}

