package Elements;

import Algorithms.AlignCenter;
import Algorithms.AlignLeft;
import Algorithms.AlignRight;
import Visitors.Visitor;

import java.util.ArrayList;

public class Book implements Element{

    private String title;
    private ArrayList<Element> elements = new ArrayList<>();
    private AlignLeft alignLeft;
    private AlignCenter alignCenter;
    private AlignRight alignRight;

    public Book(String title){
        this.title = title;
    }

    public void acceptVisitor(Visitor v){
        for(Element e : elements){
            e.acceptVisitor(v);
        }
    }

    public void addElement(Element e){
        elements.add(e);
    }

    public void print(){

        if(elements.isEmpty()){
            System.out.println("Title of the book : " + title);
            System.out.println("No elements in book");
            return;
        }

        System.out.println("Title of the book: " + title);
        for(Element element : elements){
            element.print();
        }
    }

    public void deleteAllElements(){
        elements.clear();
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
}
