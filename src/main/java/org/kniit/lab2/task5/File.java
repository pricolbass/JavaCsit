package org.kniit.lab2.task5;

public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Файл не может содержать другие элементы");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Файл не может содержать другие элементы");
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (" + size + " bytes)");
    }
}