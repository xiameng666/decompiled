public enum aqfx implements hfub {
    UNKNOWN(0),
    CONTACTS(1),
    PHOTOS(2),
    DOWNLOADS(3),
    DOCUMENTS(4),
    MEDIA_MUSIC(5),
    APP_DATA(6),
    APK(7),
    MMS_ATTACHMENTS(8),
    WALLET(15),
    ANDROID_MESSAGES(14),
    IOS_WHATSAPP(9),
    VIDEOS(10),
    CALENDARS(11),
    IOS_ATTACHMENTS(12),
    IOS_RECORDINGS(13);

    public final int q;

    private aqfx(int v1) {
        this.q = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.q;
    }

    public static aqfx b(int v) {
        switch(v) {
            case 0: {
                return aqfx.a;
            }
            case 1: {
                return aqfx.b;
            }
            case 2: {
                return aqfx.c;
            }
            case 3: {
                return aqfx.d;
            }
            case 4: {
                return aqfx.e;
            }
            case 5: {
                return aqfx.f;
            }
            case 6: {
                return aqfx.g;
            }
            case 7: {
                return aqfx.h;
            }
            case 8: {
                return aqfx.i;
            }
            case 9: {
                return aqfx.l;
            }
            case 10: {
                return aqfx.m;
            }
            case 11: {
                return aqfx.n;
            }
            case 12: {
                return aqfx.o;
            }
            case 13: {
                return aqfx.p;
            }
            case 14: {
                return aqfx.k;
            }
            case 15: {
                return aqfx.j;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.q);
    }
}

