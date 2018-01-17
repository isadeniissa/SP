package Elements;

import Commands.DeleteCommand;
import Commands.ICommand;
import Commands.NewSampleCommand;
import Visitors.DocumentStateVisitor;
import Visitors.JsonBuilder;

public class Main {

    public static void main(String args[]){

        Book mBook = new Book("100 Nights");

        // Instantiate Data
        Section section = new Section("Section 1");
        section.add(new Paragraph("Paragraph 1", "This is the FIRST paragraph"));
        section.add(new Tabel("Tabel 1"));
        section.add(new Paragraph("Paragraph 2", "This is the SECOND paragraph"));
        Paragraph paragraph = new Paragraph("Paragraph 3", "This is the THIRD paragraph");
        Image image = new Image("Image 1");
        Image image2 = new Image("Image 2");
        ImageProxy imageProxy = new ImageProxy("ImageProxy 1");

        // Introduce Data
        mBook.addElement(section);
        mBook.addElement(paragraph);
        mBook.addElement(image);
        mBook.addElement(image2);
        mBook.addElement(imageProxy);

        DocumentStateVisitor dsv = new DocumentStateVisitor();
        mBook.acceptVisitor(dsv);
        dsv.printStatistics();

        JsonBuilder builder = new JsonBuilder();
        builder.readData("test");


        System.out.println();
        System.out.println();
        System.out.println();
//        Commands
        Book testBook = new Book("Test Book");
        ICommand nscmd = new NewSampleCommand(testBook);
        testBook.print();

        DeleteCommand deleteCommand = new DeleteCommand(testBook);
        testBook.print();
    }

}
