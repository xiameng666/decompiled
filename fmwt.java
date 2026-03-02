import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

public final class fmwt {
    public boolean a;
    public boolean b;
    public boolean c;
    private final fmre d;
    private final Map e;
    private final SparseArray f;

    public fmwt(fmre fmre0) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = fmre0;
        this.e = new HashMap();
        this.f = new SparseArray();
    }

    protected final int a(fmga fmga0) {
        if(iaea.i()) {
            fmfr fmfr0 = fmga0.f;
            int v = fmfr0.a() - 1;
            if(v != 1) {
                switch(v) {
                    case 2: {
                        switch(fmfr0.b().a) {
                            case "link_preview": {
                                return 6;
                            }
                            case "photos": {
                                return 5;
                            }
                            default: {
                                throw new IllegalArgumentException("Unsupported custom type: " + fmfr0.b().a);
                            }
                        }
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unexpected messageContent type: " + fmfn.a(fmfr0.a()));
                    }
                }
            }
            return 4;
        }
        fmfr fmfr1 = fmga0.f;
        if(fmfr1.a() == 3) {
            String s = fmfr1.b().a;
            return this.e.containsKey(s) ? ((int)(((Integer)this.e.get(s)))) : fmfr1.a() - 1;
        }
        return fmfr1.a() - 1;
    }

    protected final fmws b(ViewGroup viewGroup0, int v) {
        String s;
        if(iaea.i()) {
            int v1 = fmrk.a(v);
            if(v1 == 0) {
                throw null;
            }
            switch(v1 - 1) {
                case 4: {
                    break;
                }
                case 5: 
                case 6: {
                    SparseArray sparseArray0 = this.f;
                    if(sparseArray0.get(v1 - 1) != null) {
                        return ((fmxc)sparseArray0.get(v1 - 1)).a();
                    }
                    break;
                }
                default: {
                    switch(v1) {
                        case 1: {
                            s = "SUGGESTION_LIST_CELL";
                            break;
                        }
                        case 2: {
                            s = "RICH_CARD_BUBBLE_CELL";
                            break;
                        }
                        case 3: {
                            s = "TOMBSTONE_BUBBLE_CELL";
                            break;
                        }
                        case 4: {
                            s = "TYPING_INDICATOR_CELL";
                            break;
                        }
                        case 5: {
                            s = "TEXT_MESSAGE_CONTENT";
                            break;
                        }
                        case 6: {
                            s = "PHOTO_MESSAGE_CONTENT";
                            break;
                        }
                        case 7: {
                            s = "LINK_PREVIEW_MESSAGE_CONTENT";
                            break;
                        }
                        case 8: {
                            s = "SUGGESTION_CHIP_VIEW";
                            break;
                        }
                        case 9: {
                            s = "STACK_CARD_VIEW";
                            break;
                        }
                        case 10: {
                            s = "RICH_CARD_BUTTONS_UI_ELEMENT";
                            break;
                        }
                        case 11: {
                            s = "RICH_TEXT_UI_ELEMENT";
                            break;
                        }
                        case 12: {
                            s = "HORIZONTAL_LAYOUT_BUTTONS_UI_ELEMENT";
                            break;
                        }
                        case 13: {
                            s = "IMAGE_ELEMENT_UI_ELEMENT";
                            break;
                        }
                        case 14: {
                            s = "HORIZONTAL_LINE_UI_ELEMENT";
                            break;
                        }
                        case 15: {
                            s = "STATUS_BADGE_UI_ELEMENT";
                            break;
                        }
                        case 16: {
                            s = "VERTICAL_LAYOUT_BUTTON_VIEW";
                            break;
                        }
                        default: {
                            s = "RICH_CARD_BUTTON_VIEW";
                        }
                    }
                    throw new IllegalArgumentException("Unsupported view holder type: " + s);
                }
            }
            fmwi fmwi0 = new fmwi(viewGroup0.getContext());
            fmwi0.r = this.d;
            fmwi0.a = this.a;
            fmwi0.b = this.b;
            fmwi0.c = this.c;
            return new fmws(fmwi0);
        }
        SparseArray sparseArray1 = this.f;
        if(sparseArray1.get(v) != null) {
            return ((fmxc)sparseArray1.get(v)).a();
        }
        fmwi fmwi1 = new fmwi(viewGroup0.getContext());
        fmwi1.r = this.d;
        fmwi1.a = this.a;
        fmwi1.b = this.b;
        fmwi1.c = this.c;
        return new fmws(fmwi1);
    }
}

