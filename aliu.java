import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.List;

public final class aliu {
    public final boolean a;
    public final cmdb b;
    private final ayvf c;
    private final ccza d;
    private final ccmg e;

    public aliu() {
        String s1;
        boolean z = hpzi.a.d().e();
        this.a = z;
        AppContextProvider.a();
        this.e = new ccmp();
        if(z) {
            this.c = null;
            this.b = null;
            ccza ccza0 = new ccza(((int)hpzi.b()), cdza.b);
            this.d = ccza0;
            ccza0.k();
            return;
        }
        Context context0 = AppContextProvider.a();
        String s = hpzi.f() ? "PROXIMITY_AUTH" : null;
        Context context1 = AppContextProvider.a();
        if(hpzi.f()) {
            List list0 = bbmn.h(context1, "com.google.android.gms");
            s1 = list0.isEmpty() ? null : ((Account)list0.get(0)).name;
        }
        else {
            s1 = null;
        }
        ayud ayud0 = new ayud(context0, s, s1);
        this.c = new ayvf(ayud0, "PROXIMITY_AUTH_COUNTERS", ((int)hpzi.b()));
        this.b = hpzi.f() ? cmdb.b(ayud0, AppContextProvider.a()) : null;
        this.d = null;
    }

    public final void A(int v) {
        if(hpyw.g()) {
            this.C("get_my_synced_metadata_operation_result", v);
        }
    }

    public final void B(int v) {
        if(hpyw.g()) {
            this.C("get_synced_devices_operation_result", v);
        }
    }

    public final void C(String s, int v) {
        if(!hpzi.g()) {
            return;
        }
        if(this.a) {
            ccza ccza0 = this.d;
            ccyw ccyw0 = ccza0.e(s);
            ccyv ccyv0 = ccyw0.f.f;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
            String s1 = ccyw0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((ccwq)hftv0).b |= 1;
            ((ccwq)hftv0).c = s1;
            ccwp ccwp0 = ccwp.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((ccwq)hftv1).d = ccwp0.g;
            ((ccwq)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((ccwq)hftv2).b |= 8;
            ((ccwq)hftv2).f = v;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ccwq ccwq0 = (ccwq)hftp0.b_message;
            ccwq0.b |= 0x20;
            ccwq0.h = 1L;
            ccyw0.a(hftp0, ccyv0);
            ccza0.j();
            return;
        }
        this.c.e(s).a(((long)v), 1L, ayvf.b);
        this.c.h();
    }

    public final void D(int v) {
        this.C("key_agreement_result", v);
    }

    public final void E(int v) {
        this.C("nearby_listener_connected_to_authenticated_result", v);
    }

    public final void F(int v) {
        this.C("peripheral_role_connected_to_authenticated_result", v);
    }

    public final void G(int v) {
        this.C("phone_hub_feature_setup_result_camera_roll", v);
    }

    public final void H(int v) {
        this.C("phone_hub_message_received", v);
    }

    public final void I() {
        this.b("phone_hub_open_settings_from_notification_count");
        this.c();
    }

    public final void J(int v) {
        this.C("reconcile_individual_feature_attempt_result", v);
    }

    public final void K(int v) {
        this.C("set_feature_enabled_operation_result", v);
    }

    public final void L(int v) {
        this.C("set_feature_enabled_result", v);
    }

    public final void M(boolean z) {
        if(!hpzi.g()) {
            return;
        }
        this.b("set_feature_supported_enrollment_count");
        if(z) {
            this.b("set_feature_supported_immediate_enrollment_count");
        }
        this.c();
    }

    public final void N(int v) {
        this.C("set_feature_supported_operation_result", v);
    }

    public final void O(boolean z) {
        this.C("set_phone_hub_camera_roll_enable_toggle_result", ((int)z));
    }

    public final void P(boolean z) {
        this.C("set_phone_hub_notifications_enable_toggle_result", ((int)z));
    }

    public final void Q(boolean z) {
        this.C("set_phone_hub_personal_profile_sync_enable_toggle_result", ((int)z));
    }

    public final void R(int v) {
        this.C("setup_ble_advertisement_background_result", v);
    }

    public final void S(int v) {
        this.C("setup_ble_advertisement_foreground_result", v);
    }

    public final void T(int v) {
        this.C("start_ble_advertising_result", v);
    }

    public final void U() {
        this.C("start_ble_advertising_result", 0);
    }

    public final void V(int v) {
        this.C("start_exo_service_result", v);
    }

    public final void W(int v) {
        this.C("start_phone_hub_service_result", v);
    }

    public final void X(alit alit0) {
        if(hpzi.g()) {
            if(this.a) {
                ccyy ccyy0 = alit0.b;
                if(ccyy0 != null) {
                    ccyz ccyz0 = ccyy0.b;
                    ccyv ccyv0 = ccyz0.f.f;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ccyz0.a.getClass();
                    ((ccwq)hftv0).b |= 1;
                    ((ccwq)hftv0).c = ccyz0.a;
                    ccwp ccwp0 = ccwp.f;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ccwq)hftp0.b_message).d = ccwp0.g;
                    ((ccwq)hftp0.b_message).b |= 2;
                    long v = ccyy0.a();
                    long v1 = ccyz0.b.a(v);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((ccwq)hftv1).b |= 16;
                    ((ccwq)hftv1).g = v1;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ccwq ccwq0 = (ccwq)hftp0.b_message;
                    ccwq0.b |= 0x20;
                    ccwq0.h = 1L;
                    ccyy0.a.a(hftp0, ccyv0);
                    this.d.j();
                }
            }
            else {
                ayvd ayvd0 = alit0.a;
                if(ayvd0 != null) {
                    long v2 = ayvd0.a();
                    long v3 = ayvd0.a.g.a(v2);
                    ayvd0.a.a(v3, 1L, ayvf.b);
                    this.c.h();
                }
            }
        }
    }

    public final alit a(String s) {
        if(this.a) {
            ccyz ccyz0 = this.d.i(s, ccza.a);
            return new alit(new ccyy(ccyz0, ccyz0));
        }
        ayve ayve0 = this.c.g(s);
        return new alit(new ayvd(ayve0, ayve0));
    }

    public final void b(String s) {
        if(!hpzi.g()) {
            return;
        }
        if(this.a) {
            ccyt ccyt0 = this.d.c(s);
            ccyv ccyv0 = ccyt0.f.f;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
            String s1 = ccyt0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((ccwq)hftv0).b |= 1;
            ((ccwq)hftv0).c = s1;
            ccwp ccwp0 = ccwp.b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((ccwq)hftv1).d = ccwp0.g;
            ((ccwq)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ccwq ccwq0 = (ccwq)hftp0.b_message;
            ccwq0.b |= 0x20;
            ccwq0.h = 1L;
            ccyt0.a(hftp0, ccyv0);
            return;
        }
        this.c.d(s).a(0L, 1L, ayvf.b);
    }

    public final void c() {
        if(!hpzi.g()) {
            return;
        }
        if(this.a) {
            this.d.j();
            return;
        }
        this.c.h();
    }

    public final void d(int v) {
        this.C("batch_set_feature_supported_operation_result", v);
    }

    public final void e(int v) {
        this.C("better_together_disabling_result", v);
    }

    public final void f(int v) {
        this.C("better_together_host_eligibility_status", v);
    }

    public final void g(int v) {
        this.C("better_together_setup_result", v);
        if(v == 0) {
            this.e.a(bbdg.hk);
            return;
        }
        if(v != 1) {
            this.e.a(bbdg.hl);
        }
    }

    public final void h(int v) {
        this.C("ble_weave_socket_write_result", v);
    }

    public final void i(int v) {
        this.C("central_role_connected_to_authenticated_result", v);
    }

    public final void j(int v) {
        this.C("cryptauth_device_sync_account_fetch_result", v);
    }

    public final void k(int v) {
        this.C("cryptauth_device_sync_gcm_task_result", v);
    }

    public final void l(int v) {
        this.C("cryptauth_device_sync_v2_gcm_task_result", v);
    }

    public final void m(int v) {
        this.C("device_sync_result", v);
    }

    public final void n(int v) {
        this.C("device_sync_v2_registration_result", v);
    }

    public final void o(int v) {
        this.C("disable_better_together_result", v);
    }

    public final void p() {
        this.b("exo_connected_count");
        this.c();
    }

    public final void q(int v) {
        this.C("feature_enabled_controller_set_result", v);
    }

    public final void r(int v) {
        this.C("feature_loader_init_result", v);
    }

    public final void s(int v) {
        this.C("feature_reconcile_intent_operation_result", v);
    }

    public final void t(int v) {
        this.C("feature_requester_request_result", v);
    }

    public final void u(int v) {
        this.C("force_cryptauth_sync_result", v);
    }

    public final void v(int v) {
        if(hpzi.e()) {
            this.C("generate_advertisement_result", v);
        }
    }

    public final void w(int v) {
        if(hpzi.e()) {
            this.C("generate_eid_data_with_timestamp_result", v);
        }
    }

    public final void x(int v) {
        if(hpzi.e()) {
            this.C("generate_foreground_advertisement_result", v);
        }
    }

    public final void y(int v) {
        if(hpzi.e()) {
            this.C("get_eid_period_timestamps_result", v);
        }
    }

    public final void z(int v) {
        this.C("get_my_synced_metadata_backfill_count", v);
    }
}

