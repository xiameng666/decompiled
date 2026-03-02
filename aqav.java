import java.util.Set;

public final class aqav {
    public static final int a;
    private static final ggeo b;
    private static final ggeo c;
    private static final ggeo d;
    private static final ggeo e;
    private static final ggeo f;

    static {
        Integer integer0 = (int)1;
        Integer integer1 = (int)2;
        Integer integer2 = (int)3;
        Integer integer3 = (int)4;
        aqav.b = ggeo.o(integer0, "Text", integer1, "Number", integer2, "Phone", integer3, "DateTime");
        Integer integer4 = (int)0x20000;
        Integer integer5 = (int)0x40000;
        Integer integer6 = (int)16;
        ggoh ggoh0 = new ggoh(integer6);
        aqav.c = ggeo.o(integer0, ggfp.O(Integer.valueOf(0x20), Integer.valueOf(0x30), Integer.valueOf(0xB0), integer4, integer5, Integer.valueOf(0x70), new Integer[]{((int)80), ((int)0x80), ((int)0x60), ((int)0x40), integer6, ((int)0x90), ((int)0xD0), ((int)0xE0)}), integer1, ggoh0, integer2, ggnj.a, integer3, ggnj.a);
        Integer integer7 = (int)0x1000;
        Integer integer8 = (int)0x2000;
        ggfp ggfp0 = ggfp.K(integer8, integer7);
        aqav.d = ggeo.o(integer0, ggfp.O(Integer.valueOf(0x10000), Integer.valueOf(0x8000), integer7, Integer.valueOf(0x4000), integer8, Integer.valueOf(0x80000), new Integer[]{integer4, integer5}), integer1, ggfp0, integer2, ggnj.a, integer3, ggnj.a);
        ggek ggek0 = new ggek();
        ggek0.i(Integer.valueOf(49), "EmailSubject");
        ggek0.i(Integer.valueOf(0xB1), "Filter");
        ggek0.i(Integer.valueOf(0x71), "PostalAddress");
        ggek0.i(Integer.valueOf(81), "LongMessage");
        ggek0.i(Integer.valueOf(0x81), "Password");
        ggek0.i(Integer.valueOf(97), "PersonName");
        ggek0.i(Integer.valueOf(65), "ShortMessage");
        ggek0.i(Integer.valueOf(17), "URI");
        ggek0.i(Integer.valueOf(0x91), "VisiblePassword");
        ggek0.i(Integer.valueOf(209), "WebEmailAddress");
        ggek0.i(Integer.valueOf(0xE1), "WebPassword");
        ggek0.i(Integer.valueOf(18), "Password");
        aqav.e = ggek0.b();
        ggek ggek1 = new ggek();
        ggek1.i(Integer.valueOf(0x2002), "NumberDecimal");
        ggek1.i(Integer.valueOf(0x1002), "NumberSigned");
        ggek1.i(Integer.valueOf(0x10001), "AutoComplete");
        ggek1.i(Integer.valueOf(0x8001), "AutoCorrect");
        ggek1.i(Integer.valueOf(0x1001), "CapCharacters");
        ggek1.i(Integer.valueOf(0x4001), "CapSentences");
        ggek1.i(Integer.valueOf(0x2001), "CapWords");
        ggek1.i(Integer.valueOf(0x80001), "NoSuggestions");
        ggek1.i(Integer.valueOf(0x20001), "MultiLine");
        ggek1.i(Integer.valueOf(0x40001), "IMEMultiLine");
        aqav.f = ggek1.b();
    }

    public static void a(ancu ancu0, StringBuilder stringBuilder0, int v, boolean z) {
        String s2;
        String s;
        StringBuilder stringBuilder1 = new StringBuilder();
        for(int v2 = 0; v2 < v; ++v2) {
            stringBuilder1.append(' ');
        }
        boolean z1 = z && ancu0.j == 0;
        if(!z1) {
            stringBuilder1.append("\u001B[9m");
        }
        if(ancu0.s) {
            stringBuilder1.append("** Node **");
        }
        else {
            stringBuilder1.append("Node");
        }
        if(!z1) {
            stringBuilder1.append("\u001B[0m");
        }
        stringBuilder1.append(" autofill_id=");
        stringBuilder1.append(ancu0.h);
        stringBuilder1.append(" autofill_type=");
        int v3 = ancu0.f;
        switch(v3) {
            case 0: {
                s = "none";
                break;
            }
            case 1: {
                s = "text";
                break;
            }
            case 2: {
                s = "toggle";
                break;
            }
            case 3: {
                s = "list";
                break;
            }
            case 4: {
                s = "date";
                break;
            }
            default: {
                s = "unknown";
            }
        }
        stringBuilder1.append(s);
        String s1 = ancu0.b;
        if(!"".equals(s1)) {
            stringBuilder1.append(" id_entry=");
            stringBuilder1.append(s1);
        }
        ggfp ggfp0 = ancu0.i;
        if(!ggfp0.isEmpty()) {
            stringBuilder1.append(" autofill_hints=");
            stringBuilder1.append(ggfp0);
        }
        gfsx gfsx0 = ancu0.z;
        if(gfsx0.i()) {
            stringBuilder1.append(" important_for_autofill=");
            int v4 = (int)(((Integer)gfsx0.d()));
            switch(v4) {
                case 0: {
                    s2 = "auto";
                    break;
                }
                case 1: {
                    s2 = "yes";
                    break;
                }
                case 2: {
                    s2 = "no";
                    break;
                }
                case 4: {
                    s2 = "yes (excl. descendants)";
                    break;
                }
                default: {
                    s2 = v4 == 8 ? "no (excl. descendants)" : "unsupported!";
                }
            }
            stringBuilder1.append(s2);
        }
        anct anct0 = ancu0.v;
        if(anct0 != null && !anct0.b.isEmpty()) {
            stringBuilder1.append(" html_info=");
            stringBuilder1.append(anct0);
        }
        String s3 = ancu0.d;
        if(!"".equals(s3)) {
            stringBuilder1.append(" hint=");
            stringBuilder1.append(s3);
        }
        if(v3 == 1) {
            stringBuilder1.append(" maxTextLength=");
            stringBuilder1.append(ancu0.q);
            goto label_72;
        }
        else if(v3 == 1) {
        label_72:
            String s4 = ancu0.r;
            if(!"".equals(s4)) {
                stringBuilder1.append(" contentDescription=");
                stringBuilder1.append(s4);
            }
        }
        String s5 = ancu0.e;
        if(!"".equals(s5)) {
            stringBuilder1.append(" text=");
            stringBuilder1.append(s5);
        }
        int v5 = ancu0.c;
        if((v5 & 15) != 0) {
            stringBuilder1.append(" inputType=");
            Integer integer0 = (int)(v5 & 15);
            stringBuilder1.append(((String)aqav.b.get(integer0)));
            Set set0 = (Set)aqav.c.get(integer0);
            if(set0 != null) {
                for(Object object0: set0) {
                    int v6 = (int)(((Integer)object0));
                    if((v5 & 0xFF0 & v6) == v6) {
                        String s6 = (String)aqav.e.get(Integer.valueOf(v6 | v5 & 15));
                        if(s6 != null) {
                            stringBuilder1.append('|');
                            stringBuilder1.append(s6);
                        }
                    }
                }
            }
            Set set1 = (Set)aqav.d.get(Integer.valueOf(v5 & 15));
            if(set1 != null) {
                for(Object object1: set1) {
                    int v7 = (int)(((Integer)object1));
                    if((v5 & 0xFFF000 & v7) == v7) {
                        String s7 = (String)aqav.f.get(Integer.valueOf(v7 | v5 & 15));
                        if(s7 != null) {
                            stringBuilder1.append('|');
                            stringBuilder1.append(s7);
                        }
                    }
                }
                stringBuilder1.append(' ');
            }
        }
        stringBuilder1.append('\n');
        stringBuilder0.append(stringBuilder1);
        gged_interceptors gged0 = ancu0.y;
        int v8 = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v8; ++v1) {
            aqav.a(((ancu)gged0.get(v1)), stringBuilder0, v + 2, z1);
        }
    }
}

