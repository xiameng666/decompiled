import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class ighz {
    private final HashMap a;
    private final HashMap b;

    public ighz() {
        this.a = new HashMap(7);
        this.b = new HashMap(7);
    }

    public final String[] a(Locale locale0, String s, String s1) {
        String[] arr_s1;
        String[] arr_s = null;
        synchronized(this) {
            if(locale0 != null) {
                HashMap hashMap0 = this.a;
                Map map0 = (Map)hashMap0.get(locale0);
                if(map0 == null) {
                    map0 = new HashMap(7);
                    hashMap0.put(locale0, map0);
                }
                Map map1 = (Map)map0.get(s);
                if(map1 == null) {
                    map1 = new HashMap(7);
                    map0.put(s, map1);
                    String[][] arr2_s = igct.c(Locale.ENGLISH).getZoneStrings();
                    for(int v1 = 0; true; ++v1) {
                        arr_s1 = null;
                        if(v1 >= arr2_s.length) {
                            break;
                        }
                        String[] arr_s2 = arr2_s[v1];
                        if(arr_s2 != null && arr_s2.length >= 5 && s.equals(arr_s2[0])) {
                            arr_s1 = arr_s2;
                            break;
                        }
                    }
                    String[][] arr2_s1 = igct.c(locale0).getZoneStrings();
                    for(int v2 = 0; v2 < arr2_s1.length; ++v2) {
                        String[] arr_s3 = arr2_s1[v2];
                        if(arr_s3 != null && arr_s3.length >= 5 && s.equals(arr_s3[0])) {
                            arr_s = arr_s3;
                            break;
                        }
                    }
                    if(arr_s1 != null && arr_s != null) {
                        map1.put(arr_s1[2], new String[]{arr_s[2], arr_s[1]});
                        if(arr_s1[2].equals(arr_s1[4])) {
                            map1.put(arr_s1[4] + "-Summer", new String[]{arr_s[4], arr_s[3]});
                        }
                        else {
                            map1.put(arr_s1[4], new String[]{arr_s[4], arr_s[3]});
                        }
                    }
                }
                return (String[])map1.get(s1);
            }
        }
        return null;
    }

    public final String[] b(Locale locale0, String s, boolean z) {
        String[] arr_s = null;
        synchronized(this) {
            if(locale0 != null) {
                if(s.startsWith("Etc/")) {
                    s = s.substring(4);
                }
                HashMap hashMap0 = this.b;
                Map map0 = (Map)hashMap0.get(locale0);
                if(map0 == null) {
                    map0 = new HashMap(7);
                    hashMap0.put(locale0, map0);
                }
                Map map1 = (Map)map0.get(s);
                if(map1 == null) {
                    map1 = new HashMap(7);
                    map0.put(s, map1);
                    String[][] arr2_s = igct.c(Locale.ENGLISH).getZoneStrings();
                    for(int v1 = 0; true; ++v1) {
                        String[] arr_s1 = null;
                        if(v1 >= arr2_s.length) {
                            break;
                        }
                        String[] arr_s2 = arr2_s[v1];
                        if(arr_s2 != null && arr_s2.length >= 5 && s.equals(arr_s2[0])) {
                            arr_s1 = arr_s2;
                            break;
                        }
                    }
                    String[][] arr2_s1 = igct.c(locale0).getZoneStrings();
                    for(int v2 = 0; v2 < arr2_s1.length; ++v2) {
                        String[] arr_s3 = arr2_s1[v2];
                        if(arr_s3 != null && arr_s3.length >= 5 && s.equals(arr_s3[0])) {
                            arr_s = arr_s3;
                            break;
                        }
                    }
                    if(arr_s1 != null && arr_s != null) {
                        map1.put(Boolean.TRUE, new String[]{arr_s[2], arr_s[1]});
                        map1.put(Boolean.FALSE, new String[]{arr_s[4], arr_s[3]});
                    }
                }
                return (String[])map1.get(Boolean.valueOf(z));
            }
        }
        return null;
    }
}

