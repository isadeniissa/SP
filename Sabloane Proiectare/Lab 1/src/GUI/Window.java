package GUI;

import Implementers.IWindowImpl;

public class Window implements IWindowImpl{
    private String title;

    Window(String title){
        this.title = title;
    }

    public void maximize(){

    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setSize(double size) {

    }

    @Override
    public void show() {

    }

    @Override
    public double getScreenSize() {
        return 0;
    }
}
