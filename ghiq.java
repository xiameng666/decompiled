public final class ghiq {
    private static final ggfp a;
    private static final ggfp b;
    private static final ggfp c;

    static {
        ghiq.a = ggfp.M("http", "https", "mailto", "ftp");
        ghiq.b = ggfp.O("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", new String[]{"audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf"});
        ghiq.c = ggnj.a;
    }

    public static ghio a(ghip ghip0) {
        return new ghio(ghip0.c);
    }

    public static ghio b(String s) {
        ghio ghio0 = ghio.a;
        ggfp ggfp0 = ghiq.c;
        String s1 = gfqz.c(s);
        ggqj ggqj0 = ghiq.a.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            if(s1.startsWith(((String)object0) + ":")) {
                return new ghio(s);
            }
        }
        if(s1.startsWith("data:")) {
            String s2 = gfqz.c(s);
            if(s2.startsWith("data:") && s2.length() > 5) {
                int v;
                for(v = 5; v < s2.length() && (s2.charAt(v) != 44 && s2.charAt(v) != 59); ++v) {
                }
                if(ghiq.b.contains(s2.substring(5, v)) && s2.startsWith(";base64,", v)) {
                    int v1 = v + 8;
                    if(v1 < s2.length()) {
                        while(v1 < s2.length()) {
                            int v2 = s2.charAt(v1);
                            if(v2 == 61) {
                                break;
                            }
                            if((v2 < 97 || v2 > 0x7A) && (v2 < 0x30 || v2 > 57) && (v2 != 43 && v2 != 0x2F)) {
                                return ghio0;
                            }
                            ++v1;
                        }
                        while(v1 < s2.length()) {
                            if(s2.charAt(v1) != 61) {
                                return ghio0;
                            }
                            ++v1;
                        }
                        return new ghio(s);
                    }
                }
            }
        }
        else {
            ggqj ggqj1 = ((ggnj)ggfp0).om();
            while(ggqj1.hasNext()) {
                Object object1 = ggqj1.next();
                if(s1.startsWith(gfqz.c(((ghij)object1).name()).replace('_', '-') + ":")) {
                    return new ghio(s);
                }
            }
            int v3 = 0;
        alab1:
            while(true) {
                if(v3 >= s.length()) {
                    return new ghio(s);
                }
                int v4 = s.charAt(v3);
                if(v4 == 35 || v4 == 0x2F) {
                    return new ghio(s);
                }
                switch(v4) {
                    case 58: {
                        break alab1;
                    }
                    case 0x3F: {
                        return new ghio(s);
                    }
                    default: {
                        ++v3;
                    }
                }
            }
        }
        return ghio0;
    }
}

