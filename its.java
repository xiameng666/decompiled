public final class its {
    public final int a;

    public its(int v) {
        this.a = v;
    }

    public static final boolean a(int v, int v1) {
        return v == v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof its) && this.a == ((its)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        int v = this.a;
        if(v == 0) {
            return "Button";
        }
        switch(v) {
            case 1: {
                return "Checkbox";
            }
            case 2: {
                return "Switch";
            }
            case 3: {
                return "RadioButton";
            }
            case 4: {
                return "Tab";
            }
            case 5: {
                return "Image";
            }
            case 6: {
                return "DropdownList";
            }
            case 7: {
                return "Picker";
            }
            case 8: {
                return "Carousel";
            }
            default: {
                return "Unknown";
            }
        }
    }
}

