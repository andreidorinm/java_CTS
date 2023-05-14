package prototype_curs;

public abstract class AbstractPrototype implements Cloneable{

    public AbstractPrototype() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
