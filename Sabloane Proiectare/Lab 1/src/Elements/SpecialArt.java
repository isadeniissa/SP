package Elements;

import Visitors.Visitor;

public class SpecialArt implements Element {
    @Override
    public void acceptVisitor(Visitor v) {
        v.visitSpecialArt(this);
    }

    @Override
    public void add(Element e) throws Exception {

    }

    @Override
    public void remove(Element e) throws Exception {

    }

    @Override
    public Element getElement(int index) throws Exception {
        return null;
    }

    @Override
    public void print() {

    }
}
