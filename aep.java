import j..util.Objects;

public class aep {
    public final ajt a;

    public aep(ajt ajt0) {
        kay.i(ajt0);
        this.a = ajt0;
    }

    public final int d() {
        return this.a.c;
    }

    public final int e() {
        return this.a.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof aep) ? Objects.equals(this.a, ((aep)object0).a) : false;
    }

    public final String f() {
        return this.a.i;
    }

    public final String g() {
        return this.a.a;
    }

    final void h(aka aka0) {
        aka0.a("{\n");
        aka0.d();
        aka0.a("name: \"");
        aka0.a(this.g());
        aka0.a("\",\n");
        aka0.a("description: \"");
        aka0.a(this.f());
        aka0.a("\",\n");
        if((this instanceof aer)) {
            switch(((aer)this).a()) {
                case 0: {
                    aka0.a("indexingType: INDEXING_TYPE_NONE,\n");
                    break;
                }
                case 1: {
                    aka0.a("indexingType: INDEXING_TYPE_EXACT_TERMS,\n");
                    break;
                }
                case 2: {
                    aka0.a("indexingType: INDEXING_TYPE_PREFIXES,\n");
                    break;
                }
                default: {
                    aka0.a("indexingType: INDEXING_TYPE_UNKNOWN,\n");
                }
            }
            switch(((aer)this).c()) {
                case 0: {
                    aka0.a("tokenizerType: TOKENIZER_TYPE_NONE,\n");
                    break;
                }
                case 1: {
                    aka0.a("tokenizerType: TOKENIZER_TYPE_PLAIN,\n");
                    break;
                }
                case 2: {
                    aka0.a("tokenizerType: TOKENIZER_TYPE_VERBATIM,\n");
                    break;
                }
                case 3: {
                    aka0.a("tokenizerType: TOKENIZER_TYPE_RFC822,\n");
                    break;
                }
                default: {
                    aka0.a("tokenizerType: TOKENIZER_TYPE_UNKNOWN,\n");
                }
            }
            switch(((aer)this).b()) {
                case 0: {
                    aka0.a("joinableValueType: JOINABLE_VALUE_TYPE_NONE,\n");
                    break;
                }
                case 1: {
                    aka0.a("joinableValueType: JOINABLE_VALUE_TYPE_QUALIFIED_ID,\n");
                    break;
                }
                default: {
                    aka0.a("joinableValueType: JOINABLE_VALUE_TYPE_UNKNOWN,\n");
                }
            }
            aka0.a("deletePropagationType: DELETE_PROPAGATION_TYPE_NONE,\n");
        }
        else if((this instanceof aej)) {
            aka0.a("shouldIndexNestedProperties: ");
            aka0.b(Boolean.valueOf(((aej)this).c()));
            aka0.a(",\n");
            aka0.a("indexableNestedProperties: ");
            aka0.b(((aej)this).b());
            aka0.a(",\n");
            aka0.a("schemaType: \"");
            aka0.a(((aej)this).a());
            aka0.a("\",\n");
        }
        else if((this instanceof aeo)) {
            switch(((aeo)this).a()) {
                case 0: {
                    aka0.a("indexingType: INDEXING_TYPE_NONE,\n");
                    break;
                }
                case 1: {
                    aka0.a("indexingType: INDEXING_TYPE_RANGE,\n");
                    break;
                }
                default: {
                    aka0.a("indexingType: INDEXING_TYPE_UNKNOWN,\n");
                }
            }
        }
        switch(this.d()) {
            case 1: {
                aka0.a("cardinality: CARDINALITY_REPEATED,\n");
                break;
            }
            case 2: {
                aka0.a("cardinality: CARDINALITY_OPTIONAL,\n");
                break;
            }
            case 3: {
                aka0.a("cardinality: CARDINALITY_REQUIRED,\n");
                break;
            }
            default: {
                aka0.a("cardinality: CARDINALITY_UNKNOWN,\n");
            }
        }
        switch(this.e()) {
            case 1: {
                aka0.a("dataType: DATA_TYPE_STRING,\n");
                break;
            }
            case 2: {
                aka0.a("dataType: DATA_TYPE_LONG,\n");
                break;
            }
            case 3: {
                aka0.a("dataType: DATA_TYPE_DOUBLE,\n");
                break;
            }
            case 4: {
                aka0.a("dataType: DATA_TYPE_BOOLEAN,\n");
                break;
            }
            case 5: {
                aka0.a("dataType: DATA_TYPE_BYTES,\n");
                break;
            }
            case 6: {
                aka0.a("dataType: DATA_TYPE_DOCUMENT,\n");
                break;
            }
            default: {
                aka0.a("dataType: DATA_TYPE_EMBEDDING,\n");
            }
        }
        aka0.c();
        aka0.a("}");
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        aka aka0 = new aka();
        this.h(aka0);
        return aka0.toString();
    }
}

