package com.example.composite;
import java.util.ArrayList;
import java.util.List;
public class Folder implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements = new ArrayList<>();
    public Folder(String name) { this.name = name; }
    public void addElement(FileSystemElement element) { elements.add(element); }
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "+ Thư mục: " + name);
        for (FileSystemElement element : elements) {
            element.showDetails(indent + "  ");
        }
    }
}