import android.content.Context;

public final class atni {
    public static final aqql a;
    public final Context b;
    public final aqjk c;
    public final aqqk d;
    public final bakc e;
    public final aqyx f;
    public final aqjl g;
    public final gful_cronetEngineProvider h;
    public final gful_cronetEngineProvider i;
    public final aqso j;

    static {
        atni.a = new aqql(new String[]{"DeviceStateSnapshotLogger"});
    }

    public atni(Context context0) {
        this.g = aqjl.a;
        this.h = gfus.a(((gful_cronetEngineProvider)new atnd()));
        this.i = gfus.a(((gful_cronetEngineProvider)new atne()));
        this.b = context0;
        this.j = aqso.a(context0);
        this.d = new aqqk(context0);
        this.c = new aqjk(context0);
        this.e = new bakc(context0, "BackupDeviceState", true);
        this.f = aqyx.b(context0);
    }

    public static gicj a(String s) {
        if(s == null) {
            return gicj.a;
        }
        switch(s.hashCode()) {
            case 0x8FF5A86E: {
                return s.equals("com.android.localtransport/.LocalTransportService") ? gicj.c : gicj.b;
            }
            case -1249308490: {
                return s.equals("com.google.android.backup/.BackupTransportService") ? gicj.f : gicj.b;
            }
            case 0xD368B990: {
                return s.equals("android/com.android.internal.backup.LocalTransportService") ? gicj.c : gicj.b;
            }
            case 0xEFE83965: {
                return s.equals("android/com.android.internal.backup.LocalTransport") ? gicj.c : gicj.b;
            }
            case 0xF55D2847: {
                return s.equals("com.android.localtransport/.LocalTransport") ? gicj.c : gicj.b;
            }
            case 1204141506: {
                return s.equals("com.google.android.backuptransport/com.google.android.backup.BackupTransportService") ? gicj.f : gicj.b;
            }
            case 1320513942: {
                return s.equals("com.google.android.gms/.backup.migrate.service.D2dTransport") ? gicj.e : gicj.b;
            }
            case 1503304469: {
                return s.equals("com.google.android.gms/.backup.BackupTransportService") ? gicj.d : gicj.b;
            }
            default: {
                return gicj.b;
            }
        }
    }

    public static final int b(fpwm fpwm0) {
        int v = fpwm0.c().ordinal();
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 3;
                }
                case 2: {
                    return 6;
                }
                default: {
                    if(v != 3) {
                        switch(v) {
                            case 4: {
                                return 5;
                            }
                            case 5: {
                                return 7;
                            }
                            default: {
                                throw new RuntimeException(null, null);
                            }
                        }
                    }
                    return 4;
                }
            }
        }
        return 2;
    }
}

