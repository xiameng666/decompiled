import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class ghhs {
    public static final HashMap a;
    public static final HashMap b;
    public static final ghhq c;
    public static final ghhq d;
    public static final ghhq e;
    public static final ghhq f;
    public static final ghhr g;

    static {
        ghhs.a = new HashMap();
        ghhs.b = new HashMap();
        ghhs.g = new ghhr();
        ghhs.b("A", "", ghhp.a);
        ghhs.b("ABBR", "", ghhp.a);
        ghhs.b("ACRONYM", "", ghhp.a);
        ghhs.b("ADDRESS", "", ghhp.b);
        ghhs.b("APPLET", "", ghhp.a);
        ghhs.a("AREA", "E");
        ghhs.b("B", "", ghhp.a);
        ghhs.a("BASE", "E");
        ghhs.b("BASEFONT", "E", ghhp.a);
        ghhs.b("BDO", "", ghhp.a);
        ghhs.b("BIG", "", ghhp.a);
        ghhs.b("BLOCKQUOTE", "B", ghhp.b);
        ghhs.a("BODY", "O");
        ghhs.b("BR", "EB", ghhp.a);
        ghhs.b("BUTTON", "", ghhp.a);
        ghhs.e("CAPTION", "", ghhp.c);
        ghhs.b("CENTER", "B", ghhp.b);
        ghhs.b("CITE", "", ghhp.a);
        ghhs.b("CODE", "", ghhp.a);
        ghhs.e("COL", "E", ghhp.c);
        ghhs.e("COLGROUP", "O", ghhp.c);
        ghhs.a("DD", "OB");
        ghhs.a("DEL", "");
        ghhs.b("DFN", "", ghhp.a);
        ghhs.b("DIR", "B", ghhp.b);
        ghhs.b("DIV", "B", ghhp.b);
        ghhs.b("DL", "B", ghhp.b);
        ghhs.a("DT", "OB");
        ghhs.b("EM", "", ghhp.a);
        ghhs.b("FIELDSET", "", ghhp.b);
        ghhs.b("FONT", "", ghhp.a);
        ghhs.b("FORM", "B", ghhp.b);
        ghhs.a("FRAME", "E");
        ghhs.a("FRAMESET", "");
        ghhs.b("H1", "B", ghhp.b);
        ghhs.b("H2", "B", ghhp.b);
        ghhs.b("H3", "B", ghhp.b);
        ghhs.b("H4", "B", ghhp.b);
        ghhs.b("H5", "B", ghhp.b);
        ghhs.b("H6", "B", ghhp.b);
        ghhs.a("HEAD", "OB");
        ghhs.b("HR", "EB", ghhp.b);
        ghhs.a("HTML", "OB");
        ghhs.b("I", "", ghhp.a);
        ghhs.b("IFRAME", "", ghhp.a);
        ghhs.b("IMG", "E", ghhp.a);
        ghhs.b("INPUT", "E", ghhp.a);
        ghhs.a("INS", "");
        ghhs.b("ISINDEX", "EB", ghhp.b);
        ghhs.b("KBD", "", ghhp.a);
        ghhs.b("LABEL", "", ghhp.a);
        ghhs.a("LEGEND", "");
        ghhs.a("LI", "OB");
        ghhs.a("LINK", "E");
        ghhs.b("MAP", "", ghhp.a);
        ghhs.b("MENU", "B", ghhp.b);
        ghhs.a("META", "E");
        ghhs.b("NOFRAMES", "B", ghhp.b);
        ghhs.b("NOSCRIPT", "", ghhp.b);
        ghhs.b("OBJECT", "", ghhp.a);
        ghhs.b("OL", "B", ghhp.b);
        ghhs.a("OPTGROUP", "");
        ghhs.a("OPTION", "O");
        ghhs.b("P", "OB", ghhp.b);
        ghhs.a("PARAM", "E");
        ghhs.b("PRE", "B", ghhp.b);
        ghhs.b("Q", "", ghhp.a);
        ghhs.b("S", "", ghhp.a);
        ghhs.b("SAMP", "", ghhp.a);
        ghhs.c = ghhs.b("SCRIPT", "", ghhp.a);
        ghhs.b("SELECT", "", ghhp.a);
        ghhs.b("SMALL", "", ghhp.a);
        ghhs.b("SPAN", "", ghhp.a);
        ghhs.b("STRIKE", "", ghhp.a);
        ghhs.b("STRONG", "", ghhp.a);
        ghhs.d = ghhs.a("STYLE", "");
        ghhs.b("SUB", "", ghhp.a);
        ghhs.b("SUP", "", ghhp.a);
        ghhs.e("TABLE", "B", ghhp.b);
        ghhs.e("TBODY", "O", ghhp.c);
        ghhs.e("TD", "OB", ghhp.c);
        ghhs.e = ghhs.b("TEXTAREA", "", ghhp.a);
        ghhs.e("TFOOT", "O", ghhp.c);
        ghhs.e("TH", "OB", ghhp.c);
        ghhs.e("THEAD", "O", ghhp.c);
        ghhs.f = ghhs.a("TITLE", "B");
        ghhs.e("TR", "OB", ghhp.c);
        ghhs.b("TT", "", ghhp.a);
        ghhs.b("U", "", ghhp.a);
        ghhs.b("UL", "B", ghhp.b);
        ghhs.b("VAR", "", ghhp.a);
        ghhs.d("ABBR");
        ghhs.d("ACCEPT");
        ghhs.d("ACCEPT-CHARSET");
        ghhs.d("ACCESSKEY");
        ghhs.f("ACTION", 1);
        ghhs.g("ALIGN", 3, new String[]{"left", "center", "right", "justify", "char", "top", "bottom", "middle"});
        ghhs.d("ALINK");
        ghhs.d("ALT");
        ghhs.f("ARCHIVE", 1);
        ghhs.d("AXIS");
        ghhs.f("BACKGROUND", 1);
        ghhs.d("BGCOLOR");
        ghhs.d("BORDER");
        ghhs.d("CELLPADDING");
        ghhs.d("CELLSPACING");
        ghhs.d("CHAR");
        ghhs.d("CHAROFF");
        ghhs.d("CHARSET");
        ghhs.f("CHECKED", 4);
        ghhs.f("CITE", 1);
        ghhs.d("CLASS");
        ghhs.f("CLASSID", 1);
        ghhs.g("CLEAR", 3, new String[]{"left", "all", "right", "none"});
        ghhs.d("CODE");
        ghhs.f("CODEBASE", 1);
        ghhs.d("CODETYPE");
        ghhs.d("COLOR");
        ghhs.d("COLS");
        ghhs.d("COLSPAN");
        ghhs.f("COMPACT", 4);
        ghhs.d("CONTENT");
        ghhs.d("COORDS");
        ghhs.f("DATA", 1);
        ghhs.d("DATETIME");
        ghhs.f("DECLARE", 4);
        ghhs.f("DEFER", 4);
        ghhs.g("DIR", 3, new String[]{"ltr", "rtl"});
        ghhs.f("DISABLED", 4);
        ghhs.d("ENCTYPE");
        ghhs.d("FACE");
        ghhs.d("FOR");
        ghhs.d("FRAME");
        ghhs.g("FRAMEBORDER", 3, new String[]{"1", "0"});
        ghhs.d("HEADERS");
        ghhs.d("HEIGHT");
        ghhs.f("HREF", 1);
        ghhs.d("HREFLANG");
        ghhs.d("HSPACE");
        ghhs.d("HTTP-EQUIV");
        ghhs.d("ID");
        ghhs.f("ISMAP", 4);
        ghhs.d("LABEL");
        ghhs.d("LANG");
        ghhs.d("LANGUAGE");
        ghhs.d("LINK");
        ghhs.f("LONGDESC", 1);
        ghhs.d("MARGINHEIGHT");
        ghhs.d("MARGINWIDTH");
        ghhs.d("MAXLENGTH");
        ghhs.d("MEDIA");
        ghhs.g("METHOD", 3, new String[]{"get", "post"});
        ghhs.f("MULTIPLE", 4);
        ghhs.d("NAME");
        ghhs.f("NOHREF", 4);
        ghhs.f("NORESIZE", 4);
        ghhs.f("NOSHADE", 4);
        ghhs.f("NOWRAP", 4);
        ghhs.d("OBJECT");
        ghhs.f("ONBLUR", 2);
        ghhs.f("ONCHANGE", 2);
        ghhs.f("ONCLICK", 2);
        ghhs.f("ONDBLCLICK", 2);
        ghhs.f("ONFOCUS", 2);
        ghhs.f("ONKEYDOWN", 2);
        ghhs.f("ONKEYPRESS", 2);
        ghhs.f("ONKEYUP", 2);
        ghhs.f("ONLOAD", 2);
        ghhs.f("ONMOUSEDOWN", 2);
        ghhs.f("ONMOUSEMOVE", 2);
        ghhs.f("ONMOUSEOUT", 2);
        ghhs.f("ONMOUSEOVER", 2);
        ghhs.f("ONMOUSEUP", 2);
        ghhs.f("ONRESET", 2);
        ghhs.f("ONSELECT", 2);
        ghhs.f("ONSUBMIT", 2);
        ghhs.f("ONUNLOAD", 2);
        ghhs.f("PROFILE", 1);
        ghhs.d("PROMPT");
        ghhs.f("READONLY", 4);
        ghhs.d("REL");
        ghhs.d("REV");
        ghhs.d("ROWS");
        ghhs.d("ROWSPAN");
        ghhs.d("RULES");
        ghhs.d("SCHEME");
        ghhs.g("SCOPE", 3, new String[]{"row", "col", "rowgroup", "colgroup"});
        ghhs.g("SCROLLING", 3, new String[]{"yes", "no", "auto"});
        ghhs.f("SELECTED", 4);
        ghhs.d("SHAPE");
        ghhs.d("SIZE");
        ghhs.d("SPAN");
        ghhs.f("SRC", 1);
        ghhs.d("STANDBY");
        ghhs.d("START");
        ghhs.d("STYLE");
        ghhs.d("SUMMARY");
        ghhs.d("TABINDEX");
        ghhs.d("TARGET");
        ghhs.d("TEXT");
        ghhs.d("TITLE");
        ghhs.d("TYPE");
        ghhs.d("USEMAP");
        ghhs.g("VALIGN", 3, new String[]{"top", "middle", "bottom", "baseline"});
        ghhs.d("VALUE");
        ghhs.g("VALUETYPE", 3, new String[]{"data", "ref", "object"});
        ghhs.d("VERSION");
        ghhs.d("VLINK");
        ghhs.d("VSPACE");
        ghhs.d("WIDTH");
    }

    private static ghhq a(String s, String s1) {
        return ghhs.b(s, s1, ghhp.c);
    }

    private static ghhq b(String s, String s1, ghhp ghhp0) {
        return ghhs.c(s, s1, ghhp0, 0);
    }

    private static ghhq c(String s, String s1, ghhp ghhp0, int v) {
        String s2 = gfqz.c(s);
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        for(int v1 = 0; v1 < s1.length(); ++v1) {
            switch(s1.charAt(v1)) {
                case 66: {
                    z2 = true;
                    break;
                }
                case 69: {
                    z = true;
                    break;
                }
                case 0x4F: {
                    z1 = true;
                    break;
                }
                default: {
                    throw new Error("Unknown element flag");
                }
            }
        }
        ghhq ghhq0 = new ghhq(s2, v, z, z1, z2, ghhp0);
        ghhs.a.put(s2, ghhq0);
        return ghhq0;
    }

    private static void d(String s) {
        ghhs.f(s, 0);
    }

    private static void e(String s, String s1, ghhp ghhp0) {
        ghhs.c(s, s1, ghhp0, 1);
    }

    private static void f(String s, int v) {
        ghhs.g(s, v, null);
    }

    private static void g(String s, int v, String[] arr_s) {
        Set set0;
        String s1 = gfqz.c(s);
        if(arr_s == null) {
            set0 = null;
        }
        else {
            HashSet hashSet0 = new HashSet();
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                hashSet0.add(gfqz.c(arr_s[v1]));
            }
            set0 = DesugarCollections.unmodifiableSet(hashSet0);
        }
        ghhj ghhj0 = new ghhj(s1, v, set0);
        ghhs.b.put(s1, ghhj0);
    }
}

