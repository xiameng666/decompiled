import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import j..util.Objects;
import java.util.List;

final class abur implements Runnable {
    final abut a;

    public abur(abus abus0, abut abut0) {
        this.a = abut0;
        Objects.requireNonNull(abus0);
        super();
    }

    @Override
    public final void run() {
        bbsj bbsj0;
        String s2;
        Intent intent1;
        List list1;
        List list0;
        abut abut0 = this.a;
        if(abut0.getSupportFragmentManager().B) {
            for(int v = 0; true; ++v) {
                list0 = abut0.n;
                if(v >= list0.size()) {
                    break;
                }
                ((Parcel)list0.get(v)).recycle();
            }
            list0.clear();
            return;
        }
        bbsh bbsh0 = abut0.q;
        bbse bbse0 = bbsh0.M(0x7F15085F);  // string:common_google_settings_account "Account"
        if(bbse0 == null) {
            bbse0 = bbsh0.K(0x7F15085F);  // string:common_google_settings_account "Account"
        }
        bbse bbse1 = bbsh0.M(0x7F15086B);  // string:common_google_settings_services_on_this_device "Services on this device"
        if(bbse1 == null) {
            bbse1 = bbsh0.K(0x7F15086B);  // string:common_google_settings_services_on_this_device "Services on this device"
        }
        bbse bbse2 = bbsh0.M(0x7F150863);  // string:common_google_settings_developer "Developer"
        if(bbse2 == null) {
            bbse2 = bbsh0.K(0x7F150863);  // string:common_google_settings_developer "Developer"
        }
        bbse bbse3 = bbsh0.M(0x7F150867);  // string:common_google_settings_internal "[internal]"
        if(bbse3 == null) {
            bbse3 = bbsh0.K(0x7F150867);  // string:common_google_settings_internal "[internal]"
        }
        abut0.l(1, bbse0);
        abut0.l(0, bbse1);
        abut0.l(3, bbse2);
        if(hrpn.d()) {
            abut0.l(2, bbse3);
        }
        abut0.m(4, 0x7F15086D);  // string:common_google_settings_settings_for_google_apps "Settings for Google apps"
        abut0.m(5, 0x7F150869);  // string:common_google_settings_mobile_data_and_messaging "Mobile data & messaging"
        abut0.m(6, 0x7F150865);  // string:common_google_settings_devices_and_sharing "Devices & sharing"
        abut0.m(7, 0x7F15086C);  // string:common_google_settings_set_up_and_restore "Set up & restore"
        abut0.m(8, 0x7F150860);  // string:common_google_settings_autofill "Autofill"
        int v1 = 0;
        while(true) {
            list1 = abut0.n;
            if(v1 >= list1.size()) {
                break;
            }
            Parcel parcel0 = (Parcel)list1.get(v1);
            parcel0.setDataPosition(0);
            GoogleSettingsItem googleSettingsItem0 = (GoogleSettingsItem)GoogleSettingsItem.CREATOR.createFromParcel(parcel0);
            parcel0.recycle();
            int v2 = googleSettingsItem0.b;
            if(v2 == 2) {
                abut0.l |= googleSettingsItem0.g;
                v2 = 2;
            }
            if(abut0.p.i(googleSettingsItem0, abut0)) {
                bxd bxd0 = abut0.m;
                bbse bbse4 = (bbse)bxd0.get(Integer.valueOf(v2));
                if(bbse4 != null) {
                    awkv awkv0 = awkv.b(googleSettingsItem0.n);
                    Intent intent0 = googleSettingsItem0.a;
                    String s = googleSettingsItem0.c;
                    String s1 = googleSettingsItem0.h;
                    if(awkv0 == null) {
                        awkv0 = awkv.a;
                    }
                    List list2 = (List)bzu.a(abut0.o, bbse4.b);
                    if(list2 == null) {
                    label_69:
                        intent1 = intent0;
                        s2 = s;
                    }
                    else {
                        if(hrpn.a.b().e()) {
                            if(abut0.s(intent0)) {
                                GoogleSettingsItem googleSettingsItem1 = new GoogleSettingsItem(intent0, bbse4.b, s, awkv0, bbdi.a);
                                googleSettingsItem1.h = s1;
                                list2.add(googleSettingsItem1);
                            }
                            else {
                                ((ggtj)abut.j.j()).B("Intent does not resolve: %s", intent0);
                            }
                            goto label_79;
                        }
                        else {
                            intent1 = intent0;
                            s2 = s;
                            bbse4 = (bbse)bxd0.get(Integer.valueOf(0));
                            batl.s(bbse4);
                            goto label_71;
                        }
                        goto label_69;
                    }
                label_71:
                    if(abut0.s(intent1)) {
                        bbsj0 = new bbsj(abut0);
                        bbsj0.s(s2);
                        bbsj0.m(intent1);
                        bbsj0.q(s1);
                        if(!bbse4.l(bbsj0)) {
                            bbse4.k(bbsj0);
                        }
                    }
                    else {
                    label_79:
                        bbsj0 = null;
                    }
                    if(bbsj0 != null) {
                        bbsj0.i(googleSettingsItem0.i);
                        int v3 = googleSettingsItem0.d;
                        if(v3 > 0) {
                            bbsj0.o(v3);
                        }
                    }
                }
            }
            ++v1;
        }
        abut0.n(4, 0x7F15086D);  // string:common_google_settings_settings_for_google_apps "Settings for Google apps"
        abut0.n(5, 0x7F150869);  // string:common_google_settings_mobile_data_and_messaging "Mobile data & messaging"
        abut0.n(6, 0x7F150865);  // string:common_google_settings_devices_and_sharing "Devices & sharing"
        abut0.n(7, 0x7F15086C);  // string:common_google_settings_set_up_and_restore "Set up & restore"
        abut0.n(8, 0x7F150860);  // string:common_google_settings_autofill "Autofill"
        abut0.n(10, 0x7F15086A);  // string:common_google_settings_personal_safety "Personal Safety"
        abut0.n(11, 0x7F150868);  // string:common_google_settings_kids_and_family "Kids and Family"
        abut0.n(12, 0x7F150864);  // string:common_google_settings_device_security "Device Security"
        list1.clear();
        abut.k = null;
    }
}

