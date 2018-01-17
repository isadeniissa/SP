package Visitors;

import Elements.*;

public class CostVisitor implements Visitor{

    //Prices
    private final int paragraphCost = 10;
    private final int imageCost = 5;
    private final int tableCost = 15;
    private final int sectionCost = 1;

    private int totalCost;

    public void printBookCost(){
        System.out.println("The book costs: " + totalCost + " $");
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        totalCost += imageCost;
    }

    @Override
    public void visitImage(Image image) {
        totalCost += imageCost;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        totalCost += paragraphCost;
    }

    @Override
    public void visitTable(Tabel table) {
        totalCost += tableCost;
    }

    @Override
    public void visitSection(Section section) {
        totalCost += sectionCost;
    }

    @Override
    public void visitSpecialArt(SpecialArt specialArt) {

    }
}
