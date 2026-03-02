import java.util.function.Function;

public final class fcji implements fciy {
    public static final baun a;
    static final feze b;
    public final fcls c;

    static {
        fcji.a = new fcgf(new String[]{"BackupSettingsCompCli"});
        fezd fezd0 = (fezd)((ProtoLiteMessage)feze.a).v_newBuilder();
        if(!fezd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fezd0).ensureMutable();
        }
        feze.c(((feze)fezd0.b_message));
        fezd0.l(0x7F153650);  // string:wearable_tos_backup_title "Back up your watch"
        fezd0.l(0x7F15365F);  // string:wearable_tos_title "Terms of service"
        if(!fezd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fezd0).ensureMutable();
        }
        feze feze0 = (feze)fezd0.b_message;
        feze0.b();
        feze0.d.i(0x7F15364F);  // string:wearable_tos_backup_description "Automatically backup your data so you can 
                                // restore it if you lose your device or get a new one. Your secure backup includes 
                                // apps, app data, watch faces, tiles, call history, and device settings (including 
                                // permissions), when available.<br/><br/>Your backups are uploaded to Google and encrypted 
                                // using your Google Account password. For some data, your device\'s screen lock PIN 
                                // or pattern is also used for encryption.<br/><br/>App data can be any data that an 
                                // app has saved (based on developer settings).<br/><br/>You can turn this service 
                                // off in Settings."
        fezd0.k(0x7F15364E);  // string:wearable_tos_accept_button_label "I agree"
        fezd0.a(0x7F153651);  // string:wearable_tos_cancel_button_label "Decline"
        fcji.b = (feze)((ProtoLiteBuilder)fezd0).N_build();
    }

    public fcji(fcls fcls0) {
        this.c = fcls0;
    }

    @Override  // fciy
    public final evql a(String s, feza feza0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        feza0.getClass();
        ((fezb)hftv0).c = feza0;
        ((fezb)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezb fezb0 = (fezb)hftp0.b_message;
        fezb0.b |= 2;
        fezb0.d = true;
        byte[] arr_b = ((fezb)hftp0.N_build()).toBytesArray();
        return fcji.h(this.c.a(s, "/backup_settings/disable_backup", arr_b), ((Parser)((ProtoLiteMessage)fezc.a).jf(7, null)), new fcja());
    }

    @Override  // fciy
    public final evql b(String s, String s1, feze feze0) {
        fcji.a.j("enableBackup, nodeId=%s, account=%s", new Object[]{s, baun.q(s1)});
        return this.i(s, s1, feze0, false);
    }

    @Override  // fciy
    public final evql c(String s, String s1) {
        fcji.a.j("enableBackupInSetup, nodeId=%s, account=%s", new Object[]{s, baun.q(s1)});
        return this.i(s, s1, fcji.b, true);
    }

    @Override  // fciy
    public final evql d(String s, gico gico0) {
        fcji.a.j("enableBackupSkipped, nodeId=%s, fragmentType=%s", new Object[]{s, gico0.name()});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fezh)hftv0).c = gico0.q;
        ((fezh)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezh fezh0 = (fezh)hftp0.b_message;
        fezh0.b |= 2;
        fezh0.d = true;
        byte[] arr_b = ((fezh)hftp0.N_build()).toBytesArray();
        return fcji.h(this.c.a(s, "/backup_settings/enable_backup_skipped", arr_b), ((Parser)((ProtoLiteMessage)fezi.a).jf(7, null)), new fcjf());
    }

    @Override  // fciy
    public final evql e(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezk fezk0 = (fezk)hftp0.b_message;
        fezk0.b |= 1;
        fezk0.c = true;
        byte[] arr_b = ((fezk)hftp0.N_build()).toBytesArray();
        return fcji.h(this.c.a(s, "/backup_settings/fetch_backup_size_and_time_stats", arr_b), ((Parser)((ProtoLiteMessage)fezl.a).jf(7, null)), new fcjc());
    }

    @Override  // fciy
    public final evql f(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((fezm)hftv0).b |= 1;
        ((fezm)hftv0).c = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezm fezm0 = (fezm)hftp0.b_message;
        fezm0.b |= 2;
        fezm0.d = true;
        byte[] arr_b = ((fezm)hftp0.N_build()).toBytesArray();
        return fcji.h(this.c.a(s, "/backup_settings/fetch_storage_quota", arr_b), ((Parser)((ProtoLiteMessage)fezn.a).jf(7, null)), new fcjd());
    }

    @Override  // fciy
    public final evql g(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbn ffbn0 = (ffbn)hftp0.b_message;
        ffbn0.b |= 1;
        ffbn0.c = true;
        byte[] arr_b = ((ffbn)hftp0.N_build()).toBytesArray();
        return fcji.h(this.c.a(s, "/backup_settings/refresh_backup_status", arr_b), ((Parser)((ProtoLiteMessage)ffbo.a).jf(7, null)), new fcjg());
    }

    public static evql h(evql evql0, Parser hfvs0, Function function0) {
        fcje fcje0 = new fcje(function0, hfvs0);
        return evql0.h(gmap.a, fcje0);
    }

    private final evql i(String s, String s1, feze feze0, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((fezf)hftv0).b |= 1;
        ((fezf)hftv0).c = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        feze0.getClass();
        ((fezf)hftv1).d = feze0;
        ((fezf)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((fezf)hftv2).b |= 4;
        ((fezf)hftv2).e = z;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezf fezf0 = (fezf)hftp0.b_message;
        fezf0.b |= 8;
        fezf0.f = true;
        byte[] arr_b = ((fezf)hftp0.N_build()).toBytesArray();
        return fcji.h(this.c.a(s, "/backup_settings/enable_backup", arr_b), ((Parser)((ProtoLiteMessage)fezg.a).jf(7, null)), new fcjh());
    }
}

