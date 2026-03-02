import android.text.TextUtils;
import j..util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public final class crwm {
    private static crwm a;
    private static final bboh b;
    private final Map c;

    static {
        crwm.b = bboh.b("MobileDataPlan", bbcu.ck);
    }

    protected crwm() {
        HashMap hashMap0 = new HashMap();
        this.c = hashMap0;
        crwm.e(hashMap0, "this is an invalid api key", "CLIENT_TestInvalid", 2);
        crwm.e(hashMap0, "AIzaSyCX7NVTCfWMK8eEUau8Scc2y6dZUpWfNd0", "CLIENT_TestApiMemBattery", 3);
        crwm.e(hashMap0, "AIzaSyDil7P0s1hvamdVWsqFtySc1T5P1S9dHqk", "CLIENT_DemoApp", 3);
        crwm.e(hashMap0, "AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI", "CLIENT_MdpUx", 3);
        crwm.e(hashMap0, "AIzaSyCV2I1gEhkJYkd51xG7MGaZGC85zylcS74", "CLIENT_Phonesky", 5);
        crwm.e(hashMap0, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", "CLIENT_BackgroundService", 3);
        crwm.e(hashMap0, "AIzaSyCTa7aViyHnB3GLIqhL5hQFZGb675SoCIA", "CLIENT_GoogleOne", 6);
        crwm.e(hashMap0, "AIzaSyCqrNxCAJrrk_NQqIUp1-baqW05d3JYeOc", "CLIENT_Assistant", 8);
        crwm.e(hashMap0, "AIzaSyA_n-CBlmsO1fOxFUZqRnQ9SX4Bh1jCjWg", "CLIENT_Esim", 3);
        crwm.e(hashMap0, "AIzaSyCChP9IaeaDS_LLGBI0P9CDQwTzCxn1kp8", "CLIENT_Assistant", 8);
        crwm.e(hashMap0, "AIzaSyDHQ9ipnphqTzDqZsbtd8_Ru4_kiKVQe2k", "CLIENT_Youtube", 9);
        crwm.e(hashMap0, "AIzaSyD5cCj3gK6IKFQCHRf1pYAt9nDKUzfxmPg", "CLIENT_Meteredness", 7);
        crwm.e(hashMap0, "AIzaSyA64xQnVODx8qBOeSsrlfDc8gDEw_NLopk", "ClientApp 12", 2);
        crwm.e(hashMap0, "AIzaSyBD1uN7sPOWjkZ3fNKv7xDlLqF7Rg_JLnk", "ClientApp 13", 2);
        crwm.e(hashMap0, "AIzaSyDtpXO8h8u8Z6N7asPxy6AczIICsqmkg64", "ClientApp 14", 2);
        crwm.e(hashMap0, "AIzaSyCymf5PAosq7hWs5DkgHy0-3uacHaY1SPE", "ClientApp 15", 2);
    }

    public final crwl a(String s, String s1) {
        crwl crwl0 = null;
        hvko.r();
        if(!TextUtils.isEmpty(hvko.r()) && hvko.r().equals(s)) {
            return new crwl(((crwl)this.c.get("AIzaSyCX7NVTCfWMK8eEUau8Scc2y6dZUpWfNd0")), s);
        }
        if(hvlq.q() && Objects.equals(s1, "ui_esim")) {
            return new crwl(((crwl)this.c.get("AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI")), s);
        }
        if(hvko.a.q().P() && !TextUtils.isEmpty(s1)) {
            Map map0 = this.c;
            synchronized(map0) {
                switch(s1) {
                    case "api_test": {
                        crwl0 = new crwl(((crwl)map0.get("AIzaSyCX7NVTCfWMK8eEUau8Scc2y6dZUpWfNd0")), s);
                        break;
                    }
                    case "ui_test": {
                        crwl0 = new crwl(((crwl)map0.get("AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI")), s);
                        break;
                    }
                    default: {
                        Level level0 = cslm.h();
                        crwm.b.g(level0).B("Invalid forTest parameter %s passed to getClient", s1);
                    }
                }
            }
            return crwl0;
        }
        if(s != null) {
            if(s.length() <= 1) {
                return null;
            }
            Map map1 = this.c;
            synchronized(map1) {
                String s2 = s.substring(s.length() - 8);
                for(Object object0: map1.values()) {
                    crwl crwl1 = (crwl)object0;
                    if(crwl1 != null && crwl1.b.equals(s2)) {
                        return new crwl(crwl1, s.substring(0, s.length() - 8));
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final crwl b(String s) {
        synchronized(this.c) {
        }
        return (crwl)this.c.get(s);
    }

    public static crwm c() {
        synchronized(crwm.class) {
            if(crwm.a == null) {
                crwm.a = new crwm();
            }
        }
        return crwm.a;
    }

    public final String d(String s, String s1) {
        crwl crwl0;
        Map map0 = this.c;
        synchronized(map0) {
            if(this.b(s1) == null) {
                return null;
            }
            crwl0 = (crwl)map0.get(s1);
            if(crwl0 == null) {
                return null;
            }
        }
        return s + crwl0.b;
    }

    private static void e(Map map0, String s, String s1, int v) {
        int v1 = map0.size() * 8;
        String s2 = "So0spJLqXM3ISkeQXqJp5Ljn9CefehfuA63QJayEq9jXqWCaBonDMicBQgQ1ej7yB7RzPZMPJbyWlzblbLZyTZ7ZZuFWKMovskRTAA8BSpur8wEspmRCn7gWJFFTjuI2qPrZzjkpZrsmBcTUbKkE9h7x1mV0egE3".substring(v1, v1 + 8);
        if(s2 != null && s2.length() == 8) {
            map0.put(s, new crwl(s, s2, s1, null, v));
        }
    }
}

