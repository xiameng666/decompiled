import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public final class fddd {
    public static final baun a;
    public final fdco b;
    public final fdco c;
    public final fdab d;
    public final fcfe e;
    final Supplier f;
    final gmcg g;
    public final fdct h;

    static {
        fddd.a = new baun("wearable.Privacy", new String[0]);
    }

    public fddd(fdab fdab0, fdct fdct0, fcfe fcfe0, Supplier supplier0) {
        this.b = fdco.a();
        this.c = fdco.a();
        this.g = new bblp(1, 9);
        this.d = fdab0;
        this.h = fdct0;
        this.e = fcfe0;
        this.f = supplier0;
    }

    final evql a(Context context0) {
        gged_interceptors gged0 = gged_interceptors.q(Integer.valueOf(0x7F153664), Integer.valueOf(fddg.a()), Integer.valueOf(0x7F15087E), Integer.valueOf(fddd.d()), Integer.valueOf(0x7F15365D), Integer.valueOf(0x7F15365C));  // string:wearable_tos_wifi_title "Stay connected over Wi-Fi or LTE with Google Cloud 
                                                                                                                                                                                                                                  // Sync"
        fdan fdan0 = (fdan)this.f.get();
        String s = fdan0.d;
        String s1 = TextUtils.isEmpty(s) ? null : s;
        if(fdci.b() && s1 != null && fdan0.g) {
            if(Log.isLoggable("wearable.Privacy", 4)) {
                Log.i("wearable.Privacy", "Requesting consent update for watch: " + s);
            }
            if(hzvd.g()) {
                fdcw fdcw0 = new fdcw(this, context0, gged0, s1);
                this.g.execute(fdcw0);
            }
            else {
                this.d.b(context0, gqtz.WJ, gged0, this.b, null, null, s1);
            }
            fdbf fdbf0 = fdbf.i(context0);
            hfwn hfwn0 = hfyn.l();
            return fdbf0.e(this.b.d(s1, hfwn0));
        }
        if(Log.isLoggable("wearable.Privacy", 4)) {
            Log.i("wearable.Privacy", "Updating consent");
        }
        this.d.b(context0, gqtz.WJ, gged0, this.b, null, null, null);
        return fdbf.i(context0).g(this.b.b());
    }

    public final fddk b(Context context0, boolean z, fdan fdan0) {
        List list0;
        if(Log.isLoggable("wearable.Privacy", 3)) {
            Log.d("wearable.Privacy", String.format("[PrivacySettingsPresenter] getAdapter(%s, %b)", context0, Boolean.valueOf(z)));
        }
        fdde fdde0 = fddf.a();
        fdde0.a = (int)0x7F15365D;  // string:wearable_tos_logging_title "Usage and diagnostic reports"
        fdde0.c(0x7F15365C);  // string:wearable_tos_logging_description "Help improve Wear OS by automatically sending 
                              // diagnostic and device usage data to Google. If your additional Web & App Activity 
                              // setting is turned on, this data may be saved to your Google Account."
        fdde0.b = fdcn.a;
        fdde0.e(1);
        fdde0.d(true);
        fddf fddf0 = fdde0.a();
        fdde fdde1 = fddf.a();
        fdde1.a = (int)0x7F15087E;  // string:common_location_settings_title "Location"
        fdde1.c(fddd.d());
        fdde1.b = fdcn.c;
        fdde1.e(3);
        fdde1.b(((boolean)(fdan0.i ^ 1)));
        fdde1.d(true);
        fddf fddf1 = fdde1.a();
        if(z) {
            list0 = Arrays.asList(new fddf[]{fddf0, fddf1});
        }
        else {
            fdde fdde2 = fddf.a();
            fdde2.a = (int)0x7F153664;  // string:wearable_tos_wifi_title "Stay connected over Wi-Fi or LTE with Google Cloud 
                                        // Sync"
            fdde2.c(fddg.a());
            fdde2.b = fdcn.b;
            fdde2.e(2);
            fdde2.d(true);
            list0 = Arrays.asList(new fddf[]{fdde2.a(), fddf0, fddf1});
        }
        fdcx fdcx0 = new fdcx(this);
        fddk fddk0 = new fddk(this.c, fdcx0, fdan0, context0);
        fddk0.f(list0);
        return fddk0;
    }

    public final evql c(Context context0, int v) {
        if(Log.isLoggable("wearable.Privacy", 3)) {
            Log.d("wearable.Privacy", "[presenter] disableCloudSync " + fdae.a(v));
        }
        switch(v - 1) {
            case 0: {
                this.c.f(fdcn.b, false);
                return fdbf.i(context0).d(false);
            }
            case 1: {
                this.b.f(fdcn.b, false);
                return this.a(context0);
            }
            default: {
                return evrg.d(null);
            }
        }
    }

    private static int d() {
        return hzvd.h() ? 0x7F15365B : 0x7F15365A;  // string:wearable_tos_location_description_with_gla_disclosure "Your watch may use 
                                                    // the location from your phone, or the watch if available. The overall location setting 
                                                    // may be accessed here or on the watch. The Location Accuracy setting may only be 
                                                    // accessed on the watch.<br/><br/>When Location Accuracy is on, information about 
                                                    // wireless signals, such as Wi-Fi access points, cellular network towers, and GPS, 
                                                    // along with device sensor data, such as accelerometer and gyroscope, is used to estimate 
                                                    // more accurate device location, which apps and services use to provide location-based 
                                                    // features. To do this, Google periodically processes information about device sensors 
                                                    // and wireless signals near you to contribute to crowdsourced wireless signal locations.<br/><br/>Google 
                                                    // uses this information without identifying you to: improve location accuracy and 
                                                    // location-based services; and generally improve, provide, and maintain Google\'s 
                                                    // services. Google processes this information based on the legitimate interests of 
                                                    // Google and third parties to serve users\' needs.<br/><br/>You can turn off Location 
                                                    // Accuracy at any time in your wearable device\'s location settings. If Location Accuracy 
                                                    // is off, no Location Accuracy data will be collected. Only GPS and device sensors 
                                                    // are used, if available, to determine your device\'s location. This may impact the 
                                                    // availability and accuracy of locations for apps and services such as Google Maps 
                                                    // and finding a lost device.<br/><br/><a href=https://support.google.com/android/?p=location_accuracy>Learn 
                                                    // more</a>"
    }
}

