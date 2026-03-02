import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.RawContacts;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupSyncContactInfo;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;
import java.util.Locale;

public final class ekcx {
    private final Context a;
    private final String b;
    private final ekca c;
    private final ekep d;
    private final ejza e;
    private final ejyu f;

    public ekcx(Context context0, String s, ekca ekca0, ekep ekep0, ejza ejza0, ejyu ejyu0) {
        this.a = context0;
        batl.s(s);
        this.b = s;
        this.c = ekca0;
        this.d = ekep0;
        this.e = ejza0;
        this.f = ejyu0;
    }

    public final gssi a() {
        gfsx gfsx5;
        gfsx gfsx4;
        gfsx gfsx3;
        int v5;
        int v4;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gssi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gssi gssi0 = (gssi)hftp0.b_message;
        hfuf hfuf0 = gssi0.c;
        if(!hfuf0.c()) {
            gssi0.c = ProtoLiteMessage.C(hfuf0);
        }
        gssi0.c.i(1);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hing.a).v_newBuilder();
        ejyu ejyu0 = this.f;
        String s = this.b;
        String s1 = ejyu0.b(s);
        if(s1 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hing hing0 = (hing)hftp1.b_message;
            hing0.b |= 1;
            hing0.e = s1;
        }
        gfsx gfsx0 = ejyu.a(ejyu0.c);
        if(gfsx0.i()) {
            Long long0 = (Long)gfsx0.d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hing)hftp1.b_message).c = 2;
            ((hing)hftp1.b_message).d = long0;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hinc.a).v_newBuilder();
        String s2 = Build.BRAND;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hinc hinc0 = (hinc)hftp2.b_message;
        s2.getClass();
        hinc0.b |= 2;
        hinc0.d = s2;
        String s3 = Build.MODEL;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hinc hinc1 = (hinc)hftp2.b_message;
        s3.getClass();
        hinc1.b |= 4;
        hinc1.e = s3;
        String s4 = Build.DISPLAY;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hinc hinc2 = (hinc)hftp2.b_message;
        s4.getClass();
        hinc2.b |= 16;
        hinc2.g = s4;
        String s5 = Build.MANUFACTURER;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hinc hinc3 = (hinc)hftp2.b_message;
        s5.getClass();
        hinc3.b |= 1;
        hinc3.c = s5;
        int v = Build.VERSION.SDK_INT;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hinc hinc4 = (hinc)hftp2.b_message;
        hinc4.b |= 0x20;
        hinc4.h = v;
        String s6 = Build.DEVICE;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hinc hinc5 = (hinc)hftp2.b_message;
        s6.getClass();
        hinc5.b |= 8;
        hinc5.f = s6;
        hinc hinc6 = (hinc)hftp2.N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)himk.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((himk)hftp3.b_message).d = 1;
        ((himk)hftp3.b_message).b |= 2;
        double f = ekcd.a();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        himk himk0 = (himk)hftp3.b_message;
        himk0.b |= 4;
        himk0.e = f;
        int v1 = this.b("com.android.contacts");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((himk)hftp3.b_message).f = v1 - 1;
        ((himk)hftp3.b_message).b |= 16;
        int v2 = this.b("com.google.android.gms.people");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((himk)hftp3.b_message).g = v2 - 1;
        ((himk)hftp3.b_message).b |= 0x20;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hinf.a).v_newBuilder();
        ekca ekca0 = this.c;
        BackupAndSyncOptInState backupAndSyncOptInState0 = (BackupAndSyncOptInState)ekca0.a().d();
        int v3 = 3;
        switch(backupAndSyncOptInState0.c) {
            case 1: {
                v4 = 5;
                break;
            }
            case 2: {
                v4 = 4;
                break;
            }
            case 3: {
                v4 = s.equals(backupAndSyncOptInState0.a) ? 2 : 3;
                break;
            }
            default: {
                v4 = 1;
            }
        }
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((hinf)hftp4.b_message).c = v4 - 1;
        ((hinf)hftp4.b_message).b |= 1;
        hxui hxui0 = hxui.a;
        if(hxui0.d().i()) {
            v5 = 1;
        }
        else {
            gfsx gfsx1 = ekca0.b();
            if(!gfsx1.i()) {
                v5 = 1;
            }
            else if(hxui0.d().m() && ((GetBackupSyncSuggestionResponse)gfsx1.d()).c != null) {
                BackupSyncContactInfo backupSyncContactInfo0 = ((GetBackupSyncSuggestionResponse)gfsx1.d()).c;
                BackupSyncContactInfo backupSyncContactInfo1 = ((GetBackupSyncSuggestionResponse)gfsx1.d()).c;
                v5 = backupSyncContactInfo0.a <= 0 && backupSyncContactInfo1.d <= 0 ? 2 : 3;
            }
            else {
                switch(((GetBackupSyncSuggestionResponse)gfsx1.d()).a) {
                    case 1: 
                    case 2: 
                    case 3: {
                        v5 = 2;
                        break;
                    }
                    case 4: {
                        v5 = 3;
                        break;
                    }
                    default: {
                        v5 = 1;
                    }
                }
            }
        }
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((hinf)hftp4.b_message).d = v5 - 1;
        ((hinf)hftp4.b_message).b |= 2;
        hinf hinf0 = (hinf)hftp4.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        hinf0.getClass();
        ((himk)hftv0).h = hinf0;
        ((himk)hftv0).b |= 0x40;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((himk)hftp3.b_message).c = 1;
        ((himk)hftp3.b_message).b |= 1;
        himk himk1 = (himk)hftp3.N_build();
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hinj.a).v_newBuilder();
        Context context0 = this.a;
        long v6 = (long)ekcd.b(context0, ContactsContract.Contacts.CONTENT_URI, ekcd.b);
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        hinj hinj0 = (hinj)hftp5.b_message;
        hinj0.b |= 2;
        hinj0.f = v6;
        long v7 = (long)ekcd.b(context0, ContactsContract.RawContacts.CONTENT_URI, ekcd.a);
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp5.b_message;
        ((hinj)hftv1).b |= 4;
        ((hinj)hftv1).g = v7;
        if(!hftv1.isImmutable()) {
            hftp5.ensureMutable();
        }
        hinj hinj1 = (hinj)hftp5.b_message;
        himk1.getClass();
        hinj1.d = himk1;
        hinj1.c = 8;
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp5.b_message;
        hfwn0.getClass();
        ((hinj)hftv2).i = hfwn0;
        ((hinj)hftv2).b |= 16;
        if(!hftv2.isImmutable()) {
            hftp5.ensureMutable();
        }
        hinj hinj2 = (hinj)hftp5.b_message;
        hfuf hfuf1 = hinj2.j;
        if(!hfuf1.c()) {
            hinj2.j = ProtoLiteMessage.C(hfuf1);
        }
        hinj2.j.i(1);
        gfsx gfsx2 = ((ekeq)this.d).b();
        if(gfsx2.i()) {
            azuj azuj0 = ((azui)gfsx2.d()).a;
            gfsx3 = gfsx.l((azuj0 == null ? null : ((cowe)azuj0).a.b()));
        }
        else {
            ((ggtj)ekeq.a.j()).x("getSignedInAccountName: Falling back to default value");
            gfsx3 = gfqx.a;
        }
        if(!gfsx3.i() || ((String)gfsx3.d()).equals(s)) {
            v3 = 2;
        }
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ((hinj)hftp5.b_message).h = v3 - 1;
        ((hinj)hftp5.b_message).b |= 8;
        ejza ejza0 = this.e;
        Locale locale0 = Locale.getDefault();
        if(locale0 == null) {
            gfsx4 = gfqx.a;
        }
        else {
            String s7 = locale0.getCountry();
            gfsx4 = TextUtils.isEmpty(s7) ? gfqx.a : gfsx.m(s7);
        }
        if(gfsx4.i()) {
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hinl.a).v_newBuilder();
            Object object0 = gfsx4.d();
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            hinl hinl0 = (hinl)hftp6.b_message;
            hinl0.b |= 1;
            hinl0.c = (String)object0;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            hinj hinj3 = (hinj)hftp5.b_message;
            hinl hinl1 = (hinl)hftp6.N_build();
            hinl1.getClass();
            hinj3.e = hinl1;
            hinj3.b |= 1;
            Object object1 = gfsx4.d();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            hinj hinj4 = (hinj)hftp5.b_message;
            hinj4.b |= 0x100;
            hinj4.m = (String)object1;
        }
        TelephonyManager telephonyManager0 = ejza0.b;
        if(telephonyManager0.getPhoneType() == 1) {
            String s8 = telephonyManager0.getNetworkCountryIso();
            gfsx5 = TextUtils.isEmpty(s8) ? gfqx.a : gfsx.m(s8);
        }
        else {
            gfsx5 = gfqx.a;
        }
        if(gfsx5.i()) {
            Object object2 = gfsx5.d();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            hinj hinj5 = (hinj)hftp5.b_message;
            hinj5.b |= 0x40;
            hinj5.k = (String)object2;
        }
        String s9 = telephonyManager0.getSimCountryIso();
        gfsx gfsx6 = TextUtils.isEmpty(s9) ? gfqx.a : gfsx.m(s9);
        if(gfsx6.i()) {
            Object object3 = gfsx6.d();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            hinj hinj6 = (hinj)hftp5.b_message;
            hinj6.b |= 0x80;
            hinj6.l = (String)object3;
        }
        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hinm.a).v_newBuilder();
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        hinm hinm0 = (hinm)hftp7.b_message;
        hing hing1 = (hing)hftp1.N_build();
        hing1.getClass();
        hinm0.c = hing1;
        hinm0.b |= 1;
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp7.b_message;
        hinc6.getClass();
        ((hinm)hftv3).d = hinc6;
        ((hinm)hftv3).b |= 2;
        if(!hftv3.isImmutable()) {
            hftp7.ensureMutable();
        }
        hinm hinm1 = (hinm)hftp7.b_message;
        hinj hinj7 = (hinj)hftp5.N_build();
        hinj7.getClass();
        hinm1.e = hinj7;
        hinm1.b |= 4;
        hinm hinm2 = (hinm)hftp7.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gssi gssi1 = (gssi)hftp0.b_message;
        hinm2.getClass();
        gssi1.d = hinm2;
        gssi1.b |= 1;
        return (gssi)hftp0.N_build();
    }

    private final int b(String s) {
        return ContentResolver.getSyncAutomatically(new Account(this.b, "com.google"), s) ? 2 : 3;
    }
}

