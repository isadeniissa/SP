package Commands;

import Elements.Book;

public class DeleteCommand implements ICommand {

    private Book book;

    public DeleteCommand(Book book){
        this.book = book;

        execute();
    }

    @Override
    public void execute() {
        book.deleteAllElements();
    }
}
