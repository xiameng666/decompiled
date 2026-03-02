import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;

public final class atnk {
    public static final aqql a;
    public static long b;

    static {
        atnk.a = new aqql(new String[]{"LocalBackupStats"});
        atnk.b = 0L;
    }

    public static ApplicationBackupStats a(String s, String s1, BackupStatsRequestConfig backupStatsRequestConfig0) {
        String[] arr_s = s1.split(",");
        int v = 0;
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        for(int v4 = 0; v4 < arr_s.length; ++v4) {
            String s2 = arr_s[v4];
            String[] arr_s1 = s2.split(":", 2);
            if(arr_s1.length != 2) {
                atnk.a.m("Can not parse local backup stats : " + s2, new Object[0]);
                return null;
            }
            try {
                switch(arr_s1[0]) {
                    case "[DRIVE_SIZE]": {
                        if(backupStatsRequestConfig0.a) {
                            v1 = Integer.parseInt(arr_s1[1]);
                        }
                        break;
                    }
                    case "[G1_SIZE]": {
                        if(backupStatsRequestConfig0.a) {
                            v3 = (long)Integer.parseInt(arr_s1[1]);
                        }
                        break;
                    }
                    case "[KV_SIZE]": {
                        if(backupStatsRequestConfig0.a) {
                            v = Integer.parseInt(arr_s1[1]);
                        }
                        break;
                    }
                    case "[TIMESTAMP]": {
                        if(backupStatsRequestConfig0.b) {
                            v2 = Long.parseLong(arr_s1[1]);
                        }
                        break;
                    }
                    default: {
                        atnk.a.m("Unrecognized local backup stats attributes", new Object[0]);
                    }
                }
            }
            catch(NumberFormatException unused_ex) {
                atnk.a.m("Can not parse local backup stats : " + s2, new Object[0]);
                return null;
            }
        }
        return new ApplicationBackupStats(s, v, v1, v2, v3);
    }

    public static String b(ApplicationBackupStats applicationBackupStats0) {
        return new gfss(",").b(bbnh.a(new String[]{"[TIMESTAMP]:" + applicationBackupStats0.d, "[KV_SIZE]:" + applicationBackupStats0.b, "[DRIVE_SIZE]:" + applicationBackupStats0.c, "[G1_SIZE]:" + applicationBackupStats0.e}));
    }
}

