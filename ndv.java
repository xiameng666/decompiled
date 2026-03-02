import j..util.Objects;
import java.util.List;

final class ndv {
    public static String a(List list0) {
        String s = null;
        boolean z = false;
        for(Object object0: list0) {
            String s1 = ((neh)object0).a.g.o;
            if(lxc.l(s1)) {
                return "video/mp4";
            }
            if(lxc.i(s1)) {
                z = true;
            }
            else {
                if(!lxc.j(s1)) {
                    continue;
                }
                if(Objects.equals(s1, "image/heic")) {
                    s = "image/heif";
                }
                else {
                    if(!Objects.equals(s1, "image/avif")) {
                        continue;
                    }
                    s = "image/avif";
                }
            }
        }
        if(z) {
            return "audio/mp4";
        }
        return s == null ? "application/mp4" : s;
    }
}

