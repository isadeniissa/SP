package Commands;

import Elements.Book;
import Elements.Paragraph;

public class NewSampleCommand implements ICommand {

    private Book book;

    public NewSampleCommand(Book book){
        this.book = book;

        execute();
    }

    @Override
    public void execute() {
        book.addElement(new Paragraph("Par 1", "Text despre 1"));
        book.addElement(new Paragraph("Par 2", "Text despre 2"));
    }
}
